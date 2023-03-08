package com.weltcorp.dta.wed.lib.diary.domain.model

class DiaryFood private constructor(
    val text: String?,
    val uris: List<String>?,
) {
    data class Builder(
        var text: String? = null,
        var uris: List<String>? = null,
    ) {

        fun text(text: String) = apply { this.text = text}
        fun uris(uris: List<String>?) = apply { this.uris = uris}
        fun build() = DiaryFood(text, uris)
    }
}