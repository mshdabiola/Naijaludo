package com.mshdabiola.gamescreen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.mshdabiola.designsystem.component.BannerAdmob
import com.mshdabiola.gamescreen.component.BoardUi
import com.mshdabiola.gamescreen.component.CounterGroupUi
import com.mshdabiola.gamescreen.component.CounterGroupUiVertical
import com.mshdabiola.gamescreen.component.DicesUi
import com.mshdabiola.gamescreen.component.DrawerUi
import com.mshdabiola.gamescreen.component.PawnsUi
import com.mshdabiola.gamescreen.state.LudoUiState
import com.mshdabiola.gamescreen.state.PointUiState
import com.mshdabiola.gamescreen.state.toCounterUiState
import com.mshdabiola.gamescreen.state.toLudoUiState
import com.mshdabiola.gamescreen.state.toPointUiState
import com.mshdabiola.ludo.model.Constant
import com.mshdabiola.ludo.model.GameColor
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
    onForceRestart: () -> Unit = {}
) {
    val showText by remember(gameUiState.board.pathBoxes) {
        derivedStateOf { gameUiState.board.pathBoxes.isEmpty() }
    }
    val counter1 by remember(gameUiState.listOfCounter) {
        val index = gameUiState.listOfPlayer.indexOfFirst { it.isCurrent }
        mutableStateOf(
            if (index == 0) {
                gameUiState.listOfCounter
            } else {
                Constant.getDefaultCounter().map { it.toCounterUiState() }.toImmutableList()
            }
        )
    }

    val counter2 by remember(gameUiState.listOfCounter) {
        val index = gameUiState.listOfPlayer.indexOfFirst { it.isCurrent }
        mutableStateOf(
            if (index == 1) {
                gameUiState.listOfCounter
            } else {
                Constant.getDefaultCounter().map { it.toCounterUiState() }.toImmutableList()
            }
        )
    }

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
    ) {

        val (iconRef, playerRef, boardRef, counterRef, counterRef2, textRef, adRef) = createRefs()

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

        BannerAdmob(
            Modifier
                .constrainAs(adRef) {
                    top.linkTo(parent.top, 16.dp)
                    bottom.linkTo(boardRef.top, 16.dp)
                    start.linkTo(boardRef.start)
                    end.linkTo(boardRef.end)
                }

        )

        BoardUi(
            modifier = Modifier
                .rotate(rotateF)
                .constrainAs(boardRef) {
                    linkTo(parent.start, parent.end)
                    bottom.linkTo(parent.bottom)
                    top.linkTo(adRef.bottom)
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

        CounterGroupUiVertical(
            modifier = Modifier
                .constrainAs(counterRef) {

                    centerVerticallyTo(boardRef)
                    linkTo(boardRef.end, parent.end, bias = 0.1f)
                },
            counterUiStateListProvider = { counter1 },
            isHumanProvider = { gameUiState.isHumanPlayer },
            onCounterClick = onCounter
        )
        CounterGroupUiVertical(
            modifier = Modifier
                .constrainAs(counterRef2) {

                    centerVerticallyTo(boardRef)
                    linkTo(parent.start, boardRef.start, bias = 0.9f)
                },
            counterUiStateListProvider = { counter2 },
            isHumanProvider = { gameUiState.isHumanPlayer },
            onCounterClick = onCounter
        )
    }
}

@Preview(device = "spec:width=673.5dp,height=841dp,dpi=480,orientation=landscape")
@Composable
fun GameScreenMultiLandPreview() {

    val game = Constant.getDefaultGameState()
    val state = game.toLudoUiState()
    GameScreenMultiLand(
        gameUiState = state,
        getPositionIntOffset = { x: Int, y: GameColor ->
            game.board.getPositionIntPoint(x, y).toPointUiState()
        }
    )
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
    onForceRestart: () -> Unit = {}
) {
    val showText by remember(gameUiState.board.pathBoxes) {
        derivedStateOf { gameUiState.board.pathBoxes.isEmpty() }
    }

    val counter1 by remember(gameUiState.listOfCounter) {
        val index = gameUiState.listOfPlayer.indexOfFirst { it.isCurrent }
        mutableStateOf(
            if (index == 0) {
                gameUiState.listOfCounter
            } else {
                Constant.getDefaultCounter().map { it.toCounterUiState() }.toImmutableList()
            }
        )
    }

    val counter2 by remember(gameUiState.listOfCounter) {
        val index = gameUiState.listOfPlayer.indexOfFirst { it.isCurrent }
        mutableStateOf(
            if (index == 1) {
                gameUiState.listOfCounter
            } else {
                Constant.getDefaultCounter().map { it.toCounterUiState() }.toImmutableList()
            }
        )
    }

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
    ) {

        val (iconRef, playerRef, boardRef, counterRef, counterRef2, textRef, adRef) = createRefs()

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

//        BannerAdmob(
//            Modifier
//                .constrainAs(adRef) {
//                    top.linkTo(parent.top, 16.dp)
//                    bottom.linkTo(boardRef.top, 16.dp)
//                    start.linkTo(boardRef.start)
//                    end.linkTo(boardRef.end)
//                }
//
//        )

        BoardUi(
            modifier = Modifier
                .rotate(rotateF)
                .constrainAs(boardRef) {
                    linkTo(parent.start, parent.end)
                    bottom.linkTo(parent.bottom)
                    top.linkTo(parent.top)
                    width = Dimension.fillToConstraints
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

        CounterGroupUi(
            modifier = Modifier
                .constrainAs(counterRef) {

                    centerHorizontallyTo(boardRef)
                    linkTo(parent.top, boardRef.top, bias = 0.9f)
                },
            counterUiStateListProvider = { counter1 },
            isHumanProvider = { gameUiState.isHumanPlayer },
            onCounterClick = onCounter
        )

        CounterGroupUi(
            modifier = Modifier
                .constrainAs(counterRef2) {

                    centerHorizontallyTo(boardRef)
                    linkTo(boardRef.bottom, parent.bottom, bias = 0.1f)
                },
            counterUiStateListProvider = { counter2 },
            isHumanProvider = { gameUiState.isHumanPlayer },
            onCounterClick = onCounter
        )
    }
}

@Preview(device = "id:Nexus One")
@Composable
fun GameScreenMultiPortPreview() {

    val game = Constant.getDefaultGameState()
    val state = game.toLudoUiState()
    GameScreenMultiPort(
        gameUiState = state,
        getPositionIntOffset = { x: Int, y: GameColor ->
            game.board.getPositionIntPoint(x, y).toPointUiState()
        }
    )
}
