package com.mshdabiola.multiplayerblue

import android.Manifest
import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.net.NetworkInfo
import android.net.wifi.WifiManager
import android.net.wifi.WpsInfo
import android.net.wifi.p2p.WifiP2pConfig
import android.net.wifi.p2p.WifiP2pDevice
import android.net.wifi.p2p.WifiP2pDeviceList
import android.net.wifi.p2p.WifiP2pManager
import android.os.Build
import com.mshdabiola.ludo.model.log
import dagger.hilt.android.qualifiers.ApplicationContext
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
import java.net.Socket
import javax.inject.Inject

@SuppressLint("MissingPermission")
class P2pManager
@Inject constructor(
    @ApplicationContext private val context: Context,
) {

    var manager: WifiP2pManager? = null
    var channel: WifiP2pManager.Channel? = null
    private var socket: Socket? = null
    val state = MutableStateFlow<P2pManagerState?>(null)
    private var deviceList: Set<WifiP2pDevice>? = null
    private var receiver: BroadcastReceiver? = null

    fun setUp() {
        log("setup")

        manager = context.getSystemService(Context.WIFI_P2P_SERVICE) as WifiP2pManager
        channel = manager?.initialize(context, context.mainLooper, null)

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
                                log("wifi enabled")
                            }

                            else -> {
                                // Wi-Fi P2P is not enabled
                                log("wifi disabled")
                            }
                        }
                    }

                    WifiP2pManager.WIFI_P2P_PEERS_CHANGED_ACTION -> {
                        // Call WifiP2pManager.requestPeers() to get a list of current peers
                        log("on peer changed")
                        manager?.requestPeers(channel) { peers: WifiP2pDeviceList? ->
                            peers?.deviceList?.let { wifiP2pDevices ->
                                deviceList = wifiP2pDevices.toSet()
                                state.value =
                                    state
                                        .value
                                        ?.copy(devices = wifiP2pDevices.map { it.deviceName })
                            }
                            peers?.deviceList?.forEach {
                                log("name ${it.deviceName} address${it?.deviceAddress}")
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
                                    log("Init client")
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
                        }

                        log("connection")
                    }

                    WifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION -> {
                        // Respond to this device's wifi state changing
                        log("device changed")
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

    suspend fun onServer() = withContext(Dispatchers.IO) {
        log("start server1")
        try {
//                val serverSocket = ServerSocket(8888)
//                socket = serverSocket.accept()
//
//                state.value = state.value?.copy(connected = true)
//
//                socket?.let { collectRead(it.inputStream) }

            log("start server2")
        } catch (e: Exception) {
            log("On Server exception")
            onErrorOccurBluetooth(e)
        }
    }

    suspend fun connectToDevice(blueIndex: Int) = withContext(Dispatchers.IO) {
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
                    log("connected successful")
                }

                override fun onFailure(reason: Int) {
                    log("connected fail")
                }
            },
        )
    }

    fun discoverDevice() {
        manager?.discoverPeers(
            channel,
            object : WifiP2pManager.ActionListener {
                override fun onSuccess() {
                    log("discover peer")
                }

                override fun onFailure(p0: Int) {
                    log("fail to Discover peer")
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

    fun sendString(str: String) {
        try {
            socket?.let {
                DataOutputStream(it.outputStream).apply {
                    writeUTF(str)
                    flush()
                }
                log("send successful")
            }
        } catch (exception: IOException) {
            onErrorOccurBluetooth(exception)
        }
    }

    private fun onErrorOccurBluetooth(throwable: Throwable) {
        state.value = state.value?.copy(connected = false)

        throwable.printStackTrace()
        // close()
    }

    fun close() {
        log("close bluetooth")

        socket?.inputStream?.close()
        socket?.outputStream?.close()
        socket?.close()
        socket = null
        if (receiver != null) {
            context.unregisterReceiver(receiver)
            receiver = null
        }

        manager?.cancelConnect(
            channel,
            object : WifiP2pManager.ActionListener {
                override fun onSuccess() {
                    log("cancel succesful")
                }

                override fun onFailure(p0: Int) {
                    log("cancel error")
                }
            },
        )
        manager?.removeGroup(
            channel,
            object : WifiP2pManager.ActionListener {
                override fun onSuccess() {
                    log("remove succesful")
                }

                override fun onFailure(p0: Int) {
                    log("remove error")
                }
            },
        )

        state.value = null
    }

    fun wifiPermission(context: Context): List<String> {
        log("canConnect called")
        val deniedPermissions = ArrayList<String>()

        val requestedPermissions = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            arrayOf(
                Manifest.permission.ACCESS_NETWORK_STATE,
                Manifest.permission.CHANGE_NETWORK_STATE,
                Manifest.permission.ACCESS_WIFI_STATE,
                Manifest.permission.CHANGE_WIFI_STATE,
                Manifest.permission.NEARBY_WIFI_DEVICES,
            )
        } else {
            arrayOf(
                Manifest.permission.ACCESS_NETWORK_STATE,
                Manifest.permission.CHANGE_NETWORK_STATE,
                Manifest.permission.ACCESS_WIFI_STATE,
                Manifest.permission.CHANGE_WIFI_STATE,
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.ACCESS_FINE_LOCATION,
            )
        }
        if (!checkPermission(context, Manifest.permission.ACCESS_NETWORK_STATE)) {
            deniedPermissions.add(Manifest.permission.ACCESS_NETWORK_STATE)
        }
        if (!checkPermission(context, Manifest.permission.CHANGE_NETWORK_STATE)) {
            deniedPermissions.add(Manifest.permission.CHANGE_NETWORK_STATE)
        }
        if (!checkPermission(context, Manifest.permission.ACCESS_WIFI_STATE)) {
            deniedPermissions.add(Manifest.permission.ACCESS_WIFI_STATE)
        }
        if (!checkPermission(context, Manifest.permission.CHANGE_WIFI_STATE)) {
            deniedPermissions.add(Manifest.permission.CHANGE_WIFI_STATE)
        }
        if (!checkPermission(
                context,
                Manifest.permission.NEARBY_WIFI_DEVICES,
            )
        ) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                deniedPermissions.add(Manifest.permission.NEARBY_WIFI_DEVICES)
            }
        } else {
            if (!checkPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION)) {
                deniedPermissions.add(Manifest.permission.ACCESS_COARSE_LOCATION)
            }
            if (!checkPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION)) {
                deniedPermissions.add(Manifest.permission.ACCESS_COARSE_LOCATION)
            }
        }

        return deniedPermissions
    }

    private fun checkPermission(context: Context, permission: String): Boolean {
        return context.checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED
    }
}

data class P2pManagerState(
    val devices: List<String> = emptyList(),
    val connected: Boolean? = null,
    val message: String = "",
    val isServer: Boolean = false,
    val serverConnected: Boolean? = null, // null for notting false for error true for connected
    val ownerAddress: String? = null,
)
