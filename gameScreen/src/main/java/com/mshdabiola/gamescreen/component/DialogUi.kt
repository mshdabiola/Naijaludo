package com.mshdabiola.gamescreen.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import com.mshdabiola.designsystem.component.DialogUi
import com.mshdabiola.gamescreen.state.PlayerUiState
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList

@Composable
fun StartDialog(
    show: Boolean = true,
    onBackPress: () -> Unit = {},
    showContinueButton: Boolean = true,
    onYouAndComputer: () -> Unit = {},
    onTournament: () -> Unit = {},
    onContinueButton: () -> Unit = {}
) {
    AnimatedVisibility(visible = show) {
        DialogUi(
            title = { Text(text = "Start Game") },
            onDismissRequest = { /*TODO*/ },
            content = {

                Row(Modifier.fillMaxWidth()) {

                    GameCard(
                        Modifier.weight(1f),
                        title = "Resume Game",
                        buttonText = "Continue",
                        buttonEnable = showContinueButton,
                        onButtonClick = onContinueButton
                    )
                    Spacer(modifier = Modifier.width(8.dp))

                    GameCard(
                        Modifier.weight(1f),
                        title = "Vs Robot",
                        onButtonClick = onYouAndComputer
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                Row(Modifier.fillMaxWidth()) {
                    GameCard(
                        Modifier.weight(1f),
                        title = "Vs 3 Robots",
                        onButtonClick = onTournament
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Box(Modifier.weight(1f))
                }
            },
            buttons = {
                TextButton(onClick = onBackPress) {
                    Text(text = "Back")
                }
            },
            properties = DialogProperties(dismissOnBackPress = false, dismissOnClickOutside = false)
        )
    }
}

@Preview
@Composable
fun StartDialogPreview() {
    StartDialog()
}

@Composable
fun GameOverDialog(
    show: Boolean = true,
    players: ImmutableList<PlayerUiState>,
    onRestart: () -> Unit = {},
    onHome: () -> Unit = {}
) {
    val humanWin by remember(players) {
        derivedStateOf { players.indexOfFirst { it.isCurrent } == players.lastIndex }
    }
    AnimatedVisibility(visible = show) {
        DialogUi(
            onDismissRequest = { /*TODO*/ },
            properties = DialogProperties(
                dismissOnBackPress = false,
                dismissOnClickOutside = false
            ),
            content = {
                players.forEach {
                    PlayerUi(player = it)
                }
                Spacer(modifier = Modifier.height(8.dp))
                if (humanWin) {
                    Text(text = "Hurray!! You win the game")
                } else {
                    Text(text = "0ppps!! You loss, try again")
                }
                Spacer(modifier = Modifier.height(8.dp))
            },
            buttons = {
                IconButton(onClick = onHome) {
                    Icon(imageVector = Icons.Default.Home, contentDescription = "")
                }
                IconButton(onClick = { }) {
                    Icon(imageVector = Icons.Default.Share, contentDescription = "")
                }
                Button(onClick = onRestart) {
                    Icon(imageVector = Icons.Default.Refresh, contentDescription = "")
                    Text(text = "Play Again")
                }
            },
            title = { Text(text = "Game Over") }
        )
    }
}

@Preview
@Composable
fun GameOverPreview() {
    GameOverDialog(
        players = listOf(
            PlayerUiState(),
            PlayerUiState(),
            PlayerUiState(isCurrent = true)
        ).toImmutableList()
    )
}

@Composable
fun GameCard(
    modifier: Modifier = Modifier,
    imageVector: ImageVector = Icons.Default.Settings,
    title: String = "Vs Computer",
    buttonText: String = "Play",
    buttonEnable: Boolean = true,
    onButtonClick: () -> Unit = {}
) {
    Card(modifier = modifier) {
        Column(Modifier.padding(8.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(
                modifier = Modifier
                    .aspectRatio(1f),
                imageVector = imageVector, contentDescription = "null"
            )
            Text(text = title, style = MaterialTheme.typography.titleMedium)
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                Button(onClick = onButtonClick, enabled = buttonEnable) {
                    Text(text = buttonText)
                }
            }
        }
    }
}

@Preview
@Composable
fun GameCardPreview() {
    GameCard()
}
