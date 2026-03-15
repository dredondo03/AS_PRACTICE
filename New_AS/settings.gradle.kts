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
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

<<<<<<< HEAD
rootProject.name = "New_AS"
include(":app")
=======
<<<<<<< HEAD
rootProject.name = "Adelanto"
=======
rootProject.name = "Scaffold"
>>>>>>> dee74de67e220b54985649c0c4199e4e159bdcb9
include(":app")
 
>>>>>>> 0dfa9243487714fa4e63038c52beaaa388f1068b
