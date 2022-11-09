package com.mshdabiola.mainscreen

import com.mshdabiola.datastore.BoardPref

data class Board(
    val boardType: Int = 1,
    val boardStyle: Int = 1,
    val pawnNumber: Int = 4,
    val rotate: Boolean = true
) {
    val styleOptions = listOf("Dialogue", "Horizontal", "Vertical")
    val currentStyle = styleOptions[boardStyle]

    val typeOptions = listOf("Bird", "Club", "Tribe")
    val currentType = typeOptions[boardType]

    val numberOfPawn = listOf("2", "3", "4")
}

fun BoardPref.toBoard() =
    Board(boardType, boardStyle, pawnNumber, rotate)

fun Board.toBoardPref() =
    BoardPref(boardType, boardStyle, pawnNumber, rotate)
