package com.weltcorp.dta.wed.lib.questionnaire.domain.model.questionnaire


data class Option(
    val id: Int,
    val text: String
)

data class BodyWhere (
    val type: Int,
    val isRequired: Boolean,
    val title: String,
    val options: List<Option>
)

data class BodyFeel (
    val type: Int,
    val isRequired: Boolean,
    val title: String,
    val options: List<Option>
)

data class Conclusion (
    val type: Int,
    val isRequired: Boolean,
    val title: String,
    val options: List<Option>
)

data class Fear (
    val type: Int,
    val isRequired: Boolean,
    val title: String,
    val options: List<Option>
)

data class Sentence (
    val type: Int,
    val isRequired: Boolean,
    val title: String,
    val options: List<Option>
)

data class Message (
    val type: Int,
    val isRequired: Boolean,
    val title: String,
)

class Questionnaire (
//    val bodyWhere: BodyWhere,
//    val bodyFeel: BodyFeel,
//    val message: Message
)

