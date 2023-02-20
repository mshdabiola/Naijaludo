package com.mshdabiola.gamescreen

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.location.LocationManager
import android.net.wifi.WifiManager
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.location.LocationManagerCompat
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.mshdabiola.designsystem.theme.LudoAppTheme
import com.mshdabiola.gamescreen.component.DeviceListDialog
import com.mshdabiola.gamescreen.component.GameOverDialog
import com.mshdabiola.gamescreen.component.StartDialog
import com.mshdabiola.gamescreen.component.WaitingDialog
import com.mshdabiola.gamescreen.component.WifiPermission
import com.mshdabiola.gamescreen.component.getPermission
import com.mshdabiola.gamescreen.state.LudoUiState
import com.mshdabiola.gamescreen.state.PointUiState
import com.mshdabiola.naijaludo.model.GameColor
import com.mshdabiola.naijaludo.model.GameType
import com.mshdabiola.ludo.model.navigation.DEVICE_TYPE
import nl.dionsegijn.konfetti.compose.KonfettiView
import nl.dionsegijn.konfetti.core.Party
import nl.dionsegijn.konfetti.core.Position
import nl.dionsegijn.konfetti.core.emitter.Emitter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameScreen(
    gameScreenViewModel: GameViewModel = hiltViewModel(),
    deviceType: DEVICE_TYPE = DEVICE_TYPE.DEFAULT,
    onBack: () -> Unit = {},
) {
    val gameUiState by gameScreenViewModel.gameUiState.collectAsStateWithLifecycle()
    val ludoGameState by gameScreenViewModel.ludoGameState.collectAsStateWithLifecycle()
    val context = LocalContext.current
    var showPermission by remember {
        mutableStateOf(false)
    }
    var wifiEnable by remember {
        mutableStateOf(false)
    }
    var locationEnable by remember {
        mutableStateOf(false)
    }
    val permissions = getPermission()
    val isComponentEnable = {
        val locationManager = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        locationEnable = LocationManagerCompat.isLocationEnabled(locationManager)
        val wifiManager = context.getSystemService(Context.WIFI_SERVICE) as WifiManager
        wifiEnable = wifiManager.isWifiEnabled
    }
    val observer = object : DefaultLifecycleObserver {
        override fun onResume(owner: LifecycleOwner) {
            super.onResume(owner)
            println("On Resume")
            isComponentEnable()
            if (locationEnable && wifiEnable && showPermission) {
                showPermission = false
                gameScreenViewModel.onJoin()
            }
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
        if (ludoGameState.rotate) {
            rotateF.animateTo(360f, tween(4000))
        } else {
            rotateF.snapTo(0f)
        }
    }

    LaunchedEffect(key1 = gameUiState.navigateBackBcosOfBlueError) {
        if (gameUiState.navigateBackBcosOfBlueError) {
            Toast.makeText(context, "Error occur Try again", Toast.LENGTH_SHORT).show()
            onBack()
        }
    }

//    var isServer by remember {
//        mutableStateOf(false)
//    }

//    val forResult = rememberLauncherForActivityResult(
//        contract = ActivityResultContracts.StartActivityForResult(),
//        onResult = {
//            if (isServer) {
//                // start server
//                gameScreenViewModel.onServer()
//            } else {
//                gameScreenViewModel.onClient()
//            }
//        },
//    )

    val forRequestBlue = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestMultiplePermissions(),
        onResult = { stringBooleanMap ->
            isComponentEnable()
            when {
                stringBooleanMap.values.all { !it } -> {}
                !locationEnable || !wifiEnable -> showPermission = true
                else -> gameScreenViewModel.onJoin()
            }
        },
    )
    val tst by remember(gameUiState.isRestartDialogOpen) {
        derivedStateOf {
            val l = ludoGameState.listOfPlayer.joinToString(
                separator = "\n",
                prefix = "\n",
                postfix = "\n",
            ) {
                "${it.name} - score ${it.win}"
            }
            "Players $l download NaijaLudo At " +
                "http://play.google.com/store/apps/details?id=com.mshdabiola.ludo"
        }
    }

    val showText by remember(ludoGameState) {
        derivedStateOf {
            ludoGameState.listOfCounter.isEmpty() ||
                ludoGameState.listOfDice.isEmpty() ||
                ludoGameState.listOfPawn.isEmpty() ||
                ludoGameState.listOfPlayer.isEmpty()
        }
    }

    val showConfetti = remember(gameUiState.isRestartDialogOpen) {
        derivedStateOf {
            ludoGameState.listOfPlayer.lastOrNull()?.isCurrent == true &&
                gameUiState.isRestartDialogOpen
        }
    }

    Scaffold { paddingValues ->
        if (showText) {
            Box(modifier = Modifier.fillMaxSize()) {
                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = "Loading...",

                    style = MaterialTheme.typography.headlineMedium,
                )
            }
        } else {
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
                onForceRestart = gameScreenViewModel::restartGame,
            )
        }
        if (showConfetti.value) {
            KonfettiView(
                modifier = Modifier.fillMaxSize(),
                parties = listOf(
                    Party(
                        spread = 270,
                        position = Position.Relative(0.2, 0.0),
                        emitter = Emitter(5000).perSecond(300),
                        timeToLive = 7000,
                    ),
                    Party(
                        spread = 360,
                        position = Position.Relative(0.5, 0.0),
                        emitter = Emitter(5000).perSecond(700),
                        timeToLive = 7000,
                    ),
                    Party(
                        spread = 270,
                        position = Position.Relative(0.8, 0.0),
                        emitter = Emitter(5000).perSecond(300),
                        timeToLive = 7000,
                    ),
                ),
            )
        }
        StartDialog(
            show = gameUiState.isStartDialogOpen,
            onYouAndComputer = gameScreenViewModel::onYouAndComputer,
            onTournament = gameScreenViewModel::onTournament,
            onFriend = gameScreenViewModel::onFriend,
            onBackPress = onBack,
            onJoinClick = {
//                isServer = false
//                val permissions = gameScreenViewModel.bluetoothPermission(context)
                isComponentEnable()

                when {
                    permissions.isNotEmpty() ->
                        forRequestBlue.launch(permissions.toTypedArray())

                    !wifiEnable || !locationEnable ->
                        showPermission = true

                    else -> {
                        gameScreenViewModel.onJoin()
                    }
                }
            },

        )

        GameOverDialog(
            show = gameUiState.isRestartDialogOpen,
            onRestart = gameScreenViewModel::onRestart,
            players = ludoGameState.listOfPlayer,
            onShare = {
                val intent = Intent(Intent.ACTION_SEND)

                intent.putExtra(Intent.EXTRA_TEXT, tst)
                intent.type = "text/*"
                context.startActivity(Intent.createChooser(intent, "NaijaLudo Score"))
            },
            onHome = onBack,
        )

        WaitingDialog(
            show = gameUiState.isWaitingDialogOpen,
            connected = gameUiState.connected,
            onCancelClick = gameScreenViewModel::onCancelBlueDialog,
            startGame = {}, // gameScreenViewModel::startOffGame,
        )
        WifiPermission(
            show = showPermission,
            isLocationEnable = locationEnable,
            isWifiEnable = wifiEnable,
            onDismissRequest = { showPermission = false },
        )

        DeviceListDialog(
            show = gameUiState.isDeviceDialogOpen,
            deviceList = gameUiState.listOfDevice,
            onDeviceClick = gameScreenViewModel::onDeviceClick,
            onCancelClick = gameScreenViewModel::onCancelBlueDialog,
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
    onForceRestart: () -> Unit = {},
) {
    if (gameUiState.gameType == GameType.FRIEND) {
        when (deviceType) {
            DEVICE_TYPE.TABLET_PORT, DEVICE_TYPE.PHONE_PORT, DEVICE_TYPE.FOLD_PORT -> {
                GameScreenMultiPort(
                    gameUiState, music, sound, rotateF, paddingValues,
                    onDice, onCounter, onPawn, getPositionIntOffset,
                    onBack, onSetMusic, onSetSound, onForceRestart,
                )
            }

            DEVICE_TYPE.PHONE_LAND -> {
                GameScreenMultiPhoneLand(
                    gameUiState, music, sound, rotateF, paddingValues,
                    onDice, onCounter, onPawn, getPositionIntOffset,
                    onBack, onSetMusic, onSetSound, onForceRestart,
                )
            }

            else -> {
                GameScreenMultiLand(
                    gameUiState, music, sound, rotateF, paddingValues,
                    onDice, onCounter, onPawn, getPositionIntOffset,
                    onBack, onSetMusic, onSetSound, onForceRestart,
                )
            }
        }
    } else {
        when (deviceType) {
            DEVICE_TYPE.PHONE_LAND -> GameScreenPhoneLand(
                gameUiState, music, sound, rotateF, paddingValues,
                onDice, onCounter, onPawn, getPositionIntOffset,
                onBack, onSetMusic, onSetSound, onForceRestart,
            )

            DEVICE_TYPE.FOLD_PORT -> GameScreeFoldPortrait(
                gameUiState, music, sound, rotateF, paddingValues,
                onDice, onCounter, onPawn, getPositionIntOffset,
                onBack, onSetMusic, onSetSound, onForceRestart,
            )

            DEVICE_TYPE.FOLD_LAND_AND_TABLET_LAND -> GameScreenLarge(
                gameUiState, music, sound, rotateF, paddingValues,
                onDice, onCounter, onPawn, getPositionIntOffset,
                onBack, onSetMusic, onSetSound, onForceRestart,
            )

            else -> GameScreenPhonePortrait(
                gameUiState, music, sound, rotateF, paddingValues,
                onDice, onCounter, onPawn, getPositionIntOffset,
                onBack, onSetMusic, onSetSound, onForceRestart,
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
