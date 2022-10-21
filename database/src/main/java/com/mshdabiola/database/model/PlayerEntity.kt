package com.mshdabiola.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.player.Player

@Entity(tableName = "player_table", primaryKeys = ["id","gameId"])
data class PlayerEntity(
    val id : Int,
    val gameId : Int,
    val name: String,
    val win: Int,
    val isCurrent: Boolean,
)

//fun PlayerEntity.toPlayer(colors : List<GameColor>)=Player(name, win, isCurrent, colors)

fun Player.toPlayerEntity(id:Int,gameId: Int)=PlayerEntity(id,gameId ,name, win, isCurrent)
