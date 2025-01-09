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

public val Drawable.Blutooth: ImageVector
    get() {
        if (_blutooth != null) {
            return _blutooth!!
        }
        _blutooth = Builder(
            name = "Blutooth",
            defaultWidth = 119.53.dp,
            defaultHeight = 119.35.dp,
            viewportWidth = 119.53f,
            viewportHeight = 119.35f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(59.2f, 119.33f)
                curveTo(28.0f, 120.0f, 0.0f, 93.0f, 0.0f, 59.6f)
                reflectiveCurveTo(28.46f, 0.13f, 59.13f, 0.0f)
                curveToRelative(33.71f, -0.15f, 60.06f, 27.7f, 60.4f, 59.13f)
                curveTo(119.87f, 90.94f, 93.23f, 120.29f, 59.2f, 119.33f)
                close()
                moveTo(57.72f, 53.66f)
                lineToRelative(-1.69f, 1.0f)
                curveToRelative(-0.87f, -1.28f, -1.46f, -3.0f, -2.65f, -3.75f)
                curveToRelative(-2.55f, -1.66f, -4.47f, -7.46f, -7.17f, -4.8f)
                curveToRelative(-3.0f, 3.0f, 3.0f, 4.57f, 4.52f, 7.17f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 4.0f, 4.13f)
                curveToRelative(1.87f, 1.64f, 1.9f, 3.07f, 0.0f, 4.77f)
                arcToRelative(51.3f, 51.3f, 0.0f, false, false, -6.21f, 6.3f)
                curveTo(47.38f, 70.0f, 43.32f, 71.1f, 46.0f, 73.62f)
                curveToRelative(2.5f, 2.38f, 3.59f, -1.62f, 5.2f, -2.79f)
                arcToRelative(53.13f, 53.13f, 0.0f, false, false, 5.72f, -5.44f)
                curveToRelative(1.17f, 1.39f, 0.73f, 2.59f, 0.73f, 3.69f)
                curveToRelative(0.0f, 6.54f, 0.0f, 13.09f, 0.0f, 19.64f)
                curveToRelative(0.0f, 0.85f, -0.34f, 2.0f, 0.62f, 2.46f)
                reflectiveCurveToRelative(1.58f, -0.55f, 2.18f, -1.15f)
                curveToRelative(4.74f, -4.7f, 9.4f, -9.48f, 14.22f, -14.1f)
                curveToRelative(1.71f, -1.64f, 1.24f, -2.72f, -0.2f, -4.1f)
                curveToRelative(-2.68f, -2.58f, -5.27f, -5.26f, -7.9f, -7.89f)
                curveToRelative(-4.22f, -4.21f, -4.23f, -4.21f, 0.12f, -8.54f)
                quadToRelative(3.94f, -3.94f, 7.9f, -7.9f)
                curveToRelative(0.92f, -0.92f, 2.0f, -1.86f, 0.67f, -3.22f)
                quadTo(67.0f, 35.81f, 58.63f, 27.35f)
                lineToRelative(-0.91f, 0.44f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(63.18f, 65.41f)
                curveToRelative(1.0f, 0.83f, 1.54f, 1.19f, 2.0f, 1.63f)
                curveToRelative(8.15f, 7.81f, 8.0f, 8.84f, -2.0f, 15.74f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(62.92f, 36.64f)
                lineTo(71.0f, 44.77f)
                curveToRelative(0.92f, 0.93f, 0.7f, 1.77f, -0.13f, 2.66f)
                arcToRelative(72.3f, 72.3f, 0.0f, false, true, -7.11f, 7.11f)
                curveTo(62.42f, 48.76f, 63.0f, 43.29f, 62.92f, 36.64f)
                close()
            }
        }
            .build()
        return _blutooth!!
    }

private var _blutooth: ImageVector? = null
