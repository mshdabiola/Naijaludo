package com.mshdabiola.setting

import com.mshdabiola.naijaludo.model.Pawn
import com.mshdabiola.naijaludo.model.Setting
import com.mshdabiola.naijaludo.model.player.Player
import com.mshdabiola.setting.model.LogLudoData
import com.mshdabiola.setting.model.User
import kotlinx.coroutines.flow.Flow

interface MultiplatformSettings {

    val setting: Flow<Setting>
    suspend fun setGameSetting(setting: Setting)
    // fun getGameSetting(): Setting

    suspend fun setGame(
        players: List<Player>,
        pawns: List<Pawn>
    )

    fun getGame(type: Int, name: String): Pair<List<Player>, List<Pawn>>

    fun getName(): String

    fun getUser(): User
    suspend fun setUser(user: User)

    suspend fun setLog2(ludoLog: LogLudoData)

    fun getLog2(): LogLudoData

    suspend fun setLog4(ludoLog: LogLudoData)

    fun getLog4(): LogLudoData

     fun getCurrentBoard():Flow<String>
    suspend fun setCurrentBoard(string: String)

     fun getCurrentDice():Flow<String>

    suspend fun setCurrentDice(string: String)


    suspend fun getPurchaseItems():List<String>
    suspend fun setPurchaseItems(strBoard: List<String>)



}
