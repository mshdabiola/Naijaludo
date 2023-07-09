package com.mshdabiola.ludo.database

import android.app.Activity
import com.google.android.gms.games.PlayGames
import com.google.android.gms.games.SnapshotsClient
import com.google.android.gms.games.leaderboard.LeaderboardScore
import com.google.android.gms.games.leaderboard.LeaderboardVariant
import com.google.android.gms.games.snapshot.SnapshotMetadataChange
import com.mshdabiola.ludo.MainActivity
import okio.internal.commonToUtf8String
import timber.log.Timber
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

object FirebaseUtil {

    fun getRanks(){

//        PlayGames.getLeaderboardsClient(activity)
//            .loadCurrentPlayerLeaderboardScore(
//                "+",
//                LeaderboardVariant.TIME_SPAN_ALL_TIME,
//                LeaderboardVariant.COLLECTION_PUBLIC,
//            )
//            .addOnSuccessListener { scoreAnnotatedData ->
//                val rank = scoreAnnotatedData.get()?.rank ?: 0
//
//                scoreAnnotatedData.get()?.let {
//                   // updateScore(it.rawScore, it.scoreHolderDisplayName)
//                }
//            }
//            .addOnFailureListener {
//                it.printStackTrace()
//            }
    }

    suspend fun rank(path:String,activity: MainActivity)= suspendCoroutine<LeaderboardScore?> {countinueation->
        PlayGames.getLeaderboardsClient(activity)
            .loadCurrentPlayerLeaderboardScore(
                path,
                LeaderboardVariant.TIME_SPAN_ALL_TIME,
                LeaderboardVariant.COLLECTION_PUBLIC,
            )
            .addOnSuccessListener { scoreAnnotatedData ->
                countinueation.resume(scoreAnnotatedData.get())
            }
            .addOnFailureListener {
                countinueation.resumeWithException(it)
            }
    }

     fun saveGame(string: String,totalScore:Long,numb:Int,activity: Activity) {
        val snap = PlayGames.getSnapshotsClient(activity)
        val meta = SnapshotMetadataChange.Builder()
            .setDescription("saved game")
            .setProgressValue(totalScore)
            .build()


        snap.open("type_$numb", true)

            .addOnSuccessListener {
                it.data?.let { it1 ->
                    it1.snapshotContents.writeBytes(string.toByteArray())

                    snap.commitAndClose(it1,meta)
                        .addOnSuccessListener {
                            Timber.e("Save game $string")
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

     suspend fun get2Game(activity: Activity,numb: Int)= suspendCoroutine { cont->

        val snap = PlayGames.getSnapshotsClient(activity)


        snap.open("type_$numb", true, SnapshotsClient.RESOLUTION_POLICY_HIGHEST_PROGRESS)

            .addOnSuccessListener {
                val t=it.data?.snapshotContents?.readFully()
                val string=t?.commonToUtf8String()
                Timber.e("get game $string")
               cont.resume(string)

            }
            .addOnFailureListener {
               cont.resumeWithException(it)
            }
    }

}