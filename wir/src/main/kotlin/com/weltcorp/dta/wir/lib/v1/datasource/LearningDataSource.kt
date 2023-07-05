package com.weltcorp.dta.wir.lib.v1.datasource

import com.weltcorp.dta.wir.lib.v1.model.learning.Session

interface LearningDataSource {
    suspend fun getCoreSessions(): List<Session>

}