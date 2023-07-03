package com.weltcorp.dta.wir.lib.v1.model.questionnaire.wiq

import com.weltcorp.dta.wir.lib.v1.model.questionnaire.Questionnaire

data class WIQQuestionnaire1(
    override val headline: String = "최근 2주 동안의 상태를\n" +
            "가장 잘 나타내는 답변을 선택해 주세요.",
    override val boldInHeadline: String = "최근 2주 동안의 상태",
    override val description: String = "하루 평균 수면 시간은 얼마나 되나요?",
    override val boldInDescription: String? = "하루 평균 수면 시간",
    override val subDescription: String? = null,
    val answerOptions: List<String> = emptyList(),
    var answer: Int? = null, // minutes (Example: 03:15 -> 195)
) : Questionnaire {
    override val answerOptionTexts: List<String>
        get() = answerOptions
}