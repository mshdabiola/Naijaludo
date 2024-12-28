/*
 *abiola 2022
 */

package com.mshdabiola.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel() : ViewModel() {

    fun onPlayGame() {
        viewModelScope.launch {
//            log("destroy game")
//
//            _ludoGameState.update {
//                LudoUiState(board = BoardUiState())
//            }
//            closeBlue()
//            _gameUiState.update {
//                GameUiState().copy(isStartDialogOpen = false)
//            }
//            delay(250)
//            _gameUiState.update {
//                it.copy(isStartDialogOpen = true)
//            }
        }
    }
}
