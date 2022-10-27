plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
    id ("dagger.hilt.android.plugin")
}

android {
    namespace ="com.mshdabiola.ludo"
    compileSdk = 33

    defaultConfig {
        applicationId ="com.mshdabiola.ludo"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }

    }

    buildTypes {
       getByName ("release") {
            isMinifyEnabled = true
            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        getByName ("debug") {
            applicationIdSuffix = ".debug"
            versionNameSuffix = "-debug"
        }
       create ("benchmark") {

           initWith(getByName("release"))
           signingConfig = signingConfigs.getByName("debug")
           matchingFallbacks.add("release")
           proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"),
               "proguard-benchmark-rules.pro")
           isDebuggable = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.androidxComposeCompiler.get()
    }
    packagingOptions {
        excludes += "/META-INF/AL2.0"
        excludes += "/META-INF/LGPL2.1"
    }
}

dependencies {
    implementation (project( ":naijaludo"))
    implementation (project( ":gameScreen"))
    implementation (project( ":designsystem"))
    implementation (project( ":mainScreen"))


    implementation(libs.androidx.core.ktx)
    implementation (libs.androidx.activity.compose)
    implementation(libs.bundles.compose.bundle)

    implementation (project(":model"))

    kapt (libs.hilt.compiler)

    implementation(libs.bundles.hilt.bundle)
    implementation(libs.androidx.profileinstaller)
    implementation(libs.kotlinx.collection.immutable)


    testImplementation (libs.junit4)
    androidTestImplementation (libs.bundles.android.test.bundle)
    debugImplementation (libs.bundles.compose.debug.bundle)

}