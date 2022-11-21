package com.mshdabiola.benchmark

// import androidx.benchmark.macro.ExperimentalBaselineProfilesApi
import androidx.benchmark.macro.junit4.BaselineProfileRule
import androidx.test.uiautomator.UiSelector
import org.junit.Rule
import org.junit.Test

// @OptIn(ExperimentalBaselineProfilesApi::class)
class BaselineGenerator {

    @get:Rule
    val baselineProfileRule = BaselineProfileRule()

    @Test
    fun startUp() = baselineProfileRule.collectBaselineProfile(
        packageName = "com.mshdabiola.ludo"
    ) {
        pressHome()
        startActivityAndWait()

        device.waitForIdle()
        device.findObject(UiSelector().descriptionContains("play")).click()
        device.waitForIdle()
        device.findObject(UiSelector().text("play")).click()
        device.waitForIdle()

        // while(!device.hasObject(By.text("6"))){
//            device.findObject(UiSelector().descriptionContains("dice")).click()
//            device.waitForIdle()
        // }
//        device.findObject(UiSelector().text("6")).click()
    }
}
