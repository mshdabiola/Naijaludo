package com.mshdabiola.gamescreen.component

import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.mshdabiola.designsystem.theme.toPawnColor
import com.mshdabiola.designsystem.theme.toPawnTextColor
import com.mshdabiola.gamescreen.state.PawnUiState
import com.mshdabiola.gamescreen.state.PointUiState
import com.mshdabiola.gamescreen.state.showText
import com.mshdabiola.gamescreen.state.toBoardUiState
import com.mshdabiola.gamescreen.state.toPointUiState
import com.mshdabiola.naijaludo.model.Board
import com.mshdabiola.naijaludo.model.GameColor
import com.mshdabiola.naijaludo.model.log
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList

@Composable
fun PawnUi(
    modifier: Modifier = Modifier,
    isEnableForPlayer: Boolean = true,
    offset: IntOffset,
    pawnUiState: PawnUiState,
    scaleProvide: () -> Float = { 1f },
    onClick: (Int, Boolean) -> Unit = { _, _ -> },
) {
    val unitDp = LocalUnitDP.current
    Surface(
        modifier = modifier
            .size(unitDp * 1)
            .zIndex(pawnUiState.zIndex)
            .offset(unitDp * offset.x, unitDp * offset.y)
            .graphicsLayer {
                scaleY = scaleProvide()
                scaleX = scaleProvide()
            }
            .clickable(pawnUiState.isEnable && isEnableForPlayer) {
                log("on Human click $pawnUiState")
                onClick(pawnUiState.idx, false)
            },
        shape = CircleShape,
        color = pawnUiState.color.toPawnColor(),
        border = BorderStroke(
            2.dp,
            Brush.radialGradient(
                0.8f to Color.Transparent,
                1f to Color.Black.copy(alpha = 0.8f),
            ),
        ),
        tonalElevation = if (pawnUiState.showText()) pawnUiState.zIndex.dp else 1.dp,
        shadowElevation = if (pawnUiState.showText()) pawnUiState.zIndex.dp else 1.dp,
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(),

            ) {
            if (pawnUiState.showText()) {
                Text(
                    text = "${pawnUiState.zIndex.toInt()}",
                    style = MaterialTheme.typography.bodyMedium,
                    color = pawnUiState.color.toPawnTextColor(),
                    modifier = Modifier.align(Alignment.Center),

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
    onClick: (Int, Boolean) -> Unit = { _, _ -> },
    getPositionIntOffset: (Int, GameColor) -> PointUiState,
    // onMoveFinish: (Pawn) -> Unit = {}
) {
    val intOffsetAnimatable by remember(pawnUiState.currentPos) {
        mutableStateOf(
            getPositionIntOffset(
                pawnUiState.currentPos,
                pawnUiState.color,
            ).toIntOffset(),
        )
    }

    val scale = remember {
        Animatable(1f)
    }
    LaunchedEffect(key1 = pawnUiState.isEnable, key2 = isHuman, block = {
        //    if(isHuman){
        if (pawnUiState.isEnable && isHuman) {
            scale.animateTo(
                1.2f,
                animationSpec = infiniteRepeatable(
                    repeatMode = RepeatMode.Reverse,
                    animation = keyframes {
                        durationMillis = 500

                        1.2f atFraction 0.5f
                        1f atFraction 1f
                    },
                ),
            )
        } else {
            scale.snapTo(1f)
        }
        // }
    })

    PawnUi(
        modifier = modifier,
        offset = intOffsetAnimatable,
        isEnableForPlayer = isHuman,
        scaleProvide = { scale.value },
        pawnUiState = pawnUiState,
        onClick = onClick,
    )
}

@Composable
fun PawnsUi(
    pawnUiStateListProvider: () -> ImmutableList<PawnUiState>,
    isHumanProvider: () -> Boolean = { true },
    onClick: (Int, Boolean) -> Unit = { _, _ -> },
    getPositionIntOffset: (Int, GameColor) -> PointUiState,
) {
    AnimatedVisibility(visible = pawnUiStateListProvider().isNotEmpty()) {
        Box(modifier = Modifier.fillMaxSize()) {
            pawnUiStateListProvider().forEach {
                MovablePawnUi(
                    pawnUiState = it,
                    getPositionIntOffset = getPositionIntOffset,
                    isHuman = isHumanProvider(),
                    onClick = onClick,
                )
            }
        }
    }
}

@Preview
@Composable
fun PawnsUiPreview() {
    val board = Board()
    val getOffset = { x: Int, y: GameColor ->
        board.getPositionIntPoint(x, y).toPointUiState()
    }
    BoardUi(boardUiStateProvider = { board.toBoardUiState() }) {
        PawnsUi(
            pawnUiStateListProvider = {
                listOf(
                    PawnUiState(currentPos = -4),
                    PawnUiState(color = GameColor.GREEN, isEnable = true),
                    PawnUiState(color = GameColor.BLUE, currentPos = 56),
                    PawnUiState(color = GameColor.YELLOW),
                ).toImmutableList()
            },
            getPositionIntOffset = getOffset,
        )
    }
}
