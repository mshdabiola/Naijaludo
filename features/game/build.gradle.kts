/*
 *abiola 2022
 */

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("mshdabiola.android.feature")
}

android {
    namespace = "com.mshdabiola.game"
}
kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(compose.components.resources)
                implementation(projects.naijaludo)

                implementation("tech.annexflow.compose:constraintlayout-compose-multiplatform:0.5.1")

            }
        }


    }
}
