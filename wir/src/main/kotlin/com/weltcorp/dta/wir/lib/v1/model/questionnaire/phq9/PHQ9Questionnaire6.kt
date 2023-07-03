package com.weltcorp.dta.wir.lib.v1.model.questionnaire.phq9

import com.weltcorp.dta.wir.lib.v1.model.questionnaire.FeelingLevel
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.Questionnaire
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.SeverityLevelPast

data class PHQ9Questionnaire6(
    override val headline: String = "최근 2주 동안 \n" + "다음 문제로 인해 괴로웠던 날이 얼마나 되나요?",
    override val boldInHeadline: String = "최근 2주 동안",
    override val description: String = "자신에 대해 부정적으로 생각한다. \n" +
            "또는 스스로를 실패자라고 여기거나,\n" +
            "자기 자신이나 가족을 실망시켰다고 생각한다.",
    override val boldInDescription: String? = null,
    override val subDescription: String? = null,
    val answerOptions: List<FeelingLevel> = FeelingLevel.values().toList(),
    var answer: FeelingLevel? = null,
) : Questionnaire {
    override val answerOptionTexts: List<String>
        get() = answerOptions.map { it.value }
}