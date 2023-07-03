package com.weltcorp.dta.wir.lib.v1.model.questionnaire.wiq

import com.weltcorp.dta.wir.lib.v1.model.questionnaire.OverallStatus
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.Questionnaire

data class WIQQuestionnaire4(
    override val headline: String = "최근 2주 동안의 상태를\n" +
            "가장 잘 나타내는 답변을 선택해 주세요.",
    override val boldInHeadline: String = "최근 2주 동안의 상태",
    override val description: String = "당신의 최근 건강 상태는 전반적으로 \n" +
            "어떠한가요?",
    override val boldInDescription: String? = "건강 상태",
    override val subDescription: String? = null,
    val answerOptions: List<OverallStatus> = OverallStatus.values().toList(),
    var answer: OverallStatus? = null,
) : Questionnaire {
    override val answerOptionTexts: List<String>
        get() = answerOptions.map { it.value }
}