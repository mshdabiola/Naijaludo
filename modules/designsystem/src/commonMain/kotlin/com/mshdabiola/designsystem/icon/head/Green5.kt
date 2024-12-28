package com.mshdabiola.designsystem.icon.head

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

fun Head.getGreen(iconColor: Color, accentColor: Color): ImageVector {
    return Builder(
        name = "Green5",
        defaultWidth = 200.0.dp,
        defaultHeight = 200.0.dp,
        viewportWidth = 200.0f,
        viewportHeight = 200.0f,
    ).apply {
        path(
            fill = SolidColor(iconColor),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(114.5f, 9.85f)
            curveToRelative(4.5f, -1.24f, 10.0f, -1.0f, 14.5f, -0.5f)
            curveToRelative(4.25f, 0.5f, 8.5f, 0.5f, 12.75f, 1.0f)
            arcToRelative(12.8f, 12.8f, 0.0f, false, true, -1.75f, 2.5f)
            curveToRelative(3.25f, 0.74f, 6.0f, 2.74f, 9.0f, 3.49f)
            curveToRelative(2.24f, 0.74f, 4.0f, 2.0f, 6.26f, 2.25f)
            curveToRelative(0.0f, 0.0f, 0.25f, 0.25f, -1.26f, 2.75f)
            curveToRelative(0.5f, 1.24f, 1.76f, 1.24f, 2.5f, 2.0f)
            arcToRelative(27.29f, 27.29f, 0.0f, false, true, 3.25f, 4.25f)
            reflectiveCurveToRelative(1.25f, 0.25f, 4.0f, 1.0f)
            curveToRelative(-0.25f, 1.0f, -1.0f, 2.24f, -1.0f, 3.49f)
            curveToRelative(4.75f, 0.25f, 14.25f, 5.49f, 13.75f, 6.25f)
            curveToRelative(-1.25f, 1.49f, -3.25f, 2.24f, -4.49f, 4.0f)
            curveToRelative(0.74f, 2.49f, 2.49f, 6.0f, 4.0f, 7.0f)
            curveToRelative(0.0f, 0.0f, 8.25f, 7.0f, 11.25f, 7.0f)
            curveToRelative(-2.25f, 2.0f, -5.25f, 3.74f, -7.24f, 6.0f)
            curveToRelative(-0.75f, 1.75f, 1.49f, 3.5f, 2.0f, 6.0f)
            curveToRelative(0.0f, 0.0f, 0.0f, 1.25f, 3.5f, 1.5f)
            lineTo(183.0f, 71.52f)
            curveToRelative(-1.51f, 3.74f, 1.49f, 6.74f, 2.24f, 10.0f)
            curveToRelative(2.0f, 3.75f, 5.76f, 6.25f, 8.75f, 9.0f)
            curveToRelative(3.0f, 2.5f, 4.0f, 6.0f, 5.26f, 9.48f)
            curveToRelative(1.24f, 2.75f, 0.49f, 6.49f, 0.74f, 9.0f)
            arcToRelative(19.27f, 19.27f, 0.0f, false, true, -5.0f, 11.0f)
            arcToRelative(7.23f, 7.23f, 0.0f, false, false, 1.26f, 4.49f)
            reflectiveCurveToRelative(0.24f, 3.0f, -4.75f, 7.49f)
            curveToRelative(1.49f, 1.5f, 6.24f, 1.75f, 4.24f, 4.5f)
            curveToRelative(-2.0f, 4.49f, -4.74f, 9.48f, -9.0f, 12.0f)
            arcToRelative(22.71f, 22.71f, 0.0f, false, true, -0.49f, 5.74f)
            curveToRelative(0.24f, 0.76f, 1.51f, 1.25f, 1.26f, 2.25f)
            curveToRelative(-1.0f, 0.75f, -2.0f, 0.75f, -3.0f, 1.25f)
            arcToRelative(16.54f, 16.54f, 0.0f, false, true, -1.49f, 7.73f)
            curveToRelative(-0.51f, 1.0f, 1.0f, 3.75f, 2.74f, 4.76f)
            curveToRelative(0.0f, 1.74f, -2.0f, 1.74f, -3.25f, 2.24f)
            arcToRelative(31.33f, 31.33f, 0.0f, false, true, -6.75f, 2.74f)
            reflectiveCurveToRelative(-0.5f, 2.26f, -1.0f, 6.75f)
            arcToRelative(22.76f, 22.76f, 0.0f, false, true, -9.75f, 4.24f)
            curveToRelative(-4.5f, 0.0f, -8.75f, 2.0f, -13.76f, 1.0f)
            curveToRelative(-1.74f, -0.49f, -3.73f, -0.74f, -5.24f, -1.25f)
            curveToRelative(0.0f, 1.0f, 1.0f, 3.5f, 0.5f, 3.5f)
            curveToRelative(-7.24f, 0.0f, -13.5f, 1.24f, -20.25f, -1.25f)
            curveToRelative(0.5f, 1.0f, 1.76f, 2.0f, 0.75f, 3.0f)
            arcToRelative(29.12f, 29.12f, 0.0f, false, false, -4.5f, 0.74f)
            arcToRelative(44.5f, 44.5f, 0.0f, false, true, -10.0f, 0.0f)
            curveTo(99.25f, 189.37f, 93.0f, 187.12f, 93.0f, 187.12f)
            curveToRelative(-2.5f, -1.25f, -5.25f, -2.49f, -7.25f, -4.24f)
            verticalLineToRelative(4.74f)
            curveToRelative(-3.0f, -1.0f, -5.26f, -3.75f, -7.75f, -6.0f)
            curveToRelative(-2.25f, 1.75f, -5.24f, 2.0f, -8.25f, 2.49f)
            curveToRelative(-1.24f, -0.5f, 0.0f, -1.75f, -0.76f, -2.49f)
            curveToRelative(-3.0f, 0.74f, -5.49f, 1.25f, -8.23f, 1.75f)
            arcToRelative(61.62f, 61.62f, 0.0f, false, true, -7.0f, 1.0f)
            curveTo(47.0f, 184.12f, 40.5f, 181.88f, 34.0f, 180.63f)
            curveToRelative(-3.74f, -1.5f, -6.25f, -2.0f, -9.25f, -3.49f)
            curveToRelative(-7.24f, -3.5f, -14.5f, -7.49f, -20.5f, -13.74f)
            curveToRelative(-1.25f, -2.5f, 0.0f, -5.24f, 1.51f, -7.49f)
            curveToRelative(2.49f, -3.25f, 8.0f, -10.24f, 8.0f, -10.0f)
            curveToRelative(3.0f, -3.0f, 8.25f, -8.73f, 10.49f, -10.48f)
            arcTo(52.85f, 52.85f, 0.0f, false, true, 34.0f, 127.0f)
            curveToRelative(-0.25f, -2.5f, 2.0f, -4.0f, 3.0f, -5.74f)
            curveToRelative(0.27f, -0.5f, 2.51f, -3.0f, 2.26f, -4.5f)
            curveToRelative(-0.74f, -0.5f, -1.74f, -0.5f, -2.51f, -1.0f)
            arcToRelative(36.51f, 36.51f, 0.0f, false, true, 4.0f, -4.49f)
            lineToRelative(-6.5f, -0.75f)
            curveToRelative(0.75f, -2.25f, 3.0f, -3.24f, 4.5f, -5.0f)
            arcToRelative(34.3f, 34.3f, 0.0f, false, false, -4.25f, -3.25f)
            curveToRelative(1.5f, -0.75f, 3.26f, -1.25f, 4.5f, -2.0f)
            curveTo(36.74f, 95.24f, 27.25f, 89.0f, 25.74f, 84.0f)
            arcToRelative(2.82f, 2.82f, 0.0f, false, false, 1.0f, -1.51f)
            curveTo(20.0f, 75.77f, 12.5f, 68.52f, 7.25f, 61.0f)
            curveTo(4.25f, 53.79f, 0.5f, 46.81f, 0.0f, 38.56f)
            curveToRelative(1.49f, -2.49f, 4.75f, -1.5f, 7.0f, -2.49f)
            arcToRelative(140.11f, 140.11f, 0.0f, false, false, 25.5f, -4.25f)
            curveToRelative(5.0f, -2.5f, 10.5f, -3.74f, 15.75f, -5.0f)
            curveTo(54.0f, 25.83f, 58.0f, 29.58f, 63.0f, 29.58f)
            arcToRelative(19.82f, 19.82f, 0.0f, false, false, 3.5f, 1.24f)
            arcToRelative(27.0f, 27.0f, 0.0f, false, true, 13.75f, -9.0f)
            curveToRelative(3.0f, -1.0f, 6.25f, -1.0f, 9.0f, -1.5f)
            arcToRelative(74.78f, 74.78f, 0.0f, false, true, 9.0f, -4.5f)
            lineToRelative(7.5f, -5.0f)
            curveToRelative(2.76f, -1.0f, 5.5f, -2.5f, 8.25f, -3.0f)
            curveToRelative(0.5f, 0.0f, 0.25f, 1.5f, 0.5f, 2.0f)
            close()
        }
        path(
            fill = SolidColor(accentColor),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(34.0f, 37.82f)
            lineToRelative(1.25f, 1.74f)
            curveToRelative(-4.5f, -0.25f, -6.75f, -0.25f, -6.75f, -0.25f)
            curveToRelative(-4.5f, 0.5f, -9.5f, 2.74f, -11.0f, 7.5f)
            curveToRelative(0.23f, 0.49f, 1.0f, 0.49f, 1.24f, 1.0f)
            curveToRelative(-4.0f, 3.25f, -6.25f, 4.75f, -6.25f, 4.75f)
            curveToRelative(1.26f, 2.25f, 0.75f, 5.24f, 2.5f, 7.48f)
            curveToRelative(-1.49f, 0.25f, -1.75f, -0.24f, -1.75f, -0.24f)
            curveToRelative(1.25f, 2.49f, 3.25f, 4.49f, 4.75f, 6.74f)
            curveToRelative(3.0f, 4.0f, 7.26f, 6.0f, 11.26f, 8.0f)
            curveToRelative(0.25f, 1.25f, -1.51f, 0.5f, -1.76f, 0.74f)
            curveToRelative(2.51f, 2.0f, 6.0f, 2.75f, 9.24f, 3.5f)
            curveToRelative(2.76f, 0.5f, 6.26f, 1.5f, 9.0f, 0.5f)
            lineToRelative(-3.0f, -2.75f)
            arcToRelative(32.36f, 32.36f, 0.0f, false, false, 5.0f, 1.5f)
            arcTo(35.76f, 35.76f, 0.0f, false, false, 60.5f, 76.76f)
            arcToRelative(9.4f, 9.4f, 0.0f, false, true, -2.75f, -1.5f)
            curveToRelative(3.0f, -0.74f, 6.5f, -2.0f, 8.25f, -4.74f)
            curveToRelative(3.75f, -3.0f, 4.25f, -7.74f, 6.76f, -11.48f)
            arcTo(20.35f, 20.35f, 0.0f, false, true, 74.0f, 55.54f)
            curveToRelative(5.5f, -3.5f, 6.74f, -9.74f, 6.49f, -16.0f)
            curveToRelative(-3.24f, 0.75f, -6.0f, -2.0f, -9.49f, -1.0f)
            arcToRelative(3.8f, 3.8f, 0.0f, false, false, -1.5f, 1.0f)
            arcTo(14.0f, 14.0f, 0.0f, false, false, 65.0f, 36.31f)
            lineToRelative(1.0f, 1.51f)
            curveToRelative(0.25f, 0.74f, 0.5f, 1.24f, -0.25f, 2.0f)
            curveToRelative(-1.0f, -0.5f, -2.0f, -1.49f, -3.0f, -2.0f)
            arcToRelative(7.29f, 7.29f, 0.0f, false, true, 0.5f, 2.49f)
            arcToRelative(1.78f, 1.78f, 0.0f, false, true, -0.75f, 1.5f)
            arcToRelative(35.93f, 35.93f, 0.0f, false, false, -7.25f, -5.25f)
            curveToRelative(-3.75f, -0.75f, -8.25f, 0.0f, -11.75f, -0.49f)
            curveToRelative(-4.25f, -0.51f, -7.0f, -0.76f, -9.5f, 1.75f)
            close()
        }
        path(
            fill = SolidColor(iconColor),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(57.75f, 81.0f)
            curveToRelative(-5.25f, 2.0f, -11.5f, 1.25f, -17.25f, 0.74f)
            lineToRelative(1.5f, 1.0f)
            curveToRelative(6.75f, 2.25f, 17.0f, 0.5f, 20.75f, -1.49f)
            curveToRelative(-0.25f, 1.0f, -4.5f, 3.25f, -5.49f, 4.0f)
            curveToRelative(-7.26f, 3.0f, -11.51f, 3.25f, -20.0f, 2.0f)
            curveToRelative(2.49f, 0.75f, 3.49f, 3.0f, 5.24f, 5.0f)
            curveToRelative(1.75f, 0.76f, 3.51f, 0.51f, 5.25f, 0.51f)
            arcToRelative(41.24f, 41.24f, 0.0f, false, false, 8.0f, -1.26f)
            lineTo(53.0f, 91.0f)
            arcToRelative(4.32f, 4.32f, 0.0f, false, false, 0.25f, -1.25f)
            arcTo(37.0f, 37.0f, 0.0f, false, false, 68.0f, 76.76f)
            curveToRelative(-3.0f, 2.25f, -6.75f, 3.0f, -10.25f, 4.25f)
            close()
        }
        path(
            fill = SolidColor(iconColor),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(41.0f, 96.49f)
            curveToRelative(3.24f, 1.74f, 6.24f, 4.24f, 10.24f, 3.74f)
            arcToRelative(12.43f, 12.43f, 0.0f, false, false, 4.5f, -2.0f)
            curveToRelative(-2.51f, 0.76f, -5.25f, 0.0f, -7.75f, -0.74f)
            arcToRelative(0.68f, 0.68f, 0.0f, false, true, 0.5f, -1.0f)
            close()
        }
        path(
            fill = SolidColor(accentColor),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(46.0f, 114.22f)
            arcTo(14.7f, 14.7f, 0.0f, false, true, 56.0f, 120.0f)
            arcToRelative(23.68f, 23.68f, 0.0f, false, false, -3.0f, -5.0f)
            curveToRelative(-0.49f, -0.25f, -0.49f, -0.49f, -0.49f, -0.49f)
            arcToRelative(16.83f, 16.83f, 0.0f, false, true, 3.5f, -3.75f)
            lineToRelative(-1.0f, -0.25f)
            curveToRelative(-3.25f, 1.25f, -6.25f, 2.0f, -9.0f, 3.75f)
            close()
        }
        path(
            fill = SolidColor(accentColor),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(42.5f, 124.7f)
            curveToRelative(1.0f, 0.0f, 2.25f, -1.0f, 3.25f, -0.5f)
            curveToRelative(4.0f, -1.25f, 6.0f, -1.74f, 6.0f, -1.74f)
            curveToRelative(0.75f, -0.25f, 1.24f, 0.24f, 1.75f, 0.0f)
            lineToRelative(-1.75f, -2.75f)
            curveToRelative(-0.5f, -0.26f, -0.25f, -1.25f, -1.25f, -1.5f)
            arcToRelative(11.67f, 11.67f, 0.0f, false, false, -8.0f, 6.49f)
            close()
        }
        path(
            fill = SolidColor(accentColor),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(36.74f, 133.44f)
            curveToRelative(-1.0f, -0.5f, 0.0f, -1.5f, 0.0f, -1.75f)
            curveToRelative(-0.74f, 0.0f, -1.24f, 0.51f, -2.0f, 0.75f)
            curveToRelative(-6.0f, 3.25f, -9.75f, 9.74f, -15.5f, 13.48f)
            arcToRelative(14.32f, 14.32f, 0.0f, false, false, -4.75f, 7.5f)
            curveToRelative(-0.5f, 1.24f, -1.25f, 2.49f, -0.74f, 3.49f)
            curveToRelative(1.0f, 0.5f, 3.49f, 0.5f, 3.49f, 0.75f)
            lineTo(14.0f, 160.9f)
            curveToRelative(1.75f, 1.5f, 3.51f, 2.75f, 5.75f, 3.0f)
            curveToRelative(0.0f, 1.25f, -1.25f, 1.25f, -2.0f, 1.74f)
            arcToRelative(41.1f, 41.1f, 0.0f, false, false, 11.77f, 5.25f)
            curveToRelative(5.49f, 1.25f, 11.5f, 2.5f, 17.0f, 2.5f)
            curveToRelative(5.25f, -0.25f, 10.26f, -1.0f, 13.75f, -5.0f)
            curveToRelative(0.51f, -1.51f, 1.0f, -1.25f, 1.0f, -1.25f)
            curveToRelative(1.5f, 0.25f, 1.0f, 2.24f, 1.25f, 3.24f)
            curveToRelative(1.25f, -0.49f, 1.75f, -2.0f, 3.0f, -2.24f)
            curveToRelative(1.49f, 1.75f, -0.25f, 3.24f, 0.0f, 5.24f)
            curveToRelative(3.0f, -1.25f, 6.49f, -2.5f, 10.0f, -2.0f)
            arcTo(6.44f, 6.44f, 0.0f, false, false, 81.0f, 167.9f)
            arcToRelative(4.75f, 4.75f, 0.0f, false, true, -2.5f, 1.24f)
            curveToRelative(-0.25f, 0.0f, 3.0f, -4.49f, 2.5f, -7.23f)
            arcToRelative(9.1f, 9.1f, 0.0f, false, false, -4.49f, 0.0f)
            arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 3.0f)
            arcToRelative(67.9f, 67.9f, 0.0f, false, false, -6.76f, -1.75f)
            curveToRelative(1.0f, 0.5f, 1.75f, 2.75f, 1.75f, 3.0f)
            curveToRelative(-2.0f, -0.76f, -3.75f, -2.25f, -5.75f, -3.0f)
            curveToRelative(-3.5f, -1.49f, -11.5f, -2.25f, -11.25f, -2.49f)
            curveToRelative(3.25f, -1.5f, 7.0f, -1.0f, 10.26f, -2.25f)
            curveToRelative(-1.51f, -1.0f, -3.0f, -2.0f, -5.0f, -2.0f)
            curveToRelative(-5.5f, 0.75f, -10.74f, 2.5f, -16.25f, 0.75f)
            arcToRelative(17.46f, 17.46f, 0.0f, false, true, -3.5f, 2.5f)
            arcToRelative(61.71f, 61.71f, 0.0f, false, true, -13.5f, 1.75f)
            arcToRelative(39.67f, 39.67f, 0.0f, false, false, 2.0f, -6.25f)
            curveToRelative(1.0f, -4.0f, 5.25f, -6.74f, 7.25f, -10.48f)
            curveToRelative(3.5f, -2.75f, 11.75f, -6.5f, 11.5f, -6.0f)
            curveToRelative(-3.75f, 4.49f, -4.0f, 5.48f, -4.0f, 5.48f)
            curveToRelative(5.76f, -4.24f, 7.25f, -6.0f, 7.25f, -6.0f)
            curveToRelative(0.75f, -0.25f, 1.5f, -1.0f, 2.25f, -0.75f)
            curveToRelative(-0.25f, 1.76f, -1.25f, 3.5f, -1.25f, 5.5f)
            curveToRelative(0.75f, -1.75f, 2.5f, -3.25f, 3.75f, -4.75f)
            lineToRelative(2.5f, -4.0f)
            arcToRelative(6.76f, 6.76f, 0.0f, false, true, -3.0f, 1.5f)
            curveToRelative(-0.25f, 0.0f, 1.25f, -3.49f, 1.5f, -4.74f)
            arcToRelative(27.57f, 27.57f, 0.0f, false, false, -6.5f, 2.0f)
            curveToRelative(-1.75f, 0.75f, -2.25f, 2.25f, -2.25f, 0.0f)
            curveToRelative(0.5f, -1.5f, 1.76f, -2.74f, 2.75f, -4.25f)
            arcToRelative(41.47f, 41.47f, 0.0f, false, false, -13.51f, 4.75f)
            close()
        }
        path(
            fill = SolidColor(accentColor),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(62.75f, 140.44f)
            arcToRelative(2.14f, 2.14f, 0.0f, false, false, 1.5f, -0.76f)
            curveToRelative(0.25f, -0.49f, 0.76f, 0.0f, 1.0f, 0.25f)
            curveToRelative(0.49f, 2.25f, -0.5f, 4.75f, -0.5f, 6.74f)
            curveToRelative(1.49f, 2.0f, 2.74f, 4.0f, 4.0f, 5.75f)
            curveToRelative(1.0f, -1.75f, 2.49f, -4.0f, 1.24f, -6.0f)
            curveToRelative(-1.75f, -4.0f, -5.0f, -8.0f, -8.0f, -11.23f)
            arcToRelative(12.19f, 12.19f, 0.0f, false, true, 0.75f, 5.25f)
            close()
        }
        path(
            fill = SolidColor(accentColor),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(110.75f, 18.09f)
            curveToRelative(-0.5f, -1.75f, -0.25f, -2.75f, -0.5f, -3.75f)
            curveToRelative(-5.5f, 3.75f, -10.75f, 7.25f, -14.5f, 12.48f)
            arcToRelative(13.89f, 13.89f, 0.0f, false, true, -1.25f, 5.75f)
            curveToRelative(1.74f, -0.25f, 3.0f, -2.0f, 4.75f, -2.49f)
            curveToRelative(1.0f, 1.49f, -0.5f, 3.24f, -0.5f, 5.0f)
            curveToRelative(1.0f, 0.0f, 1.76f, -0.74f, 3.0f, -0.24f)
            curveToRelative(0.5f, 0.49f, 0.5f, 0.0f, 1.5f, 0.74f)
            arcToRelative(9.67f, 9.67f, 0.0f, false, true, -3.0f, 1.76f)
            curveToRelative(-3.77f, 0.5f, -7.75f, 2.0f, -10.0f, 4.73f)
            curveToRelative(1.25f, 0.0f, 2.26f, -1.74f, 3.25f, -0.24f)
            curveToRelative(-0.74f, 1.25f, -2.25f, 1.74f, -3.0f, 2.74f)
            curveToRelative(1.0f, -0.24f, 4.0f, -2.74f, 4.25f, -2.24f)
            curveToRelative(-0.25f, 3.49f, -1.5f, 6.24f, -2.75f, 9.23f)
            curveToRelative(0.51f, 0.25f, 1.25f, -0.24f, 1.5f, 0.5f)
            arcToRelative(21.1f, 21.1f, 0.0f, false, true, -4.25f, 6.25f)
            curveToRelative(-3.5f, 4.24f, -7.0f, 9.0f, -11.75f, 11.23f)
            curveToRelative(-0.49f, -0.25f, 1.75f, -3.74f, 2.75f, -5.24f)
            curveToRelative(0.75f, -2.0f, 2.25f, -4.0f, 2.75f, -5.24f)
            curveToRelative(-0.5f, -0.25f, -0.5f, -1.0f, -0.5f, -1.5f)
            curveToRelative(1.0f, -2.49f, 3.0f, -4.5f, 3.0f, -7.25f)
            lineToRelative(-4.76f, 5.0f)
            arcToRelative(22.93f, 22.93f, 0.0f, false, true, -5.74f, 9.0f)
            arcTo(33.08f, 33.08f, 0.0f, false, true, 77.25f, 56.0f)
            curveToRelative(-1.0f, 1.0f, -2.0f, 1.25f, -2.25f, 3.25f)
            curveToRelative(-0.75f, 4.0f, -2.0f, 8.49f, -5.0f, 11.73f)
            arcToRelative(14.0f, 14.0f, 0.0f, false, false, 2.0f, -1.25f)
            curveToRelative(0.0f, 0.25f, 0.0f, 8.24f, -1.5f, 12.0f)
            arcToRelative(27.27f, 27.27f, 0.0f, false, false, 4.0f, -3.74f)
            curveToRelative(0.25f, -0.24f, 1.0f, -0.75f, 1.25f, 0.5f)
            curveTo(75.0f, 81.26f, 73.51f, 83.0f, 71.75f, 85.0f)
            curveToRelative(1.51f, -0.25f, 2.5f, -1.25f, 4.0f, -1.49f)
            curveToRelative(0.25f, 0.0f, -3.51f, 6.23f, -5.5f, 9.0f)
            curveToRelative(1.25f, 7.0f, 8.5f, 12.0f, 15.0f, 13.48f)
            curveToRelative(3.75f, 0.74f, 6.25f, -0.75f, 9.0f, -1.5f)
            lineToRelative(-2.5f, -2.0f)
            curveToRelative(3.75f, -1.0f, 7.75f, 0.5f, 10.75f, 3.0f)
            curveToRelative(0.75f, 1.0f, 2.25f, 2.49f, 1.25f, 4.24f)
            arcToRelative(9.15f, 9.15f, 0.0f, false, true, -7.51f, 4.0f)
            arcToRelative(5.87f, 5.87f, 0.0f, false, true, -2.24f, 0.5f)
            curveToRelative(-0.25f, -0.75f, 0.75f, -1.0f, 1.0f, -1.5f)
            curveToRelative(-1.5f, -0.75f, -6.74f, -2.75f, -9.5f, -2.25f)
            curveToRelative(-4.76f, 0.75f, -9.5f, 1.25f, -13.26f, 4.49f)
            curveToRelative(-4.49f, 2.75f, -5.49f, 8.0f, -5.49f, 12.74f)
            curveToRelative(2.0f, 2.75f, 4.25f, 5.0f, 6.0f, 7.74f)
            curveToRelative(0.25f, 0.49f, 0.5f, 1.0f, -0.25f, 1.5f)
            curveToRelative(-1.51f, -0.5f, -2.51f, -1.75f, -3.75f, -2.25f)
            curveToRelative(5.0f, 5.75f, 7.49f, 13.73f, 15.0f, 17.0f)
            curveToRelative(-0.25f, -0.25f, 0.0f, -1.25f, 0.51f, -1.25f)
            curveToRelative(2.49f, 1.0f, 5.24f, 1.25f, 7.24f, 3.24f)
            curveToRelative(-0.25f, -1.0f, -1.5f, -2.24f, -1.5f, -3.49f)
            curveToRelative(0.25f, -0.5f, 0.5f, -0.75f, 1.25f, -0.5f)
            curveToRelative(5.24f, 3.5f, 8.25f, 9.74f, 12.75f, 14.23f)
            curveToRelative(3.74f, 4.0f, 6.25f, 7.74f, 11.5f, 11.48f)
            arcToRelative(43.47f, 43.47f, 0.0f, false, false, 9.5f, 5.25f)
            curveToRelative(-1.5f, -1.25f, -2.75f, -2.75f, -3.0f, -4.0f)
            arcToRelative(0.92f, 0.92f, 0.0f, false, true, 0.5f, -1.26f)
            lineToRelative(4.25f, 2.76f)
            curveToRelative(4.5f, 2.49f, 9.51f, 4.74f, 14.75f, 5.0f)
            curveToRelative(-0.25f, -0.5f, -0.75f, -1.0f, -0.25f, -1.5f)
            curveToRelative(3.0f, 0.25f, 6.0f, 1.5f, 9.25f, 1.25f)
            curveToRelative(1.76f, -0.25f, 3.75f, -0.25f, 5.0f, -1.5f)
            arcToRelative(40.59f, 40.59f, 0.0f, false, true, -17.0f, -6.74f)
            arcToRelative(29.69f, 29.69f, 0.0f, false, false, -5.75f, -3.75f)
            arcToRelative(21.84f, 21.84f, 0.0f, false, true, 2.0f, 3.5f)
            arcToRelative(25.35f, 25.35f, 0.0f, false, true, 2.25f, 3.49f)
            curveToRelative(0.25f, 0.51f, 0.0f, 0.51f, -0.49f, 0.51f)
            arcToRelative(13.0f, 13.0f, 0.0f, false, true, -4.26f, -3.0f)
            curveToRelative(-2.0f, -1.49f, -3.74f, -2.49f, -5.75f, -3.74f)
            arcToRelative(25.37f, 25.37f, 0.0f, false, true, -7.5f, -1.49f)
            curveToRelative(0.0f, 0.74f, 0.0f, 1.24f, -0.75f, 1.49f)
            lineToRelative(-1.49f, -1.49f)
            arcTo(31.91f, 31.91f, 0.0f, false, true, 108.0f, 162.4f)
            curveToRelative(-4.76f, -7.24f, -12.51f, -13.23f, -14.51f, -21.47f)
            curveToRelative(-1.24f, -4.75f, -0.74f, -9.74f, 2.74f, -13.23f)
            curveToRelative(2.0f, -2.25f, 4.52f, 0.0f, 6.76f, 0.24f)
            curveToRelative(2.25f, -1.24f, 4.74f, -2.24f, 7.25f, -3.74f)
            curveToRelative(2.26f, -0.75f, 4.0f, 2.5f, 6.51f, 1.75f)
            curveToRelative(2.24f, -0.75f, 5.0f, -1.25f, 6.74f, -3.25f)
            arcToRelative(9.72f, 9.72f, 0.0f, false, false, 2.0f, -3.5f)
            curveToRelative(0.75f, 0.25f, 0.5f, 1.25f, 1.25f, 1.51f)
            lineToRelative(6.0f, 0.5f)
            curveToRelative(-1.0f, 0.75f, -2.25f, 0.5f, -3.25f, 0.75f)
            curveToRelative(-1.24f, 0.74f, -2.25f, 1.75f, -3.75f, 1.49f)
            arcToRelative(14.34f, 14.34f, 0.0f, false, true, -7.25f, 4.25f)
            arcToRelative(7.39f, 7.39f, 0.0f, false, true, -3.0f, 4.24f)
            curveToRelative(0.24f, 3.5f, -1.75f, 6.24f, -4.0f, 8.5f)
            curveToRelative(-1.5f, 1.49f, -5.0f, 1.49f, -4.75f, 4.0f)
            arcToRelative(6.32f, 6.32f, 0.0f, false, false, 4.25f, 1.0f)
            curveToRelative(3.0f, -0.24f, 6.0f, -0.49f, 7.75f, -3.24f)
            arcToRelative(18.15f, 18.15f, 0.0f, false, false, 7.75f, -3.49f)
            curveToRelative(2.0f, -1.75f, 3.25f, -4.5f, 4.75f, -6.25f)
            curveToRelative(1.25f, 1.0f, 2.0f, 2.75f, 2.75f, 4.0f)
            curveToRelative(2.26f, 1.24f, 5.26f, 1.24f, 7.75f, 1.24f)
            curveToRelative(0.25f, 0.0f, -2.0f, 1.76f, -3.0f, 2.76f)
            curveToRelative(-2.24f, 1.74f, -3.5f, 4.49f, -5.0f, 6.48f)
            curveToRelative(-0.75f, -2.0f, -2.25f, -1.0f, -2.25f, -1.0f)
            curveToRelative(-2.25f, 1.0f, -4.25f, 3.0f, -6.75f, 4.0f)
            verticalLineToRelative(-1.24f)
            curveToRelative(-3.0f, 0.74f, -5.5f, 1.74f, -8.76f, 2.24f)
            curveToRelative(-0.74f, -0.75f, -0.49f, -1.0f, 0.0f, -1.5f)
            curveToRelative(-3.24f, -1.25f, -6.73f, -1.0f, -9.74f, -2.75f)
            lineTo(105.0f, 147.92f)
            curveToRelative(0.5f, 1.25f, -0.25f, 2.75f, 1.25f, 3.5f)
            curveToRelative(2.76f, 1.49f, 6.5f, 1.0f, 9.49f, 1.75f)
            curveToRelative(6.26f, 1.75f, 12.77f, -0.26f, 18.51f, -2.5f)
            curveToRelative(0.0f, 0.25f, 0.25f, 0.25f, 0.25f, 0.5f)
            curveToRelative(-2.25f, 3.24f, -6.24f, 5.0f, -9.5f, 5.74f)
            lineToRelative(3.75f, 1.75f)
            curveToRelative(1.5f, 0.75f, 4.75f, 1.75f, 4.5f, 2.0f)
            arcToRelative(19.53f, 19.53f, 0.0f, false, true, -5.49f, 1.49f)
            curveToRelative(2.49f, 0.75f, 4.74f, 2.5f, 7.0f, 4.25f)
            curveToRelative(4.51f, 2.5f, 10.0f, 2.0f, 15.0f, 2.5f)
            curveToRelative(5.51f, 0.49f, 10.5f, 3.49f, 14.51f, 6.73f)
            arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.49f, 1.76f)
            curveToRelative(-4.25f, -1.25f, -9.0f, -1.25f, -12.74f, -2.75f)
            curveToRelative(-2.51f, 0.0f, -4.51f, -1.0f, -7.0f, -1.25f)
            curveToRelative(3.5f, 2.0f, 7.75f, 3.5f, 11.25f, 5.74f)
            curveToRelative(3.25f, 1.5f, 10.5f, 1.75f, 16.25f, 1.75f)
            curveToRelative(-1.0f, -2.25f, -2.0f, -2.49f, -3.0f, -3.74f)
            curveToRelative(-5.0f, -7.24f, -10.5f, -14.49f, -14.74f, -22.22f)
            arcToRelative(5.0f, 5.0f, 0.0f, false, true, -1.51f, -3.25f)
            arcToRelative(42.84f, 42.84f, 0.0f, false, false, -2.5f, 3.49f)
            curveToRelative(-0.51f, -6.74f, 1.0f, -9.49f, 1.0f, -9.49f)
            curveToRelative(-4.0f, 2.0f, -8.5f, 2.5f, -12.76f, 3.5f)
            arcToRelative(1.94f, 1.94f, 0.0f, false, true, -0.24f, -0.75f)
            curveToRelative(7.0f, -4.49f, 15.25f, -5.74f, 21.49f, -11.48f)
            arcToRelative(61.89f, 61.89f, 0.0f, false, false, -6.75f, 0.74f)
            lineToRelative(-1.74f, 1.51f)
            curveToRelative(0.74f, -1.51f, -0.5f, -4.5f, 1.74f, -5.25f)
            curveToRelative(5.75f, 1.5f, 10.0f, 1.0f, 15.5f, 0.25f)
            curveToRelative(3.5f, -1.25f, 7.5f, -2.25f, 10.75f, -4.24f)
            arcToRelative(14.63f, 14.63f, 0.0f, false, false, 4.75f, -7.0f)
            lineToRelative(-2.0f, -0.49f)
            curveToRelative(-1.0f, 0.74f, -2.5f, 0.74f, -3.74f, 1.0f)
            curveToRelative(-2.76f, 0.75f, -7.51f, 1.5f, -8.5f, 1.0f)
            curveToRelative(-4.5f, -1.75f, -7.0f, -6.49f, -9.26f, -10.48f)
            curveToRelative(-0.75f, -3.75f, 1.51f, -7.5f, -0.25f, -11.49f)
            curveToRelative(-0.25f, -3.0f, 1.76f, -5.74f, 3.75f, -7.49f)
            curveToRelative(1.51f, -1.0f, 2.0f, -3.0f, 3.75f, -3.25f)
            curveToRelative(4.25f, -0.75f, 9.24f, -1.24f, 13.0f, 1.0f)
            lineTo(185.0f, 91.0f)
            curveToRelative(-0.5f, -4.0f, -3.0f, -8.24f, -7.25f, -9.49f)
            curveToRelative(-7.25f, -1.0f, -14.74f, -0.24f, -21.25f, -4.0f)
            reflectiveCurveToRelative(-12.24f, -10.0f, -14.75f, -17.0f)
            curveToRelative(0.0f, -0.25f, 0.5f, -0.5f, 0.75f, -0.5f)
            curveToRelative(3.75f, 2.5f, 7.0f, 6.5f, 10.0f, 9.49f)
            curveToRelative(-0.25f, -1.49f, -0.5f, -4.49f, -0.25f, -4.74f)
            curveToRelative(0.0f, -3.0f, 0.75f, -9.24f, 1.24f, -9.24f)
            curveToRelative(0.25f, 0.75f, 0.5f, 1.5f, 0.75f, 2.5f)
            arcToRelative(59.56f, 59.56f, 0.0f, false, false, 3.25f, 13.48f)
            curveToRelative(1.0f, 2.74f, 4.0f, 5.0f, 6.26f, 6.49f)
            arcTo(48.25f, 48.25f, 0.0f, false, false, 174.0f, 79.51f)
            curveToRelative(-3.75f, -1.5f, -8.0f, -3.74f, -9.25f, -8.0f)
            curveToRelative(-2.5f, -4.74f, -2.25f, -7.74f, -2.25f, -7.74f)
            curveToRelative(0.51f, -4.24f, 1.26f, -8.49f, 3.75f, -12.24f)
            curveToRelative(0.76f, -1.25f, 2.0f, -2.49f, 2.5f, -3.74f)
            curveToRelative(-3.75f, 0.25f, -8.0f, 1.0f, -11.25f, 3.5f)
            curveToRelative(-0.5f, -0.25f, -0.75f, -0.5f, -0.5f, -1.25f)
            arcToRelative(50.73f, 50.73f, 0.0f, false, false, 2.75f, -6.5f)
            curveToRelative(1.75f, -4.24f, 0.5f, -9.48f, 2.0f, -13.72f)
            curveToRelative(-5.0f, 0.25f, -9.74f, 0.49f, -14.24f, 2.74f)
            curveToRelative(-0.76f, -1.5f, 0.25f, -2.49f, 1.0f, -4.24f)
            curveToRelative(0.0f, 0.0f, 0.75f, -0.5f, 5.25f, -8.49f)
            curveToRelative(-1.0f, -0.25f, -2.0f, 0.5f, -3.25f, 0.25f)
            curveToRelative(-7.75f, -1.5f, -16.5f, -3.75f, -23.75f, -0.25f)
            curveToRelative(-0.25f, -0.25f, 0.76f, -4.0f, 1.76f, -5.5f)
            curveToRelative(-6.26f, 0.25f, -12.0f, 2.5f, -17.76f, 3.75f)
            close()
        }
        path(
            fill = SolidColor(accentColor),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(103.0f, 133.69f)
            curveToRelative(1.5f, 0.25f, 1.5f, -0.25f, 1.5f, -0.25f)
            arcToRelative(1.89f, 1.89f, 0.0f, false, false, -0.24f, -1.24f)
            lineTo(103.0f, 133.69f)
            close()
        }
        path(
            fill = SolidColor(accentColor),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(99.5f, 130.2f)
            curveToRelative(-3.75f, 3.24f, -2.25f, 9.0f, -2.25f, 13.23f)
            arcToRelative(25.83f, 25.83f, 0.0f, false, false, 3.0f, 4.25f)
            curveToRelative(-0.25f, -1.51f, 0.75f, -2.0f, 1.0f, -3.26f)
            curveToRelative(1.0f, -2.24f, -0.49f, -4.23f, -1.5f, -6.24f)
            curveToRelative(-1.5f, -3.0f, 0.51f, -5.74f, 2.0f, -8.0f)
            close()
        }
        path(
            fill = SolidColor(accentColor),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(104.75f, 130.2f)
            curveToRelative(1.0f, 0.5f, 2.0f, 1.24f, 2.0f, 2.24f)
            arcToRelative(4.36f, 4.36f, 0.0f, false, true, -1.5f, 3.0f)
            arcToRelative(5.77f, 5.77f, 0.0f, false, true, -3.5f, 0.25f)
            curveToRelative(0.0f, 1.5f, 0.0f, 3.0f, 1.5f, 4.0f)
            curveToRelative(2.25f, 0.76f, 4.49f, -0.49f, 6.0f, -1.24f)
            arcToRelative(8.76f, 8.76f, 0.0f, false, false, 3.25f, -9.0f)
            arcToRelative(2.42f, 2.42f, 0.0f, false, false, -2.26f, -1.74f)
            curveToRelative(-2.0f, -0.75f, -4.0f, 0.75f, -5.5f, 2.5f)
            close()
        }
        path(
            fill = SolidColor(accentColor),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(164.5f, 98.74f)
            curveToRelative(-0.5f, 2.74f, 0.5f, 5.49f, 0.25f, 7.24f)
            curveToRelative(0.25f, 2.0f, -1.24f, 5.24f, -0.25f, 7.0f)
            arcToRelative(10.46f, 10.46f, 0.0f, false, false, 3.5f, 4.49f)
            arcToRelative(8.21f, 8.21f, 0.0f, false, false, 6.75f, 1.74f)
            curveTo(177.0f, 118.0f, 179.26f, 116.0f, 179.0f, 113.0f)
            arcToRelative(14.0f, 14.0f, 0.0f, false, false, -1.76f, -6.25f)
            curveToRelative(1.76f, -3.49f, 2.0f, -4.49f, 1.76f, -5.74f)
            arcToRelative(7.32f, 7.32f, 0.0f, false, false, -5.26f, -6.0f)
            curveToRelative(-4.25f, -1.25f, -9.0f, 2.25f, -9.25f, 3.75f)
            close()
        }
        path(
            fill = SolidColor(accentColor),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(194.51f, 104.48f)
            curveToRelative(1.24f, 3.24f, 0.74f, 6.74f, -0.26f, 10.0f)
            arcToRelative(13.08f, 13.08f, 0.0f, false, false, 2.25f, -2.0f)
            curveToRelative(1.75f, -1.75f, 3.25f, -9.74f, 0.0f, -14.0f)
            curveToRelative(-1.25f, -1.49f, -2.0f, -3.0f, -3.5f, -4.0f)
            curveToRelative(1.76f, 3.0f, 1.76f, 6.75f, 1.51f, 10.0f)
            close()
        }
        path(
            fill = SolidColor(accentColor),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(184.75f, 130.7f)
            curveToRelative(-4.0f, 2.0f, -8.0f, 4.0f, -12.5f, 4.49f)
            lineTo(171.0f, 136.94f)
            arcToRelative(31.63f, 31.63f, 0.0f, false, true, -7.25f, 6.74f)
            curveToRelative(-2.26f, 1.74f, -4.5f, 3.75f, -5.26f, 6.49f)
            curveToRelative(-0.75f, 2.25f, 0.0f, 4.24f, 0.76f, 6.24f)
            arcToRelative(24.14f, 24.14f, 0.0f, false, false, 2.74f, 4.25f)
            arcToRelative(21.86f, 21.86f, 0.0f, false, false, 6.0f, 4.49f)
            arcToRelative(36.65f, 36.65f, 0.0f, false, false, 11.26f, 4.5f)
            arcTo(107.32f, 107.32f, 0.0f, false, false, 174.0f, 158.91f)
            curveToRelative(-0.75f, -1.25f, -1.25f, -2.75f, 0.0f, -3.5f)
            curveToRelative(3.75f, 0.75f, 7.5f, -0.25f, 11.0f, 0.25f)
            arcToRelative(29.46f, 29.46f, 0.0f, false, true, -4.25f, -6.49f)
            curveToRelative(-0.25f, -0.49f, -0.74f, -1.74f, 0.0f, -2.25f)
            curveToRelative(1.75f, -0.75f, 3.75f, -0.5f, 5.25f, -1.74f)
            curveToRelative(3.25f, -2.5f, 7.5f, -5.5f, 8.76f, -9.74f)
            curveToRelative(-2.51f, -1.5f, -5.76f, -1.25f, -8.27f, -3.0f)
            curveToRelative(6.51f, -4.0f, 8.27f, -7.24f, 8.27f, -7.24f)
            curveToRelative(-0.76f, -0.75f, -2.0f, -1.0f, -2.76f, -1.75f)
            curveToRelative(-1.24f, 1.25f, -5.75f, 6.5f, -7.25f, 7.25f)
            close()
        }
        path(
            fill = SolidColor(iconColor),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(74.25f, 44.31f)
            curveToRelative(-0.74f, 3.0f, -3.0f, 5.49f, -4.25f, 8.24f)
            lineToRelative(-2.0f, 2.0f)
            curveToRelative(0.76f, 0.75f, 2.0f, 0.26f, 2.5f, 1.5f)
            curveToRelative(-1.0f, 1.0f, -3.0f, 0.5f, -4.25f, 0.75f)
            horizontalLineTo(63.5f)
            curveToRelative(2.0f, 2.25f, 4.5f, 4.49f, 6.0f, 7.24f)
            curveToRelative(-2.25f, 1.5f, -5.75f, 0.5f, -8.25f, -0.75f)
            arcTo(8.0f, 8.0f, 0.0f, false, false, 59.0f, 62.53f)
            curveToRelative(1.0f, 1.5f, 4.75f, 5.5f, 4.25f, 5.74f)
            curveToRelative(-4.5f, -0.49f, -9.0f, -0.24f, -12.75f, -2.24f)
            lineToRelative(-2.25f, -1.25f)
            curveToRelative(0.25f, 0.5f, 1.25f, 2.75f, 0.76f, 3.25f)
            curveToRelative(-0.51f, -0.25f, -10.5f, -1.5f, -15.0f, -2.75f)
            curveToRelative(-2.75f, -0.75f, -5.75f, -1.0f, -8.26f, -2.5f)
            curveToRelative(-2.49f, -1.0f, -4.74f, -2.0f, -7.0f, -3.0f)
            curveToRelative(-0.5f, -0.75f, 0.25f, -1.5f, 0.75f, -2.25f)
            lineToRelative(6.24f, -5.25f)
            curveToRelative(4.76f, -4.49f, 11.52f, -5.0f, 18.0f, -5.24f)
            curveToRelative(6.0f, -1.5f, 12.75f, -2.74f, 19.25f, -4.0f)
            curveToRelative(0.75f, 1.0f, 0.0f, 2.24f, -0.5f, 3.25f)
            curveToRelative(2.26f, 0.25f, 4.75f, -0.76f, 7.0f, -1.76f)
            curveToRelative(2.0f, -0.75f, 4.0f, -1.24f, 5.5f, -3.0f)
            curveToRelative(0.25f, 1.75f, -0.75f, 1.75f, -0.75f, 2.75f)
            close()
        }
        path(
            fill = SolidColor(iconColor),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(120.26f, 21.34f)
            curveToRelative(5.74f, -1.0f, 17.74f, -0.51f, 18.24f, -0.26f)
            curveToRelative(0.0f, 0.26f, 0.25f, 0.76f, -0.25f, 1.25f)
            curveToRelative(2.0f, 0.25f, 4.0f, 1.0f, 6.26f, 0.75f)
            curveToRelative(0.49f, 0.25f, 1.74f, 0.0f, 1.49f, 1.0f)
            curveToRelative(-5.0f, 1.25f, -9.74f, 2.49f, -14.0f, 5.24f)
            curveToRelative(-2.51f, 1.5f, -3.26f, 4.25f, -5.0f, 6.24f)
            lineToRelative(0.25f, 0.25f)
            curveToRelative(5.0f, -1.0f, 15.25f, 1.25f, 15.0f, 1.51f)
            curveToRelative(-2.25f, 0.75f, -4.75f, 1.24f, -7.0f, 2.0f)
            curveToRelative(-2.5f, 1.25f, -5.25f, 1.75f, -7.24f, 3.0f)
            lineToRelative(6.49f, 1.74f)
            curveToRelative(-6.0f, 1.0f, -12.0f, 1.5f, -17.74f, 3.25f)
            arcToRelative(3.17f, 3.17f, 0.0f, false, false, -1.76f, 1.0f)
            reflectiveCurveToRelative(1.76f, 0.5f, 5.51f, 2.0f)
            arcToRelative(11.83f, 11.83f, 0.0f, false, true, -3.0f, 0.26f)
            curveToRelative(-4.5f, 1.0f, -9.24f, 3.49f, -11.75f, 7.49f)
            lineToRelative(0.5f, 2.0f)
            curveTo(108.0f, 61.78f, 110.0f, 62.0f, 112.0f, 62.28f)
            lineToRelative(0.5f, -1.0f)
            curveToRelative(4.0f, 0.75f, 6.74f, 3.75f, 10.24f, 6.25f)
            curveToRelative(0.25f, -0.51f, 0.25f, -1.0f, 0.5f, -1.25f)
            curveToRelative(1.0f, 0.5f, 2.5f, 1.25f, 3.0f, 2.49f)
            arcToRelative(3.07f, 3.07f, 0.0f, false, false, 3.0f, 0.5f)
            lineTo(129.0f, 71.0f)
            curveToRelative(3.25f, 0.5f, 8.75f, 4.49f, 8.5f, 4.75f)
            curveToRelative(-3.75f, 0.5f, -7.75f, -1.0f, -11.25f, -0.26f)
            curveToRelative(-0.75f, -1.49f, -2.49f, -2.75f, -3.75f, -3.74f)
            curveToRelative(-2.74f, -1.0f, -5.24f, -2.75f, -8.25f, -3.74f)
            curveToRelative(-0.25f, 0.24f, -0.5f, 1.0f, -1.0f, 0.49f)
            arcToRelative(26.43f, 26.43f, 0.0f, false, false, -4.24f, -3.0f)
            arcToRelative(34.14f, 34.14f, 0.0f, false, false, -1.0f, 5.24f)
            curveToRelative(5.74f, 3.0f, 7.73f, 6.0f, 7.24f, 12.74f)
            curveToRelative(0.25f, 0.24f, 0.49f, 0.75f, 1.0f, 1.0f)
            curveToRelative(1.0f, 0.24f, 1.75f, -0.76f, 3.0f, -0.5f)
            curveToRelative(0.25f, 1.0f, 0.25f, 2.0f, -0.5f, 2.49f)
            curveToRelative(2.0f, 1.5f, 4.0f, 2.75f, 6.0f, 4.0f)
            curveToRelative(2.25f, 1.49f, 5.0f, -1.0f, 7.26f, 0.74f)
            curveToRelative(0.49f, 0.0f, 2.0f, 0.75f, 1.74f, 0.75f)
            curveToRelative(-2.75f, 0.25f, -6.0f, -0.75f, -8.75f, 0.76f)
            curveToRelative(-2.0f, -0.25f, -3.0f, -2.25f, -4.74f, -3.25f)
            curveToRelative(-1.76f, -1.26f, -4.27f, -2.25f, -6.26f, -1.26f)
            curveToRelative(-1.49f, 0.0f, -3.0f, 1.75f, -4.74f, 1.0f)
            curveToRelative(-2.26f, -1.25f, -4.0f, -3.5f, -6.26f, -4.5f)
            curveToRelative(-1.25f, -0.24f, -2.74f, 0.75f, -4.25f, 0.0f)
            curveToRelative(-1.25f, -1.24f, -1.25f, -5.0f, -1.0f, -4.74f)
            curveToRelative(1.75f, 0.75f, 0.5f, 3.5f, 2.76f, 3.5f)
            curveToRelative(-1.0f, -2.5f, -2.26f, -5.0f, -2.51f, -7.74f)
            curveToRelative(0.5f, -2.76f, 2.51f, -4.25f, 4.0f, -6.5f)
            arcTo(40.78f, 40.78f, 0.0f, false, false, 103.5f, 64.0f)
            arcToRelative(27.77f, 27.77f, 0.0f, false, false, -4.25f, 3.25f)
            curveToRelative(-1.25f, 2.0f, -2.5f, 3.74f, -2.76f, 6.0f)
            curveTo(94.75f, 79.26f, 100.0f, 91.0f, 100.0f, 91.0f)
            curveToRelative(-3.26f, -2.75f, -4.51f, -6.48f, -6.76f, -9.73f)
            curveToRelative(-3.0f, -5.0f, -2.5f, -12.24f, 1.0f, -17.0f)
            curveToRelative(4.75f, -3.0f, 9.0f, -7.0f, 9.75f, -13.0f)
            arcToRelative(44.65f, 44.65f, 0.0f, false, false, -0.25f, -7.75f)
            curveToRelative(0.75f, -0.24f, 1.0f, 0.25f, 1.5f, 0.5f)
            curveToRelative(0.0f, -3.74f, -1.0f, -7.49f, -1.75f, -11.0f)
            curveToRelative(-0.75f, -2.5f, -3.24f, -7.74f, -3.0f, -8.0f)
            curveToRelative(3.24f, 1.0f, 6.24f, 3.25f, 9.24f, 5.24f)
            curveToRelative(1.0f, -1.25f, 1.25f, -3.0f, 2.26f, -4.49f)
            curveToRelative(1.49f, -3.0f, 4.75f, -5.74f, 7.49f, -7.49f)
            arcToRelative(7.36f, 7.36f, 0.0f, false, true, 0.76f, 3.0f)
            close()
        }
        path(
            fill = SolidColor(iconColor),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(107.25f, 96.0f)
            curveToRelative(0.0f, 0.25f, -0.25f, 0.5f, -0.25f, 0.75f)
            arcTo(7.52f, 7.52f, 0.0f, false, false, 99.75f, 96.0f)
            arcToRelative(5.29f, 5.29f, 0.0f, false, true, -5.0f, -2.5f)
            curveToRelative(0.0f, -0.25f, 2.5f, 1.25f, 4.25f, 1.25f)
            curveToRelative(1.26f, -1.5f, 2.75f, -2.24f, 4.5f, -1.74f)
            reflectiveCurveToRelative(2.5f, 1.74f, 3.75f, 3.0f)
            close()
        }
        path(
            fill = SolidColor(iconColor),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(108.26f, 118.0f)
            arcToRelative(0.77f, 0.77f, 0.0f, false, false, 0.5f, 0.25f)
            curveToRelative(-0.5f, 2.5f, -3.26f, 2.5f, -5.26f, 3.0f)
            curveToRelative(-1.25f, 0.0f, -2.74f, 0.25f, -3.75f, -0.76f)
            arcTo(10.85f, 10.85f, 0.0f, false, true, 95.0f, 122.21f)
            curveToRelative(-0.25f, -0.25f, 3.5f, -4.25f, 5.76f, -4.5f)
            curveToRelative(2.49f, 0.25f, 5.24f, 2.25f, 7.5f, 0.25f)
            close()
        }
        path(
            fill = SolidColor(iconColor),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(157.75f, 87.75f)
            curveToRelative(-1.74f, 1.0f, -6.51f, 3.24f, -7.0f, 3.49f)
            curveToRelative(-3.75f, 2.25f, -8.0f, -0.25f, -12.0f, 0.0f)
            curveToRelative(-0.25f, -1.0f, 0.76f, -0.74f, 1.25f, -0.74f)
            curveToRelative(6.0f, -0.51f, 11.0f, -4.75f, 17.5f, -3.5f)
            arcToRelative(0.92f, 0.92f, 0.0f, false, true, 0.25f, 0.75f)
            close()
        }
        path(
            fill = SolidColor(iconColor),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(152.76f, 122.21f)
            curveToRelative(2.25f, 0.74f, 4.49f, 2.24f, 7.0f, 3.0f)
            curveToRelative(0.5f, 0.25f, 0.0f, 0.75f, -0.49f, 1.0f)
            curveToRelative(-7.25f, 0.5f, -14.0f, -1.5f, -20.26f, -4.0f)
            curveToRelative(0.0f, -0.5f, 0.0f, -0.75f, 0.26f, -0.75f)
            curveToRelative(4.75f, 0.75f, 9.0f, 0.5f, 13.5f, 0.75f)
            close()
        }
        path(
            fill = SolidColor(accentColor),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(104.5f, 81.0f)
            curveToRelative(0.5f, -0.25f, 0.25f, -0.75f, 0.25f, -1.25f)
            curveToRelative(0.0f, 0.0f, 0.0f, -0.5f, -1.5f, -0.25f)
            lineTo(104.5f, 81.0f)
            close()
        }
        path(
            fill = SolidColor(accentColor),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(102.0f, 77.51f)
            arcToRelative(8.26f, 8.26f, 0.0f, false, true, 3.5f, 0.0f)
            arcToRelative(4.36f, 4.36f, 0.0f, false, true, 1.5f, 3.0f)
            curveToRelative(0.0f, 1.0f, -1.0f, 1.75f, -1.75f, 2.49f)
            curveToRelative(1.25f, 1.51f, 3.26f, 3.0f, 5.5f, 2.5f)
            arcToRelative(3.14f, 3.14f, 0.0f, false, false, 2.0f, -2.0f)
            curveToRelative(1.25f, -4.0f, -0.49f, -7.0f, -3.25f, -9.0f)
            curveToRelative(-1.76f, -0.75f, -4.0f, -1.76f, -6.25f, -1.0f)
            arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.25f, 4.0f)
        }
    }
        .build()
}
