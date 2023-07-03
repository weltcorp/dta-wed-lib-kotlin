package com.weltcorp.dta.wir.lib.v1.model.questionnaire.phq9

import com.weltcorp.dta.wir.lib.v1.model.questionnaire.FeelingLevel
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.Questionnaire
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.SeverityLevelPast

data class PHQ9Questionnaire8(
    override val headline: String = "최근 2주 동안 \n" + "다음 문제로 인해 괴로웠던 날이 얼마나 되나요?",
    override val boldInHeadline: String = "최근 2주 동안",
    override val description: String = "다른 사람이 알아차릴 정도로 말과 행동이\n" +
            "너무 느려진다. 또는, 반대로 너무 초조하거나\n" +
            "안절부절못해서 가만히 있기가 어렵다.",
    override val boldInDescription: String? = null,
    override val subDescription: String? = null,
    val answerOptions: List<FeelingLevel> = FeelingLevel.values().toList(),
    var answer: FeelingLevel? = null,
) : Questionnaire {
    override val answerOptionTexts: List<String>
        get() = answerOptions.map { it.value }
}