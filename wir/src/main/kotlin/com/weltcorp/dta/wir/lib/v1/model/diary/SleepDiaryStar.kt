package com.weltcorp.dta.wir.lib.v1.model.diary

data class SleepDiaryStar(
    override val headline: String = "지난 수면의 만족도를\n" +
            "평가해 주세요",
    override val description: String = "XXX/5", // Replace XXX when using in app
    val answerOptions: List<StarLevel> = StarLevel.values().toList(),
    var answer: StarLevel? = null
) : SleepDiary {
    override val answerOptionTexts: List<String>
        get() = answerOptions.map { it.value }
}