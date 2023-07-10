package com.mshdabiola.skeletonapp

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

class NavigationTest {

//    @get:Rule(order = 0)
//    val hiltRule = HiltAndroidRule(this)

    @get:Rule(order = 2)
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun buttonClick() {
        composeTestRule.apply {
            onNodeWithText("Add Test")
                .assertExists()

        }
    }

}