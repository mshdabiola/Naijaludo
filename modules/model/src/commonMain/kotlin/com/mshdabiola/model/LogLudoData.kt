package com.mshdabiola.model

import kotlinx.serialization.Serializable

@Serializable
data class LogLudoData(
    val neverKillInGame: Boolean = true,
    val numberOfTimeKill: Int = 0,
    val startTime: Long = 1000, // System.currentTimeMillis() * 1000,
)
