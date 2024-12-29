package com.mshdabiola.main

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import com.mshdabiola.ui.SharedContentPreview
import org.junit.Rule
import kotlin.test.Test

class MainScreenTest {

    @get:Rule
    val composeRule = createComposeRule()

    @OptIn(ExperimentalSharedTransitionApi::class)
    @Test
    fun main() {
        composeRule.setContent {
            SharedContentPreview { sharedTransitionScope, animatedContentScope ->
                MainScreen(
                    sharedTransitionScope = sharedTransitionScope,
                    animatedContentScope = animatedContentScope,
                )
            }
        }

        composeRule.onNodeWithTag("main:play").assertExists()
    }
}
