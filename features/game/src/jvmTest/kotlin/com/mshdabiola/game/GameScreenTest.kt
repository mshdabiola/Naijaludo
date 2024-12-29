package com.mshdabiola.game

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import com.mshdabiola.naijaludo.model.Constant
import com.mshdabiola.ui.SharedContentPreview
import com.mshdabiola.ui.state.toLudoUiState
import org.junit.Rule
import kotlin.test.Test

class GameScreenTest {

    @get:Rule
    val composeRule = createComposeRule()

    @OptIn(ExperimentalSharedTransitionApi::class)
    @Test
    fun main() {
        composeRule.setContent {
            SharedContentPreview { sharedTransitionScope, animatedContentScope ->
                GameScreen(
                    gameUiState = Constant.getDefaultGameState().toLudoUiState(),
                )
            }
        }

        composeRule.onNodeWithTag("game:market").assertExists()
    }
}
