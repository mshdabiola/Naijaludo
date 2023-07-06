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
        maven(url = "https://www.jitpack.io")
        maven(url = "https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven(url = "https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-js-wrappers")
        maven(url = "https://maven.pkg.jetbrains.space/public/p/kotlinx-coroutines/maven")
    }
}
rootProject.name = "SkeletonApp"
include(":app")
include(":benchmark")
include(":common:database")
include(":common:designsystem")
include(":common:model")
include(":feature:mainscreen")
include(":common:network")
include(":common:data")
include(":common:domain")
include(":common:testing")
include(":common:ui")
include(":android:worker")
include(":desktop")
include(":common:setting")
include(":common:navigation")
include(":feature:detail")
