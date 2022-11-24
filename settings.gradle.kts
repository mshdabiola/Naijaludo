pluginManagement {
    repositories {
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
rootProject.name = "Naija Ludo"
include (":app")
include (":naijaludo")
include (":benchmark")
include (":model")
include (":mainScreen")
include (":gameScreen")
include (":database")
include (":designsystem")
include(":datastore")
include(":soundsystem")
