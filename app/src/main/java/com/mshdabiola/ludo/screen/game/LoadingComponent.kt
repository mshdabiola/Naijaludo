package com.mshdabiola.ludo.screen.game

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.VectorConverter
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mshdabiola.ludo.screen.game.component.DiceUi
import com.mshdabiola.ludo.screen.game.state.DiceUiState
import kotlinx.coroutines.delay

@Composable
fun Loading() {
    BoxWithConstraints(modifier = Modifier.size(80.dp)) {

        LoadingDiceUi()
    }
}

@Composable
fun LoadingDiceUi() {

    val float = rememberInfiniteTransition(label = "infinite")

    val value = float.animateFloat(
        initialValue = 0f, targetValue = 360f, animationSpec = infiniteRepeatable(
            tween(400)
        ), label = "rotate"
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

@Preview
@Composable
fun LoadingPreview() {
    Loading()
}