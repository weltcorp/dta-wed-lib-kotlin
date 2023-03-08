package diary

import com.weltcorp.dta.wed.lib.diary.DiaryApiConfig
import com.weltcorp.dta.wed.lib.diary.datasource.DiaryRemoteDataSourceGrpcImpl

suspend fun main(args: Array<String>) {

    val config = DiaryApiConfig.Builder()
        .host("localhost")
        .port(23100)
        .auth("<YOUR-TOKEN>")
        .userId(17938)
        .build()

    val diaryRemoteDataSource = DiaryRemoteDataSourceGrpcImpl(config)

    val startDate = 1675177200
    val endDate = 1677035497
    diaryRemoteDataSource.getDiaries(startDate, endDate)
        .blockingSubscribe {
            println(it)
        }
}
