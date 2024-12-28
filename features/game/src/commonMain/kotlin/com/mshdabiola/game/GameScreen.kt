/*
 *abiola 2022
 */

package com.mshdabiola.game

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.unit.dp
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.mshdabiola.designsystem.icon.Drawable
import com.mshdabiola.designsystem.icon.drawable.BgL
import com.mshdabiola.designsystem.icon.drawable.BgP
import com.mshdabiola.designsystem.theme.LudoAppTheme
import com.mshdabiola.model.DEVICE_TYPE
import com.mshdabiola.naijaludo.model.GameColor
import com.mshdabiola.naijaludo.model.GameType
import com.mshdabiola.ui.DeviceListDialog
import com.mshdabiola.ui.GameOverDialog
import com.mshdabiola.ui.LocalBoard
import com.mshdabiola.ui.StartDialog
import com.mshdabiola.ui.WaitingDialog
import com.mshdabiola.ui.WifiPermission
import com.mshdabiola.ui.getPermission
import com.mshdabiola.ui.getUBoard
import com.mshdabiola.ui.issPortrait
import com.mshdabiola.ui.state.ArchievementData
import com.mshdabiola.ui.state.LudoUiState
import com.mshdabiola.ui.state.PointUiState

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
internal fun GameRoute(
    modifier: Modifier = Modifier,
    sharedTransitionScope: SharedTransitionScope,
    animatedContentScope: AnimatedContentScope,
    onShowSnackbar: suspend (String, String?) -> Boolean,
    onBack: () -> Unit,
    gameScreenViewModel: GameViewModel,
    deviceType: DEVICE_TYPE = DEVICE_TYPE.DEFAULT,
    navigateToMarket: () -> Unit = {},

) {
    val gameUiState by gameScreenViewModel.gameUiState.collectAsStateWithLifecycle()
    val ludoGameState by gameScreenViewModel.ludoGameState.collectAsStateWithLifecycle()
    val settingUiState by gameScreenViewModel.settingUiState.collectAsStateWithLifecycle()
    var archievementData by remember {
        mutableStateOf<ArchievementData?>(null)
    }
    var showMultiplayer by remember {
        mutableStateOf(true)
    }
    LaunchedEffect(key1 = Unit, block = {
    })

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
//        val locationManager = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
//        locationEnable = LocationManagerCompat.isLocationEnabled(locationManager)
//        val wifiManager =
//            context.applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
//        wifiEnable = wifiManager.isWifiEnabled
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
            gameScreenViewModel.onResume(
//                firebaseLog = { tag, str ->
//                    context.asMainActivity().analytics
//                        ?.logEvent(tag, block = str)
//                },
//                unLockAchievement = {
//                    context.asMainActivity().achievement
//                        ?.unlockImmediate(context.resources.getString(it))
//                },
//                increaseAchievement = {
//                    context.asMainActivity().achievement
//                        ?.incrementImmediate(context.resources.getString(it), 1)
//                }
            )
        }

        override fun onPause(owner: LifecycleOwner) {
            super.onDestroy(owner)
            gameScreenViewModel.onPause()
        }
    }

    val lifecycle = LocalLifecycleOwner.current.lifecycle
    LogScreen(screenName = "GameScreen")

    DisposableEffect(key1 = lifecycle) {
        lifecycle.addObserver(observer)

        onDispose {
            lifecycle.removeObserver(observer)
            // gameScreenViewModel.onDestroy()
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
//            Toast.makeText(context, "Error occur Try again", Toast.LENGTH_SHORT).show()
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

//    val forRequestBlue = rememberLauncherForActivityResult(
//        contract = ActivityResultContracts.RequestMultiplePermissions(),
//        onResult = { stringBooleanMap ->
//            isComponentEnable()
//            when {
//                stringBooleanMap.values.all { !it } -> {}
//                !locationEnable || !wifiEnable -> showPermission = true
//                else -> gameScreenViewModel.onJoin()
//            }
//        },
//    )
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

    LaunchedEffect(key1 = gameUiState.isRestartDialogOpen, block = {
        if (gameUiState.isRestartDialogOpen) {
//            val activity = (context as MainActivity)
//
//            activity.updateLeaderboard(ludoGameState.listOfPlayer)
//            archievementData = activity.getArchi()
        }
    })
//    val configuration = LocalConfiguration.current

    val vector = if (issPortrait()) {
        Drawable.BgP
    } else {
        Drawable.BgL
    }

    val painter = rememberVectorPainter(image = vector)
    val uBoard = remember(gameUiState.boardName) {
        getUBoard(gameUiState.boardName)
    }

    Scaffold(
        modifier = Modifier
            .drawBehind {
                with(painter) {
                    draw(size)
                }
            },
        containerColor = Color.Transparent,
    ) { paddingValues ->
        if (showText) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
//                Text(
//                    modifier = Modifier.align(Alignment.Center),
//                    text = "Loading...",
//
//                    style = MaterialTheme.typography.headlineMedium,
//                )
                Loading()
            }
        } else {
            CompositionLocalProvider(LocalBoard provides uBoard) {
                GameScreen(
                    paddingValues = paddingValues,
                    gameUiState = ludoGameState,
                    music = settingUiState.music,
                    sound = settingUiState.sound,
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
                    navigateToMarket = navigateToMarket,
                )
            }
        }
        StartDialog(
            show = gameUiState.isStartDialogOpen,
            showMultiPlayer = showMultiplayer,
            onYouAndComputer = gameScreenViewModel::onYouAndComputer,
            onTournament = gameScreenViewModel::onTournament,
            onFriend = gameScreenViewModel::onFriend,
            onBackPress = onBack,
            onJoinClick = {
//                isServer = false
//                val permissions = gameScreenViewModel.bluetoothPermission(context)
                isComponentEnable()

//                when {
//                    permissions.isNotEmpty() ->
//                        forRequestBlue.launch(permissions.toTypedArray())
//
//                    !wifiEnable || !locationEnable ->
//                        showPermission = true
//
//                    else -> {
//                        gameScreenViewModel.onJoin()
//                    }
//                }
            },

        )

        GameOverDialog(
            show = gameUiState.isRestartDialogOpen,
            onRestart = gameScreenViewModel::onRestart,
            players = ludoGameState.listOfPlayer,
            onShare = {
//                val intent = Intent(Intent.ACTION_SEND)
//
//                intent.putExtra(Intent.EXTRA_TEXT, tst)
//                intent.type = "text/*"
//                context.startActivity(Intent.createChooser(intent, "NaijaLudo Score"))
            },
            achievementData = archievementData,
            onHome = onBack,
            onShowMore = {
                // context.asMainActivity().acheveUi()
            },
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
    navigateToMarket: () -> Unit = {},
) {
    if (gameUiState.gameType == GameType.FRIEND) {
        when (deviceType) {
            DEVICE_TYPE.TABLET_PORT, DEVICE_TYPE.PHONE_PORT, DEVICE_TYPE.FOLD_PORT -> {
                GameScreenMultiPort(
                    gameUiState, music, sound, rotateF, paddingValues,
                    onDice, onCounter, onPawn, getPositionIntOffset,
                    onBack, onSetMusic, onSetSound, onForceRestart, navigateToMarket,
                )
            }

            DEVICE_TYPE.PHONE_LAND -> {
                GameScreenMultiPhoneLand(
                    gameUiState, music, sound, rotateF, paddingValues,
                    onDice, onCounter, onPawn, getPositionIntOffset,
                    onBack, onSetMusic, onSetSound, onForceRestart, navigateToMarket,
                )
            }

            else -> {
                GameScreenMultiLand(
                    gameUiState, music, sound, rotateF, paddingValues,
                    onDice, onCounter, onPawn, getPositionIntOffset,
                    onBack, onSetMusic, onSetSound, onForceRestart, navigateToMarket,
                )
            }
        }
    } else {
        when (deviceType) {
            DEVICE_TYPE.PHONE_LAND -> GameScreenPhoneLand(
                gameUiState, music, sound, rotateF, paddingValues,
                onDice, onCounter, onPawn, getPositionIntOffset,
                onBack, onSetMusic, onSetSound, onForceRestart, navigateToMarket,
            )

            DEVICE_TYPE.FOLD_PORT -> GameScreeFoldPortrait(
                gameUiState, music, sound, rotateF, paddingValues,
                onDice, onCounter, onPawn, getPositionIntOffset,
                onBack, onSetMusic, onSetSound, onForceRestart, navigateToMarket,
            )

            DEVICE_TYPE.FOLD_LAND_AND_TABLET_LAND -> GameScreenLarge(
                gameUiState, music, sound, rotateF, paddingValues,
                onDice, onCounter, onPawn, getPositionIntOffset,
                onBack, onSetMusic, onSetSound, onForceRestart, navigateToMarket,
            )

            else -> GameScreenPhonePortrait(
                gameUiState, music, sound, rotateF, paddingValues,
                onDice, onCounter, onPawn, getPositionIntOffset,
                onBack, onSetMusic, onSetSound, onForceRestart, navigateToMarket,
            )
        }
    }
}
//
// @Preview
// @Composable
// fun ShowPreview() {
//    LudoAppTheme {
//        Show()
//    }
// }

@Composable
fun ShowPreview() {
    LudoAppTheme {
        Show()
    }
}

@Composable
fun LogScreen(screenName: String) {
//    val context = LocalContext.current
//    LaunchedEffect(key1 = Unit, block = {
//        context.asMainActivity()
//            .analytics
//            ?.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW) {
//                param(FirebaseAnalytics.Param.SCREEN_NAME, screenName)
//                param(FirebaseAnalytics.Param.SCREEN_CLASS, screenName)
//            }
//    })
}
