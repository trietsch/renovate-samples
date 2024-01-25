// Example minimal build.gradle.kts file for a Kotlin project with a single dependency and a single plugin

plugins {
    id("org.springframework.boot") version "2.4.0" // latest 3.2.2 on 2024-01-25
}

dependencies {
    implementation("org.apache.kafka:kafka_2.13:3.6.0") // latest 3.6.1 on 2024-01-25
}
