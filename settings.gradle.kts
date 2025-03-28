rootProject.name = "simpleelevator"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven("https://repo.papermc.io/repository/maven-public/")
        maven("https://repo.xenondevs.xyz/releases/")
    }
    versionCatalogs {
        create("libs") {
            from("xyz.xenondevs.nova:catalog:0.18-alpha.12")
        }
    }
}

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven("https://repo.xenondevs.xyz/releases/")
		maven("https://repo.papermc.io/repository/maven-public/")
    }
}
