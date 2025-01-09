package com.mshdabiola.game

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.mshdabiola.naijaludo.model.GameColor
import com.mshdabiola.ui.BoardUi
import com.mshdabiola.ui.CounterGroupUi
import com.mshdabiola.ui.CounterGroupUiVertical
import com.mshdabiola.ui.DicesUi
import com.mshdabiola.ui.DrawerUi
import com.mshdabiola.ui.MarketButton
import com.mshdabiola.ui.PawnsUi
import com.mshdabiola.ui.PlayersUi
import com.mshdabiola.ui.PlayersUiVertical
import com.mshdabiola.ui.RankCard
import com.mshdabiola.ui.state.LudoUiState
import com.mshdabiola.ui.state.PointUiState
import naijaludo.features.game.generated.resources.Res
import naijaludo.features.game.generated.resources.give_up
import naijaludo.features.game.generated.resources.home
import naijaludo.features.game.generated.resources.music
import naijaludo.features.game.generated.resources.sound
import org.jetbrains.compose.resources.stringResource

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
    getPositionIntOffset: (Int, gameColor: GameColor) -> PointUiState = { _, _ ->
        PointUiState.Zero
    },
    onBack: () -> Unit = {},
    onSetMusic: (Boolean) -> Unit = {},
    onSetSound: (Boolean) -> Unit = {},
    onForceRestart: () -> Unit = {},
    navigateToMarket: () -> Unit,
) {
//    val showText by remember(gameUiState.board) {
//        derivedStateOf { gameUiState.board.pathBoxes.isEmpty() }
//    }

    val numb = remember {
        gameUiState.listOfPlayer.size
    }

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
    ) {
        val (iconRef, boardRef, counterRef, playerRef, rankRef) = createRefs()

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
        Row(
            modifier = Modifier
                .padding(end = 8.dp)
                .constrainAs(rankRef) {
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                },
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            MarketButton(onClick = navigateToMarket)

            if (gameUiState.listOfPlayer.any { it.isComputer }) {
                RankCard(
                    Modifier
                        .width(70.dp),
//                    leadRes = if (numb == 2) {
//                        Res.string.leaderboard_solo_player_rank
//                    } else {
//                        Res.string.leaderboard_trio_player_rank
//                    },
                )
            }
        }

        PlayersUi(
            modifier = Modifier
                .constrainAs(playerRef) {
                    linkTo(parent.top, boardRef.top, bias = 0.9f)
                    centerHorizontallyTo(boardRef)
                },
            playerProvider = { gameUiState.listOfPlayer },
        )

        BoardUi(
            modifier = Modifier
                .rotate(rotateF)
                .constrainAs(boardRef) {
                    linkTo(parent.start, parent.end)
                    linkTo(parent.top, parent.bottom)
                    width = Dimension.fillToConstraints
                },
            boardUiStateProvider = { gameUiState.board },
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

            // if (ludoGameState.listOfDice.isNotEmpty()) {
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
        // }
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
                    linkTo(boardRef.bottom, parent.bottom, bias = 0.1f)
                    centerHorizontallyTo(boardRef)
                },
            counterUiStateListProvider = { gameUiState.listOfCounter },
            isHumanProvider = { gameUiState.isHumanPlayer },
            onCounterClick = onCounter,
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
    getPositionIntOffset: (Int, gameColor: GameColor) -> PointUiState = { _, _ ->
        PointUiState.Zero
    },
    onBack: () -> Unit = {},
    onSetMusic: (Boolean) -> Unit = {},
    onSetSound: (Boolean) -> Unit = {},
    onForceRestart: () -> Unit = {},
    navigateToMarket: () -> Unit,
) {
//    val showText by remember(gameUiState.board) {
//        derivedStateOf { gameUiState.board.pathBoxes.isEmpty() }
//    }
    val numb = remember {
        gameUiState.listOfPlayer.size
    }
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
    ) {
        val (iconRef, boardRef, counterRef, playerRef, rankRef) = createRefs()
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
        Column(
            modifier = Modifier
                .padding(start = 8.dp)
                .constrainAs(rankRef) {
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                },
            verticalArrangement = Arrangement.spacedBy(8.dp),

        ) {
            MarketButton(onClick = navigateToMarket)
            if (gameUiState.listOfPlayer.any { it.isComputer }) {
                RankCard(
                    Modifier
                        .width(70.dp),
//                    leadRes = if (numb == 2) {
//                        Res.string.leaderboard_solo_player_rank
//                    } else {
//                        Res.string.leaderboard_trio_player_rank
//                    },
                )
            }
        }

        PlayersUiVertical(
            modifier = Modifier
                .constrainAs(playerRef) {
                    // end.linkTo(boardRef.start, margin = 16.dp)
                    linkTo(parent.start, boardRef.start, bias = 0.9f)
                    centerVerticallyTo(boardRef)
                },
            playerProvider = { gameUiState.listOfPlayer },
        )

        BoardUi(
            modifier = Modifier
                .rotate(rotateF)
                .constrainAs(boardRef) {
                    linkTo(parent.start, parent.end, bias = 0.6f)
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

            // if (ludoGameState.listOfDice.isNotEmpty()) {
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
        // }
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
                .constrainAs(counterRef) {
                    linkTo(boardRef.end, parent.end, bias = 0.1f)
                    // start.linkTo(boardRef.end, margin = 16.dp)
                    centerVerticallyTo(boardRef)
                },
            counterUiStateListProvider = { gameUiState.listOfCounter },
            isHumanProvider = { gameUiState.isHumanPlayer },
            onCounterClick = onCounter,
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
    val numb = remember {
        gameUiState.listOfPlayer.size
    }

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),

    ) {
        val (iconRef, boardRef, counterRef, playerRef, rankRef) = createRefs()
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
            onSetMusic = onSetMusic,

        )
        Column(
            modifier = Modifier
                .padding(end = 8.dp)
                .constrainAs(rankRef) {
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                },
            verticalArrangement = Arrangement.spacedBy(8.dp),

        ) {
            if (gameUiState.listOfPlayer.any { it.isComputer }) {
                RankCard(
                    Modifier
                        .width(70.dp),
//                    leadRes = if (numb == 2) {
//                        Res.string.leaderboard_solo_player_rank
//                    } else {
//                        Res.string.leaderboard_trio_player_rank
//                    },
                )
            }
            MarketButton(onClick = navigateToMarket)
        }

        BoardUi(
            modifier = Modifier
                .rotate(rotateF)
                .constrainAs(boardRef) {
                    linkTo(parent.start, parent.end)
                    linkTo(parent.top, barrier)
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

            // if (ludoGameState.listOfDice.isNotEmpty()) {
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
            modifier = Modifier.constrainAs(counterRef) {
                linkTo(barrier, parent.bottom)
            },
            counterUiStateListProvider = { gameUiState.listOfCounter },
            isHumanProvider = { gameUiState.isHumanPlayer },
            onCounterClick = onCounter,
        )

        PlayersUiVertical(
            modifier = Modifier.constrainAs(playerRef) {
                linkTo(barrier, parent.bottom)
            },
            playerProvider = { gameUiState.listOfPlayer },
            isFold = true,
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
    val numb = remember {
        gameUiState.listOfPlayer.size
    }
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
    ) {
        val (iconRef, playerRef, boardRef, counterRef, rankRef) = createRefs()

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

        Column(
            modifier = Modifier
                .padding(end = 8.dp)
                .constrainAs(rankRef) {
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                },
            verticalArrangement = Arrangement.spacedBy(8.dp),

        ) {
            if (gameUiState.listOfPlayer.any { it.isComputer }) {
                RankCard(
                    Modifier
                        .width(70.dp),
//                    leadRes = if (numb == 2) {
//                        Res.string.leaderboard_solo_player_rank
//                    } else {
//                        Res.string.leaderboard_trio_player_rank
//                    },
                )
            }
            MarketButton(onClick = navigateToMarket)
        }

        PlayersUi(
            modifier = Modifier
                .constrainAs(playerRef) {
                    top.linkTo(parent.top, 16.dp)
                    bottom.linkTo(boardRef.top, 16.dp)
                    start.linkTo(boardRef.start)
                    end.linkTo(boardRef.end)
                },
            playerProvider = { gameUiState.listOfPlayer },
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
            onCounterClick = onCounter,
        )
        // }
        // }
    }
}

@Composable
fun Show(
    modifier: Modifier = Modifier,
    onResign: () -> Unit = {},
    onBack: () -> Unit = {},
    music: Boolean = false,
    sound: Boolean = false,
    onSetMusic: (Boolean) -> Unit = {},
    onSetSound: (Boolean) -> Unit = {},
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
                text = { Text(text = stringResource(Res.string.give_up)) },
                onClick = { show = false; onResign() },
            )
            DropdownMenuItem(
                text = { Text(text = stringResource(Res.string.home)) },
                onClick = { show = false; onBack() },
            )
            DropdownMenuItem(
                text = { Text(text = stringResource(Res.string.music)) },
                onClick = { },
                trailingIcon = { Switch(checked = music, onCheckedChange = onSetMusic) },
            )
            DropdownMenuItem(
                text = { Text(text = stringResource(Res.string.sound)) },
                onClick = { },
                trailingIcon = { Switch(checked = sound, onCheckedChange = onSetSound) },
            )
        }
    }
}
