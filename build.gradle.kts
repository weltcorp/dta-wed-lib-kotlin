
plugins {
    kotlin("jvm") version "1.8.0"
    application
    `maven-publish`
}

group = "org.example"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(mapOf("path" to ":diary")))
    testImplementation(kotlin("test"))
}



tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
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
            groupId = "com.weltcorp.dta.wed.lib"
            artifactId = "lib"
            version = "1.1"

            from(components["java"])
        }
    }
}
