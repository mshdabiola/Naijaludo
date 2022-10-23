package com.mshdabiola.gamescreen


import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.mshdabiola.gamescreen.state.toLudoUiState
import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.Point
import com.mshdabiola.gamescreen.component.BoardUi
import com.mshdabiola.gamescreen.component.CounterGroupUi
import com.mshdabiola.gamescreen.component.DicesUi
import com.mshdabiola.gamescreen.component.DrawerUi
import com.mshdabiola.gamescreen.component.PawnsUi
import com.mshdabiola.gamescreen.component.PlayersUi
import com.mshdabiola.gamescreen.component.UnCancelableDialog
import com.mshdabiola.naijaludo.LudoGame


@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
fun GameScreen(gameScreenViewModel: GameViewModel = hiltViewModel()) {

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
        onYouAndComputer = gameScreenViewModel::onYouAndComputer,
        onTournament = gameScreenViewModel::onTournament,
        onContinueClick = gameScreenViewModel::onContinueClick,
        onRestart = gameScreenViewModel::onRestart,
        onCounter = gameScreenViewModel::onCounter,
        onDice = gameScreenViewModel::onDice,
        onPawn = gameScreenViewModel::onPawn,
        getPositionIntOffset = gameScreenViewModel::getPositionIntOffset
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameScreen(
    gameUiState: GameUiState,
    rotateF: Float = 0f,
    onYouAndComputer: () -> Unit = {},
    onTournament: () -> Unit = {},
    onContinueClick: () -> Unit = {},
    onRestart: () -> Unit = {},
    onDice: () -> Unit = {},
    onCounter: (Int) -> Unit = {},
    onPawn: (Int, Boolean) -> Unit = { _, _ -> },
    getPositionIntOffset: (Int, gameColor: GameColor) -> Point = { _, _ -> Point.zero }
) {


    val ludoGameState = gameUiState.ludoGameState
    val board = ludoGameState.board
    val isHuman = gameUiState.ludoGameState.isHumanPlayer

    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),

            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            AnimatedVisibility(ludoGameState.listOfPlayer.isNotEmpty()) {
                PlayersUi(player = ludoGameState.listOfPlayer)
            }
            Spacer(modifier = Modifier.height(16.dp))

            AnimatedVisibility(visible = board.pathBoxes.isNotEmpty()) {
                BoardUi(modifier = Modifier.rotate(rotateF), board) {

                    //pawn

                    if (ludoGameState.listOfPawn.isNotEmpty()) {
                        PawnsUi(
                            pawnUiStateList = ludoGameState.listOfPawn,
                            isHuman = isHuman,
                            getPositionIntOffset = getPositionIntOffset,
                            onClick = onPawn
                        )
                    }


                    //dice

                    if (ludoGameState.listOfDice.isNotEmpty()) {
                        DicesUi(
                            diceUiStateList = ludoGameState.listOfDice,
                            isHuman = isHuman,
                            onClick = onDice
                        )
                    }


                    //drawer
                    val drawer = ludoGameState.drawer
                    if (drawer != null) {
                        DrawerUi(
                            drawerUiState = drawer,
                            getPositionIntOffset = getPositionIntOffset,
                            onPawnDrawer = onPawn
                        )

                    }


                }
            }
            AnimatedVisibility(visible = board.pathBoxes.isEmpty()) {
                Text(text = "Loading...", style = MaterialTheme.typography.headlineMedium)
            }

            Spacer(modifier = Modifier.height(16.dp))

            AnimatedVisibility(visible = ludoGameState.listOfCounter.isNotEmpty()) {
                CounterGroupUi(
                    modifier = Modifier,
                    counterUiStateList = ludoGameState.listOfCounter,
                    isHuman = isHuman,
                    onCounterClick = onCounter
                )
            }
            StartGameDialog(
                show = gameUiState.isStartDialogOpen,
                showContinueButton = gameUiState.showContinueButton,
                onYouAndComputer = onYouAndComputer,
                onTournament = onTournament,
                onContinueButton = onContinueClick
            )
            RestartDialog(
                show = gameUiState.isRestartDialogOpen,
                onRestart = onRestart
            )
        }
    }
}

@Preview
@Composable
fun GameScreenPreview() {


    val game = LudoGame.getDefaultGameState()
    val state = GameUiState(ludoGameState = game.toLudoUiState(), isStartDialogOpen = false)
    GameScreen(
        gameUiState = state,
        getPositionIntOffset = game.board::getPositionIntPoint
    )
}

@Composable
fun StartGameDialog(
    show: Boolean = true,
    showContinueButton: Boolean = false,
    onYouAndComputer: () -> Unit = {},
    onTournament: () -> Unit = {},
    onContinueButton: () -> Unit = {}

) {
    AnimatedVisibility(visible = show) {
        UnCancelableDialog(title = "Start Game") {

            //if(showContinueButton){
                Button(
                    enabled=showContinueButton,
                    onClick = onContinueButton
                ) {
                    Text(text = "Continue Game")
                }
           // }

            Button(onClick = onYouAndComputer) {
                Text(text = "You & Computer")
            }
            Button(onClick = onTournament) {
                Text(text = "Tournament")
            }
        }
    }
}

    @Preview
    @Composable
    fun StartGameDialogPreview() {
        StartGameDialog(show = true)
    }

    @Composable
    fun RestartDialog(
        show: Boolean = true,
        onRestart: () -> Unit = {}
    ) {
        AnimatedVisibility(visible = show) {
            UnCancelableDialog(title = "Restart Game") {
                Button(onClick = onRestart) {
                    Text(text = "Restart")
                }

            }
        }
    }

    @Preview
    @Composable
    fun RestartDialogPreview() {

        RestartDialog(show = true)
    }