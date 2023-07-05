package com.weltcorp.dta.wir.lib.v1.model.learning

data class Lesson(
    val sessionItemId: Int,
    val itemTypeId: Int,
    val order: Int,
    val name: String,
    val description: String,
    val userLearningStatus: Int,
    val isCompleted: Boolean,
    val status: LearningStatus,
    val chapterTitle: String,
    val title: String,
    val pageIds: List<Int>
)