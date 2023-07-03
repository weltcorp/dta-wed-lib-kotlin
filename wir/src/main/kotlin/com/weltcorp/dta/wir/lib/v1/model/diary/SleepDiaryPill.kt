package com.weltcorp.dta.wir.lib.v1.model.diary

import java.time.LocalDateTime

data class SleepDiaryPill(
    override val headline: String = "자기 전에 수면제를 먹었나요?",
    override val description: String = "",
    val answerOptions: List<SleepPill> = SleepPill.values().toList(),
    var answer: SleepPill? = null
) : SleepDiary {
    override val answerOptionTexts: List<String>
        get() = answerOptions.map { it.value }
}