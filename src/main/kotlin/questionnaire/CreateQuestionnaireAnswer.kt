package questionnaire

import com.weltcorp.dta.wed.lib.questionnaire.QuestionnaireApiConfig
import com.weltcorp.dta.wed.lib.questionnaire.datasource.QuestionnaireRemoteDataSourceGrpcImpl
import com.weltcorp.dta.wed.lib.questionnaire.domain.model.QuestionnaireAnswer

suspend fun main(args: Array<String>) {

    val config = QuestionnaireApiConfig.Builder()
        .host("localhost")
        .port(23100)
        .auth("<YOUR-TOKEN>")
        .build()

    val diaryRemoteDataSource = QuestionnaireRemoteDataSourceGrpcImpl(config)

    val answer = QuestionnaireAnswer.Builder()
        .date(1677037112) // Wed Feb 01 2023 00:00:00 GMT+0900 (한국 표준시)
        .bodyWhere(0) //가슴
        .bodyFeel(0)
        .feelType(7)
        .conclusion(0)
        .fear(0)
        .sentence(3)
        .message("sdkljfskdljkljfkljs")
        .build()


    val userId = 1

    diaryRemoteDataSource.createQuestionnaire(userId, answer)
}