package com.mshdabiola.benchmark

// import androidx.benchmark.macro.ExperimentalBaselineProfilesApi
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.benchmark.macro.junit4.BaselineProfileRule
import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiSelector
import androidx.test.uiautomator.Until
import org.junit.Rule
import org.junit.Test

// @OptIn(ExperimentalBaselineProfilesApi::class)
class BaselineGenerator {

    @RequiresApi(Build.VERSION_CODES.P)
    @get:Rule
    val baselineProfileRule = BaselineProfileRule()

    @RequiresApi(Build.VERSION_CODES.P)
    @Test
    fun startUp() = baselineProfileRule.collect(
        packageName = "com.mshdabiola.ludo",
    ) {
        pressHome()
        startActivityAndWait()

        //multiplayer
        device.waitForIdle()
        device.findObject(UiSelector().descriptionContains("play")).click()

        device.waitForIdle()
        device.findObject(UiSelector().text("Connect")).click()

        device.waitForIdle()
        device.findObject(UiSelector().text("Cancel")).click()

        device.waitForIdle()
        device.findObject(UiSelector().text("Back")).click()

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
