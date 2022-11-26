package com.mshdabiola.database.model

import androidx.room.Embedded
import androidx.room.Relation
import com.mshdabiola.ludo.model.Pawn
import com.mshdabiola.ludo.model.player.Player

data class LudoAndOthers(
    @Embedded val ludoEntity: LudoEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "gameId"
    )
    val pawnEntity: List <PawnEntity>,
    @Relation(
        parentColumn = "id",
        entityColumn = "gameId"
    )
    val playerEntity: List<PlayerEntity>

)

fun LudoAndOthers.toPair(): Pair<List<Player>, List<Pawn>> {
    val pawns = pawnEntity.map { it.toPawn() }
    val playerColorsMap = pawnEntity.groupBy(
        keySelector = { it.playerId },
        valueTransform = { it.toPawn().color }
    )
    val players = playerEntity.mapIndexed { index, playerEntity ->
        playerEntity
            .toPlayer(
                playerColorsMap[index]
                !!.distinct(),
                index
            )
    }

    return Pair(players, pawns)
}
