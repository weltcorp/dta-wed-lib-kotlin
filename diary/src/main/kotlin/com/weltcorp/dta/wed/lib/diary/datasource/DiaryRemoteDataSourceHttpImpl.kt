package com.weltcorp.dta.wed.lib.diary.datasource

import com.weltcorp.dta.wed.lib.diary.DiaryApiConfig
import com.weltcorp.dta.wed.lib.diary.domain.model.Diary
import com.weltcorp.dta.wed.lib.diary.domain.model.DiaryData
import com.weltcorp.dta.wed.lib.diary.domain.model.DiaryMeta
import dta.wed.api.v2.diaries.Diaries
import dta.wed.api.v2.diaries.DiariesDataGrpcKt
import dta.wed.api.v2.diaries.createDiaryRequest
import dta.wed.api.v2.diaries.diaryData
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import io.grpc.Metadata
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single

class DiaryRemoteDataSourceHttpImpl(
    val config: DiaryApiConfig
) : RemoteDataSource {

    override suspend fun createDiary(data: DiaryData): Completable {
        //Todo: Implement this
        return Completable.complete()
    }

    override suspend fun getDiaries(startDate: Int, endDate: Int): Single<List<Diary>> {
        TODO("Not yet implemented")
    }
}