/*
 *abiola 2022
 */

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("mshdabiola.android.feature")
}

android {
    namespace = "com.mshdabiola.main"
}
kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(compose.components.resources)

            }
        }
        androidMain.dependencies {
           // implementation(libs.androidx.constraintlayout)
            implementation(projects.naijaludo)
        }


    }
}
