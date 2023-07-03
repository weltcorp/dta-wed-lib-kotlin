package com.weltcorp.dta.wir.lib.v1.datasource

import com.weltcorp.dta.wir.lib.v1.ApiConfig
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.QuestionnaireId
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.gad7.GAD7Answer
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.isi.ISIAnswer
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.phq9.PHQ9Answer
import com.weltcorp.dta.wir.lib.v1.model.questionnaire.wiq.WIQAnswer
import dta.wir.api.v1.questionnaires.QuestionnairesDataGrpcKt
import dta.wir.api.v1.questionnaires.createQuestionnaireRequest
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder
import io.grpc.Metadata
import io.grpc.StatusRuntimeException

class QuestionnaireDataSourceGrpcImpl(private val config: ApiConfig): QuestionnaireDataSource {

    private var _channel = getMangedChannel()
    private var _stub = QuestionnairesDataGrpcKt.QuestionnairesDataCoroutineStub(getChannel())

    private fun getHeader(): Metadata {
        return Metadata().apply {
            put(Metadata.Key.of("x-request-dtx-src-account-type", Metadata.ASCII_STRING_MARSHALLER), "0")
            put(Metadata.Key.of("x-request-dtx-src-domain-id", Metadata.ASCII_STRING_MARSHALLER), "100")
            put(Metadata.Key.of("x-request-dtx-src-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wir-app-android")
            put(Metadata.Key.of("x-request-dtx-dst-protocol", Metadata.ASCII_STRING_MARSHALLER), "grpc")
            put(Metadata.Key.of("x-request-dtx-dst-service-name", Metadata.ASCII_STRING_MARSHALLER), "dta-wir-api")
            put(Metadata.Key.of("x-request-dtx-dst-service-version", Metadata.ASCII_STRING_MARSHALLER), "com/weltcorp/dta/wir/lib/v1")
            put(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER), "Bearer " + config.auth)
        }
    }

    private fun getChannel(): ManagedChannel {
        if (_channel.isShutdown || _channel.isTerminated) {
            _channel = getMangedChannel()
        }
        return _channel
    }

    private fun getMangedChannel(): ManagedChannel {
        val channel = ManagedChannelBuilder
            .forTarget("${config.host}${if (config.port != null) ":${config.port}" else ""}")
        if (config.port != null) {
            channel.usePlaintext()
        }
        return channel.build()
    }

    private fun stub(): QuestionnairesDataGrpcKt.QuestionnairesDataCoroutineStub{
        if (_stub == null) {
            _stub = QuestionnairesDataGrpcKt.QuestionnairesDataCoroutineStub(getChannel())
        }
        return _stub
    }

    override suspend fun createISIAnswer(dateTime: Int, answer: ISIAnswer) {
        val _request = createQuestionnaireRequest{
            userId = config.userId
            questionnaireId = QuestionnaireId.ISI.value
            date = dateTime.toLong()
        }
        val header = getHeader().apply {
//            put(Metadata.Key.of("x-request-dtx-user-id", Metadata.ASCII_STRING_MARSHALLER), "${userId}}")
        }

        val answers = answer.toList()
        val request = _request.toBuilder().addAllAnswers(answers).build()

        try {
            val resp = stub().createQuestionnaire(request, header)
            println(resp)
        } catch (e: StatusRuntimeException) {
            println(e)
        }
    }

    override suspend fun createPHQ9Answer(dateTime: Int, answer: PHQ9Answer) {
        val _request = createQuestionnaireRequest {
            userId = config.userId
            questionnaireId = QuestionnaireId.PHQ9.value
            date = dateTime.toLong()
        }
        val header = getHeader().apply {
//            put(Metadata.Key.of("x-request-dtx-user-id", Metadata.ASCII_STRING_MARSHALLER), "${userId}}")
        }

        val answers = answer.toList()
        val request = _request.toBuilder().addAllAnswers(answers).build()

        try {
            val resp = stub().createQuestionnaire(request, header)
            println(resp)
        } catch (e: StatusRuntimeException) {
            println(e)
        }
    }

    override suspend fun createGAD7Answer(dateTime: Int, answer: GAD7Answer) {
        val _request = createQuestionnaireRequest {
            userId = config.userId
            questionnaireId = QuestionnaireId.PHQ9.value
            date = dateTime.toLong()
        }
        val header = getHeader().apply {
//            put(Metadata.Key.of("x-request-dtx-user-id", Metadata.ASCII_STRING_MARSHALLER), "${userId}}")
        }

        val answers = answer.toList()
        val request = _request.toBuilder().addAllAnswers(answers).build()

        try {
            val resp = stub().createQuestionnaire(request, header)
            println(resp)
        } catch (e: StatusRuntimeException) {
            println(e)
        }
    }

    override suspend fun createWIQAnswer(dateTime: Int, answer: WIQAnswer) {
        val _request = createQuestionnaireRequest {
            userId = config.userId
            questionnaireId = QuestionnaireId.WIQ.value
            date = dateTime.toLong()
        }
        val header = getHeader().apply {
//            put(Metadata.Key.of("x-request-dtx-user-id", Metadata.ASCII_STRING_MARSHALLER), "${userId}}")
        }

        val answers = answer.toList()
        val request = _request.toBuilder().addAllAnswers(answers).build()

        try {
            val resp = stub().createQuestionnaire(request, header)
            println(resp)
        } catch (e: StatusRuntimeException) {
            println(e)
        }
    }
}