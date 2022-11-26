
@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id ("dagger.hilt.android.plugin")
    alias(libs.plugins.google.services)
    alias(libs.plugins.firebase.crashlytics)
    id ("kotlin-kapt")
}

android {
    namespace ="com.mshdabiola.ludo"
    compileSdk = 33

    defaultConfig {
        applicationId ="com.mshdabiola.ludo"
        minSdk = 24
        targetSdk = 33
        versionCode = 5
        versionName = "1.2.3"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
        resourceConfigurations += listOf("en")

    }

    buildTypes {
        val debug by getting {
            applicationIdSuffix = ".debug"
            versionNameSuffix="-debug"
        }
        val release by getting {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")

            // To publish on the Play store a private signing key is required, but to allow anyone
            // who clones the code to sign and run the release variant, use the debug signing key.
            // TODO: Abstract the signing configuration to a separate file to avoid hardcoding this.
            //signingConfig = signingConfigs.getByName("debug")
        }
        val benchmark by creating {
            // Enable all the optimizations from release build through initWith(release).
            initWith(release)
            matchingFallbacks.add("release")
            // Debug key signing is available to everyone.
            signingConfig = signingConfigs.getByName("debug")
            // Only use benchmark proguard rules
            proguardFiles("benchmark-rules.pro")
            //  FIXME enabling minification breaks access to demo backend.
            isMinifyEnabled = false
            applicationIdSuffix = ".benchmark"
            versionNameSuffix="-benchmark"
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
    implementation(libs.firebase.crashlytics.kts)
    implementation(libs.firebase.analytics.kts)
    implementation(libs.admob.service)

    kapt (libs.hilt.compiler)

    implementation(libs.bundles.hilt.bundle)
    implementation(libs.androidx.profileinstaller)
    implementation(libs.kotlinx.collection.immutable)
    implementation(libs.androidx.core.splashscreen)


    testImplementation (libs.junit4)
    androidTestImplementation (libs.bundles.android.test.bundle)
    debugImplementation (libs.bundles.compose.debug.bundle)

}