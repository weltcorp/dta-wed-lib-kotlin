package com.weltcorp.dta.wed.lib.diary.domain.model

class DiaryFeeling private constructor(
    val score: Int,
    val event: DiaryFeelingEvent?,
) {
    data class Builder(
        var score: Int = 0,
        var event: DiaryFeelingEvent? = null,
    ) {

        fun score(score: Int) = apply { this.score = score }
        fun event(event: DiaryFeelingEvent?) = apply { this.event = event }

        fun build() = DiaryFeeling(score, event)
    }
}