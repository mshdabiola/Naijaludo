package com.mshdabiola.ludo.database

import android.app.Activity
import android.graphics.drawable.Drawable
import android.net.Uri
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.nativeCanvas
import androidx.lifecycle.lifecycleScope
import com.google.android.gms.common.images.ImageManager
import com.google.android.gms.games.AuthenticationResult
import com.google.android.gms.games.PlayGames
import com.google.android.gms.games.Player
import com.google.android.gms.games.SnapshotsClient
import com.google.android.gms.games.leaderboard.LeaderboardVariant
import com.google.android.gms.games.snapshot.SnapshotMetadataChange
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.PlayGamesAuthProvider
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.mshdabiola.ludo.MainActivity
import com.mshdabiola.ludo.R
import com.mshdabiola.setting.model.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okio.internal.commonToUtf8String
import timber.log.Timber
import java.io.File
import java.io.FileOutputStream
import java.net.URL
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

object FirebaseUtil {


    private suspend fun getLeaderScore(path: String, activity: MainActivity) =
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

    suspend fun getLeaderScore(type: Int, activity: MainActivity): Long {
        val path = if (type == 2)
            activity.resources.getString(R.string.leaderboard_solo_player_rank)
        else
            activity.resources.getString(R.string.leaderboard_trio_player_rank)

        return getLeaderScore(path, activity)?.rawScore ?: 0

    }

    suspend fun getName(activity: MainActivity) =
        suspendCoroutine { continuation ->
            PlayGames.getPlayersClient(activity)
                .currentPlayer
                .addOnSuccessListener {

                    continuation.resume(it.toUser())
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

    suspend fun getSaveScore(type: Int, activity: MainActivity): IntArray {
        val rankScore = getLeaderScore(type, activity).toInt()
        val saveScore = get2Game(activity, type)

        return saveScore.mapIndexed { index, numb ->
            if (index == saveScore.lastIndex)
                rankScore
            else
                numb
        }.toIntArray()
    }

    private suspend fun get2Game(activity: MainActivity, numb: Int) = suspendCoroutine { cont ->

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

    private fun downloadImage(uri: String) {
            try {
                val dir = File("", "image")
                if (dir.exists().not()) {
                    dir.mkdirs()
                }
                val file = File(dir, "profile.png")
                if (file.exists())
                    return
                val input = URL(uri).openStream()

                val outputStream = FileOutputStream(file)
                input.copyTo(outputStream)
                outputStream.close()
                input.close()
                Timber.e("download")
            } catch (e: Exception) {
                e.printStackTrace()
            }




    }




}

fun Player.toUser() = User(
    id = "",
    photoUri = this.hiResImageUri?.toString() ?: "",
    name = this.displayName
)