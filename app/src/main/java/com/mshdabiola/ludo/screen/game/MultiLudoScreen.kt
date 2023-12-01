package com.mshdabiola.ludo.screen.game

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.mshdabiola.ludo.screen.DEVICE_TYPE
import com.mshdabiola.ludo.screen.game.component.BoardUi
import com.mshdabiola.ludo.screen.game.component.CounterGroupUi
import com.mshdabiola.ludo.screen.game.component.CounterGroupUiVertical
import com.mshdabiola.ludo.screen.game.component.DicesUi
import com.mshdabiola.ludo.screen.game.component.DrawerUi
import com.mshdabiola.ludo.screen.game.component.PawnsUi
import com.mshdabiola.ludo.screen.game.state.LudoUiState
import com.mshdabiola.ludo.screen.game.state.PointUiState
import com.mshdabiola.ludo.screen.game.state.toCounterUiState
import com.mshdabiola.ludo.screen.game.state.toLudoUiState
import com.mshdabiola.ludo.screen.game.state.toPointUiState
import com.mshdabiola.naijaludo.model.Constant
import com.mshdabiola.naijaludo.model.GameColor
import com.mshdabiola.naijaludo.model.GameType
import kotlinx.collections.immutable.toImmutableList

@Composable
fun GameScreenMultiLand(
    gameUiState: LudoUiState,
    music: Boolean = false,
    sound: Boolean = false,
    rotateF: Float = 0f,
    paddingValues: PaddingValues = PaddingValues(),
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
    navigateToMarket: () -> Unit,
) {
//    val showText by remember(gameUiState.board.pathBoxes) {
//        derivedStateOf { gameUiState.board.pathBoxes.isEmpty() }
//    }
    val counter1 by remember(gameUiState.listOfCounter) {
        val index = gameUiState.listOfPlayer.indexOfFirst { it.isCurrent }
        mutableStateOf(
            if (index == 0) {
                gameUiState.listOfCounter
            } else {
                Constant.getDefaultCounter().map { it.toCounterUiState() }.toImmutableList()
            },
        )
    }

    val counter2 by remember(gameUiState.listOfCounter) {
        val index = gameUiState.listOfPlayer.indexOfFirst { it.isCurrent }
        mutableStateOf(
            if (index == 1) {
                gameUiState.listOfCounter
            } else {
                Constant.getDefaultCounter().map { it.toCounterUiState() }.toImmutableList()
            },
        )
    }

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
    ) {
        val (iconRef, boardRef, counterRef, counterRef2) = createRefs()

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
            onSetMusic = onSetMusic,

            )



        BoardUi(
            modifier = Modifier
                .rotate(rotateF)
                .constrainAs(boardRef) {
                    linkTo(parent.start, parent.end)
                    bottom.linkTo(parent.bottom)
                    top.linkTo(parent.top)
                    height = Dimension.fillToConstraints
                },
            { gameUiState.board },
        ) {
            // pawn

            // if (ludoGameState.listOfPawn.isNotEmpty()) {
            PawnsUi(
                pawnUiStateListProvider = { gameUiState.listOfPawn },
                isHumanProvider = { gameUiState.isHumanPlayer },
                getPositionIntOffset = getPositionIntOffset,
                onClick = onPawn,
            )
            // }

            // dice

            //  if (ludoGameState.listOfDice.isNotEmpty()) {
            DicesUi(
                diceUiStateListProvider = { gameUiState.listOfDice },
                isHumanProvider = { gameUiState.isHumanPlayer },
                onClick = onDice,
            )
            // }

            // drawer

            DrawerUi(
                drawerUiStateProvider = { gameUiState.drawer },
                getPositionIntOffset = getPositionIntOffset,
                onPawnDrawer = onPawn,
            )
        }

//        AnimatedVisibility(
//            modifier = Modifier.constrainAs(textRef) {
//                linkTo(parent.start, parent.end)
//                linkTo(parent.top, parent.bottom)
//            },
//            visible = showText
//        ) {
//            Text(text = "Loading...", style = MaterialTheme.typography.headlineMedium)
//        }

        CounterGroupUiVertical(
            modifier = Modifier
                .constrainAs(counterRef2) {
                    centerVerticallyTo(boardRef)
                    linkTo(boardRef.end, parent.end, bias = 0.1f)
                },
            counterUiStateListProvider = { counter2 },
            isHumanProvider = { gameUiState.isHumanPlayer },
            onCounterClick = onCounter,
            rotateButton = -90f,
        )
        CounterGroupUiVertical(
            modifier = Modifier
                .constrainAs(counterRef) {
                    centerVerticallyTo(boardRef)
                    linkTo(parent.start, boardRef.start, bias = 0.9f)
                },
            counterUiStateListProvider = { counter1 },
            isHumanProvider = { gameUiState.isHumanPlayer },
            onCounterClick = onCounter,
            rotateButton = 90f,
        )
    }
}

@Composable
fun GameScreenMultiPhoneLand(
    gameUiState: LudoUiState,
    music: Boolean = false,
    sound: Boolean = false,
    rotateF: Float = 0f,
    paddingValues: PaddingValues = PaddingValues(),
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
    navigateToMarket: () -> Unit,
) {
//    val showText by remember(gameUiState.board.pathBoxes) {
//        derivedStateOf { gameUiState.board.pathBoxes.isEmpty() }
//    }
    val counter1 by remember(gameUiState.listOfCounter) {
        val index = gameUiState.listOfPlayer.indexOfFirst { it.isCurrent }
        mutableStateOf(
            if (index == 0) {
                gameUiState.listOfCounter
            } else {
                Constant.getDefaultCounter().map { it.toCounterUiState() }.toImmutableList()
            },
        )
    }

    val counter2 by remember(gameUiState.listOfCounter) {
        val index = gameUiState.listOfPlayer.indexOfFirst { it.isCurrent }
        mutableStateOf(
            if (index == 1) {
                gameUiState.listOfCounter
            } else {
                Constant.getDefaultCounter().map { it.toCounterUiState() }.toImmutableList()
            },
        )
    }

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
    ) {
        val (iconRef, boardRef, counterRef, counterRef2) = createRefs()

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
            onSetMusic = onSetMusic,

            )


        BoardUi(
            modifier = Modifier
                .rotate(rotateF)
                .constrainAs(boardRef) {
                    linkTo(parent.start, parent.end)
                    linkTo(parent.top, parent.bottom)
                    height = Dimension.fillToConstraints
                },
            { gameUiState.board },
        ) {
            // pawn

            // if (ludoGameState.listOfPawn.isNotEmpty()) {
            PawnsUi(
                pawnUiStateListProvider = { gameUiState.listOfPawn },
                isHumanProvider = { gameUiState.isHumanPlayer },
                getPositionIntOffset = getPositionIntOffset,
                onClick = onPawn,
            )
            // }

            // dice

            //  if (ludoGameState.listOfDice.isNotEmpty()) {
            DicesUi(
                diceUiStateListProvider = { gameUiState.listOfDice },
                isHumanProvider = { gameUiState.isHumanPlayer },
                onClick = onDice,
            )
            // }

            // drawer

            DrawerUi(
                drawerUiStateProvider = { gameUiState.drawer },
                getPositionIntOffset = getPositionIntOffset,
                onPawnDrawer = onPawn,
            )
        }

//        AnimatedVisibility(
//            modifier = Modifier.constrainAs(textRef) {
//                linkTo(parent.start, parent.end)
//                linkTo(parent.top, parent.bottom)
//            },
//            visible = showText
//        ) {
//            Text(text = "Loading...", style = MaterialTheme.typography.headlineMedium)
//        }

        CounterGroupUiVertical(
            modifier = Modifier
                .constrainAs(counterRef2) {
                    centerVerticallyTo(boardRef)
                    linkTo(boardRef.end, parent.end, bias = 0.1f)
                },
            counterUiStateListProvider = { counter2 },
            isHumanProvider = { gameUiState.isHumanPlayer },
            onCounterClick = onCounter,
            rotateButton = -90f,
        )
        CounterGroupUiVertical(
            modifier = Modifier
                .constrainAs(counterRef) {
                    centerVerticallyTo(boardRef)
                    linkTo(parent.start, boardRef.start, bias = 0.9f)
                },
            counterUiStateListProvider = { counter1 },
            isHumanProvider = { gameUiState.isHumanPlayer },
            onCounterClick = onCounter,
            rotateButton = 90f,
        )
    }
}

@Composable
fun GameScreenMultiPort(
    gameUiState: LudoUiState,
    music: Boolean = false,
    sound: Boolean = false,
    rotateF: Float = 0f,
    paddingValues: PaddingValues = PaddingValues(),
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
    navigateToMarket: () -> Unit,
) {
//    val showText by remember(gameUiState.board.pathBoxes) {
//        derivedStateOf { gameUiState.board.pathBoxes.isEmpty() }
//    }

    val counter1 by remember(gameUiState.listOfCounter) {
        val index = gameUiState.listOfPlayer.indexOfFirst { it.isCurrent }
        mutableStateOf(
            if (index == 0) {
                gameUiState.listOfCounter
            } else {
                Constant.getDefaultCounter().map { it.toCounterUiState() }.toImmutableList()
            },
        )
    }

    val counter2 by remember(gameUiState.listOfCounter) {
        val index = gameUiState.listOfPlayer.indexOfFirst { it.isCurrent }
        mutableStateOf(
            if (index == 1) {
                gameUiState.listOfCounter
            } else {
                Constant.getDefaultCounter().map { it.toCounterUiState() }.toImmutableList()
            },
        )
    }

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
    ) {
        val (iconRef, boardRef, counterRef, counterRef2) = createRefs()

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
            onSetMusic = onSetMusic,

            )


        BoardUi(
            modifier = Modifier
                .rotate(rotateF)
                .constrainAs(boardRef) {
                    linkTo(parent.start, parent.end)
                    bottom.linkTo(parent.bottom)
                    top.linkTo(parent.top)
                    width = Dimension.fillToConstraints
                },
            { gameUiState.board },
        ) {
            // pawn

            // if (ludoGameState.listOfPawn.isNotEmpty()) {
            PawnsUi(
                pawnUiStateListProvider = { gameUiState.listOfPawn },
                isHumanProvider = { gameUiState.isHumanPlayer },
                getPositionIntOffset = getPositionIntOffset,
                onClick = onPawn,
            )
            // }

            // dice

            //  if (ludoGameState.listOfDice.isNotEmpty()) {
            DicesUi(
                diceUiStateListProvider = { gameUiState.listOfDice },
                isHumanProvider = { gameUiState.isHumanPlayer },
                onClick = onDice,
            )
            // }

            // drawer

            DrawerUi(
                drawerUiStateProvider = { gameUiState.drawer },
                getPositionIntOffset = getPositionIntOffset,
                onPawnDrawer = onPawn,
            )
        }

//        AnimatedVisibility(
//            modifier = Modifier.constrainAs(textRef) {
//                linkTo(parent.start, parent.end)
//                linkTo(parent.top, parent.bottom)
//            },
//            visible = showText
//        ) {
//            Text(text = "Loading...", style = MaterialTheme.typography.headlineMedium)
//        }

        CounterGroupUi(
            modifier = Modifier
                .constrainAs(counterRef) {
                    centerHorizontallyTo(boardRef)
                    linkTo(parent.top, boardRef.top, bias = 0.9f)
                },
            counterUiStateListProvider = { counter1 },
            isHumanProvider = { gameUiState.isHumanPlayer },
            onCounterClick = onCounter,
            rotateButton = 180f,
        )

        CounterGroupUi(
            modifier = Modifier
                .constrainAs(counterRef2) {
                    centerHorizontallyTo(boardRef)
                    linkTo(boardRef.bottom, parent.bottom, bias = 0.1f)
                },
            counterUiStateListProvider = { counter2 },
            isHumanProvider = { gameUiState.isHumanPlayer },
            onCounterClick = onCounter,
        )
    }
}

@Preview(device = "id:pixel_5")
@Composable
fun GameScreenMPreview() {
    val game = Constant.getDefaultGameState()
    val state = game
        .copy(
            listOfCounter = game.listOfCounter.map { it.copy(number = 4) },
            listOfPlayer = game.listOfPlayer.map { it.copyPlayer(isCurrent = true) },
        )
        .toLudoUiState()
        .copy(gameType = GameType.FRIEND)
    GameScreen(
        gameUiState = state,
        getPositionIntOffset = { x: Int, y: GameColor ->
            game.board.getBoxByIndex(x, y).toPointUiState()        },
        deviceType = DEVICE_TYPE.PHONE_PORT
    )
}

@Preview(device = "spec:parent=pixel_5,orientation=landscape")
@Composable
fun GameScreenLandMPreview() {
    val game = Constant.getDefaultGameState()
    val state = game
        .copy(
            listOfCounter = game.listOfCounter.map { it.copy(number = 4) },
            listOfPlayer = game.listOfPlayer.map { it.copyPlayer(isCurrent = true) },
        )
        .toLudoUiState()
        .copy(gameType = GameType.FRIEND)
    GameScreen(
        gameUiState = state,
        getPositionIntOffset = { x: Int, y: GameColor ->
            game.board.getBoxByIndex(x, y).toPointUiState()        },
        deviceType = DEVICE_TYPE.PHONE_LAND

    )
}

@Preview(device = "spec:width=673.5dp,height=841dp,dpi=480")
@Composable
fun GameScreenFoldMPreview() {
    val game = Constant.getDefaultGameState()
    val state = game
        .copy(
            listOfCounter = game.listOfCounter.map { it.copy(number = 4) },
            listOfPlayer = game.listOfPlayer.map { it.copyPlayer(isCurrent = true) },
        )
        .toLudoUiState()
        .copy(gameType = GameType.FRIEND)
    GameScreen(
        gameUiState = state,
        getPositionIntOffset = { x: Int, y: GameColor ->
            game.board.getBoxByIndex(x, y).toPointUiState()        },
        deviceType = DEVICE_TYPE.FOLD_PORT
    )
}

@Preview(device = "spec:width=673.5dp,height=841dp,dpi=480,orientation=landscape")
@Composable
fun GameScreenFoldLandMPreview() {
    val game = Constant.getDefaultGameState()
    val state = game
        .copy(
            listOfCounter = game.listOfCounter.map { it.copy(number = 4) },
            listOfPlayer = game.listOfPlayer.map { it.copyPlayer(isCurrent = true) },
        )
        .toLudoUiState()
        .copy(gameType = GameType.FRIEND)
    GameScreen(
        gameUiState = state,
        getPositionIntOffset = { x: Int, y: GameColor ->
            game.board.getBoxByIndex(x, y).toPointUiState()        },
        deviceType = DEVICE_TYPE.FOLD_LAND_AND_TABLET_LAND
    )
}

@Preview(device = "spec:width=1280dp,height=800dp,dpi=480,orientation=portrait")
@Composable
fun GameScreenTabletMPreview() {
    val game = Constant.getDefaultGameState()
    val state = game
        .copy(
            listOfCounter = game.listOfCounter.map { it.copy(number = 4) },
            listOfPlayer = game.listOfPlayer.map { it.copyPlayer(isCurrent = true) },
        )
        .toLudoUiState()
        .copy(gameType = GameType.FRIEND)
    GameScreen(
        gameUiState = state,
        getPositionIntOffset = { x: Int, y: GameColor ->
            game.board.getBoxByIndex(x, y).toPointUiState()        },
        deviceType = DEVICE_TYPE.TABLET_PORT
    )
}

@Preview(device = "spec:width=1280dp,height=800dp,dpi=480,orientation=landscape")
@Composable
fun GameScreenTabletLandMPreview() {
    val game = Constant.getDefaultGameState()
    val state = game
        .copy(
            listOfCounter = game.listOfCounter.map { it.copy(number = 4) },
            listOfPlayer = game.listOfPlayer.map { it.copyPlayer(isCurrent = true) },
        )
        .toLudoUiState()
        .copy(gameType = GameType.FRIEND)
    GameScreen(
        gameUiState = state,
        getPositionIntOffset = { x: Int, y: GameColor ->
            game.board.getBoxByIndex(x, y).toPointUiState()        },
        deviceType = DEVICE_TYPE.FOLD_LAND_AND_TABLET_LAND
    )
}
