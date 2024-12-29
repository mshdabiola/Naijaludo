package com.mshdabiola.testing.fake

import com.mshdabiola.naijaludo.model.IP2pManager
import com.mshdabiola.naijaludo.model.P2pManagerState
import kotlinx.coroutines.flow.MutableStateFlow

class FakeP2pManager : IP2pManager {
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
