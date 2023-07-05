package com.weltcorp.dta.wir.lib.v1.datasource

import com.weltcorp.dta.wir.lib.v1.ApiConfig
import com.weltcorp.dta.wir.lib.v1.model.diary.NapDuration
import com.weltcorp.dta.wir.lib.v1.model.diary.SleepDiaryAnswer
import com.weltcorp.dta.wir.lib.v1.model.diary.SleepPill
import com.weltcorp.dta.wir.lib.v1.model.learning.Session
import dta.wir.api.v1.coreLessons.CoreLessons
import dta.wir.api.v1.coreLessons.CoreLessonsDataGrpcKt
import dta.wir.api.v1.diaries.Diaries
import dta.wir.api.v1.diaries.Diaries.DiaryAnswer
import dta.wir.api.v1.diaries.DiariesDataGrpcKt
import dta.wir.api.v1.diaries.PutUserDiaryTodayRequestKt
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import io.grpc.Metadata
import io.grpc.StatusRuntimeException
import java.time.ZoneId
import java.time.ZonedDateTime

class LearningDataSourceGrpcImpl(private val config: ApiConfig): LearningDataSource{

    private var _channel = getMangedChannel()
    private var _stub = DiariesDataGrpcKt.DiariesDataCoroutineStub(getChannel())
    private var _stubLearning = CoreLessonsDataGrpcKt.CoreLessonsDataCoroutineStub(getChannel())

    private fun getHeader(): Metadata {
        return Metadata().apply {
            put(Metadata.Key.of("x-request-dtx-src-account-type", Metadata.ASCII_STRING_MARSHALLER), "0")
            put(Metadata.Key.of("x-request-dtx-src-domain-id", Metadata.ASCII_STRING_MARSHALLER), "100")
            put(Metadata.Key.of("x-request-dtx-src-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wir-app-android")
            put(Metadata.Key.of("x-request-dtx-dst-protocol", Metadata.ASCII_STRING_MARSHALLER), "grpc")
            put(Metadata.Key.of("x-request-dtx-dst-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wir-api")
            put(Metadata.Key.of("x-request-dtx-dst-service-version", Metadata.ASCII_STRING_MARSHALLER), "v1")
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
    private fun stubLearning(): CoreLessonsDataGrpcKt.CoreLessonsDataCoroutineStub{
        if (_stubLearning == null) {
            _stubLearning = CoreLessonsDataGrpcKt.CoreLessonsDataCoroutineStub(getChannel())
        }
        return _stubLearning
    }

    override suspend fun getCoreSessions(): List<Session> {

        val request = CoreLessons.GetUserCoreLessonsRequest.newBuilder()
            .setUserId(config.userId)
            .build()

        val header = getHeader().apply {
//            put(Metadata.Key.of("x-request-dtx-user-id", Metadata.ASCII_STRING_MARSHALLER), "${userId}}")
        }

        val resp = stubLearning().getUserCoreLessons(request, header)
        println(resp)
        return emptyList()
    }

}