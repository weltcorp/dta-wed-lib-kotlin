package com.weltcorp.dta.wed.lib.diary.domain.model

enum class DiaryType {
    TYPE_0, // 아침
    TYPE_1, // 간식
    TYPE_2, // 점심
    TYPE_3, // 간식
    TYPE_4, // 저녁
    TYPE_5, // 간식
    TYPE_6, // 추가 간식
}

enum class Who {
    ALONE, // 혼자
    FAMILY, // 가족
    FRIEND, // 친구
    COLLEAGUE, // 직장동료
    LOVER, // 연인
    OTHER, // 그 외
}

enum class Where {
    TABLE,         // 식탁에 잘 차려서
    NOT_TABLE,     // 식탁 이외의 장소
    SCHOOL_OFFICE, // 학교/직장
    RESTAURANT,    //음식점
    ETC,           // 그 외
}

enum class FeelingScoreText {
    FST_0, // 최악이었어
    FST_1, // 마음이 무거웠어
    FST_2, // 담담했어
    FST_3, // 만족스러웠어
    FST_4, // 더할 나위 없이 좋았어
}

enum class FeelingEvent {
    FE_0, // 가족과 갈등이 있었어
    FE_1, // 학교/직장에서 안 좋은 일이 있었어.
    FE_2, // 내 외모를 의식하게 됐어.
    FE_3, // 친구/연인과 안좋은 일이 있었어.
    FE_4, // 생각해 둔 메뉴를 먹지 못했어.
    FE_5, // 너무 많이 먹어 버렸다는 생각이 들었어.
    FE_6, // 직접 입력하기
}

enum class Significant {
    S_0, // 폭식
    S_1, // 먹토
    S_2, // 씹뱉
    S_3, // 과도한 운동
    S_4, // 변비약
    S_5, // 다이어트 보조제
    S_6, // 바디체크
    S_7, // 음주
}