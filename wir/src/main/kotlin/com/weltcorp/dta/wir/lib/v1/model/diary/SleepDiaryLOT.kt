package com.weltcorp.dta.wir.lib.v1.model.diary

import java.time.LocalDateTime

data class SleepDiaryLOT(
    override val headline: String = "눈을 감고 잠을 청한\n" +
            "시각은 언제인가요?",
    override val description: String = "",
    var answer: LocalDateTime? = null
) : SleepDiary {
    override val answerOptionTexts: List<String>
        get() = emptyList()
}