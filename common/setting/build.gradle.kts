@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("mshdabiola.mpp.library")
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.mshdabiola.setting"
    //proguard here
}

kotlin{
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":common:model"))


                //   implementation(libs.kermit.log)

                implementation(libs.kotlinx.serialization.json)
                implementation(libs.kotlinx.coroutines.core)
                implementation(libs.multiplatform.settings.core)
                implementation(libs.multiplatform.settings.noArg)
                implementation(libs.multiplatform.settings.serializtion)
                implementation(libs.multiplatform.settings.coroutines)
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(libs.multiplatform.settings.test)
            }
        }

        val androidMain by getting {
            dependencies {
                implementation(libs.multiplatform.settings.datastore)

                implementation(libs.androidx.dataStore.preferences)
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
//
//dependencies {
//
//    testImplementation(project(":core:testing"))
//    implementation(libs.paging.runtime)
//    implementation(libs.paging.common)
//}
