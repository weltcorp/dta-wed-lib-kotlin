package com.weltcorp.dta.wed.lib.questionnaire.domain.model

class QuestionnaireAnswer private constructor(
    val date: Int,
    val bodyWhere: Int,
    val bodyFeel: Int,
    val feelType: Int,
    val conclusion: Int,
    val fear: Int,
    val sentence: Int,
    val message: String?,

) {
    data class Builder(
        var date: Int = 0,
        var bodyWhere: Int = 0,
        var bodyFeel: Int = 0,
        var feelType: Int = 0,
        var conclusion: Int = 0,
        var fear: Int = 0,
        var sentence: Int = 0,
        var message: String? = null,
    ) {
fun date(date: Int) = apply { this.date = date }
        fun bodyWhere(bodyWhere: Int) = apply { this.bodyWhere = bodyWhere }
        fun bodyFeel(bodyFeel: Int) = apply { this.bodyFeel = bodyFeel }
        fun feelType(feelType: Int) = apply { this.feelType = feelType }
        fun conclusion(conclusion: Int) = apply { this.conclusion = conclusion }
        fun fear(fear: Int) = apply { this.fear = fear }
        fun sentence(sentence: Int) = apply { this.sentence = sentence }
        fun message(message: String?) = apply { this.message = message }
        fun build() = QuestionnaireAnswer(date, bodyWhere, bodyFeel, feelType, conclusion, fear, sentence, message)
    }
}