package diary

import com.weltcorp.dta.wed.lib.diary.DiaryApiConfig
import com.weltcorp.dta.wed.lib.diary.datasource.DiaryRemoteDataSourceGrpcImpl

suspend fun main(args: Array<String>) {

    val config = DiaryApiConfig.Builder()
        .host("localhost")
        .port(23100)
//        .auth("<YOUR-TOKEN>")
        .auth("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiI2NiIsImlhdCI6MTY2MTkyMDk4MCwiZXhwIjoxNzA0MDM0Nzk5LCJkaSI6MSwicGkiOjcsImFpIjo2NiwiYXQiOjAsInR5cGUiOiJhY2Nlc3MifQ.800xibRKahi4z4LiUr2H3YW6-ywJuXhS8YnGQW8QTvc")
        .userId(1)
        .build()

    val diaryRemoteDataSource = DiaryRemoteDataSourceGrpcImpl(config)

//    val startDate = 1675177200
    val startDate = 1678283875
    val endDate = 1678398502
    val diaries = diaryRemoteDataSource.getDiaries(startDate, endDate)
    println(diaries)
}
