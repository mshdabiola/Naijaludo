package com.mshdabiola.gamescreen

import android.Manifest
import android.annotation.SuppressLint
import android.bluetooth.BluetoothAdapter
import android.content.Intent
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.mshdabiola.designsystem.R
import com.mshdabiola.designsystem.component.BannerAdmob
import com.mshdabiola.designsystem.theme.LudoAppTheme
import com.mshdabiola.gamescreen.component.BoardUi
import com.mshdabiola.gamescreen.component.CounterGroupUi
import com.mshdabiola.gamescreen.component.CounterGroupUiVertical
import com.mshdabiola.gamescreen.component.DicesUi
import com.mshdabiola.gamescreen.component.DrawerUi
import com.mshdabiola.gamescreen.component.GameMultiPlayerListDialog
import com.mshdabiola.gamescreen.component.GameMultiPlayerWaitingDialog
import com.mshdabiola.gamescreen.component.GameOverDialog
import com.mshdabiola.gamescreen.component.PawnsUi
import com.mshdabiola.gamescreen.component.PlayersUi
import com.mshdabiola.gamescreen.component.PlayersUiVertical
import com.mshdabiola.gamescreen.component.StartDialog
import com.mshdabiola.gamescreen.state.LudoUiState
import com.mshdabiola.gamescreen.state.toLudoUiState
import com.mshdabiola.ludo.model.Constant.getDefaultGameState
import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.Point
import com.mshdabiola.ludo.model.navigation.DEVICE_TYPE
import kotlinx.collections.immutable.toImmutableList

@OptIn(ExperimentalLifecycleComposeApi::class, ExperimentalMaterial3Api::class)
@Composable
fun GameScreen(
    gameScreenViewModel: GameViewModel = hiltViewModel(),
    deviceType: DEVICE_TYPE = DEVICE_TYPE.DEFAULT,
    onBack: () -> Unit = {}
) {

    val gameUiState by gameScreenViewModel.gameUiState.collectAsStateWithLifecycle()
    val blueState by gameScreenViewModel.blueManagerState.collectAsStateWithLifecycle()
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

    val forResult = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartActivityForResult(),
        onResult = {
            if (blueState?.isServer == true) {
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
                if (blueState?.isServer == true) {
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
            onContinueButton = gameScreenViewModel::onContinueClick,
            onBackPress = onBack,
            onJoinClick = {
//                showBlueDialog = false
//                showDeviceList = true
                gameScreenViewModel.onJoin()

                when {
                    !gameScreenViewModel.isAllPermission() ->
                        forRequestBlue.launch(arrayOf(Manifest.permission.BLUETOOTH_CONNECT))

                    !gameScreenViewModel.isBluetoothEnable() ->
                        forResult.launch(Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE))

                    else -> {
                        gameScreenViewModel.onClient()
                    }
                }
            },
            onHostClick = {
//                isServe = true
//                showBlueDialog = true
                gameScreenViewModel.onHost()

                when {
                    !gameScreenViewModel.isAllPermission() ->
                        forRequestBlue.launch(arrayOf(Manifest.permission.BLUETOOTH_CONNECT))

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
            connected = blueState?.connected == true,
            isServe = blueState?.isServer == true,
            onCancelClick = gameScreenViewModel::onCancelBlueDialog
        )

        GameMultiPlayerListDialog(
            show = gameUiState.isDeviceDialogOpen,
            deviceList = blueState?.devices?.toImmutableList(),
            onDeviceClick = gameScreenViewModel::onDeviceClick,
            onCancelClick = gameScreenViewModel::onCancelBlueDialog
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
    getPositionIntOffset: (Int, gameColor: GameColor) -> Point = { _, _ -> Point.zero },
    onBack: () -> Unit = {},
    onSetMusic: (Boolean) -> Unit = {},
    onSetSound: (Boolean) -> Unit = {},
    onForceRestart: () -> Unit = {}
) {
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

@Composable
fun GameScreenPhonePortrait(
    gameUiState: LudoUiState,
    music: Boolean = false,
    sound: Boolean = false,
    rotateF: Float = 0f,
    paddingValues: PaddingValues = PaddingValues(),
    onDice: () -> Unit = {},
    onCounter: (Int) -> Unit = {},
    onPawn: (Int, Boolean) -> Unit = { _, _ -> },
    getPositionIntOffset: (Int, gameColor: GameColor) -> Point = { _, _ -> Point.zero },
    onBack: () -> Unit = {},
    onSetMusic: (Boolean) -> Unit = {},
    onSetSound: (Boolean) -> Unit = {},
    onForceRestart: () -> Unit = {}
) {

    val showText by remember(gameUiState.board) {
        derivedStateOf { gameUiState.board.pathBoxes.isEmpty() }
    }

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
    ) {

        val (iconRef, boardRef, counterRef, playerRef, textRef, adRef) = createRefs()

        Show(
            modifier = Modifier.constrainAs(iconRef) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            },
            onBack = onBack,
            onResign = onForceRestart,
            music = music,
            sound = sound,
            onSetSound = onSetSound,
            onSetMusic = onSetMusic

        )
        PlayersUi(
            modifier = Modifier
                .constrainAs(playerRef) {
                    bottom.linkTo(boardRef.top, margin = 16.dp)
                    centerHorizontallyTo(boardRef)
                },
            playerProvider = { gameUiState.listOfPlayer }
        )

        BoardUi(
            modifier = Modifier
                .rotate(rotateF)
                .constrainAs(boardRef) {
                    linkTo(parent.start, parent.end)
                    linkTo(parent.top, parent.bottom)
                    width = Dimension.fillToConstraints
                },
            boardUiStateProvider = { gameUiState.board }
        ) {

            // pawn

            // if (ludoGameState.listOfPawn.isNotEmpty()) {
            PawnsUi(
                pawnUiStateListProvider = { gameUiState.listOfPawn },
                isHumanProvider = { gameUiState.isHumanPlayer },
                getPositionIntOffset = getPositionIntOffset,
                onClick = onPawn
            )
            // }

            // dice

            // if (ludoGameState.listOfDice.isNotEmpty()) {
            DicesUi(
                diceUiStateListProvider = { gameUiState.listOfDice },
                isHumanProvider = { gameUiState.isHumanPlayer },
                onClick = onDice
            )
            // }

            // drawer

            DrawerUi(
                drawerUiStateProvider = { gameUiState.drawer },
                getPositionIntOffset = getPositionIntOffset,
                onPawnDrawer = onPawn
            )
        }
        // }
        AnimatedVisibility(
            modifier = Modifier.constrainAs(textRef) {
                linkTo(parent.start, parent.end)
                linkTo(parent.top, parent.bottom)
            },
            visible = showText
        ) {
            Text(text = "Loading...", style = MaterialTheme.typography.headlineMedium)
        }

        CounterGroupUi(
            modifier = Modifier
                .constrainAs(counterRef) {
                    top.linkTo(boardRef.bottom, margin = 16.dp)
                    centerHorizontallyTo(boardRef)
                },
            counterUiStateListProvider = { gameUiState.listOfCounter },
            isHumanProvider = { gameUiState.isHumanPlayer },
            onCounterClick = onCounter
        )

        BannerAdmob(
            Modifier.constrainAs(adRef) {
                linkTo(parent.start, parent.end)
                bottom.linkTo(parent.bottom)
            }
        )
    }
}

@Composable
fun GameScreenPhoneLand(
    gameUiState: LudoUiState,
    music: Boolean = false,
    sound: Boolean = false,
    rotateF: Float = 0f,
    paddingValues: PaddingValues = PaddingValues(),
    onDice: () -> Unit = {},
    onCounter: (Int) -> Unit = {},
    onPawn: (Int, Boolean) -> Unit = { _, _ -> },
    getPositionIntOffset: (Int, gameColor: GameColor) -> Point = { _, _ -> Point.zero },
    onBack: () -> Unit = {},
    onSetMusic: (Boolean) -> Unit = {},
    onSetSound: (Boolean) -> Unit = {},
    onForceRestart: () -> Unit = {}
) {
    val showText by remember(gameUiState.board) {
        derivedStateOf { gameUiState.board.pathBoxes.isEmpty() }
    }

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
    ) {

        val (iconRef, boardRef, counterRef, playerRef, textRef, adRef) = createRefs()
        Show(
            modifier = Modifier.constrainAs(iconRef) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            },
            onBack = onBack,
            onResign = onForceRestart,
            music = music,
            sound = sound,
            onSetSound = onSetSound,
            onSetMusic = onSetMusic

        )

        PlayersUiVertical(
            modifier = Modifier
                .constrainAs(playerRef) {
                    // end.linkTo(boardRef.start, margin = 16.dp)
                    linkTo(parent.start, boardRef.start)
                    centerVerticallyTo(boardRef)
                },
            playerProvider = { gameUiState.listOfPlayer }
        )

        BoardUi(
            modifier = Modifier
                .rotate(rotateF)
                .constrainAs(boardRef) {
                    linkTo(playerRef.end, counterRef.start)
                    linkTo(parent.top, parent.bottom)
                    height = Dimension.fillToConstraints
                },
            { gameUiState.board }
        ) {

            // pawn

            // if (ludoGameState.listOfPawn.isNotEmpty()) {
            PawnsUi(
                pawnUiStateListProvider = { gameUiState.listOfPawn },
                isHumanProvider = { gameUiState.isHumanPlayer },
                getPositionIntOffset = getPositionIntOffset,
                onClick = onPawn
            )
            // }

            // dice

            // if (ludoGameState.listOfDice.isNotEmpty()) {
            DicesUi(
                diceUiStateListProvider = { gameUiState.listOfDice },
                isHumanProvider = { gameUiState.isHumanPlayer },
                onClick = onDice
            )
            // }

            // drawer

            DrawerUi(
                drawerUiStateProvider = { gameUiState.drawer },
                getPositionIntOffset = getPositionIntOffset,
                onPawnDrawer = onPawn
            )
        }
        // }
        AnimatedVisibility(
            modifier = Modifier.constrainAs(textRef) {
                linkTo(parent.start, parent.end)
                linkTo(parent.top, parent.bottom)
            },
            visible = showText
        ) {
            Text(text = "Loading...", style = MaterialTheme.typography.headlineMedium)
        }

        CounterGroupUiVertical(
            modifier = Modifier
                .constrainAs(counterRef) {
                    linkTo(boardRef.end, parent.end)
                    // start.linkTo(boardRef.end, margin = 16.dp)
                    centerVerticallyTo(boardRef)
                },
            counterUiStateListProvider = { gameUiState.listOfCounter },
            isHumanProvider = { gameUiState.isHumanPlayer },
            onCounterClick = onCounter
        )

        BannerAdmob(
            Modifier
                .constrainAs(adRef) {
                    linkTo(parent.top, parent.bottom)
                    linkTo(counterRef.end, parent.end)
                }
                .rotate(90f)
        )
    }
}

@Composable
fun GameScreeFoldPortrait(
    gameUiState: LudoUiState,
    music: Boolean = false,
    sound: Boolean = false,
    rotateF: Float = 0f,
    paddingValues: PaddingValues = PaddingValues(),
    onDice: () -> Unit = {},
    onCounter: (Int) -> Unit = {},
    onPawn: (Int, Boolean) -> Unit = { _, _ -> },
    getPositionIntOffset: (Int, gameColor: GameColor) -> Point = { _, _ -> Point.zero },
    onBack: () -> Unit = {},
    onSetMusic: (Boolean) -> Unit = {},
    onSetSound: (Boolean) -> Unit = {},
    onForceRestart: () -> Unit = {}
) {
    val showText by remember(gameUiState.board.pathBoxes) {
        derivedStateOf { gameUiState.board.pathBoxes.isEmpty() }
    }

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),

    ) {
        val (iconRef, boardRef, counterRef, playerRef, textRef, adRef) = createRefs()
        createHorizontalChain(counterRef, playerRef)
        val barrier = createTopBarrier(counterRef, playerRef)
        Show(
            modifier = Modifier.constrainAs(iconRef) {
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
            },
            onBack = onBack,
            onResign = onForceRestart,
            music = music,
            sound = sound,
            onSetSound = onSetSound,
            onSetMusic = onSetMusic

        )
        BoardUi(
            modifier = Modifier
                .rotate(rotateF)
                .constrainAs(boardRef) {

                    linkTo(parent.start, parent.end)
                    linkTo(parent.top, barrier)
                    height = Dimension.fillToConstraints
                },
            { gameUiState.board }
        ) {

            // pawn

            // if (ludoGameState.listOfPawn.isNotEmpty()) {
            PawnsUi(
                pawnUiStateListProvider = { gameUiState.listOfPawn },
                isHumanProvider = { gameUiState.isHumanPlayer },
                getPositionIntOffset = getPositionIntOffset,
                onClick = onPawn
            )
            // }

            // dice

            // if (ludoGameState.listOfDice.isNotEmpty()) {
            DicesUi(
                diceUiStateListProvider = { gameUiState.listOfDice },
                isHumanProvider = { gameUiState.isHumanPlayer },
                onClick = onDice
            )
            // }

            // drawer

            DrawerUi(
                drawerUiStateProvider = { gameUiState.drawer },
                getPositionIntOffset = getPositionIntOffset,
                onPawnDrawer = onPawn
            )
        }

        AnimatedVisibility(
            modifier = Modifier.constrainAs(textRef) {
                linkTo(parent.start, parent.end)
                linkTo(parent.top, parent.bottom)
            },
            visible = showText
        ) {
            Text(text = "Loading...", style = MaterialTheme.typography.headlineMedium)
        }

        CounterGroupUi(
            modifier = Modifier.constrainAs(counterRef) {
                linkTo(barrier, adRef.top)
            },
            counterUiStateListProvider = { gameUiState.listOfCounter },
            isHumanProvider = { gameUiState.isHumanPlayer },
            onCounterClick = onCounter
        )

        PlayersUiVertical(
            modifier = Modifier.constrainAs(playerRef) {
                linkTo(barrier, adRef.top)
            },
            playerProvider = { gameUiState.listOfPlayer },
            isFold = true
        )

        BannerAdmob(
            Modifier.constrainAs(adRef) {
                linkTo(parent.start, parent.end)
                bottom.linkTo(parent.bottom)
            }
        )
    }
}

@Composable
fun GameScreenLarge(
    gameUiState: LudoUiState,
    music: Boolean = false,
    sound: Boolean = false,
    rotateF: Float = 0f,
    paddingValues: PaddingValues = PaddingValues(),
    onDice: () -> Unit = {},
    onCounter: (Int) -> Unit = {},
    onPawn: (Int, Boolean) -> Unit = { _, _ -> },
    getPositionIntOffset: (Int, gameColor: GameColor) -> Point = { _, _ -> Point.zero },
    onBack: () -> Unit = {},
    onSetMusic: (Boolean) -> Unit = {},
    onSetSound: (Boolean) -> Unit = {},
    onForceRestart: () -> Unit = {}
) {
    val showText by remember(gameUiState.board.pathBoxes) {
        derivedStateOf { gameUiState.board.pathBoxes.isEmpty() }
    }
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
    ) {

        val (iconRef, playerRef, boardRef, counterRef, textRef, adRef) = createRefs()

        Show(
            modifier = Modifier.constrainAs(iconRef) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            },
            onBack = onBack,
            onResign = onForceRestart,
            music = music,
            sound = sound,
            onSetSound = onSetSound,
            onSetMusic = onSetMusic

        )
        PlayersUi(
            modifier = Modifier
                .constrainAs(playerRef) {
                    top.linkTo(parent.top, 16.dp)
                    bottom.linkTo(boardRef.top, 16.dp)
                    start.linkTo(boardRef.start)
                    end.linkTo(boardRef.end)
                },
            playerProvider = { gameUiState.listOfPlayer }
        )

        BoardUi(
            modifier = Modifier
                .rotate(rotateF)
                .constrainAs(boardRef) {
                    linkTo(parent.start, parent.end)
                    bottom.linkTo(parent.bottom)
                    top.linkTo(playerRef.bottom)
                    height = Dimension.fillToConstraints
                },
            { gameUiState.board }
        ) {

            // pawn

            // if (ludoGameState.listOfPawn.isNotEmpty()) {
            PawnsUi(
                pawnUiStateListProvider = { gameUiState.listOfPawn },
                isHumanProvider = { gameUiState.isHumanPlayer },
                getPositionIntOffset = getPositionIntOffset,
                onClick = onPawn
            )
            // }

            // dice

            //  if (ludoGameState.listOfDice.isNotEmpty()) {
            DicesUi(
                diceUiStateListProvider = { gameUiState.listOfDice },
                isHumanProvider = { gameUiState.isHumanPlayer },
                onClick = onDice
            )
            // }

            // drawer

            DrawerUi(
                drawerUiStateProvider = { gameUiState.drawer },
                getPositionIntOffset = getPositionIntOffset,
                onPawnDrawer = onPawn
            )
        }

        AnimatedVisibility(
            modifier = Modifier.constrainAs(textRef) {
                linkTo(parent.start, parent.end)
                linkTo(parent.top, parent.bottom)
            },
            visible = showText
        ) {
            Text(text = "Loading...", style = MaterialTheme.typography.headlineMedium)
        }

        // Spacer(modifier = Modifier.width(16.dp))

        //  AnimatedVisibility(visible = ludoGameState.listOfCounter.isNotEmpty()) {
        CounterGroupUiVertical(
            modifier = Modifier
                .constrainAs(counterRef) {

                    centerVerticallyTo(boardRef)
                    linkTo(boardRef.end, parent.end, bias = 0.1f)
                },
            counterUiStateListProvider = { gameUiState.listOfCounter },
            isHumanProvider = { gameUiState.isHumanPlayer },
            onCounterClick = onCounter
        )
        // }
        // }

        BannerAdmob(
            Modifier
                .constrainAs(adRef) {
                    linkTo(parent.top, parent.bottom)
                    centerHorizontallyTo(iconRef)
                }
                .rotate(270f)
        )
    }
}

@Preview(device = "id:Nexus 4")
@Composable
fun GameScreenPreview() {

    val game = getDefaultGameState()
    val state = game.toLudoUiState()
    GameScreen(
        gameUiState = state,
        getPositionIntOffset = game.board::getPositionIntPoint
    )
}

@Preview(device = "spec:parent=pixel_5,orientation=landscape")
@Composable
fun GameScreenLandPreview() {

    val game = getDefaultGameState()
    val state = game.toLudoUiState()
    GameScreen(
        gameUiState = state,
        getPositionIntOffset = game.board::getPositionIntPoint,
        deviceType = DEVICE_TYPE.PHONE_LAND

    )
}

@Preview(device = "spec:width=673.5dp,height=841dp,dpi=480")
@Composable
fun GameScreenFoldPreview() {
    val game = getDefaultGameState()
    val state = game.toLudoUiState()
    GameScreen(
        gameUiState = state,
        getPositionIntOffset = game.board::getPositionIntPoint,
        deviceType = DEVICE_TYPE.FOLD_PORT
    )
}

@Preview(device = "spec:width=673.5dp,height=841dp,dpi=480,orientation=landscape")
@Composable
fun GameScreenFoldLandPreview() {
    val game = getDefaultGameState()
    val state = game.toLudoUiState()
    GameScreen(
        gameUiState = state,
        getPositionIntOffset = game.board::getPositionIntPoint,
        deviceType = DEVICE_TYPE.FOLD_LAND_AND_TABLET_LAND
    )
}

@Preview(device = "spec:width=1280dp,height=800dp,dpi=480,orientation=portrait")
@Composable
fun GameScreenTabletPreview() {
    val game = getDefaultGameState()
    val state = game.toLudoUiState()
    GameScreen(
        gameUiState = state,
        getPositionIntOffset = game.board::getPositionIntPoint,
        deviceType = DEVICE_TYPE.TABLET_PORT
    )
}

@Preview(device = "spec:width=1280dp,height=800dp,dpi=480,orientation=landscape")
@Composable
fun GameScreenTabletLandPreview() {
    val game = getDefaultGameState()
    val state = game.toLudoUiState()
    GameScreen(
        gameUiState = state,
        getPositionIntOffset = game.board::getPositionIntPoint,
        deviceType = DEVICE_TYPE.FOLD_LAND_AND_TABLET_LAND
    )
}

@Composable
fun Show(
    modifier: Modifier = Modifier,
    onResign: () -> Unit = {},
    onBack: () -> Unit = {},
    music: Boolean = false,
    sound: Boolean = false,
    onSetMusic: (Boolean) -> Unit = {},
    onSetSound: (Boolean) -> Unit = {}
) {
    var show by rememberSaveable {
        mutableStateOf(false)
    }
    Box(modifier) {
        IconButton(onClick = { show = true }) {
            Icon(imageVector = Icons.Default.Menu, contentDescription = "menu")
        }
        DropdownMenu(expanded = show, onDismissRequest = { show = false }) {
            DropdownMenuItem(
                text = { Text(text = stringResource(id = R.string.give_up)) },
                onClick = { show = false; onResign() }
            )
            DropdownMenuItem(
                text = { Text(text = stringResource(id = R.string.home)) },
                onClick = { show = false; onBack() }
            )
            DropdownMenuItem(
                text = { Text(text = stringResource(id = R.string.music)) }, onClick = { },
                trailingIcon = { Switch(checked = music, onCheckedChange = onSetMusic) }
            )
            DropdownMenuItem(
                text = { Text(text = stringResource(id = R.string.sound)) }, onClick = { },
                trailingIcon = { Switch(checked = sound, onCheckedChange = onSetSound) }
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
