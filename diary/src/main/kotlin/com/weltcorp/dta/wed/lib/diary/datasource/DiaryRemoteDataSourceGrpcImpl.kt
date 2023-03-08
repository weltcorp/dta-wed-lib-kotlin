package com.weltcorp.dta.wed.lib.diary.datasource

import com.google.protobuf.kotlin.DslList
import com.weltcorp.dta.wed.lib.diary.DiaryApiConfig
import com.weltcorp.dta.wed.lib.diary.domain.model.*
import dta.wed.api.v2.diaries.*
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import io.grpc.Metadata
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single

class DiaryRemoteDataSourceGrpcImpl(
    val config: DiaryApiConfig
) : RemoteDataSource {

    var _channel = ManagedChannelBuilder
        .forAddress(config.host, config.port)
        .usePlaintext()
        .build()

    var _stub = DiariesDataGrpcKt.DiariesDataCoroutineStub(getChannel())
    fun getChannel(): ManagedChannel {
        if (_channel.isShutdown || _channel.isTerminated) {
            _channel = ManagedChannelBuilder
                .forAddress(config.host, config.port)
                .usePlaintext()
                .build()
        }
        return _channel
    }

    fun stub(): DiariesDataGrpcKt.DiariesDataCoroutineStub {
        if (_stub == null) {
            _stub = DiariesDataGrpcKt.DiariesDataCoroutineStub(getChannel())
        }
        return _stub
    }

    override suspend fun createDiary(data: DiaryData): Completable {

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
        return Completable.complete()
    }

    override suspend fun getDiaries(startDate: Int, endDate: Int): Single<List<Diary>> {

        val header = Metadata()
        header.put(Metadata.Key.of("x-request-dtx-user-id", Metadata.ASCII_STRING_MARSHALLER), "${config.userId}}")
        header.put(Metadata.Key.of("x-request-dtx-src-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wed-lib-kotlin")
        header.put(Metadata.Key.of("x-request-dtx-dst-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wed-api")
        header.put(Metadata.Key.of("x-request-dtx-protocol", Metadata.ASCII_STRING_MARSHALLER), "GRPC")
        header.put(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER), "Bearer " + config.auth)

        val request = getDiariesRequest{
            this.userId = userId.toLong()
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
                    .time(time)
                    .whoList(getWhoList(diary.data.whoList))
                    .isSkip(false)
                    .build()
//                    println(diary.data.type)
//                    println(diary.data.time)
//                    println(diary.data.whoList)
//                    println(diary.data.where)
//                    println(diary.data.food.text)
//                    println(diary.data.food.uriListList)
//                    println(diary.data.beforeHungryScore)
//                    println(diary.data.afterHungryScore)
//                    println(diary.data.feeling.score)
//                    println(diary.data.feeling.event.id)
//                    println(diary.data.feeling.event.text)

                val diary = Diary()
                diary.meta = diaryMeta
                diary.data = diaryData
                diaries.add(diary)
            }
        }
        return Single.just(diaries)
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
