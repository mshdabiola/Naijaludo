package com.mshdabiola.gamescreen

import android.annotation.SuppressLint
import android.bluetooth.BluetoothAdapter
import android.content.Intent
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.mshdabiola.designsystem.theme.LudoAppTheme
import com.mshdabiola.gamescreen.component.GameMultiPlayerListDialog
import com.mshdabiola.gamescreen.component.GameMultiPlayerWaitingDialog
import com.mshdabiola.gamescreen.component.GameOverDialog
import com.mshdabiola.gamescreen.component.StartDialog
import com.mshdabiola.gamescreen.state.LudoUiState
import com.mshdabiola.gamescreen.state.PointUiState
import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.GameType
import com.mshdabiola.ludo.model.navigation.DEVICE_TYPE
import com.mshdabiola.multiplayerblue.bluetoothPermission

@OptIn(ExperimentalLifecycleComposeApi::class, ExperimentalMaterial3Api::class)
@Composable
fun GameScreen(
    gameScreenViewModel: GameViewModel = hiltViewModel(),
    deviceType: DEVICE_TYPE = DEVICE_TYPE.DEFAULT,
    onBack: () -> Unit = {}
) {

    val gameUiState by gameScreenViewModel.gameUiState.collectAsStateWithLifecycle()
    val ludoGameState by gameScreenViewModel.ludoGameState.collectAsStateWithLifecycle()

    val observer = object : DefaultLifecycleObserver {
        override fun onResume(owner: LifecycleOwner) {
            super.onResume(owner)
            println("On Resume")
            gameScreenViewModel.onResume()
        }

        override fun onPause(owner: LifecycleOwner) {
            super.onDestroy(owner)
            println("On Pause")
            gameScreenViewModel.onPause()
        }
    }

    val lifecycle = LocalLifecycleOwner.current.lifecycle

    DisposableEffect(key1 = lifecycle) {
        lifecycle.addObserver(observer)

        onDispose {

            lifecycle.removeObserver(observer)
        }
    }

    val rotateF = remember {
        Animatable(0f)
    }
    LaunchedEffect(key1 = ludoGameState.rotate) {

        //   rotateF.snapTo(0f)
        if (ludoGameState.rotate)
            rotateF.animateTo(360f, tween(4000))
        else
            rotateF.snapTo(0f)
    }
    var isServer by remember {
        mutableStateOf(false)
    }
    val context = LocalContext.current

    val forResult = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartActivityForResult(),
        onResult = {
            if (isServer) {
                // start server
                gameScreenViewModel.onServer()
            } else {
                gameScreenViewModel.onClient()
            }
        }
    )

    val forRequestBlue = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestMultiplePermissions(),
        onResult = {
            if (!gameScreenViewModel.isBluetoothEnable()) {
                forResult.launch(Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE))
            } else {
                if (isServer) {
                    // start server
                    gameScreenViewModel.onServer()
                } else {
                    // start client
                    gameScreenViewModel.onClient()
                }
            }
        }
    )

    Scaffold { paddingValues ->
        GameScreen(
            paddingValues = paddingValues,
            gameUiState = ludoGameState,
            music = gameUiState.music,
            sound = gameUiState.sound,
            rotateF = rotateF.value,
            deviceType = deviceType,
            onCounter = gameScreenViewModel::onCounter,
            onDice = gameScreenViewModel::onDice,
            onPawn = gameScreenViewModel::onPawn,
            getPositionIntOffset = gameScreenViewModel::getPositionIntOffset,
            onBack = onBack,
            onSetMusic = gameScreenViewModel::setMusic,
            onSetSound = gameScreenViewModel::setSound,
            onForceRestart = gameScreenViewModel::restartGame
        )

        StartDialog(
            show = gameUiState.isStartDialogOpen,
            showContinueButton = gameUiState.showContinueButton,
            onYouAndComputer = gameScreenViewModel::onYouAndComputer,
            onTournament = gameScreenViewModel::onTournament,
            onFriend = gameScreenViewModel::onFriend,
            onContinueButton = gameScreenViewModel::onContinueClick,
            onBackPress = onBack,
            onJoinClick = {
                isServer = false
                val permissions = bluetoothPermission(context)

                gameScreenViewModel.onJoin()

                when {
                    permissions.isNotEmpty() ->
                        forRequestBlue.launch(permissions)

                    !gameScreenViewModel.isBluetoothEnable() ->
                        forResult.launch(Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE))

                    else -> {
                        gameScreenViewModel.onClient()
                    }
                }
            },
            onHostClick = {
                isServer = true
                val permissions = bluetoothPermission(context)
//                showBlueDialog = true
                gameScreenViewModel.onHost()

                when {
                    permissions.isNotEmpty() ->
                        forRequestBlue.launch(permissions)

                    !gameScreenViewModel.isBluetoothEnable() ->
                        forResult.launch(Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE))

                    else -> {
                        gameScreenViewModel.onServer()
                    }
                }
            }
        )
        GameOverDialog(
            show = gameUiState.isRestartDialogOpen,
            onRestart = gameScreenViewModel::onRestart,
            players = ludoGameState.listOfPlayer,
            onHome = onBack
        )

        GameMultiPlayerWaitingDialog(
            show = gameUiState.isWaitingDialogOpen,
            connected = gameUiState.isBluetoothConnected,
            isServe = isServer,
            onCancelClick = gameScreenViewModel::onCancelBlueDialog
        )

        GameMultiPlayerListDialog(
            show = gameUiState.isDeviceDialogOpen,
            deviceList = gameUiState.listOfDevice,
            onDeviceClick = gameScreenViewModel::onDeviceClick,
            onCancelClick = gameScreenViewModel::onCancelBlueDialog,
            onPairNewDevice = gameScreenViewModel::onPairDevice
        )
    }
}

@SuppressLint("InlinedApi")
@Composable
fun GameScreen(
    paddingValues: PaddingValues = PaddingValues(8.dp),
    gameUiState: LudoUiState,
    music: Boolean = false,
    sound: Boolean = false,
    rotateF: Float = 0f,
    deviceType: DEVICE_TYPE = DEVICE_TYPE.DEFAULT,
    onDice: () -> Unit = {},
    onCounter: (Int) -> Unit = {},
    onPawn: (Int, Boolean) -> Unit = { _, _ -> },
    getPositionIntOffset: (Int, gameColor: GameColor) -> PointUiState = { _, _ ->
        PointUiState.Zero
    },
    onBack: () -> Unit = {},
    onSetMusic: (Boolean) -> Unit = {},
    onSetSound: (Boolean) -> Unit = {},
    onForceRestart: () -> Unit = {}
) {

    if (gameUiState.gameType == GameType.FRIEND) {
        when (deviceType) {
            DEVICE_TYPE.TABLET_PORT, DEVICE_TYPE.PHONE_PORT, DEVICE_TYPE.FOLD_PORT -> {
                GameScreenMultiPort(
                    gameUiState, music, sound, rotateF, paddingValues,
                    onDice, onCounter, onPawn, getPositionIntOffset,
                    onBack, onSetMusic, onSetSound, onForceRestart
                )
            }
            else -> {
                GameScreenMultiLand(
                    gameUiState, music, sound, rotateF, paddingValues,
                    onDice, onCounter, onPawn, getPositionIntOffset,
                    onBack, onSetMusic, onSetSound, onForceRestart
                )
            }
        }
    } else {
        when (deviceType) {
            DEVICE_TYPE.PHONE_LAND -> GameScreenPhoneLand(
                gameUiState, music, sound, rotateF, paddingValues,
                onDice, onCounter, onPawn, getPositionIntOffset,
                onBack, onSetMusic, onSetSound, onForceRestart
            )

            DEVICE_TYPE.FOLD_PORT -> GameScreeFoldPortrait(
                gameUiState, music, sound, rotateF, paddingValues,
                onDice, onCounter, onPawn, getPositionIntOffset,
                onBack, onSetMusic, onSetSound, onForceRestart
            )

            DEVICE_TYPE.FOLD_LAND_AND_TABLET_LAND -> GameScreenLarge(
                gameUiState, music, sound, rotateF, paddingValues,
                onDice, onCounter, onPawn, getPositionIntOffset,
                onBack, onSetMusic, onSetSound, onForceRestart
            )

            else -> GameScreenPhonePortrait(
                gameUiState, music, sound, rotateF, paddingValues,
                onDice, onCounter, onPawn, getPositionIntOffset,
                onBack, onSetMusic, onSetSound, onForceRestart
            )
        }
    }
}

@Preview
@Composable
fun ShowPreview() {
    LudoAppTheme {
        Show()
    }
}
