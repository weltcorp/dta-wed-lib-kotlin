package org.example

import dta.wed.api.v2.diaries.DiariesDataGrpcKt
import dta.wed.api.v2.diaries.createDiaryRequest
import io.grpc.ManagedChannelBuilder
import io.grpc.Metadata

class Hello {
    suspend fun hello() {
        print("hello")
        val port = 23100


    val channel = ManagedChannelBuilder.forAddress("localhost", port).usePlaintext().build()

    val stub: DiariesDataGrpcKt.DiariesDataCoroutineStub = DiariesDataGrpcKt.DiariesDataCoroutineStub(channel)
    val request = createDiaryRequest {
        this.userId = 1
    }
    val header = Metadata()
    val key1 = "x-request-dtx-src-service-name"
    val key2 = "x-request-dtx-dst-service-name"


    val src = Metadata.Key.of(key1, Metadata.ASCII_STRING_MARSHALLER)
    header.put(src, "dta-wed-lib-kotlin")
    val dst = Metadata.Key.of(key2, Metadata.ASCII_STRING_MARSHALLER)
    header.put(dst, "dta-wed-api")
    header.put(Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER), "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiI2OSIsImlhdCI6MTY2MTkyMDk4MCwiZXhwIjoyMjY4MjkxNDUzLCJkaSI6MSwiYWkiOjY5LCJhdCI6MSwidHlwZSI6ImFjY2VzcyJ9.38Jd29IpMGHeCmLmp191ymgaD2wlwcpEGi__GFtr3Yw")
//    stub.withInterceptors(MetadataUtils.newAttachHeadersInterceptor(header))
    val response = stub.createDiary(request, header)
    println(response)
    }
}