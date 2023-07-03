package com.weltcorp.dta.wir.lib.v1.model.questionnaire.gad7

import com.weltcorp.dta.wir.lib.v1.model.questionnaire.FeelingLevel
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.Questionnaire

data class GAD7Questionnaire3(
    override val headline: String = "지난 2주 동안 \n" + "다음 문제로 인해 괴로웠던 날이 얼마나 되나요?",
    override val boldInHeadline: String = "지난 2주 동안",
    override val description: String = "여러 가지 일에 대해 너무 많은 걱정을 한다.",
    override val boldInDescription: String? = null,
    override val subDescription: String? = null,
    val answerOptions: List<FeelingLevel> = FeelingLevel.values().toList(),
    var answer: FeelingLevel? = null,
) : Questionnaire {
    override val answerOptionTexts: List<String>
        get() = answerOptions.map { it.value }
}