package com.mshdabiola.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.VectorConverter
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.zIndex
import com.mshdabiola.designsystem.icon.getDiceFive
import com.mshdabiola.designsystem.icon.getDiceFour
import com.mshdabiola.designsystem.icon.getDiceOne
import com.mshdabiola.designsystem.icon.getDiceRoll
import com.mshdabiola.designsystem.icon.getDiceSix
import com.mshdabiola.designsystem.icon.getDiceThree
import com.mshdabiola.designsystem.icon.getDiceTwo
import com.mshdabiola.ui.state.DiceUiState
import kotlinx.collections.immutable.ImmutableList

@Composable
fun DiceUi(
    modifier: Modifier = Modifier,
    diceUiState: DiceUiState,
    isEnableForPlayer: Boolean = true,
    rotate: () -> Float = { 0f },
    offset: () -> Offset = { Offset.Zero },
    onDiceClick: () -> Unit = {},
    scale: () -> Float = { 1f },
) {
    val unitDp = LocalUnitDP.current

    val imageVector = remember(diceUiState.number, diceUiState.animate) {
        when {
            diceUiState.animate -> getDiceRoll(Color(diceUiState.color))
            diceUiState.number == 2 -> getDiceTwo(Color(diceUiState.color))
            diceUiState.number == 3 -> getDiceThree(Color(diceUiState.color))
            diceUiState.number == 4 -> getDiceFour(Color(diceUiState.color))
            diceUiState.number == 5 -> getDiceFive(Color(diceUiState.color))
            diceUiState.number == 6 -> getDiceSix(Color(diceUiState.color))

            else -> getDiceOne(Color(diceUiState.color))
        }
    }
    Image(
        modifier = modifier
            .size(unitDp.times(1.5f))
            .offset {
                IntOffset((unitDp * offset().x).roundToPx(), (unitDp * offset().y).roundToPx())
            }
            .testTag("dice${diceUiState.id}")
            .graphicsLayer {
                rotationZ = rotate()
                this.transformOrigin = TransformOrigin.Center
                scaleX = scale()
                scaleY = scale()
            }
            .clickable(enabled = diceUiState.isEnable && isEnableForPlayer) {
                onDiceClick()
            },
        imageVector = imageVector,
        contentDescription = "dice${diceUiState.id}",

    )
}

@Composable
fun DicesUi(
    diceUiStateListProvider: () -> ImmutableList<DiceUiState>,
    isHumanProvider: () -> Boolean = { true },
    onClick: () -> Unit = {},
) {
    val diceUiStateList = diceUiStateListProvider()
    val isHuman = isHumanProvider()
    // val oneDp = LocalUnitDP.current
    AnimatedVisibility(visible = diceUiStateList.isNotEmpty()) {
        Box(modifier = Modifier.fillMaxSize()) {
            diceUiStateList.forEach {
                // if (!it.isTotal) {

                AnimateDiceUi(
                    diceUiState = it,
                    isHuman = isHuman,
                    onClick = onClick,
                    numberOfDice = diceUiStateList.size,

                )
                //  }
            }
        }
    }
}

@Composable
fun AnimateDiceUi(
    modifier: Modifier = Modifier,
    diceUiState: DiceUiState,
    isHuman: Boolean = true,
    numberOfDice: Int,
    onClick: () -> Unit = {},
) {
    val iniOff = remember {
        getInitOfDice(diceUiState.id, numberOfDice)
    }

    val off = remember {
        Animatable(iniOff, Offset.VectorConverter)
    }
    val float = rememberInfiniteTransition(label = "infinite")

    val value = float.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            tween(100, easing = FastOutLinearInEasing),

        ),
        label = "rotate",
    )
    val scale = float.animateFloat(
        initialValue = 1f,
        targetValue = 1.2f,
        animationSpec = infiniteRepeatable(
            tween(500),
            repeatMode = RepeatMode.Reverse,
        ),
        label = "scale",
    )

    LaunchedEffect(key1 = diceUiState) {
        when {
            diceUiState.isEnable && isHuman -> {
                off.animateTo(
                    iniOff,
                    animationSpec = spring(
                        Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessMedium,
                    ),
                )
            }

            diceUiState.animate -> {
                off.animateTo(
                    randDiceOffSet(),
                    animationSpec = tween(
                        600,
                        easing = LinearEasing,
                    ),
                )
            }

            else -> {
                off.animateTo(
                    iniOff,
                    animationSpec = spring(
                        Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessMedium,
                    ),
                )
            }
        }
    }

    DiceUi(
        modifier = modifier
            .zIndex(40f),
        diceUiState = diceUiState,
        isEnableForPlayer = isHuman,
        rotate = { if (diceUiState.animate) value.value else 0f },
        offset = { off.value },
        scale = { if (diceUiState.isEnable && isHuman) scale.value else 1f },
        onDiceClick = onClick,
    )
}
//
// @Preview
// @Composable
// fun DiceUiPreview() {
//    Box(modifier = Modifier.size(200.dp)) {
//        AnimateDiceUi(
//            modifier = Modifier.size(50.dp),
//            diceUiState = DiceUiState(
//                animate = true,
//                isEnable = true,
//            ),
//            numberOfDice = 0,
//            isHuman = true
//        )
//    }
//
// }
