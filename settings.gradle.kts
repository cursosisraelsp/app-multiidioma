pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        // Para AAR locales
        flatDir {
            dirs("unityLibrary/libs")
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // Para AAR locales
        flatDir {
            dirs("unityLibrary/libs")
        }
    }
}

rootProject.name = "multiidioma"
include(":app")

include(":unityLibrary")
include(":unityLibrary:xrmanifest.androidlib")

// Apuntar correctamente a las carpetas si no están en la raíz
project(":unityLibrary").projectDir = File(rootDir, "unityLibrary")
project(":unityLibrary:xrmanifest.androidlib").projectDir = File(rootDir, "unityLibrary/xrmanifest.androidlib")