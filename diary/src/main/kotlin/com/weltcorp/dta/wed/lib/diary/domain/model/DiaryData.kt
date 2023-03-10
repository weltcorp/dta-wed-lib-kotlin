package com.weltcorp.dta.wed.lib.diary.domain.model

class DiaryData private constructor(
    var id: Int?,
    val type: DiaryType?,
    val date: Int?, //UnixTime in seconds (ex. 1675177200)
    val time: String?,
    val whoList: List<Who>?,
    val where: Where?,
    val food: DiaryFood?,
    val beforeHungryScore: Int?,
    val afterHungryScore: Int?,
    val feeling: DiaryFeeling?,
    val significants: List<Significant>?,
    val isSkip: Boolean = false
) {
    data class Builder(
        var id: Int? = null,
        var type: DiaryType? = null,
        var date: Int? = null,
        var time:String? = null,
        var whoList: List<Who>? = null,
        var where: Where? = null,
        var food: DiaryFood? = null,
        var beforeHungryScore: Int? = null,
        var afterHungryScore: Int? = null,
        var feeling: DiaryFeeling? = null,
        var significants: List<Significant>? = null,
        var isSkip: Boolean = false
    ) {

        fun id(id: Int) = apply { this.id = id }
        fun type(type: DiaryType) = apply { this.type = type }
        fun date(date: Int?) = apply { this.date = date}
        fun time(time: String?) = apply { this.time = time}
        fun whoList(whoList: List<Who>?) = apply { this.whoList = whoList}
        fun where(where: Where?) = apply { this.where = where}
        fun food(food: DiaryFood?) = apply { this.food = food}
        fun beforeHungryScore(beforeHungryScore: Int?) = apply {
            beforeHungryScore?.let {
                if (it < 0 || it > 4) {
                    throw IllegalArgumentException("beforeHungryScore must be between 0 and 4")
                }
            }
            this.beforeHungryScore = beforeHungryScore
        }
        fun afterHungryScore(afterHungryScore: Int?) = apply {
            afterHungryScore?.let {
                if (it < 0 || it > 4) {
                    throw IllegalArgumentException("afterHungryScore must be between 0 and 4")
                }
            }
            this.afterHungryScore = afterHungryScore
        }

        fun feeling(feeling: DiaryFeeling?) = apply { this.feeling = feeling}

        fun significants(significants: List<Significant>?) = apply { this.significants = significants}
        fun isSkip(isSkip: Boolean) = apply { this.isSkip = isSkip}

        fun build() = DiaryData(
            id,
            type,
            date,
            time,
            whoList,
            where,
            food,
            beforeHungryScore,
            afterHungryScore,
            feeling,
            significants,
            isSkip
        )
    }
}