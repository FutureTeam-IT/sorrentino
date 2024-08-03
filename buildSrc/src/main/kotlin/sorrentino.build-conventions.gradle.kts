import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id("sorrentino.common-conventions")
    id("com.github.johnrengelman.shadow")
}

dependencies {
    implementation(project(":common"))
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.named<Jar>("jar") {

}

tasks.named<ShadowJar>("shadowJar") {
    archiveClassifier.set("")

    relocations()
    excludes()
}

fun ShadowJar.relocations() {}

fun ShadowJar.excludes() {}

tasks.named("build") {
    dependsOn("shadowJar")
}