package com.mshdabiola.designsystem.icon.drawable

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.icon.Drawable

public val Drawable.Friend: ImageVector
    get() {
        if (_friend != null) {
            return _friend!!
        }
        _friend = Builder(
            name = "Friend",
            defaultWidth = 92.75.dp,
            defaultHeight = 92.93.dp,
            viewportWidth = 92.75f,
            viewportHeight = 92.93f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF1d1d1b)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(37.04f, 37.11f)
                lineToRelative(0.0f, -37.11f)
                lineToRelative(-37.04f, 0.0f)
                lineToRelative(0.0f, 37.11f)
                lineToRelative(6.09f, 0.0f)
                lineToRelative(0.0f, 6.19f)
                lineToRelative(0.0f, 0.9f)
                lineToRelative(0.0f, 5.34f)
                lineToRelative(30.95f, 0.0f)
                lineToRelative(0.0f, -6.24f)
                lineToRelative(-24.65f, 0.0f)
                lineToRelative(0.0f, -6.19f)
                lineToRelative(24.65f, 0.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1d1d1b)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(37.04f, 55.82f)
                lineToRelative(-37.04f, 0.0f)
                lineToRelative(0.0f, 37.11f)
                lineToRelative(37.04f, 0.0f)
                lineToRelative(0.0f, -6.1f)
                lineToRelative(6.18f, 0.0f)
                lineToRelative(0.9f, 0.0f)
                lineToRelative(5.33f, 0.0f)
                lineToRelative(0.0f, -31.01f)
                lineToRelative(-6.23f, 0.0f)
                lineToRelative(0.0f, 24.7f)
                lineToRelative(-6.18f, 0.0f)
                lineToRelative(0.0f, -24.7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1d1d1b)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(55.71f, 55.82f)
                lineToRelative(0.0f, 37.11f)
                lineToRelative(37.04f, 0.0f)
                lineToRelative(0.0f, -37.11f)
                lineToRelative(-6.09f, 0.0f)
                lineToRelative(0.0f, -6.19f)
                lineToRelative(0.0f, -0.9f)
                lineToRelative(0.0f, -5.34f)
                lineToRelative(-30.95f, 0.0f)
                lineToRelative(0.0f, 6.24f)
                lineToRelative(24.65f, 0.0f)
                lineToRelative(0.0f, 6.19f)
                lineToRelative(-24.65f, 0.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1d1d1b)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(55.71f, 37.11f)
                lineToRelative(37.04f, 0.0f)
                lineToRelative(0.0f, -37.11f)
                lineToRelative(-37.04f, 0.0f)
                lineToRelative(0.0f, 6.1f)
                lineToRelative(-6.18f, 0.0f)
                lineToRelative(-0.9f, 0.0f)
                lineToRelative(-5.33f, 0.0f)
                lineToRelative(0.0f, 31.01f)
                lineToRelative(6.23f, 0.0f)
                lineToRelative(0.0f, -24.7f)
                lineToRelative(6.18f, 0.0f)
                lineToRelative(0.0f, 24.7f)
                close()
            }
        }
            .build()
        return _friend!!
    }

private var _friend: ImageVector? = null
