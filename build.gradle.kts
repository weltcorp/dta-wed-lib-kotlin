plugins {
    kotlin("jvm") version "1.8.0"
    application
    `maven-publish`
}

allprojects {
    group = "com.weltcorp.dta.wed.lib"
    version = "0.1.10"

    repositories {
        mavenCentral()
    }
}

val rxjavaVersion = "3.0.11"

dependencies {
    implementation(project(mapOf("path" to ":diary")))
    implementation("io.reactivex.rxjava3:rxjava:$rxjavaVersion")
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
