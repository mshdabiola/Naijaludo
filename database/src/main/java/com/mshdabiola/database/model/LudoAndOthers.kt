package com.mshdabiola.database.model

import androidx.room.Embedded
import androidx.room.Relation

data class LudoAndOthers(
    @Embedded val ludoEntity: LudoEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "gameId"
    )
    val pawnEntity:List <PawnEntity>,
    @Relation(
        parentColumn = "id",
        entityColumn = "gameId"
    )
    val playerEntity: List<PlayerEntity>
)
