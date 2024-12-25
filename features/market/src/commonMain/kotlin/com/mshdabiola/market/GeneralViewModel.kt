package com.mshdabiola.market

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mshdabiola.datastore.Store
import com.mshdabiola.naijaludo.model.Setting
import com.mshdabiola.ui.state.toUi
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class GeneralViewModel(
    private val setting: Store,
    private val dispatcher: CoroutineDispatcher,
) : ViewModel() {

    val currentBoard =
        setting
            .getCurrentBoard()
    val currentDice =
        setting
            .getCurrentDice()

    val settingUiState = setting.setting
        .map { it.toUi() }
        .distinctUntilChanged { old, new -> old == new }
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            Setting.default.toUi(),
        )

    suspend fun getPurchaseItems(): List<String> {
        return setting.getPurchaseItems()
    }

    fun setCurrentBoard(id: String) {
        viewModelScope.launch(dispatcher) {
            setting.setCurrentBoard(id)
        }
    }

    fun setCurrentDice(id: String) {
        viewModelScope.launch(dispatcher) {
            setting.setCurrentDice(id)
        }
    }
}
