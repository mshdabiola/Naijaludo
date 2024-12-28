import org.jetbrains.compose.ExperimentalComposeLibrary

/*
 *abiola 2024
 */
@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("mshdabiola.android.library")
    id("mshdabiola.android.library.compose")

//    id("mshdabiola.android.library.jacoco")
}

android {
    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    namespace = "com.mshdabiola.ui"

}

dependencies {
  androidTestImplementation(projects.modules.testing)

}

kotlin {
    sourceSets {

        val commonMain by getting {
            dependencies {
                implementation(project(":modules:analytics"))
                implementation(project(":modules:designsystem"))
                implementation(project(":modules:model"))



                api(compose.components.resources)


            }
        }
    }
}