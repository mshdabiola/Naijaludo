package com.mshdabiola.ui

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun MarketButton(onClick: () -> Unit = {}) {
    val infiniteTransition = rememberInfiniteTransition(label = "transition")
    val background = infiniteTransition.animateColor(
        initialValue = MaterialTheme.colorScheme.primary,
        targetValue = MaterialTheme.colorScheme.onPrimary,
        animationSpec = infiniteRepeatable(tween(2500), repeatMode = RepeatMode.Reverse),
        label = "back",
    )

    val fground = infiniteTransition.animateColor(
        initialValue = MaterialTheme.colorScheme.onPrimary,
        targetValue = MaterialTheme.colorScheme.primary,
        animationSpec = infiniteRepeatable(tween(2500), repeatMode = RepeatMode.Reverse),
        label = "front",
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
//
// @Preview
// @Composable
// fun MarketButtonPreview() {
//    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
//
//        MarketButton()
//    }
// }
