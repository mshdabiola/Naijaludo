/*
 *abiola 2022
 */

package com.mshdabiola.setting

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mshdabiola.datastore.Store
import com.mshdabiola.naijaludo.model.Setting
import com.mshdabiola.ui.state.SettingUiState
import com.mshdabiola.ui.state.toSetting
import com.mshdabiola.ui.state.toUi
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class SettingViewModel(
    private val setting: Store,
) : ViewModel() {

    val settingUiState = setting.setting
        .map { it.toUi() }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(1000), Setting.default.toUi())

    fun setSetting(settingUiState: SettingUiState) {
        viewModelScope.launch {
            setting.setGameSetting(settingUiState.toSetting())
        }
    }
}
