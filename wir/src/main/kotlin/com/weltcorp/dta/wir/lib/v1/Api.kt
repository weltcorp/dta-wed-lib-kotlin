package com.weltcorp.dta.wir.lib.v1

class ApiConfig private constructor (
    var host: String? = null,
    var port: Int? = null,
    var auth: String,
    var userId: Int = 0
) {

    data class Builder(
        var host: String = "localhost",
        var port: Int? = null,
        var auth: String = "",
        var userId: Int = 0
    ) {
        fun host(host: String) = apply { this.host = host }
        fun port(port: Int?) = apply { this.port = port }
        fun auth(auth: String) = apply { this.auth = auth }
        fun userId(userId: Int) = apply { this.userId = userId }
        fun build() = ApiConfig(host, port, auth, userId)
    }
}