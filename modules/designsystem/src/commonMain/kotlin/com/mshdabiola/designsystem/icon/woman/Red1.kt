package com.mshdabiola.ludo.screen.game.component.woman

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

fun Woman.getRed(iconColor: Long, accentColor: Long): ImageVector {
    return Builder(
        name = "Red1",
        defaultWidth = 200.0.dp,
        defaultHeight = 200.0.dp,
        viewportWidth = 200.0f,
        viewportHeight = 200.0f,
    ).apply {
        path(
            fill = SolidColor(Color(iconColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(31.19f, 55.05f)
            curveToRelative(-0.48f, -6.78f, -0.48f, -14.0f, 2.28f, -20.0f)
            curveToRelative(1.75f, -7.73f, 10.0f, -13.0f, 16.48f, -16.48f)
            curveToRelative(7.73f, -2.0f, 16.26f, -3.0f, 23.0f, -8.26f)
            curveTo(82.69f, 4.24f, 93.71f, 0.0f, 105.47f, 0.0f)
            curveToRelative(12.71f, 0.0f, 24.48f, 3.23f, 34.0f, 11.5f)
            arcToRelative(80.83f, 80.83f, 0.0f, false, true, 21.0f, 22.3f)
            curveToRelative(3.0f, 2.0f, 4.77f, 6.25f, 4.5f, 8.74f)
            curveToRelative(-1.48f, 9.0f, -5.72f, 15.53f, -7.2f, 20.77f)
            curveToRelative(-2.28f, 8.48f, 0.21f, 18.76f, 0.95f, 28.24f)
            curveToRelative(1.75f, 7.31f, 3.29f, 14.52f, 5.51f, 21.78f)
            curveToRelative(2.28f, 7.52f, 5.51f, 16.79f, 4.77f, 22.51f)
            curveToRelative(-1.75f, 11.29f, -6.0f, 21.3f, -7.0f, 32.8f)
            lineToRelative(-0.74f, 8.48f)
            curveToRelative(-2.0f, 4.76f, -7.26f, 8.0f, -11.29f, 11.28f)
            curveToRelative(-7.47f, 4.77f, -15.47f, 8.74f, -24.21f, 10.49f)
            curveToRelative(-12.77f, 2.81f, -26.28f, 0.0f, -37.51f, -5.24f)
            lineToRelative(-4.77f, -3.24f)
            curveToRelative(-5.72f, -3.76f, -9.0f, -10.27f, -14.46f, -13.77f)
            curveToRelative(-2.0f, -1.75f, -4.51f, -4.0f, -5.25f, -6.73f)
            lineToRelative(-1.0f, -5.51f)
            arcTo(70.8f, 70.8f, 0.0f, false, true, 54.0f, 137.86f)
            curveToRelative(-1.27f, -10.0f, -4.5f, -19.24f, -4.5f, -29.78f)
            curveToRelative(0.26f, -14.0f, -6.25f, -25.48f, -11.76f, -37.3f)
            lineToRelative(-2.0f, -6.25f)
            curveTo(32.46f, 61.0f, 31.45f, 58.07f, 31.19f, 55.05f)
            close()
            moveTo(33.94f, 44.77f)
            curveToRelative(0.27f, 1.27f, 1.54f, 0.26f, 2.28f, 0.53f)
            curveToRelative(-0.26f, 2.22f, -2.54f, 5.51f, -1.0f, 6.0f)
            curveToRelative(1.74f, 1.0f, 2.22f, -1.75f, 3.0f, -3.77f)
            curveToRelative(1.0f, 0.27f, 2.55f, 0.75f, 3.29f, -0.26f)
            curveToRelative(0.21f, -1.75f, -0.74f, -3.5f, -1.27f, -5.25f)
            curveToRelative(3.0f, 1.54f, 3.76f, 0.0f, 3.76f, 0.0f)
            arcToRelative(4.26f, 4.26f, 0.0f, false, false, -0.27f, -2.49f)
            arcTo(17.78f, 17.78f, 0.0f, false, true, 44.0f, 33.27f)
            curveToRelative(-3.23f, 2.49f, -6.73f, 3.5f, -8.27f, 6.78f)
            curveToRelative(0.27f, 0.48f, 0.75f, 0.0f, 1.0f, 0.48f)
            arcTo(16.6f, 16.6f, 0.0f, false, false, 33.94f, 44.77f)
            close()
            moveTo(34.94f, 34.77f)
            curveToRelative(0.53f, -0.27f, 1.75f, -1.0f, 2.28f, -1.27f)
            curveToRelative(6.46f, -3.0f, 13.0f, -7.79f, 20.72f, -6.0f)
            curveToRelative(6.25f, 1.53f, 13.77f, 3.28f, 20.5f, 1.27f)
            curveToRelative(-5.51f, -2.49f, -12.0f, -3.23f, -18.0f, -4.0f)
            curveToRelative(-4.0f, -0.47f, -8.48f, -0.95f, -12.72f, -0.21f)
            curveTo(47.72f, 24.53f, 36.22f, 28.5f, 35.0f, 34.81f)
            close()
            moveTo(39.71f, 60.25f)
            curveToRelative(-2.0f, 4.0f, -0.74f, 9.27f, 0.74f, 13.0f)
            curveToRelative(3.23f, 6.72f, 7.74f, 13.0f, 9.49f, 20.5f)
            curveToRelative(1.0f, 8.26f, 3.23f, 16.26f, 3.0f, 25.0f)
            curveToRelative(0.21f, 3.0f, 1.21f, 7.26f, 1.0f, 10.28f)
            horizontalLineToRelative(0.48f)
            curveToRelative(1.0f, -1.49f, 0.74f, -3.29f, 1.27f, -4.24f)
            curveToRelative(0.21f, -7.79f, 2.76f, -15.0f, 3.23f, -22.52f)
            arcToRelative(166.36f, 166.36f, 0.0f, false, false, -4.24f, 16.48f)
            curveToRelative(-0.26f, -2.0f, -1.53f, -4.51f, 0.0f, -6.52f)
            curveToRelative(-0.53f, -1.48f, -1.27f, -3.23f, -0.26f, -4.72f)
            curveToRelative(2.28f, -1.0f, 0.53f, -2.75f, 0.53f, -4.29f)
            curveToRelative(0.21f, -2.22f, 2.0f, -3.49f, 3.5f, -5.0f)
            lineToRelative(-0.53f, -3.0f)
            arcToRelative(9.0f, 9.0f, 0.0f, false, true, 2.75f, -3.76f)
            curveToRelative(-1.0f, -3.0f, 1.0f, -5.24f, 3.23f, -7.47f)
            curveToRelative(0.0f, 0.0f, 1.75f, -4.77f, 4.51f, -15.0f)
            arcToRelative(31.5f, 31.5f, 0.0f, false, true, -6.26f, 5.78f)
            curveToRelative(-3.0f, 3.0f, -5.24f, 7.26f, -7.47f, 11.0f)
            curveToRelative(-2.27f, -4.0f, -4.0f, -8.0f, -6.51f, -11.76f)
            curveToRelative(-2.76f, -4.51f, -7.26f, -8.27f, -8.0f, -13.51f)
            close()
            moveTo(43.71f, 50.5f)
            curveTo(42.0f, 53.3f, 43.0f, 59.29f, 44.0f, 61.3f)
            curveToRelative(0.0f, 0.0f, 3.5f, 6.52f, 11.0f, 19.76f)
            curveToRelative(3.0f, -5.24f, 7.73f, -11.23f, 11.23f, -16.53f)
            curveToRelative(3.76f, -5.72f, 5.72f, -15.0f, 2.23f, -23.26f)
            curveToRelative(0.26f, 3.76f, 0.26f, 5.78f, 0.26f, 5.78f)
            curveToRelative(-0.26f, 0.47f, -1.27f, 0.47f, -2.0f, 0.47f)
            curveToRelative(0.26f, 2.55f, 1.0f, 5.51f, 0.0f, 8.06f)
            curveToRelative(-0.21f, 0.47f, -1.22f, -0.27f, -1.75f, 0.0f)
            arcToRelative(24.27f, 24.27f, 0.0f, false, true, -0.48f, 6.0f)
            curveToRelative(-0.74f, 1.22f, -2.28f, 0.48f, -3.28f, 0.75f)
            curveToRelative(-0.21f, 1.48f, -1.0f, 2.75f, -1.22f, 4.0f)
            curveToRelative(-0.53f, 1.0f, -0.53f, 3.28f, -2.28f, 2.28f)
            curveToRelative(-1.22f, 1.75f, -2.0f, 4.0f, -3.71f, 5.77f)
            arcToRelative(1.18f, 1.18f, 0.0f, false, true, -1.27f, -0.26f)
            curveToRelative(-0.48f, -2.49f, -1.0f, -4.77f, -1.27f, -7.26f)
            curveToRelative(-0.48f, -0.27f, -1.22f, 0.26f, -2.0f, 0.0f)
            curveToRelative(-0.74f, -1.75f, -0.74f, -3.5f, -1.27f, -5.51f)
            arcToRelative(20.56f, 20.56f, 0.0f, false, false, -2.0f, -0.48f)
            curveToRelative(-1.0f, -2.0f, 0.0f, -4.0f, 0.0f, -6.25f)
            arcTo(11.12f, 11.12f, 0.0f, false, true, 43.69f, 50.54f)
            close()
            moveTo(46.71f, 49.23f)
            curveToRelative(-0.26f, 1.75f, 1.49f, 1.0f, 2.0f, 1.27f)
            curveToRelative(0.21f, 1.75f, -0.53f, 3.77f, -0.27f, 5.51f)
            curveToRelative(0.27f, 1.22f, 2.0f, -0.26f, 2.76f, 0.0f)
            curveToRelative(0.47f, 2.0f, -0.53f, 3.77f, -0.27f, 5.51f)
            curveToRelative(0.74f, 0.75f, 1.49f, -0.74f, 2.23f, -1.0f)
            curveToRelative(0.79f, 1.48f, 0.26f, 3.49f, 1.0f, 5.0f)
            curveToRelative(0.0f, 1.0f, 1.75f, 0.74f, 2.28f, 0.26f)
            lineToRelative(3.0f, -6.73f)
            curveToRelative(0.53f, -0.26f, 1.27f, 0.0f, 1.75f, -0.53f)
            lineTo(62.0f, 52.29f)
            curveToRelative(0.48f, -0.74f, 2.76f, 1.0f, 2.76f, -1.0f)
            curveToRelative(-0.27f, -2.23f, -0.53f, -4.77f, -1.0f, -7.0f)
            curveToRelative(0.21f, -0.74f, 1.48f, -0.26f, 1.48f, -1.0f)
            curveToRelative(0.27f, -2.49f, -1.48f, -7.26f, -5.0f, -12.24f)
            curveToRelative(-0.26f, 3.49f, 0.22f, 7.26f, 0.22f, 10.75f)
            reflectiveCurveToRelative(0.0f, 7.0f, -2.76f, 9.0f)
            curveToRelative(-1.75f, 1.22f, -4.71f, -1.0f, -4.24f, -3.0f)
            arcToRelative(112.8f, 112.8f, 0.0f, false, true, 4.0f, -16.27f)
            curveTo(57.2f, 29.0f, 55.0f, 31.79f, 55.0f, 31.79f)
            curveTo(47.19f, 46.78f, 46.71f, 49.27f, 46.71f, 49.27f)
            close()
            moveTo(56.94f, 140.31f)
            curveToRelative(0.0f, 0.53f, 0.53f, 0.26f, 0.74f, 0.26f)
            curveToRelative(2.76f, -4.0f, 2.54f, -9.48f, 4.0f, -14.51f)
            arcToRelative(15.35f, 15.35f, 0.0f, false, false, -2.49f, -13.52f)
            arcToRelative(1.18f, 1.18f, 0.0f, false, false, -1.27f, -0.26f)
            curveToRelative(0.74f, 2.54f, 2.49f, 4.5f, 2.75f, 6.78f)
            curveToRelative(0.0f, 1.75f, -1.75f, 1.0f, -2.75f, 1.0f)
            curveToRelative(0.74f, 2.22f, 2.27f, 4.24f, 2.27f, 6.73f)
            curveToRelative(-0.53f, 0.79f, -1.53f, 0.26f, -2.27f, 0.53f)
            curveToRelative(0.0f, 1.22f, 1.0f, 2.22f, 1.0f, 3.76f)
            curveToRelative(0.27f, 1.22f, -1.48f, 0.74f, -1.75f, 1.75f)
            curveTo(57.47f, 135.37f, 57.68f, 138.12f, 56.94f, 140.35f)
            close()
            moveTo(62.18f, 17.54f)
            reflectiveCurveToRelative(-5.0f, 1.22f, -7.0f, 3.0f)
            curveToRelative(3.0f, 0.0f, 10.0f, 1.54f, 15.0f, 3.29f)
            curveToRelative(0.53f, 0.0f, 1.54f, 0.21f, 1.75f, -0.53f)
            curveTo(65.2f, 20.29f, 62.18f, 17.54f, 62.18f, 17.54f)
            close()
            moveTo(62.0f, 138.12f)
            curveToRelative(-1.53f, 3.0f, -3.49f, 6.25f, -3.76f, 9.75f)
            arcToRelative(50.81f, 50.81f, 0.0f, false, false, 6.25f, 16.8f)
            arcToRelative(51.12f, 51.12f, 0.0f, false, false, 1.0f, -5.51f)
            lineToRelative(-2.0f, -1.28f)
            curveToRelative(-0.48f, -1.27f, 0.26f, -2.49f, 0.74f, -3.49f)
            lineToRelative(-2.0f, -2.0f)
            curveToRelative(-0.47f, -1.48f, 0.8f, -2.75f, 1.0f, -4.23f)
            curveToRelative(-2.0f, -1.54f, -0.74f, -4.0f, -0.48f, -6.0f)
            close()
            moveTo(63.0f, 127.37f)
            curveToRelative(-1.27f, 5.0f, 0.48f, 10.22f, 1.22f, 15.26f)
            reflectiveCurveToRelative(0.74f, 10.49f, 2.49f, 15.0f)
            lineToRelative(0.26f, 0.26f)
            curveToRelative(0.48f, -6.25f, 1.75f, -12.23f, 2.23f, -18.54f)
            curveToRelative(0.79f, -9.22f, -1.0f, -18.75f, -0.48f, -27.76f)
            curveToRelative(2.49f, -5.51f, 2.49f, -12.51f, 2.76f, -18.49f)
            arcToRelative(156.57f, 156.57f, 0.0f, false, true, 1.48f, -32.27f)
            arcToRelative(44.45f, 44.45f, 0.0f, false, false, -2.76f, 7.74f)
            curveToRelative(-1.74f, 10.0f, -5.45f, 19.49f, -5.0f, 30.0f)
            arcTo(45.68f, 45.68f, 0.0f, false, true, 63.0f, 127.37f)
            close()
            moveTo(63.0f, 95.84f)
            reflectiveCurveToRelative(-4.29f, 15.47f, 1.0f, 21.0f)
            curveToRelative(1.54f, -7.0f, 0.53f, -14.25f, -0.74f, -21.0f)
            close()
            moveTo(66.23f, 163.39f)
            curveToRelative(-0.53f, 2.0f, -2.0f, 5.0f, -1.0f, 6.52f)
            curveToRelative(3.24f, 5.46f, 9.28f, 8.48f, 14.73f, 11.5f)
            curveToRelative(5.0f, 2.75f, 9.54f, 6.51f, 14.52f, 9.27f)
            curveToRelative(5.72f, 0.74f, 11.23f, 2.22f, 17.48f, 2.22f)
            horizontalLineToRelative(4.24f)
            curveToRelative(8.0f, 1.0f, 15.0f, -0.74f, 22.52f, -1.27f)
            curveToRelative(5.51f, -0.47f, 9.48f, -4.71f, 14.25f, -7.2f)
            lineToRelative(0.27f, -0.27f)
            curveToRelative(-3.77f, 0.0f, -7.26f, 1.27f, -10.55f, 2.23f)
            curveToRelative(-3.0f, 0.79f, -5.45f, 2.28f, -8.47f, 2.54f)
            curveToRelative(-8.75f, 0.74f, -17.22f, 0.95f, -25.49f, -1.27f)
            arcToRelative(280.83f, 280.83f, 0.0f, false, true, -28.77f, -10.0f)
            curveToRelative(-5.0f, -3.24f, -12.5f, -6.26f, -13.0f, -13.0f)
            curveTo(66.69f, 164.14f, 66.69f, 162.65f, 66.21f, 163.39f)
            close()
            moveTo(68.46f, 160.39f)
            curveToRelative(0.0f, 3.29f, -0.75f, 6.0f, 1.53f, 8.75f)
            arcToRelative(21.93f, 21.93f, 0.0f, false, false, 8.48f, 4.55f)
            lineToRelative(0.26f, -0.79f)
            curveToRelative(-4.0f, -6.73f, -5.77f, -13.72f, -9.0f, -21.51f)
            close()
            moveTo(82.69f, 30.52f)
            curveToRelative(-6.25f, 8.26f, -12.0f, 19.0f, -11.76f, 28.55f)
            curveToRelative(10.54f, -20.0f, 19.0f, -27.55f, 19.0f, -27.55f)
            arcTo(22.26f, 22.26f, 0.0f, false, false, 82.69f, 30.52f)
            close()
            moveTo(67.0f, 15.0f)
            arcToRelative(24.93f, 24.93f, 0.0f, false, false, 6.73f, 1.0f)
            curveToRelative(3.0f, -1.0f, 6.52f, -0.74f, 9.0f, -3.0f)
            curveTo(83.0f, 11.5f, 85.0f, 12.24f, 86.0f, 11.76f)
            reflectiveCurveToRelative(1.0f, -1.27f, 1.0f, -2.28f)
            lineToRelative(4.5f, -2.22f)
            curveToRelative(1.27f, -0.74f, 3.28f, -2.0f, 3.28f, -3.5f)
            curveTo(90.0f, 5.25f, 84.7f, 6.0f, 80.46f, 8.74f)
            arcToRelative(10.77f, 10.77f, 0.0f, false, true, -1.0f, 2.28f)
            curveTo(76.22f, 14.25f, 70.93f, 13.51f, 67.0f, 15.0f)
            close()
            moveTo(83.22f, 45.0f)
            arcTo(41.87f, 41.87f, 0.0f, false, false, 72.94f, 73.54f)
            horizontalLineToRelative(0.53f)
            curveToRelative(0.48f, -4.0f, 1.75f, -7.47f, 2.22f, -11.23f)
            curveToRelative(0.27f, -1.0f, 0.0f, -3.0f, 1.75f, -2.76f)
            arcToRelative(9.61f, 9.61f, 0.0f, false, true, 1.75f, -3.5f)
            arcToRelative(3.74f, 3.74f, 0.0f, false, true, 1.48f, 0.48f)
            curveToRelative(3.0f, -2.22f, 1.75f, -6.25f, 4.0f, -8.74f)
            lineToRelative(1.75f, 0.48f)
            curveToRelative(0.74f, -1.49f, 0.74f, -3.5f, 1.75f, -4.72f)
            lineToRelative(0.74f, 0.48f)
            reflectiveCurveToRelative(2.49f, 1.48f, 5.0f, -4.72f)
            lineToRelative(1.75f, 1.49f)
            curveToRelative(1.75f, -0.75f, 3.71f, -0.75f, 5.25f, -1.75f)
            curveToRelative(-2.55f, -1.27f, -4.51f, -2.76f, -7.0f, -3.76f)
            curveTo(89.2f, 37.0f, 86.18f, 41.27f, 83.22f, 45.0f)
            close()
            moveTo(70.71f, 31.52f)
            curveToRelative(0.48f, 3.29f, 1.22f, 6.79f, 3.24f, 9.28f)
            curveToRelative(5.51f, -9.54f, 5.0f, -10.0f, 5.0f, -10.0f)
            curveTo(76.22f, 31.26f, 73.68f, 31.26f, 70.71f, 31.52f)
            close()
            moveTo(74.48f, 75.29f)
            curveToRelative(-0.27f, 2.0f, -1.0f, 3.76f, -0.53f, 5.77f)
            arcToRelative(55.37f, 55.37f, 0.0f, false, false, 2.27f, -6.52f)
            curveToRelative(1.22f, -2.75f, 2.23f, -5.24f, 3.5f, -7.73f)
            curveToRelative(3.71f, -7.0f, 10.0f, -14.0f, 17.22f, -16.53f)
            curveToRelative(3.76f, -2.23f, 8.0f, -2.49f, 12.0f, -3.23f)
            verticalLineToRelative(-0.53f)
            arcToRelative(57.83f, 57.83f, 0.0f, false, false, -7.26f, -5.25f)
            curveTo(96.67f, 44.0f, 91.22f, 46.52f, 87.19f, 51.0f)
            curveTo(80.94f, 58.28f, 76.0f, 66.07f, 74.48f, 75.29f)
            close()
            moveTo(76.0f, 18.54f)
            reflectiveCurveToRelative(-2.76f, 0.0f, -8.0f, -0.53f)
            curveToRelative(4.71f, 2.76f, 12.24f, 3.77f, 17.75f, 1.28f)
            arcToRelative(84.6f, 84.6f, 0.0f, false, false, 15.73f, -9.81f)
            curveToRelative(2.23f, -2.0f, 5.0f, -3.0f, 6.25f, -5.72f)
            arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.74f, -1.0f)
            arcToRelative(28.48f, 28.48f, 0.0f, false, false, -7.52f, 3.76f)
            curveToRelative(-0.74f, 2.22f, -3.23f, 2.22f, -5.0f, 2.49f)
            lineToRelative(-3.76f, 1.48f)
            curveToRelative(-0.27f, 1.0f, 0.26f, 2.0f, -0.27f, 2.76f)
            curveToRelative(-2.22f, 0.53f, -4.45f, 0.53f, -6.25f, 1.53f)
            curveToRelative(-0.74f, 0.21f, -0.21f, 1.22f, -0.74f, 1.75f)
            lineTo(77.18f, 17.0f)
            close()
            moveTo(77.0f, 25.0f)
            lineTo(76.7f, 25.0f)
            curveToRelative(0.74f, 1.48f, 2.49f, 1.48f, 3.5f, 2.0f)
            lineTo(99.0f, 33.27f)
            curveToRelative(3.76f, 1.27f, 7.0f, 3.5f, 10.23f, 5.78f)
            curveTo(115.0f, 43.0f, 118.71f, 49.27f, 123.0f, 54.57f)
            curveToRelative(4.0f, 4.5f, 6.0f, 10.0f, 8.22f, 15.47f)
            lineToRelative(1.74f, 8.27f)
            curveToRelative(3.29f, 8.0f, 7.26f, 15.25f, 10.55f, 23.25f)
            curveToRelative(1.0f, 2.76f, 1.22f, 6.0f, 2.49f, 8.53f)
            curveToRelative(5.24f, 7.26f, 9.22f, 15.26f, 10.22f, 24.0f)
            curveToRelative(1.54f, 9.8f, 1.75f, 19.55f, 5.25f, 28.29f)
            curveToRelative(0.53f, 0.0f, 0.53f, -1.0f, 0.53f, -1.49f)
            lineToRelative(-1.75f, -13.0f)
            curveToRelative(-0.27f, -11.0f, -1.27f, -21.77f, -5.0f, -31.26f)
            curveToRelative(-1.49f, -5.51f, -5.46f, -9.75f, -8.22f, -14.78f)
            curveToRelative(-7.52f, -14.25f, -10.75f, -30.52f, -18.0f, -45.0f)
            curveToRelative(-3.5f, -7.26f, -14.25f, -17.75f, -20.0f, -21.0f)
            curveTo(99.22f, 29.78f, 88.94f, 25.27f, 77.0f, 25.0f)
            close()
            moveTo(79.0f, 124.87f)
            arcToRelative(10.66f, 10.66f, 0.0f, false, false, 3.28f, 8.74f)
            curveToRelative(0.21f, 0.48f, -0.26f, 2.22f, -0.74f, 3.23f)
            arcToRelative(8.52f, 8.52f, 0.0f, false, false, 2.7f, 0.74f)
            curveToRelative(1.0f, -1.75f, 3.0f, -3.0f, 4.0f, -4.24f)
            curveToRelative(-1.0f, -0.47f, -2.49f, -1.0f, -3.5f, -1.48f)
            curveToRelative(4.24f, -1.54f, 6.73f, 4.0f, 11.0f, 4.77f)
            arcToRelative(11.43f, 11.43f, 0.0f, false, false, 11.5f, -2.81f)
            curveToRelative(-3.55f, 2.54f, -12.29f, 3.76f, -16.27f, -2.49f)
            curveToRelative(1.49f, -1.48f, 3.0f, -3.0f, 5.0f, -3.5f)
            arcToRelative(15.0f, 15.0f, 0.0f, false, true, 12.51f, 2.76f)
            lineToRelative(-0.75f, -5.25f)
            arcToRelative(8.35f, 8.35f, 0.0f, false, true, 1.75f, 5.51f)
            curveToRelative(0.48f, 2.76f, -2.0f, 5.0f, -4.0f, 6.26f)
            curveToRelative(-5.3f, 2.0f, -11.29f, 0.47f, -15.79f, -2.0f)
            lineToRelative(-1.22f, 1.0f)
            curveToRelative(-0.74f, 0.74f, -1.75f, 1.27f, -2.0f, 2.28f)
            curveToRelative(4.0f, 4.0f, 10.0f, 4.0f, 15.0f, 3.0f)
            curveToRelative(4.24f, -0.47f, 7.53f, -3.49f, 11.0f, -5.51f)
            arcToRelative(3.24f, 3.24f, 0.0f, false, true, -0.26f, 3.5f)
            curveToRelative(-4.77f, 4.56f, -11.0f, 7.26f, -17.49f, 5.51f)
            arcToRelative(31.81f, 31.81f, 0.0f, false, true, -13.24f, -7.26f)
            arcToRelative(8.77f, 8.77f, 0.0f, false, false, 1.22f, 3.55f)
            curveToRelative(0.0f, 1.75f, 1.27f, 2.76f, 2.0f, 4.0f)
            curveToRelative(5.72f, 5.0f, 11.5f, 9.74f, 18.0f, 13.0f)
            curveToRelative(8.22f, 4.24f, 19.0f, 6.73f, 23.0f, 16.48f)
            curveToRelative(1.0f, 4.5f, -1.0f, 8.79f, -1.75f, 13.0f)
            horizontalLineToRelative(0.74f)
            arcToRelative(16.83f, 16.83f, 0.0f, false, false, 1.75f, -3.5f)
            curveToRelative(1.75f, -3.49f, 1.0f, -7.52f, 0.26f, -11.0f)
            curveToRelative(2.23f, -6.51f, 9.0f, -10.22f, 14.0f, -15.0f)
            curveToRelative(3.76f, -4.29f, 3.5f, -10.0f, 5.51f, -15.05f)
            arcToRelative(21.06f, 21.06f, 0.0f, false, false, 2.49f, -11.23f)
            curveToRelative(-0.26f, -6.25f, -3.28f, -11.0f, -5.24f, -16.27f)
            curveToRelative(-1.75f, -5.0f, -1.54f, -10.75f, -3.29f, -15.78f)
            curveToRelative(-3.0f, -4.72f, -4.5f, -10.23f, -8.74f, -14.26f)
            curveToRelative(-0.74f, -1.21f, -1.75f, -3.0f, -3.23f, -3.0f)
            curveToRelative(0.0f, 0.47f, -0.27f, 1.0f, 0.0f, 1.48f)
            curveToRelative(0.74f, 3.0f, -2.0f, 4.72f, -3.23f, 7.0f)
            lineToRelative(1.0f, 1.0f)
            curveToRelative(0.53f, 2.76f, 4.29f, 3.23f, 5.0f, 6.0f)
            curveToRelative(-2.27f, 1.53f, -5.0f, 2.54f, -7.26f, 4.0f)
            curveToRelative(-1.27f, 0.0f, -2.0f, -1.0f, -3.0f, -1.27f)
            arcToRelative(5.31f, 5.31f, 0.0f, false, false, -4.24f, 0.53f)
            curveToRelative(-2.49f, 2.49f, -4.0f, -2.0f, -6.26f, -2.49f)
            arcToRelative(49.32f, 49.32f, 0.0f, false, true, -4.71f, -2.54f)
            curveToRelative(1.0f, -1.0f, 2.49f, -1.48f, 3.5f, -2.23f)
            curveToRelative(1.0f, -1.74f, 2.7f, -2.54f, 4.23f, -3.55f)
            curveToRelative(-0.74f, -1.48f, -3.0f, -2.22f, -2.75f, -4.0f)
            arcToRelative(21.87f, 21.87f, 0.0f, false, false, 4.24f, 2.49f)
            lineToRelative(4.5f, 0.27f)
            curveToRelative(2.49f, -0.27f, 5.51f, 1.0f, 7.0f, -2.0f)
            arcToRelative(7.2f, 7.2f, 0.0f, false, false, 0.26f, -6.0f)
            arcToRelative(11.66f, 11.66f, 0.0f, false, false, -6.0f, -3.0f)
            curveToRelative(-7.52f, -1.49f, -12.77f, -0.22f, -19.0f, 4.76f)
            curveToRelative(0.27f, -1.74f, -0.47f, -1.48f, -1.27f, -1.0f)
            curveTo(95.46f, 85.83f, 91.0f, 90.54f, 86.45f, 94.31f)
            curveToRelative(-4.5f, 4.29f, -4.77f, 10.27f, -6.25f, 15.78f)
            horizontalLineToRelative(0.26f)
            curveToRelative(2.0f, -1.74f, 3.23f, -4.23f, 5.51f, -6.0f)
            curveTo(85.0f, 111.31f, 80.2f, 117.35f, 78.93f, 124.88f)
            close()
            moveTo(81.75f, 96.31f)
            lineTo(82.02f, 96.57f)
            arcToRelative(74.11f, 74.11f, 0.0f, false, false, 7.52f, -7.25f)
            curveToRelative(6.73f, -6.73f, 14.0f, -12.77f, 23.47f, -13.78f)
            curveToRelative(6.52f, -0.74f, 11.76f, 2.0f, 16.74f, 5.78f)
            curveToRelative(0.27f, -0.75f, -0.47f, -1.49f, -0.74f, -2.28f)
            curveToRelative(-4.24f, -6.0f, -11.0f, -9.22f, -17.75f, -10.76f)
            arcToRelative(0.71f, 0.71f, 0.0f, false, true, -0.48f, -1.0f)
            curveToRelative(6.73f, 1.53f, 13.0f, 4.29f, 18.0f, 9.53f)
            lineToRelative(0.74f, 0.48f)
            curveToRelative(-3.5f, -8.48f, -3.5f, -20.24f, -13.25f, -25.0f)
            curveTo(107.43f, 49.8f, 98.42f, 49.06f, 91.69f, 54.0f)
            arcToRelative(19.36f, 19.36f, 0.0f, false, true, 3.77f, 5.25f)
            lineToRelative(5.72f, -0.75f)
            reflectiveCurveToRelative(11.49f, -0.47f, 13.24f, 1.28f)
            arcToRelative(112.53f, 112.53f, 0.0f, false, false, -18.7f, 1.48f)
            arcToRelative(7.0f, 7.0f, 0.0f, false, true, -1.0f, 4.5f)
            curveToRelative(-1.53f, -1.0f, -3.0f, -2.0f, -5.0f, -1.27f)
            reflectiveCurveToRelative(-4.0f, 2.76f, -3.71f, 5.3f)
            arcToRelative(63.0f, 63.0f, 0.0f, false, true, 0.74f, 11.76f)
            curveTo(86.45f, 87.05f, 85.18f, 91.07f, 81.68f, 96.32f)
            close()
            moveTo(85.25f, 188.66f)
            verticalLineToRelative(0.47f)
            curveToRelative(8.0f, 6.52f, 20.0f, 9.27f, 29.51f, 9.54f)
            arcToRelative(45.85f, 45.85f, 0.0f, false, false, 16.0f, -2.76f)
            arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.5f, -1.0f)
            curveToRelative(-2.49f, 0.74f, -5.24f, 1.48f, -7.26f, -0.27f)
            curveToRelative(-1.48f, -1.0f, -2.75f, 0.74f, -3.76f, 1.27f)
            curveToRelative(-2.49f, 1.0f, -4.5f, -0.26f, -6.46f, -1.27f)
            curveToRelative(-1.27f, 0.27f, -2.28f, 0.74f, -3.76f, 1.0f)
            lineToRelative(-2.76f, -1.75f)
            curveToRelative(-2.75f, 0.0f, -6.0f, 0.74f, -8.26f, -1.27f)
            arcTo(22.1f, 22.1f, 0.0f, false, true, 85.18f, 188.67f)
            close()
            moveTo(94.93f, 23.0f)
            curveToRelative(-1.0f, 1.28f, -3.0f, 1.0f, -4.51f, 0.8f)
            curveToRelative(1.0f, -1.0f, 2.55f, -1.54f, 3.55f, -2.28f)
            curveToRelative(4.24f, -2.49f, 8.0f, -7.52f, 11.0f, -9.75f)
            arcToRelative(5.61f, 5.61f, 0.0f, false, false, -1.75f, 0.27f)
            curveToRelative(-7.47f, 4.5f, -13.51f, 10.22f, -23.47f, 11.0f)
            arcToRelative(48.61f, 48.61f, 0.0f, false, true, 22.2f, 6.31f)
            curveToRelative(2.28f, 1.75f, 5.0f, 3.0f, 7.0f, 4.71f)
            arcToRelative(141.34f, 141.34f, 0.0f, false, true, 18.22f, 16.53f)
            curveToRelative(5.0f, -13.0f, 5.0f, -22.51f, 5.0f, -22.51f)
            curveToRelative(-0.21f, -2.76f, -2.49f, -5.0f, -4.5f, -7.26f)
            curveToRelative(-0.48f, -0.27f, -0.74f, 0.26f, -0.74f, 0.48f)
            arcTo(12.89f, 12.89f, 0.0f, false, true, 129.68f, 27.0f)
            curveToRelative(0.53f, 6.78f, -1.0f, 13.51f, -2.75f, 19.5f)
            arcToRelative(4.43f, 4.43f, 0.0f, false, true, -1.75f, -2.0f)
            curveToRelative(-0.74f, -1.75f, 2.0f, -2.0f, 1.0f, -3.5f)
            curveToRelative(-1.49f, -2.28f, 2.75f, -3.0f, 1.0f, -5.0f)
            curveToRelative(-0.48f, -1.49f, 0.48f, -2.49f, 1.27f, -3.5f)
            curveToRelative(-0.79f, -1.48f, -1.53f, -3.76f, -0.53f, -5.24f)
            curveToRelative(0.0f, -2.0f, -1.22f, -3.77f, -2.22f, -5.51f)
            horizontalLineToRelative(-0.27f)
            arcTo(11.36f, 11.36f, 0.0f, false, true, 124.17f, 26.0f)
            curveToRelative(0.27f, 1.28f, 1.0f, 2.49f, 1.0f, 3.77f)
            arcTo(3.22f, 3.22f, 0.0f, false, true, 123.0f, 32.53f)
            arcToRelative(8.59f, 8.59f, 0.0f, false, true, -0.26f, 5.0f)
            curveToRelative(-0.74f, 1.49f, -2.23f, 1.75f, -3.76f, 2.0f)
            curveToRelative(-3.0f, -0.47f, -4.51f, -3.49f, -5.25f, -6.0f)
            horizontalLineToRelative(-3.0f)
            curveToRelative(-1.74f, -1.27f, -1.27f, -3.29f, -1.74f, -5.0f)
            curveToRelative(-1.54f, -0.21f, -4.0f, 0.53f, -5.0f, -1.0f)
            curveToRelative(-0.47f, -0.74f, 0.0f, -1.75f, 0.0f, -2.49f)
            curveToRelative(1.27f, -3.0f, 6.25f, -4.72f, 5.51f, -8.74f)
            curveToRelative(-0.26f, -1.28f, 0.0f, -2.76f, -0.74f, -3.5f)
            arcToRelative(4.21f, 4.21f, 0.0f, false, false, -0.48f, 1.75f)
            curveToRelative(-0.26f, 1.48f, -2.0f, 1.27f, -2.75f, 1.48f)
            arcToRelative(10.08f, 10.08f, 0.0f, false, true, -1.0f, 2.76f)
            curveToRelative(-1.0f, 1.0f, -2.75f, 0.53f, -4.0f, 0.74f)
            lineToRelative(-1.22f, 1.75f)
            curveToRelative(-1.0f, 0.53f, -2.0f, 0.0f, -3.0f, 0.26f)
            close()
            moveTo(92.7f, 131.34f)
            lineTo(94.0f, 132.88f)
            curveToRelative(0.74f, 0.21f, 1.49f, 1.22f, 2.0f, 0.74f)
            curveToRelative(-0.47f, -2.28f, 1.27f, -3.5f, 2.28f, -5.25f)
            curveTo(96.2f, 128.85f, 93.44f, 129.12f, 92.7f, 131.34f)
            close()
            moveTo(101.7f, 128.34f)
            curveToRelative(1.0f, 1.22f, 3.0f, 3.24f, 2.75f, 5.73f)
            curveToRelative(1.22f, -0.75f, 3.5f, -1.75f, 2.49f, -3.24f)
            curveTo(106.21f, 129.86f, 103.19f, 128.59f, 101.71f, 128.37f)
            close()
            moveTo(112.46f, 21.0f)
            curveToRelative(-1.53f, 1.49f, -4.24f, 3.0f, -3.76f, 5.0f)
            curveToRelative(0.0f, 1.0f, 2.49f, -0.26f, 3.76f, 0.27f)
            curveToRelative(0.0f, 1.22f, -1.0f, 2.75f, -0.26f, 4.24f)
            curveToRelative(1.27f, 0.26f, 1.75f, -0.74f, 2.49f, -1.22f)
            curveToRelative(0.74f, 1.22f, 1.0f, 2.75f, 2.49f, 3.71f)
            curveToRelative(0.74f, 0.53f, 1.75f, 1.0f, 2.49f, 0.0f)
            curveToRelative(0.26f, -1.75f, -1.0f, -3.23f, -1.0f, -5.0f)
            curveToRelative(1.22f, 0.0f, 2.23f, 0.74f, 3.5f, 0.26f)
            curveToRelative(1.22f, -2.0f, -1.0f, -3.55f, -2.0f, -4.77f)
            lineToRelative(0.48f, -0.53f)
            curveToRelative(0.79f, -0.47f, 1.53f, -1.21f, 1.0f, -2.22f)
            curveToRelative(-1.48f, -1.27f, -3.5f, -1.48f, -5.0f, -2.49f)
            arcTo(14.72f, 14.72f, 0.0f, false, false, 110.93f, 10.0f)
            curveToRelative(-0.48f, 0.27f, -0.75f, 0.48f, -0.75f, 0.75f)
            curveTo(111.19f, 14.0f, 112.67f, 17.27f, 112.46f, 21.0f)
            close()
            moveTo(128.2f, 7.26f)
            curveTo(123.0f, 4.5f, 117.18f, 2.49f, 110.93f, 3.0f)
            arcToRelative(3.81f, 3.81f, 0.0f, false, false, 1.53f, 2.23f)
            curveTo(112.94f, 4.0f, 117.0f, 3.76f, 117.0f, 3.76f)
            curveToRelative(0.74f, 0.21f, 0.74f, 1.22f, 1.0f, 1.75f)
            arcToRelative(31.81f, 31.81f, 0.0f, false, true, 4.29f, 1.0f)
            curveToRelative(0.0f, 1.0f, -1.27f, 1.75f, -1.53f, 2.49f)
            arcTo(34.6f, 34.6f, 0.0f, false, false, 124.0f, 11.5f)
            curveToRelative(1.75f, 0.0f, 3.71f, -0.48f, 5.72f, -0.48f)
            curveToRelative(1.75f, 0.26f, -0.47f, 1.22f, 0.0f, 2.23f)
            arcToRelative(12.26f, 12.26f, 0.0f, false, true, 5.0f, 1.53f)
            curveToRelative(0.0f, 0.48f, -0.8f, 1.0f, -1.0f, 1.49f)
            curveToRelative(0.74f, 1.0f, 2.22f, 1.48f, 2.22f, 2.75f)
            curveToRelative(-0.47f, 2.23f, 2.0f, 3.23f, 2.76f, 4.77f)
            arcToRelative(45.09f, 45.09f, 0.0f, false, true, 5.24f, 0.95f)
            curveToRelative(1.28f, 0.53f, -0.26f, 1.54f, 0.0f, 2.28f)
            curveToRelative(1.75f, 1.0f, 3.77f, 1.27f, 5.25f, 2.28f)
            arcToRelative(2.52f, 2.52f, 0.0f, false, true, -1.0f, 1.75f)
            curveToRelative(-0.47f, 2.0f, 3.29f, 2.49f, 1.54f, 4.71f)
            curveToRelative(0.95f, 1.54f, 1.75f, 3.29f, 3.5f, 4.0f)
            curveToRelative(1.0f, 0.74f, 2.75f, 1.27f, 2.75f, 2.75f)
            curveToRelative(-0.79f, 1.49f, 2.0f, 2.23f, 1.75f, 3.77f)
            curveToRelative(-1.27f, 3.0f, 0.0f, 6.0f, -0.27f, 9.48f)
            curveToRelative(7.47f, -9.0f, 4.72f, -17.75f, 4.72f, -17.75f)
            curveToRelative(-1.48f, -0.48f, -3.23f, -0.74f, -4.45f, -1.75f)
            arcToRelative(5.16f, 5.16f, 0.0f, false, true, -0.8f, -3.76f)
            curveToRelative(-0.95f, -0.74f, -2.22f, -0.74f, -3.0f, -1.75f)
            curveToRelative(-0.74f, -0.74f, -0.74f, -1.75f, -0.74f, -3.0f)
            curveToRelative(-1.54f, -0.74f, -3.0f, -1.27f, -4.0f, -2.75f)
            arcToRelative(12.0f, 12.0f, 0.0f, false, true, -0.27f, -2.0f)
            curveToRelative(-0.47f, -0.47f, -1.21f, -0.21f, -2.0f, -0.47f)
            curveToRelative(-2.0f, -0.48f, -1.53f, -2.76f, -2.0f, -4.24f)
            lineTo(143.19f, 18.0f)
            curveToRelative(-3.0f, 0.0f, -1.75f, -3.23f, -4.24f, -3.0f)
            curveToRelative(-2.27f, 0.27f, -3.49f, -2.49f, -4.5f, -4.23f)
            curveTo(131.7f, 11.28f, 129.68f, 9.27f, 128.2f, 7.26f)
            close()
            moveTo(113.2f, 7.74f)
            curveToRelative(-1.27f, 0.74f, 0.27f, 1.53f, 0.27f, 1.53f)
            curveToRelative(9.0f, 4.24f, 16.48f, 11.23f, 24.74f, 17.75f)
            curveToRelative(2.49f, 1.75f, 4.45f, 4.24f, 7.21f, 5.51f)
            curveToRelative(-5.46f, -7.26f, -15.0f, -14.78f, -15.0f, -14.78f)
            curveTo(125.0f, 13.78f, 119.67f, 9.75f, 113.2f, 7.74f)
            close()
            moveTo(131.43f, 50.54f)
            curveToRelative(-1.22f, 6.73f, 2.76f, 11.77f, 6.25f, 16.53f)
            curveToRelative(3.5f, 4.0f, 8.53f, 5.0f, 13.0f, 6.73f)
            curveToRelative(0.27f, 0.0f, 0.53f, -0.26f, 0.53f, -0.74f)
            arcToRelative(55.32f, 55.32f, 0.0f, false, true, -8.74f, -4.77f)
            curveToRelative(0.21f, -0.74f, 1.0f, -1.0f, 0.48f, -1.75f)
            curveToRelative(-2.0f, -1.74f, -7.74f, -4.23f, -5.72f, -7.0f)
            curveToRelative(-0.75f, -1.48f, -2.28f, -2.75f, -2.49f, -4.5f)
            curveToRelative(0.0f, -1.0f, 0.95f, -1.49f, 1.74f, -2.0f)
            curveToRelative(-0.26f, -1.21f, -1.0f, -2.0f, -1.0f, -3.23f)
            arcToRelative(5.28f, 5.28f, 0.0f, false, true, 2.0f, -2.75f)
            curveToRelative(-0.21f, -3.0f, 2.54f, -4.77f, 2.75f, -7.74f)
            curveToRelative(0.27f, -3.76f, -2.75f, -7.26f, -4.71f, -9.8f)
            lineToRelative(-0.27f, 2.28f)
            curveTo(135.67f, 37.56f, 132.7f, 44.0f, 131.43f, 50.54f)
            close()
            moveTo(140.7f, 75.54f)
            curveToRelative(-1.27f, -1.0f, -1.75f, -0.26f, -2.0f, 0.27f)
            curveToRelative(0.0f, 4.0f, 5.24f, 5.77f, 5.0f, 10.0f)
            curveToRelative(-0.21f, 1.0f, -1.22f, 0.74f, -2.0f, 0.74f)
            curveToRelative(1.75f, 6.25f, 6.73f, 16.27f, 7.47f, 15.79f)
            curveToRelative(2.0f, -1.0f, 0.26f, -5.0f, -0.48f, -6.78f)
            curveToRelative(2.0f, -0.48f, 1.75f, -1.49f, 1.75f, -1.49f)
            lineToRelative(-3.28f, -3.55f)
            curveToRelative(0.0f, -0.74f, 1.74f, -0.47f, 1.74f, -1.0f)
            curveToRelative(-0.21f, -1.75f, -1.74f, -3.28f, -2.49f, -5.0f)
            curveToRelative(0.53f, -0.74f, 1.54f, -1.22f, 1.75f, -2.0f)
            curveTo(146.21f, 79.58f, 143.46f, 77.56f, 140.7f, 75.55f)
            close()
            moveTo(140.17f, 57.05f)
            arcToRelative(0.69f, 0.69f, 0.0f, false, false, -0.21f, 1.22f)
            lineToRelative(3.23f, 3.55f)
            curveToRelative(-1.0f, 0.21f, -2.28f, 0.21f, -1.75f, 1.0f)
            curveToRelative(2.76f, 2.76f, 6.0f, 4.29f, 8.75f, 6.78f)
            curveToRelative(1.27f, -3.28f, -2.0f, -6.25f, -3.24f, -8.74f)
            curveToRelative(-2.49f, -4.0f, -2.27f, -6.51f, 0.0f, -6.51f)
            curveToRelative(0.0f, 0.0f, -1.0f, -4.0f, -3.0f, -11.77f)
            curveToRelative(-1.27f, 2.76f, -2.75f, 6.0f, -1.48f, 9.28f)
            curveToRelative(0.48f, 1.0f, -1.27f, 0.74f, -1.27f, 2.0f)
            curveToRelative(-0.48f, 1.0f, 0.53f, 2.0f, 0.74f, 3.0f)
            close()
            moveTo(140.7f, 184.89f)
            arcToRelative(0.52f, 0.52f, 0.0f, false, false, 0.48f, 0.53f)
            arcToRelative(56.54f, 56.54f, 0.0f, false, false, 16.26f, -23.78f)
            curveToRelative(0.27f, -1.28f, 0.75f, -2.76f, 0.27f, -4.0f)
            curveToRelative(-0.27f, 0.0f, -0.27f, 0.26f, -0.53f, 0.53f)
            arcToRelative(60.0f, 60.0f, 0.0f, false, true, -6.0f, 13.0f)
            arcTo(141.0f, 141.0f, 0.0f, false, true, 140.7f, 184.9f)
            close()
            moveTo(144.7f, 34.53f)
            arcTo(26.89f, 26.89f, 0.0f, false, false, 139.0f, 28.29f)
            curveToRelative(3.71f, 6.25f, 7.47f, 12.51f, 10.0f, 19.23f)
            curveToRelative(3.29f, 8.53f, 2.0f, 18.76f, 5.3f, 27.29f)
            curveToRelative(0.21f, 0.26f, 0.21f, 1.0f, 0.74f, 0.74f)
            curveToRelative(-0.74f, -8.48f, -1.0f, -17.48f, -2.27f, -23.0f)
            curveTo(151.46f, 45.51f, 148.17f, 40.05f, 144.68f, 34.54f)
            close()
            moveTo(155.45f, 85.53f)
            curveToRelative(-1.48f, -9.48f, -9.48f, -11.49f, -14.52f, -12.0f)
            curveToRelative(3.0f, 3.0f, 7.79f, 3.76f, 9.75f, 7.79f)
            curveToRelative(0.8f, 1.0f, -0.21f, 2.22f, -0.47f, 3.0f)
            lineToRelative(1.27f, 3.7f)
            curveToRelative(0.0f, 0.53f, 0.47f, 1.75f, -0.27f, 2.0f)
            curveToRelative(-1.48f, 1.0f, 0.27f, 2.28f, 0.74f, 3.49f)
            curveToRelative(0.75f, 1.0f, -0.47f, 2.0f, -0.47f, 3.0f)
            curveToRelative(1.22f, 2.49f, 1.22f, 3.5f, 0.47f, 8.27f)
            curveToRelative(2.0f, -1.75f, 2.0f, -4.77f, 2.76f, -7.26f)
            curveTo(154.69f, 93.56f, 156.17f, 89.59f, 155.43f, 85.56f)
            close()
            moveTo(157.2f, 91.31f)
            curveToRelative(0.53f, 5.51f, -3.0f, 10.49f, 0.0f, 15.52f)
            curveToRelative(3.5f, 6.0f, 5.77f, 12.51f, 9.0f, 18.49f)
            horizontalLineToRelative(0.26f)
            curveToRelative(-2.49f, -7.52f, -4.77f, -15.26f, -6.52f, -23.0f)
            curveTo(159.19f, 98.6f, 158.66f, 94.57f, 157.18f, 91.34f)
            close()
            moveTo(158.68f, 165.38f)
            curveToRelative(-2.22f, 6.0f, -5.45f, 12.5f, -10.22f, 17.75f)
            curveToRelative(6.51f, -2.76f, 11.0f, -5.0f, 11.0f, -5.0f)
            lineToRelative(0.47f, -5.0f)
            curveToRelative(0.48f, -2.0f, 0.75f, -5.77f, -0.26f, -8.26f)
            arcTo(1.0f, 1.0f, 0.0f, false, false, 158.66f, 165.41f)
            close()
            moveTo(158.68f, 120.38f)
            curveToRelative(0.53f, 3.23f, 1.27f, 6.73f, 2.0f, 10.0f)
            curveToRelative(2.27f, 7.53f, 1.0f, 15.79f, 2.0f, 23.79f)
            curveToRelative(0.0f, 0.27f, 0.26f, 0.48f, 0.74f, 0.48f)
            arcToRelative(18.76f, 18.76f, 0.0f, false, false, 1.27f, -6.46f)
            arcToRelative(7.16f, 7.16f, 0.0f, false, true, -1.27f, -3.29f)
            arcToRelative(15.0f, 15.0f, 0.0f, false, true, 2.0f, -1.75f)
            curveToRelative(0.75f, -0.74f, -0.53f, -1.48f, -0.53f, -2.22f)
            curveToRelative(0.53f, -1.54f, 1.54f, -2.49f, 2.28f, -3.76f)
            arcToRelative(4.3f, 4.3f, 0.0f, false, true, -1.27f, -3.77f)
            arcToRelative(4.36f, 4.36f, 0.0f, false, true, 1.54f, -2.0f)
            arcToRelative(37.0f, 37.0f, 0.0f, false, true, -5.0f, -5.72f)
            curveTo(160.94f, 123.87f, 160.2f, 121.86f, 158.66f, 120.37f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(36.22f, 45.3f)
            curveToRelative(-0.74f, -0.27f, -2.0f, 0.74f, -2.28f, -0.53f)
            arcToRelative(16.6f, 16.6f, 0.0f, false, true, 2.76f, -4.24f)
            curveToRelative(-0.26f, -0.48f, -0.74f, 0.0f, -1.0f, -0.48f)
            curveToRelative(1.54f, -3.28f, 5.0f, -4.29f, 8.27f, -6.78f)
            arcToRelative(17.78f, 17.78f, 0.0f, false, false, -0.27f, 6.25f)
            arcTo(4.26f, 4.26f, 0.0f, false, true, 44.0f, 42.0f)
            reflectiveCurveToRelative(-0.74f, 1.54f, -3.76f, 0.0f)
            curveToRelative(0.53f, 1.75f, 1.48f, 3.5f, 1.27f, 5.25f)
            curveToRelative(-0.74f, 1.0f, -2.28f, 0.53f, -3.29f, 0.26f)
            curveToRelative(-0.74f, 2.0f, -1.22f, 4.77f, -3.0f, 3.77f)
            curveTo(33.68f, 50.81f, 36.0f, 47.52f, 36.22f, 45.3f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(37.23f, 33.54f)
            curveToRelative(-0.53f, 0.26f, -1.75f, 1.0f, -2.28f, 1.27f)
            curveToRelative(1.27f, -6.31f, 12.77f, -10.28f, 12.77f, -10.28f)
            curveToRelative(4.24f, -0.74f, 8.74f, -0.26f, 12.72f, 0.21f)
            curveToRelative(6.0f, 0.8f, 12.5f, 1.54f, 18.0f, 4.0f)
            curveToRelative(-6.73f, 2.0f, -14.25f, 0.26f, -20.5f, -1.27f)
            curveTo(50.21f, 25.75f, 43.69f, 30.52f, 37.23f, 33.54f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(40.46f, 73.33f)
            curveToRelative(-1.48f, -3.77f, -2.75f, -9.0f, -0.74f, -13.0f)
            lineToRelative(0.48f, 0.27f)
            curveToRelative(0.74f, 5.24f, 5.24f, 9.0f, 8.0f, 13.51f)
            curveToRelative(2.49f, 3.76f, 4.24f, 7.73f, 6.51f, 11.76f)
            curveToRelative(2.23f, -3.76f, 4.51f, -8.0f, 7.47f, -11.0f)
            arcTo(31.5f, 31.5f, 0.0f, false, false, 68.44f, 69.0f)
            curveToRelative(-2.76f, 10.28f, -4.51f, 15.0f, -4.51f, 15.0f)
            curveToRelative(-2.22f, 2.23f, -4.24f, 4.5f, -3.23f, 7.47f)
            arcTo(9.0f, 9.0f, 0.0f, false, false, 58.0f, 95.31f)
            lineToRelative(0.53f, 3.0f)
            curveToRelative(-1.54f, 1.49f, -3.29f, 2.76f, -3.5f, 5.0f)
            curveToRelative(0.0f, 1.54f, 1.75f, 3.29f, -0.53f, 4.29f)
            curveToRelative(-1.0f, 1.49f, -0.27f, 3.24f, 0.26f, 4.72f)
            curveToRelative(-1.53f, 2.0f, -0.26f, 4.5f, 0.0f, 6.52f)
            arcTo(166.36f, 166.36f, 0.0f, false, true, 59.0f, 102.36f)
            curveToRelative(-0.47f, 7.47f, -3.0f, 14.73f, -3.23f, 22.52f)
            curveToRelative(-0.53f, 1.0f, -0.26f, 2.75f, -1.27f, 4.24f)
            horizontalLineTo(54.0f)
            curveToRelative(0.21f, -3.0f, -0.79f, -7.26f, -1.0f, -10.28f)
            curveToRelative(0.21f, -8.75f, -2.0f, -16.75f, -3.0f, -25.0f)
            curveTo(48.2f, 86.31f, 43.69f, 80.05f, 40.46f, 73.33f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(44.0f, 61.3f)
            curveToRelative(-1.0f, -2.0f, -2.0f, -8.0f, -0.27f, -10.76f)
            arcToRelative(11.12f, 11.12f, 0.0f, false, false, 2.49f, 4.0f)
            curveToRelative(0.0f, 2.23f, -1.0f, 4.24f, 0.0f, 6.25f)
            arcToRelative(20.56f, 20.56f, 0.0f, false, true, 2.0f, 0.48f)
            curveToRelative(0.53f, 2.0f, 0.53f, 3.76f, 1.27f, 5.51f)
            curveToRelative(0.74f, 0.26f, 1.48f, -0.27f, 2.0f, 0.0f)
            curveToRelative(0.26f, 2.49f, 0.79f, 4.77f, 1.27f, 7.26f)
            arcToRelative(1.18f, 1.18f, 0.0f, false, false, 1.27f, 0.26f)
            curveToRelative(1.75f, -1.75f, 2.49f, -4.0f, 3.71f, -5.77f)
            curveToRelative(1.75f, 1.0f, 1.75f, -1.27f, 2.28f, -2.28f)
            curveToRelative(0.26f, -1.22f, 1.0f, -2.49f, 1.22f, -4.0f)
            curveToRelative(1.0f, -0.27f, 2.54f, 0.47f, 3.28f, -0.75f)
            arcToRelative(24.27f, 24.27f, 0.0f, false, false, 0.48f, -6.0f)
            curveToRelative(0.53f, -0.27f, 1.54f, 0.47f, 1.75f, 0.0f)
            curveToRelative(1.0f, -2.55f, 0.26f, -5.51f, 0.0f, -8.06f)
            curveToRelative(0.74f, 0.0f, 1.75f, 0.0f, 2.0f, -0.47f)
            curveToRelative(0.0f, 0.0f, 0.0f, -2.0f, -0.26f, -5.78f)
            curveToRelative(3.49f, 8.27f, 1.53f, 17.54f, -2.23f, 23.26f)
            curveTo(62.71f, 69.83f, 58.0f, 75.82f, 55.0f, 81.06f)
            curveTo(47.46f, 67.82f, 44.0f, 61.3f, 44.0f, 61.3f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(48.73f, 50.54f)
            curveToRelative(-0.53f, -0.26f, -2.28f, 0.48f, -2.0f, -1.27f)
            curveToRelative(0.0f, 0.0f, 0.48f, -2.49f, 8.27f, -17.48f)
            curveToRelative(0.0f, 0.0f, 2.22f, -2.76f, 2.49f, -0.27f)
            arcToRelative(112.8f, 112.8f, 0.0f, false, false, -4.0f, 16.27f)
            curveToRelative(-0.47f, 2.0f, 2.49f, 4.24f, 4.24f, 3.0f)
            curveToRelative(2.76f, -2.0f, 2.76f, -5.51f, 2.76f, -9.0f)
            reflectiveCurveToRelative(-0.48f, -7.26f, -0.22f, -10.75f)
            curveToRelative(3.5f, 5.0f, 5.25f, 9.75f, 5.0f, 12.24f)
            curveToRelative(0.0f, 0.74f, -1.27f, 0.26f, -1.48f, 1.0f)
            curveToRelative(0.48f, 2.23f, 0.74f, 4.77f, 1.0f, 7.0f)
            curveToRelative(0.0f, 2.0f, -2.28f, 0.26f, -2.76f, 1.0f)
            lineToRelative(-0.79f, 6.25f)
            curveToRelative(-0.48f, 0.53f, -1.22f, 0.27f, -1.75f, 0.53f)
            lineToRelative(-3.0f, 6.73f)
            curveToRelative(-0.53f, 0.48f, -2.28f, 0.74f, -2.28f, -0.26f)
            curveToRelative(-0.74f, -1.49f, -0.21f, -3.5f, -1.0f, -5.0f)
            curveToRelative(-0.74f, 0.26f, -1.49f, 1.75f, -2.23f, 1.0f)
            curveToRelative(-0.26f, -1.74f, 0.74f, -3.49f, 0.27f, -5.51f)
            curveToRelative(-0.74f, -0.26f, -2.49f, 1.22f, -2.76f, 0.0f)
            curveTo(48.2f, 54.31f, 48.94f, 52.29f, 48.73f, 50.54f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(57.68f, 140.61f)
            curveToRelative(-0.21f, 0.0f, -0.74f, 0.27f, -0.74f, -0.26f)
            curveToRelative(0.74f, -2.23f, 0.53f, -5.0f, 0.26f, -7.47f)
            curveToRelative(0.27f, -1.0f, 2.0f, -0.53f, 1.75f, -1.75f)
            curveToRelative(0.0f, -1.54f, -1.0f, -2.54f, -1.0f, -3.76f)
            curveToRelative(0.74f, -0.27f, 1.74f, 0.26f, 2.27f, -0.53f)
            curveToRelative(0.0f, -2.49f, -1.53f, -4.51f, -2.27f, -6.73f)
            curveToRelative(1.0f, 0.0f, 2.75f, 0.74f, 2.75f, -1.0f)
            curveToRelative(-0.26f, -2.28f, -2.0f, -4.24f, -2.75f, -6.78f)
            arcToRelative(1.18f, 1.18f, 0.0f, false, true, 1.27f, 0.26f)
            arcToRelative(15.35f, 15.35f, 0.0f, false, true, 2.49f, 13.52f)
            curveTo(60.22f, 131.13f, 60.44f, 136.64f, 57.68f, 140.61f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(55.19f, 20.5f)
            curveToRelative(2.0f, -1.74f, 7.0f, -3.0f, 7.0f, -3.0f)
            reflectiveCurveToRelative(3.0f, 2.75f, 9.75f, 5.72f)
            curveToRelative(-0.21f, 0.74f, -1.22f, 0.53f, -1.75f, 0.53f)
            curveTo(65.2f, 22.0f, 58.21f, 20.5f, 55.19f, 20.5f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(58.21f, 147.87f)
            curveToRelative(0.27f, -3.5f, 2.23f, -6.73f, 3.76f, -9.75f)
            lineToRelative(0.74f, 4.0f)
            curveToRelative(-0.26f, 2.0f, -1.53f, 4.45f, 0.48f, 6.0f)
            curveToRelative(-0.21f, 1.48f, -1.48f, 2.75f, -1.0f, 4.23f)
            lineToRelative(2.0f, 2.0f)
            curveToRelative(-0.48f, 1.0f, -1.22f, 2.22f, -0.74f, 3.49f)
            lineToRelative(2.0f, 1.28f)
            arcToRelative(51.12f, 51.12f, 0.0f, false, true, -1.0f, 5.51f)
            arcTo(50.81f, 50.81f, 0.0f, false, true, 58.21f, 147.87f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(64.2f, 142.63f)
            curveToRelative(-0.74f, -5.0f, -2.49f, -10.28f, -1.22f, -15.26f)
            arcTo(45.68f, 45.68f, 0.0f, false, false, 65.2f, 98.6f)
            curveToRelative(-0.47f, -10.55f, 3.24f, -20.0f, 5.0f, -30.0f)
            arcToRelative(44.45f, 44.45f, 0.0f, false, true, 2.76f, -7.74f)
            arcToRelative(156.57f, 156.57f, 0.0f, false, false, -1.48f, 32.27f)
            curveToRelative(-0.27f, 6.0f, -0.27f, 13.0f, -2.76f, 18.49f)
            curveToRelative(-0.48f, 9.0f, 1.27f, 18.54f, 0.48f, 27.76f)
            curveToRelative(-0.48f, 6.31f, -1.75f, 12.29f, -2.23f, 18.54f)
            lineToRelative(-0.26f, -0.26f)
            curveTo(64.94f, 153.12f, 64.94f, 147.61f, 64.2f, 142.63f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(63.93f, 116.82f)
            curveToRelative(-5.24f, -5.51f, -1.0f, -21.0f, -1.0f, -21.0f)
            horizontalLineToRelative(0.21f)
            curveTo(64.46f, 102.57f, 65.47f, 109.83f, 63.93f, 116.82f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(65.2f, 169.91f)
            curveToRelative(-1.0f, -1.54f, 0.48f, -4.5f, 1.0f, -6.52f)
            curveToRelative(0.48f, -0.74f, 0.48f, 0.75f, 0.74f, 1.28f)
            curveToRelative(0.48f, 6.72f, 8.0f, 9.74f, 13.0f, 13.0f)
            arcToRelative(280.83f, 280.83f, 0.0f, false, false, 28.77f, 10.0f)
            curveToRelative(8.27f, 2.22f, 16.74f, 2.0f, 25.49f, 1.27f)
            curveToRelative(3.0f, -0.26f, 5.51f, -1.75f, 8.47f, -2.54f)
            curveToRelative(3.29f, -1.0f, 6.78f, -2.23f, 10.55f, -2.23f)
            lineToRelative(-0.27f, 0.27f)
            curveToRelative(-4.77f, 2.49f, -8.74f, 6.73f, -14.25f, 7.2f)
            curveToRelative(-7.52f, 0.53f, -14.52f, 2.28f, -22.52f, 1.27f)
            horizontalLineToRelative(-4.24f)
            curveToRelative(-6.25f, 0.0f, -11.76f, -1.48f, -17.48f, -2.22f)
            curveToRelative(-5.0f, -2.76f, -9.48f, -6.52f, -14.52f, -9.27f)
            curveTo(74.48f, 178.39f, 68.44f, 175.37f, 65.2f, 169.91f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(70.0f, 169.12f)
            curveToRelative(-2.28f, -2.71f, -1.53f, -5.46f, -1.53f, -8.75f)
            lineToRelative(1.27f, -9.0f)
            curveToRelative(3.23f, 7.79f, 5.0f, 14.78f, 9.0f, 21.51f)
            lineToRelative(-0.26f, 0.79f)
            arcTo(21.93f, 21.93f, 0.0f, false, true, 70.0f, 169.12f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(70.93f, 59.07f)
            curveToRelative(-0.22f, -9.53f, 5.51f, -20.29f, 11.76f, -28.55f)
            arcToRelative(22.26f, 22.26f, 0.0f, false, true, 7.26f, 1.0f)
            reflectiveCurveTo(81.47f, 39.05f, 70.93f, 59.07f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(73.68f, 16.0f)
            arcTo(24.93f, 24.93f, 0.0f, false, true, 67.0f, 15.0f)
            curveToRelative(4.0f, -1.48f, 9.27f, -0.74f, 12.51f, -4.0f)
            arcToRelative(10.77f, 10.77f, 0.0f, false, false, 1.0f, -2.28f)
            curveTo(84.7f, 6.0f, 90.0f, 5.25f, 94.71f, 3.76f)
            curveToRelative(0.0f, 1.49f, -2.0f, 2.76f, -3.28f, 3.5f)
            lineToRelative(-4.5f, 2.22f)
            curveToRelative(0.0f, 1.0f, 0.0f, 1.8f, -1.0f, 2.28f)
            reflectiveCurveTo(83.0f, 11.5f, 82.69f, 13.0f)
            curveTo(80.2f, 15.26f, 76.7f, 15.0f, 73.68f, 16.0f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(72.94f, 73.54f)
            arcTo(41.87f, 41.87f, 0.0f, false, true, 83.22f, 45.0f)
            curveToRelative(3.0f, -3.76f, 6.0f, -8.0f, 10.75f, -9.74f)
            curveToRelative(2.49f, 1.0f, 4.45f, 2.49f, 7.0f, 3.76f)
            curveToRelative(-1.54f, 1.0f, -3.5f, 1.0f, -5.25f, 1.75f)
            lineTo(94.0f, 39.31f)
            curveToRelative(-2.54f, 6.2f, -5.0f, 4.72f, -5.0f, 4.72f)
            lineToRelative(-0.74f, -0.48f)
            curveToRelative(-1.0f, 1.22f, -1.0f, 3.23f, -1.75f, 4.72f)
            lineToRelative(-1.75f, -0.48f)
            curveToRelative(-2.28f, 2.49f, -1.0f, 6.52f, -4.0f, 8.74f)
            arcToRelative(3.74f, 3.74f, 0.0f, false, false, -1.48f, -0.48f)
            arcToRelative(9.61f, 9.61f, 0.0f, false, false, -1.75f, 3.5f)
            curveToRelative(-1.75f, -0.26f, -1.48f, 1.75f, -1.75f, 2.76f)
            curveToRelative(-0.47f, 3.76f, -1.74f, 7.25f, -2.22f, 11.23f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(74.0f, 40.8f)
            curveToRelative(-2.0f, -2.49f, -2.76f, -6.0f, -3.24f, -9.28f)
            curveToRelative(3.0f, -0.26f, 5.51f, -0.26f, 8.22f, -0.74f)
            curveTo(78.93f, 30.78f, 79.46f, 31.26f, 74.0f, 40.8f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(74.0f, 81.06f)
            curveToRelative(-0.48f, -2.0f, 0.26f, -3.76f, 0.53f, -5.77f)
            curveTo(76.0f, 66.07f, 80.94f, 58.28f, 87.19f, 51.0f)
            curveToRelative(4.0f, -4.5f, 9.48f, -7.0f, 14.52f, -9.75f)
            arcTo(57.83f, 57.83f, 0.0f, false, true, 109.0f, 46.52f)
            verticalLineToRelative(0.53f)
            curveToRelative(-4.0f, 0.74f, -8.27f, 1.0f, -12.0f, 3.23f)
            curveToRelative(-7.26f, 2.49f, -13.51f, 9.54f, -17.22f, 16.53f)
            curveToRelative(-1.27f, 2.49f, -2.28f, 5.0f, -3.5f, 7.73f)
            arcTo(55.37f, 55.37f, 0.0f, false, true, 74.0f, 81.06f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(68.0f, 18.0f)
            curveToRelative(5.24f, 0.53f, 8.0f, 0.53f, 8.0f, 0.53f)
            lineTo(77.18f, 17.0f)
            lineToRelative(6.25f, -0.48f)
            curveToRelative(0.53f, -0.53f, 0.0f, -1.54f, 0.74f, -1.75f)
            curveToRelative(1.8f, -1.0f, 4.0f, -1.0f, 6.25f, -1.53f)
            curveToRelative(0.53f, -0.75f, 0.0f, -1.75f, 0.27f, -2.76f)
            lineTo(94.45f, 9.0f)
            curveToRelative(1.75f, -0.27f, 4.24f, -0.27f, 5.0f, -2.49f)
            arcTo(28.48f, 28.48f, 0.0f, false, true, 107.0f, 2.76f)
            arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.74f, 1.0f)
            curveToRelative(-1.27f, 2.76f, -4.0f, 3.76f, -6.25f, 5.72f)
            arcToRelative(84.6f, 84.6f, 0.0f, false, true, -15.73f, 9.81f)
            curveTo(80.2f, 21.78f, 72.67f, 20.77f, 68.0f, 18.0f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(76.7f, 25.0f)
            horizontalLineTo(77.0f)
            curveToRelative(12.0f, 0.26f, 22.25f, 4.77f, 32.0f, 10.75f)
            curveToRelative(5.72f, 3.29f, 16.47f, 13.78f, 20.0f, 21.0f)
            curveToRelative(7.26f, 14.51f, 10.49f, 30.78f, 18.0f, 45.0f)
            curveToRelative(2.76f, 5.0f, 6.73f, 9.27f, 8.22f, 14.78f)
            curveToRelative(3.76f, 9.49f, 4.76f, 20.24f, 5.0f, 31.26f)
            lineToRelative(1.75f, 13.0f)
            curveToRelative(0.0f, 0.48f, 0.0f, 1.49f, -0.53f, 1.49f)
            curveToRelative(-3.5f, -8.74f, -3.71f, -18.49f, -5.25f, -28.29f)
            curveToRelative(-1.0f, -8.75f, -5.0f, -16.75f, -10.22f, -24.0f)
            curveToRelative(-1.27f, -2.49f, -1.49f, -5.77f, -2.49f, -8.53f)
            curveToRelative(-3.29f, -8.0f, -7.26f, -15.25f, -10.55f, -23.25f)
            lineTo(131.17f, 70.0f)
            curveToRelative(-2.23f, -5.51f, -4.24f, -11.0f, -8.22f, -15.47f)
            curveToRelative(-4.24f, -5.3f, -8.0f, -11.55f, -13.77f, -15.52f)
            curveTo(106.0f, 36.77f, 102.71f, 34.54f, 99.0f, 33.27f)
            lineTo(80.2f, 27.0f)
            curveTo(79.19f, 26.49f, 77.44f, 26.49f, 76.7f, 25.0f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(82.21f, 133.62f)
            arcToRelative(10.66f, 10.66f, 0.0f, false, true, -3.28f, -8.74f)
            curveToRelative(1.27f, -7.53f, 6.0f, -13.57f, 7.0f, -20.77f)
            curveToRelative(-2.28f, 1.75f, -3.55f, 4.24f, -5.51f, 6.0f)
            lineTo(80.2f, 110.11f)
            curveToRelative(1.48f, -5.51f, 1.75f, -11.49f, 6.25f, -15.78f)
            curveToRelative(4.5f, -3.77f, 9.0f, -8.48f, 13.72f, -12.24f)
            curveToRelative(0.8f, -0.48f, 1.54f, -0.74f, 1.27f, 1.0f)
            curveToRelative(6.25f, -5.0f, 11.5f, -6.25f, 19.0f, -4.76f)
            arcToRelative(11.66f, 11.66f, 0.0f, false, true, 6.0f, 3.0f)
            arcToRelative(7.2f, 7.2f, 0.0f, false, true, -0.26f, 6.0f)
            curveToRelative(-1.49f, 3.0f, -4.51f, 1.75f, -7.0f, 2.0f)
            lineToRelative(-4.5f, -0.27f)
            arcToRelative(21.87f, 21.87f, 0.0f, false, true, -4.24f, -2.49f)
            curveToRelative(-0.27f, 1.75f, 2.0f, 2.49f, 2.75f, 4.0f)
            curveToRelative(-1.53f, 1.0f, -3.28f, 1.81f, -4.23f, 3.55f)
            curveToRelative(-1.0f, 0.75f, -2.55f, 1.22f, -3.5f, 2.23f)
            arcToRelative(49.32f, 49.32f, 0.0f, false, false, 4.71f, 2.54f)
            curveToRelative(2.28f, 0.48f, 3.77f, 5.0f, 6.26f, 2.49f)
            arcToRelative(5.31f, 5.31f, 0.0f, false, true, 4.24f, -0.53f)
            curveToRelative(1.0f, 0.27f, 1.74f, 1.27f, 3.0f, 1.27f)
            curveToRelative(2.23f, -1.48f, 5.0f, -2.49f, 7.26f, -4.0f)
            curveToRelative(-0.74f, -2.76f, -4.5f, -3.23f, -5.0f, -6.0f)
            lineToRelative(-1.0f, -1.0f)
            curveToRelative(1.22f, -2.27f, 4.0f, -4.0f, 3.23f, -7.0f)
            curveToRelative(-0.27f, -0.53f, 0.0f, -1.0f, 0.0f, -1.48f)
            curveToRelative(1.48f, 0.0f, 2.49f, 1.75f, 3.23f, 3.0f)
            curveToRelative(4.24f, 4.0f, 5.78f, 9.54f, 8.74f, 14.26f)
            curveToRelative(1.75f, 5.0f, 1.54f, 10.75f, 3.29f, 15.78f)
            curveToRelative(2.0f, 5.25f, 5.0f, 10.0f, 5.24f, 16.27f)
            arcToRelative(21.06f, 21.06f, 0.0f, false, true, -2.49f, 11.23f)
            curveToRelative(-2.0f, 5.0f, -1.75f, 10.76f, -5.51f, 15.05f)
            curveToRelative(-5.0f, 4.77f, -11.76f, 8.48f, -14.0f, 15.0f)
            curveToRelative(0.75f, 3.5f, 1.49f, 7.53f, -0.26f, 11.0f)
            arcToRelative(16.83f, 16.83f, 0.0f, false, true, -1.75f, 3.5f)
            lineTo(124.0f, 187.73f)
            curveToRelative(0.74f, -4.24f, 2.75f, -8.53f, 1.75f, -13.0f)
            curveToRelative(-4.0f, -9.75f, -14.78f, -12.24f, -23.0f, -16.48f)
            curveToRelative(-6.51f, -3.29f, -12.29f, -8.0f, -18.0f, -13.0f)
            curveToRelative(-0.74f, -1.22f, -2.0f, -2.23f, -2.0f, -4.0f)
            arcToRelative(8.77f, 8.77f, 0.0f, false, true, -1.22f, -3.55f)
            arcToRelative(31.81f, 31.81f, 0.0f, false, false, 13.24f, 7.26f)
            curveToRelative(6.47f, 1.75f, 12.72f, -0.95f, 17.49f, -5.51f)
            arcToRelative(3.24f, 3.24f, 0.0f, false, false, 0.26f, -3.5f)
            curveToRelative(-3.49f, 2.0f, -6.78f, 5.0f, -11.0f, 5.51f)
            curveToRelative(-5.0f, 1.0f, -11.0f, 1.0f, -15.0f, -3.0f)
            curveToRelative(0.26f, -1.0f, 1.27f, -1.54f, 2.0f, -2.28f)
            lineToRelative(1.22f, -1.0f)
            curveToRelative(4.5f, 2.49f, 10.49f, 4.0f, 15.79f, 2.0f)
            curveToRelative(2.0f, -1.28f, 4.45f, -3.5f, 4.0f, -6.26f)
            arcToRelative(8.35f, 8.35f, 0.0f, false, false, -1.75f, -5.51f)
            lineToRelative(0.75f, 5.25f)
            arcToRelative(15.0f, 15.0f, 0.0f, false, false, -12.51f, -2.76f)
            curveToRelative(-2.0f, 0.53f, -3.49f, 2.0f, -5.0f, 3.5f)
            curveToRelative(4.0f, 6.25f, 12.72f, 5.0f, 16.27f, 2.49f)
            arcToRelative(11.43f, 11.43f, 0.0f, false, true, -11.5f, 2.81f)
            curveToRelative(-4.29f, -0.8f, -6.78f, -6.31f, -11.0f, -4.77f)
            curveToRelative(1.0f, 0.48f, 2.49f, 1.0f, 3.5f, 1.48f)
            curveToRelative(-1.0f, 1.28f, -3.0f, 2.49f, -4.0f, 4.24f)
            arcToRelative(8.52f, 8.52f, 0.0f, false, true, -2.7f, -0.74f)
            curveTo(82.0f, 135.84f, 82.42f, 134.1f, 82.21f, 133.62f)
            close()
            moveTo(110.45f, 106.07f)
            curveToRelative(-1.27f, 0.53f, -2.76f, 1.0f, -2.49f, 2.75f)
            curveToRelative(1.0f, 4.51f, 3.23f, 8.53f, 5.0f, 12.29f)
            lineToRelative(-3.23f, -9.53f)
            curveToRelative(-1.27f, -3.76f, 1.0f, -3.0f, 2.0f, -3.0f)
            curveToRelative(1.8f, 0.21f, 2.0f, 2.23f, 1.8f, 3.71f)
            curveToRelative(1.22f, 6.78f, 1.75f, 12.56f, 0.74f, 19.29f)
            lineToRelative(2.0f, 3.23f)
            curveToRelative(0.0f, -0.48f, -0.48f, -1.0f, -0.48f, -1.75f)
            curveToRelative(1.28f, -7.0f, -0.74f, -13.72f, -0.74f, -21.0f)
            arcToRelative(4.56f, 4.56f, 0.0f, false, true, 2.49f, -3.5f)
            curveToRelative(2.49f, -1.0f, 4.51f, 1.22f, 6.0f, 2.7f)
            verticalLineToRelative(-1.48f)
            curveToRelative(2.0f, -1.48f, 3.0f, -0.48f, 3.76f, 0.26f)
            curveToRelative(0.48f, 0.75f, -1.75f, 3.77f, -2.0f, 5.78f)
            lineToRelative(2.28f, -2.76f)
            curveToRelative(1.75f, -3.76f, 1.22f, -5.77f, -2.28f, -5.77f)
            curveToRelative(-2.0f, 1.48f, -3.71f, -0.48f, -5.25f, -1.27f)
            curveToRelative(-1.75f, -0.74f, -2.75f, 0.79f, -4.24f, 1.53f)
            arcTo(8.22f, 8.22f, 0.0f, false, true, 110.45f, 106.07f)
            close()
            moveTo(114.21f, 145.86f)
            curveToRelative(-0.53f, 1.75f, -0.53f, 5.24f, 2.49f, 7.0f)
            arcToRelative(4.55f, 4.55f, 0.0f, false, false, 4.77f, -0.48f)
            arcToRelative(6.47f, 6.47f, 0.0f, false, false, 1.48f, -6.0f)
            arcToRelative(5.26f, 5.26f, 0.0f, false, false, -2.27f, -2.28f)
            curveTo(118.18f, 143.63f, 115.43f, 144.11f, 114.21f, 145.86f)
            close()
            moveTo(123.69f, 132.35f)
            curveToRelative(0.0f, -1.22f, -0.74f, -2.76f, -0.26f, -4.24f)
            curveToRelative(1.27f, -1.27f, 0.74f, -3.23f, 1.27f, -5.0f)
            curveToRelative(-0.26f, -1.75f, 1.49f, -3.76f, 0.0f, -5.3f)
            curveToRelative(-1.27f, 3.55f, -0.74f, 7.79f, -3.0f, 11.0f)
            curveToRelative(0.27f, 2.49f, 1.0f, 5.25f, 2.76f, 6.78f)
            curveToRelative(0.26f, -0.53f, 0.0f, -1.53f, 0.0f, -2.0f)
            arcToRelative(14.09f, 14.09f, 0.0f, false, false, 5.77f, 4.5f)
            curveToRelative(5.46f, 2.0f, 10.7f, -0.74f, 15.0f, -4.0f)
            horizontalLineToRelative(0.47f)
            arcToRelative(23.28f, 23.28f, 0.0f, false, true, -2.49f, 5.24f)
            curveToRelative(-3.49f, 5.78f, -10.49f, 1.27f, -15.52f, 1.54f)
            arcToRelative(2.35f, 2.35f, 0.0f, false, false, -1.0f, 1.27f)
            curveToRelative(-0.26f, 0.74f, -0.26f, 1.75f, 0.48f, 2.0f)
            curveToRelative(3.0f, 1.0f, 5.72f, 2.28f, 9.27f, 2.0f)
            arcToRelative(10.48f, 10.48f, 0.0f, false, false, 7.74f, -4.5f)
            arcToRelative(40.83f, 40.83f, 0.0f, false, false, 3.23f, -10.76f)
            lineToRelative(-1.0f, 1.0f)
            curveToRelative(-3.0f, 2.0f, -5.72f, 4.24f, -9.0f, 5.51f)
            curveToRelative(-7.21f, 1.75f, -11.23f, -3.0f, -11.71f, -4.5f)
            curveToRelative(2.49f, 1.22f, 9.22f, 7.47f, 17.0f, -1.0f)
            arcToRelative(10.06f, 10.06f, 0.0f, false, false, -4.45f, -3.5f)
            arcToRelative(28.92f, 28.92f, 0.0f, false, false, -8.26f, 0.0f)
            curveToRelative(-0.27f, -1.27f, 1.0f, -1.75f, 1.22f, -2.75f)
            arcToRelative(18.48f, 18.48f, 0.0f, false, false, -4.24f, 3.23f)
            arcTo(34.39f, 34.39f, 0.0f, false, true, 123.69f, 132.35f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(82.0f, 96.58f)
            lineToRelative(-0.27f, -0.26f)
            curveToRelative(3.5f, -5.25f, 4.77f, -9.27f, 5.0f, -14.73f)
            arcTo(63.0f, 63.0f, 0.0f, false, false, 86.0f, 69.83f)
            curveToRelative(-0.26f, -2.54f, 1.75f, -4.5f, 3.71f, -5.3f)
            reflectiveCurveToRelative(3.5f, 0.27f, 5.0f, 1.27f)
            arcToRelative(7.0f, 7.0f, 0.0f, false, false, 1.0f, -4.5f)
            arcToRelative(112.53f, 112.53f, 0.0f, false, true, 18.7f, -1.48f)
            curveToRelative(-1.75f, -1.75f, -13.24f, -1.28f, -13.24f, -1.28f)
            lineToRelative(-5.72f, 0.75f)
            arcTo(19.36f, 19.36f, 0.0f, false, false, 91.69f, 54.0f)
            curveToRelative(6.73f, -5.0f, 15.74f, -4.24f, 24.48f, -1.75f)
            curveToRelative(9.75f, 4.77f, 9.75f, 16.53f, 13.25f, 25.0f)
            lineToRelative(-0.74f, -0.48f)
            curveToRelative(-5.0f, -5.24f, -11.24f, -8.0f, -18.0f, -9.53f)
            arcToRelative(0.71f, 0.71f, 0.0f, false, false, 0.48f, 1.0f)
            curveToRelative(6.73f, 1.54f, 13.51f, 4.77f, 17.75f, 10.76f)
            curveToRelative(0.27f, 0.79f, 1.0f, 1.53f, 0.74f, 2.28f)
            curveToRelative(-5.0f, -3.77f, -10.22f, -6.52f, -16.74f, -5.78f)
            curveToRelative(-9.48f, 1.0f, -16.74f, 7.0f, -23.47f, 13.78f)
            arcTo(74.11f, 74.11f, 0.0f, false, true, 82.0f, 96.58f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(85.18f, 189.14f)
            verticalLineToRelative(-0.47f)
            arcToRelative(22.1f, 22.1f, 0.0f, false, false, 9.75f, 4.0f)
            curveToRelative(2.27f, 2.0f, 5.51f, 1.27f, 8.26f, 1.27f)
            lineToRelative(2.76f, 1.75f)
            curveToRelative(1.48f, -0.27f, 2.49f, -0.74f, 3.76f, -1.0f)
            curveToRelative(2.0f, 1.0f, 4.0f, 2.28f, 6.46f, 1.27f)
            curveToRelative(1.0f, -0.53f, 2.28f, -2.27f, 3.76f, -1.27f)
            curveToRelative(2.0f, 1.75f, 4.77f, 1.0f, 7.26f, 0.27f)
            arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.5f, 1.0f)
            arcToRelative(45.85f, 45.85f, 0.0f, false, true, -16.0f, 2.76f)
            curveTo(105.2f, 198.41f, 93.18f, 195.66f, 85.18f, 189.14f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(90.42f, 23.79f)
            curveTo(92.0f, 24.0f, 94.0f, 24.27f, 94.93f, 23.0f)
            lineToRelative(1.27f, -1.48f)
            curveToRelative(1.0f, -0.26f, 2.0f, 0.27f, 3.0f, -0.26f)
            lineToRelative(1.22f, -1.75f)
            curveToRelative(1.27f, -0.21f, 3.0f, 0.26f, 4.0f, -0.74f)
            arcToRelative(10.08f, 10.08f, 0.0f, false, false, 1.0f, -2.76f)
            curveToRelative(0.74f, -0.21f, 2.49f, 0.0f, 2.75f, -1.48f)
            arcToRelative(4.21f, 4.21f, 0.0f, false, true, 0.48f, -1.75f)
            curveToRelative(0.74f, 0.74f, 0.48f, 2.22f, 0.74f, 3.5f)
            curveToRelative(0.74f, 4.0f, -4.24f, 5.77f, -5.51f, 8.74f)
            curveToRelative(0.0f, 0.74f, -0.47f, 1.75f, 0.0f, 2.49f)
            curveToRelative(1.0f, 1.53f, 3.5f, 0.79f, 5.0f, 1.0f)
            curveToRelative(0.47f, 1.75f, 0.0f, 3.77f, 1.74f, 5.0f)
            horizontalLineToRelative(3.0f)
            curveToRelative(0.74f, 2.49f, 2.28f, 5.51f, 5.25f, 6.0f)
            curveToRelative(1.53f, -0.21f, 3.0f, -0.47f, 3.76f, -2.0f)
            arcToRelative(8.59f, 8.59f, 0.0f, false, false, 0.26f, -5.0f)
            arcToRelative(3.22f, 3.22f, 0.0f, false, false, 2.23f, -2.75f)
            curveToRelative(0.0f, -1.28f, -0.74f, -2.49f, -1.0f, -3.77f)
            arcToRelative(11.36f, 11.36f, 0.0f, false, false, 1.27f, -4.23f)
            horizontalLineToRelative(0.27f)
            curveToRelative(1.0f, 1.74f, 2.22f, 3.49f, 2.22f, 5.51f)
            curveToRelative(-1.0f, 1.48f, -0.26f, 3.76f, 0.53f, 5.24f)
            curveToRelative(-0.79f, 1.0f, -1.75f, 2.0f, -1.27f, 3.5f)
            curveToRelative(1.75f, 2.0f, -2.49f, 2.75f, -1.0f, 5.0f)
            curveToRelative(1.0f, 1.48f, -1.75f, 1.75f, -1.0f, 3.5f)
            arcToRelative(4.43f, 4.43f, 0.0f, false, false, 1.75f, 2.0f)
            curveToRelative(1.75f, -6.0f, 3.28f, -12.72f, 2.75f, -19.5f)
            arcToRelative(12.89f, 12.89f, 0.0f, false, false, -2.75f, -5.77f)
            curveToRelative(0.0f, -0.22f, 0.26f, -0.75f, 0.74f, -0.48f)
            curveToRelative(2.0f, 2.22f, 4.29f, 4.5f, 4.5f, 7.26f)
            curveToRelative(0.0f, 0.0f, 0.0f, 9.53f, -5.0f, 22.51f)
            arcTo(141.34f, 141.34f, 0.0f, false, false, 109.0f, 34.0f)
            curveToRelative(-2.0f, -1.74f, -4.77f, -3.0f, -7.0f, -4.71f)
            arcTo(48.61f, 48.61f, 0.0f, false, false, 79.72f, 23.0f)
            curveToRelative(10.0f, -0.74f, 16.0f, -6.46f, 23.47f, -11.0f)
            arcToRelative(5.61f, 5.61f, 0.0f, false, true, 1.75f, -0.27f)
            curveToRelative(-3.0f, 2.23f, -6.73f, 7.26f, -11.0f, 9.75f)
            curveTo(93.0f, 22.25f, 91.43f, 22.78f, 90.42f, 23.79f)
            close()
        }
        path(
            fill = SolidColor(Color(iconColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(108.0f, 108.82f)
            curveToRelative(-0.27f, -1.75f, 1.22f, -2.22f, 2.49f, -2.75f)
            arcToRelative(8.22f, 8.22f, 0.0f, false, false, 5.24f, 1.53f)
            curveToRelative(1.49f, -0.74f, 2.49f, -2.27f, 4.24f, -1.53f)
            curveToRelative(1.54f, 0.79f, 3.29f, 2.75f, 5.25f, 1.27f)
            curveToRelative(3.5f, 0.0f, 4.0f, 2.0f, 2.28f, 5.77f)
            lineToRelative(-2.28f, 2.76f)
            curveToRelative(0.26f, -2.0f, 2.49f, -5.0f, 2.0f, -5.78f)
            curveToRelative(-0.74f, -0.74f, -1.75f, -1.74f, -3.76f, -0.26f)
            verticalLineToRelative(1.48f)
            curveToRelative(-1.48f, -1.48f, -3.5f, -3.71f, -6.0f, -2.7f)
            arcToRelative(4.56f, 4.56f, 0.0f, false, false, -2.49f, 3.5f)
            curveToRelative(0.0f, 7.26f, 2.0f, 14.0f, 0.74f, 21.0f)
            curveToRelative(0.0f, 0.74f, 0.48f, 1.27f, 0.48f, 1.75f)
            lineToRelative(-2.0f, -3.23f)
            curveToRelative(1.0f, -6.73f, 0.48f, -12.51f, -0.74f, -19.29f)
            curveToRelative(0.21f, -1.48f, 0.0f, -3.5f, -1.8f, -3.71f)
            curveToRelative(-1.0f, 0.0f, -3.23f, -0.79f, -2.0f, 3.0f)
            lineToRelative(3.23f, 9.53f)
            curveTo(111.19f, 117.35f, 109.0f, 113.33f, 108.0f, 108.82f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(108.7f, 26.0f)
            curveToRelative(-0.48f, -2.0f, 2.23f, -3.49f, 3.76f, -5.0f)
            curveToRelative(0.21f, -3.76f, -1.27f, -7.0f, -2.28f, -10.27f)
            curveToRelative(0.0f, -0.27f, 0.27f, -0.48f, 0.75f, -0.75f)
            arcToRelative(14.72f, 14.72f, 0.0f, false, true, 5.77f, 8.27f)
            curveToRelative(1.48f, 1.0f, 3.5f, 1.22f, 5.0f, 2.49f)
            curveToRelative(0.53f, 1.0f, -0.21f, 1.75f, -1.0f, 2.22f)
            lineToRelative(-0.48f, 0.53f)
            curveToRelative(1.0f, 1.22f, 3.23f, 2.76f, 2.0f, 4.77f)
            curveToRelative(-1.27f, 0.48f, -2.28f, -0.26f, -3.5f, -0.26f)
            curveToRelative(0.0f, 1.75f, 1.22f, 3.23f, 1.0f, 5.0f)
            curveToRelative(-0.74f, 1.0f, -1.75f, 0.53f, -2.49f, 0.0f)
            curveToRelative(-1.49f, -1.0f, -1.75f, -2.49f, -2.49f, -3.71f)
            curveToRelative(-0.74f, 0.48f, -1.22f, 1.48f, -2.49f, 1.22f)
            curveToRelative(-0.74f, -1.49f, 0.26f, -3.0f, 0.26f, -4.24f)
            curveTo(111.19f, 25.75f, 108.7f, 27.0f, 108.7f, 26.0f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(110.93f, 3.0f)
            curveToRelative(6.25f, -0.53f, 12.0f, 1.48f, 17.27f, 4.24f)
            curveToRelative(1.48f, 2.0f, 3.5f, 4.0f, 6.25f, 3.5f)
            curveToRelative(1.0f, 1.74f, 2.23f, 4.5f, 4.5f, 4.23f)
            curveToRelative(2.49f, -0.21f, 1.22f, 3.0f, 4.24f, 3.0f)
            lineToRelative(1.75f, 0.27f)
            curveToRelative(0.48f, 1.48f, 0.0f, 3.76f, 2.0f, 4.24f)
            curveToRelative(0.75f, 0.26f, 1.49f, 0.0f, 2.0f, 0.47f)
            arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.27f, 2.0f)
            curveToRelative(1.0f, 1.48f, 2.49f, 2.0f, 4.0f, 2.75f)
            curveToRelative(0.0f, 1.27f, 0.0f, 2.28f, 0.74f, 3.0f)
            curveToRelative(0.74f, 1.0f, 2.0f, 1.0f, 3.0f, 1.75f)
            arcToRelative(5.16f, 5.16f, 0.0f, false, false, 0.8f, 3.76f)
            curveToRelative(1.22f, 1.0f, 3.0f, 1.27f, 4.45f, 1.75f)
            curveToRelative(0.0f, 0.0f, 2.75f, 8.74f, -4.72f, 17.75f)
            curveToRelative(0.27f, -3.5f, -1.0f, -6.52f, 0.27f, -9.48f)
            curveToRelative(0.21f, -1.54f, -2.54f, -2.28f, -1.75f, -3.77f)
            curveToRelative(0.0f, -1.48f, -1.75f, -2.0f, -2.75f, -2.75f)
            curveToRelative(-1.75f, -0.74f, -2.55f, -2.49f, -3.5f, -4.0f)
            curveToRelative(1.75f, -2.22f, -2.0f, -2.75f, -1.54f, -4.71f)
            arcToRelative(2.52f, 2.52f, 0.0f, false, false, 1.0f, -1.75f)
            curveToRelative(-1.48f, -1.0f, -3.5f, -1.27f, -5.25f, -2.28f)
            curveToRelative(-0.26f, -0.74f, 1.28f, -1.75f, 0.0f, -2.28f)
            arcToRelative(45.09f, 45.09f, 0.0f, false, false, -5.24f, -0.95f)
            curveToRelative(-0.74f, -1.54f, -3.23f, -2.54f, -2.76f, -4.77f)
            curveToRelative(0.0f, -1.27f, -1.48f, -1.75f, -2.22f, -2.75f)
            curveToRelative(0.21f, -0.48f, 1.0f, -1.0f, 1.0f, -1.49f)
            arcToRelative(12.26f, 12.26f, 0.0f, false, false, -5.0f, -1.53f)
            curveToRelative(-0.47f, -1.0f, 1.75f, -2.0f, 0.0f, -2.23f)
            curveToRelative(-2.0f, 0.0f, -4.0f, 0.48f, -5.72f, 0.48f)
            arcTo(34.6f, 34.6f, 0.0f, false, true, 120.68f, 9.0f)
            curveToRelative(0.26f, -0.74f, 1.53f, -1.49f, 1.53f, -2.49f)
            arcToRelative(31.81f, 31.81f, 0.0f, false, false, -4.29f, -1.0f)
            curveToRelative(-0.21f, -0.53f, -0.21f, -1.54f, -1.0f, -1.75f)
            curveToRelative(0.0f, 0.0f, -4.0f, 0.21f, -4.51f, 1.49f)
            arcTo(3.81f, 3.81f, 0.0f, false, true, 110.93f, 3.0f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(113.47f, 9.27f)
            reflectiveCurveToRelative(-1.54f, -0.79f, -0.27f, -1.53f)
            curveToRelative(6.47f, 2.0f, 11.77f, 6.0f, 17.22f, 10.0f)
            curveToRelative(0.0f, 0.0f, 9.54f, 7.52f, 15.0f, 14.78f)
            curveToRelative(-2.76f, -1.27f, -4.72f, -3.76f, -7.21f, -5.51f)
            curveTo(130.0f, 20.5f, 122.42f, 13.51f, 113.47f, 9.27f)
            close()
        }
        path(
            fill = SolidColor(Color(iconColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(116.7f, 152.85f)
            curveToRelative(-3.0f, -1.75f, -3.0f, -5.24f, -2.49f, -7.0f)
            curveToRelative(1.22f, -1.75f, 4.0f, -2.23f, 6.47f, -1.75f)
            arcToRelative(5.26f, 5.26f, 0.0f, false, true, 2.27f, 2.28f)
            arcToRelative(6.47f, 6.47f, 0.0f, false, true, -1.48f, 6.0f)
            arcTo(4.55f, 4.55f, 0.0f, false, true, 116.7f, 152.85f)
            close()
        }
        path(
            fill = SolidColor(Color(iconColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(123.43f, 128.11f)
            curveToRelative(-0.48f, 1.48f, 0.26f, 3.0f, 0.26f, 4.24f)
            arcToRelative(34.39f, 34.39f, 0.0f, false, false, 3.24f, -3.5f)
            arcToRelative(18.48f, 18.48f, 0.0f, false, true, 4.24f, -3.23f)
            curveToRelative(-0.22f, 1.0f, -1.49f, 1.48f, -1.22f, 2.75f)
            arcToRelative(28.92f, 28.92f, 0.0f, false, true, 8.26f, 0.0f)
            arcToRelative(10.06f, 10.06f, 0.0f, false, true, 4.45f, 3.5f)
            curveToRelative(-7.73f, 8.48f, -14.46f, 2.23f, -17.0f, 1.0f)
            curveToRelative(0.48f, 1.48f, 4.5f, 6.25f, 11.71f, 4.5f)
            curveToRelative(3.28f, -1.27f, 6.0f, -3.55f, 9.0f, -5.51f)
            lineToRelative(1.0f, -1.0f)
            arcToRelative(40.83f, 40.83f, 0.0f, false, true, -3.23f, 10.76f)
            arcToRelative(10.48f, 10.48f, 0.0f, false, true, -7.74f, 4.5f)
            curveToRelative(-3.55f, 0.27f, -6.25f, -1.0f, -9.27f, -2.0f)
            curveToRelative(-0.74f, -0.21f, -0.74f, -1.22f, -0.48f, -2.0f)
            arcToRelative(2.35f, 2.35f, 0.0f, false, true, 1.0f, -1.27f)
            curveToRelative(5.0f, -0.27f, 12.0f, 4.24f, 15.52f, -1.54f)
            arcToRelative(23.28f, 23.28f, 0.0f, false, false, 2.49f, -5.24f)
            horizontalLineToRelative(-0.47f)
            curveToRelative(-4.3f, 3.28f, -9.54f, 6.0f, -15.0f, 4.0f)
            arcToRelative(14.09f, 14.09f, 0.0f, false, true, -5.77f, -4.5f)
            curveToRelative(0.0f, 0.48f, 0.26f, 1.48f, 0.0f, 2.0f)
            curveToRelative(-1.75f, -1.53f, -2.49f, -4.29f, -2.76f, -6.78f)
            curveToRelative(2.28f, -3.23f, 1.75f, -7.47f, 3.0f, -11.0f)
            curveToRelative(1.49f, 1.54f, -0.26f, 3.55f, 0.0f, 5.3f)
            curveTo(124.17f, 124.88f, 124.7f, 126.84f, 123.43f, 128.11f)
            close()
            moveTo(127.93f, 130.11f)
            curveToRelative(-0.74f, 0.21f, -1.48f, 0.74f, -1.48f, 1.22f)
            curveToRelative(0.74f, 1.27f, 2.23f, 1.75f, 3.5f, 2.49f)
            arcToRelative(8.75f, 8.75f, 0.0f, false, true, 2.49f, -5.0f)
            arcTo(8.83f, 8.83f, 0.0f, false, false, 127.93f, 130.12f)
            close()
            moveTo(135.93f, 128.84f)
            curveToRelative(3.5f, 3.23f, 2.49f, 5.25f, 2.49f, 5.25f)
            curveToRelative(1.0f, -0.27f, 2.49f, -1.75f, 2.49f, -2.76f)
            curveTo(139.7f, 130.33f, 137.68f, 128.85f, 135.93f, 128.85f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(137.68f, 67.07f)
            curveToRelative(-3.49f, -4.76f, -7.47f, -9.8f, -6.25f, -16.53f)
            curveToRelative(1.27f, -6.51f, 4.24f, -13.0f, 3.76f, -18.75f)
            lineToRelative(0.27f, -2.28f)
            curveToRelative(2.0f, 2.54f, 5.0f, 6.0f, 4.71f, 9.8f)
            curveToRelative(-0.21f, 3.0f, -3.0f, 4.72f, -2.75f, 7.74f)
            arcToRelative(5.28f, 5.28f, 0.0f, false, false, -2.0f, 2.75f)
            curveToRelative(0.0f, 1.22f, 0.74f, 2.0f, 1.0f, 3.23f)
            curveToRelative(-0.79f, 0.53f, -1.74f, 1.0f, -1.74f, 2.0f)
            curveToRelative(0.21f, 1.75f, 1.74f, 3.0f, 2.49f, 4.5f)
            curveToRelative(-2.0f, 2.76f, 3.7f, 5.25f, 5.72f, 7.0f)
            curveToRelative(0.53f, 0.75f, -0.27f, 1.0f, -0.48f, 1.75f)
            arcToRelative(55.32f, 55.32f, 0.0f, false, false, 8.74f, 4.77f)
            curveToRelative(0.0f, 0.48f, -0.26f, 0.74f, -0.53f, 0.74f)
            curveTo(146.21f, 72.05f, 141.18f, 71.05f, 137.68f, 67.07f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(138.69f, 75.82f)
            curveToRelative(0.26f, -0.53f, 0.74f, -1.28f, 2.0f, -0.27f)
            curveToRelative(2.76f, 2.0f, 5.51f, 4.0f, 7.47f, 7.0f)
            curveToRelative(-0.21f, 0.74f, -1.22f, 1.22f, -1.75f, 2.0f)
            curveToRelative(0.75f, 1.75f, 2.28f, 3.28f, 2.49f, 5.0f)
            curveToRelative(0.0f, 0.48f, -1.74f, 0.21f, -1.74f, 1.0f)
            lineToRelative(3.28f, 3.55f)
            reflectiveCurveToRelative(0.21f, 1.0f, -1.75f, 1.49f)
            curveToRelative(0.74f, 1.75f, 2.49f, 5.77f, 0.48f, 6.78f)
            curveToRelative(-0.74f, 0.48f, -5.72f, -9.54f, -7.47f, -15.79f)
            curveToRelative(0.74f, 0.0f, 1.75f, 0.27f, 2.0f, -0.74f)
            curveTo(143.93f, 81.59f, 138.69f, 79.84f, 138.69f, 75.82f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(140.0f, 58.28f)
            arcToRelative(0.69f, 0.69f, 0.0f, false, true, 0.21f, -1.22f)
            lineToRelative(1.75f, -0.26f)
            curveToRelative(-0.21f, -1.0f, -1.22f, -2.0f, -0.74f, -3.0f)
            curveToRelative(0.0f, -1.22f, 1.75f, -1.0f, 1.27f, -2.0f)
            curveToRelative(-1.27f, -3.29f, 0.21f, -6.52f, 1.48f, -9.28f)
            curveToRelative(2.0f, 7.74f, 3.0f, 11.77f, 3.0f, 11.77f)
            curveToRelative(-2.27f, 0.0f, -2.49f, 2.49f, 0.0f, 6.51f)
            curveToRelative(1.22f, 2.49f, 4.51f, 5.46f, 3.24f, 8.74f)
            curveToRelative(-2.76f, -2.49f, -6.0f, -4.0f, -8.75f, -6.78f)
            curveToRelative(-0.53f, -0.74f, 0.75f, -0.74f, 1.75f, -1.0f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(141.18f, 185.43f)
            arcToRelative(0.52f, 0.52f, 0.0f, false, true, -0.48f, -0.53f)
            arcToRelative(141.0f, 141.0f, 0.0f, false, false, 10.49f, -13.77f)
            arcToRelative(60.0f, 60.0f, 0.0f, false, false, 6.0f, -13.0f)
            curveToRelative(0.26f, -0.27f, 0.26f, -0.53f, 0.53f, -0.53f)
            curveToRelative(0.48f, 1.27f, 0.0f, 2.75f, -0.27f, 4.0f)
            arcTo(56.54f, 56.54f, 0.0f, false, true, 141.18f, 185.43f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(139.0f, 28.29f)
            arcToRelative(26.89f, 26.89f, 0.0f, false, true, 5.73f, 6.25f)
            curveToRelative(3.49f, 5.51f, 6.78f, 11.0f, 8.0f, 18.0f)
            curveToRelative(1.27f, 5.51f, 1.53f, 14.51f, 2.27f, 23.0f)
            curveToRelative(-0.53f, 0.27f, -0.53f, -0.48f, -0.74f, -0.74f)
            curveToRelative(-3.28f, -8.53f, -2.0f, -18.76f, -5.3f, -27.29f)
            curveTo(146.42f, 40.8f, 142.66f, 34.54f, 139.0f, 28.29f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(140.91f, 73.54f)
            curveToRelative(5.0f, 0.53f, 13.0f, 2.54f, 14.52f, 12.0f)
            curveToRelative(0.74f, 4.0f, -0.74f, 8.0f, -0.74f, 12.0f)
            curveToRelative(-0.74f, 2.49f, -0.74f, 5.51f, -2.76f, 7.26f)
            curveToRelative(0.75f, -4.77f, 0.75f, -5.78f, -0.47f, -8.27f)
            curveToRelative(0.0f, -1.0f, 1.22f, -2.0f, 0.47f, -3.0f)
            curveToRelative(-0.47f, -1.21f, -2.22f, -2.49f, -0.74f, -3.49f)
            curveToRelative(0.74f, -0.27f, 0.27f, -1.49f, 0.27f, -2.0f)
            lineToRelative(-1.27f, -3.7f)
            curveToRelative(0.26f, -0.8f, 1.27f, -2.0f, 0.47f, -3.0f)
            curveTo(148.7f, 77.3f, 143.93f, 76.56f, 140.91f, 73.54f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(157.18f, 106.86f)
            curveToRelative(-3.0f, -5.0f, 0.53f, -10.0f, 0.0f, -15.52f)
            curveToRelative(1.48f, 3.23f, 2.0f, 7.26f, 2.75f, 11.0f)
            curveToRelative(1.75f, 7.73f, 4.0f, 15.47f, 6.52f, 23.0f)
            horizontalLineToRelative(-0.26f)
            curveTo(163.0f, 119.37f, 160.68f, 112.85f, 157.18f, 106.86f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(148.44f, 183.16f)
            curveToRelative(4.77f, -5.25f, 8.0f, -11.77f, 10.22f, -17.75f)
            arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -0.53f)
            curveToRelative(1.0f, 2.49f, 0.74f, 6.25f, 0.26f, 8.26f)
            lineToRelative(-0.47f, 5.0f)
            reflectiveCurveTo(155.0f, 180.4f, 148.44f, 183.16f)
            close()
        }
        path(
            fill = SolidColor(Color(accentColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(160.68f, 130.33f)
            curveToRelative(-0.75f, -3.23f, -1.49f, -6.73f, -2.0f, -10.0f)
            curveToRelative(1.54f, 1.49f, 2.28f, 3.5f, 3.76f, 5.25f)
            arcToRelative(37.0f, 37.0f, 0.0f, false, false, 5.0f, 5.72f)
            arcToRelative(4.36f, 4.36f, 0.0f, false, false, -1.54f, 2.0f)
            arcToRelative(4.3f, 4.3f, 0.0f, false, false, 1.27f, 3.77f)
            curveToRelative(-0.74f, 1.27f, -1.75f, 2.22f, -2.28f, 3.76f)
            curveToRelative(0.0f, 0.74f, 1.28f, 1.48f, 0.53f, 2.22f)
            arcToRelative(15.0f, 15.0f, 0.0f, false, false, -2.0f, 1.75f)
            arcToRelative(7.16f, 7.16f, 0.0f, false, false, 1.27f, 3.29f)
            arcToRelative(18.76f, 18.76f, 0.0f, false, true, -1.27f, 6.46f)
            curveToRelative(-0.48f, 0.0f, -0.74f, -0.21f, -0.74f, -0.48f)
            curveTo(161.68f, 146.12f, 163.0f, 137.86f, 160.68f, 130.33f)
            close()
        }
    }
        .build()
}
