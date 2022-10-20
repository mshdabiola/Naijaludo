package com.mshdabiola.ludo.ui.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mshdabiola.ludo.R
import com.mshdabiola.ludo.ui.gamescreen.state.BoardUiState
import com.mshdabiola.ludo.ui.gamescreen.state.toBoardUiState
import com.mshdabiola.naijaludo.state.Board
import com.mshdabiola.naijaludo.state.GameColor

@Composable
fun BoardUi(
    modifier: Modifier = Modifier,
    boardUiState: BoardUiState,
    content: @Composable BoxScope.() -> Unit = {}
) {


    BoxWithConstraints(
        modifier = modifier
            .fillMaxWidth()
            .aspectRatio(1f)
            .background(Color.White)
    ) {

        val oneUnit = maxHeight / 15

        CompositionLocalProvider(LocalUnitDP provides oneUnit) {
            BoardBoxUi(boardUiState = boardUiState)
            content()
        }


    }

}

@Composable
fun BoardBoxUi(boardUiState: BoardUiState) {
    val ress= intArrayOf(
        R.drawable.red,
        R.drawable.green,
        R.drawable.yellow,
        R.drawable.blue)
    val redIndex = remember (boardUiState.colors){
            boardUiState.colors.indexOf(GameColor.RED)*90f
    }

    Box(modifier = Modifier) {
        boardUiState.homeBoxes.forEach {
            HomeBoxUi(box = it)
        }
        Box(modifier = Modifier
            .fillMaxSize()
            .rotate(redIndex)){
            boardUiState.homeBoxes.forEachIndexed { index, box ->
                ImageBoxUi(box = box,ress[index])
            }
        }

        boardUiState.pathBoxes.forEach {
            BoxUi(box = it)
        }
        boardUiState.heavenBoxes.forEach {
            SafeBoxUi(box = it)
        }
        if(boardUiState.pathBoxes.isNotEmpty()){
            ArrowImage()
        }
    }

}

@Composable
fun ArrowImage() {
    val oneUnit = LocalUnitDP.current
    Box(Modifier.fillMaxSize()) {
        for(r in 0..270 step 90) {
            Box(modifier = Modifier
                .fillMaxSize()
                .rotate(r.toFloat())) {
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
                        .offset(oneUnit.times(3), oneUnit.times(6))
                )
                ArrowBox(
                    modifier = Modifier

                        .size(oneUnit.times(2), oneUnit)
                        .padding(oneUnit.div(4))

                        .offset(oneUnit.times(5), oneUnit.times(5.5f))
                        .rotate(-45f)
                )

            }
        }
    }
}

@Preview
@Composable
fun BoardPreview() {
    val board = Board(listOf(GameColor.GREEN,GameColor.YELLOW,GameColor.BLUE,GameColor.RED)).toBoardUiState()
    BoardUi(boardUiState = board) {


    }
}

val LocalUnitDP = compositionLocalOf { 10.dp }