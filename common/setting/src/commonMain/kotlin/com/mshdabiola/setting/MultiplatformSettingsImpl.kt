package com.mshdabiola.setting

import com.mshdabiola.naijaludo.model.Constant
import com.mshdabiola.naijaludo.model.Pawn
import com.mshdabiola.naijaludo.model.Setting
import com.mshdabiola.naijaludo.model.player.Player
import com.mshdabiola.setting.model.GameSaver
import com.mshdabiola.setting.model.LogLudoData
import com.mshdabiola.setting.model.SettingSeri
import com.mshdabiola.setting.model.User
import com.mshdabiola.setting.model.toPair
import com.mshdabiola.setting.model.toPawnSeri
import com.mshdabiola.setting.model.toSaver
import com.mshdabiola.setting.model.toSetting
import com.mshdabiola.setting.model.toSettingSeri
import com.russhwolf.settings.ExperimentalSettingsApi
import com.russhwolf.settings.coroutines.FlowSettings
import com.russhwolf.settings.coroutines.toBlockingSettings
import com.russhwolf.settings.serialization.decodeValue
import com.russhwolf.settings.serialization.decodeValueOrNull
import com.russhwolf.settings.serialization.encodeValue
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi

@OptIn(ExperimentalSettingsApi::class)
internal class MultiplatformSettingsImpl(
    private val settings: FlowSettings,
    private val coroutineDispatcher: CoroutineDispatcher
) : MultiplatformSettings {

    private val _setting = MutableStateFlow(
        getGameSetting()
    )
    override val setting: Flow<Setting>
        get() = _setting.asStateFlow()


    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun setGameSetting(setting: Setting) {
        _setting.update {
            setting
        }
        withContext(coroutineDispatcher) {
            settings.toBlockingSettings()
                .encodeValue(SettingSeri.serializer(), Keys.setting, setting.toSettingSeri())
        }


    }

    @OptIn(ExperimentalSerializationApi::class)
    fun getGameSetting(): Setting {
        return settings.toBlockingSettings()
            .decodeValueOrNull(
                SettingSeri.serializer(), Keys.setting
            )?.toSetting() ?: Setting.default
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun setGame(players: List<Player>, pawns: List<Pawn>) {
        withContext(coroutineDispatcher) {
            val key = "type_${players.size}"
            val saver = GameSaver(players = players.map { it.toSaver() },
                pawns = pawns.map { it.toPawnSeri() })
            settings.toBlockingSettings().encodeValue(GameSaver.serializer(), key, saver)
        }
    }


    @OptIn(ExperimentalSerializationApi::class)
    override fun getGame(type: Int, name: String): Pair<List<Player>, List<Pawn>> {
        val key = "type_$type"


        return settings.toBlockingSettings()
            .decodeValueOrNull(GameSaver.serializer(), key)
            ?.toPair() ?: getDefaultPlayer(type, name)

    }

    override fun getName(): String {
        val name = getUser().name
        return name
    }


    @OptIn(ExperimentalSerializationApi::class)
    override fun getUser(): User {
        return settings.toBlockingSettings()
            .decodeValue(
                User.serializer(), "user", defaultValue =
                User(id = "", photoUri = "", name = "Human")
            )
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun setUser(user: User) {
        withContext(coroutineDispatcher) {
            settings.toBlockingSettings()
                .encodeValue(User.serializer(), "user", user)
        }
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun setLog2(ludoLog: LogLudoData) {
        withContext(coroutineDispatcher) {
            settings.toBlockingSettings()
                .encodeValue(LogLudoData.serializer(), "log2", ludoLog)
        }
    }

    @OptIn(ExperimentalSerializationApi::class)
    override fun getLog2(): LogLudoData {
        return settings.toBlockingSettings()
            .decodeValue(
                LogLudoData.serializer(), "log2",
                LogLudoData(
                    neverKillInGame = true,
                    numberOfTimeKill = 0,
                    startTime = System.currentTimeMillis() * 1000
                )
            )
    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun setLog4(ludoLog: LogLudoData) {
        withContext(coroutineDispatcher) {
            settings.toBlockingSettings()
                .encodeValue(LogLudoData.serializer(), "log4", ludoLog)
        }
    }

    @OptIn(ExperimentalSerializationApi::class)
    override fun getLog4(): LogLudoData {
        return settings.toBlockingSettings()
            .decodeValue(
                LogLudoData.serializer(), "log4",
                LogLudoData(
                    neverKillInGame = true,
                    numberOfTimeKill = 0,
                    startTime = System.currentTimeMillis() * 1000
                )
            )
    }

    override  fun getCurrentBoard() =
            settings
                .getStringFlow(Keys.currentBoard,"default_board")
                .flowOn(coroutineDispatcher)


    override suspend fun setCurrentBoard(string: String) {
        withContext(coroutineDispatcher){
            settings.putString(Keys.currentBoard,string)
        }
    }

    override  fun getCurrentDice()=
            settings.getStringFlow(Keys.currentDice,"default_dice")
                .flowOn(coroutineDispatcher)


    override suspend fun setCurrentDice(string: String) {
        withContext(coroutineDispatcher){
            settings.putString(Keys.currentDice,string)
        }
    }

    override suspend fun getPurchaseItems(): List<String> {
        return withContext(coroutineDispatcher){
          val p=  settings.getStringOrNull(Keys.purchaseBoard)
            p?.split(",") ?: emptyList()
        }
    }

    override suspend fun setPurchaseItems(strBoard: List<String>) {
        withContext(coroutineDispatcher){
            settings.putString(Keys.purchaseBoard,strBoard.joinToString())
        }
    }


    private fun getDefaultPlayer(type: Int, name: String): Pair<List<Player>, List<Pawn>> {
        val player = Constant.getDefaultPlayers(type, name)
        val pawns = Constant.getDefaultPawns(4)
        return Pair(player, pawns)
    }

}
