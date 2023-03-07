package com.weltcorp.dta.wed.lib.questionnaire.datasource

import com.weltcorp.dta.wed.lib.questionnaire.QuestionnaireApiConfig
import com.weltcorp.dta.wed.lib.questionnaire.domain.model.questionnaire.Questionnaire
import com.weltcorp.dta.wed.lib.questionnaire.domain.model.QuestionnaireAnswer
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single

class QuestionnaireRemoteDataSourceHttpImpl(
    val config: QuestionnaireApiConfig
) : RemoteDataSource {

    override suspend fun createQuestionnaire(userId: Int, data: QuestionnaireAnswer): Completable {
        //Todo: Implement this
        return Completable.complete()
    }

    override suspend fun getQuestionnaire(): Single<Questionnaire> {
        TODO("Not yet implemented")
    }

    override suspend fun getQuestionnaireAnswers(userId: Int): Single<Questionnaire> {
        TODO("Not yet implemented")
    }
}