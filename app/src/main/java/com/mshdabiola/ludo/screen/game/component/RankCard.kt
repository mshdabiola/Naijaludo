package com.mshdabiola.ludo.screen.game.component

import android.annotation.SuppressLint
import android.app.Activity
import android.content.ActivityNotFoundException
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.android.gms.games.PlayGames
import com.google.android.gms.games.leaderboard.LeaderboardVariant
import com.mshdabiola.ludo.R

@SuppressLint("VisibleForTests")
@Composable
fun RankCard(
    modifier: Modifier = Modifier,
    @StringRes leadRes: Int = R.string.leaderboard_solo_player_rank,
) {
    var rank by remember {
        mutableStateOf<Long?>(null)
    }
    val leaderString = stringResource(id = leadRes)
    val context = LocalContext.current
    var showCard by remember {
        mutableStateOf(false)
    }

    LaunchedEffect(key1 = Unit, block = {

        PlayGames.getLeaderboardsClient(context as Activity)
            .loadCurrentPlayerLeaderboardScore(
                leaderString,
                LeaderboardVariant.TIME_SPAN_ALL_TIME,
                LeaderboardVariant.COLLECTION_PUBLIC,
            )
            .addOnSuccessListener { scoreAnnotatedData ->
                rank = scoreAnnotatedData.get()?.rank

//                scoreAnnotatedData.get()?.let {
//                    updateScore(it.rawScore, it.scoreHolderDisplayName)
//                }
            }
            .addOnFailureListener {
                it.printStackTrace()
            }

        PlayGames.getGamesSignInClient(context)
            .isAuthenticated
            .addOnSuccessListener {
                it.isAuthenticated
                showCard = it.isAuthenticated
            }
            .addOnFailureListener {
                it.printStackTrace()
            }
    })

    if (showCard && rank != null) {
        Column(
            modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Card(
                Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                ),
                elevation = CardDefaults.cardElevation(defaultElevation = 16.dp),
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(4.dp),
                    text = "Rank $rank",
                    textAlign = TextAlign.Center,
                )
            }
            // Spacer(modifier = Modifier.height(4.dp))
            TextButton(onClick = {
                try {
                    val activity = context as Activity
                    PlayGames.getLeaderboardsClient(activity)
                        .getLeaderboardIntent(leaderString)
                        .addOnSuccessListener {
                            activity.startActivityForResult(it, 23)
                        }
                        .addOnFailureListener {
                            it.printStackTrace()
                        }
                } catch (e: ActivityNotFoundException) {
                    e.printStackTrace()
                } catch (e: Exception) {
                    e.printStackTrace()
                }


            }) {
                Text(text = "More")
            }
        }
    }

}

@SuppressLint("ResourceType")
@Preview(showBackground = true)
@Composable
fun RankCardPreview() {
    RankCard(
        Modifier.width(70.dp),
        leadRes = 343,
        // updateScore = { _, _ -> }
    )
}
