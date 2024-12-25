package com.mshdabiola.data

import kotlinx.coroutines.flow.MutableStateFlow

class P2pManager : IP2pManager {
    override val state: MutableStateFlow<P2pManagerState?>
        get() = MutableStateFlow(null)

    override fun setUp() {
    }

    override suspend fun connect() {
    }

    override suspend fun connectToDevice(blueIndex: Int): Unit? {
        return Unit
    }

    override fun discoverDevice() {
    }

    override fun sendString(str: String) {
    }

    override fun close() {
    }
}
