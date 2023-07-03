package com.weltcorp.dta.wir.lib.v1.model.questionnaire.wiq

import com.weltcorp.dta.wir.lib.v1.model.questionnaire.MedicationUsage
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.Questionnaire

data class WIQQuestionnaire3(
    override val headline: String = "최근 2주 동안의 상태를\n" +
            "가장 잘 나타내는 답변을 선택해 주세요.",
    override val boldInHeadline: String = "최근 2주 동안의 상태",
    override val description: String = "병원에서 처방받아 복용하고 있는\n" +
            "수면제 또는 수면 유도제가 있나요?",
    override val boldInDescription: String? = "병원에서 처방받아",
    override val subDescription: String? = null,
    val answerOptions: List<MedicationUsage> = MedicationUsage.values().toList(),
    var answer: MedicationUsage? = null,
) : Questionnaire {
    override val answerOptionTexts: List<String>
        get() = answerOptions.map { it.value }
}