package com.mshdabiola.baselineprofile

import androidx.benchmark.macro.junit4.BaselineProfileRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiSelector
import androidx.test.uiautomator.Until
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * This test class generates a basic startup baseline profile for the target package.
 *
 * We recommend you start with this but add important user flows to the profile to improve their performance.
 * Refer to the [baseline profile documentation](https://d.android.com/topic/performance/baselineprofiles)
 * for more information.
 *
 * You can run the generator with the Generate Baseline Profile run configuration,
 * or directly with `generateBaselineProfile` Gradle task:
 * ```
 * ./gradlew :app:generateReleaseBaselineProfile -Pandroid.testInstrumentationRunnerArguments.androidx.benchmark.enabledRules=BaselineProfile
 * ```
 * The run configuration runs the Gradle task and applies filtering to run only the generators.
 *
 * Check [documentation](https://d.android.com/topic/performance/benchmarking/macrobenchmark-instrumentation-args)
 * for more information about available instrumentation arguments.
 *
 * After you run the generator, you can verify the improvements running the [StartupBenchmarks] benchmark.
 **/
@RunWith(AndroidJUnit4::class)
@LargeTest
class BaselineProfileGenerator {

    @get:Rule
    val rule = BaselineProfileRule()

    @Test
    fun generate() {
        rule.collect("com.mshdabiola.ludo") {
            // This block defines the app's critical user journey. Here we are interested in
            // optimizing for app startup. But you can also navigate and scroll
            // through your most important UI.

            // Start default activity for your app
            pressHome()
            startActivityAndWait()
            //multiplayer
//            device.waitForIdle()
//            device.findObject(UiSelector().descriptionContains("play")).click()
//
//            device.waitForIdle()
//            device.findObject(UiSelector().text("Connect")).click()
//
//            device.waitForIdle()
//            device.findObject(UiSelector().text("Cancel")).click()
//
//            device.waitForIdle()
//            device.findObject(UiSelector().text("Back")).click()

            //solo

            device.waitForIdle()
            device.findObject(UiSelector().descriptionContains("play")).click()
            device.wait(Until.hasObject(By.text("Play")),5000)
            device.findObjects(By.text("Play"))[0].click()
            device.waitForIdle()
            device.findObject(UiSelector().descriptionContains("menu")).click()
            device.findObject(UiSelector().text("Home")).click()

            //trio
            device.waitForIdle()
            device.findObject(UiSelector().descriptionContains("play")).click()
            device.wait(Until.hasObject(By.text("Play")),5000)
            device.findObjects(By.text("Play"))[1].click()
            device.waitForIdle()
            device.findObject(UiSelector().descriptionContains("menu")).click()
            device.findObject(UiSelector().text("Home")).click()

            //friend
            device.waitForIdle()
            device.findObject(UiSelector().descriptionContains("play")).click()
            device.wait(Until.hasObject(By.text("Play")),5000)
            device.findObjects(By.text("Play"))[2].click()
            device.waitForIdle()
            device.findObject(UiSelector().descriptionContains("menu")).click()
            device.findObject(UiSelector().text("Home")).click()

            device.waitForIdle()
            device.findObject(UiSelector().descriptionContains("Setting")).click()

            device.waitForIdle()
            device.findObject(UiSelector().text("Game type")).swipeDown(2)
            device.findObject(UiSelector().text("Game type")).swipeUp(2)

            device.findObject(UiSelector().descriptionContains("close")).click()
            device.waitForIdle()
            device.findObject(UiSelector().descriptionContains("close")).click()
//         while(!device.hasObject(By.text("6"))){
//            device.findObject(UiSelector().descriptionContains("dice")).click()
//            device.waitForIdle()
//         }
//        device.findObject(UiSelector().text("6")).click()
        }
    }
}