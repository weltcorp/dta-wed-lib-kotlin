package unittest

import com.weltcorp.dta.wir.lib.v1.ApiConfig
import com.weltcorp.dta.wir.lib.v1.datasource.QuestionnaireDataSourceGrpcImpl
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.FeelingLevel
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.gad7.GAD7Answer
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

    val answer = GAD7Answer.Builder()
        .answer1(FeelingLevel.ALMOST_EVERYDAY)
        .answer2(FeelingLevel.NONE)
        .answer3(FeelingLevel.FEW_DAYS)
        .answer4(FeelingLevel.MORE_THAN_HALF)
        .answer5(FeelingLevel.NONE)
        .answer6(FeelingLevel.FEW_DAYS)
        .answer7(FeelingLevel.ALMOST_EVERYDAY)
        .build()

    questionnaireDataSource.createGAD7Answer(unixTimestampSeconds.toInt(), answer)
}