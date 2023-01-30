package com.mshdabiola.gamescreen.component

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.provider.Settings
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.LocationOn
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import com.mshdabiola.designsystem.R
import com.mshdabiola.designsystem.component.DialogUi
import com.mshdabiola.designsystem.icon.LudoIcon
import com.mshdabiola.designsystem.theme.FinishTheme
import com.mshdabiola.gamescreen.state.PlayerUiState
import com.mshdabiola.ludo.model.log
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList

@Composable
fun StartDialog(
    show: Boolean = true,
    onBackPress: () -> Unit = {},
    onYouAndComputer: () -> Unit = {},
    onTournament: () -> Unit = {},
    onFriend: () -> Unit = {},
    onJoinClick: () -> Unit = {},
) {
    AnimatedVisibility(visible = show) {
        DialogUi(
            title = { Text(text = stringResource(id = R.string.start_game_dialog_title)) },
            onDismissRequest = { },
            content = {
                Column(
                    Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState()),
                ) {
                    Row(Modifier.fillMaxWidth()) {
                        GameCard(
                            Modifier.weight(1f),
                            title = stringResource(id = R.string.vs_one_comp_detail),
                            onButtonClick = onYouAndComputer,
                            imageVector = ImageVector.vectorResource(id = R.drawable.computer),
                        )
                        Spacer(modifier = Modifier.width(8.dp))

                        GameCard(
                            Modifier.weight(1f),
                            title = stringResource(id = R.string.vs_many_comp_detail),
                            onButtonClick = onTournament,
                            imageVector = ImageVector.vectorResource(id = R.drawable.computer_multiplayer),
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(Modifier.fillMaxWidth()) {
                        GameCard(
                            Modifier.weight(1f),
                            title = stringResource(id = R.string.blutooth_multi_desc),
                            onButtonClick = onJoinClick,
                            imageVector = ImageVector.vectorResource(id = R.drawable.mutiplay),
                            buttonText = stringResource(id = R.string.connect),
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        GameCard(
                            Modifier.weight(1f),
                            title = stringResource(id = R.string.vs_friend),
                            onButtonClick = onFriend,
                            imageVector = ImageVector.vectorResource(id = R.drawable.friend),
                        )
                    }
                }
            },
            buttons = {
                TextButton(onClick = onBackPress) {
                    Text(text = stringResource(id = R.string.back_btn))
                }
            },
            properties = DialogProperties(
                dismissOnBackPress = false,
                dismissOnClickOutside = false,
            ),
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
                dismissOnClickOutside = false,
            ),
            content = {
                FinishTheme {
                    Column(
                        Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        LazyColumn(
                            Modifier.weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
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
                        contentDescription = stringResource(id = R.string.play_again_btn),
                    )
                    Text(text = stringResource(id = R.string.play_again_btn))
                }
            },
            title = { Text(text = stringResource(id = R.string.game_over_dialog_title)) },
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
            PlayerUiState(isCurrent = true),
        ).toImmutableList(),
    )
}

@Composable
fun GameCard(
    modifier: Modifier = Modifier,
    imageVector: ImageVector = Icons.Default.Settings,
    title: String = "Vs Computer",
    buttonText: String = stringResource(id = R.string.play),
    buttonEnable: Boolean = true,
    onButtonClick: () -> Unit = {},
) {
    Card(modifier = modifier) {
        Column(Modifier.padding(8.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(
                modifier = Modifier
                    .aspectRatio(1f),
                imageVector = imageVector,
                contentDescription = null,
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

// @Composable
// fun GameCard2(
//    modifier: Modifier = Modifier,
//    imageVector: ImageVector = Icons.Default.Settings,
//    title: String = "Vs Computer",
//    buttonText: String = stringResource(id = R.string.join),
//    onButtonClick: () -> Unit = {},
//    buttonText2: String = stringResource(id = R.string.host),
//    onButtonClick2: () -> Unit = {},
// ) {
//    Card(modifier = modifier) {
//        Column(Modifier.padding(8.dp), horizontalAlignment = Alignment.CenterHorizontally) {
//            Icon(
//                modifier = Modifier
//                    .aspectRatio(1f),
//                imageVector = imageVector,
//                contentDescription = null,
//            )
//            Text(text = title, style = MaterialTheme.typography.titleSmall)
//            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
//                Button(
//                    onClick = onButtonClick2,
//                    shape = RoundedCornerShape(
//                        topStart = 50f,
//                        topEnd = 0f,
//                        bottomStart = 50f,
//                        bottomEnd = 0f,
//                    ),
//                    contentPadding = PaddingValues(4.dp),
//
//                    ) {
//                    Text(text = buttonText2)
//                }
//                Spacer(modifier = Modifier.width(4.dp))
//                Button(
//                    onClick = onButtonClick,
//                    shape = RoundedCornerShape(
//                        topStart = 0f,
//                        topEnd = 50f,
//                        bottomStart = 0f,
//                        bottomEnd = 50f,
//                    ),
//                    contentPadding = PaddingValues(4.dp),
//
//                    ) {
//                    Text(text = buttonText)
//                }
//            }
//        }
//    }
// }

// @Preview
// @Composable
// fun GameCardPreview2() {
//    GameCard2()
// }

@Composable
fun WaitingDialog(
    show: Boolean,
//    isServe: Boolean = true,
    connected: Boolean = false,
    onCancelClick: () -> Unit = {},
    startGame: () -> Unit = {},

) {
    val message = if (connected) "This device is connected" else "Connecting"
//        when {
//        isServe && connected -> stringResource(id = R.string.server_connected
//        )
//        !isServe && connected -> stringResource(id = R.string.client_connected)
//        isServe -> stringResource(id = R.string.waiting_for_client)
//        else -> stringResource(id = R.string.connecting_to_server)
//    }

    AnimatedVisibility(visible = show) {
        DialogUi(
            modifier = Modifier.height(280.dp),
            onDismissRequest = { },
            properties = DialogProperties(
                dismissOnBackPress = false,
                dismissOnClickOutside = false,
            ),
            content = {
                Column(
                    Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                ) {
                    AnimatedVisibility(connected) {
                        Box(
                            Modifier
                                .background(Color.Green, CircleShape)
                                .size(44.dp),
                        ) {
                            Icon(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(4.dp),
                                imageVector = Icons.Default.Done,
                                contentDescription = "done",
                                tint = Color.White,
                            )
                        }
                    }

                    AnimatedVisibility(visible = !connected) {
                        CircularProgressIndicator()
                    }

                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = message)
                }
            },
            buttons = {
                TextButton(onClick = onCancelClick) {
                    Text(text = stringResource(id = R.string.cancel))
                }

                Button(onClick = startGame) {
                    Text(text = "Start game")
                }
            },
        )
    }
}

@Preview
@Composable
fun GameMultiPlayerPreview() {
    WaitingDialog(
        show = true,
    )
}

@Composable
fun DeviceListDialog(
    show: Boolean,
    deviceList: ImmutableList<String> = emptyList<String>().toImmutableList(),
    onDeviceClick: (Int) -> Unit = {},
    onCancelClick: () -> Unit = {},

) {
    val context = LocalContext.current
    AnimatedVisibility(visible = show) {
        DialogUi(
            modifier = Modifier.height(280.dp),
            onDismissRequest = { /*TODO*/ },
            properties = DialogProperties(
                dismissOnBackPress = false,
                dismissOnClickOutside = false,
            ),
            content = {
                LazyColumn(
                    Modifier
                        .padding(horizontal = 8.dp)
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(4.dp),
                ) {
                    if (deviceList.isEmpty()) {
                        item {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                            ) {
                                CircularProgressIndicator(Modifier.align(Alignment.Center))
                            }
                        }
                    }
                    itemsIndexed(deviceList, key = { _, it -> it.hashCode() }) { index, name ->
                        Row(
                            Modifier
                                .fillMaxWidth()
                                .height(44.dp)
                                .clickable {
                                    onDeviceClick(index)
                                },
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Text(
                                style = MaterialTheme.typography.titleSmall,
                                color = MaterialTheme.colorScheme.primary,
                                text = name,

                            )
                        }
                    }
                }
            },
            buttons = {
                TextButton(onClick = onCancelClick) {
                    Text(text = stringResource(id = R.string.cancel))
                }
            },

            title = { Text(text = stringResource(id = R.string.devices)) },
        )
    }
}

@Preview
@Composable
fun GameMultiPlayerListPreview() {
    DeviceListDialog(
        show = true,
        deviceList = listOf("Tecno", "Infinix", "oppo").toImmutableList(),
    )
}

@Composable
fun WifiPermission(
    show: Boolean = false,
    isLocationEnable: Boolean = false,
    isWifiEnable: Boolean = false,
    onDismissRequest: () -> Unit = {},
) {
    LocalContext.current
    val requestwifi = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartActivityForResult(),
        onResult = {
            log("request code is $it")
        },
    )
    AnimatedVisibility(visible = show) {
        DialogUi(

            modifier = Modifier.height(240.dp),
            onDismissRequest = { },
            title = {
                Text("Permission")
            },
            content = {
                if (!isWifiEnable) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            painter = painterResource(id = LudoIcon.Wifi),
                            contentDescription = "wifi",
                            tint = MaterialTheme.colorScheme.primary,
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(modifier = Modifier.weight(1f), text = "Open Wi-fi")
                        Button(onClick = {
                            // if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.Q){
                            requestwifi.launch(Intent(Settings.ACTION_WIFI_SETTINGS))
//                            }else{
//                                val wif=context.getSystemService(Context.WIFI_SERVICE) as WifiManager
//                                wif.isWifiEnabled=true
//
//                            }
                        }) {
                            Text(text = "Open")
                        }
                    }
                }
                if (!isLocationEnable) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Outlined.LocationOn,
                            contentDescription = "location",
                            tint = MaterialTheme.colorScheme.primary,
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(modifier = Modifier.weight(1f), text = "Open Gps")
                        Button(onClick = { requestwifi.launch(Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)) }) {
                            Text(text = "Open")
                        }
                    }
                }
            },
            buttons = {
                TextButton(onClick = { onDismissRequest() }) {
                    Text(text = "Close")
                }
            },

        )
    }
}

@Preview
@Composable
fun WifiPermissionPreview() {
    WifiPermission(
        show = true,
        isLocationEnable = false,
        isWifiEnable = false,
    )
}

@Composable
fun getPermission(): List<String> {
    val requestedPermissions = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        arrayOf(
            Manifest.permission.ACCESS_NETWORK_STATE,
            Manifest.permission.CHANGE_NETWORK_STATE,
            Manifest.permission.ACCESS_WIFI_STATE,
            Manifest.permission.CHANGE_WIFI_STATE,
            Manifest.permission.NEARBY_WIFI_DEVICES,
        )
    } else {
        arrayOf(
            Manifest.permission.ACCESS_NETWORK_STATE,
            Manifest.permission.CHANGE_NETWORK_STATE,
            Manifest.permission.ACCESS_WIFI_STATE,
            Manifest.permission.CHANGE_WIFI_STATE,
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.ACCESS_FINE_LOCATION,
        )
    }
    return requestedPermissions
        .filter { !checkPermission(permission = it) }
}

@Composable
fun checkPermission(permission: String): Boolean {
    val context = LocalContext.current
    return context.checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED
}
