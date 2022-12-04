package com.mshdabiola.database.model

import androidx.room.Entity
import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.Pawn

@Entity(tableName = "pawn_table", primaryKeys = ["id", "gameId"])
data class PawnEntity(
    val id: Int = 0,
    val gameId: Long,
    val currentPos: Int,
    val playerId: Int
)

fun Int.toColor() = GameColor.values()[this / 4]

fun Int.toId() = (this % 4) + 1

fun Pawn.toPawnEntity(
    playerId: Int,
    gameId: Long
) = PawnEntity(
    this.idx, gameId,
    currentPos, playerId
)

fun PawnEntity.toPawn() = Pawn().copy(id.toId(), currentPos, id.toColor())
