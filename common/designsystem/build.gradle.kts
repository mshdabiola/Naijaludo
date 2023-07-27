plugins {
    //kotlin("multiplatform")
    id("mshdabiola.mpp.library")
    id("mshdabiola.mpp.library.compose")
   // id("org.jetbrains.compose") version "1.4.0"
}
//compose {
//    kotlinCompilerPlugin.set("1.4.8-beta")
//    kotlinCompilerPluginArgs.add("suppressKotlinVersionCompatibilityCheck=1.9.0")
//}
android {
    namespace = "com.mshdabiola.designsystem"
}
//kotlin {
//    sourceSets {
//        val commonMain by getting {
//            dependencies {
//                implementation(compose.runtime)
//                implementation(compose.ui)
//                implementation(compose.foundation)
//                implementation(compose.materialIconsExtended)
//                implementation(compose.material3)
//                implementation(libs.kotlinx.collection.immutable)
//            }
//        }
//
//        val commonTest by getting {
//            dependencies {
//
//            }
//        }
//
//        val androidMain by getting {
//            dependencies {
//                implementation(libs.androidx.compose.ui)
//
//                implementation(libs.androidx.compose.material.iconsExtended)
//                implementation(libs.androidx.compose.foundation)
//                implementation(libs.androidx.compose.material3)
//                implementation(project(":common:naijaludo"))
//
////
////                add("implementation", libs.findLibrary("androidx.compose.material3").get())
////                add(
////                    "implementation",
////                    libs.findLibrary("androidx-compose-material3-windowSizeClass").get()
////                )
////                add("implementation", libs.findLibrary("androidx-compose-ui").get())
////                add("implementation", libs.findLibrary("androidx-compose-ui-tooling-preview").get())
////                add("implementation", libs.findLibrary("androidx-lifecycle-runtimeCompose").get())
////                add("implementation", libs.findLibrary("androidx.compose.material3").get())
////
////                add("debugImplementation", libs.findLibrary("androidx-compose-ui-testManifest").get())
////                add("debugImplementation", libs.findLibrary("androidx-compose-ui-tooling").get())
//            }
//        }
//
//
//        val desktopMain by getting {
//            dependencies {
//
//            }
//        }
//
//        val desktopTest by getting
//
////        val jsMain by getting {
////            dependencies {
////
////            }
////        }
//    }
//}

//dependencies {
//    implementation(libs.kotlinx.collection.immutable)
//}

