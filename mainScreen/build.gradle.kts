plugins {
    id ("com.android.library")
    id ("org.jetbrains.kotlin.android")
    id ("dagger.hilt.android.plugin")
    id ("kotlin-kapt")
}

android {
    namespace = "com.mshdabiola.mainscreen"
    compileSdk = 33

    defaultConfig {
        minSdk = 24
        targetSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        // consumerProguardFiles = "consumer-rules.pro"

    }

    buildTypes {
        getByName ("release") {
            isMinifyEnabled = true
            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.androidxComposeCompiler.get()
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation (project( ":designsystem"))
    implementation (project( ":model"))
    implementation (project( ":datastore"))
    implementation (project( ":soundsystem"))

    implementation(libs.bundles.common.bundle)
    implementation(libs.androidx.constraintlayout)
    kapt (libs.hilt.compiler)

    testImplementation (libs.junit4)
    androidTestImplementation (libs.bundles.android.test.bundle)
    debugImplementation (libs.bundles.compose.debug.bundle)

}