package com.mshdabiola.datastore

import com.mshdabiola.model.LogLudoData
import com.mshdabiola.model.User
import com.mshdabiola.model.UserData
import com.mshdabiola.naijaludo.model.Pawn
import com.mshdabiola.naijaludo.model.Setting
import com.mshdabiola.naijaludo.model.player.Player
import kotlinx.coroutines.flow.Flow

interface Store {

    val userData: Flow<UserData>

    suspend fun updateUserData(transform: suspend (UserData) -> UserData): UserData

    val setting: Flow<Setting>
    suspend fun setGameSetting(setting: Setting)
    // fun getGameSetting(): Setting

    suspend fun setGame(
        players: List<Player>,
        pawns: List<Pawn>,
    )

    suspend fun getGame(type: Int, name: String): Pair<List<Player>, List<Pawn>>

    suspend fun getUser(): User
    suspend fun setUser(user: User)

    suspend fun setLog2(ludoLog: LogLudoData)

    suspend fun getLog2(): LogLudoData

    suspend fun setLog4(ludoLog: LogLudoData)

    suspend fun getLog4(): LogLudoData

    fun getCurrentBoard(): Flow<String>
    suspend fun setCurrentBoard(string: String)

    fun getCurrentDice(): Flow<String>

    suspend fun setCurrentDice(string: String)

    suspend fun getPurchaseItems(): List<String>
    suspend fun setPurchaseItems(strBoard: List<String>)
}
