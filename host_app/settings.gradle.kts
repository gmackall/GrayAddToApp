pluginManagement {
    repositories {
//        maven {
//
//        }
//        maven {
//            url = uri("/Users/mackall/development/BugTesting/flutter_module/build/host/outputs/repo")
//            val storageUrl : String = System.getenv()["FLUTTER_STORAGE_BASE_URL"] ?: "https://storage.googleapis.com"
//            url = uri("$storageUrl/download.flutter.io")
//        }
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositories {
        maven(url = "https://storage.googleapis.com/download.flutter.io")
        maven(url = "/Users/mackall/development/BugTesting/GrayAddToApp/my_module/build/host/outputs/repo")
    }
    // repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "My Application"
include(":app")
