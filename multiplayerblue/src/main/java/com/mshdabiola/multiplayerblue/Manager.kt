package com.mshdabiola.multiplayerblue

import android.Manifest
import android.annotation.SuppressLint
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothManager
import android.bluetooth.BluetoothSocket
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.os.Build
import android.util.Log
import com.mshdabiola.ludo.model.log
import dagger.hilt.android.qualifiers.ApplicationContext
import java.io.DataInputStream
import java.io.IOException
import java.io.InputStream
import java.util.UUID
import javax.inject.Inject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.isActive

@SuppressLint("MissingPermission")
class Manager
@Inject constructor(
    @ApplicationContext private val context: Context
) {

    var bluetoothAdapter: BluetoothAdapter? = null
    var bluetoothSocket: BluetoothSocket? = null

    private val serverUUId: UUID = UUID.fromString("2ab96c10-fc98-4e78-88cd-4572b747d420")
    private val serviceName = "manager"

    val state = MutableStateFlow<ManagerState?>(null)

    var deviceList: Set<BluetoothDevice>? = null

    var receiver: BroadcastReceiver? = null

    fun setUp(isServer: Boolean) {
        setLog("setup")
        receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent?) {
                intent?.let {
                    log("action is ${it.action}")
                    when {
                        it.action == BluetoothDevice.ACTION_ACL_CONNECTED -> {

                            // connection?.onConnect()
                        }
                        it.action == BluetoothDevice.ACTION_ACL_DISCONNECTED -> {

                            // connection?.onDisconnect()
                            // close()
                        }

                        else -> {}
                    }
                }

                log("on receive")
            }
        }

        val filter = IntentFilter().apply {
            addAction(BluetoothDevice.ACTION_ACL_CONNECTED)
            addAction(BluetoothDevice.ACTION_ACL_DISCONNECTED)
            addAction(BluetoothDevice.ACTION_ACL_DISCONNECT_REQUESTED)
        }
        context.registerReceiver(receiver, filter)
        bluetoothAdapter = (
            context.getSystemService(Context.BLUETOOTH_SERVICE)
                as BluetoothManager
            ).adapter

        state.value = ManagerState(isServer = isServer, devices = emptyList())
    }

    fun isBluetoothEnable() = bluetoothAdapter?.isEnabled == true

    fun isAllPermissionGranted(): Boolean {
        return context
            .checkSelfPermission(
                Manifest.permission.BLUETOOTH_CONNECT
            ) == PackageManager.PERMISSION_GRANTED
    }

    fun onServer() {
        setLog("start server1")
        try {

            val bluetoothServerSocket = bluetoothAdapter
                ?.listenUsingRfcommWithServiceRecord(serviceName, serverUUId)

            bluetoothServerSocket?.accept()?.apply {
                bluetoothSocket = this
            }
            state.value = state.value?.copy(connected = true)
            setLog("start server2")
        } catch (e: Exception) {
            log("On Server exception")
            e.printStackTrace()
        }
    }

    fun onClient() {
        setLog("start client")

        getAppDevice()
    }

    fun onBlueDevice(blueIndex: Int) {
        try {
            val device = deviceList?.elementAt(blueIndex)
            bluetoothSocket = device?.createRfcommSocketToServiceRecord(serverUUId)
            bluetoothSocket?.connect()
            state.value = state.value?.copy(devices = null, connected = true)
        } catch (e: Exception) {
            log("on blue dice expection")
            e.printStackTrace()
        }
    }

    fun getAppDevice() {
        deviceList = bluetoothAdapter?.bondedDevices
        state.value = state.value?.copy(devices = deviceList?.map { it.name })
    }

    fun close() {
        setLog("Close")
        bluetoothAdapter = null
        bluetoothSocket = null
        if (receiver != null) {
            context.unregisterReceiver(receiver)
            receiver = null
        }
        state.value = null
    }

    fun setLog(msg: String) {
        Log.e(this::class.simpleName, msg)
    }

    private fun canConnect(): List<String> {
        log("canConnect called")
        val deniedPermissions = ArrayList<String>()

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.S) {
            if (!checkPermission(Manifest.permission.ACCESS_COARSE_LOCATION))
                deniedPermissions.add(Manifest.permission.ACCESS_COARSE_LOCATION)
            if (!checkPermission(Manifest.permission.ACCESS_FINE_LOCATION))
                deniedPermissions.add(Manifest.permission.ACCESS_FINE_LOCATION)
        }
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.S) { // Build.VERSION_CODES.S or later
//            if(!checkPermission(Manifest.permission.BLUETOOTH_SCAN))
//                deniedPermissions.add(Manifest.permission.BLUETOOTH_SCAN);
            if (!checkPermission(Manifest.permission.BLUETOOTH_CONNECT))
                deniedPermissions.add(Manifest.permission.BLUETOOTH_CONNECT)
        }
        return deniedPermissions
    }

    /**
     * This method checks if a runtime permission has been granted.
     * @param permission The permission to check.
     * @return <code>TRUE</code> if the permission has been granted, <code>FALSE</code> otherwise.
     */
    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    private fun checkPermission(permission: String): Boolean {
        return context.checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED
    }

    fun readByteArrayStream(
        inputStream: InputStream,
        delayMillis: Long = 1000,
    ): Flow<String> = channelFlow {

//        if (inputStream == null) {
//            throw NullPointerException("inputStream is null. Perhaps bluetoothSocket is also null")
//        }
//        val buffer = ByteArray(bufferCapacity)
//        val byteAccumulatorList = mutableListOf<Byte>()
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
                if (bluetoothSocket?.isConnected != true) {
                    close()
                    break
                }
            }
        }
    }.flowOn(Dispatchers.IO)
}

data class ManagerState(
    val isServer: Boolean,
    val devices: List<String>?,
    val connected: Boolean = false
)
fun ByteArray.trim(size: Int): ByteArray {
    val data = ByteArray(size)
    System.arraycopy(this, 0, data, 0, size)
    return data
}

interface Connection {
    fun onConnect()
    fun onDisconnect()
}
