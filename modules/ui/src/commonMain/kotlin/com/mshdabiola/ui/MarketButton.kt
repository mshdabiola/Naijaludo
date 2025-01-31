package com.mshdabiola.ui

import androidx.compose.runtime.Composable

@Composable
fun MarketButton(onClick: () -> Unit = {}) {
//    val infiniteTransition = rememberInfiniteTransition(label = "transition")
//    val background = infiniteTransition.animateColor(
//        initialValue = MaterialTheme.colorScheme.primary,
//        targetValue = MaterialTheme.colorScheme.onPrimary,
//        animationSpec = infiniteRepeatable(tween(2500), repeatMode = RepeatMode.Reverse),
//        label = "back",
//    )
//
//    val fground = infiniteTransition.animateColor(
//        initialValue = MaterialTheme.colorScheme.onPrimary,
//        targetValue = MaterialTheme.colorScheme.primary,
//        animationSpec = infiniteRepeatable(tween(2500), repeatMode = RepeatMode.Reverse),
//        label = "front",
//    )
//
//    FloatingActionButton(
//        modifier = Modifier.testTag("game:market"),
//        onClick = onClick,
//        containerColor = background.value,
//        contentColor = fground.value,
//    ) {
//        Icon(imageVector = Icons.Rounded.ShoppingCart, contentDescription = "cart")
//    }
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
