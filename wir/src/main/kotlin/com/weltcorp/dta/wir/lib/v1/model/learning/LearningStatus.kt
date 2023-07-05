package com.weltcorp.dta.wir.lib.v1.model.learning

enum class LearningStatus {
    DRAFT,      // 초안
    PUBLISHED,  // 게시됨
    DISPOSED,   // 폐기됨
    TODO,       // 해야 할 일
    PENDING,    // 보류 중
    DOING,      // 진행 중
    DONE        // 완료
}