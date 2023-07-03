package unittest

import com.weltcorp.dta.wir.lib.v1.ApiConfig
import com.weltcorp.dta.wir.lib.v1.datasource.QuestionnaireDataSourceGrpcImpl
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.SatisfactionLevel
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.SeverityLevelPast
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.SeverityLevelPresent
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.VisibilityLevel
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.isi.ISIAnswer
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZonedDateTime

suspend fun main(args: Array<String>) {

    val config = ApiConfig.Builder()
        .host("dta-wir-api-dev.weltcorp.com")
        .auth("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMCIsImlhdCI6MTYzNzIwNTI5MiwiZXhwIjoyMjY4MzU3MjkyLCJkaSI6MSwicGkiOjUsImFpIjoxMCwiYXQiOjEsInR5cGUiOiJhY2Nlc3MifQ.O-qV9ad7EwWqCHhuRn8C6mteNIGCLZnY-JW5iVEqujs")
        .userId(1)
        .build()

    val questionnaireDataSource = QuestionnaireDataSourceGrpcImpl(config)

    val seoulTimeZone = ZoneId.of("Asia/Seoul")
    val currentDateTime = LocalDateTime.now(seoulTimeZone)
    val zonedDateTime = ZonedDateTime.of(currentDateTime, seoulTimeZone)
    val unixTimestampSeconds = zonedDateTime.toEpochSecond()

    val answer = ISIAnswer.Builder()
        .answer1(SeverityLevelPast.NO_PROBLEM)
        .answer2(SeverityLevelPast.SEVERE)
        .answer3(SeverityLevelPast.VERY_SEVERE)
        .answer4(SatisfactionLevel.SOMEWHAT_DISSATISFIED)
        .answer5(SatisfactionLevel.VERY_DISSATISFIED)
        .answer6(VisibilityLevel.CONSIDERABLE_VISIBLE)
        .answer7(SeverityLevelPresent.NONE)
        .build()

    questionnaireDataSource.createISIAnswer(unixTimestampSeconds.toInt(), answer)
}