package questionnaire

import com.weltcorp.dta.wed.lib.questionnaire.QuestionnaireApiConfig
import com.weltcorp.dta.wed.lib.questionnaire.datasource.QuestionnaireRemoteDataSourceGrpcImpl

suspend fun main(args: Array<String>) {

    val config = QuestionnaireApiConfig.Builder()
        .host("localhost")
        .port(23100)
        .auth("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiI1NyIsImlhdCI6MTY2MTkyMDk4MCwiZXhwIjoyMjY4MjkxNDUzLCJkaSI6MSwiYWkiOjU3LCJhdCI6MSwidHlwZSI6ImFjY2VzcyJ9.gTzincpiq85yZdTta1vQtVRA4pDheXDsXZuO5_iQEL0")
        .build()

    val diaryRemoteDataSource = QuestionnaireRemoteDataSourceGrpcImpl(config)

    val a = diaryRemoteDataSource.getQuestionnaire()
    println(a)
}