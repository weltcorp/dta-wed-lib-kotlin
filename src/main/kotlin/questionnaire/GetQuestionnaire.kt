package questionnaire

import com.weltcorp.dta.wed.lib.questionnaire.QuestionnaireApiConfig
import com.weltcorp.dta.wed.lib.questionnaire.datasource.QuestionnaireRemoteDataSourceGrpcImpl

suspend fun main(args: Array<String>) {

    val config = QuestionnaireApiConfig.Builder()
        .host("localhost")
        .port(23100)
        .auth("YOUR_AUTH_TOKEN")
        .build()

    val diaryRemoteDataSource = QuestionnaireRemoteDataSourceGrpcImpl(config)

    val a = diaryRemoteDataSource.getQuestionnaire()
    println(a)
}