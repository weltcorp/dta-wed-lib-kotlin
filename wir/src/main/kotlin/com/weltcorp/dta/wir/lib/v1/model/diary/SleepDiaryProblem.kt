package com.weltcorp.dta.wir.lib.v1.model.diary

import java.time.LocalDateTime

data class SleepDiaryProblem(
    override val headline: String = "지난밤 수면 중에 겪은 문제를\n" +
            "모두 선택해 주세요",
    override val description: String = "",
    val answerOptions: List<SleepProblem> = SleepProblem.values().toList(),
    var answer: List<SleepProblem> = emptyList()
) : SleepDiary {
    override val answerOptionTexts: List<String>
        get() = answerOptions.map { it.value }
}