package com.mshdabiola.util.multiplayer

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
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.isActive
import timber.log.Timber
import java.io.DataInputStream
import java.io.DataOutputStream
import java.io.IOException
import java.io.InputStream
import java.util.UUID

@SuppressLint("MissingPermission")
class Manager(
    private val context: Context,
) {

    private var bluetoothAdapter: BluetoothAdapter? = null
    private var bluetoothSocket: BluetoothSocket? = null

    private val serverUUId: UUID = UUID.fromString("2ab96c10-fc98-4e78-88cd-4572b747d420")
    private val serviceName = "manager"

    val state = MutableStateFlow<ManagerState?>(null)

    private var deviceList: Set<BluetoothDevice>? = null

    private var receiver: BroadcastReceiver? = null

    fun setUp() {
        Timber.d("setup")
        receiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context?, intent: Intent) {
                Timber.d("action is ${intent.action}")

                Timber.d("on receive bluetooth disconnect")
                onErrorOccurBluetooth(Exception("receive disconnect bluetooth"))
            }
        }

        val filter = IntentFilter().apply {
            addAction(BluetoothDevice.ACTION_ACL_DISCONNECTED)
        }
        context.registerReceiver(receiver, filter)
        bluetoothAdapter = (
                context.getSystemService(Context.BLUETOOTH_SERVICE)
                        as BluetoothManager
                ).adapter

        state.value = ManagerState()
    }

    fun isBluetoothEnable() = bluetoothAdapter?.isEnabled == true

    suspend fun onServer() {
        Timber.d("start server1")
        try {
            val bluetoothServerSocket = bluetoothAdapter
                ?.listenUsingRfcommWithServiceRecord(serviceName, serverUUId)

            bluetoothServerSocket?.accept()?.apply {
                bluetoothSocket = this
            }
            state.value = state.value?.copy(connected = true)
//            sendString(
//                "setting,$name,$pawnNumber,$style"
//            )
            bluetoothSocket?.let { collectRead(it.inputStream) }
            Timber.d("start server2")
        } catch (e: Exception) {
            Timber.d("On Server exception")
            onErrorOccurBluetooth(e)
        }
    }

    suspend fun onBlueDevice(blueIndex: Int) {
        try {
            val device = deviceList?.elementAt(blueIndex)
            bluetoothSocket = device?.createRfcommSocketToServiceRecord(serverUUId)
            bluetoothSocket?.connect()
            state.value = state.value?.copy(connected = true)
            // sendString("client_name,$name")
            bluetoothSocket?.let { collectRead(it.inputStream) }
        } catch (e: Exception) {
            Timber.d("exception in connecting bluetooth")
            onErrorOccurBluetooth(e)
        }
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
                if (bluetoothSocket?.isConnected != true) {
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
            bluetoothSocket?.let {
                DataOutputStream(it.outputStream).apply {
                    writeUTF(str)
                    flush()
                }
                Timber.d("send successful")
            }
        } catch (exception: IOException) {
            onErrorOccurBluetooth(exception)
        }
    }

    fun getAppDevice(): List<String> {
        deviceList = bluetoothAdapter?.bondedDevices
        return deviceList?.map { it.name } ?: emptyList()
    }

    private fun onErrorOccurBluetooth(throwable: Throwable) {
        state.value = state.value?.copy(connected = false)

        throwable.printStackTrace()
        // close()
    }

    fun close() {
        Timber.d("close bluetooth")

        bluetoothSocket?.inputStream?.close()
        bluetoothSocket?.outputStream?.close()
        bluetoothSocket?.close()
        bluetoothSocket = null
        if (receiver != null) {
            context.unregisterReceiver(receiver)
            receiver = null
        }

        bluetoothAdapter = null
        state.value = null
    }

    fun bluetoothPermission(context: Context): List<String> {
        Timber.d("canConnect called")
        val deniedPermissions = ArrayList<String>()

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.S) {
            if (!checkPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION)) {
                deniedPermissions.add(Manifest.permission.ACCESS_COARSE_LOCATION)
            }
            if (!checkPermission(context, Manifest.permission.ACCESS_FINE_LOCATION)) {
                deniedPermissions.add(Manifest.permission.ACCESS_FINE_LOCATION)
            }
        }
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.S) { // Build.VERSION_CODES.S or later
            if (!checkPermission(context, Manifest.permission.BLUETOOTH_CONNECT)) {
                deniedPermissions.add(Manifest.permission.BLUETOOTH_CONNECT)
            }
        }
        return deniedPermissions
    }

    private fun checkPermission(context: Context, permission: String): Boolean {
        return context.checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED
    }
}

data class ManagerState(
    // val devices: List<String>?,
    val connected: Boolean? = null,
    val message: String = "",
)
