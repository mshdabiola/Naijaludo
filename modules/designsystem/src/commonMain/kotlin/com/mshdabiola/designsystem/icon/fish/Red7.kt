package com.mshdabiola.designsystem.icon.fish

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

fun Fish.getRed(iconColor: Color, accentColor: Color): ImageVector {
    return Builder(
        name = "Red7",
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
            moveTo(92.36f, 200.0f)
            curveToRelative(16.21f, -14.82f, 35.36f, -23.39f, 49.24f, -41.83f)
            curveToRelative(3.62f, -1.08f, 7.0f, -2.89f, 10.59f, -4.08f)
            arcToRelative(25.71f, 25.71f, 0.0f, false, false, -0.73f, -3.51f)
            curveToRelative(2.79f, -1.45f, 5.83f, -2.58f, 8.36f, -4.29f)
            curveToRelative(-0.25f, -1.44f, -1.18f, -2.63f, -1.49f, -4.07f)
            curveToRelative(3.15f, -2.64f, 6.76f, -4.09f, 9.86f, -6.71f)
            lineToRelative(-0.93f, -2.0f)
            curveToRelative(-3.46f, -3.1f, 1.39f, -5.58f, 2.79f, -8.0f)
            arcToRelative(37.35f, 37.35f, 0.0f, false, false, -3.36f, -3.56f)
            curveToRelative(0.62f, -1.9f, 2.58f, -3.51f, 2.43f, -5.57f)
            curveToRelative(-1.65f, -0.89f, -3.46f, -1.45f, -5.22f, -2.23f)
            arcToRelative(33.22f, 33.22f, 0.0f, false, false, 1.7f, -4.07f)
            arcToRelative(27.85f, 27.85f, 0.0f, false, false, -3.35f, -2.43f)
            curveToRelative(0.21f, -1.14f, 0.52f, -2.38f, 0.73f, -3.51f)
            arcToRelative(14.58f, 14.58f, 0.0f, false, false, -2.95f, -2.43f)
            curveToRelative(0.67f, -1.14f, 1.0f, -2.37f, 1.65f, -3.51f)
            curveToRelative(-1.0f, -1.08f, -2.63f, -1.7f, -3.0f, -3.2f)
            arcTo(4.57f, 4.57f, 0.0f, false, false, 157.0f, 90.32f)
            curveToRelative(0.93f, -6.09f, 4.28f, -42.62f, -14.87f, -42.0f)
            curveToRelative(-6.45f, 0.36f, -11.3f, 5.78f, -14.86f, 10.79f)
            curveToRelative(-1.09f, -4.39f, -2.07f, -9.24f, -1.14f, -13.94f)
            curveToRelative(7.64f, -12.0f, 19.87f, -22.1f, 21.78f, -36.46f)
            curveToRelative(-2.27f, -0.87f, -4.59f, -1.44f, -6.91f, -2.22f)
            curveToRelative(-8.37f, -2.0f, -15.39f, 2.79f, -24.16f, 1.65f)
            curveTo(109.0f, 8.94f, 104.34f, 2.33f, 97.57f, 0.58f)
            curveTo(93.75f, -0.61f, 89.31f, 0.42f, 85.5f, 0.37f)
            curveToRelative(-4.7f, 16.0f, 7.48f, 28.29f, 10.0f, 43.0f)
            curveToRelative(0.21f, 3.82f, 0.82f, 7.64f, -1.86f, 10.58f)
            curveToRelative(-4.6f, 8.48f, -32.13f, 16.0f, -36.39f, 40.0f)
            curveToRelative(-0.26f, -0.87f, -1.09f, -1.49f, -0.78f, -2.63f)
            curveToRelative(0.83f, -2.58f, 1.4f, -5.27f, 2.43f, -7.8f)
            curveToRelative(-2.27f, -3.87f, -5.21f, -7.64f, -6.5f, -11.72f)
            curveToRelative(2.68f, 2.63f, 5.26f, 6.0f, 8.0f, 8.78f)
            curveToRelative(0.26f, -1.0f, 1.08f, -1.81f, 1.29f, -2.79f)
            curveToRelative(-3.2f, -6.0f, -5.83f, -12.39f, -6.51f, -19.15f)
            curveToRelative(2.53f, 5.57f, 4.5f, 11.51f, 8.37f, 16.36f)
            curveToRelative(0.56f, -0.93f, 1.49f, -1.6f, 1.7f, -2.63f)
            curveToRelative(-2.53f, -7.13f, -6.0f, -14.15f, -6.92f, -21.74f)
            curveTo(61.0f, 57.38f, 63.45f, 64.5f, 66.91f, 70.8f)
            arcTo(20.23f, 20.23f, 0.0f, false, true, 69.0f, 69.15f)
            curveToRelative(-1.45f, -8.16f, -5.63f, -15.34f, -6.15f, -23.6f)
            curveToRelative(2.0f, 7.64f, 5.63f, 14.62f, 8.94f, 21.74f)
            curveToRelative(0.56f, -0.72f, 1.39f, -0.88f, 2.0f, -1.5f)
            curveToRelative(-1.19f, -6.92f, -4.34f, -13.27f, -4.44f, -20.45f)
            curveToRelative(1.49f, 6.61f, 4.28f, 12.71f, 6.5f, 19.0f)
            arcToRelative(0.86f, 0.86f, 0.0f, false, false, 1.08f, -0.92f)
            curveToRelative(-1.29f, -6.56f, -2.83f, -13.27f, -2.21f, -20.45f)
            horizontalLineToRelative(0.2f)
            arcToRelative(136.55f, 136.55f, 0.0f, false, false, 4.44f, 19.36f)
            curveToRelative(0.36f, -0.21f, 0.78f, -0.36f, 1.14f, -0.57f)
            curveToRelative(0.15f, -4.85f, -0.47f, -10.0f, 0.57f, -14.51f)
            curveToRelative(0.92f, 4.13f, 1.85f, 8.32f, 2.78f, 12.45f)
            curveToRelative(1.86f, -0.47f, 3.0f, -2.69f, 4.65f, -3.72f)
            curveToRelative(0.05f, -2.17f, 2.62f, -17.0f, -8.93f, -21.38f)
            curveTo(74.0f, 31.76f, 51.42f, 37.14f, 51.84f, 65.07f)
            curveToRelative(-0.88f, 1.45f, -3.41f, 0.31f, -5.0f, 0.93f)
            curveToRelative(1.81f, 3.51f, 3.87f, 7.0f, 5.42f, 10.58f)
            curveToRelative(1.0f, 0.83f, -0.36f, 1.4f, -0.93f, 1.66f)
            curveToRelative(-4.07f, 1.19f, 0.0f, 4.54f, 0.36f, 6.71f)
            curveToRelative(-1.23f, 1.09f, -2.78f, 2.27f, -3.92f, 3.51f)
            curveToRelative(2.27f, 2.38f, 5.47f, 5.37f, 8.0f, 7.85f)
            curveToRelative(-0.31f, 2.69f, 0.0f, 6.25f, -0.93f, 8.73f)
            curveToRelative(-5.42f, -3.1f, -10.63f, -6.61f, -17.86f, -5.43f)
            curveToRelative(-2.47f, 0.06f, -4.43f, -1.34f, -7.0f, -1.08f)
            arcToRelative(49.37f, 49.37f, 0.0f, false, false, 7.44f, 18.23f)
            arcToRelative(26.0f, 26.0f, 0.0f, false, false, -4.85f, 1.44f)
            curveToRelative(6.65f, 5.48f, 12.9f, 11.73f, 19.87f, 16.37f)
            curveToRelative(1.18f, 12.86f, 3.4f, 25.15f, 11.0f, 35.33f)
            curveToRelative(1.7f, 7.73f, 9.0f, 13.21f, 10.22f, 21.21f)
            curveToRelative(1.76f, 5.64f, 7.85f, 6.51f, 12.24f, 8.52f)
            curveToRelative(0.56f, -0.36f, 1.35f, -2.3f, 6.5f, 0.37f)
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
            moveTo(125.45f, 164.0f)
            curveToRelative(0.0f, -1.09f, -1.07f, -5.19f, -6.71f, -2.43f)
            curveToRelative(2.0f, -4.36f, 9.77f, -3.9f, 6.71f, 2.43f)
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
            moveTo(129.89f, 156.0f)
            curveToRelative(0.1f, -1.34f, -0.69f, -6.35f, -7.8f, -2.94f)
            curveToRelative(5.5f, -9.38f, 11.69f, 0.72f, 7.8f, 2.94f)
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
            moveTo(134.17f, 58.2f)
            curveToRelative(0.36f, 4.0f, -0.52f, 8.32f, -0.72f, 12.45f)
            curveToRelative(0.62f, 0.56f, 1.24f, 1.23f, 1.86f, 1.86f)
            curveToRelative(2.84f, -5.74f, 4.8f, -12.14f, 7.58f, -18.0f)
            curveToRelative(0.0f, 0.3f, 0.76f, 5.14f, -5.93f, 19.87f)
            curveToRelative(0.36f, 1.4f, 1.49f, 2.43f, 2.22f, 3.72f)
            curveToRelative(3.25f, -5.26f, 6.19f, -10.58f, 9.5f, -15.8f)
            curveToRelative(-1.35f, 6.0f, -5.17f, 12.14f, -8.16f, 18.0f)
            curveToRelative(0.0f, 1.6f, 1.39f, 2.74f, 1.65f, 4.29f)
            curveToRelative(3.62f, -4.0f, 6.35f, -8.63f, 9.65f, -12.86f)
            curveToRelative(-1.49f, 5.16f, -5.62f, 10.84f, -8.51f, 16.21f)
            curveToRelative(0.41f, 1.14f, 0.56f, 2.38f, 1.08f, 3.52f)
            curveToRelative(2.22f, -1.19f, 14.56f, -17.77f, 5.78f, -4.29f)
            curveToRelative(-1.7f, 2.17f, -3.66f, 4.29f, -5.21f, 6.51f)
            curveToRelative(0.57f, 3.0f, 1.91f, 9.13f, 2.06f, 9.29f)
            curveToRelative(2.0f, -1.6f, 4.0f, -3.41f, 5.94f, -5.21f)
            curveToRelative(-1.76f, 4.33f, -8.62f, 7.28f, -5.21f, 13.0f)
            curveToRelative(5.76f, -6.61f, 7.27f, -5.89f, 7.43f, -5.73f)
            curveToRelative(-8.55f, 7.15f, -7.18f, 15.44f, -6.87f, 15.59f)
            curveToRelative(2.79f, -2.37f, 5.37f, -4.8f, 8.37f, -7.08f)
            arcToRelative(107.66f, 107.66f, 0.0f, false, true, -8.37f, 9.87f)
            curveToRelative(0.06f, 0.72f, -0.15f, 1.5f, 0.16f, 2.06f)
            arcToRelative(50.0f, 50.0f, 0.0f, false, true, 9.5f, -5.21f)
            lineToRelative(0.2f, 0.21f)
            curveToRelative(-3.2f, 3.25f, -7.0f, 5.42f, -10.06f, 8.52f)
            curveToRelative(-0.16f, 0.77f, 0.26f, 2.16f, 1.13f, 1.13f)
            curveToRelative(3.82f, -2.22f, 7.8f, -3.87f, 11.72f, -5.78f)
            curveToRelative(-3.77f, 3.2f, -8.77f, 6.25f, -13.0f, 9.65f)
            curveToRelative(0.21f, 0.63f, -0.41f, 0.88f, -0.2f, 1.51f)
            curveToRelative(4.54f, -1.55f, 9.13f, -4.14f, 14.14f, -5.22f)
            curveToRelative(-3.87f, 2.63f, -9.65f, 5.22f, -14.5f, 7.64f)
            arcToRelative(24.84f, 24.84f, 0.0f, false, false, -0.93f, 3.51f)
            arcToRelative(83.76f, 83.76f, 0.0f, false, true, 8.92f, -2.0f)
            curveToRelative(-2.52f, 1.0f, -6.34f, 2.73f, -9.49f, 4.08f)
            curveToRelative(-5.68f, 18.33f, 14.51f, -48.76f, -18.0f, -76.22f)
            arcToRelative(18.38f, 18.38f, 0.0f, false, true, 2.95f, 0.93f)
            curveToRelative(1.13f, -3.35f, 2.27f, -6.71f, 3.35f, -10.0f)
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
            moveTo(128.44f, 139.07f)
            curveToRelative(0.52f, -1.14f, 8.79f, -6.45f, 6.3f, 4.07f)
            curveToRelative(-2.56f, -8.92f, -7.07f, 1.86f, -6.3f, -4.07f)
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
            moveTo(129.16f, 74.52f)
            curveToRelative(13.53f, 19.52f, 15.9f, 46.53f, 9.29f, 69.91f)
            curveToRelative(1.35f, -10.79f, 7.27f, -36.83f, -9.29f, -69.91f)
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
            moveTo(132.0f, 131.06f)
            curveToRelative(0.41f, -8.62f, -2.3f, -24.15f, 0.36f, -26.8f)
            curveToRelative(0.16f, 0.0f, 2.62f, 23.3f, -0.36f, 26.8f)
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
            moveTo(126.74f, 91.46f)
            curveToRelative(-4.88f, -8.42f, 8.65f, -6.58f, 5.21f, 0.2f)
            curveToRelative(-3.67f, -6.55f, -4.95f, -0.31f, -5.21f, -0.2f)
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
            moveTo(110.37f, 54.85f)
            curveToRelative(2.95f, 1.0f, 6.15f, 1.44f, 8.78f, 3.35f)
            curveToRelative(-4.85f, 1.14f, -0.62f, 5.73f, -1.14f, 8.88f)
            curveToRelative(-0.31f, 0.57f, -0.51f, -0.25f, -0.93f, 0.0f)
            curveToRelative(-0.66f, -1.91f, -0.62f, -4.18f, -1.65f, -5.93f)
            curveToRelative(-3.0f, 2.27f, -8.0f, 8.36f, -8.0f, 8.36f)
            lineToRelative(18.22f, 8.36f)
            reflectiveCurveToRelative(-3.61f, 1.3f, -4.85f, 2.64f)
            curveToRelative(1.14f, 2.53f, 0.83f, 5.63f, 1.65f, 8.36f)
            curveToRelative(-0.1f, 0.47f, -0.46f, -0.25f, -0.92f, 0.0f)
            curveToRelative(-0.57f, -2.63f, -0.47f, -5.52f, -1.3f, -8.0f)
            arcToRelative(129.33f, 129.33f, 0.0f, false, false, -10.94f, 7.59f)
            lineToRelative(19.15f, 12.86f)
            reflectiveCurveToRelative(-4.0f, 1.24f, -5.42f, 2.58f)
            verticalLineToRelative(6.15f)
            curveToRelative(-0.41f, 0.2f, -0.67f, -0.27f, -0.72f, -0.57f)
            curveToRelative(-0.31f, -1.91f, 0.1f, -3.41f, -0.57f, -5.22f)
            curveToRelative(-3.15f, 1.29f, -8.57f, 6.15f, -8.57f, 6.15f)
            lineToRelative(16.73f, 12.85f)
            reflectiveCurveToRelative(-5.32f, 0.47f, -7.95f, 0.73f)
            curveToRelative(-0.88f, 2.22f, -1.45f, 4.59f, -2.28f, 6.87f)
            arcToRelative(2.07f, 2.07f, 0.0f, false, false, -0.36f, -0.37f)
            arcToRelative(18.8f, 18.8f, 0.0f, false, false, 1.14f, -6.14f)
            arcTo(92.26f, 92.26f, 0.0f, false, false, 109.0f, 127.5f)
            lineToRelative(15.71f, 15.08f)
            arcToRelative(97.33f, 97.33f, 0.0f, false, true, -9.87f, 4.64f)
            curveToRelative(-2.32f, 6.1f, -5.31f, 11.93f, -7.63f, 18.0f)
            curveToRelative(2.47f, -0.57f, 5.62f, -4.0f, 8.36f, -1.09f)
            curveToRelative(1.08f, 0.93f, 1.08f, 2.58f, 0.77f, 3.87f)
            curveToRelative(-0.36f, 0.16f, -0.1f, 1.0f, -0.57f, 0.58f)
            curveToRelative(-0.62f, -0.32f, 0.16f, -2.0f, -0.36f, -2.8f)
            reflectiveCurveToRelative(-1.15f, -3.82f, -7.43f, 1.5f)
            curveToRelative(3.76f, 15.11f, -8.36f, 19.16f, -10.79f, 20.45f)
            curveToRelative(4.8f, -3.0f, 14.09f, -12.0f, 8.36f, -22.31f)
            arcToRelative(127.84f, 127.84f, 0.0f, false, false, 6.87f, -17.09f)
            curveToRelative(-2.48f, -2.27f, -11.0f, -2.89f, -17.86f, 6.51f)
            curveToRelative(-4.65f, -0.36f, -11.41f, -3.15f, -14.66f, 2.38f)
            curveToRelative(0.87f, -6.74f, 11.92f, -4.09f, 12.44f, -4.65f)
            curveToRelative(10.91f, -12.41f, 20.49f, -7.49f, 20.65f, -7.0f)
            curveToRelative(2.89f, -1.5f, 8.93f, -3.92f, 8.93f, -3.92f)
            lineTo(104.64f, 127.0f)
            lineToRelative(19.88f, -4.86f)
            lineToRelative(-14.87f, -12.65f)
            lineToRelative(14.15f, -8.73f)
            lineTo(104.44f, 89.6f)
            lineToRelative(16.72f, -13.0f)
            lineToRelative(-16.36f, -6.5f)
            reflectiveCurveToRelative(6.45f, -7.0f, 10.22f, -10.22f)
            curveToRelative(0.0f, -0.21f, -18.32f, -7.0f, -4.65f, -5.0f)
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
            moveTo(91.79f, 182.19f)
            curveToRelative(-2.05f, -10.56f, 9.88f, -8.95f, 10.07f, -5.79f)
            curveToRelative(2.1f, 12.0f, -9.37f, 7.85f, -10.07f, 5.79f)
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
            moveTo(80.1f, 126.0f)
            curveToRelative(1.61f, 5.0f, 1.58f, 9.49f, 2.61f, 14.0f)
            curveToRelative(1.19f, -6.57f, 2.11f, -13.27f, 3.51f, -19.73f)
            curveToRelative(0.0f, 5.78f, -0.52f, 12.4f, -0.52f, 18.0f)
            curveToRelative(2.69f, -5.94f, 4.7f, -12.24f, 7.23f, -18.23f)
            curveToRelative(-1.29f, 4.6f, -3.42f, 14.8f, -3.42f, 14.85f)
            curveToRelative(2.58f, -2.84f, 4.0f, -7.0f, 6.57f, -9.79f)
            curveToRelative(-2.38f, 5.68f, -4.0f, 11.78f, -7.44f, 17.1f)
            curveToRelative(-5.32f, -3.41f, -11.2f, 4.0f, -10.37f, 0.56f)
            arcTo(51.53f, 51.53f, 0.0f, false, true, 74.91f, 134.0f)
            curveToRelative(1.5f, 2.64f, 3.87f, 4.75f, 5.58f, 7.29f)
            curveToRelative(0.2f, -0.26f, -0.44f, -16.1f, -0.39f, -15.33f)
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
            moveTo(113.57f, 48.13f)
            curveToRelative(-1.65f, -2.17f, -3.42f, -1.58f, -5.71f, -0.43f)
            curveToRelative(2.15f, -6.43f, 7.34f, -2.06f, 5.71f, 0.43f)
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
            moveTo(121.53f, 44.05f)
            curveToRelative(-2.59f, -0.72f, -3.34f, 0.21f, -4.65f, 3.0f)
            curveToRelative(-1.91f, -8.76f, 4.8f, -3.56f, 4.65f, -3.0f)
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
            moveTo(87.56f, 5.74f)
            curveToRelative(4.23f, 9.0f, 6.45f, 18.79f, 10.74f, 27.73f)
            curveToRelative(1.29f, -0.72f, 4.18f, -2.0f, 4.12f, -2.22f)
            arcTo(221.88f, 221.88f, 0.0f, false, true, 92.93f, 4.66f)
            curveToRelative(4.44f, 8.72f, 6.91f, 18.22f, 10.94f, 27.1f)
            curveToRelative(1.08f, 0.0f, 4.9f, 1.14f, 3.2f, -1.65f)
            curveToRelative(-1.5f, -7.23f, -3.1f, -14.35f, -4.13f, -21.74f)
            curveToRelative(2.89f, 7.59f, 4.0f, 15.91f, 6.35f, 23.81f)
            curveToRelative(0.52f, 0.51f, 1.24f, 0.46f, 1.86f, 0.72f)
            curveToRelative(0.26f, -6.4f, -0.21f, -13.0f, -0.57f, -19.31f)
            curveToRelative(1.81f, 6.71f, 1.55f, 13.0f, 2.58f, 20.0f)
            arcToRelative(5.64f, 5.64f, 0.0f, false, false, 2.07f, 0.93f)
            curveToRelative(1.85f, -6.2f, 2.32f, -13.0f, 3.92f, -19.31f)
            curveToRelative(0.15f, 5.78f, -1.0f, 12.65f, -1.14f, 18.79f)
            curveToRelative(0.42f, 0.16f, 0.88f, 0.37f, 1.29f, 0.52f)
            curveToRelative(3.0f, -7.43f, 5.43f, -15.0f, 8.57f, -22.3f)
            curveToRelative(-1.18f, 7.74f, -4.8f, 15.48f, -7.64f, 23.08f)
            curveToRelative(0.73f, 0.72f, 2.0f, 0.1f, 2.79f, 0.57f)
            curveToRelative(3.72f, -7.6f, 6.66f, -15.5f, 10.79f, -22.88f)
            curveToRelative(-1.24f, 8.67f, -6.71f, 15.59f, -9.65f, 23.6f)
            curveToRelative(1.08f, 0.2f, 2.86f, 2.5f, 3.43f, -0.39f)
            curveToRelative(3.61f, -6.56f, 7.41f, -12.68f, 11.23f, -19.13f)
            arcToRelative(90.21f, 90.21f, 0.0f, false, true, -13.17f, 23.44f)
            curveToRelative(-6.71f, -3.61f, -13.66f, -8.22f, -28.8f, -6.35f)
            curveToRelative(0.41f, -0.36f, -7.0f, -19.0f, -9.29f, -28.45f)
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
            moveTo(110.0f, 41.27f)
            curveToRelative(-1.0f, -0.88f, -2.61f, -1.6f, -5.57f, 1.29f)
            curveToRelative(-1.86f, -5.65f, 6.63f, -5.65f, 5.57f, -1.29f)
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
            moveTo(90.86f, 77.87f)
            curveToRelative(2.27f, -0.15f, 2.07f, 2.43f, 2.79f, 3.72f)
            arcToRelative(4.21f, 4.21f, 0.0f, false, false, -6.5f, 1.5f)
            curveToRelative(-2.23f, -2.57f, 2.16f, -5.32f, 3.71f, -5.22f)
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
            moveTo(78.27f, 81.23f)
            curveToRelative(1.34f, 0.93f, 1.65f, 2.28f, 2.22f, 3.51f)
            curveToRelative(-1.09f, -0.51f, -2.45f, -1.47f, -6.35f, 0.57f)
            curveToRelative(0.0f, -0.82f, 1.14f, -4.33f, 4.13f, -4.08f)
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
            moveTo(66.19f, 95.74f)
            curveToRelative(-1.0f, -4.43f, 7.0f, -9.0f, 8.15f, -0.36f)
            curveToRelative(-6.4f, -5.22f, -7.33f, 2.79f, -8.15f, 0.36f)
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
            moveTo(84.77f, 96.67f)
            curveToRelative(-1.19f, -0.31f, -4.0f, -4.68f, -6.91f, 0.93f)
            curveToRelative(-2.12f, -8.36f, 8.44f, -4.69f, 6.91f, -0.93f)
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
            moveTo(67.48f, 102.41f)
            curveToRelative(0.36f, 1.8f, -3.72f, -3.0f, -6.87f, 2.63f)
            curveToRelative(-1.16f, -6.16f, 5.5f, -8.0f, 6.87f, -2.63f)
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
            moveTo(76.57f, 106.0f)
            curveToRelative(-0.06f, -0.18f, -4.5f, -2.73f, -6.3f, 2.58f)
            curveToRelative(-1.41f, -0.72f, 0.65f, -11.0f, 6.3f, -2.58f)
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
            moveTo(42.39f, 121.41f)
            curveToRelative(2.69f, 1.8f, 6.66f, 4.43f, 9.86f, 6.87f)
            curveToRelative(0.42f, -0.32f, 0.0f, -0.83f, 0.36f, -1.15f)
            curveToRelative(-4.85f, -5.93f, -11.09f, -11.67f, -14.86f, -18.22f)
            curveToRelative(4.18f, 5.43f, 9.75f, 10.58f, 14.86f, 15.28f)
            arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.16f, -3.2f)
            curveToRelative(-2.89f, -3.35f, -5.63f, -6.87f, -8.16f, -10.38f)
            curveToRelative(2.69f, 2.9f, 5.58f, 5.32f, 8.36f, 8.0f)
            curveToRelative(1.0f, -0.47f, 0.42f, -2.0f, 0.73f, -2.63f)
            arcTo(45.83f, 45.83f, 0.0f, false, true, 48.0f, 107.62f)
            curveToRelative(1.86f, 2.07f, 4.0f, 3.61f, 5.73f, 5.57f)
            curveToRelative(0.67f, 0.06f, 0.31f, -1.18f, 0.57f, -0.93f)
            curveToRelative(1.08f, 6.77f, -0.42f, 13.17f, -0.16f, 20.3f)
            curveToRelative(-3.3f, -2.27f, -11.0f, -10.69f, -11.72f, -11.15f)
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
            moveTo(61.0f, 116.76f)
            curveToRelative(-0.6f, -7.1f, 5.0f, -5.06f, 5.73f, -3.93f)
            curveToRelative(1.4f, 1.61f, 0.0f, 0.78f, -1.08f, 0.72f)
            curveToRelative(-2.0f, 0.06f, -3.46f, 1.66f, -4.65f, 3.21f)
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
            moveTo(57.62f, 128.84f)
            curveToRelative(-6.0f, -3.57f, 5.51f, -10.22f, 5.21f, -2.63f)
            curveToRelative(-1.77f, -1.85f, -5.44f, -3.23f, -5.21f, 2.63f)
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
            moveTo(65.26f, 140.72f)
            curveToRelative(-1.45f, -1.22f, -5.81f, -3.29f, -6.14f, 3.0f)
            curveToRelative(-3.79f, -8.34f, 6.76f, -7.19f, 6.14f, -3.0f)
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
            moveTo(67.27f, 151.15f)
            curveToRelative(-1.29f, -0.37f, -5.52f, -2.7f, -6.3f, 4.23f)
            curveToRelative(-4.73f, -4.4f, 5.37f, -11.06f, 6.3f, -4.23f)
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
            moveTo(75.48f, 152.23f)
            curveToRelative(-0.26f, -7.53f, -17.63f, -13.42f, -0.93f, -26.95f)
            curveToRelative(2.0f, -11.1f, 13.16f, -17.3f, 22.09f, -22.31f)
            curveToRelative(3.62f, -20.6f, 3.62f, -42.44f, 5.0f, -63.57f)
            curveToRelative(1.7f, 20.09f, -1.13f, 43.33f, -2.94f, 63.41f)
            curveToRelative(1.13f, -0.82f, 2.37f, -1.39f, 3.51f, -2.27f)
            curveToRelative(8.39f, 13.0f, -6.3f, 37.85f, -9.29f, 42.76f)
            curveToRelative(-1.82f, -1.27f, 13.78f, -27.44f, 9.49f, -40.33f)
            curveToRelative(-5.88f, 4.44f, -12.49f, 6.81f, -18.78f, 10.22f)
            curveToRelative(-5.0f, 3.31f, -5.78f, 9.0f, -7.64f, 13.94f)
            curveToRelative(-2.48f, 2.8f, -6.46f, 4.81f, -6.87f, 8.58f)
            curveToRelative(0.46f, 5.83f, 6.0f, 9.61f, 6.71f, 15.44f)
            curveToRelative(11.57f, -4.92f, 11.0f, -1.09f, 13.57f, 0.63f)
            lineToRelative(0.52f, 0.3f)
            arcToRelative(3.72f, 3.72f, 0.0f, false, true, -0.52f, -0.3f)
            curveToRelative(-4.46f, -2.31f, -15.08f, -3.54f, -21.57f, 13.31f)
            curveToRelative(-1.0f, -5.78f, 3.51f, -10.07f, 7.64f, -12.86f)
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
            moveTo(73.21f, 162.82f)
            curveToRelative(-3.1f, 4.7f, -0.57f, 10.17f, 0.78f, 15.28f)
            curveToRelative(5.65f, -20.0f, 17.13f, -15.75f, 21.73f, -13.42f)
            curveToRelative(-7.49f, -1.81f, -26.63f, 4.2f, -17.3f, 28.09f)
            curveToRelative(-1.6f, -0.31f, -13.69f, -29.86f, -5.21f, -30.0f)
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
            moveTo(80.13f, 189.78f)
            curveToRelative(2.0f, 1.54f, 7.31f, 5.95f, 5.93f, 7.64f)
            curveToRelative(-3.76f, -1.0f, -4.0f, -5.06f, -5.93f, -7.64f)
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
            moveTo(80.85f, 187.55f)
            curveToRelative(-0.52f, -2.61f, 4.28f, -3.0f, 5.37f, -2.42f)
            curveToRelative(0.93f, 0.41f, 0.62f, 1.34f, 0.93f, 2.06f)
            curveToRelative(-0.62f, 0.83f, -3.31f, -0.31f, -2.79f, 1.86f)
            curveTo(86.79f, 191.58f, 90.0f, 193.0f, 92.0f, 195.76f)
            curveToRelative(0.1f, 0.93f, -1.19f, 0.73f, -1.14f, 1.66f)
            curveToRelative(-2.94f, -3.77f, -7.53f, -6.0f, -10.0f, -9.87f)
        }
    }
        .build()
}
