import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "com.expectale"
version = "3.0.0"

plugins {
    alias(libs.plugins.kotlin)
    id("io.papermc.paperweight.userdev") version "2.0.0-beta.16"
    alias(libs.plugins.nova)
    id("org.jetbrains.dokka") version "1.9.20"
}

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://repo.xenondevs.xyz/releases")
}

dependencies {
    paperweight.paperDevBundle("1.21.4-R0.1-SNAPSHOT")
    implementation(libs.nova)
}

java {
	toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

addon {
    name = "simpleelevator"
    version = project.version.toString()
	main = "com.expectale.SimpleElevator"
	
	val outDir = project.findProperty("outDir")
    if (outDir is String)
        destination.set(File(outDir))
}

afterEvaluate {
    tasks.getByName<Jar>("jar") {
        archiveClassifier = ""
    }
}
