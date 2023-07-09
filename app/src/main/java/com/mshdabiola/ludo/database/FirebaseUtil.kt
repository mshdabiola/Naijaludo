package com.mshdabiola.ludo.database

import com.google.android.gms.games.PlayGames
import com.google.android.gms.games.leaderboard.LeaderboardScore
import com.google.android.gms.games.leaderboard.LeaderboardVariant
import com.mshdabiola.ludo.MainActivity
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
}