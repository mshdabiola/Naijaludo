package com.mshdabiola.data

import kotlinx.coroutines.flow.MutableStateFlow

interface IP2pManager {
    val state: MutableStateFlow<P2pManagerState?>
    fun setUp()

    suspend fun connect()

    suspend fun connectToDevice(blueIndex: Int): Unit?
    fun discoverDevice()
    fun sendString(str: String)
    fun close()
}

data class P2pManagerState(
    val devices: List<String> = emptyList(),
    val connected: Boolean? = null,
    val message: String = "",
    val isServer: Boolean = false,
    val serverConnected: Boolean? = null, // null for notting false for error true for connected
    val ownerAddress: String? = null,
)
