package com.mshdabiola.mainscreen

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainScreenKtTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Before
    fun setUp() {
        composeTestRule.activity.apply {
        }
    }

    @Test
    fun showButton() {
        composeTestRule.setContent {
            MainScreen {

            }
        }

        composeTestRule
//            .onNodeWithText("Add Test")
            .onNodeWithTag("button")
            .assertExists()
    }
}
