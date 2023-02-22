package com.weltcorp.dta.wed.lib.diary.domain.model

class Schedule {
    var enabled: Boolean = false
    var time: String? = null
}
class DiaryMeta private constructor(
    val id: Int?,
    val date: Int, //UnixTime in seconds (ex. 1675177200)
    val dateString: String?,
    val type: DiaryType?,
    val description: String?,
    val emotion: Int?,
    val schedule: Schedule?,
) {
    data class Builder(
        var id: Int? = null,
        var date: Int = 0,
        var dateString: String? = null,
        var type: DiaryType? = null,
        var description: String? = null,
        var emotion: Int? = null,
        var schedule: Schedule? = null,
    ) {

        fun id(id: Int) = apply { this.id = id}
        fun date(date: Int) = apply { this.date = date}
        fun dateString(dateString: String?) = apply { this.dateString = dateString}
        fun type(type: DiaryType) = apply { this.type = type }
        fun description(desc: String) = apply { this.description = desc}

        fun emotion(emotion: Int) = apply { this.emotion = emotion}
        fun schedule(schedule: Schedule) = apply { this.schedule = schedule}
        fun build() = DiaryMeta(id, date, dateString, type, description, emotion, schedule)
    }
}