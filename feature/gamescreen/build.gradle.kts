plugins {
    id ("mshdabiola.android.feature")
}

android {
    namespace = "com.mshdabiola.gamescreen"


}

dependencies {
    implementation (project( ":core:database"))
    implementation (project( ":core:worker"))
    implementation ("nl.dionsegijn:konfetti-compose:2.0.2")

}