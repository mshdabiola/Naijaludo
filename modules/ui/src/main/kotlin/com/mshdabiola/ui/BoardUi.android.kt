package com.mshdabiola.ui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.NativePaint
import androidx.compose.ui.graphics.toArgb

actual fun NativePaint.shadow(radius: Float, color: Color) {
    setShadowLayer(radius, 0f, 0f, color.toArgb())
}
