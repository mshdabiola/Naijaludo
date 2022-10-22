package com.mshdabiola.database.model

import androidx.room.Entity
import com.mshdabiola.ludo.model.player.PlayerInteface

@Entity(tableName = "player_table", primaryKeys = ["id","gameId"])
data class PlayerEntity(
    val id : Int,
    val gameId : Long,
    val name: String,
    val win: Int,
    val isCurrent: Boolean,
)

//fun PlayerEntity.toPlayer(colors : List<GameColor>)=Player(name, win, isCurrent, colors)

fun PlayerInteface.toPlayerEntity(id:Int,gameId: Long)=PlayerEntity(id,gameId ,name, win, isCurrent)
