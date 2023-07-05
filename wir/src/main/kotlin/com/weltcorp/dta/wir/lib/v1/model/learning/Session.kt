package com.weltcorp.dta.wir.lib.v1.model.learning

data class Session(
    val sessionId: Int,
    val order: Int,
    val name: String,
    val description: String,
    val projectAppId: Int,
    val status: LearningStatus,
    val userLearningStatus: Int,
    val updatedAt: Int,
    val createdAt: Int,
    val sessionItems: List<Lesson>,
    val unlockRemainingDay: Int,
)