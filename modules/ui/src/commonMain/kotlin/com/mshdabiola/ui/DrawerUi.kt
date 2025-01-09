package com.mshdabiola.ui

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
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.zIndex
import com.mshdabiola.naijaludo.model.GameColor
import com.mshdabiola.ui.state.PawnUiState
import com.mshdabiola.ui.state.PointUiState
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList

@Composable
fun DrawerUi(
    modifier: Modifier = Modifier.zIndex(60f),
    drawerUiStateProvider: () -> ImmutableList<PawnUiState>? = {
        emptyList<PawnUiState>().toImmutableList()
    },
    onPawnDrawer: (Int, Boolean) -> Unit = { _, _ -> },
    getPositionIntOffset: (Int, GameColor) -> PointUiState = { _, _ -> PointUiState.Zero },
) {
    val drawerUiState = drawerUiStateProvider()
    if (drawerUiState != null) {
        val pawn = drawerUiState.first()
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
                    .padding(padding),

            ) {
                drawerUiState.forEachIndexed { index, pawn ->

                    PawnUi(
                        modifier = Modifier.size(oneDp),
                        offset = IntOffset.Zero,
                        pawnUiState = pawn,
                        isEnableForPlayer = true,
                        onClick = { _, _ -> onPawnDrawer(pawn.pawnId, true) },
                    )

                    if (index != drawerUiState.lastIndex) {
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
                    .padding(padding),

            ) {
                drawerUiState.forEachIndexed { index, pawn ->

                    PawnUi(
                        modifier = Modifier.size(oneDp),
                        offset = IntOffset.Zero,
                        pawnUiState = pawn,
                        isEnableForPlayer = true,
                        onClick = { _, _ -> onPawnDrawer(pawn.pawnId, true) },
                    )

                    if (index != drawerUiState.lastIndex) {
                        Spacer(modifier = Modifier.width(padding))
                    }
                }
            }
        }
    }
}
//
// @Preview
// @Composable
// fun DrawerBoardPreview() {
//    val board = Board()
//    BoardUi(boardUiStateProvider = { board.toBoardUiState() }) {
//        val point = mapOf(
//            1 to intArrayOf(50, 50, 49),
//            2 to intArrayOf(12, 11, 10),
//            3 to intArrayOf(23, 24, 25),
//            4 to intArrayOf(36, 37, 38),
//        )
//        val i = 1
//
//        DrawerUi(
//            drawerUiStateProvider = {
//                listOf(
//                    PawnUiState(currentPos = point[i]!![1]),
//                    PawnUiState(color = GameColor.BLUE),
//                ).toImmutableList()
//            },
//
//            getPositionIntOffset = { x: Int, y: GameColor ->
//                board.getBoxByIndex(x, y).toPointUiState()            },
//        )
//
//        DrawerUi(
//            drawerUiStateProvider = {
//                listOf(
//                    PawnUiState(currentPos = 9),
//                    PawnUiState(color = GameColor.BLUE),
//                ).toImmutableList()
//            },
//
//            getPositionIntOffset = { x: Int, y: GameColor ->
//                board.getBoxByIndex(x, y).toPointUiState()            },
//        )
//    }
// }
