package com.mshdabiola.datastore

import androidx.datastore.core.DataStore
import com.mshdabiola.model.LogLudoData
import com.mshdabiola.model.User
import com.mshdabiola.model.UserData
import com.mshdabiola.naijaludo.model.Constant
import com.mshdabiola.naijaludo.model.Pawn
import com.mshdabiola.naijaludo.model.Setting
import com.mshdabiola.naijaludo.model.player.Player
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext

class StoreImpl(
    private val userdata: DataStore<UserData>,
    private val currentState: DataStore<CurrentState>,
    private val coroutineDispatcher: CoroutineDispatcher,
) : Store {

    override val userData: Flow<UserData>
        get() = userdata
            .data
    private val data = currentState.data

    override suspend fun updateUserData(transform: suspend (UserData) -> UserData): UserData {
        return withContext(coroutineDispatcher) {
            userdata.updateData(transform)
        }
    }

    override val setting: Flow<Setting>
        get() = data.map { it.setting }

    override suspend fun setGameSetting(setting: Setting) {
        currentState.updateData { it.copy(setting = setting) }
    }

    override suspend fun setGame(players: List<Player>, pawns: List<Pawn>) {
        if (players.size == 2) {
            currentState.updateData {
                it.copy(
                    players = players.map { it.toSaver() },
                    pawns = pawns,
                )
            }
        } else {
            currentState.updateData {
                it.copy(
                    players4 = players.map { it.toSaver() },
                    pawns4 = pawns,
                )
            }
        }
    }

    override suspend fun getGame(type: Int, name: String): Pair<List<Player>, List<Pawn>> {
        val data = data.first()
        return if (type == 2) {
            Pair(data.players.map { it.toOriginal() }, data.pawns)
        } else {
            Pair(data.players4.map { it.toOriginal() }, data.pawns4)
        }
    }

    override suspend fun getUser(): User {
        return data.first().user
    }

    override suspend fun setUser(user: User) {
        currentState.updateData { it.copy(user = user) }
    }

    override suspend fun setLog2(ludoLog: LogLudoData) {
        currentState.updateData { it.copy(logLudoData = ludoLog) }
    }

    override suspend fun getLog2(): LogLudoData {
        return data.first().logLudoData
    }

    override suspend fun setLog4(ludoLog: LogLudoData) {
        currentState.updateData { it.copy(logLudoData4 = ludoLog) }
    }

    override suspend fun getLog4(): LogLudoData {
        return data.first().logLudoData4
    }

    override fun getCurrentBoard(): Flow<String> {
        return data.map { it.currentBoard }
    }

    override suspend fun setCurrentBoard(string: String) {
        currentState.updateData { it.copy(currentBoard = string) }
    }

    override fun getCurrentDice(): Flow<String> {
        return data.map { it.currentDice }
    }

    override suspend fun setCurrentDice(string: String) {
        currentState.updateData { it.copy(currentDice = string) }
    }

    override suspend fun getPurchaseItems(): List<String> {
        return data.first().purchaseItems
    }

    override suspend fun setPurchaseItems(strBoard: List<String>) {
        currentState.updateData { it.copy(purchaseItems = strBoard) }
    }

    private fun getDefaultPlayer(type: Int, name: String): Pair<List<Player>, List<Pawn>> {
        val player = Constant.getDefaultPlayers(type, name)
        val pawns = Constant.getDefaultPawns(4)
        return Pair(player, pawns)
    }
}
