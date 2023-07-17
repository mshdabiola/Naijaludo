import com.android.build.api.variant.LibraryAndroidComponentsExtension
import com.android.build.gradle.LibraryExtension
import com.mshdabiola.app.configureFlavors
import com.mshdabiola.app.configureGradleManagedDevices
import com.mshdabiola.app.configureKotlinAndroid
import com.mshdabiola.app.configurePrintApksTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class MppLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("kotlin-multiplatform")
                apply("com.android.library")
                //apply("org.jetbrains.kotlin.android")
            }

            extensions.configure<LibraryExtension> {
                configureKotlinAndroid(this)
                defaultConfig.targetSdk = 33
                defaultConfig.testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                configureFlavors(this)
                configureGradleManagedDevices(this)
            }
            extensions.configure<LibraryAndroidComponentsExtension> {
                configurePrintApksTask(this)
            }

//            val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")
//            configurations.configureEach {
//                resolutionStrategy {
//                    force(libs.findLibrary("junit4").get())
//                    // Temporary workaround for https://issuetracker.google.com/174733673
//                    force("org.objenesis:objenesis:2.6")
//                }
//            }

            extensions.configure<KotlinMultiplatformExtension> {
                android()
                jvm("desktop")
                val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")
                with(sourceSets) {

                    getByName("commonMain") {
                        this.dependencies {
                            implementation(libs.findLibrary("koin.core").get())

                        }

                    }
                    getByName("commonTest") {
                        this.dependencies {
                            // implementation(libs.findLibrary("koin.core").get())
                            implementation(kotlin("test"))
                            implementation(project(":common:testing"))
                        }

                    }
                    getByName("androidMain") {
                        this.dependencies {
                            implementation(libs.findLibrary("timber").get())

                        }

                    }
                    getByName("androidInstrumentedTest") {
                        this.dependencies {
                            implementation(kotlin("test"))
                            //  implementation(project(":core:testing"))
                        }

                    }
                    getByName("desktopMain") {
                        this.dependencies {
                            // implementation(libs.findLibrary("koin.core").get())

                        }

                    }
                    getByName("desktopTest") {
                        this.dependencies {
                            // implementation(libs.findLibrary("koin.core").get())

                        }

                    }
                }

            }

            tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
                kotlinOptions {
                    jvmTarget = "17"
                }
            }

        }
    }

}