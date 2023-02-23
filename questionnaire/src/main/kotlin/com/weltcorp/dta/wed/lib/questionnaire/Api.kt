package com.weltcorp.dta.wed.lib.questionnaire

class QuestionnaireApiConfig private constructor (
    var host: String? = null,
    var port: Int = 9090,
    var auth: String
) {

    data class Builder(
        var host: String = "localhost",
        var port: Int = 9090,
        var auth: String = ""
    ) {
        fun host(host: String) = apply { this.host = host }
        fun port(port: Int) = apply { this.port = port }
        fun auth(auth: String) = apply { this.auth = auth }
        fun build() = QuestionnaireApiConfig(host, port, auth)
    }
}