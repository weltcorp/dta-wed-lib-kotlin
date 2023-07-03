package com.weltcorp.dta.wir.lib.v1.model.questionnaire.isi

import com.weltcorp.dta.wir.lib.v1.model.questionnaire.Questionnaire
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.SatisfactionLevel

data class ISIQuestionnaire5(
    override val headline: String = "최근 2주 동안의 상태를 가장 잘 나타내는 답변을 선택해 주세요.",
    override val boldInHeadline: String = "최근 2주 동안의 상태",
    override val description: String = "수면 문제가 당신의 일상생활과 기능에 얼마나 지장을 준다고 생각하시나요?",
    override val boldInDescription: String? = null,
    override val subDescription: String? = "(낮 동안의 피로, 업무/학업/가사 능력, 집중력, 기억력, 기분 등)",
    val answerOptions: List<SatisfactionLevel> = SatisfactionLevel.values().toList(),
    var answer: SatisfactionLevel? = null,
) : Questionnaire {
    override val answerOptionTexts: List<String>
        get() = answerOptions.map { it.value }
}

