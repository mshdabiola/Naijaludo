
//import com.google.protobuf.gradle.builtins
//import com.google.protobuf.gradle.generateProtoTasks
//import com.google.protobuf.gradle.protobuf
//import com.google.protobuf.gradle.protoc
@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("mshdabiola.android.library")
    id ("mshdabiola.android.hilt")
    alias(libs.plugins.protobuf)
}

android {
    namespace = "com.mshdabiola.datastore"


}
// Setup protobuf configuration, generating lite Java and Kotlin classes
protobuf {
    protoc {
        artifact = libs.protobuf.protoc.get().toString()
    }
    generateProtoTasks {
        all().forEach { task ->
            task.builtins {
                val java by registering {
                    option("lite")
                }
                val kotlin by registering {
                    option("lite")
                }
            }
        }
    }
}



dependencies {

    implementation(project(":model"))
    implementation(libs.androidx.core.ktx)

    implementation(libs.androidx.dataStore.core)
    implementation(libs.protobuf.kotlin.lite)


    testImplementation(libs.junit4)
    androidTestImplementation(libs.androidx.test.ext)
    androidTestImplementation(libs.androidx.test.espresso.core)
}