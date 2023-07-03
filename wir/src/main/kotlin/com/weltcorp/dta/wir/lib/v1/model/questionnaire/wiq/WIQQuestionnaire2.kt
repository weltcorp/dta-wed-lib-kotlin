package com.weltcorp.dta.wir.lib.v1.model.questionnaire.wiq

import com.weltcorp.dta.wir.lib.v1.model.questionnaire.Questionnaire

data class WIQQuestionnaire2(
    override val headline: String = "최근 2주 동안의 상태를\n" +
            "가장 잘 나타내는 답변을 선택해 주세요.",
    override val boldInHeadline: String = "최근 2주 동안의 상태",
    override val description: String = "하루 중 잠을 자지 않는 상태로 \n" +
            "침대에 머무는 시간은 얼마나 되나요?",
    override val boldInDescription: String? = "하루 중 잠을 자지 않는 상태로",
    override val subDescription: String? = "(침대 위에 앉거나 누워 휴식, 독서, TV 시청, 스마트폰 사용 등)",
    val answerOptions: List<String> = emptyList(),
    var answer: Int? = null, // minutes (Example: 03:15 -> 195)
) : Questionnaire {
    override val answerOptionTexts: List<String>
        get() = answerOptions
}