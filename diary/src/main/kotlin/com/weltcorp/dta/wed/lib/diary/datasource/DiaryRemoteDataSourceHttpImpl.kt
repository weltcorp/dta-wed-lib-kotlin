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

class DiaryRemoteDataSourceHttpImpl(
    val config: DiaryApiConfig
) : RemoteDataSource {

    override suspend fun createDiary(meta: DiaryMeta, data: DiaryData): Completable {
        //Todo: Implement this
        return Completable.complete()
    }
}