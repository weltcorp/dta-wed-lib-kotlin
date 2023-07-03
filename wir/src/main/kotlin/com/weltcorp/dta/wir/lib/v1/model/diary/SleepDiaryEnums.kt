package com.weltcorp.dta.wir.lib.v1.model.diary

enum class SleepProblem(val value: String) {
    NO_ISSUE("아무 문제 없이 잤다"),
    TOOK_TOO_LONG_TO_FALL_ASLEEP("잠들기까지 너무 오래 걸렸다"),
    FREQUENTLY_WOKE_UP("자는 도중에 자주 깼다"),
    WOKE_UP_TOO_EARLY_UNABLE_TO_FALL_ASLEEP_AGAIN("너무 일찍 깨서 다시 잠들 수 없었다")
}

enum class SleepLifestyle(val value: String) {
    NO_FACTOR("없다"),
    STRESS_WORRY("스트레스, 걱정"),
    EVENING_COFFEE("저녁에 마신 커피"),
    ALCOHOL_CONSUMPTION("음주"),
    HEAT("더위"),
    NOISE("소음"),
    OVERTIME_LATE_NIGHT_ACTIVITY("야근 또는 늦은 밤 활동"),
    PAIN("통증")
}

enum class SleepPill(val value: String) {
    YES("먹었어요"),
    NO("안 먹었어요")
}

enum class NapDuration(val value: String) {
    NO_NAP("안 잤어요"),
    FIVE_MINUTES("5분"),
    TEN_MINUTES("10분"),
    FIFTEEN_MINUTES("15분"),
    TWENTY_MINUTES("20분"),
    TWENTY_FIVE_MINUTES("25분"),
    THIRTY_MINUTES("30분"),
    FORTY_MINUTES("40분"),
    FIFTY_MINUTES("50분"),
    ONE_HOUR("1시간"),
    ONE_HOUR_THIRTY_MINUTES("1시간 30분"),
    TWO_HOURS("2시간"),
    TWO_HOURS_THIRTY_MINUTES("2시간 30분"),
    THREE_HOURS("3시간"),
    FOUR_HOURS("4시간"),
    FIVE_HOURS("5시간"),
    SIX_HOURS_OR_MORE("6시간 이상")
}

enum class StarLevel(val value: String) {
    LEVEL_1("1"),
    LEVEL_2("2"),
    LEVEL_3("3"),
    LEVEL_4("4"),
    LEVEL_5("5"),
}
