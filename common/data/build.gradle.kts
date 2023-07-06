@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("mshdabiola.mpp.library")
}

android {
    namespace = "com.mshdabiola.data"
}

kotlin{
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":common:model"))

                implementation(libs.koin.core)
                //   implementation(libs.kermit.log)
                implementation(project(":common:model"))
                implementation(project(":common:database"))
                implementation(project(":common:setting"))
                implementation(project(":common:network"))
                implementation(libs.kotlinx.coroutines.core)
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