package com.mshdabiola.naijaludo

import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.player.RemotePlayer
import java.io.InputStream
import java.io.OutputStream
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

data class OfflinePlayer(
    override val inputStream: InputStream,
    override val outputStream: OutputStream,
    override val name: String = "C. Player",
    override val win: Int = 0,
    override val isCurrent: Boolean = false,
    override val colors: List<GameColor> = emptyList(),
    override val iconIndex: Int = 0
) : RemotePlayer {

    override suspend fun sendDice(dice1: Int, dice2: Int) {
        val out = "$dice1,$dice2"
        sendString(out, outputStream)
    }

    override suspend fun getDice(): Pair<Int, Int> {
        val string = getString(inputStream)

        val str = string.split(",")
        return Pair(str[0].toInt(), str[1].toInt())
    }

    override suspend fun sendCounter(counterId: Int) {
        val out = "$counterId"
        sendString(out, outputStream)
    }

    override suspend fun getCounter(): Int {
        val string = getString(inputStream)
        return string.toInt()
    }

    override suspend fun sendPawn(pawnId: Int) {
        val out = "$pawnId"
        sendString(out, outputStream)
    }

    override suspend fun getPawn(): Int {
        val string = getString(inputStream)

        return string.toInt()
    }

    override fun copyPlayer(
        inputStream: InputStream,
        outputStream: OutputStream,
        name: String,
        win: Int,
        isCurrent: Boolean,
        colors: List<GameColor>
    ): RemotePlayer {
        return copy(
            inputStream = inputStream,
            outputStream = outputStream,
            name = name,
            win = win,
            isCurrent = isCurrent,
            colors = colors,
            iconIndex = iconIndex
        )
    }

    companion object {
        suspend fun getString(inputStream: InputStream): String {

            // delay(3000)
            while (true) {
                delay(300)
                var byteArray = ByteArray(80)
                val size = inputStream.read(byteArray)

                if (size > 0) {
                    byteArray = byteArray.trim(size)
                    return byteArray.toString(Charsets.UTF_8)
                }
            }
        }

        suspend fun sendString(str: String, outputStream: OutputStream) =
            withContext(Dispatchers.IO) {
                val out = str.toByteArray(Charsets.UTF_8)
                outputStream.write(out)
                outputStream.flush()
            }
    }
}

fun ByteArray.trim(size: Int): ByteArray {
    val data = ByteArray(size)
    System.arraycopy(this, 0, data, 0, size)
    return data
}
