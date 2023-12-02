package com.mshdabiola.ludo.screen.main

import androidx.compose.animation.animateColor
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
    val background= infiniteTransition.animateColor(
        initialValue = MaterialTheme.colorScheme.primary,
        targetValue = MaterialTheme.colorScheme.onPrimary,
        animationSpec = infiniteRepeatable(tween(2500), repeatMode = RepeatMode.Reverse), label = "back"
    )

    val fground= infiniteTransition.animateColor(
        initialValue = MaterialTheme.colorScheme.onPrimary,
        targetValue = MaterialTheme.colorScheme.primary,
        animationSpec = infiniteRepeatable(tween(2500), repeatMode = RepeatMode.Reverse), label = "front"
    )

    FloatingActionButton(onClick = onClick, containerColor = background.value, contentColor = fground.value) {
        Icon(imageVector = Icons.Rounded.ShoppingCart, contentDescription = "cart")
    }

//    Box(modifier = Modifier
//
//        .size(44.dp)
//        .graphicsLayer {
//            scaleX = flot.value
//            scaleY = flot.value
//            shadowElevation = flot.value
//        }
//        .clip(RoundedCornerShape(4.dp))
//        .clickable {
//            onClick()
//        }
//        .drawBehind {
//            val si = size.div(2f)
//            drawRect(Color.Red, size = si)
//
//            drawRect(Color.Green, Offset(0f, si.height), size = si)
//            drawRect(Color.Yellow, Offset(si.width, 0f), size = si)
//            drawRect(Color.Blue, Offset(si.width, si.height), size = si)
//        }
//
//    )

}

@Preview
@Composable
fun MarketButtonPreview() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){

        MarketButton()
    }
}