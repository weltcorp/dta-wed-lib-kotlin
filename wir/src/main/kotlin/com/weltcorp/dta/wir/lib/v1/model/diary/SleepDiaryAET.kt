package com.weltcorp.dta.wir.lib.v1.model.diary

import java.time.LocalDateTime

data class SleepDiaryAET(
    override val headline: String = "잠에서 완전히 깨어난 \n" +
            "시각은 언제인가요?",
    override val description: String = "순수 수면시간 XXX시간", // Replace XXX when using in app
    var answer: LocalDateTime? = null
) : SleepDiary {
    override val answerOptionTexts: List<String>
        get() = emptyList()
}