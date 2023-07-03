package com.weltcorp.dta.wed.lib.diary.datasource

import com.weltcorp.dta.wed.lib.diary.DiaryApiConfig
import com.weltcorp.dta.wed.lib.diary.domain.model.*
import dta.wed.api.v2.diaries.*
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import io.grpc.Metadata

class DiaryRemoteDataSourceGrpcImpl(
    val config: DiaryApiConfig
) : RemoteDataSource {


    private var _channel = getMangedChannel()


    var _stub = DiariesDataGrpcKt.DiariesDataCoroutineStub(getChannel())
    private fun getChannel(): ManagedChannel {
        if (_channel.isShutdown || _channel.isTerminated) {
            _channel = getMangedChannel()
        }
        return _channel
    }

    private fun getMangedChannel(): ManagedChannel {
        val channel = ManagedChannelBuilder
            .forTarget("${config.host}${if (config.port != null) ":${config.port}" else ""}")
        if (config.port != null) {
            channel.usePlaintext()
        }
        return channel.build()
    }
    fun stub(): DiariesDataGrpcKt.DiariesDataCoroutineStub {
        if (_stub == null) {
            _stub = DiariesDataGrpcKt.DiariesDataCoroutineStub(getChannel())
        }
        return _stub
    }


    override suspend fun createDiary(data: DiaryData) {

        if (data.date == null) {
            throw IllegalArgumentException("DiaryMeta.date is null")
        }
        if (data.type == null) {
            throw IllegalArgumentException("DiaryData.type is null")
        }

        val diaryData = diaryData {

            this.type = data.type.ordinal

            data.time?.let { this.time = it }

            data.whoList?.let {
                val list = it.map { who -> who.ordinal }
                this.who.addAll(list)
            }

            data.where?.let { this.where = it.ordinal }

            data.food?.let {
                this.food = diaryFood {
                    it.text?.let { this.text = it }
                    it.uris?.let { this.uris.addAll(it) }
                }
            }

            data.beforeHungryScore?.let { this.beforeHungryScore = it }

            data.afterHungryScore?.let { this.afterHungryScore = it }

            data.feeling?.let { it ->
                this.feeling = diaryFeeling {
                    this.score = it.score
                    it.event?.let {diaryFeelingEvent ->
                        this.event = diaryFeelingEvent {
                            this.id = diaryFeelingEvent.event.ordinal
                            diaryFeelingEvent.text?.let { this.text = it }
                        }
                    }
                }
            }

            data.significants?.let {
                val list = it.map { significant -> significant.ordinal }
                this.significants.addAll(list)
            }

            this.isSkip = data.isSkip
        }

        if (config.userId == 0) {
            throw IllegalArgumentException("userId is not set")
        }

        val request = createDiaryRequest {
            this.userId = config.userId.toLong()
            this.date = data.date
            this.data = diaryData
        }
        val header = Metadata()
        header.put(Metadata.Key.of("x-request-dtx-user-id", Metadata.ASCII_STRING_MARSHALLER), "${config.userId}}")
        header.put(Metadata.Key.of("x-request-dtx-src-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wed-lib-kotlin")
        header.put(Metadata.Key.of("x-request-dtx-dst-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wed-api")
        header.put(Metadata.Key.of("x-request-dtx-protocol", Metadata.ASCII_STRING_MARSHALLER), "GRPC")
        header.put(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER), "Bearer " + config.auth)
        stub().createDiary(request, header)
    }

    override suspend fun updateDiary(data: DiaryData) {

        var diaryId = 0
        if (data.id == null) {
            throw IllegalArgumentException("DiaryMeta.id is null")
        } else {
            diaryId = data.id!!
            data.id = null
        }
        if (data.type != null) {
            throw IllegalArgumentException("DiaryData.type is immutable")
        }
        if (data.date != null) {
            throw IllegalArgumentException("DiaryData.date is immutable")
        }

        val diaryData = diaryData {

            data.time?.let { this.time = it }

            data.whoList?.let {
                val list = it.map { who -> who.ordinal }
                this.who.addAll(list)
            }

            data.where?.let { this.where = it.ordinal }

            data.food?.let {
                this.food = diaryFood {
                    it.text?.let { this.text = it }
                    it.uris?.let { this.uris.addAll(it) }
                }
            }

            data.beforeHungryScore?.let { this.beforeHungryScore = it }

            data.afterHungryScore?.let { this.afterHungryScore = it }

            data.feeling?.let { it ->
                this.feeling = diaryFeeling {
                    this.score = it.score
                    it.event?.let {diaryFeelingEvent ->
                        this.event = diaryFeelingEvent {
                            this.id = diaryFeelingEvent.event.ordinal
                            diaryFeelingEvent.text?.let { this.text = it }
                        }
                    }
                }
            }

            data.significants?.let {
                val list = it.map { significant -> significant.ordinal }
                this.significants.addAll(list)
            }

            this.isSkip = data.isSkip
        }

        val request = updateDiaryRequest {
            this.id = diaryId
            this.data = diaryData
        }
        val header = Metadata()
        header.put(Metadata.Key.of("x-request-dtx-user-id", Metadata.ASCII_STRING_MARSHALLER), "${config.userId}}")
        header.put(Metadata.Key.of("x-request-dtx-src-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wed-lib-kotlin")
        header.put(Metadata.Key.of("x-request-dtx-dst-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wed-api")
        header.put(Metadata.Key.of("x-request-dtx-protocol", Metadata.ASCII_STRING_MARSHALLER), "GRPC")
        header.put(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER), "Bearer " + config.auth)
        stub().updateDiary(request, header)
    }

    override suspend fun deleteDiary(id: Int) {

        val request = deleteDiaryRequest {
            this.id = id
        }
        val header = Metadata()
        header.put(Metadata.Key.of("x-request-dtx-user-id", Metadata.ASCII_STRING_MARSHALLER), "${config.userId}}")
        header.put(Metadata.Key.of("x-request-dtx-src-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wed-lib-kotlin")
        header.put(Metadata.Key.of("x-request-dtx-dst-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wed-api")
        header.put(Metadata.Key.of("x-request-dtx-protocol", Metadata.ASCII_STRING_MARSHALLER), "GRPC")
        header.put(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER), "Bearer " + config.auth)
        stub().deleteDiary(request, header)
    }

    override suspend fun getDiaries(startDate: Int, endDate: Int): List<Diary> {

        val header = Metadata()
        header.put(Metadata.Key.of("x-request-dtx-user-id", Metadata.ASCII_STRING_MARSHALLER), "${config.userId}}")
        header.put(Metadata.Key.of("x-request-dtx-src-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wed-lib-kotlin")
        header.put(Metadata.Key.of("x-request-dtx-dst-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wed-api")
        header.put(Metadata.Key.of("x-request-dtx-protocol", Metadata.ASCII_STRING_MARSHALLER), "GRPC")
        header.put(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER), "Bearer " + config.auth)

        val request = getDiariesRequest{
            this.userId = config.userId.toLong()
            this.startDate = startDate
            this.endDate = endDate
        }
        val resp = stub().getDiaries(request, header)

        val diaries = arrayListOf<Diary>()

        resp.diariesPerDaysList.forEach { diaryPerDay ->
            println("diaryPerDay: $diaryPerDay")
            println(diaryPerDay.dateString)
            println(diaryPerDay.dateUnix)
            val date = diaryPerDay.dateUnix
            diaryPerDay.diariesList.forEach { diary ->
                val diaryType = convertDiaryType(diary.data.type)

                val _schedule = Schedule()
                _schedule.enabled = diary.meta.schedule.enabled
                _schedule.time = diary.meta.schedule.time
                val diaryMeta = DiaryMeta.Builder()
                    .id(diary.meta.id)
                    .date(date) // Wed Feb 01 2023 00:00:00 GMT+0900 (한국 표준시)
                    .dateString(diary.meta.dateString) // 2023-02-01
                    .description(diary.meta.description)
                    .type(diaryType)
                    .emotion(diary.data.feeling.score)
                    .schedule(_schedule)
                    .build()

                var time = diary.data.hasTime().let {
                    if (it) {
                        diary.data.time
                    } else {
                        null
                    }
                }

                val diaryData = DiaryData.Builder()
                    .type(diaryType)
                    .date(date)
                    .time(time)
                    .whoList(getWhoList(diary.data.whoList))
                    .where(getWhere(diary.data.where))
                    .food(getFood(diary.data.food))
                    .beforeHungryScore(diary.data.beforeHungryScore)
                    .afterHungryScore(diary.data.afterHungryScore)
                    .feeling(getFeeling(diary.data.feeling))
                    .significants(getSignificants(diary.data.significantsList))
                    .isSkip(false)
                    .build()

                val diary = Diary()
                diary.meta = diaryMeta
                diary.data = diaryData
                diaries.add(diary)
            }
        }
        return diaries
    }


}

fun convertDiaryType(value: Int): DiaryType {
    return when (value) {
        0 -> {
            DiaryType.TYPE_0
        }
        1 -> {
            DiaryType.TYPE_1
        }
        2 -> {
            DiaryType.TYPE_2
        }
        3 -> {
            DiaryType.TYPE_3
        }
        4 -> {
            DiaryType.TYPE_4
        }
        5 -> {
            DiaryType.TYPE_5
        }
        6 -> {
            DiaryType.TYPE_6
        }
        else -> {
            DiaryType.TYPE_1
        }
    }
}

fun convertWho(value: Int): Who {
    return when (value) {
        0 -> {
            Who.ALONE
        }
        1 -> {
            Who.FAMILY
        }
        2 -> {
            Who.FRIEND
        }
        3 -> {
            Who.COLLEAGUE
        }
        4 -> {
            Who.LOVER
        }
        else -> {
            Who.OTHER
        }
    }
}

fun convertFeelingEvent(value: Int): FeelingEvent {
    return when (value) {
        0 -> {
            FeelingEvent.FE_0
        }
        1 -> {
            FeelingEvent.FE_1
        }
        2 -> {
            FeelingEvent.FE_2
        }
        3 -> {
            FeelingEvent.FE_3
        }
        4 -> {
            FeelingEvent.FE_3
        }
        5 -> {
            FeelingEvent.FE_5
        }
        6 -> {
            FeelingEvent.FE_6
        }
        else -> {
            FeelingEvent.FE_0
        }
    }
}

fun convertSignificant(value: Int): Significant {
    return when (value) {
        0 -> {
            Significant.S_0
        }
        1 -> {
            Significant.S_1
        }
        2 -> {
            Significant.S_2
        }
        3 -> {
            Significant.S_3
        }
        4 -> {
            Significant.S_4
        }
        5 -> {
            Significant.S_5
        }
        6 -> {
            Significant.S_6
        }
        7 -> {
            Significant.S_7
        }
        else -> {
            Significant.S_0
        }
    }
}

fun getWhere(value: Int): Where {
    return when (value) {
        0 -> {
            Where.TABLE
        }
        1 -> {
            Where.NOT_TABLE
        }
        2 -> {
            Where.SCHOOL_OFFICE
        }
        3 -> {
            Where.RESTAURANT
        }
        4 -> {
            Where.ETC
        }
        else -> {
            Where.ETC
        }
    }
}

fun getWhoList(whoList: List<Int>): List<Who>? {
    if (whoList.isEmpty()) {
        return null
    }
    val list = mutableListOf<Who>()
    whoList.forEach {
        list.add(convertWho(it))
    }
    return list
}

private fun getFeeling(feeling: Diaries.DiaryFeeling?): DiaryFeeling? {
    feeling?.let {
        return DiaryFeeling.Builder()
            .score(it.score)
            .event(getEvent(it.event))
            .build()
    }
    return null
}

private fun getEvent(event: Diaries.DiaryFeelingEvent?): DiaryFeelingEvent? {
    event?.let {
        return DiaryFeelingEvent.Builder()
            .event(convertFeelingEvent(it.id))
            .text(it.text)
            .build()
    }
    return null
}

private fun getSignificants(significantsList: List<Int>): List<Significant>? {
    if (significantsList.isEmpty()) {
        return null
    }
    val list = mutableListOf<Significant>()
    significantsList.forEach {
        list.add(convertSignificant(it))
    }
    return list
}

private fun getFood(food: Diaries.DiaryFood?): DiaryFood? {
    return food?.let {
        return DiaryFood.Builder()
            .text(it.text)
            .uris(it.urisList)
            .build()
    }
}
