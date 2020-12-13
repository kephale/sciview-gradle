import org.gradle.kotlin.dsl.implementation
import org.gradle.kotlin.dsl.runtimeOnly
import org.gradle.kotlin.dsl.testImplementation
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "1.4.10"
    id("org.jetbrains.dokka") version "1.4.10"
    id("application")
}

group "sc.iview"
version "0.0.1-SNAPSHOT"

repositories {
    jcenter()
    mavenLocal()
    maven("https://jitpack.io")
    maven("https://maven.scijava.org/content/groups/public")
}

dependencies {
    implementation("sc.iview:sciview:c371cb5")
    implementation("graphics.scenery:scenery:a196d73")
}

application {
    mainClassName = System.getProperty("main", "sc.iview.minimal.MyDemo")
}
