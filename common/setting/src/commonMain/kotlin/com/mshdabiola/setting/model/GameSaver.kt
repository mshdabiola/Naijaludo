package com.mshdabiola.setting.model

import kotlinx.serialization.Serializable

@Serializable
internal data class GameSaver(
    val players: List<SavePlayer>,
    val pawns: List<PawnSeri>,
)


internal fun GameSaver.toPair() = Pair(
    players.map { it.toOriginal() }, pawns.map { it.toPawn() })