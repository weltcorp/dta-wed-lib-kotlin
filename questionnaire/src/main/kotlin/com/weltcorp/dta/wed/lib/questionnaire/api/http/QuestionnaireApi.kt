package com.weltcorp.dta.wed.lib.questionnaire.api.http

import io.reactivex.rxjava3.core.Completable

interface QuestionnaireApi {

    fun createDiary(
    ): Completable
}