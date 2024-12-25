package com.mshdabiola.datastore

import com.mshdabiola.model.LogLudoData
import com.mshdabiola.model.User
import com.mshdabiola.model.UserData
import com.mshdabiola.naijaludo.model.Constant
import com.mshdabiola.naijaludo.model.Pawn
import com.mshdabiola.naijaludo.model.Setting
import com.mshdabiola.naijaludo.model.player.Player
import io.github.xxfast.kstore.KStore
import io.github.xxfast.kstore.storage.storeOf
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

class StoreImple : Store {
    private val store: KStore<UserData> = storeOf(key = "my_cats", default = UserData())
    override val userData: Flow<UserData>
        get() = store.updates.map { it ?: UserData() }

    override suspend fun updateUserData(transform: suspend (UserData) -> UserData): UserData {
        val data = transform(userData.first())
        store.update { data }
        return data
    }

    override val setting: Flow<Setting>
        get() = MutableStateFlow(Setting.default)

    override suspend fun setGameSetting(setting: Setting) {
    }

    override suspend fun setGame(players: List<Player>, pawns: List<Pawn>) {
    }

    override fun getGame(type: Int, name: String): Pair<List<Player>, List<Pawn>> {
        return getDefaultPlayer(type, name)
    }

    override fun getName(): String {
        return "Abiola"
    }

    override fun getUser(): User {
        return User("1234", "", "Abiola")
    }

    override suspend fun setUser(user: User) {
    }

    override suspend fun setLog2(ludoLog: LogLudoData) {
    }

    override suspend fun getLog2(): LogLudoData {
        return LogLudoData(
            neverKillInGame = true,
            numberOfTimeKill = 0,
            startTime = 1 * 1000,
        )
    }

    override suspend fun setLog4(ludoLog: LogLudoData) {
    }

    override fun getLog4(): LogLudoData {
        return LogLudoData(
            neverKillInGame = true,
            numberOfTimeKill = 0,
            startTime = 1 * 1000,
        )
    }

    override fun getCurrentBoard(): Flow<String> {
        return flow { "man_2" }
    }

    override suspend fun setCurrentBoard(string: String) {
    }

    override fun getCurrentDice(): Flow<String> {
        return flow { "default_dice" }
    }

    override suspend fun setCurrentDice(string: String) {
    }

    override suspend fun getPurchaseItems(): List<String> {
        return emptyList()
    }

    override suspend fun setPurchaseItems(strBoard: List<String>) {
    }

    private fun getDefaultPlayer(type: Int, name: String): Pair<List<Player>, List<Pawn>> {
        val player = Constant.getDefaultPlayers(type, name)
        val pawns = Constant.getDefaultPawns(4)
        return Pair(player, pawns)
    }
}
