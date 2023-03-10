package diary

import com.weltcorp.dta.wed.lib.diary.DiaryApiConfig
import com.weltcorp.dta.wed.lib.diary.datasource.DiaryRemoteDataSourceGrpcImpl
import com.weltcorp.dta.wed.lib.diary.domain.model.*

suspend fun main(args: Array<String>) {

    val config = DiaryApiConfig.Builder()
        .host("localhost")
        .port(23100)
        .auth("<YOUR-TOKEN>")
        .userId(1)
        .build()

    val diaryRemoteDataSource = DiaryRemoteDataSourceGrpcImpl(config)

//    val diaryMeta = DiaryMeta.Builder()
//        .date() // Wed Feb 01 2023 00:00:00 GMT+0900 (한국 표준시)
//        .build()

    val whoList = arrayListOf<Who>()
    whoList.add(Who.FRIEND)
    whoList.add(Who.LOVER)

    val uris = arrayListOf<String>()
    uris.add("gs://user_file/17770/12/sample_image_file_01.png_1678187399")
    uris.add("gs://user_file/17770/12/sample_image_file_02.png_1678187399")

    val food = DiaryFood.Builder()
        .text("밥")
        .uris(uris)
        .build()


    // Case 1: text is not null
    val event = DiaryFeelingEvent.Builder()
        .event(FeelingEvent.FE_6)
        .text("xxxxxxxxxxxx")
        .build()

    // Case 2: text is null
//    val event = DiaryFeelingEvent.Builder()
//        .event(FeelingEvent.FE_1)
//        .build()

    val feeling = DiaryFeeling.Builder()
        .score(5)
        .event(event)
        .build()

    val significants = arrayListOf<Significant>()
    significants.add(Significant.S_2)
    significants.add(Significant.S_5)

    val diaryData = DiaryData.Builder()
        .id(985)
        .time("08:35")
//        .whoList(whoList)
//        .where(Where.TABLE)
//        .food(food)
//        .beforeHungryScore(3)
//        .afterHungryScore(4)
//        .feeling(feeling)
//        .significants(significants)
//        .isSkip(false)
        .build()

    diaryRemoteDataSource.updateDiary(diaryData)
}