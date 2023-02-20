package com.weltcorp.dta.wed.lib.diary.datasource

import com.weltcorp.dta.wed.lib.diary.DiaryApiConfig
import com.weltcorp.dta.wed.lib.diary.domain.model.DiaryData
import com.weltcorp.dta.wed.lib.diary.domain.model.DiaryMeta
import dta.wed.api.v2.diaries.DiariesDataGrpcKt
import dta.wed.api.v2.diaries.createDiaryRequest
import dta.wed.api.v2.diaries.diaryData
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import io.grpc.Metadata
import io.reactivex.rxjava3.core.Completable

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

    override suspend fun createDiary(meta: DiaryMeta, data: DiaryData): Completable {

        if (meta.userId == null) {
            throw IllegalArgumentException("DiaryMeta.userId is null")
        }
        if (meta.date == null) {
            throw IllegalArgumentException("DiaryMeta.date is null")
        }
        if (data.type == null) {
            throw IllegalArgumentException("DiaryData.type is null")
        }

        val diaryData = diaryData {
            this.type = data.type.ordinal
            this.isSkip = data.isSkip
        }

        val request = createDiaryRequest {
            this.userId = meta.userId.toLong()
            this.date = meta.date
            this.data = diaryData
        }
        val header = Metadata()
        header.put(Metadata.Key.of("x-request-dtx-src-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wed-lib-kotlin")
        header.put(Metadata.Key.of("x-request-dtx-dst-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wed-api")
        header.put(Metadata.Key.of("x-request-dtx-protocol", Metadata.ASCII_STRING_MARSHALLER), "GRPC")
        header.put(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER), "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiI2OSIsImlhdCI6MTY2MTkyMDk4MCwiZXhwIjoyMjY4MjkxNDUzLCJkaSI6MSwiYWkiOjY5LCJhdCI6MSwidHlwZSI6ImFjY2VzcyJ9.38Jd29IpMGHeCmLmp191ymgaD2wlwcpEGi__GFtr3Yw")
        stub().createDiary(request, header)
        return Completable.complete()
    }
}