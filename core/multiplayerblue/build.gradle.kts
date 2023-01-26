plugins {
    id("mshdabiola.android.library")
    id ("mshdabiola.android.hilt")
}

android {
    namespace = "mshdabiola.android.library"

}

dependencies {

    implementation (project( ":core:model"))
//    kapt (libs.hilt.compiler)
//    implementation(libs.hilt.android)
    implementation(libs.kotlinx.coroutines.core)

//    testImplementation (libs.junit4)
//    androidTestImplementation (libs.bundles.android.test.bundle)
}