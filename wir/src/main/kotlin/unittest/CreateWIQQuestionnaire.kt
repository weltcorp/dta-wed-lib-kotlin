package unittest

import com.weltcorp.dta.wir.lib.v1.ApiConfig
import com.weltcorp.dta.wir.lib.v1.datasource.QuestionnaireDataSourceGrpcImpl
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.MedicationUsage
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.OverallStatus
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.wiq.WIQAnswer
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

    val answer = WIQAnswer.Builder()
        .answer1(120)
        .answer2(50)
        .answer3(MedicationUsage.AS_NEEDED)
        .answer4(OverallStatus.BAD)
        .build()

    questionnaireDataSource.createWIQAnswer(unixTimestampSeconds.toInt(), answer)
}