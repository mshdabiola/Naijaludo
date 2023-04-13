package com.mshdabiola.worker

import com.mshdabiola.database.model.PawnEntity
import com.mshdabiola.database.model.PlayerEntity
import com.mshdabiola.naijaludo.model.Pawn
import com.mshdabiola.naijaludo.model.player.Player
import kotlinx.serialization.Serializable

@Serializable
data class PlayerSer(
    val id: Int,
    val gameId: Long,
    val name: String,
    val win: Int,
    val isCurrent: Boolean,
    val isHuman: Boolean,
)

fun Player.toPlayerSer(id: Int, gameId: Long, isHuman: Boolean) =
    PlayerSer(
        id,
        gameId,
        name,
        win,
        isCurrent,
        isHuman,
    )

fun PlayerSer.toPlayerEntity()=PlayerEntity(id, gameId, name, win, isCurrent, isHuman)



@Serializable
data class PawnSer(
    val id: Int = 0,
    val gameId: Long,
    val currentPos: Int,
    val playerId: Int,
)

fun Pawn.toPawnSer(
    playerId: Int,
    gameId: Long,
) = PawnSer(
    this.idx,
    gameId,
    currentPos,
    playerId,
)

fun PawnSer.toPawnEntity()=PawnEntity(id, gameId, currentPos, playerId)

