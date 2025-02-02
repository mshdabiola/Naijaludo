package com.mshdabiola.game

import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.unit.dp
import com.mshdabiola.ui.DiceUi
import com.mshdabiola.ui.state.DiceUiState

@Composable
fun Loading() {
    Box(modifier = Modifier.size(80.dp)) {
        LoadingDiceUi()
    }
}

@Composable
fun LoadingDiceUi() {
    val float = rememberInfiniteTransition(label = "infinite")

    val value = float.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            tween(400),
        ),
        label = "rotate",
    )

    val rot = remember(value.value) {
        value.value
    }

    DiceUi(
        modifier = Modifier.size(100.dp),
        diceUiState = DiceUiState(animate = true),
        isEnableForPlayer = false,
        rotate = { rot },
        offset = { Offset.Zero },
        onDiceClick = { },
    )
}
//
// @Preview
// @Composable
// fun LoadingPreview() {
//    Loading()
// }
