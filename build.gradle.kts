plugins {
    kotlin("jvm") version "1.8.0"
    application
    `maven-publish`
}

allprojects {
    group = "com.weltcorp.dta.wed.lib"
    version = "0.5.3"

    repositories {
        mavenCentral()
    }
}

val rxjavaVersion = "3.0.11"
val grpcVersion = "3.19.4"

dependencies {
    implementation(project(":core"))
    implementation(project(":diary"))
    implementation(project(":questionnaire"))
    implementation("io.reactivex.rxjava3:rxjava:$rxjavaVersion")
    implementation("com.google.protobuf:protobuf-kotlin:$grpcVersion")
    implementation("com.google.protobuf:protobuf-java:$grpcVersion")
}

subprojects {
    apply(plugin = "kotlin")
    apply(plugin = "application")
    apply(plugin = "maven-publish")

    tasks.test {
        useJUnitPlatform()
    }

    dependencies {
        testImplementation(kotlin("test"))
    }
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}
//
//publishing {
//    publications {
////        mavenJava(MavenPublication) {
////            from components.java
////
////            groupId = 'com.github.WonJoong'
////            artifactId = 'kodi'
////            version = '0.2.1'
////        }
//        create<MavenPublication>("maven") {
//            groupId = "com.github.weltcorp"
//            artifactId = "dta-wed-lib-kotlin"
//            version = "0.1.6"
//
//            from(components["java"])
//        }
//    }
//}
