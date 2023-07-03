package com.weltcorp.dta.wir.lib.v1.model.questionnaire.isi

import com.weltcorp.dta.wir.lib.v1.model.questionnaire.Questionnaire
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.SatisfactionLevel

data class ISIQuestionnaire4(
    override val headline: String = "최근 2주 동안의 상태를 가장 잘 나타내는 답변을 선택해 주세요.",
    override val boldInHeadline: String = "최근 2주 동안의 상태",
    override val description: String = "당신의 수면 패턴에 얼마나 만족하고 있나요?",
    override val boldInDescription: String? = null,
    override val subDescription: String? = null,
    val answerOptions: List<SatisfactionLevel> = SatisfactionLevel.values().toList(),
    var answer: SatisfactionLevel? = null,
) : Questionnaire {
    override val answerOptionTexts: List<String>
        get() = answerOptions.map { it.value }
}

