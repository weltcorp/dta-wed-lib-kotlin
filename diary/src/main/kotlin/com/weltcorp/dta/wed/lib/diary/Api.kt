package com.weltcorp.dta.wed.lib.diary

class DiaryApiConfig private constructor (
    var host: String? = null,
    var port: Int = 9090
) {

    data class Builder(
        var host: String = "localhost",
        var port: Int = 9090
    ) {
        fun host(host: String) = apply { this.host = host }
        fun port(port: Int) = apply { this.port = port }
        fun build() = DiaryApiConfig(host, port)
    }
}