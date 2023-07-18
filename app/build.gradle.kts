import com.mshdabiola.app.BuildType
import org.jetbrains.kotlin.konan.properties.Properties

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("mshdabiola.android.application")
    id("mshdabiola.android.application.compose")
    id("mshdabiola.android.application.flavor")
    id("mshdabiola.android.application.firebase")


}

android {
    namespace = "com.mshdabiola.ludo"

    defaultConfig {
        applicationId = "com.mshdabiola.ludo"
        testInstrumentationRunner = "com.mshdabiola.testing.InstrumentationTestRunner"
    }

//    signingConfigs {
//        val properties = Properties()
//        properties.load(
//            project.rootProject.file("local.properties")
//                .reader()
//        )
//
//        create("release") {
//
//            this.keyAlias = properties["key.alias"] as String
//            keyPassword = properties["key.password"] as String
//            storeFile = file(properties["key.store"] as String)
//            storePassword = properties["key.store.password"] as String
//        }
//    }

    buildTypes {
        val debug by getting {
            applicationIdSuffix = BuildType.DEBUG.applicationIdSuffix
            versionNameSuffix = BuildType.DEBUG.versionNameSuffix
        }
        val release by getting {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )

            // To publish on the Play store a private signing key is required, but to allow anyone
            // who clones the code to sign and run the release variant, use the debug signing key.
            // TODO: Abstract the signing configuration to a separate file to avoid hardcoding this.
            // Todo: comment code before release
//            signingConfig = signingConfigs.getByName("release")
            applicationIdSuffix = BuildType.RELEASE.applicationIdSuffix
            versionNameSuffix = BuildType.RELEASE.versionNameSuffix
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
            applicationIdSuffix = BuildType.BENCHMARK.applicationIdSuffix
            versionNameSuffix = BuildType.BENCHMARK.versionNameSuffix
        }
    }


    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.activity.compose)

    implementation(libs.androidx.profileinstaller)
    implementation(project(":common:designsystem"))
    implementation(project(":common:naijaludo"))
    implementation(project(":common:util"))
    implementation(libs.kotlinx.collection.immutable)

    implementation(project(":common:navigation"))

    implementation(project(":common:setting"))
    val decomposeVersion = "2.0.0-alpha-02"
    implementation(libs.decompose.core)
    //implementation(libs.decompose.android)
    implementation(libs.decompose.compose.jetbrains)
    implementation(libs.androidx.core.splashscreen)
    implementation(libs.timber)
    androidTestImplementation(project(":common:testing"))
    implementation(libs.koin.core)
    implementation(libs.koin.android)
    implementation(libs.koin.android.compose)


    implementation((libs.androidx.constraintlayout))

}
