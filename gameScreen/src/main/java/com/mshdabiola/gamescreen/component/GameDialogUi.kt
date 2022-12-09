package com.mshdabiola.gamescreen.component

import android.content.Intent
import android.provider.Settings
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.FilledTonalButton
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
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
    onFriend: () -> Unit = {},
    onContinueButton: () -> Unit = {},
    onJoinClick: () -> Unit = {},
    onHostClick: () -> Unit = {}
) {
    AnimatedVisibility(visible = show) {
        DialogUi(
            title = { Text(text = stringResource(id = R.string.start_game_dialog_title)) },
            onDismissRequest = { },
            content = {

                Column(
                    Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                ) {
                    Row(Modifier.fillMaxWidth()) {

                        GameCard(
                            Modifier.weight(1f),
                            title = stringResource(id = R.string.continue_detail),
                            buttonText = stringResource(id = R.string.continue_btn),
                            buttonEnable = showContinueButton,
                            onButtonClick = onContinueButton,
                            imageVector = ImageVector
                                .vectorResource(id = R.drawable.resume)
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
                            imageVector = ImageVector.vectorResource(id = R.drawable.computer)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        GameCard2(
                            Modifier.weight(1f),
                            title = stringResource(id = R.string.blutooth_multi_desc),
                            onButtonClick = onJoinClick,
                            imageVector = ImageVector.vectorResource(id = R.drawable.blutooth),
                            onButtonClick2 = onHostClick,
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(Modifier.fillMaxWidth()) {
                        GameCard(
                            Modifier.weight(1f),
                            title = stringResource(id = R.string.vs_friend),
                            onButtonClick = onFriend,
                            imageVector = ImageVector.vectorResource(id = R.drawable.friend)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Box(
                            Modifier.weight(1f)
                        )
                    }
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
    onHome: () -> Unit = {},
    onShare: () -> Unit = {},
) {
    val humanWin by remember(players) {
        derivedStateOf { players.indexOfFirst { it.isCurrent } == players.lastIndex }
    }
    AnimatedVisibility(visible = show) {
        DialogUi(
            modifier = Modifier.heightIn(280.dp, 400.dp),
            onDismissRequest = { /*TODO*/ },
            properties = DialogProperties(
                dismissOnBackPress = false,
                dismissOnClickOutside = false
            ),
            content = {
                FinishTheme {
                    Column(
                        Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        LazyColumn(
                            Modifier.weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            items(players) {
                                PlayerUi(player = it)
                            }
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        if (humanWin) {
                            Text(text = stringResource(id = R.string.player_win_msg))
                        } else {
                            Text(text = stringResource(id = R.string.player_loss_msg))
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                    }
                }
            },
            buttons = {
                IconButton(onClick = onHome) {
                    Icon(imageVector = Icons.Default.Home, contentDescription = "home")
                }
                IconButton(onClick = onShare) {
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
fun WaitingDialog(
    show: Boolean,
    isServe: Boolean = true,
    connected: Boolean = false,
    onCancelClick: () -> Unit = {}

) {
    val message = when {
        isServe && connected -> stringResource(id = R.string.server_connected)
        !isServe && connected -> stringResource(id = R.string.client_connected)
        isServe -> stringResource(id = R.string.waiting_for_client)
        else -> stringResource(id = R.string.connecting_to_server)
    }

    AnimatedVisibility(visible = show) {
        DialogUi(
            modifier = Modifier.height(280.dp),
            onDismissRequest = { },
            properties = DialogProperties(
                dismissOnBackPress = false,
                dismissOnClickOutside = false
            ),
            content = {
                Column(
                    Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    CircularProgressIndicator()
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = message)
                }
            },
            buttons = {
                TextButton(onClick = onCancelClick) {
                    Text(text = stringResource(id = R.string.cancel))
                }
            }
        )
    }
}

@Preview
@Composable
fun GameMultiPlayerPreview() {
    WaitingDialog(
        show = true
    )
}

@Composable
fun DeviceListDialog(
    show: Boolean,
    deviceList: ImmutableList<String>? = emptyList<String>().toImmutableList(),
    onDeviceClick: (Int) -> Unit = {},
    onPairNewDevice: () -> Unit = {},
    onCancelClick: () -> Unit = {}

) {
    val context = LocalContext.current
    AnimatedVisibility(visible = show) {
        DialogUi(
            modifier = Modifier.height(280.dp),
            onDismissRequest = { /*TODO*/ },
            properties = DialogProperties(
                dismissOnBackPress = false,
                dismissOnClickOutside = false
            ),
            content = {

                LazyColumn(
                    Modifier
                        .padding(horizontal = 8.dp)
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    deviceList?.let {
                        itemsIndexed(it) { index, name ->
                            Row(
                                Modifier
                                    .fillMaxWidth()
                                    .clickable {
                                        onDeviceClick(index)
                                    }
                            ) {
                                Text(
                                    style = MaterialTheme.typography.titleSmall,
                                    color = MaterialTheme.colorScheme.primary,
                                    text = name

                                )
                            }
                        }
                        item {
                            Column(
                                Modifier.fillMaxWidth(),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = stringResource(id = R.string.client_pair_desc),
                                    textAlign = TextAlign.Center
                                )
                                FilledTonalButton(onClick = {
                                    onPairNewDevice()
                                    context.startActivity(
                                        Intent(
                                            Settings.ACTION_BLUETOOTH_SETTINGS
                                        )
                                    )
                                }) {
                                    Text(text = stringResource(id = R.string.pair_device_btn))
                                }
                            }
                        }
                    }
                }
            },
            buttons = {
                TextButton(onClick = onCancelClick) {
                    Text(text = stringResource(id = R.string.cancel))
                }
            },

            title = { Text(text = stringResource(id = R.string.devices)) }
        )
    }
}

@Preview
@Composable
fun GameMultiPlayerListPreview() {
    DeviceListDialog(
        show = true,
        deviceList = listOf("Tecno", "Infinix", "oppo").toImmutableList()
    )
}
