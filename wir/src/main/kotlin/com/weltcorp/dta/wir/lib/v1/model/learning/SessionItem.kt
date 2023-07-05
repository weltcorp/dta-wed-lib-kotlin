package com.weltcorp.dta.wir.lib.v1.model.learning

data class SessionItem(
    val sessionItemId: Int,
    val itemTypeId: Int,
    val order: Int,
    val name: String,
    val description: String,
    val learningStatus: Int,
    val userLearningStatus: Int,
    val createdAt: Int,
    val updatedAt: Int,
    val pageIds: List<Int>
)