package com.mshdabiola.ludo.model

import com.mshdabiola.ludo.model.player.Player

data class LudoGameState(
    val listOfPlayer: List<Player> = emptyList(),
    val listOfDice: List<Dice> = emptyList(),
    val listOfPawn: List<Pawn> = emptyList(),
    val listOfCounter: List<Counter> = emptyList(),
    val drawer: Drawer? = null,
    val board: Board = Board(),
    val pressedCounterId: Int = 0,
    val isOnResume: Boolean = false,
    val start: Boolean = false,
    val isHumanPlayer: Boolean = false,
    val rotate: Boolean = false,
    val numGamePlay: Int = 0
) {
    val currentDiceNumber: Int
        get() {
            return listOfDice[pressedCounterId].number
        }
}
