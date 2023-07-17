plugins {
    //kotlin("multiplatform")
    id("mshdabiola.mpp.library")

}

android {
    namespace = "com.mshdabiola.util"
}
kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.kotlinx.coroutines.core)
            }
        }

        val commonTest by getting {
            dependencies {

            }
        }

        val androidMain by getting {
            dependencies {
                //  implementation(platform(libs.firebase.bom))
//                implementation(platform(libs.firebase.bom))
//                implementation(libs.firebase.analytics)
                implementation(project(":common:naijaludo"))
//                implementation(libs.firebase.message)
//                implementation(libs.firebase.cloud.messaging)
//
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
