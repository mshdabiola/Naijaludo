pluginManagement {
    repositories {
        includeBuild("build-logic")
        // maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://www.jitpack.io")
    }
}
rootProject.name = "Naijaludo"
//include(":modules:database")
include(":modules:designsystem")
include(":modules:model")
include(":modules:naijaludo")
//include(":modules:network")
include(":modules:data")
//include(":modules:domain")
include(":modules:testing")
include(":modules:ui")
include(":modules:analytics")
include(":modules:datastore")

include(":benchmarks")
include(":app")

include(":features:main")
include(":features:game")
include(":features:setting")
include(":features:market")





