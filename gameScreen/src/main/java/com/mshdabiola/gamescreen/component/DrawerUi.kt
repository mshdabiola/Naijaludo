package com.mshdabiola.gamescreen.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.zIndex
import com.mshdabiola.gamescreen.isHorizontal
import com.mshdabiola.gamescreen.state.DrawerUiState
import com.mshdabiola.gamescreen.state.PawnUiState
import com.mshdabiola.gamescreen.state.toBoardUiState
import com.mshdabiola.ludo.model.Board
import com.mshdabiola.ludo.model.GameColor
import com.mshdabiola.ludo.model.Point

@Composable
fun DrawerUi(
    modifier: Modifier = Modifier.zIndex(60f),
    drawerUiState: DrawerUiState = DrawerUiState(),
    onPawnDrawer: (Int, Boolean) -> Unit = { _, _ -> },
    getPositionIntOffset: (Int, GameColor) -> Point = { _, _ -> Point.zero }
) {

    val pawn = drawerUiState.listOfPawnUiState.first()
    val offset = getPositionIntOffset(pawn.currentPos, pawn.color)
    val oneDp = LocalUnitDP.current
    val padding = oneDp * 0.1f

    if (isHorizontal(offset.x.toInt())) {
        val x = (oneDp * offset.x) - padding
        val y = (oneDp * offset.y) - (oneDp / 2 + padding)
        Column(
            modifier = modifier
                .offset(x, y)
                .clip(RoundedCornerShape(100))
                .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.7f))
                .padding(padding)

        ) {

            drawerUiState.listOfPawnUiState.forEachIndexed { index, pawn ->

                PawnUi(
                    modifier = Modifier.size(oneDp),
                    offset = IntOffset.Zero,
                    pawnUiState = pawn,
                    isEnableForPlayer = true,
                    onClick = { _, _ -> onPawnDrawer(index, true) }
                )

                if (index != drawerUiState.listOfPawnUiState.lastIndex) {
                    Spacer(modifier = Modifier.height(padding))
                }
            }
        }
    } else {
        val x = (oneDp * offset.x) - (oneDp / 2 + padding)
        val y = (oneDp * offset.y) - padding
        Row(
            modifier = modifier
                .offset(x, y)
                .clip(RoundedCornerShape(100))
                .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.9f))
                .padding(padding)

        ) {

            drawerUiState.listOfPawnUiState.forEachIndexed { index, pawn ->

                PawnUi(
                    modifier = Modifier.size(oneDp),
                    offset = IntOffset.Zero,
                    pawnUiState = pawn,
                    isEnableForPlayer = true,
                    onClick = { _, _ -> onPawnDrawer(index, true) }
                )

                if (index != drawerUiState.listOfPawnUiState.lastIndex) {
                    Spacer(modifier = Modifier.width(padding))
                }
            }
        }
    }
}

@Preview
@Composable
fun DrawerBoardPreview() {
    val board = Board()
    BoardUi(boardUiState = board.toBoardUiState()) {

        val point = mapOf(
            1 to intArrayOf(50, 50, 49),
            2 to intArrayOf(12, 11, 10),
            3 to intArrayOf(23, 24, 25),
            4 to intArrayOf(36, 37, 38)
        )
        val i = 1

        DrawerUi(
            drawerUiState = DrawerUiState(
                listOf(
                    PawnUiState(currentPos = point[i]!![1]),
                    PawnUiState(color = GameColor.BLUE)
                )
            ),

            getPositionIntOffset = board::getPositionIntPoint
        )

        DrawerUi(
            drawerUiState = DrawerUiState(
                listOf(
                    PawnUiState(currentPos = 9),
                    PawnUiState(color = GameColor.BLUE)
                )
            ),

            getPositionIntOffset = board::getPositionIntPoint
        )
    }
}
