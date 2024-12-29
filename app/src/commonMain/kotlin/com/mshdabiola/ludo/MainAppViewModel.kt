/*
 *abiola 2022
 */

package com.mshdabiola.ludo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mshdabiola.datastore.Store
import com.mshdabiola.ludo.MainActivityUiState.Loading
import com.mshdabiola.ludo.MainActivityUiState.Success
import com.mshdabiola.ui.state.SettingUiState
import com.mshdabiola.ui.state.toUi
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

class MainAppViewModel(
    store: Store,
) : ViewModel() {

    val uiState: StateFlow<MainActivityUiState> = store.setting.map {
        Success(it.toUi())
    }.stateIn(
        scope = viewModelScope,
        initialValue = Loading,
        started = SharingStarted.WhileSubscribed(5_000),
    )
}

sealed interface MainActivityUiState {
    data object Loading : MainActivityUiState
    data class Success(val userData: SettingUiState) : MainActivityUiState
}
