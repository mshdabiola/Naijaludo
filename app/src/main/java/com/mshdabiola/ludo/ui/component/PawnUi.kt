package com.mshdabiola.ludo.ui.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.mshdabiola.ludo.log
import com.mshdabiola.naijaludo.state.Board
import com.mshdabiola.naijaludo.state.GameColor
import com.mshdabiola.naijaludo.state.Pawn
import com.mshdabiola.naijaludo.state.Point


@Composable
fun PawnUi(
    modifier: Modifier = Modifier,
    isEnableForPlayer: Boolean = true,
    offset: IntOffset,
    newPawn: Pawn,
    onClick: (Int,Boolean) -> Unit = {_,_->}
) {
    val unitDp = LocalUnitDP.current
    Surface(
        modifier = modifier
            .size(unitDp * 1)
            .zIndex(newPawn.zIndex)
            .offset(unitDp * offset.x, unitDp * offset.y)
            .clickable(newPawn.isEnable && isEnableForPlayer) {
                log("on Human click $newPawn")
                onClick(newPawn.index, false)

            },
        shape = CircleShape,
        color = newPawn.color.toColor(),
        border = BorderStroke(2.dp, Brush.radialGradient(0.8f to Color.Transparent,1f to Color.Black.copy(alpha = 0.8f))),
        tonalElevation = newPawn.zIndex.dp,
        shadowElevation = newPawn.zIndex.dp
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()

        ) {
            if (newPawn.zIndex.toInt() > 1) {
                Text(
                    text = "${newPawn.zIndex.toInt()}",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White,
                    modifier = Modifier.align(Alignment.Center)

                )
            }
        }
    }

}


@Composable
fun MovablePawnUi(
    modifier: Modifier = Modifier,
    pawn: Pawn,
    isHuman: Boolean = true,
    onClick: (Int,Boolean) -> Unit = {_,_->},
    getPositionIntOffset: (Int, GameColor) -> Point,
    // onMoveFinish: (Pawn) -> Unit = {}
) {

    val intOffsetAnimatable by remember (pawn.currentPos){
        mutableStateOf( getPositionIntOffset(pawn.currentPos, pawn.color).toIntOffset())
    }

    PawnUi(
        modifier = modifier,
        offset = intOffsetAnimatable,
        isEnableForPlayer = isHuman,
        newPawn = pawn, onClick = onClick
    )

}

@Composable
fun PawnsUi(
    pawns :List<Pawn>,
    isHuman: Boolean=true,
    onClick: (Int,Boolean) -> Unit = {_,_->},
    getPositionIntOffset: (Int, GameColor) -> Point,
) {
    Box(modifier = Modifier.fillMaxSize()){
        pawns.forEach {
            MovablePawnUi(pawn = it,
                getPositionIntOffset = getPositionIntOffset,
                isHuman = isHuman,
            onClick = onClick
                )
        }
    }

}

@Preview
@Composable
fun PawnsUiPreview() {

    val board =Board()
    val getOffset = board::getPositionIntPoint
    BoardUi(board = board){
        PawnsUi(pawns = listOf(Pawn(currentPos = -4),Pawn(color = GameColor.GREEN),Pawn(color = GameColor.BLUE),Pawn(color = GameColor.YELLOW)), getPositionIntOffset =getOffset )
    }
}


