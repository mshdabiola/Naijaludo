package com.mshdabiola.setting

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mshdabiola.naijaludo.model.Setting
import com.mshdabiola.ui.state.toUi

@Preview
@Composable
fun ScreenPreview() {
    SettingScreen(
        settingUiState = Setting.default.toUi(),

    )
}
