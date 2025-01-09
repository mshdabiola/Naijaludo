package com.mshdabiola.designsystem.component

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp

@Composable
fun MovableDialog() {
    var isShowing by remember {
        mutableStateOf(false)
    }
    val desig = LocalDensity.current
    val st = animateDpAsState(targetValue = if (isShowing) 100.dp else (0).dp)

    BoxWithConstraints(
        modifier = Modifier.fillMaxSize(),
    ) {
        Button(onClick = { isShowing = !isShowing }) {
            Text(text = "Move")
        }
        val si = maxWidth / 2 - (100.dp) / 2
        val y = maxHeight / 2 - (100.dp) / 2

        Box(
            modifier = Modifier
                .offset(st.value, y)
                .background(Color.Red)
                .height(100.dp)
                .width(100.dp),

        )
    }
}
//
// @Preview
// @Composable
// fun MovableDialogPreview() {
//    MovableDialog()
// }
