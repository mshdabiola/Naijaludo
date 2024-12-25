@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("mshdabiola.android.library")
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.mshdabiola.datastore"
    //proguard here
}

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":modules:model"))




                implementation(libs.kotlinx.serialization.json)
                implementation(libs.kotlinx.coroutines.core)


            }
        }
        wasmJsMain.dependencies{
            api(libs.kstore.storage)
            api(libs.kstore)
            api("org.jetbrains.kotlinx:kotlinx-browser:0.3")



        }
        val nonJsMain by getting {
            dependencies {
                api(libs.androidx.dataStore.core)
                api(libs.androidx.datastore.core.okio)
            }
        }
    }
}