package com.weltcorp.dta.wir.lib.v1.datasource

import com.weltcorp.dta.wir.lib.v1.model.questionnaire.CreateAnswerRequest
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.gad7.GAD7Answer
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.isi.ISIAnswer
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.phq9.PHQ9Answer
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.wiq.WIQAnswer
import java.time.LocalDateTime

const val BOK_1 = "HEALTH_CONNECT_SDK_AVAILABILITY_STATUS"

interface QuestionnaireDataSource {

    suspend fun createISIAnswer(dateTime: Int, answer: ISIAnswer)
    suspend fun createPHQ9Answer(dateTime: Int, answer: PHQ9Answer)
    suspend fun createGAD7Answer(dateTime: Int, answer: GAD7Answer)
    suspend fun createWIQAnswer(dateTime: Int, answer: WIQAnswer)
}