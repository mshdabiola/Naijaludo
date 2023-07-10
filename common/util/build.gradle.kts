
plugins {
    //kotlin("multiplatform")
    id("mshdabiola.mpp.library")

}

android {
    namespace = "com.mshdabiola.util"
}
kotlin{
    sourceSets {
        val commonMain by getting {
            dependencies {

            }
        }

        val commonTest by getting {
            dependencies {

            }
        }

        val androidMain by getting {
            dependencies {
//
            }
        }



        val desktopMain by getting {
            dependencies {

            }
        }

        val desktopTest by getting

//        val jsMain by getting {
//            dependencies {
//
//            }
//        }
    }
}
