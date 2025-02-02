package com.mshdabiola.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.component.GameButton
import com.mshdabiola.ui.state.CounterUiState
import kotlinx.collections.immutable.ImmutableList

@Composable
fun CounterUi(
    modifier: Modifier = Modifier,
    counterUiState: CounterUiState,
    isHuman: Boolean = true,
    onCounterClick: (Int) -> Unit = {},
) {
    var heg by remember {
        mutableIntStateOf(100)
    }
    val float = rememberInfiniteTransition(label = "infinite")

    val value = float.animateFloat(
        initialValue = 0f,
        targetValue = heg.toFloat(),
        animationSpec = infiniteRepeatable(
            tween(400),
            repeatMode = RepeatMode.Reverse,
        ),
        label = "rotate",
    )
    val color = MaterialTheme.colorScheme.primary

    GameButton(
        modifier = modifier
            .requiredSize(56.dp)
            .onSizeChanged {
                heg = it.height
            }
            .drawWithContent {
                this.drawContent()
                val radius = if (isHuman && counterUiState.isEnable) value.value / 2f else 0f
                drawCircle(color = color.copy(alpha = 0.25f), radius = radius)
            },
        onClick = {
            onCounterClick(counterUiState.id)
        },
        shape = CircleShape,
        border = BorderStroke(2.dp, Color.White.copy(alpha = 0.6f)),
        enabled = counterUiState.isEnable && isHuman,

    ) {
        Text(
            text = "${counterUiState.number}",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.align(
                Alignment.Center,
            ),
        )
    }
}

@Composable
fun CounterGroupUi(
    modifier: Modifier = Modifier,
    counterUiStateListProvider: () -> ImmutableList<CounterUiState>,
    isHumanProvider: () -> Boolean = { true },
    onCounterClick: (Int) -> Unit = {},
    rotateButton: Float = 0f,
) {
    val counterUiStateList = counterUiStateListProvider()
    val isHuman = isHumanProvider()
    AnimatedVisibility(modifier = modifier, visible = counterUiStateList.isNotEmpty()) {
        Surface(

            shape = RoundedCornerShape(100),
            color = MaterialTheme.colorScheme.primaryContainer,

        ) {
            Row(
                modifier = Modifier
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly,
            ) {
                counterUiStateList.forEachIndexed { index, counter ->
                    CounterUi(
                        modifier = Modifier.rotate(rotateButton),
                        counterUiState = counter,
                        isHuman = isHuman,
                        onCounterClick = onCounterClick,
                    )
                    if (index != counterUiStateList.lastIndex) {
                        Spacer(modifier = Modifier.width(8.dp))
                    }
                }
            }
        }
    }
}

@Composable
fun CounterGroupUiVertical(
    modifier: Modifier = Modifier,
    counterUiStateListProvider: () -> ImmutableList<CounterUiState>,
    isHumanProvider: () -> Boolean = { true },
    onCounterClick: (Int) -> Unit = {},
    rotateButton: Float = 0f,
) {
    val counterUiStateList = counterUiStateListProvider()
    val isHuman = isHumanProvider()

    AnimatedVisibility(modifier = modifier, visible = counterUiStateList.isNotEmpty()) {
        Surface(
            // modifier = modifier,
            shape = RoundedCornerShape(100),
            color = MaterialTheme.colorScheme.primaryContainer,

        ) {
            Column(
                modifier = Modifier
                    .padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly,
            ) {
                counterUiStateList.forEachIndexed { index, counter ->
                    CounterUi(
                        modifier = Modifier.rotate(rotateButton),
                        counterUiState = counter,
                        isHuman = isHuman,
                        onCounterClick = onCounterClick,
                    )
                    if (index != counterUiStateList.lastIndex) {
                        Spacer(modifier = Modifier.height(8.dp))
                    }
                }
            }
        }
    }
}
//
// @Preview
// @Composable
// fun CounterUiPreview() {
//    val counter = CounterUiState(number = 9, isEnable = true)
//
//    CounterUi(
//        counterUiState = counter,
//        modifier = Modifier
//            .size(50.dp)
//    )
// }
//
// @Preview
// @Composable
// fun CounterUiGroupPreview() {
//    CounterGroupUi(
//        counterUiStateListProvider = {
//            (0..2).map {
//                if (it == 1) {
//                    CounterUiState(isEnable = true)
//                } else {
//                    CounterUiState()
//                }
//            }.toImmutableList()
//        },
//    )
// }
//
// @Preview
// @Composable
// fun CounterUiGroupVerticalPreview() {
//    CounterGroupUiVertical(
//        counterUiStateListProvider = {
//            (0..2).map {
//                if (it == 1) {
//                    CounterUiState(isEnable = true)
//                } else {
//                    CounterUiState()
//                }
//            }.toImmutableList()
//        },
//    )
// }
