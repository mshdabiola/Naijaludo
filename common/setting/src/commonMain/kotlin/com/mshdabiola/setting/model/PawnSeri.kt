package com.mshdabiola.setting.model

import com.mshdabiola.naijaludo.model.GameColor
import com.mshdabiola.naijaludo.model.Pawn
import kotlinx.serialization.Serializable

@Serializable
internal data class PawnSeri(
    val colorNumber: Int ,
    val currentPos: Int,
    val color: GameColor,
    val isEnable: Boolean,
    val zIndex: Float
)

internal fun PawnSeri.toPawn()=Pawn(
    colorNumber = colorNumber,
    currentPos = currentPos,
    color = color,
    isEnable = isEnable,
    zIndex = zIndex
)

internal fun Pawn.toPawnSeri()=PawnSeri(
    colorNumber = colorNumber,
    currentPos = currentPos,
    color = color,
    isEnable = isEnable,
    zIndex = zIndex
)