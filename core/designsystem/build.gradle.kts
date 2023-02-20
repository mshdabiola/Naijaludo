@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("mshdabiola.android.library")
    id ("mshdabiola.android.library.compose")
    //alias(libs.plugins.google.services)
}

android {
    namespace = "com.mshdabiola.designsystem"
    buildTypes {
        create("benchmark") {
        }
    }

}


dependencies {

    implementation (project( ":core:naijaludo"))

    testImplementation (libs.junit4)
    implementation(libs.admob.service)

}