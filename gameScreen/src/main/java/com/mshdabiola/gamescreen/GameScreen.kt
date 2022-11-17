package com.mshdabiola.gamescreen

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.mshdabiola.designsystem.theme.LudoAppTheme
import com.mshdabiola.gamescreen.component.BoardUi
import com.mshdabiola.gamescreen.component.CounterGroupUi
import com.mshdabiola.gamescreen.component.CounterGroupUiVertical
import com.mshdabiola.gamescreen.component.DicesUi
import com.mshdabiola.gamescreen.component.DrawerUi
import com.mshdabiola.gamescreen.component.GameOverDialog
import com.mshdabiola.gamescreen.component.PawnsUi
import com.mshdabiola.gamescreen.component.PlayersUi
import com.mshdabiola.gamescreen.component.PlayersUiVertical
import com.mshdabiola.gamescreen.component.StartDialog
import com.mshdabiola.gamescreen.state.toLudoUiState
import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.Point
import com.mshdabiola.ludo.model.navigation.DEVICE_TYPE
import com.mshdabiola.naijaludo.LudoGame

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
fun GameScreen(
    gameScreenViewModel: GameViewModel = hiltViewModel(),
    deviceType: DEVICE_TYPE = DEVICE_TYPE.DEFAULT,
    onBack: () -> Unit = {}
) {

    val gameUiState by gameScreenViewModel.gameUiState.collectAsStateWithLifecycle()

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
    val rotateF = remember {
        Animatable(0f)
    }
    DisposableEffect(key1 = lifecycle) {
        lifecycle.addObserver(observer)

        onDispose {

            lifecycle.removeObserver(observer)
        }
    }

    LaunchedEffect(key1 = gameUiState.ludoGameState.rotate) {

        //   rotateF.snapTo(0f)
        if (gameUiState.ludoGameState.rotate)
            rotateF.animateTo(360f, tween(4000))
        else
            rotateF.snapTo(0f)
    }

    GameScreen(
        gameUiState = gameUiState,
        rotateF = rotateF.value,
        deviceType = deviceType,
        onYouAndComputer = gameScreenViewModel::onYouAndComputer,
        onTournament = gameScreenViewModel::onTournament,
        onContinueClick = gameScreenViewModel::onContinueClick,
        onRestart = gameScreenViewModel::onRestart,
        onCounter = gameScreenViewModel::onCounter,
        onDice = gameScreenViewModel::onDice,
        onPawn = gameScreenViewModel::onPawn,
        getPositionIntOffset = gameScreenViewModel::getPositionIntOffset,
        onBack = onBack,
        onSetMusic = gameScreenViewModel::setMusic,
        onSetSound = gameScreenViewModel::setSound,
        onForceRestart = gameScreenViewModel::restartGame
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameScreen(
    gameUiState: GameUiState,
    rotateF: Float = 0f,
    deviceType: DEVICE_TYPE = DEVICE_TYPE.DEFAULT,
    onYouAndComputer: () -> Unit = {},
    onTournament: () -> Unit = {},
    onContinueClick: () -> Unit = {},
    onRestart: () -> Unit = {},
    onDice: () -> Unit = {},
    onCounter: (Int) -> Unit = {},
    onPawn: (Int, Boolean) -> Unit = { _, _ -> },
    getPositionIntOffset: (Int, gameColor: GameColor) -> Point = { _, _ -> Point.zero },
    onBack: () -> Unit = {},
    onSetMusic: (Boolean) -> Unit = {},
    onSetSound: (Boolean) -> Unit = {},
    onForceRestart: () -> Unit = {}
) {

    Scaffold { paddingValues ->
        when (deviceType) {
            DEVICE_TYPE.PHONE_LAND -> GameScreenPhoneLand(
                gameUiState, rotateF, paddingValues, onYouAndComputer, onTournament,
                onContinueClick,
                onRestart,
                onDice, onCounter, onPawn, getPositionIntOffset,
                onBack, onSetMusic, onSetSound, onForceRestart
            )

            DEVICE_TYPE.FOLD_PORT -> GameScreeFoldPortrait(
                gameUiState, rotateF, paddingValues, onYouAndComputer, onTournament,
                onContinueClick,
                onRestart,
                onDice, onCounter, onPawn, getPositionIntOffset,
                onBack, onSetMusic, onSetSound, onForceRestart
            )

            DEVICE_TYPE.FOLD_LAND_AND_TABLET_LAND -> GameScreenLarge(
                gameUiState, rotateF, paddingValues, onYouAndComputer, onTournament,
                onContinueClick,
                onRestart,
                onDice, onCounter, onPawn, getPositionIntOffset,
                onBack, onSetMusic, onSetSound, onForceRestart
            )

            else -> GameScreenPhonePortrait(
                gameUiState, rotateF, paddingValues, onYouAndComputer, onTournament,
                onContinueClick,
                onRestart,
                onDice, onCounter, onPawn, getPositionIntOffset,
                onBack, onSetMusic, onSetSound, onForceRestart
            )
        }
    }
}

@Composable
fun GameScreenPhonePortrait(
    gameUiState: GameUiState,
    rotateF: Float = 0f,
    paddingValues: PaddingValues = PaddingValues(),
    onYouAndComputer: () -> Unit = {},
    onTournament: () -> Unit = {},
    onContinueClick: () -> Unit = {},
    onRestart: () -> Unit = {},
    onDice: () -> Unit = {},
    onCounter: (Int) -> Unit = {},
    onPawn: (Int, Boolean) -> Unit = { _, _ -> },
    getPositionIntOffset: (Int, gameColor: GameColor) -> Point = { _, _ -> Point.zero },
    onBack: () -> Unit = {},
    onSetMusic: (Boolean) -> Unit = {},
    onSetSound: (Boolean) -> Unit = {},
    onForceRestart: () -> Unit = {}
) {

    val showText by remember(gameUiState.ludoGameState.board) {
        derivedStateOf { gameUiState.ludoGameState.board.pathBoxes.isEmpty() }
    }

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
    ) {

        val (iconRef, boardRef, counterRef, playerRef, textRef) = createRefs()

        Show(
            modifier = Modifier.constrainAs(iconRef) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            },
            onBack = onBack,
            onResign = onForceRestart,
            music = gameUiState.music,
            sound = gameUiState.sound,
            onSetSound = onSetSound,
            onSetMusic = onSetMusic

        )
        PlayersUi(
            modifier = Modifier
                .constrainAs(playerRef) {
                    bottom.linkTo(boardRef.top, margin = 16.dp)
                    centerHorizontallyTo(boardRef)
                },
            playerProvider = { gameUiState.ludoGameState.listOfPlayer }
        )

        BoardUi(
            modifier = Modifier
                .rotate(rotateF)
                .constrainAs(boardRef) {
                    linkTo(parent.start, parent.end)
                    linkTo(parent.top, parent.bottom)
                    width = Dimension.fillToConstraints
                },
            boardUiStateProvider = { gameUiState.ludoGameState.board }
        ) {

            // pawn

            // if (ludoGameState.listOfPawn.isNotEmpty()) {
            PawnsUi(
                pawnUiStateListProvider = { gameUiState.ludoGameState.listOfPawn },
                isHumanProvider = { gameUiState.ludoGameState.isHumanPlayer },
                getPositionIntOffset = getPositionIntOffset,
                onClick = onPawn
            )
            // }

            // dice

            // if (ludoGameState.listOfDice.isNotEmpty()) {
            DicesUi(
                diceUiStateListProvider = { gameUiState.ludoGameState.listOfDice },
                isHumanProvider = { gameUiState.ludoGameState.isHumanPlayer },
                onClick = onDice
            )
            // }

            // drawer

            DrawerUi(
                drawerUiStateProvider = { gameUiState.ludoGameState.drawer },
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
            counterUiStateListProvider = { gameUiState.ludoGameState.listOfCounter },
            isHumanProvider = { gameUiState.ludoGameState.isHumanPlayer },
            onCounterClick = onCounter
        )

        StartDialog(
            show = gameUiState.isStartDialogOpen,
            showContinueButton = gameUiState.showContinueButton,
            onYouAndComputer = onYouAndComputer,
            onTournament = onTournament,
            onContinueButton = onContinueClick,
            onBackPress = onBack
        )
        GameOverDialog(
            show = gameUiState.isRestartDialogOpen,
            onRestart = onRestart,
            players = gameUiState.ludoGameState.listOfPlayer,
            onHome = onBack
        )
    }
}

@Composable
fun GameScreenPhoneLand(
    gameUiState: GameUiState,
    rotateF: Float = 0f,
    paddingValues: PaddingValues = PaddingValues(),
    onYouAndComputer: () -> Unit = {},
    onTournament: () -> Unit = {},
    onContinueClick: () -> Unit = {},
    onRestart: () -> Unit = {},
    onDice: () -> Unit = {},
    onCounter: (Int) -> Unit = {},
    onPawn: (Int, Boolean) -> Unit = { _, _ -> },
    getPositionIntOffset: (Int, gameColor: GameColor) -> Point = { _, _ -> Point.zero },
    onBack: () -> Unit = {},
    onSetMusic: (Boolean) -> Unit = {},
    onSetSound: (Boolean) -> Unit = {},
    onForceRestart: () -> Unit = {}
) {
    val showText by remember(gameUiState.ludoGameState.board) {
        derivedStateOf { gameUiState.ludoGameState.board.pathBoxes.isEmpty() }
    }

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
    ) {

        val (iconRef, boardRef, counterRef, playerRef, textRef) = createRefs()
        Show(
            modifier = Modifier.constrainAs(iconRef) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            },
            onBack = onBack,
            onResign = onForceRestart,
            music = gameUiState.music,
            sound = gameUiState.sound,
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
            playerProvider = { gameUiState.ludoGameState.listOfPlayer }
        )

        BoardUi(
            modifier = Modifier
                .rotate(rotateF)
                .constrainAs(boardRef) {
                    linkTo(playerRef.end, counterRef.start)
                    linkTo(parent.top, parent.bottom)
                    height = Dimension.fillToConstraints
                },
            { gameUiState.ludoGameState.board }
        ) {

            // pawn

            // if (ludoGameState.listOfPawn.isNotEmpty()) {
            PawnsUi(
                pawnUiStateListProvider = { gameUiState.ludoGameState.listOfPawn },
                isHumanProvider = { gameUiState.ludoGameState.isHumanPlayer },
                getPositionIntOffset = getPositionIntOffset,
                onClick = onPawn
            )
            // }

            // dice

            // if (ludoGameState.listOfDice.isNotEmpty()) {
            DicesUi(
                diceUiStateListProvider = { gameUiState.ludoGameState.listOfDice },
                isHumanProvider = { gameUiState.ludoGameState.isHumanPlayer },
                onClick = onDice
            )
            // }

            // drawer

            DrawerUi(
                drawerUiStateProvider = { gameUiState.ludoGameState.drawer },
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
            counterUiStateListProvider = { gameUiState.ludoGameState.listOfCounter },
            isHumanProvider = { gameUiState.ludoGameState.isHumanPlayer },
            onCounterClick = onCounter
        )

        StartDialog(
            show = gameUiState.isStartDialogOpen,
            showContinueButton = gameUiState.showContinueButton,
            onYouAndComputer = onYouAndComputer,
            onTournament = onTournament,
            onContinueButton = onContinueClick,
            onBackPress = onBack
        )
        GameOverDialog(
            show = gameUiState.isRestartDialogOpen,
            onRestart = onRestart,
            players = gameUiState.ludoGameState.listOfPlayer,
            onHome = onBack
        )
    }
}

@Composable
fun GameScreeFoldPortrait(
    gameUiState: GameUiState,
    rotateF: Float = 0f,
    paddingValues: PaddingValues = PaddingValues(),
    onYouAndComputer: () -> Unit = {},
    onTournament: () -> Unit = {},
    onContinueClick: () -> Unit = {},
    onRestart: () -> Unit = {},
    onDice: () -> Unit = {},
    onCounter: (Int) -> Unit = {},
    onPawn: (Int, Boolean) -> Unit = { _, _ -> },
    getPositionIntOffset: (Int, gameColor: GameColor) -> Point = { _, _ -> Point.zero },
    onBack: () -> Unit = {},
    onSetMusic: (Boolean) -> Unit = {},
    onSetSound: (Boolean) -> Unit = {},
    onForceRestart: () -> Unit = {}
) {
    val showText by remember {
        derivedStateOf { gameUiState.ludoGameState.board.pathBoxes.isEmpty() }
    }

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),

    ) {
        val (iconRef, boardRef, counterRef, playerRef, textRef) = createRefs()
        createHorizontalChain(counterRef, playerRef)
        val barrier = createTopBarrier(counterRef, playerRef)
        Show(
            modifier = Modifier.constrainAs(iconRef) {
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
            },
            onBack = onBack,
            onResign = onForceRestart,
            music = gameUiState.music,
            sound = gameUiState.sound,
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
            { gameUiState.ludoGameState.board }
        ) {

            // pawn

            // if (ludoGameState.listOfPawn.isNotEmpty()) {
            PawnsUi(
                pawnUiStateListProvider = { gameUiState.ludoGameState.listOfPawn },
                isHumanProvider = { gameUiState.ludoGameState.isHumanPlayer },
                getPositionIntOffset = getPositionIntOffset,
                onClick = onPawn
            )
            // }

            // dice

            // if (ludoGameState.listOfDice.isNotEmpty()) {
            DicesUi(
                diceUiStateListProvider = { gameUiState.ludoGameState.listOfDice },
                isHumanProvider = { gameUiState.ludoGameState.isHumanPlayer },
                onClick = onDice
            )
            // }

            // drawer

            DrawerUi(
                drawerUiStateProvider = { gameUiState.ludoGameState.drawer },
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
                linkTo(barrier, parent.bottom)
            },
            counterUiStateListProvider = { gameUiState.ludoGameState.listOfCounter },
            isHumanProvider = { gameUiState.ludoGameState.isHumanPlayer },
            onCounterClick = onCounter
        )

        PlayersUiVertical(
            modifier = Modifier.constrainAs(playerRef) {
                linkTo(barrier, parent.bottom)
            },
            playerProvider = { gameUiState.ludoGameState.listOfPlayer }
        )

        StartDialog(
            show = gameUiState.isStartDialogOpen,
            showContinueButton = gameUiState.showContinueButton,
            onYouAndComputer = onYouAndComputer,
            onTournament = onTournament,
            onContinueButton = onContinueClick,
            onBackPress = onBack
        )
        GameOverDialog(
            show = gameUiState.isRestartDialogOpen,
            onRestart = onRestart,
            players = gameUiState.ludoGameState.listOfPlayer,
            onHome = onBack
        )
    }
}

@Composable
fun GameScreenLarge(
    gameUiState: GameUiState,
    rotateF: Float = 0f,
    paddingValues: PaddingValues = PaddingValues(),
    onYouAndComputer: () -> Unit = {},
    onTournament: () -> Unit = {},
    onContinueClick: () -> Unit = {},
    onRestart: () -> Unit = {},
    onDice: () -> Unit = {},
    onCounter: (Int) -> Unit = {},
    onPawn: (Int, Boolean) -> Unit = { _, _ -> },
    getPositionIntOffset: (Int, gameColor: GameColor) -> Point = { _, _ -> Point.zero },
    onBack: () -> Unit = {},
    onSetMusic: (Boolean) -> Unit = {},
    onSetSound: (Boolean) -> Unit = {},
    onForceRestart: () -> Unit = {}
) {
    val showText by remember {
        derivedStateOf { gameUiState.ludoGameState.board.pathBoxes.isEmpty() }
    }
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
    ) {

        val (iconRef, playerRef, boardRef, counterRef, textRef) = createRefs()

        Show(
            modifier = Modifier.constrainAs(iconRef) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            },
            onBack = onBack,
            onResign = onForceRestart,
            music = gameUiState.music,
            sound = gameUiState.sound,
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
            playerProvider = { gameUiState.ludoGameState.listOfPlayer }
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
            { gameUiState.ludoGameState.board }
        ) {

            // pawn

            // if (ludoGameState.listOfPawn.isNotEmpty()) {
            PawnsUi(
                pawnUiStateListProvider = { gameUiState.ludoGameState.listOfPawn },
                isHumanProvider = { gameUiState.ludoGameState.isHumanPlayer },
                getPositionIntOffset = getPositionIntOffset,
                onClick = onPawn
            )
            // }

            // dice

            //  if (ludoGameState.listOfDice.isNotEmpty()) {
            DicesUi(
                diceUiStateListProvider = { gameUiState.ludoGameState.listOfDice },
                isHumanProvider = { gameUiState.ludoGameState.isHumanPlayer },
                onClick = onDice
            )
            // }

            // drawer

            DrawerUi(
                drawerUiStateProvider = { gameUiState.ludoGameState.drawer },
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
            counterUiStateListProvider = { gameUiState.ludoGameState.listOfCounter },
            isHumanProvider = { gameUiState.ludoGameState.isHumanPlayer },
            onCounterClick = onCounter
        )
        // }
        // }
        StartDialog(
            show = gameUiState.isStartDialogOpen,
            showContinueButton = gameUiState.showContinueButton,
            onYouAndComputer = onYouAndComputer,
            onTournament = onTournament,
            onContinueButton = onContinueClick,
            onBackPress = onBack
        )
        GameOverDialog(
            show = gameUiState.isRestartDialogOpen,
            onRestart = onRestart,
            players = gameUiState.ludoGameState.listOfPlayer,
            onHome = onBack
        )
    }
}

@Preview(device = "id:Nexus 4")
@Composable
fun GameScreenPreview() {

    val game = LudoGame.getDefaultGameState()
    val state = GameUiState(ludoGameState = game.toLudoUiState(), isStartDialogOpen = false)
    GameScreen(
        gameUiState = state,
        getPositionIntOffset = game.board::getPositionIntPoint
    )
}

@Preview(device = "spec:parent=pixel_5,orientation=landscape")
@Composable
fun GameScreenLandPreview() {

    val game = LudoGame.getDefaultGameState()
    val state = GameUiState(ludoGameState = game.toLudoUiState(), isStartDialogOpen = false)
    GameScreen(
        gameUiState = state,
        getPositionIntOffset = game.board::getPositionIntPoint,
        deviceType = DEVICE_TYPE.PHONE_LAND

    )
}

@Preview(device = "spec:width=673.5dp,height=841dp,dpi=480")
@Composable
fun GameScreenFoldPreview() {
    val game = LudoGame.getDefaultGameState()
    val state = GameUiState(ludoGameState = game.toLudoUiState(), isStartDialogOpen = false)
    GameScreen(
        gameUiState = state,
        getPositionIntOffset = game.board::getPositionIntPoint,
        deviceType = DEVICE_TYPE.FOLD_PORT
    )
}

@Preview(device = "spec:width=673.5dp,height=841dp,dpi=480,orientation=landscape")
@Composable
fun GameScreenFoldLandPreview() {
    val game = LudoGame.getDefaultGameState()
    val state = GameUiState(ludoGameState = game.toLudoUiState(), isStartDialogOpen = false)
    GameScreen(
        gameUiState = state,
        getPositionIntOffset = game.board::getPositionIntPoint,
        deviceType = DEVICE_TYPE.FOLD_LAND_AND_TABLET_LAND
    )
}

@Preview(device = "spec:width=1280dp,height=800dp,dpi=480,orientation=portrait")
@Composable
fun GameScreenTabletPreview() {
    val game = LudoGame.getDefaultGameState()
    val state = GameUiState(ludoGameState = game.toLudoUiState(), isStartDialogOpen = false)
    GameScreen(
        gameUiState = state,
        getPositionIntOffset = game.board::getPositionIntPoint,
        deviceType = DEVICE_TYPE.TABLET_PORT
    )
}

@Preview(device = "spec:width=1280dp,height=800dp,dpi=480,orientation=landscape")
@Composable
fun GameScreenTabletLandPreview() {
    val game = LudoGame.getDefaultGameState()
    val state = GameUiState(ludoGameState = game.toLudoUiState(), isStartDialogOpen = false)
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
                text = { Text(text = "Resign") },
                onClick = { show = false; onResign() }
            )
            DropdownMenuItem(text = { Text(text = "Home") }, onClick = { show = false; onBack() })
            DropdownMenuItem(
                text = { Text(text = "Music") }, onClick = { },
                trailingIcon = { Switch(checked = music, onCheckedChange = onSetMusic) }
            )
            DropdownMenuItem(
                text = { Text(text = "Sound") }, onClick = { },
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
