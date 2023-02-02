package com.mshdabiola.gamescreen.component

import android.annotation.SuppressLint
import android.app.Activity
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.android.gms.games.PlayGames
import com.google.android.gms.games.leaderboard.LeaderboardVariant
import com.mshdabiola.designsystem.R

@Composable
fun RankCard(
    modifier: Modifier=Modifier,
    @StringRes leadRes :Int=R.string.player_one_leaderboard) {

    var rank by remember {
        mutableStateOf(1L)
    }
    val leaderString= stringResource(id = leadRes)
    val context= LocalContext.current

    LaunchedEffect(key1 = Unit, block = {
        PlayGames.getLeaderboardsClient(context as Activity)
            .loadCurrentPlayerLeaderboardScore(leaderString,
                LeaderboardVariant.TIME_SPAN_ALL_TIME,
                LeaderboardVariant.COLLECTION_PUBLIC)
            .addOnSuccessListener {
               rank= it.get()?.rank ?:0
            }
            .addOnFailureListener{
                it.printStackTrace()
            }
    })


        Column(
            modifier,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Card (
                Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                ),
                elevation = CardDefaults.cardElevation(defaultElevation = 16.dp)
            ){

                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(4.dp),
                        text = "Rank $rank",
                        textAlign = TextAlign.Center
                    )


            }
           // Spacer(modifier = Modifier.height(4.dp))
            TextButton(onClick = {
                val activity=context as Activity
                PlayGames.getLeaderboardsClient(activity)
                    .getLeaderboardIntent(leaderString)
                    .addOnSuccessListener {
                        activity.startActivityForResult(it,23)
                    }
                    .addOnFailureListener {
                        it.printStackTrace()
                    }
            }) {
                Text(text = "More")
            }
        }

    }


@SuppressLint("ResourceType")
@Preview(showBackground = true)
@Composable
fun RankCardPreview() {
    RankCard(
        Modifier.width(70.dp),
        leadRes = 343)
}