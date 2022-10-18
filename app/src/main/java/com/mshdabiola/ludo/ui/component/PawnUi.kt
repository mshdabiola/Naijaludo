package com.mshdabiola.ludo.ui.component

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.keyframes
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
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.mshdabiola.ludo.log
import com.mshdabiola.ludo.ui.gamescreen.state.PawnUiState
import com.mshdabiola.ludo.ui.gamescreen.state.toBoardUiState
import com.mshdabiola.naijaludo.state.Board
import com.mshdabiola.naijaludo.state.GameColor
import com.mshdabiola.naijaludo.state.Point


@Composable
fun PawnUi(
    modifier: Modifier = Modifier,
    isEnableForPlayer: Boolean = true,
    offset: IntOffset,
    pawnUiState: PawnUiState,
    scale : Float=1f,
    onClick: (Int,Boolean) -> Unit = {_,_->}
) {
    val unitDp = LocalUnitDP.current
    Surface(
        modifier = modifier
            .size(unitDp * 1)

            .zIndex(pawnUiState.zIndex)
            .offset(unitDp * offset.x, unitDp * offset.y)
            .scale(scale)
            .clickable(pawnUiState.isEnable && isEnableForPlayer) {
                log("on Human click $pawnUiState")
                onClick(pawnUiState.index, false)

            },
        shape = CircleShape,
        color = pawnUiState.color.toColor(),
        border = BorderStroke(2.dp, Brush.radialGradient(0.8f to Color.Transparent,1f to Color.Black.copy(alpha = 0.8f))),
        tonalElevation = pawnUiState.zIndex.dp,
        shadowElevation = pawnUiState.zIndex.dp
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()

        ) {
            if (pawnUiState.zIndex.toInt() > 1) {
                Text(
                    text = "${pawnUiState.zIndex.toInt()}",
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
    pawnUiState: PawnUiState,
    isHuman: Boolean = true,
    onClick: (Int,Boolean) -> Unit = {_,_->},
    getPositionIntOffset: (Int, GameColor) -> Point,
    // onMoveFinish: (Pawn) -> Unit = {}
) {

    val intOffsetAnimatable by remember (pawnUiState.currentPos){
        mutableStateOf( getPositionIntOffset(pawnUiState.currentPos, pawnUiState.color).toIntOffset())
    }


    val scale = remember {
        Animatable(1f)
    }
    LaunchedEffect(key1 = pawnUiState.isEnable, key2 = isHuman, block = {

    //    if(isHuman){
            if (pawnUiState.isEnable&&isHuman) {
                scale.animateTo(
                    1.2f,
                    animationSpec = infiniteRepeatable(
                        repeatMode = RepeatMode.Reverse,
                        animation = keyframes {
                            durationMillis = 500

                            1.2f atFraction 0.5f
                            1f atFraction 1f
                        })
                )
            } else {
                scale.snapTo(1f)
            }
       // }
    })



    PawnUi(
        modifier = modifier,
        offset = intOffsetAnimatable,
        isEnableForPlayer = isHuman, scale =scale.value,
        pawnUiState = pawnUiState, onClick = onClick
    )

}

@Composable
fun PawnsUi(
    pawnUiStateList :List<PawnUiState>,
    isHuman: Boolean=true,
    onClick: (Int,Boolean) -> Unit = {_,_->},
    getPositionIntOffset: (Int, GameColor) -> Point,
) {
    Box(modifier = Modifier.fillMaxSize()){
        pawnUiStateList.forEach {
            MovablePawnUi(pawnUiState = it,
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
    BoardUi(boardUiState = board.toBoardUiState()){
        PawnsUi(pawnUiStateList = listOf(
            PawnUiState(currentPos = -4),
            PawnUiState(color = GameColor.GREEN, isEnable = true),
            PawnUiState(color = GameColor.BLUE),
            PawnUiState(color = GameColor.YELLOW)
        ), getPositionIntOffset =getOffset )
    }
}


