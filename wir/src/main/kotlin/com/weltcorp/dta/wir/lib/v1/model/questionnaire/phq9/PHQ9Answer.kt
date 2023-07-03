package com.weltcorp.dta.wir.lib.v1.model.questionnaire.phq9

import com.weltcorp.dta.wir.lib.v1.model.questionnaire.FeelingLevel
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.SatisfactionLevel
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.SeverityLevelPast
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.SeverityLevelPresent
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.VisibilityLevel
import dta.wir.api.v1.questionnaires.Questionnaires
import dta.wir.api.v1.questionnaires.answer

data class PHQ9Answer private constructor(
    val answer1: FeelingLevel?,
    val answer2: FeelingLevel?,
    val answer3: FeelingLevel?,
    val answer4: FeelingLevel?,
    val answer5: FeelingLevel?,
    val answer6: FeelingLevel?,
    val answer7: FeelingLevel?,
    val answer8: FeelingLevel?,
    val answer9: FeelingLevel?,
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
            answer {
                itemKey = 8
                optionKey = answer8?.ordinal?.plus(1) ?: 0
            },
            answer {
                itemKey = 9
                optionKey = answer9?.ordinal?.plus(1) ?: 0
            },
        )
    }

    data class Builder(
        var answer1: FeelingLevel? = null,
        var answer2: FeelingLevel? = null,
        var answer3: FeelingLevel? = null,
        var answer4: FeelingLevel? = null,
        var answer5: FeelingLevel? = null,
        var answer6: FeelingLevel? = null,
        var answer7: FeelingLevel? = null,
        var answer8: FeelingLevel? = null,
        var answer9: FeelingLevel? = null,
    ) {
        fun answer1(level: FeelingLevel?) = apply {
            // TODO: validate level
            this.answer1 = level
        }
        fun answer2(level: FeelingLevel?) = apply {
            // TODO: validate level
            this.answer2 = level
        }
        fun answer3(level: FeelingLevel?) = apply {
            // TODO: validate level
            this.answer3 = level
        }
        fun answer4(level: FeelingLevel?) = apply {
            // TODO: validate level
            this.answer4 = level
        }
        fun answer5(level: FeelingLevel?) = apply {
            // TODO: validate level
            this.answer5 = level
        }
        fun answer6(level: FeelingLevel?) = apply {
            // TODO: validate level
            this.answer6 = level
        }
        fun answer7(level: FeelingLevel?) = apply {
            // TODO: validate level
            this.answer7 = level
        }
        fun answer8(level: FeelingLevel?) = apply {
            // TODO: validate level
            this.answer8 = level
        }
        fun answer9(level: FeelingLevel?) = apply {
            // TODO: validate level
            this.answer9 = level
        }
        fun build() = PHQ9Answer(
            answer1,
            answer2,
            answer3,
            answer4,
            answer5,
            answer6,
            answer7,
            answer8,
            answer9,
        )
    }
}