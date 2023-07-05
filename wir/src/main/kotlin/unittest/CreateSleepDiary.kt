package unittest

import com.weltcorp.dta.wir.lib.v1.ApiConfig
import com.weltcorp.dta.wir.lib.v1.datasource.SleepDiaryDataSourceGrpcImpl
import com.weltcorp.dta.wir.lib.v1.model.diary.*
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZonedDateTime

suspend fun main(args: Array<String>) {

    val config = ApiConfig.Builder()
//        .host("dta-wir-api-dev.weltcorp.com")
        .host("localhost")
        .port(31100)
        .auth("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMCIsImlhdCI6MTYzNzIwNTI5MiwiZXhwIjoyMjY4MzU3MjkyLCJkaSI6MSwicGkiOjUsImFpIjoxMCwiYXQiOjEsInR5cGUiOiJhY2Nlc3MifQ.O-qV9ad7EwWqCHhuRn8C6mteNIGCLZnY-JW5iVEqujs")
        .userId(17927)
        .build()

    val sleepDiaryDataSource = SleepDiaryDataSourceGrpcImpl(config)

    val seoulTimeZone = ZoneId.of("Asia/Seoul")
    val currentDateTime = LocalDateTime.now(seoulTimeZone)
    val zonedDateTime = ZonedDateTime.of(currentDateTime, seoulTimeZone)
    val unixTimestampSeconds = zonedDateTime.toEpochSecond()

    val answer = SleepDiaryAnswer.Builder()
        .lot(LocalDateTime.now(seoulTimeZone))
        .ast(LocalDateTime.now(seoulTimeZone))
        .aet(LocalDateTime.now(seoulTimeZone))
        .waso(30)
        .tst(350)
        .problems(
            listOf(
                SleepProblem.FREQUENTLY_WOKE_UP,
                SleepProblem.TOOK_TOO_LONG_TO_FALL_ASLEEP
            )
        )
        .lifestyles(listOf(SleepLifestyle.ALCOHOL_CONSUMPTION))
        .pill(SleepPill.YES)
        .nap(NapDuration.FIFTEEN_MINUTES)
        .star(StarLevel.LEVEL_1)
        .build()

    sleepDiaryDataSource.createAnswer(unixTimestampSeconds.toInt(), answer)
}