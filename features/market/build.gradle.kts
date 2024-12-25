/*
 *abiola 2022
 */

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("mshdabiola.android.feature")
}

android {
    namespace = "com.mshdabiola.detail"
}
kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(compose.components.resources)
                implementation(projects.naijaludo)

                implementation("tech.annexflow.compose:constraintlayout-compose-multiplatform:0.4.0")
                /// Compose 1.7.0-alpha03
                implementation("tech.annexflow.compose:constraintlayout-compose-multiplatform:0.5.0-alpha03")
                /// Compose 1.7.0-alpha03 with different tech.annexflow.constraintlayout.core package
                implementation("tech.annexflow.compose:constraintlayout-compose-multiplatform:0.5.0-alpha03-shaded-core")
                /// Compose 1.7.0-alpha03 with different tech.annexflow.constraintlayout package
                implementation("tech.annexflow.compose:constraintlayout-compose-multiplatform:0.5.0-alpha03-shaded")

            }
        }


    }
}
