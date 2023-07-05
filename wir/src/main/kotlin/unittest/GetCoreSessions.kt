package unittest

import com.weltcorp.dta.wir.lib.v1.ApiConfig
import com.weltcorp.dta.wir.lib.v1.datasource.LearningDataSourceGrpcImpl
import com.weltcorp.dta.wir.lib.v1.datasource.SleepDiaryDataSourceGrpcImpl
import com.weltcorp.dta.wir.lib.v1.model.diary.*
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZonedDateTime

suspend fun main(args: Array<String>) {

    val config = ApiConfig.Builder()
        .host("dta-wir-api-dev.weltcorp.com")
//        .host("localhost")
//        .port(31100)
        .auth("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMCIsImlhdCI6MTYzNzIwNTI5MiwiZXhwIjoyMjY4MzU3MjkyLCJkaSI6MSwicGkiOjUsImFpIjoxMCwiYXQiOjEsInR5cGUiOiJhY2Nlc3MifQ.O-qV9ad7EwWqCHhuRn8C6mteNIGCLZnY-JW5iVEqujs")
        .userId(17927)
        .build()

    val dataSource = LearningDataSourceGrpcImpl(config)


    val resp = dataSource.getCoreSessions()
    println(resp)
}