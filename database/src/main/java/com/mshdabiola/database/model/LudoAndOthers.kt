package com.mshdabiola.database.model

import androidx.room.Embedded
import androidx.room.Relation

data class LudoAndOthers(
    @Embedded val ludoEntity: LudoEntity,
    @Relation(
        parentColumn = "",
        entityColumn = ""
    )
    val pawnEntity:List <PawnEntity>,
    val playerEntity: List<PlayerEntity>
)
