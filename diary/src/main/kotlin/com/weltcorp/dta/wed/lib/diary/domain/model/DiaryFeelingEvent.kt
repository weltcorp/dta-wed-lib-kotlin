package com.weltcorp.dta.wed.lib.diary.domain.model

class DiaryFeelingEvent private constructor(
    val event: FeelingEvent,
    val text: String?
) {
    data class Builder(
        var event: FeelingEvent = FeelingEvent.FE_0,
        var text: String? = null,
    ) {

        fun event(event: FeelingEvent) = apply { this.event = event }
        fun text(text: String?) = apply {
            if (event != FeelingEvent.FE_6) {
                throw IllegalArgumentException("text is allowed for event FE_6")
            }
            this.text = text
        }

        fun build() = DiaryFeelingEvent(event, text)
    }
}