package com.weltcorp.dta.wir.lib.v1.model.questionnaire.isi

import com.weltcorp.dta.wir.lib.v1.model.questionnaire.Questionnaire
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.SeverityLevelPresent

data class ISIQuestionnaire7(
    override val headline: String = "최근 2주 동안의 상태를 가장 잘 나타내는 답변을 선택해 주세요.",
    override val boldInHeadline: String = "최근 2주 동안의 상태",
    override val description: String = "수면 문제로 인해 느끼는 괴로움이나 걱정은 어느 정도인가요?",
    override val boldInDescription: String? = null,
    override val subDescription: String? = null,
    val answerOptions: List<SeverityLevelPresent> = SeverityLevelPresent.values().toList(),
    var answer: SeverityLevelPresent? = null,
) : Questionnaire {
    override val answerOptionTexts: List<String>
        get() = answerOptions.map { it.value }
}

