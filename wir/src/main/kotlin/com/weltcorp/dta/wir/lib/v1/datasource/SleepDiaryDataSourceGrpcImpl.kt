package com.weltcorp.dta.wir.lib.v1.datasource

import com.weltcorp.dta.wir.lib.v1.ApiConfig
import com.weltcorp.dta.wir.lib.v1.model.diary.NapDuration
import com.weltcorp.dta.wir.lib.v1.model.diary.SleepDiaryAnswer
import com.weltcorp.dta.wir.lib.v1.model.diary.SleepPill
import dta.wir.api.v1.diaries.Diaries
import dta.wir.api.v1.diaries.Diaries.CreateUserDiaryRequest
import dta.wir.api.v1.diaries.Diaries.DiaryAnswer
import dta.wir.api.v1.diaries.DiariesDataGrpcKt
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import io.grpc.Metadata
import io.grpc.StatusRuntimeException
import java.time.ZoneId
import java.time.ZonedDateTime

class SleepDiaryDataSourceGrpcImpl(private val config: ApiConfig): SleepDiaryDataSource {

    private var _channel = getMangedChannel()
    private var _stub = DiariesDataGrpcKt.DiariesDataCoroutineStub(getChannel())

    private fun getHeader(): Metadata {
        return Metadata().apply {
            put(Metadata.Key.of("x-request-dtx-src-account-type", Metadata.ASCII_STRING_MARSHALLER), "0")
            put(Metadata.Key.of("x-request-dtx-src-domain-id", Metadata.ASCII_STRING_MARSHALLER), "100")
            put(Metadata.Key.of("x-request-dtx-src-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wir-app-android")
            put(Metadata.Key.of("x-request-dtx-dst-protocol", Metadata.ASCII_STRING_MARSHALLER), "grpc")
            put(Metadata.Key.of("x-request-dtx-dst-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wir-api")
            put(Metadata.Key.of("x-request-dtx-dst-service-version", Metadata.ASCII_STRING_MARSHALLER), "com/weltcorp/dta/wir/lib/v1")
            put(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER), "Bearer " + config.auth)
        }
    }

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

    private fun stub(): DiariesDataGrpcKt.DiariesDataCoroutineStub{
        if (_stub == null) {
            _stub = DiariesDataGrpcKt.DiariesDataCoroutineStub(getChannel())
        }
        return _stub
    }

    override suspend fun createAnswer(dateTime: Int, answer: SleepDiaryAnswer) {
        val seoulTimeZone = ZoneId.of("Asia/Seoul")

        val request = CreateUserDiaryRequest.newBuilder()
            .setUserId(config.userId)
            .setDate(dateTime.toLong())
            .setAnswers(DiaryAnswer.newBuilder()
                .setLot(ZonedDateTime.of(answer.lot, seoulTimeZone).toEpochSecond())
                .setAst(ZonedDateTime.of(answer.ast, seoulTimeZone).toEpochSecond())
                .setAet(ZonedDateTime.of(answer.aet, seoulTimeZone).toEpochSecond())
                .setWaso(answer.waso)
                .addAllProblem(answer.problems.map { problem ->
                    Diaries.Answer.newBuilder()
                        .build()
                })
                .addAllLifestyle(answer.lifestyles.map { lifestyle ->
                    Diaries.Answer.newBuilder()
                        .setOptionKey(lifestyle.ordinal.plus(1))
                        .build()
                })
                .setPill(
                    when (answer.pill) {
                        SleepPill.YES -> true
                        else -> false
                    }
                )
                .setNap(
                    when (answer.nap) {
                        NapDuration.NO_NAP -> 0
                        NapDuration.FIVE_MINUTES -> 5
                        NapDuration.TEN_MINUTES -> 10
                        NapDuration.FIFTEEN_MINUTES -> 15
                        NapDuration.TWENTY_MINUTES -> 20
                        NapDuration.TWENTY_FIVE_MINUTES -> 25
                        NapDuration.THIRTY_MINUTES -> 30
                        NapDuration.FORTY_MINUTES -> 40
                        NapDuration.FIFTY_MINUTES -> 50
                        NapDuration.ONE_HOUR -> 60
                        NapDuration.ONE_HOUR_THIRTY_MINUTES -> 90
                        NapDuration.TWO_HOURS -> 120
                        NapDuration.TWO_HOURS_THIRTY_MINUTES -> 150
                        NapDuration.THREE_HOURS -> 180
                        NapDuration.FOUR_HOURS -> 240
                        NapDuration.FIVE_HOURS -> 300
                        NapDuration.SIX_HOURS_OR_MORE -> 360
                        else -> 0
                    }
                )
            )
            .build()

        val header = getHeader().apply {
//            put(Metadata.Key.of("x-request-dtx-user-id", Metadata.ASCII_STRING_MARSHALLER), "${userId}}")
        }

        try {
            val resp = stub().createUserDiary(request, header)
            println(resp)
        } catch (e: StatusRuntimeException) {
            println(e)
        }
    }

}