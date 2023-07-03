package com.weltcorp.dta.wir.lib.v1.model.questionnaire.isi

import com.weltcorp.dta.wir.lib.v1.model.questionnaire.SatisfactionLevel
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.SeverityLevelPast
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.SeverityLevelPresent
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.VisibilityLevel
import dta.wir.api.v1.questionnaires.Questionnaires
import dta.wir.api.v1.questionnaires.answer

data class ISIAnswer private constructor(
    val answer1: SeverityLevelPast?,
    val answer2: SeverityLevelPast?,
    val answer3: SeverityLevelPast?,
    val answer4: SatisfactionLevel?,
    val answer5: SatisfactionLevel?,
    val answer6: VisibilityLevel?,
    val answer7: SeverityLevelPresent?,
    val answers: List<Questionnaires.Answer> = emptyList()
) {
    fun toList(): List<Questionnaires.Answer> {
        return listOf(
            answer {
                itemKey = 1
                optionKey = answer1?.ordinal?.plus(1) ?: 0
            },
            answer {
                itemKey = 2
                optionKey = answer2?.ordinal?.plus(1) ?: 0
            },
            answer {
                itemKey = 3
                optionKey = answer3?.ordinal?.plus(1) ?: 0
            },
            answer {
                itemKey = 4
                optionKey = answer4?.ordinal?.plus(1) ?: 0
            },
            answer {
                itemKey = 5
                optionKey = answer5?.ordinal?.plus(1) ?: 0
            },
            answer {
                itemKey = 6
                optionKey = answer6?.ordinal?.plus(1) ?: 0
            },
            answer {
                itemKey = 7
                optionKey = answer7?.ordinal?.plus(1) ?: 0
            },
        )
    }

    data class Builder(
        var answer1: SeverityLevelPast? = null,
        var answer2: SeverityLevelPast? = null,
        var answer3: SeverityLevelPast? = null,
        var answer4: SatisfactionLevel? = null,
        var answer5: SatisfactionLevel? = null,
        var answer6: VisibilityLevel? = null,
        var answer7: SeverityLevelPresent? = null,
    ) {
        fun answer1(level: SeverityLevelPast?) = apply {
            // TODO: validate level
            this.answer1 = level
        }
        fun answer2(level: SeverityLevelPast?) = apply {
            // TODO: validate level
            this.answer2 = level
        }
        fun answer3(level: SeverityLevelPast?) = apply {
            // TODO: validate level
            this.answer3 = level
        }
        fun answer4(level: SatisfactionLevel?) = apply {
            // TODO: validate level
            this.answer4 = level
        }
        fun answer5(level: SatisfactionLevel?) = apply {
            // TODO: validate level
            this.answer5 = level
        }
        fun answer6(level: VisibilityLevel?) = apply {
            // TODO: validate level
            this.answer6 = level
        }
        fun answer7(level: SeverityLevelPresent?) = apply {
            // TODO: validate level
            this.answer7 = level
        }
        fun build() = ISIAnswer(
            answer1,
            answer2,
            answer3,
            answer4,
            answer5,
            answer6,
            answer7,
        )
    }
}