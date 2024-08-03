plugins {
    java
    `java-library`
}

group = "it.futurecraft.sorrentino"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
    maven("https://api.modrinth.com/maven")
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    // https://mvnrepository.com/artifact/org.jetbrains/annotations
    compileOnly("org.jetbrains:annotations:24.1.0")

    implementation("net.kyori:adventure-api:4.17.0")
    compileOnly("io.papermc.paper:paper-api:1.21-R0.1-SNAPSHOT")

    // TESTS
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21

    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }

    withSourcesJar()
}