package com.weltcorp.dta.wir.lib.v1.model.diary

import java.time.LocalDateTime

data class SleepDiaryAST(
    override val headline: String = "언제 잠이 들었나요?",
    override val description: String = "잠들기까지 XXX분 걸렸어요", // Replace XXX when using in app
    var answer: LocalDateTime? = null
) : SleepDiary {
    override val answerOptionTexts: List<String>
        get() = emptyList()
}