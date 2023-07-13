package com.mshdabiola.ludo.database

import android.app.Activity
import com.google.android.gms.games.AuthenticationResult
import com.google.android.gms.games.PlayGames
import com.google.android.gms.games.SnapshotsClient
import com.google.android.gms.games.leaderboard.LeaderboardVariant
import com.google.android.gms.games.snapshot.SnapshotMetadataChange
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.PlayGamesAuthProvider
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.mshdabiola.ludo.MainActivity
import com.mshdabiola.setting.model.User
import okio.internal.commonToUtf8String
import timber.log.Timber
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

object FirebaseUtil {


    suspend fun getLeaderScore(path: String, activity: MainActivity) =
        suspendCoroutine { countinueation ->
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

    suspend fun getName(activity: MainActivity) =
        suspendCoroutine { continuation ->
           PlayGames.getPlayersClient(activity)
               .currentPlayer
               .addOnSuccessListener {
                   continuation.resume(it.displayName)
               }
               .addOnFailureListener {
                   continuation.resumeWithException(it)
               }
        }

    fun saveGame(string: String, totalScore: Long, numb: Int, activity: Activity) {

        if (string.isNotBlank()) {
            val snap = PlayGames.getSnapshotsClient(activity)
            val meta = SnapshotMetadataChange.Builder()
                .setDescription("saved game")
                .setProgressValue(totalScore)
                .build()


            snap.open("game_$numb", true)

                .addOnSuccessListener {
                    it.data?.let { it1 ->
                        it1.snapshotContents.writeBytes(string.toByteArray())

                        snap.commitAndClose(it1, meta)
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


    }

    suspend fun get2Game(activity: Activity, numb: Int) = suspendCoroutine { cont ->

        val snap = PlayGames.getSnapshotsClient(activity)


        snap.open("game_$numb", true, SnapshotsClient.RESOLUTION_POLICY_HIGHEST_PROGRESS)

            .addOnSuccessListener {
                val t = it.data?.snapshotContents?.readFully()
                val string =
                    t?.commonToUtf8String()
                val intArray = string?.split(", ")?.map {
                    it.toInt()
                }?.toIntArray() ?: IntArray(numb) { 0 }
                Timber.e("get game ${intArray.joinToString()}")
                cont.resume(intArray)

            }
            .addOnFailureListener {
                cont.resumeWithException(it)
            }
    }

    suspend fun login(activity: Activity, onSigning: (Boolean) -> Unit = {}) =
        suspendCoroutine<Unit> { cont ->

            val gamesSignInClient = PlayGames.getGamesSignInClient(activity)

            gamesSignInClient.isAuthenticated()
                .addOnCompleteListener { isAuthenticatedTask: Task<AuthenticationResult> ->

                    val isAuthenticated = isAuthenticatedTask.isSuccessful &&
                            isAuthenticatedTask.result.isAuthenticated
                    if (isAuthenticated) {
                        onSigning(true)
                    } else {
                        // Disable your integration with Play Games Services or show a
                        // login button to ask  players to sign-in. Clicking it should
                        gamesSignInClient.signIn().addOnSuccessListener {
                            onSigning(it.isAuthenticated)
                        }.addOnFailureListener {
                            cont.resumeWithException(it)
                        }
                    }
                }
                .addOnFailureListener {
                    cont.resumeWithException(it)
                }

        }

    suspend fun loginForFirebase(
        activity: Activity,
        requestCode: String,
        onSigning: (FirebaseUser) -> Unit = {}
    ) = suspendCoroutine<Unit> { cont ->

        val gamesSignInClient = PlayGames.getGamesSignInClient(activity)
        gamesSignInClient.requestServerSideAccess(
            requestCode, true
        )
            .addOnSuccessListener { code ->
                val auth = Firebase.auth
                val credential = PlayGamesAuthProvider.getCredential(code)
                auth.signInWithCredential(credential)
                    .addOnCompleteListener(activity) { task ->
                        if (task.isSuccessful) {

                            val user = auth.currentUser
                            user?.let {
                                onSigning(it)
                            }

                        } else {
                            task.exception?.let {
                                cont.resumeWithException(it)

                            }

                        }
                    }
            }
            .addOnFailureListener {
                cont.resumeWithException(it)
            }


    }


}

fun FirebaseUser.toUser()= User(
    id = this.uid,
    photoUri = this.photoUrl?.toString()?:"",
    name = this.displayName ?:""
)