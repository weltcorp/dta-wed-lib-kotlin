package com.weltcorp.dta.wir.lib.v1.model.diary

import java.time.LocalDateTime

data class SleepDiaryWASO(
    override val headline: String = "도중에 깨어있던 시간은\n" +
            "대략 얼마인가요?",
    override val description: String = "순수 수면시간 XXX시간", // Replace XXX when using in app
    var answer: Int = 0//minutes (Example: 03:15 -> 195)
) : SleepDiary {
    override val answerOptionTexts: List<String>
        get() = emptyList()
}