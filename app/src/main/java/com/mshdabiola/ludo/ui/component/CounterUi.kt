package com.mshdabiola.ludo.ui.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
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
import com.mshdabiola.naijaludo.state.Counter


@Composable
fun CounterUi(
    modifier: Modifier = Modifier,
    counter: Counter,
    isHuman: Boolean = true,
    onCounterClick: (Int) -> Unit = {}
) {

    GameButton(
        modifier = modifier
            .size(64.dp),
        onClick = {

                onCounterClick(counter.id)

        },
        shape = CircleShape,
        border = BorderStroke(2.dp, Color.White.copy(alpha = 0.6f)),
        enabled = counter.isEnable && isHuman

        ) {
        Text(
            text = "${counter.number}",
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
    counters: List<Counter>,
    isHuman: Boolean = true,
    onCounterClick: (Int) -> Unit = {}

) {
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

            counters.forEachIndexed { index, counter ->
                CounterUi(
                    counter = counter,
                    isHuman = isHuman,
                    onCounterClick = onCounterClick
                )
                if (index != counters.lastIndex) {
                    Spacer(modifier = Modifier.width(8.dp))
                }
            }

        }
    }
}

@Preview
@Composable
fun CounterUiPreview() {
    val counter = Counter(number = 9)

    CounterUi(counter = counter, modifier = Modifier.size(50.dp))
}

@Preview
@Composable
fun CounterUiGroupPreview() {

    CounterGroupUi(
        counters = (0..2).map {if(it==1) Counter(isEnable = true) else Counter() })

}