package com.weltcorp.dta.wed.lib.diary.domain.model

class Schedule {
    val enabled: Boolean = false
    val time: String? = null
}
class DiaryMeta private constructor(
    val id: Int?,
    val userId: Int,
    val date: Int, //UnixTime in seconds (ex. 1675177200)
    val type: DiaryType?,
    val title: String?,
    val description: String?,
    val emotion: Int?,
    val schedule: Schedule?,
) {
    data class Builder(
        var id: Int? = null,
        var userId: Int = 0,
        var date: Int = 0,
        var type: DiaryType? = null,
        var title: String? = null,
        var description: String? = null,
        var emotion: Int? = null,
        var schedule: Schedule? = null,
    ) {

        fun id(id: Int) = apply { this.id = id}
        fun userId(userId: Int) = apply { this.userId = userId}
        fun date(date: Int) = apply { this.date = date}
        fun type(type: DiaryType) = apply { this.type = type }
        fun title(title: String) = apply { this.title = title}
        fun description(desc: String) = apply { this.description = desc}

        fun emotion(emotion: Int) = apply { this.emotion = emotion}
        fun schedule(schedule: Schedule) = apply { this.schedule = schedule}
        fun build() = DiaryMeta(id, userId, date, type, title, description, emotion, schedule)
    }
}