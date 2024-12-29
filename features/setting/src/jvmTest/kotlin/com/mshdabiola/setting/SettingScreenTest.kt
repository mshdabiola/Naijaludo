package com.mshdabiola.setting

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.ui.test.junit4.createComposeRule
import com.mshdabiola.naijaludo.model.Setting
import com.mshdabiola.ui.state.toUi
import org.junit.Rule
import kotlin.test.Test

class SettingScreenTest {

    @get:Rule
    val composeRule = createComposeRule()

    @OptIn(ExperimentalSharedTransitionApi::class)
    @Test
    fun main() {
        composeRule.setContent {
            SettingScreen(
                settingUiState = Setting.default.toUi(),

            )
        }
    }
}
