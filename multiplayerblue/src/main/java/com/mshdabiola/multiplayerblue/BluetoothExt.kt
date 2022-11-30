package com.mshdabiola.multiplayerblue

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothSocket
import java.io.IOException
import java.util.UUID
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.isActive

fun BluetoothDevice.createRfcommSocket(channel: Int): BluetoothSocket {
    try {
        val method = this.javaClass.getMethod("createRfcommSocket", Integer.TYPE)
        return method.invoke(this, channel) as BluetoothSocket
    } catch (e: Exception) {
        throw UnsupportedOperationException(e)
    }
}

fun BluetoothDevice.isConnected(): Boolean {
    try {
        val method = this.javaClass.getMethod("isConnected")
        return method.invoke(this) as Boolean
    } catch (e: Exception) {
        throw UnsupportedOperationException(e)
    }
}

// @ExperimentalCoroutinesApi
// fun BluetoothAdapter.discoverDevices(context: Context) =
//    BlueFlow.getInstance(context).discoverDevices()

@SuppressLint("MissingPermission")
suspend fun BluetoothDevice.connectAsClientAsync(uuid: UUID, secure: Boolean = true) =
    coroutineScope {
        return@coroutineScope async(Dispatchers.IO) {
            val bluetoothSocket =
                if (secure) createRfcommSocketToServiceRecord(uuid)
                else createInsecureRfcommSocketToServiceRecord(uuid)
            bluetoothSocket.also { it.connect() }
        }
    }

@ExperimentalCoroutinesApi
fun BluetoothSocket.readByteStream() = channelFlow {
    while (isActive) {
        try {
//            offer(inputStream.read().toByte())
            this.trySend(inputStream.read().toByte()).isSuccess
        } catch (e: IOException) {
            error("Couldn't read bytes from flow. Disconnected")
        }
    }
}.flowOn(Dispatchers.IO)

@ExperimentalCoroutinesApi
fun BluetoothSocket.readByteArrayStream(
    delayMillis: Long = 1000,
    minExpectedBytes: Int = 2,
    bufferCapacity: Int = 1024,
    readInterceptor: (ByteArray) -> ByteArray? = { it }
): Flow<ByteArray> = channelFlow {
    if (inputStream == null) {
        throw NullPointerException("inputStream is null. Perhaps bluetoothSocket is also null")
    }
    val buffer = ByteArray(bufferCapacity)
    val byteAccumulatorList = mutableListOf<Byte>()
    while (isActive) {
        try {
            if (inputStream.available() < minExpectedBytes) {
                delay(delayMillis)
                continue
            }
            val numBytes = inputStream.read(buffer)
            val readBytes = buffer.trim(numBytes)
            if (byteAccumulatorList.size >= bufferCapacity)
                byteAccumulatorList.clear()

            byteAccumulatorList.addAll(readBytes.toList())
            val interceptor = readInterceptor(byteAccumulatorList.toByteArray())

            if (interceptor == null)
                delay(delayMillis)

            interceptor?.let {
                this.trySend(it).isSuccess
//                offer(it)
                byteAccumulatorList.clear()
            }
        } catch (e: IOException) {
            byteAccumulatorList.clear()
            close()
            error("Couldn't read bytes from flow. Disconnected")
        }
    }
}.flowOn(Dispatchers.IO)

fun BluetoothSocket.send(bytes: ByteArray): Boolean {

    if (!isConnected) return false

    return try {
        outputStream.write(bytes)
        outputStream.flush()
        true
    } catch (e: IOException) {
        e.printStackTrace()
        false
    }
}
