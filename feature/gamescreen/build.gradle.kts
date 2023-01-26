plugins {
    id ("mshdabiola.android.feature")
}

android {
    namespace = "com.mshdabiola.gamescreen"


}

dependencies {

    implementation (project( ":core:naijaludo"))
    implementation (project( ":core:database"))
    implementation (project( ":core:multiplayerblue"))

    implementation ("nl.dionsegijn:konfetti-compose:2.0.2")
   // implementation(libs.bundles.common.bundle)
    //implementation(libs.androidx.constraintlayout)


    //testImplementation (libs.junit4)
   // androidTestImplementation (libs.bundles.android.test.bundle)
    //debugImplementation (libs.bundles.compose.debug.bundle)

}