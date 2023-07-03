package com.weltcorp.dta.wir.lib.v1.model.questionnaire

enum class SeverityLevelPast(val value: String) {
    NO_PROBLEM("문제없었다"),
    MILD("가벼웠다"),
    MODERATE("보통이었다"),
    SEVERE("심했다"),
    VERY_SEVERE("매우 심했다")
}

enum class SatisfactionLevel(val value: String) {
    VERY_SATISFIED("매우 만족한다"),
    SOMEWHAT_SATISFIED("어느 정도 만족한다"),
    NEITHER_SATISFIED_NOR_DISSATISFIED("만족도 불만족도 아니다"),
    SOMEWHAT_DISSATISFIED("다소 불만족한다"),
    VERY_DISSATISFIED("매우 불만족한다")
}

enum class ImpactLevel(val value: String) {
    NO_IMPACT("전혀 지장을 주지 않는다"),
    SOMEWHAT_IMPACT("약간은 지장을 준다"),
    MODERATE_IMPACT("어느 정도 지장을 준다"),
    CONSIDERABLE_IMPACT("상당히 지장을 준다"),
    SIGNIFICANT_IMPACT("매우 큰 지장을 준다")
}

enum class VisibilityLevel(val value: String) {
    NO_VISIBILITY("전혀 티가 나지 않는다"),
    SLIGHTLY_VISIBLE("그다지 티가 나지 않는다"),
    SOMEWHAT_VISIBLE("어느 정도 티가 난다"),
    CONSIDERABLE_VISIBLE("상당히 티가 난다"),
    VERY_VISIBLE("매우 많이 티가 난다")
}

enum class SeverityLevelPresent(val value: String) {
    NONE("전혀 없다"),
    MILD("가볍다"),
    MODERATE("보통이다"),
    SEVERE("심하다"),
    VERY_SEVERE("매우 심하다")
}

enum class FeelingLevel(val value: String) {
    NONE("전혀 없다"),
    FEW_DAYS("며칠 정도"),
    MORE_THAN_HALF("절반 이상"),
    ALMOST_EVERYDAY("거의 매일")
}

enum class MedicationUsage(val value: String) {
    NONE("없다"),
    DAILY("매일 먹는 약이 있다"),
    AS_NEEDED("필요시에만 먹는 약이 있다")
}

enum class OverallStatus(val value: String) {
    EXCELLENT("최상이다"),
    GOOD_WEEKLY("매주 좋다"),
    GOOD("좋다"),
    AVERAGE("보통이다"),
    BAD("나쁘다")
}
