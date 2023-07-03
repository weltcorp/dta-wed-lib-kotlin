package com.weltcorp.dta.wir.lib.v1.model.questionnaire.wiq

import com.weltcorp.dta.wir.lib.v1.model.questionnaire.FeelingLevel
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.MedicationUsage
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.OverallStatus
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.SatisfactionLevel
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.SeverityLevelPast
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.SeverityLevelPresent
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.VisibilityLevel
import dta.wir.api.v1.questionnaires.Questionnaires
import dta.wir.api.v1.questionnaires.answer

data class WIQAnswer private constructor(
    // answer1 : minutes (Example: 03:15 -> 195)
    val answer1: Int?,
    // answer2 : minutes (Example: 13:30 -> 810)
    val answer2: Int?,
    val answer3: MedicationUsage?,
    val answer4: OverallStatus?,
    val answers: List<Questionnaires.Answer> = emptyList()
) {
    fun toList(): List<Questionnaires.Answer> {
        return listOf(
            answer {
                itemKey = 1
                optionKey = 1 // dummy
                answerText = answer1?.toString() ?: ""
            },
            answer {
                itemKey = 2
                optionKey = 1 // dummy
                answerText = answer1?.toString() ?: ""
            },
            answer {
                itemKey = 3
                optionKey = answer3?.ordinal?.plus(1) ?: 0
            },
            answer {
                itemKey = 4
                optionKey = answer4?.ordinal?.plus(1) ?: 0
            },
        )
    }

    data class Builder(
        var answer1: Int? = null,
        var answer2: Int? = null,
        var answer3: MedicationUsage? = null,
        var answer4: OverallStatus? = null,
    ) {
        fun answer1(value: Int?) = apply {
            // TODO: validate value
            this.answer1 = value
        }
        fun answer2(value: Int?) = apply {
            // TODO: validate value
            this.answer2 = value
        }
        fun answer3(level: MedicationUsage?) = apply {
            // TODO: validate level
            this.answer3 = level
        }
        fun answer4(level: OverallStatus?) = apply {
            // TODO: validate level
            this.answer4 = level
        }
        fun build() = WIQAnswer(
            answer1,
            answer2,
            answer3,
            answer4,
        )
    }
}