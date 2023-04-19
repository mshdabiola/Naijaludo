pluginManagement {
    repositories {
        includeBuild("build-logic")
        google()
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
rootProject.name = "Naija_Ludo"
include(":app")
include(":core:naijaludo")
include(":benchmark")
include(":feature:mainScreen")
include(":feature:gamescreen")
include(":core:database")
include(":core:designsystem")
include(":core:datastore")
include(":core:common")
include(":core:worker")
