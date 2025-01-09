@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("mshdabiola.android.library")
    alias(libs.plugins.kotlin.serialization)


}

android {
    namespace = "com.mshdabiola.naijaludo"
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(libs.kotlinx.serialization.json)
            implementation(libs.kotlinx.coroutines.core)
//            testImplementation(kotlin("test"))
//            testImplementation(libs.kotlinx.coroutines.test)
//    testImplementation(libs.turbine)
            //  androidTestImplementation 'org.junit.jupiter:junit-jupiter'

        }
    }
}
//plugins {
//    id("java-library")
//    id("org.jetbrains.kotlin.jvm")
//}
//
//java {
//    sourceCompatibility = JavaVersion.VERSION_17
//    targetCompatibility = JavaVersion.VERSION_17
//}
//tasks.test {
//    useJUnitPlatform()
//}
//dependencies {
//    implementation(libs.kotlinx.coroutines.core)
//    testImplementation(kotlin("test"))
//    testImplementation(libs.kotlinx.coroutines.test)
//    testImplementation(libs.turbine)
//    //  androidTestImplementation 'org.junit.jupiter:junit-jupiter'
//}
//
//tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
//    kotlinOptions {
//        jvmTarget = "17"
//    }
//}
