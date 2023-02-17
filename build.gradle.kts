
plugins {
    kotlin("jvm") version "1.8.0"
    application
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
