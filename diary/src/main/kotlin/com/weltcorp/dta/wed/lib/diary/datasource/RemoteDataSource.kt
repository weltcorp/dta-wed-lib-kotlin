package com.weltcorp.dta.wed.lib.diary.datasource

import com.weltcorp.dta.wed.lib.diary.domain.model.DiaryData
import com.weltcorp.dta.wed.lib.diary.domain.model.DiaryMeta
import io.grpc.ManagedChannel
import io.reactivex.rxjava3.core.Completable

interface RemoteDataSource {


    suspend fun createDiary(meta: DiaryMeta, data: DiaryData): Completable

}