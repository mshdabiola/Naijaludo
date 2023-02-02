
@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id ("mshdabiola.android.application")
    id ("mshdabiola.android.application.compose")
    id ("mshdabiola.android.hilt")
    alias(libs.plugins.google.services)
    alias(libs.plugins.firebase.crashlytics)

}

android {
    signingConfigs {
        create("rele") {
            storeFile = file("/Users/user/Desktop/android collection/androidkey.jks")
            storePassword = "cheatmobi20"
            keyAlias = "androidKey"
            keyPassword = "cheatmobi20"
        }
    }
    namespace ="com.mshdabiola.ludo"

    defaultConfig {
        applicationId = "com.mshdabiola.ludo"
    }

    buildTypes {
        val debug by getting {
//            applicationIdSuffix = ".debug"
            versionNameSuffix="-debug"
            signingConfig = signingConfigs.getByName("rele")
        }
        val release by getting {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")

            // To publish on the Play store a private signing key is required, but to allow anyone
            // who clones the code to sign and run the release variant, use the debug signing key.
            // TODO: Abstract the signing configuration to a separate file to avoid hardcoding this.
            // Todo: comment code before release
           // signingConfig = signingConfigs.getByName("debug")
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


    packagingOptions {
        excludes += "/META-INF/AL2.0"
        excludes += "/META-INF/LGPL2.1"
    }
}

dependencies {
    implementation (project( ":core:naijaludo"))
    implementation(project(":feature:gamescreen"))
    implementation (project( ":core:designsystem"))
    implementation(project(":feature:mainScreen"))


    implementation(libs.androidx.core.ktx)
    implementation (libs.androidx.activity.compose)
    //implementation(libs.bundles.compose.bundle)

    implementation (project(":core:model"))
    implementation(libs.firebase.crashlytics.kts)
    implementation(libs.firebase.analytics.kts)
    implementation(libs.admob.service)

        val billing_version = "5.1.0"

        implementation("com.android.billingclient:billing-ktx:$billing_version")
    implementation (libs.play.game)


    implementation(libs.androidx.profileinstaller)
    //implementation(libs.kotlinx.collection.immutable)
    implementation(libs.androidx.core.splashscreen)


    //testImplementation (libs.junit4)
    //androidTestImplementation (libs.bundles.android.test.bundle)
    //debugImplementation (libs.bundles.compose.debug.bundle)

}