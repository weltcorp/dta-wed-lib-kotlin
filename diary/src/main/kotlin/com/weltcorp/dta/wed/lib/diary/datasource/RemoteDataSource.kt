package com.weltcorp.dta.wed.lib.diary.datasource

import com.weltcorp.dta.wed.lib.diary.domain.model.Diary
import com.weltcorp.dta.wed.lib.diary.domain.model.DiaryData
import com.weltcorp.dta.wed.lib.diary.domain.model.DiaryMeta
import dta.wed.api.v2.diaries.Diaries
import io.grpc.ManagedChannel
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single

interface RemoteDataSource {


    suspend fun createDiary(data: DiaryData)

    suspend fun updateDiary(data: DiaryData)
    suspend fun deleteDiary(id: Int)

    suspend fun getDiaries(startDate: Int, endDate: Int): List<Diary>
}