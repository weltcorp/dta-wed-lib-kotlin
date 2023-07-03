package com.weltcorp.dta.wir.lib.v1.model.questionnaire.phq9

import com.weltcorp.dta.wir.lib.v1.model.questionnaire.FeelingLevel
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.Questionnaire
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.SeverityLevelPast

data class PHQ9Questionnaire7(
    override val headline: String = "최근 2주 동안 \n" + "다음 문제로 인해 괴로웠던 날이 얼마나 되나요?",
    override val boldInHeadline: String = "최근 2주 동안",
    override val description: String = "무언가에 집중하기가 어렵다.",
    override val boldInDescription: String? = null,
    override val subDescription: String? = "(글을 읽거나 영상을 보는 것 등)",
    val answerOptions: List<FeelingLevel> = FeelingLevel.values().toList(),
    var answer: FeelingLevel? = null,
) : Questionnaire {
    override val answerOptionTexts: List<String>
        get() = answerOptions.map { it.value }
}