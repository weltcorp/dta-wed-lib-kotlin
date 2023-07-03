package com.weltcorp.dta.wir.lib.v1.model.questionnaire


interface Questionnaire {
    val headline: String
    val boldInHeadline: String?
    val description: String
    val boldInDescription: String?
    val subDescription: String?
    val answerOptionTexts: List<String>
}

