package com.weltcorp.dta.wed.lib.diary.domain.model

class DiaryData private constructor(
    val type: DiaryType?,
    val time: String?,
    val who: Who?,
    val isSkip: Boolean = false
) {
    data class Builder(
        var type: DiaryType? = null,
        var time:String? = null,
        var who: Who? = null,
        var isSkip: Boolean = false
    ) {

        fun type(type: DiaryType) = apply { this.type = type }
        fun time(time: String) = apply { this.time = time}
        fun who(who: Who) = apply { this.who = who}
        fun isSkip(isSkip: Boolean) = apply { this.isSkip = isSkip}
        fun build() = DiaryData(type, time, who, isSkip)
    }
}