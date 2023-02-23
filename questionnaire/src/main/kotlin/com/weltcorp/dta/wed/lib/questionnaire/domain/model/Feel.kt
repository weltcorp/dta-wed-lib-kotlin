package com.weltcorp.dta.wed.lib.questionnaire.domain.model

object Feel {
    const val TYPE_0 = 0 // 수치심
    const val TYPE_1 = 1 // 자기혐오
    const val TYPE_2 = 2 // 공포
    const val TYPE_3 = 3 // 불안
    const val TYPE_4 = 4 // 분노
    const val TYPE_5 = 5 // 슬픔
    const val TYPE_6 = 6 // 질투
    const val TYPE_7 = 7 // 절망
    const val TYPE_8 = 8 // 외로움

    fun getTitleOfType(type: Int): String {
        return when (type) {
            TYPE_0 -> "수치심"
            TYPE_1 -> "자기혐오"
            TYPE_2 -> "공포"
            TYPE_3 -> "불안"
            TYPE_4 -> "분노"
            TYPE_5 -> "슬픔"
            TYPE_6 -> "질투"
            TYPE_7 -> "젊망"
            TYPE_8 -> "외로움"
            else -> "알 수 없음"
        }
    }

//    fun getFeels(): List<Int> {
//        return listOf(FEEL_0, FEEL_1, FEEL_2, FEEL_3, FEEL_4, FEEL_5, FEEL_6)
//    }
//
//    fun getOptions(feel: Int): List<String> {
//        return when (feel) {
//            FEEL_0 -> listOf("묵직함", "불타는 느낌", "공허함", "울렁거림", "조이는 느낌", "소름끼침", "오한")
//            FEEL_1 -> listOf("불타는 느낌", "묵직함", "공허함", "울렁거림", "조이는 느낌", "소름끼침", "오한")
//            FEEL_2 -> listOf("공허함", "불타는 느낌", "묵직함", "울렁거림", "조이는 느낌", "소름끼침", "오한")
//            FEEL_3 -> listOf("울렁거림", "공허함", "불타는 느낌", "묵직함", "조이는 느낌", "소름끼침", "오한")
//            FEEL_4 -> listOf("조이는 느낌", "울렁거림", "공허함", "불타는 느낌", "묵직함", "소름끼침", "오한")
//            FEEL_5 -> listOf("소름끼침", "조이는 느낌", "울렁거림", "공허함", "불타는 느낌", "묵직함", "오한")
//            FEEL_6 -> listOf("오한", "소름끼침", "조이는 느낌", "울렁거림", "공허함", "불타는 느낌", "묵직함")
//            else -> listOf("알 수 없음")
//        }
//    }
}