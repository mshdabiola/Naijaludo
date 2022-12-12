plugins {
    id("mshdabiola.android.library")
    id ("mshdabiola.android.hilt")
}

android {
    namespace = "com.mshdabiola.soundsystem"

}

dependencies {
    implementation (project( ":model"))
}