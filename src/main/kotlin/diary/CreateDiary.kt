package diary

import com.weltcorp.dta.wed.lib.diary.DiaryApiConfig
import com.weltcorp.dta.wed.lib.diary.datasource.DiaryRemoteDataSourceGrpcImpl
import com.weltcorp.dta.wed.lib.diary.domain.model.DiaryData
import com.weltcorp.dta.wed.lib.diary.domain.model.DiaryMeta
import com.weltcorp.dta.wed.lib.diary.domain.model.DiaryType
import com.weltcorp.dta.wed.lib.diary.domain.model.Who

suspend fun main(args: Array<String>) {

    val config = DiaryApiConfig.Builder()
        .host("localhost")
        .port(23100)
        .auth("<YOUR-TOKEN>")
        .build()

    val diaryRemoteDataSource = DiaryRemoteDataSourceGrpcImpl(config)

    val diaryMeta = DiaryMeta.Builder()
        .date(1677037112) // Wed Feb 01 2023 00:00:00 GMT+0900 (한국 표준시)
        .build()

    val whoList = arrayListOf<Who>()
    whoList.add(Who.ALONE)
    val diaryData = DiaryData.Builder()
        .type(DiaryType.TYPE_1)
        .time("08:15")
        .whoList(whoList)
        .isSkip(false)
        .build()

    val userId = 1

    diaryRemoteDataSource.createDiary(userId, diaryMeta, diaryData)
}