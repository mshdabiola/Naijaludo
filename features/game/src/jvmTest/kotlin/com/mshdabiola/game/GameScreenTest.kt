package com.mshdabiola.game

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import kotlin.test.Test

class GameScreenTest {

    @get:Rule
    val composeRule = createComposeRule()

    @OptIn(ExperimentalSharedTransitionApi::class)
    @Test
    fun main() {
//        composeRule.setContent {
//            SharedContentPreview { sharedTransitionScope, animatedContentScope ->
//                DetailScreen(
//                    state = DetailState.Success(1),
//                    sharedTransitionScope = sharedTransitionScope,
//                    animatedContentScope = animatedContentScope,
//                    title = rememberTextFieldState("title"),
//                    content = rememberTextFieldState("content"),
//                )
//            }
//        }
//
//        composeRule.onNodeWithTag("detail:title").assertExists()
//        composeRule.onNodeWithTag("detail:content").assertExists()
    }
}
