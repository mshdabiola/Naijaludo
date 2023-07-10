package com.mshdabiola.worker.util

import kotlinx.serialization.Serializable

@Serializable
data class PlayerPojo(
    val id: Int,
    val gameId: Long,
    val name: String,
    val win: Int,
    val isCurrent: Boolean,
    val isHuman: Boolean,
)


@Serializable
data class PawnPojo(
    val id: Int = 0,
    val gameId: Long,
    val currentPos: Int,
    val playerId: Int,
)

