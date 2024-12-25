package com.mshdabiola.ludo.screen.game.component.fish

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

fun Fish.getBlue(iconColor: Long, accentColor: Long): ImageVector {
    return Builder(
        name = "Blue7",
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
            moveTo(8.2f, 121.28f)
            curveToRelative(1.4f, -7.38f, 6.46f, -13.24f, 5.58f, -21.47f)
            curveTo(12.55f, 94.31f, 8.48f, 90.0f, 6.0f, 85.12f)
            curveTo(5.13f, 80.0f, 2.14f, 75.6f, 2.28f, 70.23f)
            curveTo(24.72f, 67.53f, 46.4f, 94.53f, 64.0f, 87.3f)
            curveToRelative(-2.37f, -1.49f, -4.79f, -2.79f, -7.08f, -4.37f)
            curveToRelative(-1.0f, -2.26f, -0.9f, -5.0f, -1.37f, -7.54f)
            curveToRelative(1.71f, -2.42f, 1.92f, -5.43f, 2.9f, -8.21f)
            curveToRelative(9.0f, -1.48f, 18.08f, -3.0f, 26.79f, -5.25f)
            curveToRelative(4.14f, -0.12f, 14.19f, 1.25f, 18.17f, -4.09f)
            curveToRelative(3.9f, 1.5f, 5.0f, -1.08f, 6.53f, -2.5f)
            curveToRelative(0.59f, -0.87f, 3.64f, 3.0f, 8.32f, -1.0f)
            arcTo(6.94f, 6.94f, 0.0f, false, false, 125.0f, 56.87f)
            curveToRelative(2.88f, -4.16f, 4.29f, 2.15f, 7.2f, 1.77f)
            curveToRelative(2.31f, -1.52f, 3.0f, 0.93f, 4.92f, 1.92f)
            arcToRelative(7.39f, 7.39f, 0.0f, false, false, 4.0f, -0.35f)
            curveToRelative(1.6f, 5.2f, 6.4f, 4.09f, 8.0f, 3.54f)
            curveToRelative(0.34f, 2.77f, 0.09f, 5.77f, 0.88f, 8.36f)
            curveToRelative(14.49f, 3.81f, 48.79f, 26.82f, 49.4f, 37.32f)
            arcToRelative(35.28f, 35.28f, 0.0f, false, false, -8.67f, 3.34f)
            curveToRelative(2.42f, 1.08f, 5.11f, 1.69f, 7.39f, 2.54f)
            curveToRelative(-2.34f, 4.07f, -6.93f, 4.87f, -11.24f, 5.18f)
            curveToRelative(-13.34f, 5.06f, -27.7f, 7.75f, -42.7f, 9.0f)
            curveToRelative(-7.73f, 5.93f, -11.57f, 16.51f, -21.0f, 20.31f)
            curveToRelative(1.0f, -4.79f, -4.0f, -7.89f, -1.54f, -12.46f)
            curveToRelative(-2.88f, -2.0f, -0.4f, -5.32f, -1.24f, -8.0f)
            curveToRelative(-7.0f, -0.17f, -14.47f, -0.12f, -20.93f, -0.53f)
            curveToRelative(-2.39f, 2.66f, -4.91f, 6.18f, -8.13f, 7.43f)
            curveToRelative(-0.46f, -1.0f, -0.38f, -2.41f, -1.34f, -3.08f)
            curveToRelative(-8.87f, 6.52f, -18.57f, 11.14f, -29.71f, 12.32f)
            curveToRelative(1.16f, -3.88f, 2.77f, -7.62f, 4.0f, -11.5f)
            curveToRelative(-0.21f, -3.82f, 2.73f, -6.57f, 1.38f, -10.66f)
            curveToRelative(0.58f, -1.5f, 1.53f, -2.87f, 1.61f, -4.6f)
            arcToRelative(31.0f, 31.0f, 0.0f, false, false, -28.18f, -3.08f)
            curveToRelative(-11.81f, 9.0f, -23.0f, 20.83f, -38.53f, 19.62f)
            curveToRelative(2.0f, -4.88f, 6.45f, -8.78f, 7.59f, -14.0f)
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
            moveTo(147.64f, 67.0f)
            arcToRelative(12.14f, 12.14f, 0.0f, false, true, -2.91f, -0.16f)
            arcToRelative(53.0f, 53.0f, 0.0f, false, true, -0.95f, 6.24f)
            curveToRelative(-1.3f, -2.86f, -2.0f, -6.0f, -3.34f, -8.85f)
            curveToRelative(-2.18f, 0.88f, -6.71f, -2.86f, -7.22f, -3.36f)
            curveToRelative(-0.33f, 3.78f, 0.83f, 7.41f, -0.28f, 11.15f)
            curveToRelative(-0.77f, -0.4f, -1.82f, 0.0f, -2.59f, -0.34f)
            curveToRelative(-0.9f, -4.36f, -2.25f, -8.59f, -3.23f, -12.9f)
            arcToRelative(13.19f, 13.19f, 0.0f, false, true, -2.58f, 1.84f)
            arcToRelative(112.79f, 112.79f, 0.0f, false, true, 2.85f, 10.94f)
            curveToRelative(-0.4f, 0.64f, -1.43f, -0.18f, -1.93f, 0.23f)
            arcToRelative(97.31f, 97.31f, 0.0f, false, false, -6.17f, -13.27f)
            curveToRelative(-0.77f, 0.55f, -1.0f, 1.37f, -1.8f, 2.0f)
            arcTo(34.22f, 34.22f, 0.0f, false, true, 122.13f, 71.0f)
            arcToRelative(12.29f, 12.29f, 0.0f, false, true, -2.89f, 0.22f)
            curveToRelative(-2.21f, -3.49f, -3.87f, -6.53f, -5.9f, -10.11f)
            arcToRelative(7.44f, 7.44f, 0.0f, false, true, -3.0f, -2.44f)
            arcToRelative(5.23f, 5.23f, 0.0f, false, false, -1.63f, 1.65f)
            arcToRelative(76.75f, 76.75f, 0.0f, false, true, 5.82f, 11.56f)
            curveToRelative(-0.23f, 0.28f, -0.64f, 0.14f, -1.0f, 0.19f)
            curveToRelative(-2.61f, -3.44f, -4.46f, -7.29f, -7.81f, -10.27f)
            curveToRelative(-6.22f, 1.55f, 5.12f, 8.93f, 3.0f, 9.81f)
            curveToRelative(-2.13f, 1.06f, -6.4f, -5.0f, -7.55f, -6.18f)
            arcTo(8.56f, 8.56f, 0.0f, false, true, 97.0f, 65.28f)
            curveToRelative(2.0f, 2.54f, 4.31f, 4.93f, 6.0f, 7.65f)
            curveToRelative(-0.5f, 0.73f, -1.64f, 0.65f, -2.45f, 1.0f)
            curveToRelative(-2.0f, -2.44f, -4.45f, -4.74f, -6.61f, -7.14f)
            curveToRelative(-13.88f, -8.36f, 2.47f, 4.72f, 3.16f, 8.0f)
            arcToRelative(2.29f, 2.29f, 0.0f, false, true, -1.82f, 0.51f)
            arcToRelative(114.2f, 114.2f, 0.0f, false, false, -11.36f, -11.2f)
            curveToRelative(-1.0f, 0.0f, -1.86f, 0.6f, -3.0f, 0.66f)
            arcTo(117.28f, 117.28f, 0.0f, false, true, 91.53f, 76.11f)
            arcToRelative(5.0f, 5.0f, 0.0f, false, true, -2.63f, 1.0f)
            curveToRelative(-3.49f, -4.0f, -7.52f, -7.78f, -11.37f, -11.39f)
            lineToRelative(-2.82f, 0.0f)
            curveToRelative(3.4f, 4.39f, 8.11f, 7.95f, 11.92f, 12.0f)
            curveToRelative(-0.55f, 0.46f, -1.23f, 0.46f, -1.82f, 0.83f)
            curveTo(80.51f, 75.23f, 76.26f, 71.8f, 72.0f, 68.38f)
            curveToRelative(-1.91f, -0.08f, -4.46f, 0.35f, -6.37f, -0.28f)
            curveToRelative(4.58f, 5.0f, 10.55f, 7.16f, 15.32f, 12.0f)
            curveToRelative(-0.36f, 0.6f, -1.18f, 0.78f, -1.81f, 1.15f)
            curveToRelative(-5.3f, -3.78f, -10.7f, -7.34f, -16.0f, -11.21f)
            arcToRelative(13.47f, 13.47f, 0.0f, false, true, -3.57f, 3.0f)
            curveTo(59.35f, 73.47f, 71.0f, 79.21f, 76.15f, 83.0f)
            curveToRelative(-0.49f, 0.37f, -1.08f, 0.78f, -1.62f, 1.15f)
            curveToRelative(-4.71f, -2.38f, -9.41f, -4.71f, -14.11f, -7.09f)
            arcToRelative(4.57f, 4.57f, 0.0f, false, false, -1.48f, 2.29f)
            curveToRelative(4.28f, 1.52f, 7.94f, 4.63f, 12.0f, 6.65f)
            curveTo(77.79f, 83.0f, 100.23f, 68.0f, 147.69f, 74.0f)
            arcToRelative(29.9f, 29.9f, 0.0f, false, false, -0.05f, -7.0f)
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
            moveTo(151.84f, 76.51f)
            curveToRelative(-1.0f, 1.88f, 2.86f, 5.44f, -0.78f, 4.74f)
            curveTo(106.7f, 64.4f, 57.0f, 107.27f, 37.66f, 94.36f)
            curveToRelative(0.1f, 0.91f, -2.0f, 2.56f, 0.2f, 2.64f)
            curveTo(59.0f, 108.69f, 105.69f, 67.63f, 153.0f, 83.06f)
            curveToRelative(2.0f, 4.39f, -0.7f, 4.32f, -1.29f, 4.6f)
            curveToRelative(-20.92f, -6.26f, -43.16f, 0.81f, -62.0f, 7.82f)
            curveToRelative(13.0f, -1.73f, 39.38f, -13.29f, 60.22f, -6.67f)
            arcToRelative(34.64f, 34.64f, 0.0f, false, true, -2.62f, 2.48f)
            curveToRelative(-12.88f, -1.68f, -29.35f, -2.61f, -41.41f, 3.07f)
            curveToRelative(12.16f, -3.5f, 27.13f, -3.33f, 39.79f, -1.24f)
            curveToRelative(0.46f, 1.13f, -1.26f, 2.06f, -0.61f, 3.28f)
            curveToRelative(3.3f, -3.0f, 6.63f, -7.37f, 11.0f, -8.45f)
            curveToRelative(-1.66f, -3.72f, -2.6f, -7.72f, -4.31f, -11.44f)
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
            moveTo(146.1f, 100.49f)
            curveToRelative(1.5f, 5.86f, 5.07f, 21.65f, 15.71f, 21.18f)
            curveToRelative(-7.77f, -5.36f, -10.3f, -14.8f, -13.9f, -22.83f)
            curveToRelative(-0.63f, 0.5f, -1.45f, 0.83f, -1.81f, 1.65f)
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
            moveTo(157.81f, 90.21f)
            curveToRelative(-2.81f, 2.07f, -8.29f, 4.48f, -6.8f, 9.06f)
            curveToRelative(1.11f, 2.72f, 5.47f, 20.89f, 15.05f, 19.41f)
            curveToRelative(-10.34f, -11.86f, -6.92f, -19.74f, -5.27f, -25.53f)
            lineToRelative(-3.0f, -2.94f)
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
            moveTo(174.86f, 89.13f)
            curveToRelative(-7.26f, -1.78f, -6.35f, 7.58f, -3.54f, 8.22f)
            curveToRelative(8.86f, 1.88f, 6.89f, -7.82f, 3.54f, -8.22f)
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
            moveTo(195.13f, 105.69f)
            arcToRelative(2.11f, 2.11f, 0.0f, false, false, -0.37f, -0.32f)
            curveToRelative(-5.77f, 0.5f, -11.08f, 2.22f, -16.48f, 3.71f)
            curveToRelative(-0.28f, 0.14f, -10.26f, -9.8f, -14.71f, -15.0f)
            curveToRelative(-2.85f, 4.8f, 0.49f, 19.06f, 14.42f, 19.23f)
            curveToRelative(-0.14f, -0.77f, 0.31f, -1.23f, 0.12f, -2.0f)
            arcToRelative(58.93f, 58.93f, 0.0f, false, true, 17.0f, -5.67f)
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
            moveTo(180.94f, 119.21f)
            curveToRelative(-0.18f, -0.41f, -0.59f, -0.22f, -0.82f, -0.63f)
            curveToRelative(1.67f, -1.15f, 3.49f, -2.0f, 5.25f, -3.0f)
            curveToRelative(0.0f, -0.36f, -0.36f, -0.22f, -0.5f, -0.49f)
            curveToRelative(-2.45f, 1.0f, -4.81f, 2.08f, -7.35f, 2.83f)
            curveToRelative(-0.46f, -0.55f, -0.28f, -1.82f, -0.34f, -2.78f)
            curveToRelative(-7.36f, 1.23f, -14.29f, -7.58f, -14.47f, -8.22f)
            curveToRelative(-2.44f, 12.18f, 13.79f, 14.24f, 18.23f, 12.29f)
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
            moveTo(127.66f, 129.29f)
            curveToRelative(-6.63f, 7.1f, 2.1f, 0.17f, 3.91f, -0.53f)
            arcToRelative(8.68f, 8.68f, 0.0f, false, true, 2.46f, 0.12f)
            curveToRelative(-2.49f, 2.43f, -4.43f, 4.0f, -6.82f, 6.6f)
            curveToRelative(2.84f, -2.0f, 5.88f, -3.77f, 8.78f, -5.61f)
            curveToRelative(-2.06f, 4.11f, -6.63f, 7.6f, -9.24f, 11.71f)
            curveToRelative(4.75f, -4.13f, 10.49f, -9.08f, 14.0f, -13.7f)
            curveToRelative(-5.2f, -2.29f, -11.56f, -0.6f, -16.69f, 0.62f)
            curveToRelative(1.1f, 0.49f, 3.41f, -0.48f, 3.6f, 0.79f)
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
            moveTo(71.66f, 128.06f)
            arcTo(68.52f, 68.52f, 0.0f, false, false, 81.0f, 123.9f)
            arcToRelative(6.24f, 6.24f, 0.0f, false, true, 3.0f, 0.93f)
            quadToRelative(-6.39f, 4.48f, -12.72f, 9.0f)
            arcToRelative(167.1f, 167.1f, 0.0f, false, false, 16.45f, -7.85f)
            curveToRelative(0.46f, 0.22f, 1.0f, 0.22f, 1.33f, 0.67f)
            curveToRelative(-5.79f, 4.82f, -12.27f, 8.06f, -18.06f, 12.92f)
            arcToRelative(58.55f, 58.55f, 0.0f, false, false, 19.7f, -12.43f)
            curveToRelative(1.64f, -0.1f, 2.87f, 0.8f, 4.6f, 0.42f)
            curveToRelative(-1.56f, -0.9f, -18.25f, -6.55f, -22.17f, -7.84f)
            curveToRelative(0.6f, 0.54f, 1.28f, 0.67f, 1.83f, 1.3f)
            curveToRelative(-1.58f, 0.88f, -2.85f, 2.25f, -4.43f, 3.13f)
            curveToRelative(3.0f, -0.12f, 6.06f, -3.69f, 8.86f, -0.89f)
            arcToRelative(90.2f, 90.2f, 0.0f, false, false, -7.65f, 4.84f)
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
            moveTo(37.62f, 112.88f)
            curveToRelative(8.07f, -3.61f, 18.81f, -3.0f, 26.57f, 0.81f)
            curveToRelative(15.87f, 6.12f, 31.12f, 13.74f, 49.67f, 13.24f)
            curveToRelative(7.83f, 0.81f, 14.17f, -3.42f, 21.78f, -1.66f)
            curveToRelative(10.56f, 2.0f, 22.75f, 1.25f, 32.41f, -2.19f)
            curveToRelative(-4.27f, 1.0f, -20.22f, 1.33f, -18.88f, -7.23f)
            curveToRelative(-0.27f, 0.14f, -0.55f, 0.18f, -0.82f, 0.32f)
            curveToRelative(-2.38f, -2.85f, -5.09f, -5.42f, -7.74f, -8.27f)
            curveToRelative(-0.36f, 0.87f, -1.32f, 1.0f, -2.13f, 1.15f)
            curveToRelative(-0.46f, -0.22f, -0.82f, 0.74f, -1.32f, 0.83f)
            curveToRelative(-7.34f, -2.72f, -14.87f, -5.94f, -23.0f, -5.88f)
            curveToRelative(4.43f, 1.15f, 8.89f, 2.07f, 13.13f, 3.5f)
            curveToRelative(-2.0f, 0.65f, -4.59f, 0.12f, -6.68f, 0.55f)
            curveToRelative(-11.41f, 1.31f, 8.39f, 0.13f, 15.21f, 2.48f)
            curveToRelative(-2.27f, 1.0f, -4.9f, 1.81f, -7.35f, 2.69f)
            curveToRelative(3.95f, -0.44f, 8.13f, -1.24f, 12.45f, -1.23f)
            curveToRelative(0.33f, 0.73f, 2.3f, 2.49f, 0.0f, 2.46f)
            curveToRelative(-2.82f, 0.39f, -5.22f, 1.77f, -7.85f, 2.65f)
            curveToRelative(2.77f, -0.38f, 6.73f, -0.59f, 10.0f, -1.21f)
            curveToRelative(1.55f, 1.08f, 0.56f, 2.32f, -0.8f, 2.78f)
            arcToRelative(57.88f, 57.88f, 0.0f, false, true, -7.0f, 3.65f)
            curveToRelative(-4.9f, 1.0f, -11.87f, -6.71f, -17.24f, -6.43f)
            arcToRelative(103.15f, 103.15f, 0.0f, false, true, -19.48f, -1.5f)
            curveToRelative(-3.27f, 0.89f, -5.88f, -0.82f, -9.0f, -0.75f)
            curveToRelative(-2.43f, -1.67f, -5.61f, -1.23f, -8.07f, -2.72f)
            curveToRelative(-3.77f, 1.58f, -5.84f, -2.09f, -9.52f, -1.25f)
            curveToRelative(-0.82f, -0.36f, -1.74f, -0.76f, -2.6f, -1.12f)
            curveToRelative(-2.4f, 1.2f, -5.0f, 0.0f, -7.24f, -0.76f)
            curveToRelative(-3.08f, 1.61f, -6.2f, -1.73f, -9.32f, 0.38f)
            curveToRelative(-1.36f, 0.51f, -2.09f, -0.21f, -3.6f, 0.0f)
            curveToRelative(-2.21f, 2.47f, -6.27f, 0.23f, -8.48f, 2.2f)
            lineToRelative(-4.0f, 0.0f)
            curveToRelative(0.41f, 0.72f, 0.51f, 1.81f, 0.84f, 2.45f)
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
            moveTo(36.75f, 106.2f)
            curveToRelative(21.21f, -4.75f, 43.39f, -0.18f, 62.94f, 5.09f)
            curveToRelative(4.51f, 0.92f, 9.15f, 1.35f, 13.75f, 2.0f)
            curveToRelative(-1.56f, -1.9f, -9.58f, -5.45f, -9.71f, -10.08f)
            curveToRelative(6.81f, -6.44f, 26.33f, -0.14f, 34.23f, 3.67f)
            curveToRelative(2.0f, -2.2f, 4.0f, -4.63f, 4.36f, -7.22f)
            curveToRelative(-0.14f, -0.14f, -0.23f, -0.41f, -0.46f, -0.36f)
            curveToRelative(-3.36f, 0.34f, -6.45f, 0.41f, -9.19f, -1.21f)
            curveToRelative(-2.45f, 0.79f, -5.55f, 0.0f, -8.0f, -0.63f)
            curveToRelative(-1.76f, 0.56f, -4.12f, 1.13f, -5.91f, 0.23f)
            curveToRelative(-3.52f, 3.12f, -8.69f, -1.35f, -11.94f, 2.0f)
            curveToRelative(-2.24f, -1.48f, -5.47f, -1.5f, -8.2f, -0.94f)
            curveToRelative(-17.62f, 3.45f, -60.0f, 4.53f, -62.0f, 4.55f)
            curveToRelative(-0.22f, 1.0f, 0.38f, 2.09f, 0.16f, 2.82f)
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
            moveTo(34.86f, 115.36f)
            curveToRelative(-3.62f, -13.24f, 2.81f, -26.46f, 2.94f, -26.74f)
            curveToRelative(-10.0f, -5.75f, -19.61f, -14.05f, -31.58f, -15.0f)
            curveToRelative(0.09f, 0.41f, -0.41f, 0.69f, -0.31f, 1.14f)
            curveToRelative(10.58f, 4.11f, 20.54f, 9.64f, 30.4f, 15.48f)
            arcToRelative(2.07f, 2.07f, 0.0f, false, true, -0.8f, 1.51f)
            curveTo(26.92f, 86.84f, 18.29f, 82.0f, 8.4f, 80.19f)
            curveToRelative(0.0f, 0.78f, -0.57f, 1.64f, -0.11f, 2.78f)
            curveTo(16.82f, 86.68f, 26.0f, 89.0f, 34.38f, 93.11f)
            curveToRelative(0.55f, 0.59f, -0.27f, 1.0f, -0.31f, 1.64f)
            arcToRelative(1.05f, 1.05f, 0.0f, false, false, -0.31f, 0.32f)
            curveTo(27.0f, 92.39f, 20.07f, 89.85f, 12.88f, 88.8f)
            curveToRelative(-0.27f, 0.83f, 0.46f, 1.64f, 0.7f, 2.46f)
            curveToRelative(6.56f, 1.72f, 13.3f, 2.9f, 19.69f, 5.13f)
            arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.67f, 2.0f)
            arcToRelative(73.64f, 73.64f, 0.0f, false, false, -15.21f, -2.0f)
            arcToRelative(8.6f, 8.6f, 0.0f, false, false, -0.34f, 2.46f)
            curveToRelative(4.92f, 1.6f, 10.24f, 2.0f, 15.26f, 3.34f)
            curveToRelative(-0.14f, 0.5f, -0.31f, 1.1f, -0.49f, 1.64f)
            curveToRelative(-4.23f, -0.37f, -8.7f, -1.16f, -13.25f, -1.4f)
            curveToRelative(-0.63f, 0.69f, -0.53f, 1.64f, -0.8f, 2.46f)
            curveToRelative(4.47f, 1.52f, 9.52f, 1.57f, 14.25f, 2.36f)
            arcToRelative(3.12f, 3.12f, 0.0f, false, true, 0.52f, 2.13f)
            curveToRelative(-5.27f, 0.22f, -10.69f, -0.83f, -15.88f, -0.89f)
            arcToRelative(34.71f, 34.71f, 0.0f, false, false, -3.11f, 4.31f)
            curveToRelative(6.6f, 0.81f, 13.33f, -0.19f, 19.65f, -1.0f)
            curveToRelative(0.73f, 0.59f, 0.64f, 1.46f, 1.15f, 2.13f)
            curveToRelative(-6.35f, 2.42f, -13.49f, 2.88f, -20.58f, 3.57f)
            curveToRelative(-1.08f, 2.0f, -1.84f, 4.06f, -2.73f, 6.11f)
            curveToRelative(7.0f, -0.41f, 13.7f, -4.19f, 20.23f, -7.06f)
            curveToRelative(0.28f, 0.41f, 0.15f, 1.0f, 0.2f, 1.5f)
            curveToRelative(-3.63f, 2.12f, -7.2f, 4.42f, -11.0f, 6.31f)
            curveToRelative(-5.0f, 2.18f, -13.14f, 1.69f, -14.32f, 8.62f)
            curveToRelative(11.23f, -1.91f, 20.0f, -9.48f, 28.67f, -17.59f)
        }
    }
        .build()
}
