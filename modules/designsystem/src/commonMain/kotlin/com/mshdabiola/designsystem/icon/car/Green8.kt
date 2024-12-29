package com.mshdabiola.designsystem.icon.car

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

fun Car.getGreen(iconColor: Color, accentColor: Color): ImageVector {
    return Builder(
        name = "Green8",
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
            moveTo(196.13f, 84.1f)
            curveToRelative(-0.87f, -2.44f, -1.0f, -4.88f, -3.14f, -6.8f)
            curveToRelative(1.66f, -2.06f, 3.52f, -4.44f, 3.0f, -7.0f)
            curveToRelative(-3.09f, -5.5f, -9.05f, -5.82f, -14.22f, -7.65f)
            curveToRelative(-2.88f, -1.16f, -5.06f, 1.69f, -7.65f, -0.32f)
            curveToRelative(-3.34f, -0.37f, -7.06f, -1.42f, -10.78f, -1.16f)
            curveToRelative(-1.22f, -1.71f, -3.54f, -1.65f, -5.44f, -2.18f)
            curveToRelative(-4.65f, -0.4f, -10.17f, -0.67f, -15.0f, 0.21f)
            arcToRelative(11.8f, 11.8f, 0.0f, false, false, -2.93f, -0.85f)
            curveToRelative(-10.44f, -3.0f, -21.0f, -3.74f, -32.65f, -3.74f)
            curveToRelative(-7.53f, 0.51f, -15.23f, 0.69f, -21.85f, 3.42f)
            curveTo(76.37f, 59.81f, 68.72f, 64.6f, 60.7f, 69.14f)
            curveToRelative(-4.94f, 1.68f, -9.42f, 3.86f, -14.65f, 4.91f)
            curveToRelative(-7.0f, 1.94f, -13.81f, 4.21f, -20.7f, 6.71f)
            curveToRelative(-6.83f, 3.84f, -13.92f, 8.0f, -20.12f, 13.17f)
            curveTo(3.23f, 98.0f, 1.66f, 102.32f, 0.0f, 106.6f)
            curveToRelative(0.15f, 6.13f, 4.42f, 10.81f, 5.67f, 16.62f)
            curveToRelative(1.6f, 4.0f, 3.57f, 8.08f, 7.21f, 11.1f)
            curveToRelative(2.88f, 2.5f, 6.1f, 4.85f, 9.42f, 5.64f)
            curveToRelative(4.7f, 2.0f, 9.56f, 2.76f, 14.77f, 3.57f)
            arcToRelative(3.83f, 3.83f, 0.0f, false, false, 2.09f, 0.53f)
            curveToRelative(3.4f, 2.17f, 8.17f, 1.07f, 12.12f, 0.93f)
            curveToRelative(6.77f, -0.91f, 13.63f, -1.81f, 20.2f, -3.34f)
            curveToRelative(2.41f, -1.05f, 5.15f, -1.32f, 7.65f, -2.21f)
            lineToRelative(3.66f, 1.0f)
            curveToRelative(2.27f, 0.32f, 5.0f, 0.44f, 6.92f, -0.73f)
            arcToRelative(18.88f, 18.88f, 0.0f, false, false, 9.62f, -8.69f)
            curveToRelative(0.17f, 0.88f, -0.7f, 1.95f, -0.52f, 2.94f)
            arcToRelative(31.88f, 31.88f, 0.0f, false, false, 3.46f, -0.52f)
            curveToRelative(4.12f, -3.31f, 9.47f, -4.16f, 14.41f, -5.76f)
            curveToRelative(5.79f, -1.16f, 11.0f, -3.0f, 16.75f, -4.3f)
            curveToRelative(5.43f, -0.7f, 10.26f, -2.06f, 15.69f, -2.7f)
            curveToRelative(2.13f, 0.0f, 4.45f, -1.0f, 6.4f, 0.08f)
            curveToRelative(3.32f, 0.21f, 6.77f, 2.3f, 10.58f, 1.0f)
            curveToRelative(7.27f, -1.3f, 9.68f, -9.21f, 11.4f, -15.17f)
            arcToRelative(8.51f, 8.51f, 0.0f, false, true, 1.89f, 0.24f)
            curveToRelative(6.63f, -3.17f, 12.38f, -7.36f, 18.63f, -11.31f)
            arcToRelative(9.5f, 9.5f, 0.0f, false, false, 1.14f, -2.09f)
            arcTo(57.23f, 57.23f, 0.0f, false, true, 200.0f, 86.0f)
            lineToRelative(-3.87f, -1.89f)
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
            moveTo(160.35f, 62.45f)
            lineToRelative(0.81f, 1.0f)
            curveToRelative(-0.14f, -0.06f, -0.2f, 0.11f, -0.29f, 0.2f)
            curveToRelative(0.26f, 0.15f, 0.49f, 0.75f, 0.93f, 0.61f)
            curveToRelative(1.0f, -1.54f, 3.11f, -0.44f, 4.71f, -0.61f)
            curveToRelative(3.31f, 0.75f, 6.66f, 0.87f, 9.53f, 2.41f)
            arcToRelative(5.05f, 5.05f, 0.0f, false, false, 0.73f, 0.82f)
            curveToRelative(0.84f, -0.15f, 1.4f, -1.08f, 2.18f, -1.46f)
            arcToRelative(32.07f, 32.07f, 0.0f, false, true, 10.26f, 3.0f)
            curveToRelative(3.6f, 2.58f, -0.53f, 4.67f, -0.72f, 5.14f)
            curveToRelative(-4.45f, -3.0f, -9.42f, -4.71f, -14.54f, -6.07f)
            curveToRelative(-2.67f, -0.35f, -5.75f, -1.0f, -8.6f, -1.46f)
            lineToRelative(-8.14f, -1.27f)
            arcToRelative(91.73f, 91.73f, 0.0f, false, false, -9.42f, -4.08f)
            curveToRelative(4.45f, 0.24f, 8.75f, 0.18f, 12.56f, 1.69f)
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
            moveTo(86.0f, 60.54f)
            curveToRelative(9.89f, 6.11f, 36.34f, 9.89f, 36.34f, 9.89f)
            curveToRelative(-1.89f, 2.54f, -3.63f, 3.63f, -6.4f, 5.23f)
            curveToRelative(-2.68f, -3.41f, -7.72f, 0.82f, -11.0f, -2.0f)
            curveToRelative(-1.67f, -1.43f, -1.0f, -4.64f, -3.2f, -4.64f)
            curveToRelative(-2.76f, 0.0f, -5.35f, 3.39f, -7.0f, 1.16f)
            curveToRelative(-0.31f, -0.41f, -0.15f, -1.0f, -0.59f, -1.16f)
            curveToRelative(-3.0f, -1.0f, -7.41f, 1.16f, -8.43f, -0.29f)
            arcToRelative(5.81f, 5.81f, 0.0f, false, false, 0.0f, -2.62f)
            curveToRelative(-0.94f, -2.43f, -2.9f, -2.18f, -6.68f, -0.07f)
            curveToRelative(-1.17f, 0.58f, -1.31f, 1.74f, -2.33f, 2.4f)
            curveToRelative(-1.89f, 1.23f, -3.92f, 0.5f, -5.81f, 1.74f)
            reflectiveCurveToRelative(-4.94f, 1.16f, -4.94f, 3.48f)
            curveToRelative(0.0f, 0.44f, -0.29f, 0.0f, -1.17f, 0.0f)
            curveToRelative(-1.38f, 0.0f, -2.32f, -0.87f, -3.48f, -1.45f)
            curveToRelative(0.0f, 0.0f, 11.91f, -8.72f, 24.7f, -11.63f)
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
            moveTo(9.53f, 93.52f)
            arcToRelative(22.39f, 22.39f, 0.0f, false, true, 0.83f, 4.4f)
            arcToRelative(20.66f, 20.66f, 0.0f, false, true, -0.83f, 5.62f)
            curveToRelative(-1.33f, -2.15f, -1.71f, -5.37f, -2.09f, -8.25f)
            arcToRelative(26.86f, 26.86f, 0.0f, false, false, 2.09f, -1.77f)
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
            moveTo(80.31f, 126.08f)
            curveToRelative(1.16f, -5.67f, 1.59f, -8.43f, 4.5f, -12.93f)
            curveToRelative(2.43f, -3.77f, 6.56f, -6.5f, 9.38f, -6.67f)
            curveToRelative(-0.1f, 0.51f, -5.38f, 2.44f, -8.36f, 6.81f)
            curveToRelative(-4.51f, 7.12f, -4.07f, 13.37f, -5.52f, 12.79f)
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
            moveTo(86.25f, 122.17f)
            lineToRelative(1.66f, 0.32f)
            curveToRelative(-0.15f, -0.06f, 1.94f, -1.8f, 2.53f, -3.0f)
            curveToRelative(0.62f, 1.67f, -0.59f, 7.32f, -4.39f, 8.45f)
            curveToRelative(-0.09f, -1.86f, 0.11f, -4.0f, 0.2f, -5.75f)
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
            moveTo(89.59f, 130.46f)
            arcToRelative(2.89f, 2.89f, 0.0f, false, true, -2.2f, 0.0f)
            lineToRelative(-0.21f, -0.24f)
            arcTo(12.74f, 12.74f, 0.0f, false, false, 92.0f, 123.86f)
            curveToRelative(-0.15f, 0.32f, 0.32f, 0.52f, 0.52f, 0.58f)
            lineTo(94.71f, 123.0f)
            curveToRelative(0.09f, 0.23f, -0.37f, 0.88f, 0.16f, 1.06f)
            lineToRelative(0.36f, -0.14f)
            curveToRelative(-0.93f, 2.65f, -2.64f, 5.73f, -5.64f, 6.52f)
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
            moveTo(98.77f, 123.61f)
            arcToRelative(13.45f, 13.45f, 0.0f, false, true, -7.27f, 8.86f)
            reflectiveCurveTo(98.18f, 126.81f, 98.0f, 113.0f)
            arcToRelative(13.39f, 13.39f, 0.0f, false, true, 0.73f, 10.61f)
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
            moveTo(158.86f, 104.82f)
            curveToRelative(-1.83f, -2.82f, 2.5f, -8.53f, 2.87f, -9.11f)
            arcToRelative(11.15f, 11.15f, 0.0f, false, true, 3.1f, -2.4f)
            curveToRelative(-3.78f, 3.0f, -5.09f, 7.21f, -6.0f, 11.51f)
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
            moveTo(166.31f, 114.24f)
            curveToRelative(-1.0f, 0.58f, -1.57f, -0.58f, -1.77f, -1.28f)
            arcToRelative(6.85f, 6.85f, 0.0f, false, true, -0.33f, -2.38f)
            curveToRelative(1.34f, -1.0f, 1.31f, -2.68f, 2.0f, -4.0f)
            curveToRelative(0.32f, 0.2f, -0.23f, 1.1f, 0.52f, 1.0f)
            arcToRelative(1.8f, 1.8f, 0.0f, false, true, 1.0f, -0.84f)
            curveToRelative(0.5f, 0.7f, -0.52f, 1.33f, 0.09f, 2.0f)
            curveToRelative(0.9f, 0.17f, 1.0f, -0.76f, 1.89f, -0.21f)
            curveToRelative(-0.15f, 0.06f, -0.12f, 0.21f, -0.12f, 0.32f)
            curveToRelative(0.26f, 0.52f, 0.7f, -0.14f, 1.0f, 0.12f)
            arcToRelative(11.73f, 11.73f, 0.0f, false, true, -4.18f, 5.23f)
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
            moveTo(174.93f, 107.05f)
            arcToRelative(13.48f, 13.48f, 0.0f, false, true, -7.27f, 8.86f)
            reflectiveCurveToRelative(6.68f, -5.67f, 6.54f, -19.47f)
            arcToRelative(13.39f, 13.39f, 0.0f, false, true, 0.73f, 10.61f)
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
            moveTo(197.27f, 90.26f)
            arcToRelative(2.25f, 2.25f, 0.0f, false, true, -0.73f, -0.61f)
            curveToRelative(0.23f, -0.55f, -0.32f, -1.36f, -0.32f, -1.36f)
            arcToRelative(148.85f, 148.85f, 0.0f, false, true, -15.58f, 7.64f)
            curveToRelative(-0.79f, 0.78f, 0.14f, 1.6f, 0.0f, 2.5f)
            curveToRelative(-0.18f, 1.48f, 0.0f, 3.14f, -0.53f, 4.51f)
            arcToRelative(17.27f, 17.27f, 0.0f, false, false, -1.45f, -9.34f)
            curveToRelative(-2.43f, -6.46f, -8.09f, -6.3f, -11.22f, -5.75f)
            curveToRelative(-5.79f, 2.06f, -10.06f, 8.34f, -11.8f, 13.72f)
            arcToRelative(26.18f, 26.18f, 0.0f, false, false, -1.57f, 12.87f)
            curveToRelative(0.23f, 1.6f, -1.48f, 2.82f, -2.73f, 3.87f)
            arcTo(213.28f, 213.28f, 0.0f, false, false, 122.76f, 123.0f)
            curveToRelative(0.0f, -1.15f, 0.57f, -1.3f, 5.22f, -2.17f)
            arcToRelative(139.94f, 139.94f, 0.0f, false, true, 19.18f, -3.63f)
            arcToRelative(8.15f, 8.15f, 0.0f, false, false, 4.22f, -3.0f)
            curveToRelative(0.84f, -4.74f, 1.0f, -9.16f, 3.05f, -13.52f)
            lineToRelative(-1.74f, -0.14f)
            curveToRelative(-3.34f, 2.0f, -2.29f, 6.32f, -6.27f, 7.22f)
            curveToRelative(-1.54f, 1.07f, -1.0f, 3.22f, -2.93f, 4.0f)
            curveToRelative(-1.31f, 0.81f, -3.0f, -0.29f, -4.3f, 0.52f)
            arcToRelative(44.31f, 44.31f, 0.0f, false, false, -6.49f, 1.0f)
            curveToRelative(-0.41f, -0.52f, 0.67f, -1.3f, -0.32f, -1.57f)
            curveToRelative(-2.26f, 0.27f, -4.42f, 1.14f, -6.57f, 1.34f)
            curveToRelative(-1.0f, 0.64f, -2.32f, 0.49f, -3.37f, 1.0f)
            curveToRelative(-2.12f, 0.0f, -3.86f, 2.12f, -6.28f, 1.0f)
            curveToRelative(-1.69f, 0.62f, -3.57f, -0.17f, -5.11f, 0.85f)
            lineToRelative(-0.53f, -0.12f)
            curveToRelative(-0.67f, -1.22f, -1.57f, -2.53f, -2.21f, -3.87f)
            curveToRelative(-0.61f, -0.11f, -1.25f, -1.16f, -1.86f, -0.31f)
            curveToRelative(1.46f, 4.3f, 0.0f, 8.69f, -0.43f, 13.0f)
            lineToRelative(-1.37f, 4.62f)
            lineToRelative(-0.52f, 0.32f)
            curveToRelative(0.9f, -6.83f, 2.79f, -15.06f, 0.52f, -22.09f)
            curveToRelative(-0.81f, -2.32f, -2.67f, -5.23f, -5.32f, -6.07f)
            curveToRelative(-7.27f, -1.6f, -12.56f, 4.1f, -16.34f, 9.53f)
            curveToRelative(-3.0f, 3.72f, -3.69f, 8.0f, -5.0f, 12.44f)
            curveToRelative(-0.37f, 2.0f, 0.0f, 4.7f, -0.72f, 6.6f)
            arcToRelative(32.65f, 32.65f, 0.0f, false, true, -2.5f, 7.2f)
            curveToRelative(-6.16f, 2.59f, -13.14f, 3.11f, -19.8f, 4.42f)
            curveToRelative(-5.23f, 0.06f, -11.0f, 1.83f, -15.7f, -0.76f)
            arcTo(38.29f, 38.29f, 0.0f, false, true, 22.0f, 136.54f)
            curveToRelative(-4.83f, -2.45f, -8.17f, -4.44f, -11.0f, -8.42f)
            curveToRelative(-1.24f, -2.0f, -3.37f, -4.65f, -3.92f, -7.0f)
            curveToRelative(0.35f, -1.71f, 1.11f, -4.48f, 1.6f, -6.1f)
            curveToRelative(-1.19f, -2.91f, -3.18f, -4.43f, -3.94f, -7.6f)
            curveToRelative(-2.0f, -3.0f, 0.17f, -6.07f, 1.0f, -9.0f)
            lineToRelative(0.09f, -0.52f)
            curveToRelative(0.9f, 2.81f, 0.75f, 6.42f, 3.57f, 8.36f)
            curveToRelative(3.07f, 0.24f, 2.8f, -3.94f, 3.0f, -5.75f)
            curveToRelative(0.13f, -2.91f, 0.29f, -5.9f, -0.73f, -8.37f)
            curveToRelative(5.61f, -4.3f, 11.45f, -8.37f, 18.2f, -10.05f)
            curveTo(38.58f, 79.45f, 47.27f, 76.4f, 56.0f, 74.0f)
            curveToRelative(7.61f, 6.1f, 16.0f, 11.0f, 25.11f, 13.6f)
            curveToRelative(5.09f, 1.66f, 10.27f, 2.09f, 15.5f, 3.34f)
            lineToRelative(7.76f, 0.93f)
            lineToRelative(-2.62f, 2.1f)
            arcToRelative(0.46f, 0.46f, 0.0f, false, false, 0.21f, 0.52f)
            curveToRelative(3.49f, -0.09f, 6.34f, -1.77f, 9.73f, -2.18f)
            curveToRelative(3.2f, -7.44f, 8.61f, -14.0f, 13.29f, -20.84f)
            curveToRelative(0.84f, -1.3f, 2.09f, -2.41f, 2.82f, -3.75f)
            curveToRelative(-0.47f, -0.58f, -1.77f, -0.11f, -1.77f, -0.11f)
            arcToRelative(127.83f, 127.83f, 0.0f, false, true, -22.0f, -2.21f)
            curveToRelative(-3.61f, -0.64f, -6.22f, -1.92f, -9.62f, -3.0f)
            curveToRelative(-2.21f, -0.69f, -4.48f, -1.91f, -6.8f, -2.61f)
            curveToRelative(5.23f, -3.0f, 12.26f, -2.5f, 18.4f, -3.26f)
            arcToRelative(132.68f, 132.68f, 0.0f, false, true, 19.36f, 0.85f)
            curveToRelative(8.0f, 1.28f, 15.64f, 2.52f, 22.7f, 6.07f)
            curveToRelative(-0.41f, 0.26f, -2.0f, 0.09f, -2.09f, 1.16f)
            curveToRelative(0.93f, 0.44f, 2.24f, 0.0f, 3.13f, 0.41f)
            curveToRelative(4.69f, 1.48f, 9.0f, 2.09f, 13.09f, 4.91f)
            curveToRelative(1.69f, 0.87f, 3.0f, 2.5f, 4.62f, 3.58f)
            arcToRelative(11.7f, 11.7f, 0.0f, false, true, -4.71f, 3.42f)
            lineToRelative(-0.11f, -0.24f)
            curveToRelative(0.46f, -0.27f, 0.64f, -0.29f, 0.28f, -1.0f)
            curveToRelative(-0.56f, -0.56f, -1.0f, 0.36f, -1.65f, 0.3f)
            curveToRelative(-1.66f, -2.49f, -4.19f, -4.15f, -5.53f, -6.79f)
            curveToRelative(0.38f, 0.26f, 0.56f, 0.0f, 1.0f, 0.11f)
            lineToRelative(0.29f, -0.44f)
            curveToRelative(-0.55f, -0.72f, -1.57f, -0.49f, -2.38f, -1.0f)
            curveToRelative(-1.0f, 0.17f, -2.0f, -0.87f, -2.62f, 0.11f)
            curveToRelative(1.6f, 4.0f, 7.74f, 10.87f, 7.74f, 11.0f)
            curveToRelative(0.43f, 0.44f, 1.51f, 0.0f, 2.09f, 0.41f)
            curveToRelative(3.46f, -1.83f, 7.24f, -3.26f, 10.06f, -6.28f)
            arcToRelative(47.06f, 47.06f, 0.0f, false, false, -8.81f, -5.84f)
            curveToRelative(5.4f, 1.0f, 11.31f, 2.0f, 16.42f, 4.0f)
            arcToRelative(35.71f, 35.71f, 0.0f, false, true, 13.2f, 8.29f)
            curveToRelative(0.7f, 1.1f, 1.53f, 2.22f, 1.09f, 3.67f)
            curveToRelative(-1.24f, 0.36f, -3.77f, 0.56f, -4.43f, 1.12f)
            curveToRelative(-3.23f, 0.44f, -3.17f, 4.16f, -6.0f, 5.55f)
            curveToRelative(-0.9f, 0.44f, -2.1f, 0.79f, -2.41f, 1.89f)
            curveToRelative(-0.29f, 0.81f, -0.76f, 1.8f, -0.44f, 2.61f)
            curveToRelative(6.07f, -1.71f, 11.28f, -4.79f, 17.0f, -7.43f)
            arcToRelative(6.67f, 6.67f, 0.0f, false, true, 0.29f, 3.45f)
        }
    }
        .build()
}
