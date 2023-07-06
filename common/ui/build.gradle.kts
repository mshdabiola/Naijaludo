
plugins {
    //kotlin("multiplatform")
    id("mshdabiola.mpp.library")
    id("mshdabiola.mpp.library.compose")
    id("org.jetbrains.compose") version "1.4.0"
    id("dev.icerock.mobile.multiplatform-resources")
}

android {
    namespace = "com.mshdabiola.ui"
}
kotlin{
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.ui)
                implementation(compose.foundation)
                implementation(compose.materialIconsExtended)
                implementation(compose.material3)
                implementation(libs.kotlinx.collection.immutable)
                implementation("dev.icerock.moko:resources:0.22.0")
            }
        }

        val commonTest by getting {
            dependencies {

            }
        }

        val androidMain by getting {
            dependencies {
//                implementation(libs.androidx.compose.ui)
//
//                implementation(libs.androidx.compose.material.iconsExtended)
//                implementation(libs.androidx.compose.foundation)
//                implementation(libs.androidx.compose.material3)
//
//
                implementation("dev.icerock.moko:resources-compose:0.22.0")
//                add("implementation", libs.findLibrary("androidx.compose.material3").get())
//                add(
//                    "implementation",
//                    libs.findLibrary("androidx-compose-material3-windowSizeClass").get()
//                )
//                add("implementation", libs.findLibrary("androidx-compose-ui").get())
//                add("implementation", libs.findLibrary("androidx-compose-ui-tooling-preview").get())
//                add("implementation", libs.findLibrary("androidx-lifecycle-runtimeCompose").get())
//                add("implementation", libs.findLibrary("androidx.compose.material3").get())
//
//                add("debugImplementation", libs.findLibrary("androidx-compose-ui-testManifest").get())
//                add("debugImplementation", libs.findLibrary("androidx-compose-ui-tooling").get())
            }
        }



        val desktopMain by getting {
            dependencies {
                implementation(compose.preview)
                implementation("dev.icerock.moko:resources-compose:0.22.0")
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

//dependencies {
//    implementation(libs.kotlinx.collection.immutable)
//}

multiplatformResources {
    multiplatformResourcesPackage = "com.mshdabiola.ui" // required
    //multiplatformResourcesClassName = "SharedRes" // optional, default MR
//    multiplatformResourcesVisibility = MRVisibility.Internal // optional, default Public
//    iosBaseLocalizationRegion = "en" // optional, default "en"
//    multiplatformResourcesSourceSet = "commonClientMain"  // optional, default "commonMain"
}