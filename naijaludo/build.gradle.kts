plugins {
    id ("java-library")
    id ("org.jetbrains.kotlin.jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
dependencies {
    implementation(libs.kotlinx.coroutines.core)
    implementation (project( ":model"))
    //  androidTestImplementation 'org.junit.jupiter:junit-jupiter'
}