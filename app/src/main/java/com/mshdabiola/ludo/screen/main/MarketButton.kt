package com.mshdabiola.ludo.screen.main

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.snap
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MarketButton(onClick:()->Unit={}) {

    val infiniteTransition= rememberInfiniteTransition(label = "transition")
    val flot= infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 1.3f,
        animationSpec = infiniteRepeatable(tween(1000), repeatMode = RepeatMode.Reverse), label = "float"
    )

    Box(modifier = Modifier

        .size(44.dp)
        .graphicsLayer {
            scaleX=flot.value
            scaleY=flot.value
            shadowElevation=flot.value
        }
        .clip(RoundedCornerShape(4.dp))
        .clickable {
            onClick()
        }
        .drawBehind {
            val si = size.div(2f)
            drawRect(Color.Red, size = si)

            drawRect(Color.Green, Offset(0f, si.height), size = si)
            drawRect(Color.Yellow, Offset(si.width, 0f), size = si)
            drawRect(Color.Blue, Offset(si.width, si.height), size = si)
        }

    )

}

@Preview
@Composable
fun MarketButtonPreview() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){

        MarketButton()
    }
}