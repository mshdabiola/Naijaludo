/*
 *abiola 2022
 */

package com.mshdabiola.setting

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mshdabiola.data.repository.UserDataRepository
import com.mshdabiola.datastore.Store
import com.mshdabiola.model.DarkThemeConfig
import com.mshdabiola.model.ThemeBrand
import com.mshdabiola.naijaludo.model.Setting
import com.mshdabiola.ui.state.SettingUiState
import com.mshdabiola.ui.state.toSetting
import com.mshdabiola.ui.state.toUi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class SettingViewModel constructor(
    private val userDataRepository: UserDataRepository,
    private val setting: Store,
) : ViewModel() {

    private val _settingState = MutableStateFlow<SettingState>(SettingState.Loading())
    val settingState = _settingState.asStateFlow()

    val settingUiState = setting.setting
        .map { it.toUi() }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(1000), Setting.default.toUi())

    init {
        update()
    }

    fun setThemeBrand(themeBrand: ThemeBrand) {
        viewModelScope.launch {
            _settingState.value = SettingState.Loading()

            userDataRepository.setThemeBrand(themeBrand)

            update()
        }
    }

    /**
     * Sets the desired dark theme config.
     */
    fun setDarkThemeConfig(darkThemeConfig: DarkThemeConfig) {
        viewModelScope.launch {
            _settingState.value = SettingState.Loading()

            userDataRepository.setDarkThemeConfig(darkThemeConfig)

            update()
        }
    }

    private fun update() {
        viewModelScope.launch {
            _settingState.value = userDataRepository.userData.map {
                SettingState.Success(
                    themeBrand = it.themeBrand,
                    darkThemeConfig = it.darkThemeConfig,
                )
            }.first()
        }
    }

    fun setSetting(settingUiState: SettingUiState) {
        viewModelScope.launch {
            setting.setGameSetting(settingUiState.toSetting())
        }
    }
}
