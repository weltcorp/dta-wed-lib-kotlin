package com.weltcorp.dta.wir.lib.v1.model.questionnaire.isi

import com.weltcorp.dta.wir.lib.v1.model.questionnaire.Questionnaire
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.SeverityLevelPast

data class ISIQuestionnaire2(
    override val headline: String = "최근 2주 동안 다음의 문제를 얼마나 심각하게 겪었는지 평가해 주세요.",
    override val boldInHeadline: String = "최근 2주 동안",
    override val description: String = "자는 도중에 자주 깬다.",
    override val boldInDescription: String? = null,
    override val subDescription: String? = null,
    val answerOptions: List<SeverityLevelPast> = SeverityLevelPast.values().toList(),
    var answer: SeverityLevelPast? = null,
) : Questionnaire {
    override val answerOptionTexts: List<String>
        get() = answerOptions.map { it.value }
}

