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
        .build()

    val diaryRemoteDataSource = DiaryRemoteDataSourceGrpcImpl(config)

    val diaryMeta = DiaryMeta.Builder()
        .userId(1)
        .date(1675177200)
        .build()

    val diaryData = DiaryData.Builder()
        .type(DiaryType.TYPE_1)
        .time("08:15")
        .who(Who.ALONE)
        .isSkip(false)
        .build()

    diaryRemoteDataSource.createDiary(diaryMeta, diaryData)
}