plugins {
    id("mshdabiola.android.library")
    id ("mshdabiola.android.hilt")
}

android {
    namespace = "com.mshdabiola.common"

}

dependencies {
    implementation (project( ":core:naijaludo"))
    implementation(libs.firebase.analytics.kts)
}