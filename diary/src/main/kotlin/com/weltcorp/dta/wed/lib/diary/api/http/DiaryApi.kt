package com.weltcorp.dta.wed.lib.diary.api.http

import io.reactivex.rxjava3.core.Completable

interface DiaryApi {

    fun createDiary(
    ): Completable
}