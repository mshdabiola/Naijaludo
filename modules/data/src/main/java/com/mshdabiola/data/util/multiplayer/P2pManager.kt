package com.mshdabiola.data.util.multiplayer

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.NetworkInfo
import android.net.wifi.WifiManager
import android.net.wifi.WpsInfo
import android.net.wifi.p2p.WifiP2pConfig
import android.net.wifi.p2p.WifiP2pDevice
import android.net.wifi.p2p.WifiP2pDeviceList
import android.net.wifi.p2p.WifiP2pManager
import android.os.Build
import com.mshdabiola.data.IP2pManager
import com.mshdabiola.data.P2pManagerState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.isActive
import kotlinx.coroutines.withContext
import java.io.DataInputStream
import java.io.DataOutputStream
import java.io.IOException
import java.io.InputStream
import java.net.InetSocketAddress
import java.net.ServerSocket
import java.net.Socket

@SuppressLint("MissingPermission")
class P2pManager(
    private val context: Context,
) : IP2pManager {

    var manager: WifiP2pManager? = null
    var channel: WifiP2pManager.Channel? = null
    private var socket: Socket? = null
    override val state = MutableStateFlow<P2pManagerState?>(null)
    private var deviceList: Set<WifiP2pDevice>? = null
    private var receiver: BroadcastReceiver? = null
    private val port = 8888

    override fun setUp() {
        com.mshdabiola.naijaludo.model.log("setup")

        manager = context.getSystemService(Context.WIFI_P2P_SERVICE) as? WifiP2pManager
        channel = manager?.initialize(context, context.mainLooper, null)
        manager?.requestGroupInfo(channel) {
            if (it != null) {
                manager?.removeGroup(
                    channel,
                    object : WifiP2pManager.ActionListener {
                        override fun onSuccess() {
                            com.mshdabiola.naijaludo.model.log("remove group")
                        }

                        override fun onFailure(p0: Int) {
                            com.mshdabiola.naijaludo.model.log("remove fail")
                        }
                    },
                )
            }
        }

        receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context, intent: Intent) {
                when (intent.action!!) {
                    WifiP2pManager.WIFI_P2P_STATE_CHANGED_ACTION -> {
                        // Check to see if Wi-Fi is enabled and notify appropriate activity
                        val state = intent
                            .getIntExtra(WifiP2pManager.EXTRA_WIFI_STATE, -1)
                        when (state) {
                            WifiP2pManager.WIFI_P2P_STATE_ENABLED -> {
                                // Wifi P2P is enabled
                                com.mshdabiola.naijaludo.model.log("wifi enabled")
                            }

                            else -> {
                                // Wi-Fi P2P is not enabled
                                com.mshdabiola.naijaludo.model.log("wifi disabled")
                            }
                        }
                    }

                    WifiP2pManager.WIFI_P2P_PEERS_CHANGED_ACTION -> {
                        // Call WifiP2pManager.requestPeers() to get a list of current peers
                        com.mshdabiola.naijaludo.model.log("on peer changed")
                        manager?.requestPeers(channel) { peers: WifiP2pDeviceList? ->
                            peers?.deviceList?.let { wifiP2pDevices ->
                                deviceList = wifiP2pDevices.toSet()
                                state.value =
                                    state
                                        .value
                                        ?.copy(devices = wifiP2pDevices.map { it.deviceName })
                            }
                            peers?.deviceList?.forEach {
                                com.mshdabiola.naijaludo.model.log("name ${it.deviceName} address${it?.deviceAddress}")
                            }
                        }
                    }

                    WifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION -> {
                        // Respond to new connection or disconnections
                        val networkInfo = intent
                            .getParcelableExtra<NetworkInfo>(WifiManager.EXTRA_NETWORK_INFO)
                        if (networkInfo?.isConnected == true) {
                            manager?.requestConnectionInfo(channel) { wifiP2pInfo ->
                                wifiP2pInfo.isGroupOwner
                                wifiP2pInfo.groupFormed
                                wifiP2pInfo.groupOwnerAddress

                                if (wifiP2pInfo.isGroupOwner && wifiP2pInfo.groupFormed) {
                                    manager?.requestGroupInfo(
                                        channel,
                                    ) {
                                        it.passphrase
                                        it.isGroupOwner
                                        it.clientList
                                        // it.frequency
                                        it.networkName

                                        state.value = state
                                            .value?.copy(isServer = true, connected = true)
                                    }
                                } else if (wifiP2pInfo.groupFormed) {
                                    com.mshdabiola.naijaludo.model.log("Init client")
                                    state.value = state
                                        .value?.copy(
                                        ownerAddress = wifiP2pInfo
                                            .groupOwnerAddress
                                            .hostAddress,
                                        isServer = false,
                                        connected = true,
                                    )
                                }
                            }
                        } else {
                            if (state.value?.connected == true) {
                                com.mshdabiola.naijaludo.model.log("disconnect")
                            }
                        }

                        com.mshdabiola.naijaludo.model.log("connection")
                    }

                    WifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION -> {
                        // Respond to this device's wifi state changing
                        com.mshdabiola.naijaludo.model.log("device changed")
                        val device = intent
                            .getParcelableExtra<WifiP2pDevice>(
                                WifiP2pManager.EXTRA_WIFI_P2P_DEVICE,
                            )
                    }
                }
            }
        }

        val filter = IntentFilter().apply {
            addAction(WifiP2pManager.WIFI_P2P_STATE_CHANGED_ACTION)
            addAction(WifiP2pManager.WIFI_P2P_PEERS_CHANGED_ACTION)
            addAction(WifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION)
            addAction(WifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION)
        }
        context.registerReceiver(receiver, filter)

        state.value = P2pManagerState()
    }

    override suspend fun connect() {
        com.mshdabiola.naijaludo.model.log("is Server ${state.value?.isServer}")

        if (state.value?.isServer == true) {
            startServer()
        } else {
            startClient()
        }
    }

    private suspend fun startServer() = withContext(Dispatchers.IO) {
        com.mshdabiola.naijaludo.model.log("start server1")
        try {
            val serverSocket = ServerSocket()
            serverSocket.bind(InetSocketAddress(port))
            socket = serverSocket.accept()
            state.value = state.value?.copy(serverConnected = true)
            socket?.let { collectRead(it.inputStream) }

            com.mshdabiola.naijaludo.model.log("start server2")
        } catch (e: Exception) {
            com.mshdabiola.naijaludo.model.log("On Server exception")
            onErrorOccurBluetooth(e)
        }
    }

    private suspend fun startClient() = withContext(Dispatchers.IO) {
        com.mshdabiola.naijaludo.model.log("start client1")
        try {
            socket = Socket()
            socket?.bind(null)
            socket?.connect(InetSocketAddress(state.value!!.ownerAddress, port))
            state.value = state.value?.copy(serverConnected = true)
            // sendString("client_name,$name")
            socket?.let { collectRead(it.inputStream) }
            com.mshdabiola.naijaludo.model.log("start client2")
        } catch (e: Exception) {
            com.mshdabiola.naijaludo.model.log("exception in connecting bluetooth")
            onErrorOccurBluetooth(e)
        }
    }

    override suspend fun connectToDevice(blueIndex: Int) = withContext(Dispatchers.IO) {
        val device = deviceList?.elementAt(blueIndex)

        val config = WifiP2pConfig().apply {
            deviceAddress = device!!.deviceAddress
            wps.setup = WpsInfo.PBC
        }
        manager?.connect(
            channel,
            config,
            object : WifiP2pManager.ActionListener {

                override fun onSuccess() {
                    com.mshdabiola.naijaludo.model.log("connected successful")
                }

                override fun onFailure(reason: Int) {
                    com.mshdabiola.naijaludo.model.log("connected fail")
                }
            },
        )
    }

    override fun discoverDevice() {
        manager?.discoverPeers(
            channel,
            object : WifiP2pManager.ActionListener {
                override fun onSuccess() {
                    com.mshdabiola.naijaludo.model.log("discover peer")
                }

                override fun onFailure(p0: Int) {
                    com.mshdabiola.naijaludo.model.log("fail to Discover peer")
                }
            },
        )
    }

    private fun readByteArrayStream(
        inputStream: InputStream,
        delayMillis: Long = 1000,
    ): Flow<String> = channelFlow {
        while (isActive) {
            try {
                delay(delayMillis)

                val numBytes = DataInputStream(inputStream).readUTF()

                if (!numBytes.isNullOrBlank()) {
                    this.trySend(numBytes).isSuccess
                }

//
            } catch (e: IOException) {
                close()
                error("Couldn't read bytes from flow. Disconnected")
            } finally {
                if (socket?.isConnected != true) {
                    close()
                    break
                }
            }
        }
    }.flowOn(Dispatchers.IO)

    private suspend fun collectRead(inputStream: InputStream) {
        readByteArrayStream(inputStream)
            .catch {
                onErrorOccurBluetooth(it)
            }
            .collect {
                state.value = state.value?.copy(message = it)
            }
    }

    override fun sendString(str: String) {
        try {
            socket?.let {
                DataOutputStream(it.outputStream).apply {
                    writeUTF(str)
                    flush()
                }
                com.mshdabiola.naijaludo.model.log("send successful")
            }
        } catch (exception: IOException) {
            onErrorOccurBluetooth(exception)
        }
    }

    private fun onErrorOccurBluetooth(throwable: Throwable) {
        state.value = state.value?.copy(serverConnected = false)

        throwable.printStackTrace()
        // close()
    }

    override fun close() {
        com.mshdabiola.naijaludo.model.log("close bluetooth")

        try {
            if (socket?.isConnected == true) {
                socket?.inputStream?.close()
                socket?.outputStream?.close()
                socket?.close()
            }
            socket = null
        } catch (e: Exception) {
            e.printStackTrace()
        }

        try {
            if (receiver != null) {
                context.unregisterReceiver(receiver)
                receiver = null
            }

            manager?.cancelConnect(
                channel,
                object : WifiP2pManager.ActionListener {
                    override fun onSuccess() {
                        com.mshdabiola.naijaludo.model.log("cancel succesful")
                    }

                    override fun onFailure(p0: Int) {
                        com.mshdabiola.naijaludo.model.log("cancel error")
                    }
                },
            )
            manager?.removeGroup(
                channel,
                object : WifiP2pManager.ActionListener {
                    override fun onSuccess() {
                        com.mshdabiola.naijaludo.model.log("remove succesful")
                    }

                    override fun onFailure(p0: Int) {
                        com.mshdabiola.naijaludo.model.log("remove error")
                    }
                },
            )
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1) {
                channel?.close()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

        state.value = null
    }
}
