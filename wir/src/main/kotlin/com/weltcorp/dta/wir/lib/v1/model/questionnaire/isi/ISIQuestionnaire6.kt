package com.weltcorp.dta.wir.lib.v1.model.questionnaire.isi

import com.weltcorp.dta.wir.lib.v1.model.questionnaire.Questionnaire
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.VisibilityLevel

data class ISIQuestionnaire6(
    override val headline: String = "최근 2주 동안의 상태를 가장 잘 나타내는 답변을 선택해 주세요.",
    override val boldInHeadline: String = "최근 2주 동안의 상태",
    override val description: String = "수면 문제로 인해 당신의 삶의 질이 저해되는 것이 다른 사람들에게 얼마나 티가 난다고 생각하시나요?",
    override val boldInDescription: String? = null,
    override val subDescription: String? = null,
    val answerOptions: List<VisibilityLevel> = VisibilityLevel.values().toList(),
    var answer: VisibilityLevel? = null,
) : Questionnaire {
    override val answerOptionTexts: List<String>
        get() = answerOptions.map { it.value }
}

