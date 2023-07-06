plugins {
    id("mshdabiola.android.library")
  //  id("mshdabiola.android.hilt")
}

android {
    namespace = "com.mshdabiola.worker"
}
dependencies {
    implementation(project(":common:model"))
    implementation(project(":common:data"))

    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.startup)
    implementation(libs.androidx.work.ktx)
   // implementation(libs.hilt.ext.work)

    implementation(libs.koin.core)
    implementation(libs.koin.android)
    api(libs.koin.android.workmanager){
        exclude(group = "io.insert-koin","koin-android")
        exclude(group = "androidx.lifecycle")
    }

    testImplementation(project(":common:testing"))
    androidTestImplementation(project(":common:testing"))

   // kapt(libs.hilt.ext.compiler)
    implementation(libs.kotlinx.serialization.json)
    androidTestImplementation(libs.androidx.work.testing)
    androidTestImplementation(libs.hilt.android.testing)
}
