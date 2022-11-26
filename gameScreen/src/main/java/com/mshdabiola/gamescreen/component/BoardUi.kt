package com.mshdabiola.gamescreen.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mshdabiola.gamescreen.state.BoardUiState
import com.mshdabiola.gamescreen.state.toBoardUiState
import com.mshdabiola.ludo.model.Board
import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.Point

@Composable
fun BoardUi(
    modifier: Modifier = Modifier,
    boardUiStateProvider: () -> BoardUiState,
    content: @Composable BoxScope.() -> Unit = {}
) {
    val boardUiState = boardUiStateProvider()
    AnimatedVisibility(
        modifier = modifier.aspectRatio(1f),
        visible = boardUiState.pathBoxes.isNotEmpty()
    ) {
        BoxWithConstraints(
            modifier = modifier
                .background(Color.White)
        ) {

            val oneUnit = maxHeight / 15

            CompositionLocalProvider(LocalUnitDP provides oneUnit) {
                BoardBoxUi(boardUiState = boardUiState)
                content()
            }
        }
    }
}

@Composable
fun BoardBoxUi(boardUiState: BoardUiState) {

//    val redIndex = remember(boardUiState.colors) {
//        boardUiState.colors.indexOf(GameColor.RED) * 90f
//    }

    Box(modifier = Modifier) {
        CenterGraphic(point = Point(6f, 6f))
        boardUiState.homeBoxes.forEachIndexed { index, box ->
            HomeBoxUi(box = box, colorIndex = index, boardType = boardUiState.boardType)
        }
        boardUiState.pathBoxes.forEach {
            BoxUi(box = it)
        }
        boardUiState.heavenBoxes.forEach {
            SafeBoxUi(box = it)
        }
        if (boardUiState.pathBoxes.isNotEmpty()) {
            ArrowImage()
        }
    }
}

@Composable
fun ArrowImage() {
    val oneUnit = LocalUnitDP.current
    Box(Modifier.fillMaxSize()) {
        for (r in 0..270 step 90) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .rotate(r.toFloat())
            ) {
                ArrowBox(
                    modifier = Modifier
                        .size(oneUnit.times(2), oneUnit)
                        .padding(oneUnit.div(4))
                        .offset(0.dp, oneUnit.times(7))
                )
                ArrowBox(
                    modifier = Modifier
                        .size(oneUnit.times(2), oneUnit)
                        .padding(oneUnit.div(4))
                        .offset(
                            oneUnit.times(3),
                            oneUnit.times(6)
                        )
                )
                ArrowBox(
                    modifier = Modifier
                        .size(oneUnit.times(2), oneUnit)
                        .padding(oneUnit.div(4))
                        .offset(
                            oneUnit.times(5),
                            oneUnit.times(5.5f)
                        )
                        .rotate(-45f)
                )
            }
        }
    }
}

@Preview
@Composable
fun BoardPreview() {
    val board = Board(
        listOf(
            GameColor.GREEN,
            GameColor.YELLOW,
            GameColor.BLUE,
            GameColor.RED
        )
    ).toBoardUiState()
    BoardUi(boardUiStateProvider = { board }) {
    }
}

val LocalUnitDP = compositionLocalOf { 10.dp }
