@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("mshdabiola.mpp.library")
}

android {
    namespace = "com.mshdabiola.testing"
}

kotlin{
    sourceSets {
        val commonMain by getting {
            dependencies {
            //    implementation(project(":core:common"))
                implementation(project(":common:data"))
                implementation(project(":common:model"))
                 api(libs.junit4)
                api(libs.kotlinx.coroutines.test)
                api(libs.turbine)
                api(libs.koin.test)
                api(libs.koin.test.junit)
            }
        }

        val commonTest by getting {
            dependencies {

            }
        }

        val androidMain by getting {
            dependencies {
               //  debugApi(libs.androidx.compose.ui.testManifest)
            api(libs.androidx.test.core)
            api(libs.androidx.test.espresso.core)
            api(libs.androidx.test.runner)
            api(libs.androidx.test.rules)
            api(libs.androidx.compose.ui.test)
                api(libs.koin.android.test)
            }
        }
        val androidInstrumentedTest by getting{


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
