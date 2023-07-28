package com.mshdabiola.ludo.screen.game.component

import com.mshdabiola.ludo.screen.game.component.board.DefaultBoard
import com.mshdabiola.ludo.screen.game.component.board.UBoard

object BoardList {
    val boardlist= mapOf(
        "default" to DefaultBoard,

    )
}

fun getAllBoards():Map<String,UBoard>{
    return mapOf(
        "default" to DefaultBoard,
        "board_1" to DefaultBoard,
        "board_2" to DefaultBoard

        )
}