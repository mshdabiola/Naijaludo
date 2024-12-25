package com.mshdabiola.datastore

import com.mshdabiola.model.LogLudoData
import com.mshdabiola.model.User
import com.mshdabiola.naijaludo.model.Constant
import com.mshdabiola.naijaludo.model.Pawn
import com.mshdabiola.naijaludo.model.Setting
import kotlinx.serialization.Serializable

@Serializable
data class CurrentState(
    val setting: Setting = Setting.default,
    val user: User = User(),
    val logLudoData: LogLudoData = LogLudoData(),
    val logLudoData4: LogLudoData = LogLudoData(),
    val players: List<SavePlayer> = Constant.getDefaultPlayers(2, "abiola").map { it.toSaver() },
    val pawns: List<Pawn> = Constant.getDefaultPawns(4),
    val players4: List<SavePlayer> = Constant.getDefaultPlayers(4, "abiola").map { it.toSaver() },
    val pawns4: List<Pawn> = Constant.getDefaultPawns(4),
    val currentBoard: String = "man_2",
    val currentDice: String = "default_dice",
    val purchaseItems: List<String> = emptyList(),

)
//
// private fun getDefaultPlayer(type: Int, name: String): Pair<List<Player>, List<Pawn>> {
//    val player = Constant.getDefaultPlayers(type, name)
//    val pawns = Constant.getDefaultPawns(4)
//    return Pair(player, pawns)
// }
