@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id ("com.android.library")
    id ("org.jetbrains.kotlin.android")
    //alias(libs.plugins.google.services)
}

android {
    namespace = "com.mshdabiola.designsystem"
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

    implementation (project( ":model"))

    testImplementation (libs.junit4)
    implementation(libs.admob.service)
    implementation(libs.bundles.compose.bundle)

    androidTestImplementation(libs.bundles.android.test.bundle)
    debugImplementation (libs.bundles.compose.debug.bundle)
}