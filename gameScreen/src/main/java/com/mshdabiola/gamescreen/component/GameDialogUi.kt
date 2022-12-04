package com.mshdabiola.gamescreen.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import com.mshdabiola.designsystem.R
import com.mshdabiola.designsystem.component.DialogUi
import com.mshdabiola.designsystem.theme.FinishTheme
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
    onContinueButton: () -> Unit = {},
    onJoinClick: () -> Unit = {},
    onHostClick: () -> Unit = {}
) {
    AnimatedVisibility(visible = show) {
        DialogUi(
            title = { Text(text = stringResource(id = R.string.start_game_dialog_title)) },
            onDismissRequest = { },
            content = {

                Row(Modifier.fillMaxWidth()) {

                    GameCard(
                        Modifier.weight(1f),
                        title = stringResource(id = R.string.continue_detail),
                        buttonText = stringResource(id = R.string.continue_btn),
                        buttonEnable = showContinueButton,
                        onButtonClick = onContinueButton,
                        imageVector = ImageVector
                            .vectorResource(id = R.drawable.resource_continue)
                    )
                    Spacer(modifier = Modifier.width(8.dp))

                    GameCard(
                        Modifier.weight(1f),
                        title = stringResource(id = R.string.vs_one_comp_detail),
                        onButtonClick = onYouAndComputer,
                        imageVector = ImageVector.vectorResource(id = R.drawable.computer)
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                Row(Modifier.fillMaxWidth()) {
                    GameCard(
                        Modifier.weight(1f),
                        title = stringResource(id = R.string.vs_many_comp_detail),
                        onButtonClick = onTournament,
                        imageVector = ImageVector.vectorResource(id = R.drawable.computers)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    GameCard2(
                        Modifier.weight(1f),
                        title = stringResource(id = R.string.blutooth_multi_desc),
                        onButtonClick = onJoinClick,
                        imageVector = ImageVector.vectorResource(id = R.drawable.computers),
                        onButtonClick2 = onHostClick,
                    )
                }
            },
            buttons = {
                TextButton(onClick = onBackPress) {
                    Text(text = stringResource(id = R.string.back_btn))
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
                FinishTheme {
                    players.forEach {
                        PlayerUi(player = it)
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    if (humanWin) {
                        Text(text = stringResource(id = R.string.player_win_msg))
                    } else {
                        Text(text = stringResource(id = R.string.player_loss_msg))
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                }
            },
            buttons = {
                IconButton(onClick = onHome) {
                    Icon(imageVector = Icons.Default.Home, contentDescription = "home")
                }
                IconButton(onClick = { }) {
                    Icon(imageVector = Icons.Default.Share, contentDescription = "share")
                }
                Button(onClick = onRestart) {
                    Icon(
                        imageVector = Icons.Default.Refresh,
                        contentDescription = stringResource(id = R.string.play_again_btn)
                    )
                    Text(text = stringResource(id = R.string.play_again_btn))
                }
            },
            title = { Text(text = stringResource(id = R.string.game_over_dialog_title)) }
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
    buttonText: String = stringResource(id = R.string.play),
    buttonEnable: Boolean = true,
    onButtonClick: () -> Unit = {}
) {
    Card(modifier = modifier) {
        Column(Modifier.padding(8.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(
                modifier = Modifier
                    .aspectRatio(1f),
                imageVector = imageVector, contentDescription = null
            )
            Text(text = title, style = MaterialTheme.typography.titleSmall)
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
@Composable
fun GameCard2(
    modifier: Modifier = Modifier,
    imageVector: ImageVector = Icons.Default.Settings,
    title: String = "Vs Computer",
    buttonText: String = stringResource(id = R.string.join),
    onButtonClick: () -> Unit = {},
    buttonText2: String = stringResource(id = R.string.host),
    onButtonClick2: () -> Unit = {}
) {
    Card(modifier = modifier) {
        Column(Modifier.padding(8.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(
                modifier = Modifier
                    .aspectRatio(1f),
                imageVector = imageVector, contentDescription = null
            )
            Text(text = title, style = MaterialTheme.typography.titleSmall)
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                Button(
                    onClick = onButtonClick2,
                    shape = RoundedCornerShape(
                        topStart = 50f, topEnd = 0f,
                        bottomStart = 50f, bottomEnd = 0f
                    ),
                    contentPadding = PaddingValues(4.dp)

                ) {
                    Text(text = buttonText2)
                }
                Spacer(modifier = Modifier.width(4.dp))
                Button(
                    onClick = onButtonClick,
                    shape = RoundedCornerShape(
                        topStart = 0f, topEnd = 50f,
                        bottomStart = 0f, bottomEnd = 50f
                    ),
                    contentPadding = PaddingValues(4.dp)

                ) {
                    Text(text = buttonText)
                }
            }
        }
    }
}

@Preview
@Composable
fun GameCardPreview2() {
    GameCard2()
}

@Composable
fun GameMultiPlayerWaitingDialog(
    show: Boolean,
    isServe: Boolean = true,
    connected: Boolean = false,
    onCancelClick: () -> Unit = {}

) {
    val message = when {
        isServe && connected -> "Server Connected"
        !isServe && connected -> "Client Connected"
        isServe -> "Waiting for Client"
        else -> "Connecting to server"
    }

    AnimatedVisibility(visible = show) {
        DialogUi(

            onDismissRequest = { /*TODO*/ },
            properties = DialogProperties(
                dismissOnBackPress = false,
                dismissOnClickOutside = false
            ),
            content = {
                CircularProgressIndicator()
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = message)
            },
            buttons = {
                TextButton(onClick = onCancelClick) {
                    Text(text = "Cancel")
                }
            },

            title = { Text(text = stringResource(id = R.string.game_over_dialog_title)) }
        )
    }
}

@Preview
@Composable
fun GameMultiPlayerPreview() {
    GameMultiPlayerWaitingDialog(
        show = true
    )
}

@Composable
fun GameMultiPlayerListDialog(
    show: Boolean,
    deviceList: ImmutableList<String>? = emptyList<String>().toImmutableList(),
    onDeviceClick: (Int) -> Unit = {},
    onCancelClick: () -> Unit = {}

) {

    AnimatedVisibility(visible = show) {
        DialogUi(
            modifier = Modifier.height(280.dp),
            onDismissRequest = { /*TODO*/ },
            properties = DialogProperties(
                dismissOnBackPress = false,
                dismissOnClickOutside = false
            ),
            content = {
                Column() {
                    deviceList?.let {

                        it.forEachIndexed { index, deviceName ->

                            Text(
                                text = deviceName,
                                modifier = Modifier.clickable {
                                    onDeviceClick(index)
                                }
                            )
                        }
                    }
                }
            },
            buttons = {
                TextButton(onClick = onCancelClick) {
                    Text(text = "Cancel")
                }
            },

            title = { Text(text = stringResource(id = R.string.game_over_dialog_title)) }
        )
    }
}

@Preview
@Composable
fun GameMultiPlayerListPreview() {
    GameMultiPlayerListDialog(
        show = true,
        deviceList = listOf("Tecno", "Infinix", "oppo").toImmutableList()
    )
}
