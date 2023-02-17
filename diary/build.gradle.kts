import com.google.protobuf.gradle.*

plugins {
    kotlin("jvm")
    id("java")
    id("com.google.protobuf") version "0.8.13"
    `maven-publish`
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

val grpcVersion = "3.19.4"
val grpcKotlinVersion = "1.2.1"
val grpcProtoVersion = "1.44.1"

dependencies{
    implementation("io.grpc:grpc-core:$grpcProtoVersion")
    implementation("io.grpc:grpc-okhttp:$grpcProtoVersion")
    implementation("io.grpc:grpc-stub:$grpcProtoVersion")
    implementation("io.grpc:grpc-kotlin-stub:$grpcKotlinVersion")
    implementation("io.grpc:grpc-protobuf:$grpcProtoVersion")
    implementation("com.google.protobuf:protobuf-kotlin:$grpcVersion")
    implementation("com.google.protobuf:protobuf-java:$grpcVersion")
}

sourceSets{
    getByName("main"){
        java {
            srcDirs(
                "build/generated/source/proto/main/grpc",
                "build/generated/source/proto/main/grpckt",
                "build/generated/source/proto/main/java",
                "build/generated/source/proto/main/kotlin"
            )
        }
    }
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:$grpcVersion"
    }
    plugins {
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:$grpcProtoVersion"
        }
        id("grpckt") {
            artifact = "io.grpc:protoc-gen-grpc-kotlin:$grpcKotlinVersion:jdk7@jar"
        }
    }
    generateProtoTasks {
        all().forEach {
            it.plugins {
                id("grpc")
                id("grpckt")
            }
            it.builtins {
                id("kotlin")
            }
        }
    }
}

publishing {
    publications {
//        mavenJava(MavenPublication) {
//            from components.java
//
//            groupId = 'com.github.WonJoong'
//            artifactId = 'kodi'
//            version = '0.2.1'
//        }
        create<MavenPublication>("maven") {
            groupId = "com.github.weltcorp"
            artifactId = "dta-wed-lib-kotlin"
            version = "0.1.8"

            from(components["java"])
        }
    }
}