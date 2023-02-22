package com.weltcorp.dta.wed.lib.diary.datasource

import com.weltcorp.dta.wed.lib.diary.domain.model.Diary
import com.weltcorp.dta.wed.lib.diary.domain.model.DiaryData
import com.weltcorp.dta.wed.lib.diary.domain.model.DiaryMeta
import dta.wed.api.v2.diaries.Diaries
import io.grpc.ManagedChannel
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single

interface RemoteDataSource {


    suspend fun createDiary(userId: Int, meta: DiaryMeta, data: DiaryData): Completable

    suspend fun getDiaries(userId: Int, startDate: Int, endDate: Int): Single<List<Diary>>
}