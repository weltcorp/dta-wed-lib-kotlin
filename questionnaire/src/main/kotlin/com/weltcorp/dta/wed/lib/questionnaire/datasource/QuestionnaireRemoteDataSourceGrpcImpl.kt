package com.weltcorp.dta.wed.lib.questionnaire.datasource

import com.weltcorp.dta.wed.lib.questionnaire.QuestionnaireApiConfig
import com.weltcorp.dta.wed.lib.questionnaire.domain.model.*
import com.weltcorp.dta.wed.lib.questionnaire.domain.model.questionnaire.Questionnaire
import dta.wed.api.v2.questionnaires.*
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import io.grpc.Metadata
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single

class QuestionnaireRemoteDataSourceGrpcImpl(
    val config: QuestionnaireApiConfig
) : RemoteDataSource {

    var _channel = ManagedChannelBuilder
        .forAddress(config.host, config.port)
        .usePlaintext()
        .build()

    var _stub = QuestionnairesDataGrpcKt.QuestionnairesDataCoroutineStub(getChannel())
    fun getChannel(): ManagedChannel {
        if (_channel.isShutdown || _channel.isTerminated) {
            _channel = ManagedChannelBuilder
                .forAddress(config.host, config.port)
                .usePlaintext()
                .build()
        }
        return _channel
    }

    fun stub(): QuestionnairesDataGrpcKt.QuestionnairesDataCoroutineStub {
        if (_stub == null) {
            _stub = QuestionnairesDataGrpcKt.QuestionnairesDataCoroutineStub(getChannel())
        }
        return _stub
    }

    override suspend fun createQuestionnaire(userId: Int, data: QuestionnaireAnswer): Completable {

        val questionnaireData = questionnaireAnswerData {
            this.date = data.date
            this.bodyWhere = data.bodyWhere
            this.bodyFeel = data.bodyFeel
            this.feelType = data.feelType
            this.conclusion = data.conclusion
            this.fear = data.fear
            this.sentence = data.sentence
            this.message = data.message.toString()
        }

        val request = createQuestionnaireAnswerRequest {
            this.userId = userId.toLong()
            this.data = questionnaireData
        }
        val header = Metadata()
        header.put(Metadata.Key.of("x-request-dtx-src-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wed-lib-kotlin")
        header.put(Metadata.Key.of("x-request-dtx-dst-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wed-api")
        header.put(Metadata.Key.of("x-request-dtx-protocol", Metadata.ASCII_STRING_MARSHALLER), "GRPC")
        header.put(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER), "Bearer " + config.auth)
        stub().createQuestionnaireAnswer(request, header)
        return Completable.complete()
    }

    override suspend fun getQuestionnaire(): Single<Questionnaire> {
        val request = getQuestionnaireRequest{
            this.questionnaireId = 1
        }
        val header = Metadata()
        header.put(Metadata.Key.of("x-request-dtx-src-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wed-lib-kotlin")
        header.put(Metadata.Key.of("x-request-dtx-dst-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wed-api")
        header.put(Metadata.Key.of("x-request-dtx-protocol", Metadata.ASCII_STRING_MARSHALLER), "GRPC")
        header.put(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER), "Bearer " + config.auth)
        val resp = stub().getQuestionnaire(request, header)

        val questionnaire = Questionnaire(

        )

        return Single.just(questionnaire)
    }

    override suspend fun getQuestionnaireAnswers(userId: Int): Single<Questionnaire> {
        val request = getQuestionnaireAnswersRequest {
            this.userId = userId
        }
        val header = Metadata()
        header.put(Metadata.Key.of("x-request-dtx-src-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wed-lib-kotlin")
        header.put(Metadata.Key.of("x-request-dtx-dst-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wed-api")
        header.put(Metadata.Key.of("x-request-dtx-protocol", Metadata.ASCII_STRING_MARSHALLER), "GRPC")
        header.put(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER), "Bearer " + config.auth)
        val resp = stub().getQuestionnaireAnswers(request, header)

        val questionnaire = Questionnaire()

        return Single.just(questionnaire)
    }

}
