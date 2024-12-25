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

fun Woman.getYellow(iconColor: Long, accentColor: Long): ImageVector {
    return Builder(
        name = "Yellow1",
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
            moveTo(109.53f, 88.14f)
            curveToRelative(1.91f, -4.13f, 4.13f, -8.31f, 6.57f, -12.44f)
            curveToRelative(4.5f, -6.51f, 6.72f, -14.3f, 7.51f, -22.77f)
            curveToRelative(0.48f, -7.25f, -1.0f, -13.76f, -2.48f, -20.27f)
            curveToRelative(0.47f, 10.27f, 1.48f, 21.54f, -2.28f, 30.55f)
            arcToRelative(86.69f, 86.69f, 0.0f, false, true, -7.73f, 14.71f)
            curveToRelative(0.0f, -0.26f, 0.21f, -1.0f, 0.0f, -1.21f)
            arcToRelative(112.28f, 112.28f, 0.0f, false, false, 3.7f, -16.26f)
            arcToRelative(67.76f, 67.76f, 0.0f, false, false, -5.45f, -36.8f)
            curveToRelative(0.74f, 6.0f, 2.75f, 11.55f, 3.5f, 17.79f)
            curveToRelative(0.0f, 11.49f, 0.0f, 24.0f, -3.29f, 34.47f)
            horizontalLineToRelative(-0.74f)
            arcToRelative(110.34f, 110.34f, 0.0f, false, false, 1.75f, -13.5f)
            curveToRelative(0.53f, -7.25f, -0.74f, -13.5f, -2.22f, -20.0f)
            curveToRelative(-0.27f, -1.54f, -1.54f, -5.29f, -4.24f, -5.77f)
            curveToRelative(2.0f, 3.0f, 2.7f, 6.72f, 3.49f, 10.75f)
            curveToRelative(0.0f, 8.26f, -0.53f, 16.25f, -0.53f, 24.72f)
            arcToRelative(62.89f, 62.89f, 0.0f, false, true, -3.0f, 17.53f)
            curveToRelative(-3.0f, 5.24f, -5.51f, 10.48f, -9.53f, 15.51f)
            lineTo(93.38f, 105.15f)
            arcTo(76.46f, 76.46f, 0.0f, false, false, 102.59f, 82.0f)
            arcToRelative(60.42f, 60.42f, 0.0f, false, false, 0.75f, -25.26f)
            curveToRelative(0.0f, -8.0f, -1.49f, -15.51f, -7.21f, -21.28f)
            curveToRelative(-4.0f, -5.51f, -10.27f, -6.51f, -14.0f, -12.5f)
            curveToRelative(-1.74f, -4.0f, -5.45f, -7.0f, -8.2f, -10.74f)
            curveTo(72.15f, 11.0f, 69.66f, 9.41f, 67.12f, 9.94f)
            curveToRelative(2.54f, -2.0f, 4.77f, -4.5f, 8.26f, -3.28f)
            curveToRelative(4.77f, 2.0f, 7.25f, 7.25f, 12.0f, 9.26f)
            arcToRelative(31.51f, 31.51f, 0.0f, false, false, 8.21f, 1.49f)
            curveToRelative(-0.75f, -0.48f, -1.49f, -0.74f, -2.23f, -1.22f)
            curveToRelative(-5.0f, -1.54f, -9.26f, -5.77f, -12.76f, -10.27f)
            curveToRelative(2.0f, -0.48f, 4.24f, -1.27f, 6.25f, -1.75f)
            curveTo(92.64f, 2.9f, 99.1f, 3.64f, 103.6f, 7.4f)
            curveToRelative(2.28f, 1.75f, 4.5f, 3.76f, 6.51f, 5.51f)
            curveToRelative(0.27f, -0.48f, 0.0f, -1.0f, 0.0f, -1.22f)
            curveToRelative(-1.74f, -3.0f, -3.76f, -6.78f, -7.25f, -8.0f)
            curveToRelative(4.0f, 0.27f, 7.73f, 0.27f, 11.49f, 1.54f)
            arcTo(46.0f, 46.0f, 0.0f, false, true, 136.59f, 20.9f)
            curveToRelative(3.0f, 3.76f, 3.49f, 8.53f, 3.75f, 13.5f)
            curveToRelative(3.23f, 3.76f, 4.51f, 8.53f, 4.24f, 13.77f)
            arcToRelative(196.09f, 196.09f, 0.0f, false, true, -1.27f, 21.0f)
            curveToRelative(-2.49f, 6.51f, -7.47f, 11.75f, -13.24f, 16.73f)
            curveToRelative(-7.46f, 6.51f, -16.73f, 8.52f, -24.72f, 13.76f)
            lineToRelative(4.0f, -3.49f)
            curveToRelative(9.21f, -5.51f, 21.23f, -12.0f, 25.2f, -23.0f)
            curveToRelative(-5.71f, 4.5f, -9.74f, 11.0f, -15.72f, 15.51f)
            curveTo(115.62f, 91.0f, 111.6f, 92.0f, 108.1f, 93.44f)
            arcToRelative(19.1f, 19.1f, 0.0f, false, true, 3.0f, -3.5f)
            curveToRelative(4.5f, -4.5f, 6.72f, -10.0f, 9.48f, -15.25f)
            curveToRelative(2.48f, -5.0f, 6.72f, -9.53f, 10.0f, -14.24f)
            curveToRelative(-1.53f, 0.74f, -2.75f, 0.95f, -4.5f, 3.0f)
            curveTo(119.38f, 71.31f, 114.93f, 80.2f, 109.53f, 88.14f)
            close()
            moveTo(119.53f, 96.14f)
            curveToRelative(-1.75f, 1.32f, -2.91f, 3.23f, -4.45f, 4.77f)
            curveToRelative(-2.49f, 3.0f, -6.46f, 2.22f, -10.0f, 2.48f)
            lineToRelative(-0.53f, -0.26f)
            lineToRelative(5.5f, -4.24f)
            lineToRelative(6.25f, -2.48f)
            curveTo(117.37f, 96.46f, 118.53f, 95.71f, 119.54f, 96.19f)
            close()
            moveTo(23.43f, 185.14f)
            lineTo(35.93f, 192.14f)
            arcToRelative(65.12f, 65.12f, 0.0f, false, true, 0.21f, -15.72f)
            curveToRelative(-2.0f, -10.0f, -5.0f, -19.75f, -5.24f, -30.77f)
            curveToRelative(1.27f, -9.0f, 7.51f, -16.25f, 12.0f, -24.0f)
            arcToRelative(40.0f, 40.0f, 0.0f, false, false, 3.76f, -12.28f)
            horizontalLineToRelative(0.48f)
            arcToRelative(33.81f, 33.81f, 0.0f, false, true, -2.0f, 10.0f)
            curveToRelative(-1.22f, 5.0f, -5.24f, 8.74f, -7.73f, 13.24f)
            curveToRelative(-2.49f, 4.77f, -5.24f, 9.8f, -5.0f, 15.51f)
            curveToRelative(0.21f, 10.75f, 4.0f, 20.28f, 5.24f, 30.5f)
            curveToRelative(-1.53f, 4.77f, -0.53f, 9.27f, 0.0f, 14.24f)
            curveToRelative(13.5f, 7.52f, 31.72f, 8.79f, 47.44f, 5.0f)
            lineToRelative(4.24f, -2.0f)
            arcToRelative(77.57f, 77.57f, 0.0f, false, false, 9.74f, -25.25f)
            curveToRelative(1.27f, -6.0f, 1.27f, -12.5f, 1.0f, -18.75f)
            lineToRelative(0.74f, 0.74f)
            arcToRelative(124.0f, 124.0f, 0.0f, false, true, 0.26f, 14.0f)
            verticalLineToRelative(0.48f)
            curveToRelative(-1.48f, 9.53f, -3.76f, 18.74f, -7.73f, 27.27f)
            lineToRelative(7.26f, -4.24f)
            lineToRelative(12.0f, -11.0f)
            arcToRelative(11.77f, 11.77f, 0.0f, false, true, 2.75f, -1.48f)
            curveToRelative(0.75f, 3.23f, 1.49f, 6.72f, 2.23f, 9.74f)
            curveToRelative(4.0f, -0.53f, 7.78f, -4.29f, 12.0f, -2.54f)
            arcToRelative(50.71f, 50.71f, 0.0f, false, false, 10.74f, 3.28f)
            curveToRelative(2.76f, -3.76f, 3.71f, -8.52f, 5.0f, -12.76f)
            verticalLineToRelative(-0.53f)
            lineToRelative(3.0f, 3.76f)
            curveToRelative(3.23f, -0.48f, 7.0f, -0.21f, 10.48f, -0.74f)
            lineToRelative(2.23f, 1.75f)
            curveToRelative(3.0f, -0.48f, 5.77f, -1.22f, 8.73f, -1.49f)
            lineToRelative(1.54f, -3.28f)
            lineToRelative(5.24f, -3.0f)
            curveToRelative(-8.26f, -10.28f, -13.24f, -21.76f, -17.47f, -33.52f)
            curveToRelative(-2.0f, -6.25f, -2.76f, -13.24f, -5.51f, -19.27f)
            reflectiveCurveToRelative(-4.0f, -12.23f, -8.0f, -17.47f)
            curveToRelative(-4.24f, -5.51f, -10.0f, -10.0f, -16.26f, -12.0f)
            curveToRelative(7.26f, -6.73f, 15.0f, -13.77f, 16.73f, -23.25f)
            curveToRelative(0.0f, -9.74f, 1.75f, -20.27f, -1.74f, -29.0f)
            curveToRelative(-2.76f, -6.0f, -1.75f, -13.77f, -7.0f, -19.0f)
            arcToRelative(107.59f, 107.59f, 0.0f, false, false, -20.49f, -15.0f)
            curveToRelative(-6.25f, -3.5f, -14.46f, -1.54f, -21.5f, -3.28f)
            curveToRelative(-4.45f, -0.74f, -7.73f, 1.53f, -11.7f, 2.27f)
            curveToRelative(-6.0f, 1.22f, -13.24f, 0.0f, -17.74f, 5.0f)
            arcToRelative(20.31f, 20.31f, 0.0f, false, false, -5.77f, 8.0f)
            curveToRelative(-0.47f, 3.49f, -1.0f, 6.25f, -1.22f, 10.48f)
            curveToRelative(0.0f, 2.22f, -1.27f, 5.0f, -2.0f, 7.0f)
            curveToRelative(-1.0f, 4.0f, -2.27f, 7.52f, -2.0f, 11.75f)
            curveToRelative(0.53f, 1.75f, 1.75f, 3.23f, 2.0f, 5.25f)
            curveToRelative(-3.0f, 4.76f, -5.72f, 9.26f, -8.73f, 14.0f)
            curveToRelative(-0.27f, 1.21f, -1.0f, 2.48f, -0.27f, 3.7f)
            curveToRelative(1.48f, 2.28f, 3.76f, 3.55f, 5.51f, 5.3f)
            curveToRelative(0.74f, 2.0f, -1.0f, 5.0f, 0.74f, 6.72f)
            curveToRelative(-0.27f, 2.75f, 1.48f, 4.5f, 3.23f, 6.51f)
            curveToRelative(0.79f, 1.75f, -2.0f, 1.27f, -2.75f, 2.0f)
            curveToRelative(-5.25f, 4.0f, -7.73f, 10.0f, -11.49f, 15.0f)
            curveToRelative(-7.0f, 10.27f, -13.24f, 20.75f, -15.94f, 32.77f)
            curveToRelative(-2.28f, 10.49f, -2.28f, 21.76f, -3.0f, 32.72f)
            curveTo(23.92f, 174.18f, 23.44f, 179.69f, 23.44f, 185.19f)
            close()
            moveTo(43.43f, 153.37f)
            lineTo(39.2f, 147.66f)
            arcToRelative(60.0f, 60.0f, 0.0f, false, true, 5.5f, -3.29f)
            lineToRelative(-3.0f, 3.5f)
            lineToRelative(3.0f, 6.25f)
            curveToRelative(-0.74f, 1.0f, -1.75f, 1.8f, -2.0f, 3.0f)
            curveToRelative(1.48f, 3.0f, 3.49f, 6.0f, 5.0f, 9.27f)
            curveToRelative(-0.48f, 0.0f, -1.0f, -0.27f, -1.49f, -0.27f)
            curveToRelative(-2.0f, -3.0f, -4.23f, -6.0f, -6.24f, -9.0f)
            close()
            moveTo(41.21f, 191.37f)
            arcToRelative(5.82f, 5.82f, 0.0f, false, true, -0.27f, -5.72f)
            curveToRelative(0.48f, 0.0f, 1.0f, 0.21f, 1.27f, -0.26f)
            curveToRelative(4.24f, 5.0f, 9.75f, 8.73f, 15.0f, 11.75f)
            lineToRelative(-6.52f, -1.27f)
            curveTo(47.42f, 194.72f, 43.93f, 193.72f, 41.18f, 191.44f)
            close()
            moveTo(45.71f, 143.61f)
            arcToRelative(67.74f, 67.74f, 0.0f, false, true, -3.76f, -7.0f)
            curveToRelative(2.75f, -2.0f, 5.5f, -4.0f, 8.47f, -5.77f)
            curveToRelative(-0.48f, -2.49f, -1.48f, -5.0f, -2.0f, -7.73f)
            curveToRelative(3.23f, -1.27f, 6.46f, -2.49f, 9.48f, -3.76f)
            curveToRelative(-0.53f, -2.0f, -1.54f, -4.0f, -1.75f, -6.0f)
            arcToRelative(18.88f, 18.88f, 0.0f, false, true, 6.51f, -0.53f)
            verticalLineToRelative(0.53f)
            arcToRelative(15.3f, 15.3f, 0.0f, false, false, -4.5f, 1.22f)
            curveToRelative(0.0f, 2.54f, 1.0f, 4.5f, 1.0f, 7.0f)
            arcToRelative(68.42f, 68.42f, 0.0f, false, false, -8.0f, 2.49f)
            curveToRelative(0.0f, 2.75f, 0.75f, 5.51f, 0.75f, 8.26f)
            curveToRelative(-2.28f, 1.22f, -4.51f, 2.49f, -6.78f, 3.7f)
            curveTo(45.41f, 138.71f, 45.68f, 141.67f, 45.68f, 143.68f)
            close()
            moveTo(47.93f, 153.61f)
            arcToRelative(28.47f, 28.47f, 0.0f, false, true, 1.0f, -12.23f)
            curveToRelative(4.76f, -10.0f, 12.23f, -18.74f, 18.74f, -28.0f)
            curveToRelative(-3.0f, -3.49f, -5.51f, -7.52f, -9.48f, -10.0f)
            curveToRelative(-1.27f, -2.0f, 0.48f, -3.76f, 1.0f, -5.5f)
            arcToRelative(4.64f, 4.64f, 0.0f, false, true, 3.28f, -2.0f)
            lineToRelative(2.49f, 2.48f)
            arcToRelative(7.31f, 7.31f, 0.0f, false, false, 0.47f, 6.25f)
            curveToRelative(2.28f, 3.76f, 5.25f, 9.8f, 7.79f, 11.28f)
            curveToRelative(6.72f, 4.23f, 14.0f, 8.74f, 22.71f, 6.25f)
            arcToRelative(114.57f, 114.57f, 0.0f, false, false, 20.0f, -11.49f)
            curveToRelative(3.76f, -2.49f, 6.0f, -8.0f, 11.0f, -7.52f)
            curveToRelative(3.0f, 3.23f, 2.23f, 8.52f, 1.27f, 12.49f)
            horizontalLineToRelative(-0.53f)
            curveToRelative(-3.75f, -1.21f, -8.47f, -1.74f, -12.23f, 0.0f)
            curveToRelative(-8.73f, 4.0f, -17.47f, 9.0f, -27.95f, 8.0f)
            lineToRelative(-1.27f, 2.0f)
            curveToRelative(-7.52f, 13.0f, -19.49f, 24.25f, -21.71f, 39.29f)
            arcToRelative(29.47f, 29.47f, 0.0f, false, false, -1.0f, 6.72f)
            curveToRelative(-0.26f, 3.76f, 0.0f, 6.78f, -0.26f, 10.54f)
            curveToRelative(-1.0f, -0.27f, -2.22f, 0.0f, -3.0f, -0.27f)
            curveToRelative(-0.21f, -7.52f, 1.54f, -14.5f, 3.0f, -21.28f)
            curveToRelative(3.49f, -14.24f, 14.24f, -25.47f, 21.71f, -37.75f)
            curveToRelative(-5.24f, -1.75f, -10.0f, -4.5f, -14.72f, -7.0f)
            curveToRelative(-0.74f, -0.53f, -1.27f, -1.27f, -1.75f, -1.0f)
            lineToRelative(-2.28f, 3.5f)
            curveToRelative(-7.0f, 11.0f, -17.68f, 20.75f, -15.93f, 35.26f)
            lineTo(52.4f, 173.0f)
            verticalLineToRelative(6.73f)
            arcToRelative(2.42f, 2.42f, 0.0f, false, true, -1.22f, -0.22f)
            curveTo(49.91f, 171.0f, 48.64f, 162.21f, 47.9f, 153.69f)
            close()
            moveTo(48.67f, 189.35f)
            curveToRelative(-2.0f, -1.75f, -4.71f, -3.23f, -5.72f, -5.72f)
            curveToRelative(5.51f, 2.49f, 10.49f, 6.72f, 15.0f, 11.22f)
            arcTo(37.26f, 37.26f, 0.0f, false, true, 48.64f, 189.43f)
            close()
            moveTo(53.17f, 70.35f)
            curveToRelative(-1.0f, -0.75f, -4.0f, -2.23f, -3.76f, -4.0f)
            lineToRelative(0.27f, -0.74f)
            curveToRelative(1.53f, -5.77f, 6.0f, -10.27f, 9.0f, -15.51f)
            arcToRelative(20.59f, 20.59f, 0.0f, false, true, -1.48f, -4.24f)
            curveToRelative(1.48f, -0.79f, 3.23f, 0.22f, 4.71f, 0.22f)
            curveToRelative(1.0f, 2.75f, 1.27f, 5.5f, 2.28f, 8.0f)
            arcToRelative(10.7f, 10.7f, 0.0f, false, false, -3.0f, 0.75f)
            curveToRelative(1.0f, 1.48f, 3.0f, 0.47f, 4.23f, 1.0f)
            curveToRelative(0.53f, 0.95f, 1.0f, 2.0f, 1.54f, 2.75f)
            arcToRelative(20.48f, 20.48f, 0.0f, false, false, 8.0f, -3.75f)
            arcToRelative(14.13f, 14.13f, 0.0f, false, false, -1.0f, -3.29f)
            lineToRelative(-8.0f, 1.75f)
            arcToRelative(7.74f, 7.74f, 0.0f, false, true, -2.0f, -6.51f)
            arcToRelative(22.61f, 22.61f, 0.0f, false, true, 5.77f, 1.0f)
            curveToRelative(2.0f, 0.0f, 2.49f, 3.0f, 4.5f, 3.29f)
            arcToRelative(13.59f, 13.59f, 0.0f, false, true, -0.79f, -2.49f)
            curveToRelative(-1.75f, -2.0f, -4.5f, -2.0f, -6.73f, -2.76f)
            arcToRelative(12.38f, 12.38f, 0.0f, false, true, 11.0f, 2.0f)
            lineToRelative(-0.53f, -2.22f)
            curveToRelative(-5.24f, -6.0f, -14.25f, -0.26f, -20.49f, -3.76f)
            lineToRelative(-0.27f, -0.26f)
            curveToRelative(0.0f, -6.46f, 3.29f, -12.76f, 8.05f, -17.74f)
            horizontalLineToRelative(0.21f)
            arcToRelative(12.45f, 12.45f, 0.0f, false, true, 7.73f, 8.52f)
            arcToRelative(19.0f, 19.0f, 0.0f, false, false, 5.77f, 10.49f)
            curveToRelative(4.0f, 3.76f, 8.74f, 6.72f, 10.49f, 12.0f)
            curveToRelative(2.0f, 5.24f, -0.74f, 12.23f, 4.0f, 16.0f)
            arcToRelative(10.07f, 10.07f, 0.0f, false, true, 1.0f, -8.53f)
            curveToRelative(1.27f, 1.54f, 3.29f, 2.28f, 4.29f, 4.29f)
            lineToRelative(0.21f, 3.0f)
            curveToRelative(0.8f, 1.75f, 2.55f, 1.75f, 4.0f, 2.49f)
            lineToRelative(-0.27f, 3.0f)
            arcToRelative(4.4f, 4.4f, 0.0f, false, true, -1.74f, -0.21f)
            curveToRelative(-2.0f, -0.8f, -2.23f, -2.81f, -2.76f, -4.29f)
            arcToRelative(7.38f, 7.38f, 0.0f, false, true, -0.74f, 0.74f)
            curveToRelative(-0.48f, 1.75f, 0.48f, 5.0f, 2.0f, 5.77f)
            arcToRelative(18.6f, 18.6f, 0.0f, false, true, 3.23f, 0.74f)
            curveToRelative(-0.74f, 3.29f, -1.74f, 6.78f, -3.76f, 9.53f)
            curveToRelative(-7.46f, 6.25f, -17.2f, 7.47f, -26.47f, 9.0f)
            curveToRelative(-2.22f, 0.21f, -4.5f, 0.47f, -6.46f, -0.75f)
            arcToRelative(10.6f, 10.6f, 0.0f, false, true, -5.0f, -7.0f)
            curveToRelative(-0.74f, -4.76f, 3.5f, -4.0f, 4.77f, -6.51f)
            curveToRelative(-2.49f, 0.26f, -7.26f, 3.0f, -8.74f, 0.26f)
            verticalLineToRelative(-0.26f)
            curveToRelative(-0.26f, -1.0f, -1.0f, -1.48f, -0.53f, -2.49f)
            curveToRelative(4.5f, 0.27f, 9.53f, 1.27f, 14.0f, -0.21f)
            arcToRelative(18.91f, 18.91f, 0.0f, false, true, -0.26f, 3.71f)
            curveToRelative(1.74f, -0.75f, 2.22f, -3.5f, 2.0f, -4.72f)
            curveToRelative(-2.75f, -7.25f, -12.0f, -10.27f, -14.0f, -17.79f)
            curveToRelative(-1.0f, 1.0f, 0.0f, 2.76f, -1.0f, 3.76f)
            lineToRelative(1.27f, 1.75f)
            curveToRelative(0.27f, 1.0f, 1.75f, 2.49f, 0.27f, 3.0f)
            curveToRelative(-0.74f, -0.74f, -2.0f, -1.0f, -3.0f, -1.54f)
            curveToRelative(-1.0f, -0.21f, -2.22f, -1.0f, -3.23f, 0.0f)
            close()
            moveTo(52.43f, 154.35f)
            arcToRelative(27.17f, 27.17f, 0.0f, false, true, 3.76f, -17.26f)
            curveToRelative(3.5f, -5.0f, 5.0f, -11.75f, 11.0f, -14.72f)
            verticalLineToRelative(1.22f)
            lineToRelative(-1.75f, 3.76f)
            curveToRelative(-2.22f, 2.75f, -5.45f, 5.24f, -6.0f, 8.73f)
            curveToRelative(-1.75f, 2.81f, -2.22f, 6.31f, -2.75f, 9.8f)
            arcToRelative(19.92f, 19.92f, 0.0f, false, false, -2.49f, 9.48f)
            arcToRelative(56.33f, 56.33f, 0.0f, false, true, 0.48f, 14.5f)
            curveTo(53.67f, 165.0f, 52.88f, 159.67f, 52.4f, 154.43f)
            close()
            moveTo(55.43f, 108.13f)
            curveToRelative(-1.27f, -4.29f, -1.27f, -8.26f, -1.0f, -12.76f)
            curveToRelative(0.74f, -1.75f, 2.49f, -3.0f, 4.0f, -4.0f)
            lineToRelative(1.54f, 2.75f)
            lineToRelative(-0.26f, 0.26f)
            curveToRelative(-1.49f, 1.75f, -3.29f, 4.24f, -3.5f, 6.73f)
            curveToRelative(-1.53f, 4.76f, 5.72f, 6.24f, 6.0f, 10.53f)
            curveTo(59.92f, 110.7f, 57.64f, 109.43f, 55.42f, 108.21f)
            close()
            moveTo(55.16f, 76.84f)
            lineTo(55.43f, 76.36f)
            arcToRelative(10.86f, 10.86f, 0.0f, false, false, -1.0f, -5.0f)
            curveToRelative(1.75f, -0.74f, 3.0f, -0.21f, 4.5f, -0.74f)
            curveToRelative(2.23f, -0.26f, 0.48f, -2.22f, 2.23f, -2.49f)
            arcToRelative(8.59f, 8.59f, 0.0f, false, false, 2.75f, 3.23f)
            lineToRelative(0.27f, 0.27f)
            curveToRelative(0.26f, 0.26f, 4.5f, 3.28f, 4.5f, 5.77f)
            curveToRelative(-2.0f, 1.0f, -4.77f, 1.74f, -7.0f, 1.0f)
            curveTo(56.64f, 76.92f, 57.38f, 76.44f, 55.15f, 76.92f)
            close()
            moveTo(55.43f, 154.35f)
            curveToRelative(-0.27f, -3.23f, 2.49f, -5.0f, 3.23f, -8.0f)
            curveToRelative(0.0f, -3.5f, 0.26f, -7.26f, 3.0f, -9.75f)
            lineToRelative(0.47f, -3.0f)
            curveToRelative(1.0f, -2.49f, 5.25f, -2.76f, 4.77f, -6.0f)
            curveToRelative(1.0f, -3.0f, 4.23f, -2.75f, 6.0f, -4.0f)
            arcToRelative(14.53f, 14.53f, 0.0f, false, true, -1.75f, -2.49f)
            arcToRelative(37.83f, 37.83f, 0.0f, false, true, 5.72f, 4.0f)
            lineToRelative(-0.47f, 0.22f)
            curveToRelative(-2.23f, 1.27f, -5.0f, 1.27f, -7.52f, 2.27f)
            curveToRelative(-0.74f, 1.49f, -0.74f, 3.23f, -1.22f, 4.5f)
            curveToRelative(-1.75f, 0.0f, -1.75f, 0.48f, -2.49f, 1.0f)
            curveToRelative(-1.53f, 1.75f, -0.74f, 3.0f, -2.0f, 5.0f)
            arcToRelative(4.27f, 4.27f, 0.0f, false, false, -2.49f, 3.28f)
            arcToRelative(8.35f, 8.35f, 0.0f, false, true, -0.26f, 6.0f)
            arcToRelative(18.0f, 18.0f, 0.0f, false, false, -4.24f, 10.27f)
            close()
            moveTo(55.91f, 189.35f)
            curveToRelative(-1.0f, -0.74f, -2.76f, -1.75f, -3.0f, -3.0f)
            arcToRelative(99.17f, 99.17f, 0.0f, false, false, 9.53f, 4.0f)
            curveToRelative(3.49f, 1.54f, 7.0f, 2.76f, 9.74f, 5.78f)
            lineToRelative(-0.74f, 0.26f)
            curveTo(66.38f, 194.19f, 61.14f, 191.44f, 55.9f, 189.43f)
            close()
            moveTo(57.64f, 166.0f)
            lineToRelative(-1.0f, -3.28f)
            curveToRelative(2.27f, -4.24f, 2.49f, -10.48f, 5.0f, -14.77f)
            curveToRelative(1.74f, -2.0f, 1.21f, -5.24f, 2.0f, -7.73f)
            curveToRelative(2.48f, -1.22f, 2.27f, -3.76f, 3.76f, -5.51f)
            lineToRelative(2.27f, -1.75f)
            arcToRelative(20.7f, 20.7f, 0.0f, false, true, 1.75f, -4.0f)
            curveToRelative(1.0f, -0.53f, 2.0f, -0.79f, 3.0f, -1.27f)
            arcToRelative(20.82f, 20.82f, 0.0f, false, true, 4.0f, 0.0f)
            arcToRelative(58.78f, 58.78f, 0.0f, false, true, -5.51f, 7.52f)
            curveToRelative(-6.25f, 10.0f, -12.49f, 20.23f, -15.0f, 31.5f)
            close()
            moveTo(62.41f, 23.65f)
            curveToRelative(-0.27f, 0.53f, -0.74f, 1.28f, -1.27f, 1.0f)
            arcToRelative(65.0f, 65.0f, 0.0f, false, true, 1.0f, -9.48f)
            curveToRelative(0.74f, -2.0f, 3.76f, -4.0f, 5.0f, -3.28f)
            curveToRelative(1.27f, 0.27f, 2.54f, 0.53f, 3.28f, 1.8f)
            arcTo(19.2f, 19.2f, 0.0f, false, false, 62.41f, 23.65f)
            close()
            moveTo(63.41f, 197.48f)
            curveToRelative(-2.0f, -1.27f, -3.28f, -3.55f, -4.5f, -5.3f)
            curveToRelative(3.23f, 1.27f, 6.25f, 3.28f, 9.22f, 4.77f)
            lineToRelative(0.74f, 0.74f)
            close()
            moveTo(66.11f, 168.67f)
            curveToRelative(-1.0f, 0.8f, -0.74f, -0.47f, -1.0f, -0.95f)
            curveToRelative(1.75f, -1.27f, 3.5f, -2.28f, 5.24f, -3.76f)
            curveToRelative(-0.26f, -1.53f, -1.27f, -3.0f, -1.53f, -4.5f)
            lineToRelative(6.51f, -3.28f)
            lineToRelative(-1.22f, -6.25f)
            curveToRelative(2.23f, -0.48f, 4.71f, -1.48f, 7.0f, -2.22f)
            verticalLineToRelative(-6.0f)
            lineToRelative(0.21f, -0.21f)
            curveToRelative(2.0f, -0.74f, 4.24f, -1.54f, 6.25f, -2.49f)
            arcToRelative(64.0f, 64.0f, 0.0f, false, true, -1.22f, -7.0f)
            curveToRelative(2.0f, -0.48f, 4.0f, -1.0f, 6.25f, -1.48f)
            lineToRelative(-0.74f, -2.76f)
            arcToRelative(6.37f, 6.37f, 0.0f, false, true, 2.22f, 0.0f)
            verticalLineToRelative(3.23f)
            curveToRelative(-1.48f, 1.27f, -3.23f, 1.75f, -4.76f, 3.0f)
            curveToRelative(0.0f, 1.75f, 1.0f, 3.76f, 0.79f, 5.77f)
            lineToRelative(-6.78f, 4.0f)
            lineToRelative(-0.47f, 4.24f)
            lineToRelative(-6.25f, 3.76f)
            curveToRelative(0.21f, 1.74f, 0.21f, 3.28f, 0.48f, 4.76f)
            lineToRelative(-5.72f, 3.76f)
            curveToRelative(-0.27f, 1.27f, 0.48f, 2.76f, 0.74f, 4.24f)
            arcTo(41.25f, 41.25f, 0.0f, false, true, 66.11f, 168.67f)
            close()
            moveTo(74.9f, 114.93f)
            curveToRelative(-4.5f, -3.0f, -9.53f, -10.0f, -8.26f, -17.0f)
            arcToRelative(14.4f, 14.4f, 0.0f, false, true, 3.23f, 0.47f)
            curveToRelative(1.0f, 3.0f, 3.0f, 6.78f, 5.0f, 8.53f)
            arcToRelative(51.2f, 51.2f, 0.0f, false, false, 8.21f, 5.24f)
            curveToRelative(7.0f, 3.49f, 16.25f, 0.74f, 24.0f, 2.0f)
            arcToRelative(74.0f, 74.0f, 0.0f, false, true, -11.48f, 6.51f)
            curveTo(87.61f, 123.19f, 80.89f, 119.0f, 74.9f, 114.93f)
            close()
            moveTo(70.14f, 189.22f)
            curveToRelative(-3.5f, -1.75f, -7.47f, -2.28f, -11.0f, -4.29f)
            curveToRelative(8.26f, 1.8f, 16.25f, 4.29f, 23.24f, 9.0f)
            lineToRelative(0.53f, 0.53f)
            lineToRelative(-3.0f, -0.27f)
            curveTo(76.65f, 192.71f, 73.16f, 191.44f, 70.14f, 189.22f)
            close()
            moveTo(72.63f, 99.22f)
            lineTo(74.63f, 98.69f)
            curveToRelative(1.75f, 1.48f, 3.0f, 3.49f, 4.5f, 5.0f)
            curveToRelative(5.51f, 4.0f, 12.49f, 4.5f, 19.22f, 4.23f)
            curveToRelative(3.49f, -0.26f, 7.0f, -1.74f, 10.75f, -1.27f)
            arcToRelative(40.2f, 40.2f, 0.0f, false, true, -5.51f, 3.76f)
            curveToRelative(-4.0f, 2.0f, -7.47f, 1.0f, -12.23f, 1.49f)
            curveToRelative(-5.77f, 0.0f, -10.48f, -3.0f, -14.72f, -6.46f)
            curveTo(74.64f, 103.71f, 73.9f, 101.17f, 72.63f, 99.21f)
            close()
            moveTo(67.91f, 184.73f)
            curveToRelative(2.49f, 0.0f, 4.45f, 1.0f, 6.73f, 1.0f)
            curveToRelative(4.23f, 2.0f, 9.0f, 3.0f, 12.76f, 5.72f)
            arcToRelative(1.66f, 1.66f, 0.0f, false, true, -1.0f, 1.48f)
            curveToRelative(-4.0f, -0.74f, -7.0f, -3.23f, -10.48f, -5.24f)
            arcTo(72.65f, 72.65f, 0.0f, false, true, 67.91f, 184.72f)
            close()
            moveTo(75.12f, 196.22f)
            curveToRelative(-4.24f, -3.76f, -9.48f, -4.51f, -13.45f, -8.53f)
            arcToRelative(98.89f, 98.89f, 0.0f, false, true, 18.48f, 8.79f)
            arcTo(18.08f, 18.08f, 0.0f, false, true, 75.12f, 196.21f)
            close()
            moveTo(78.87f, 184.73f)
            lineTo(77.39f, 183.19f)
            curveToRelative(5.24f, 0.79f, 11.23f, 0.0f, 16.0f, 0.0f)
            lineToRelative(0.21f, 0.27f)
            arcToRelative(20.0f, 20.0f, 0.0f, false, true, -1.69f, 4.23f)
            curveToRelative(-1.27f, 0.8f, -2.28f, 1.54f, -3.55f, 1.54f)
            close()
            moveTo(77.13f, 97.46f)
            curveToRelative(1.27f, 0.0f, 2.49f, -0.79f, 3.76f, -1.0f)
            curveToRelative(1.21f, 1.48f, 1.48f, 3.22f, 2.22f, 5.0f)
            curveToRelative(0.74f, -1.48f, 0.53f, -3.0f, 0.53f, -4.76f)
            arcToRelative(61.0f, 61.0f, 0.0f, false, false, 15.0f, -8.0f)
            lineToRelative(-0.26f, 0.53f)
            arcToRelative(47.72f, 47.72f, 0.0f, false, false, -1.75f, 4.5f)
            arcToRelative(38.35f, 38.35f, 0.0f, false, true, -5.24f, 9.74f)
            arcToRelative(2.59f, 2.59f, 0.0f, false, true, -2.22f, 1.75f)
            curveTo(84.12f, 104.66f, 78.61f, 102.91f, 77.13f, 97.46f)
            close()
            moveTo(107.36f, 111.7f)
            lineTo(108.36f, 109.7f)
            curveToRelative(3.23f, -3.28f, 5.5f, -7.52f, 9.74f, -9.74f)
            lineToRelative(1.0f, -0.27f)
            curveToRelative(-3.0f, 4.0f, -5.77f, 7.73f, -9.0f, 11.76f)
            curveTo(109.37f, 112.18f, 108.37f, 111.92f, 107.36f, 111.7f)
            close()
            moveTo(115.83f, 108.42f)
            verticalLineToRelative(-0.21f)
            curveToRelative(0.27f, -0.53f, 0.53f, -1.27f, 0.0f, -1.54f)
            lineToRelative(4.29f, -6.0f)
            curveToRelative(2.7f, -4.23f, 7.2f, -7.25f, 12.71f, -6.25f)
            curveToRelative(4.23f, 1.49f, 8.73f, 9.75f, 8.52f, 16.73f)
            curveToRelative(-0.26f, 8.0f, -1.53f, 16.0f, -1.75f, 24.25f)
            curveToRelative(-1.74f, 9.27f, 0.22f, 19.0f, 1.75f, 27.8f)
            curveToRelative(1.22f, 7.2f, 1.0f, 16.0f, -2.54f, 22.0f)
            curveToRelative(-3.71f, -1.74f, -8.0f, -1.74f, -12.0f, -2.75f)
            curveToRelative(2.0f, -3.0f, 3.0f, -6.0f, 4.24f, -9.27f)
            curveToRelative(4.23f, -10.48f, 6.51f, -22.71f, 3.28f, -34.46f)
            lineToRelative(-5.29f, -12.0f)
            curveToRelative(2.0f, -7.26f, 3.0f, -15.52f, 1.0f, -23.0f)
            arcToRelative(7.46f, 7.46f, 0.0f, false, true, 3.29f, 1.48f)
            arcToRelative(70.67f, 70.67f, 0.0f, false, true, 5.24f, 8.74f)
            curveToRelative(0.47f, -1.22f, 0.21f, -2.76f, 0.21f, -4.0f)
            curveToRelative(-0.74f, -5.77f, -6.46f, -9.27f, -11.0f, -11.76f)
            arcToRelative(2.06f, 2.06f, 0.0f, false, true, 1.75f, -0.26f)
            curveToRelative(4.0f, 0.0f, 6.93f, 3.17f, 9.47f, 6.19f)
            curveToRelative(0.0f, -1.27f, -0.74f, -2.43f, -1.48f, -4.0f)
            arcToRelative(9.44f, 9.44f, 0.0f, false, false, -10.0f, -4.23f)
            curveTo(121.13f, 96.93f, 120.12f, 104.66f, 115.83f, 108.42f)
            close()
            moveTo(118.58f, 184.0f)
            arcToRelative(24.17f, 24.17f, 0.0f, false, false, -4.5f, -11.75f)
            curveToRelative(3.5f, -3.76f, 8.0f, -6.25f, 10.28f, -11.0f)
            curveToRelative(4.71f, -5.0f, 5.0f, -12.29f, 9.21f, -17.74f)
            lineToRelative(-0.21f, 8.47f)
            curveToRelative(-1.0f, 6.51f, -1.27f, 13.24f, -4.0f, 19.27f)
            curveTo(127.11f, 175.93f, 124.57f, 182.44f, 118.58f, 184.0f)
            close()
            moveTo(140.82f, 152.0f)
            curveToRelative(-0.48f, -3.0f, 0.0f, -5.5f, 0.0f, -8.47f)
            curveToRelative(0.53f, -5.51f, 1.0f, -11.28f, 1.75f, -17.0f)
            curveToRelative(0.53f, -4.71f, 0.53f, -9.47f, 1.75f, -14.0f)
            curveToRelative(1.53f, 4.24f, 3.0f, 8.74f, 4.76f, 12.76f)
            verticalLineToRelative(1.22f)
            curveToRelative(0.27f, 5.51f, -0.26f, 9.0f, -2.49f, 13.5f)
            curveTo(144.58f, 144.0f, 143.1f, 148.18f, 140.82f, 151.94f)
            close()
            moveTo(142.3f, 102.0f)
            lineTo(145.85f, 106.24f)
            arcTo(73.08f, 73.08f, 0.0f, false, true, 154.06f, 126.0f)
            curveToRelative(3.49f, 9.74f, -2.49f, 18.74f, -5.0f, 27.74f)
            lineToRelative(-3.23f, 13.24f)
            arcToRelative(28.0f, 28.0f, 0.0f, false, true, -2.75f, -4.72f)
            curveToRelative(-1.75f, -5.5f, -1.27f, -8.52f, 0.21f, -12.0f)
            curveToRelative(3.76f, -6.52f, 8.0f, -15.0f, 7.52f, -21.5f)
            curveTo(150.35f, 123.67f, 147.07f, 110.17f, 142.3f, 102.0f)
            close()
            moveTo(149.3f, 175.49f)
            curveToRelative(-2.28f, -4.24f, -0.53f, -9.48f, -0.27f, -14.0f)
            arcToRelative(88.89f, 88.89f, 0.0f, false, true, 6.73f, -19.8f)
            verticalLineToRelative(9.27f)
            curveToRelative(-0.27f, 5.0f, 2.75f, 11.49f, 5.77f, 16.25f)
            lineToRelative(5.5f, 9.27f)
            lineToRelative(-1.27f, 0.26f)
            lineToRelative(-5.0f, 0.21f)
            lineToRelative(1.0f, -3.49f)
            lineToRelative(-0.53f, -1.22f)
            curveTo(157.34f, 173.17f, 153.32f, 174.71f, 149.35f, 175.45f)
            close()
            moveTo(159.51f, 159.24f)
            curveToRelative(-2.22f, -5.78f, -1.0f, -12.5f, -2.0f, -18.75f)
            curveToRelative(2.28f, 6.0f, 4.77f, 13.24f, 8.0f, 19.0f)
            lineToRelative(0.74f, 2.0f)
            curveToRelative(2.54f, 4.0f, 5.0f, 6.73f, 7.25f, 10.22f)
            lineToRelative(-4.71f, 3.5f)
            lineToRelative(-0.27f, 0.26f)
            lineToRelative(-2.27f, -2.75f)
            curveTo(164.33f, 168.2f, 161.31f, 164.0f, 159.56f, 159.2f)
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
            moveTo(48.91f, 141.46f)
            arcToRelative(28.47f, 28.47f, 0.0f, false, false, -1.0f, 12.23f)
            curveToRelative(0.74f, 8.52f, 2.0f, 17.26f, 3.28f, 25.78f)
            arcToRelative(2.42f, 2.42f, 0.0f, false, false, 1.22f, 0.22f)
            verticalLineTo(173.0f)
            lineToRelative(-2.22f, -19.27f)
            curveToRelative(-1.75f, -14.51f, 9.0f, -24.25f, 15.93f, -35.26f)
            lineToRelative(2.28f, -3.5f)
            curveToRelative(0.48f, -0.26f, 1.0f, 0.48f, 1.75f, 1.0f)
            curveToRelative(4.76f, 2.49f, 9.48f, 5.24f, 14.72f, 7.0f)
            curveToRelative(-7.47f, 12.28f, -18.22f, 23.51f, -21.71f, 37.75f)
            curveToRelative(-1.48f, 6.78f, -3.23f, 13.76f, -3.0f, 21.28f)
            curveToRelative(0.8f, 0.27f, 2.0f, 0.0f, 3.0f, 0.27f)
            curveToRelative(0.26f, -3.76f, 0.0f, -6.78f, 0.26f, -10.54f)
            arcToRelative(29.47f, 29.47f, 0.0f, false, true, 1.0f, -6.72f)
            curveToRelative(2.22f, -15.0f, 14.19f, -26.26f, 21.71f, -39.29f)
            lineToRelative(1.27f, -2.0f)
            curveToRelative(10.48f, 1.0f, 19.22f, -4.0f, 27.95f, -8.0f)
            curveToRelative(3.76f, -1.74f, 8.48f, -1.21f, 12.23f, 0.0f)
            horizontalLineToRelative(0.53f)
            curveToRelative(1.0f, -4.0f, 1.75f, -9.26f, -1.27f, -12.49f)
            curveToRelative(-5.0f, -0.48f, -7.25f, 5.0f, -11.0f, 7.52f)
            arcToRelative(114.57f, 114.57f, 0.0f, false, true, -20.0f, 11.49f)
            curveToRelative(-8.74f, 2.49f, -16.0f, -2.0f, -22.71f, -6.25f)
            curveToRelative(-2.54f, -1.48f, -5.51f, -7.52f, -7.79f, -11.28f)
            arcToRelative(7.31f, 7.31f, 0.0f, false, true, -0.47f, -6.25f)
            lineToRelative(-2.49f, -2.48f)
            arcToRelative(4.64f, 4.64f, 0.0f, false, false, -3.28f, 2.0f)
            curveToRelative(-0.48f, 1.74f, -2.23f, 3.49f, -1.0f, 5.5f)
            curveToRelative(4.0f, 2.49f, 6.46f, 6.52f, 9.48f, 10.0f)
            curveTo(61.14f, 122.72f, 53.67f, 131.45f, 48.91f, 141.46f)
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
            moveTo(49.38f, 66.43f)
            curveToRelative(-0.21f, 1.75f, 2.76f, 3.23f, 3.76f, 4.0f)
            lineToRelative(-1.48f, -2.76f)
            curveToRelative(1.0f, -1.0f, 2.22f, -0.21f, 3.23f, 0.0f)
            curveToRelative(1.0f, 0.53f, 2.28f, 0.8f, 3.0f, 1.54f)
            curveToRelative(1.48f, -0.53f, 0.0f, -2.0f, -0.27f, -3.0f)
            lineToRelative(-1.27f, -1.75f)
            curveToRelative(1.0f, -1.0f, 0.0f, -2.75f, 1.0f, -3.76f)
            curveToRelative(2.0f, 7.52f, 11.28f, 10.54f, 14.0f, 17.79f)
            curveToRelative(0.21f, 1.22f, -0.27f, 4.0f, -2.0f, 4.72f)
            arcToRelative(18.91f, 18.91f, 0.0f, false, false, 0.26f, -3.71f)
            curveToRelative(-4.5f, 1.48f, -9.53f, 0.48f, -14.0f, 0.21f)
            curveToRelative(-0.48f, 1.0f, 0.27f, 1.54f, 0.53f, 2.49f)
            verticalLineToRelative(0.26f)
            curveToRelative(1.48f, 2.76f, 6.25f, 0.0f, 8.74f, -0.26f)
            curveToRelative(-1.27f, 2.54f, -5.51f, 1.75f, -4.77f, 6.51f)
            arcToRelative(10.6f, 10.6f, 0.0f, false, false, 5.0f, 7.0f)
            curveToRelative(2.0f, 1.22f, 4.24f, 1.0f, 6.46f, 0.75f)
            curveToRelative(9.27f, -1.54f, 19.0f, -2.76f, 26.47f, -9.0f)
            curveToRelative(2.0f, -2.75f, 3.0f, -6.24f, 3.76f, -9.53f)
            arcToRelative(18.6f, 18.6f, 0.0f, false, false, -3.23f, -0.74f)
            curveToRelative(-1.53f, -0.74f, -2.49f, -4.0f, -2.0f, -5.77f)
            arcToRelative(7.38f, 7.38f, 0.0f, false, false, 0.74f, -0.74f)
            curveToRelative(0.53f, 1.48f, 0.74f, 3.49f, 2.76f, 4.29f)
            arcToRelative(4.4f, 4.4f, 0.0f, false, false, 1.74f, 0.21f)
            lineToRelative(0.27f, -3.0f)
            curveToRelative(-1.48f, -0.74f, -3.23f, -0.74f, -4.0f, -2.49f)
            lineToRelative(-0.21f, -3.0f)
            curveToRelative(-1.0f, -2.0f, -3.0f, -2.75f, -4.29f, -4.29f)
            arcToRelative(10.07f, 10.07f, 0.0f, false, false, -1.0f, 8.53f)
            curveToRelative(-4.76f, -3.76f, -2.0f, -10.75f, -4.0f, -16.0f)
            curveToRelative(-1.75f, -5.3f, -6.52f, -8.26f, -10.49f, -12.0f)
            arcToRelative(19.0f, 19.0f, 0.0f, false, true, -5.77f, -10.49f)
            arcToRelative(12.45f, 12.45f, 0.0f, false, false, -7.73f, -8.52f)
            horizontalLineToRelative(-0.21f)
            curveToRelative(-4.76f, 5.0f, -8.05f, 11.28f, -8.05f, 17.74f)
            lineToRelative(0.27f, 0.26f)
            curveToRelative(6.24f, 3.5f, 15.25f, -2.22f, 20.49f, 3.76f)
            lineToRelative(0.53f, 2.22f)
            arcToRelative(12.38f, 12.38f, 0.0f, false, false, -11.0f, -2.0f)
            curveToRelative(2.23f, 0.75f, 5.0f, 0.75f, 6.73f, 2.76f)
            arcToRelative(13.59f, 13.59f, 0.0f, false, false, 0.79f, 2.49f)
            curveToRelative(-2.0f, -0.27f, -2.54f, -3.29f, -4.5f, -3.29f)
            arcToRelative(22.61f, 22.61f, 0.0f, false, false, -5.77f, -1.0f)
            arcToRelative(7.74f, 7.74f, 0.0f, false, false, 2.0f, 6.51f)
            lineToRelative(8.0f, -1.75f)
            arcToRelative(14.13f, 14.13f, 0.0f, false, true, 1.0f, 3.29f)
            arcToRelative(20.48f, 20.48f, 0.0f, false, true, -8.0f, 3.75f)
            curveToRelative(-0.53f, -0.79f, -1.0f, -1.8f, -1.54f, -2.75f)
            curveToRelative(-1.21f, -0.53f, -3.23f, 0.48f, -4.23f, -1.0f)
            arcToRelative(10.7f, 10.7f, 0.0f, false, true, 3.0f, -0.75f)
            curveToRelative(-1.0f, -2.54f, -1.28f, -5.29f, -2.28f, -8.0f)
            curveToRelative(-1.48f, 0.0f, -3.23f, -1.0f, -4.71f, -0.22f)
            arcToRelative(20.59f, 20.59f, 0.0f, false, false, 1.48f, 4.24f)
            curveToRelative(-3.0f, 5.24f, -7.47f, 9.74f, -9.0f, 15.51f)
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
            moveTo(54.41f, 95.45f)
            curveToRelative(-0.26f, 4.5f, -0.26f, 8.47f, 1.0f, 12.76f)
            curveToRelative(2.22f, 1.22f, 4.5f, 2.49f, 6.72f, 3.49f)
            curveToRelative(-0.26f, -4.29f, -7.51f, -5.77f, -6.0f, -10.53f)
            curveToRelative(0.21f, -2.49f, 2.0f, -5.0f, 3.5f, -6.73f)
            lineToRelative(0.26f, -0.26f)
            lineToRelative(-1.54f, -2.75f)
            curveTo(56.9f, 92.43f, 55.15f, 93.7f, 54.41f, 95.45f)
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
            moveTo(55.42f, 76.44f)
            lineToRelative(-0.27f, 0.48f)
            curveToRelative(2.23f, -0.48f, 1.49f, 0.0f, 6.52f, 1.53f)
            curveToRelative(2.22f, 0.74f, 5.0f, 0.0f, 7.0f, -1.0f)
            curveToRelative(0.0f, -2.49f, -4.24f, -5.51f, -4.5f, -5.77f)
            lineToRelative(-0.27f, -0.27f)
            arcToRelative(8.59f, 8.59f, 0.0f, false, true, -2.75f, -3.23f)
            curveToRelative(-1.75f, 0.27f, 0.0f, 2.23f, -2.23f, 2.49f)
            curveToRelative(-1.53f, 0.53f, -2.75f, 0.0f, -4.5f, 0.74f)
            arcTo(10.86f, 10.86f, 0.0f, false, true, 55.42f, 76.44f)
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
            moveTo(61.14f, 24.66f)
            curveToRelative(0.53f, 0.27f, 1.0f, -0.48f, 1.27f, -1.0f)
            arcToRelative(19.2f, 19.2f, 0.0f, false, true, 8.0f, -9.95f)
            curveToRelative(-0.74f, -1.27f, -2.0f, -1.53f, -3.28f, -1.8f)
            curveToRelative(-1.22f, -0.74f, -4.24f, 1.27f, -5.0f, 3.28f)
            arcTo(65.0f, 65.0f, 0.0f, false, false, 61.14f, 24.66f)
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
            moveTo(66.64f, 97.94f)
            curveToRelative(-1.27f, 7.0f, 3.76f, 14.0f, 8.26f, 17.0f)
            curveToRelative(6.0f, 4.0f, 12.71f, 8.26f, 20.71f, 5.77f)
            arcToRelative(74.0f, 74.0f, 0.0f, false, false, 11.48f, -6.51f)
            curveToRelative(-7.73f, -1.27f, -16.94f, 1.48f, -24.0f, -2.0f)
            arcToRelative(51.2f, 51.2f, 0.0f, false, true, -8.21f, -5.24f)
            curveToRelative(-2.0f, -1.75f, -4.0f, -5.51f, -5.0f, -8.53f)
            arcTo(14.4f, 14.4f, 0.0f, false, false, 66.64f, 97.94f)
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
            moveTo(67.12f, 9.94f)
            curveToRelative(2.54f, -0.53f, 5.0f, 1.0f, 6.78f, 2.23f)
            curveToRelative(2.75f, 3.75f, 6.46f, 6.77f, 8.2f, 10.74f)
            curveToRelative(3.76f, 6.0f, 10.0f, 7.0f, 14.0f, 12.5f)
            curveToRelative(5.72f, 5.77f, 7.21f, 13.29f, 7.21f, 21.28f)
            arcTo(60.42f, 60.42f, 0.0f, false, true, 102.59f, 82.0f)
            arcToRelative(76.46f, 76.46f, 0.0f, false, true, -9.21f, 23.24f)
            horizontalLineTo(94.6f)
            curveToRelative(4.0f, -5.0f, 6.51f, -10.27f, 9.53f, -15.51f)
            arcToRelative(62.89f, 62.89f, 0.0f, false, false, 3.0f, -17.53f)
            curveToRelative(0.0f, -8.47f, 0.53f, -16.46f, 0.53f, -24.72f)
            curveToRelative(-0.79f, -4.0f, -1.53f, -7.73f, -3.49f, -10.75f)
            curveToRelative(2.7f, 0.48f, 4.0f, 4.23f, 4.24f, 5.77f)
            curveToRelative(1.48f, 6.46f, 2.75f, 12.71f, 2.22f, 20.0f)
            arcToRelative(110.34f, 110.34f, 0.0f, false, true, -1.75f, 13.5f)
            horizontalLineToRelative(0.74f)
            curveToRelative(3.29f, -10.48f, 3.29f, -23.0f, 3.29f, -34.47f)
            curveToRelative(-0.75f, -6.24f, -2.76f, -11.75f, -3.5f, -17.79f)
            arcToRelative(67.76f, 67.76f, 0.0f, false, true, 5.45f, 36.8f)
            arcToRelative(112.28f, 112.28f, 0.0f, false, true, -3.7f, 16.26f)
            curveToRelative(0.21f, 0.21f, 0.0f, 1.0f, 0.0f, 1.21f)
            arcToRelative(86.69f, 86.69f, 0.0f, false, false, 7.73f, -14.71f)
            curveToRelative(3.76f, -9.0f, 2.75f, -20.28f, 2.28f, -30.55f)
            curveToRelative(1.48f, 6.51f, 3.0f, 13.0f, 2.48f, 20.27f)
            curveToRelative(-0.79f, 8.47f, -3.0f, 16.26f, -7.51f, 22.77f)
            curveToRelative(-2.44f, 4.13f, -4.66f, 8.31f, -6.57f, 12.44f)
            curveToRelative(5.4f, -7.94f, 9.85f, -16.83f, 16.57f, -24.72f)
            curveToRelative(1.75f, -2.0f, 3.0f, -2.23f, 4.5f, -3.0f)
            curveToRelative(-3.28f, 4.71f, -7.52f, 9.21f, -10.0f, 14.24f)
            curveToRelative(-2.76f, 5.25f, -5.0f, 10.75f, -9.48f, 15.25f)
            arcToRelative(19.1f, 19.1f, 0.0f, false, false, -3.0f, 3.5f)
            curveToRelative(3.5f, -1.49f, 7.52f, -2.49f, 10.75f, -4.77f)
            curveToRelative(6.0f, -4.5f, 10.0f, -11.0f, 15.72f, -15.51f)
            curveToRelative(-4.0f, 11.0f, -16.0f, 17.52f, -25.2f, 23.0f)
            lineToRelative(-4.0f, 3.49f)
            curveToRelative(8.0f, -5.24f, 17.26f, -7.25f, 24.72f, -13.76f)
            curveToRelative(5.77f, -5.0f, 10.75f, -10.22f, 13.24f, -16.73f)
            arcToRelative(196.09f, 196.09f, 0.0f, false, false, 1.27f, -21.0f)
            curveToRelative(0.27f, -5.24f, -1.0f, -10.0f, -4.24f, -13.77f)
            curveToRelative(-0.26f, -5.0f, -0.74f, -9.74f, -3.75f, -13.5f)
            arcTo(46.0f, 46.0f, 0.0f, false, false, 114.35f, 5.18f)
            curveToRelative(-3.76f, -1.27f, -7.52f, -1.27f, -11.49f, -1.54f)
            curveToRelative(3.49f, 1.27f, 5.51f, 5.0f, 7.25f, 8.0f)
            curveToRelative(0.0f, 0.21f, 0.27f, 0.74f, 0.0f, 1.22f)
            curveToRelative(-2.0f, -1.75f, -4.23f, -3.76f, -6.51f, -5.51f)
            curveToRelative(-4.5f, -3.76f, -11.0f, -4.5f, -16.73f, -3.23f)
            curveToRelative(-2.0f, 0.48f, -4.24f, 1.27f, -6.25f, 1.75f)
            curveToRelative(3.5f, 4.5f, 7.73f, 8.73f, 12.76f, 10.27f)
            curveToRelative(0.74f, 0.48f, 1.48f, 0.74f, 2.23f, 1.22f)
            arcToRelative(31.51f, 31.51f, 0.0f, false, true, -8.21f, -1.49f)
            curveToRelative(-4.77f, -2.0f, -7.25f, -7.25f, -12.0f, -9.26f)
            curveTo(71.89f, 5.44f, 69.66f, 7.93f, 67.12f, 9.94f)
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
            moveTo(74.64f, 98.68f)
            lineToRelative(-2.0f, 0.53f)
            curveToRelative(1.27f, 2.0f, 2.0f, 4.5f, 4.0f, 6.25f)
            curveToRelative(4.24f, 3.49f, 8.95f, 6.46f, 14.72f, 6.46f)
            curveToRelative(4.76f, -0.48f, 8.26f, 0.52f, 12.23f, -1.49f)
            arcToRelative(40.2f, 40.2f, 0.0f, false, false, 5.51f, -3.76f)
            curveToRelative(-3.76f, -0.47f, -7.26f, 1.0f, -10.75f, 1.27f)
            curveToRelative(-6.73f, 0.27f, -13.71f, -0.26f, -19.22f, -4.23f)
            curveTo(77.66f, 102.17f, 76.39f, 100.16f, 74.64f, 98.68f)
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
            moveTo(80.89f, 96.46f)
            curveToRelative(-1.27f, 0.21f, -2.49f, 1.0f, -3.76f, 1.0f)
            curveToRelative(1.48f, 5.45f, 7.0f, 7.2f, 12.0f, 7.73f)
            arcToRelative(2.59f, 2.59f, 0.0f, false, false, 2.22f, -1.75f)
            arcToRelative(38.35f, 38.35f, 0.0f, false, false, 5.24f, -9.74f)
            arcToRelative(47.72f, 47.72f, 0.0f, false, true, 1.75f, -4.5f)
            lineToRelative(0.26f, -0.53f)
            arcToRelative(61.0f, 61.0f, 0.0f, false, true, -15.0f, 8.0f)
            curveToRelative(0.0f, 1.74f, 0.21f, 3.28f, -0.53f, 4.76f)
            curveTo(82.37f, 99.68f, 82.1f, 97.94f, 80.89f, 96.46f)
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
            moveTo(104.61f, 103.18f)
            lineToRelative(0.53f, 0.26f)
            curveToRelative(3.49f, -0.26f, 7.46f, 0.48f, 10.0f, -2.48f)
            curveToRelative(1.54f, -1.54f, 2.7f, -3.45f, 4.45f, -4.77f)
            curveToRelative(-1.0f, -0.48f, -2.17f, 0.27f, -3.18f, 0.27f)
            lineToRelative(-6.25f, 2.48f)
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
            moveTo(108.37f, 109.69f)
            lineToRelative(-1.0f, 2.0f)
            curveToRelative(1.0f, 0.22f, 2.0f, 0.48f, 2.75f, -0.26f)
            curveToRelative(3.23f, -4.0f, 6.0f, -7.73f, 9.0f, -11.76f)
            lineToRelative(-1.0f, 0.27f)
            curveTo(113.87f, 102.17f, 111.6f, 106.41f, 108.37f, 109.69f)
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
            moveTo(139.07f, 104.13f)
            curveToRelative(-2.54f, -3.0f, -5.5f, -6.19f, -9.47f, -6.19f)
            arcToRelative(2.06f, 2.06f, 0.0f, false, false, -1.75f, 0.26f)
            curveToRelative(4.5f, 2.49f, 10.22f, 6.0f, 11.0f, 11.76f)
            curveToRelative(0.0f, 1.21f, 0.26f, 2.75f, -0.21f, 4.0f)
            arcToRelative(70.67f, 70.67f, 0.0f, false, false, -5.24f, -8.74f)
            arcToRelative(7.46f, 7.46f, 0.0f, false, false, -3.29f, -1.48f)
            curveToRelative(2.0f, 7.46f, 1.0f, 15.72f, -1.0f, 23.0f)
            lineToRelative(5.29f, 12.0f)
            curveToRelative(3.23f, 11.75f, 0.95f, 24.0f, -3.28f, 34.46f)
            curveToRelative(-1.22f, 3.29f, -2.22f, 6.3f, -4.24f, 9.27f)
            curveToRelative(4.0f, 1.0f, 8.26f, 1.0f, 12.0f, 2.75f)
            curveToRelative(3.49f, -6.0f, 3.76f, -14.77f, 2.54f, -22.0f)
            curveToRelative(-1.53f, -8.79f, -3.49f, -18.53f, -1.75f, -27.8f)
            curveToRelative(0.22f, -8.26f, 1.49f, -16.25f, 1.75f, -24.25f)
            curveToRelative(0.21f, -7.0f, -4.29f, -15.24f, -8.52f, -16.73f)
            curveToRelative(-5.51f, -1.0f, -10.0f, 2.0f, -12.71f, 6.25f)
            lineToRelative(-4.29f, 6.0f)
            curveToRelative(0.53f, 0.27f, 0.27f, 1.0f, 0.0f, 1.54f)
            verticalLineToRelative(0.21f)
            curveToRelative(4.29f, -3.76f, 5.3f, -11.49f, 11.75f, -12.49f)
            arcToRelative(9.44f, 9.44f, 0.0f, false, true, 10.0f, 4.23f)
            curveTo(138.33f, 101.7f, 139.07f, 102.86f, 139.07f, 104.13f)
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
            moveTo(114.08f, 172.22f)
            arcToRelative(24.17f, 24.17f, 0.0f, false, true, 4.5f, 11.75f)
            curveToRelative(6.0f, -1.53f, 8.53f, -8.0f, 10.75f, -12.76f)
            curveToRelative(2.76f, -6.0f, 3.0f, -12.76f, 4.0f, -19.27f)
            lineToRelative(0.21f, -8.47f)
            curveToRelative(-4.24f, 5.45f, -4.5f, 12.71f, -9.21f, 17.74f)
            curveTo(122.08f, 166.0f, 117.58f, 168.46f, 114.08f, 172.22f)
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
            moveTo(140.82f, 143.47f)
            curveToRelative(0.0f, 3.0f, -0.48f, 5.45f, 0.0f, 8.47f)
            curveToRelative(2.28f, -3.76f, 3.76f, -8.0f, 5.77f, -12.0f)
            curveToRelative(2.23f, -4.5f, 2.76f, -8.0f, 2.49f, -13.5f)
            verticalLineTo(125.2f)
            curveToRelative(-1.75f, -4.0f, -3.23f, -8.52f, -4.76f, -12.76f)
            curveToRelative(-1.22f, 4.51f, -1.22f, 9.27f, -1.75f, 14.0f)
            curveTo(141.83f, 132.19f, 141.35f, 138.0f, 140.82f, 143.47f)
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
            moveTo(145.85f, 106.2f)
            lineTo(142.3f, 102.0f)
            curveToRelative(4.77f, 8.21f, 8.0f, 21.71f, 8.53f, 26.74f)
            curveToRelative(0.47f, 6.51f, -3.76f, 15.0f, -7.52f, 21.5f)
            curveToRelative(-1.48f, 3.49f, -2.0f, 6.51f, -0.21f, 12.0f)
            arcToRelative(28.0f, 28.0f, 0.0f, false, false, 2.75f, 4.72f)
            lineToRelative(3.23f, -13.24f)
            curveToRelative(2.49f, -9.0f, 8.47f, -18.0f, 5.0f, -27.74f)
            arcTo(73.08f, 73.08f, 0.0f, false, false, 145.85f, 106.2f)
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
            moveTo(149.08f, 161.47f)
            curveToRelative(-0.26f, 4.5f, -2.0f, 9.74f, 0.27f, 14.0f)
            curveToRelative(4.0f, -0.74f, 8.0f, -2.28f, 12.0f, -3.23f)
            lineToRelative(0.53f, 1.22f)
            lineToRelative(-1.0f, 3.49f)
            lineToRelative(5.0f, -0.21f)
            lineToRelative(1.27f, -0.26f)
            lineToRelative(-5.5f, -9.27f)
            curveToRelative(-3.0f, -4.76f, -6.0f, -11.22f, -5.77f, -16.25f)
            verticalLineToRelative(-9.27f)
            arcTo(88.89f, 88.89f, 0.0f, false, false, 149.08f, 161.47f)
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
            moveTo(157.55f, 140.45f)
            curveToRelative(1.0f, 6.25f, -0.21f, 13.0f, 2.0f, 18.75f)
            curveToRelative(1.75f, 4.76f, 4.77f, 9.0f, 6.73f, 13.5f)
            lineToRelative(2.27f, 2.75f)
            lineToRelative(0.27f, -0.26f)
            lineToRelative(4.71f, -3.5f)
            curveToRelative(-2.22f, -3.49f, -4.71f, -6.25f, -7.25f, -10.22f)
            lineToRelative(-0.74f, -2.0f)
            curveTo(162.32f, 153.69f, 159.83f, 146.44f, 157.55f, 140.45f)
            close()
        }
    }
        .build()
}
