package com.weltcorp.dta.wir.lib.v1.model.questionnaire

import com.weltcorp.dta.wir.lib.v1.model.questionnaire.isi.ISIAnswer

class CreateAnswerRequest(
    val userId: Int = 0,
    val questionnaireId: Int = 0,
    val date: Int = 0,
    val answers: List<ISIAnswer> = emptyList()
)