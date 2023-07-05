package com.weltcorp.dta.wir.lib.v1.model.diary

import java.time.LocalDateTime

data class SleepDiaryAnswer private constructor(
    val lot: LocalDateTime?,
    val ast: LocalDateTime?,
    val aet: LocalDateTime?,
    val waso: Int,
    val tst: Int,
    val problems: List<SleepProblem>,
    val lifestyles: List<SleepLifestyle>,
    val pill: SleepPill?,
    val nap: NapDuration?,
    val star: StarLevel?,
) {
    data class Builder(
        var lot: LocalDateTime? = null,
        var ast: LocalDateTime? = null,
        var aet: LocalDateTime? = null,
        var waso: Int = 0,
        var tst: Int = 0,
        var problems: List<SleepProblem> = emptyList(),
        var lifestyles: List<SleepLifestyle> = emptyList(),
        var pill: SleepPill? = null,
        var nap: NapDuration? = null,
        var star: StarLevel? = null,
    ) {
        fun lot(dateTime: LocalDateTime?) = apply {
            // TODO: validate level
            this.lot = dateTime
        }
        fun ast(dateTime: LocalDateTime?) = apply {
            // TODO: validate level
            this.ast = dateTime
        }
        fun aet(dateTime: LocalDateTime?) = apply {
            // TODO: validate level
            this.aet = dateTime
        }
        fun waso(value: Int) = apply {
            // TODO: validate level
            this.waso = value
        }
        fun tst(value: Int) = apply {
            // TODO: validate level
            this.tst = value
        }
        fun problems(problems: List<SleepProblem>) = apply {
            // TODO: validate level
            this.problems = problems
        }
        fun lifestyles(lifestyles: List<SleepLifestyle>) = apply {
            // TODO: validate level
            this.lifestyles = lifestyles
        }
        fun pill(pill: SleepPill?) = apply {
            // TODO: validate level
            this.pill = pill
        }
        fun nap(nap: NapDuration?) = apply {
            // TODO: validate level
            this.nap = nap
        }
        fun star(star: StarLevel?) = apply {
            // TODO: validate level
            this.star = star
        }
        fun build() = SleepDiaryAnswer(
            lot,
            ast,
            aet,
            waso,
            tst,
            problems,
            lifestyles,
            pill,
            nap,
            star
        )
    }
}