package com.weltcorp.dta.wir.lib.v1.datasource

import com.weltcorp.dta.wir.lib.v1.model.diary.SleepDiaryAnswer
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.gad7.GAD7Answer
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.isi.ISIAnswer
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.phq9.PHQ9Answer
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.wiq.WIQAnswer

interface SleepDiaryDataSource {

    suspend fun createAnswer(dateTime: Int, answer: SleepDiaryAnswer)
}