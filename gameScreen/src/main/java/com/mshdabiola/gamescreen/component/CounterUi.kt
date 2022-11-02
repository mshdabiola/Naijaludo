package com.mshdabiola.gamescreen.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mshdabiola.gamescreen.state.CounterUiState
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.toImmutableList

@Composable
fun CounterUi(
    modifier: Modifier = Modifier,
    counterUiState: CounterUiState,
    isHuman: Boolean = true,
    onCounterClick: (Int) -> Unit = {}
) {

    GameButton(
        modifier = modifier
            .requiredSize(64.dp),
        onClick = {

            onCounterClick(counterUiState.id)
        },
        shape = CircleShape,
        border = BorderStroke(2.dp, Color.White.copy(alpha = 0.6f)),
        enabled = counterUiState.isEnable && isHuman

    ) {
        Text(
            text = "${counterUiState.number}",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.align(
                Alignment.Center
            )
        )
    }
}

@Composable
fun CounterGroupUi(
    modifier: Modifier = Modifier,
    counterUiStateList: ImmutableList<CounterUiState>,
    isHuman: Boolean = true,
    onCounterClick: (Int) -> Unit = {}

) {
    AnimatedVisibility(visible = counterUiStateList.isNotEmpty()){
        Surface(
            modifier = modifier,
            shape = RoundedCornerShape(100),
            color = MaterialTheme.colorScheme.primaryContainer

        ) {
            Row(
                modifier = Modifier
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                counterUiStateList.forEachIndexed { index, counter ->
                    CounterUi(
                        counterUiState = counter,
                        isHuman = isHuman,
                        onCounterClick = onCounterClick
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
    counterUiStateList: ImmutableList<CounterUiState>,
    isHuman: Boolean = true,
    onCounterClick: (Int) -> Unit = {}

) {

    AnimatedVisibility(visible = counterUiStateList.isNotEmpty()) {
        Surface(
            modifier = modifier,
            shape = RoundedCornerShape(100),
            color = MaterialTheme.colorScheme.primaryContainer

        ) {
            Column(
                modifier = Modifier
                    .padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {

                counterUiStateList.forEachIndexed { index, counter ->
                    CounterUi(
                        counterUiState = counter,
                        isHuman = isHuman,
                        onCounterClick = onCounterClick
                    )
                    if (index != counterUiStateList.lastIndex) {
                        Spacer(modifier = Modifier.height(8.dp))
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun CounterUiPreview() {
    val counter = CounterUiState(number = 9)

    CounterUi(counterUiState = counter, modifier = Modifier.size(50.dp))
}

@Preview
@Composable
fun CounterUiGroupPreview() {

    CounterGroupUi(
        counterUiStateList = (0..2).map {
            if (it == 1)
                CounterUiState(isEnable = true) else CounterUiState()
        }.toImmutableList()
    )
}

@Preview
@Composable
fun CounterUiGroupVerticalPreview() {

    CounterGroupUiVertical(
        counterUiStateList = (0..2).map {
            if (it == 1)
                CounterUiState(isEnable = true) else CounterUiState()
        }.toImmutableList()
    )
}
