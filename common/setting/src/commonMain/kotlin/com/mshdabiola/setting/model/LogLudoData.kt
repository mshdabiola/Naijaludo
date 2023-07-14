package com.mshdabiola.setting.model

import kotlinx.serialization.Serializable

@Serializable
data class LogLudoData(
    val neverKillInGame:Boolean,
    val numberOfTimeKill:Int,
    val startTime:Long,
)
