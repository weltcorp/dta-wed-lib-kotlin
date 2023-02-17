plugins {
    kotlin("jvm") version "1.8.0"
    application
    `maven-publish`
}

allprojects {
    group = "com.weltcorp.dta.wed.lib"
    version = "0.1.4"

    repositories {
        mavenCentral()
    }
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

//publishing {
//    publications {
////        mavenJava(MavenPublication) {
////            from components.java
////
////            groupId = 'com.github.WonJoong'
////            artifactId = 'kodi'
////            version = '0.2.1'
////        }
//        maven(MavenPublication) {
//            groupId = "com.weltcorp.dta.wed.lib"
//            artifactId = "lib"
//            version = "1.1"
//
//            from(components["java"])
//        }
//    }
//}

//publishing {
////    repositories {
////        maven {
////            // change to point to your repo, e.g. http://my.org/repo
////            url = uri("$buildDir/repo")
////        }
////    }
//    publications {
//        register("mavenJava", MavenPublication::class) {
//            from(components["java"])
//            groupId = "com.weltcorp.dta.wed.lib"
//            artifactId = "lib"
//            version = "1.1"
//        }
//    }
//}