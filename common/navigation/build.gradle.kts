@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("mshdabiola.mpp.library")
    id("kotlin-parcelize")
}

android {
    namespace = "com.mshdabiola.navigation"
}

kotlin{
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.decompose.core)
                //implementation(libs.decompose.android)
                implementation(libs.decompose.compose.jetbrains)
            }
        }

        val commonTest by getting {
            dependencies {

            }
        }

        val androidMain by getting {
            dependencies {

            }
        }



        val desktopMain by getting {
            dependencies {

            }
        }

        val desktopTest by getting

//        val jsMain by getting {
//            dependencies {
//
//            }
//        }
    }
}