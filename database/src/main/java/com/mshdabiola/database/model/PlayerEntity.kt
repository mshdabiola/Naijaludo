package com.mshdabiola.database.model

import androidx.room.Entity
import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.player.HumanPlayer
import com.mshdabiola.ludo.model.player.Player
import com.mshdabiola.ludo.model.player.RandomComputerPlayer

@Entity(tableName = "player_table", primaryKeys = ["id", "gameId"])
data class PlayerEntity(
    val id: Int,
    val gameId: Long,
    val name: String,
    val win: Int,
    val isCurrent: Boolean,
    val isHuman: Boolean
)

fun PlayerEntity.toPlayer(colors: List<GameColor>) =
    if (isHuman) HumanPlayer(name, win, isCurrent, colors)
    else RandomComputerPlayer(name, win, isCurrent, colors)

fun Player.toPlayerEntity(id: Int, gameId: Long, isHuman: Boolean) =
    PlayerEntity(
        id,
        gameId, name,
        win, isCurrent, isHuman
    )
