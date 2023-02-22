package diary

import com.weltcorp.dta.wed.lib.diary.DiaryApiConfig
import com.weltcorp.dta.wed.lib.diary.datasource.DiaryRemoteDataSourceGrpcImpl

suspend fun main(args: Array<String>) {

    val config = DiaryApiConfig.Builder()
        .host("localhost")
        .port(23100)
//        .auth("<YOUR-TOKEN>")
        .auth("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiI2OSIsImlhdCI6MTY2MTkyMDk4MCwiZXhwIjoyMjY4MjkxNDUzLCJkaSI6MSwiYWkiOjY5LCJhdCI6MSwidHlwZSI6ImFjY2VzcyJ9.38Jd29IpMGHeCmLmp191ymgaD2wlwcpEGi__GFtr3Yw")
        .build()

    val diaryRemoteDataSource = DiaryRemoteDataSourceGrpcImpl(config)

    val userId = 1
    val startDate = 1675177200
    val endDate = 1677035497
    diaryRemoteDataSource.getDiaries(userId, startDate, endDate)
        .blockingSubscribe {
            println(it)
        }
}
