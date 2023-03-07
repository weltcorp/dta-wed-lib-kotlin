package com.weltcorp.dta.wed.lib.questionnaire.datasource

import com.weltcorp.dta.wed.lib.questionnaire.domain.model.questionnaire.Questionnaire
import com.weltcorp.dta.wed.lib.questionnaire.domain.model.QuestionnaireAnswer
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single

interface RemoteDataSource {

    suspend fun createQuestionnaire(userId: Int, data: QuestionnaireAnswer): Completable

    suspend fun getQuestionnaire(): Single<Questionnaire>
    suspend fun getQuestionnaireAnswers(userId: Int): Single<Questionnaire>
}