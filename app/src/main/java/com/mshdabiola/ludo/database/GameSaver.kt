package com.mshdabiola.ludo.database

import android.app.Activity
import com.google.android.gms.games.PlayGames
import com.google.android.gms.games.SnapshotsClient
import com.google.android.gms.games.snapshot.SnapshotMetadataChange
import okio.internal.commonToUtf8String
import timber.log.Timber

class GameSaver(
) : IGameSaver {
    override suspend fun saveGame(byte: ByteArray, numb: Int, activity: Activity) {
        val snap = PlayGames.getSnapshotsClient(activity)
        val meta = SnapshotMetadataChange.Builder()
            .setDescription("saved game")

            .build()


        snap.open("abiola", true, SnapshotsClient.RESOLUTION_POLICY_LAST_KNOWN_GOOD)

            .addOnSuccessListener {
                it.data?.let { it1 ->
                    it1.snapshotContents.writeBytes(byte)

                    snap.commitAndClose(it1, meta)
                        .addOnSuccessListener {
                            Timber.e("Save game")
                        }
                        .addOnFailureListener {
                            it.printStackTrace()
                        }

                }

            }
            .addOnFailureListener {
                it.printStackTrace()
            }

    }

    override fun get2Game(activity: Activity) {

        val snap = PlayGames.getSnapshotsClient(activity)


        snap.open("abiola", true, SnapshotsClient.RESOLUTION_POLICY_LAST_KNOWN_GOOD)

            .addOnSuccessListener {
                val t = it.data?.snapshotContents?.readFully()
                Timber.e("load game : ${t?.commonToUtf8String()}")

            }
            .addOnFailureListener {
                it.printStackTrace()
            }
    }

    override fun get4Game() {
        TODO("Not yet implemented")
    }
}