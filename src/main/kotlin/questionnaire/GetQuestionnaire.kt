package questionnaire

import com.weltcorp.dta.wed.lib.questionnaire.QuestionnaireApiConfig
import com.weltcorp.dta.wed.lib.questionnaire.datasource.QuestionnaireRemoteDataSourceGrpcImpl

suspend fun main(args: Array<String>) {

    val config = QuestionnaireApiConfig.Builder()
//        .host("localhost")
//        .port(23100)
//        .auth("<YOUR-TOKEN>")
        .host("dta-wed-api-prod.weltcorp.com")
        .auth("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMCIsImlhdCI6MTYzNzIwNTI5MiwiZXhwIjoyMjY4MzU3MjkyLCJkaSI6MSwicGkiOjUsImFpIjoxMCwiYXQiOjEsInR5cGUiOiJhY2Nlc3MifQ.O-qV9ad7EwWqCHhuRn8C6mteNIGCLZnY-JW5iVEqujs")
        .userId(17520)
        .build()

    val diaryRemoteDataSource = QuestionnaireRemoteDataSourceGrpcImpl(config)

    val a = diaryRemoteDataSource.getQuestionnaire()
    println(a)
}