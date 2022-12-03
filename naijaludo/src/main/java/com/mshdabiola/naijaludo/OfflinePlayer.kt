package com.mshdabiola.naijaludo

import java.io.InputStream
import java.io.OutputStream
import kotlinx.coroutines.delay

data class OfflinePlayer(
    val inputStream: InputStream,
    val outputStream: OutputStream
) {

    fun sendNameToServer(name: String) {
        val out = name.toByteArray(Charsets.UTF_8)
        outputStream.write(out)
        outputStream.flush()
    }
    suspend fun getNameFromClient(): String {
        return getString()
    }
    fun SendSettingToClient(
        numberPawn: Int,
        name: String
    ) {
        val out = "$numberPawn,$name".toByteArray(Charsets.UTF_8)
        outputStream.write(out)
        outputStream.flush()
    }
    suspend fun getSettingFromServer(): Pair<Int, String> {
        val string = getString()

        val str = string.split(",")
        return Pair(str[0].toInt(), str[1])
    }

    suspend fun getString(): String {

        // delay(3000)
        while (true) {
            delay(300)
            var byteArray = ByteArray(80)
            val size = inputStream.read(byteArray)
//                            val byteArray = it?.readBytes()
//                            val string = byteArray?.toString(Charsets.UTF_8)
//                            print("receive $string")

            if (size > 0) {
                byteArray = byteArray.trim(size)
                return byteArray.toString(Charsets.UTF_8)
            }
        }
    }

    fun ByteArray.trim(size: Int): ByteArray {
        val data = ByteArray(size)
        System.arraycopy(this, 0, data, 0, size)
        return data
    }
}
