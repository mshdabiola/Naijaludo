package com.mshdabiola.ludo.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mshdabiola.naijaludo.state.Board

@Composable
fun BoardUi(
    modifier: Modifier = Modifier,
    board: Board,
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
            BoardBoxUi(board = board)
            //   Icon(modifier=Modifier.offset((oneUnit/2f),oneUnit*7), imageVector = ImageVector.vectorResource(id = R.drawable.ic_arrow), contentDescription = "")
            content()
        }


    }

}

@Composable
fun BoardBoxUi(board: Board) {

    Box(modifier = Modifier) {
        board.bigHomeBoxes.forEach {
            HomeBoxUi(box = it)
        }
        board.paths.forEach {
            BoxUi(box = it)
        }
        board.safePath.forEach {
            SafeBoxUi(box = it)
        }
    }

}

@Preview
@Composable
fun BoardPreview() {
    val board = Board()
    BoardUi(board = board) {


    }
}

val LocalUnitDP = compositionLocalOf { 10.dp }