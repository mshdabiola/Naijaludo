package com.mshdabiola.designsystem.icon.cat

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

fun Cat.getGreen(iconColor: Color, accentColor: Color): ImageVector {
    return Builder(
        name = "Green3",
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
            moveTo(38.41f, 20.08f)
            arcTo(13.08f, 13.08f, 0.0f, false, false, 33.9f, 32.47f)
            arcToRelative(2.1f, 2.1f, 0.0f, false, true, -1.37f, -0.57f)
            curveToRelative(-1.47f, 0.0f, -2.75f, 0.0f, -3.41f, 0.69f)
            curveToRelative(-2.44f, -1.31f, -5.63f, -0.45f, -8.0f, 0.56f)
            curveToRelative(-1.66f, 1.0f, -2.11f, 3.19f, -4.49f, 2.34f)
            curveToRelative(-0.46f, -0.17f, -1.25f, -0.73f, -0.52f, -1.25f)
            curveToRelative(-0.56f, -0.63f, 0.0f, -1.82f, -0.85f, -2.17f)
            curveTo(8.7f, 33.15f, 6.0f, 40.73f, 2.5f, 45.44f)
            arcTo(19.26f, 19.26f, 0.0f, false, false, 0.0f, 55.28f)
            arcToRelative(92.28f, 92.28f, 0.0f, false, true, 0.92f, 15.3f)
            curveToRelative(-1.08f, 6.0f, 2.89f, 9.9f, 3.63f, 15.24f)
            curveToRelative(1.0f, 2.0f, 1.31f, 3.82f, 2.28f, 5.75f)
            curveToRelative(1.87f, 2.56f, 4.6f, 5.58f, 8.18f, 5.0f)
            arcToRelative(2.93f, 2.93f, 0.0f, false, false, 1.83f, -2.9f)
            arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.08f, 0.68f)
            curveToRelative(1.76f, 2.39f, 5.23f, -1.36f, 6.43f, 1.65f)
            curveToRelative(1.42f, 0.52f, 2.44f, -0.57f, 3.52f, -1.08f)
            arcToRelative(5.2f, 5.2f, 0.0f, false, false, 3.53f, 0.79f)
            curveToRelative(1.13f, 0.0f, 2.21f, -0.28f, 2.62f, -1.19f)
            arcTo(8.18f, 8.18f, 0.0f, false, false, 40.27f, 94.0f)
            curveToRelative(1.06f, -0.12f, 5.64f, -0.07f, 6.83f, 3.0f)
            curveToRelative(0.17f, 5.8f, 4.32f, 9.0f, 7.28f, 13.0f)
            arcToRelative(61.58f, 61.58f, 0.0f, false, false, 5.69f, 17.46f)
            curveToRelative(1.81f, 1.31f, 0.9f, 3.59f, 2.9f, 4.67f)
            curveToRelative(2.0f, 6.37f, 5.91f, 10.35f, 10.0f, 15.69f)
            curveToRelative(10.18f, 8.0f, 21.39f, 16.62f, 34.42f, 19.8f)
            curveToRelative(8.41f, 1.65f, 16.38f, 5.06f, 25.54f, 5.46f)
            arcToRelative(32.07f, 32.07f, 0.0f, false, false, 9.0f, 0.4f)
            curveToRelative(5.86f, 0.91f, 12.24f, 0.05f, 18.0f, 0.0f)
            curveToRelative(3.18f, 0.46f, 6.94f, 0.74f, 10.52f, 1.36f)
            curveToRelative(4.83f, 0.52f, 12.76f, 2.88f, 14.34f, 4.27f)
            curveToRelative(3.41f, 1.24f, 8.13f, 1.78f, 9.38f, -1.25f)
            arcToRelative(17.0f, 17.0f, 0.0f, false, true, 2.22f, -3.7f)
            curveToRelative(3.24f, -6.25f, 2.39f, -14.79f, 3.64f, -21.84f)
            curveToRelative(-2.5f, -10.12f, -0.91f, -19.0f, -0.8f, -29.63f)
            curveToRelative(-1.25f, -3.0f, -0.79f, -6.72f, -2.45f, -9.56f)
            arcToRelative(14.44f, 14.44f, 0.0f, false, false, 0.29f, -10.47f)
            arcTo(17.82f, 17.82f, 0.0f, false, false, 198.0f, 91.74f)
            curveToRelative(-2.73f, -3.3f, -0.11f, -8.13f, -3.24f, -11.2f)
            curveToRelative(-0.92f, -4.44f, 1.65f, -7.9f, 0.4f, -12.0f)
            curveToRelative(-1.15f, -3.58f, -1.65f, -8.14f, -5.75f, -9.45f)
            curveToRelative(0.21f, -0.91f, 1.11f, -0.49f, 1.65f, -2.0f)
            curveToRelative(0.91f, -5.24f, 3.7f, -10.0f, 3.7f, -15.82f)
            curveToRelative(-0.85f, -4.0f, -0.68f, -9.49f, -4.38f, -11.77f)
            curveToRelative(-4.15f, -1.59f, -6.0f, 3.47f, -8.48f, 6.0f)
            curveToRelative(-1.0f, 1.82f, -0.11f, 4.89f, -2.33f, 5.74f)
            curveToRelative(-9.1f, 3.0f, -19.0f, 4.66f, -28.78f, 6.37f)
            curveToRelative(-9.0f, 0.52f, -17.86f, 3.08f, -27.0f, 1.54f)
            arcToRelative(9.33f, 9.33f, 0.0f, false, true, -3.59f, -0.85f)
            curveToRelative(-6.6f, -1.59f, -12.51f, -4.9f, -18.94f, -6.94f)
            curveToRelative(-1.76f, -1.08f, -4.0f, -0.58f, -5.63f, -1.66f)
            curveToRelative(-9.38f, -1.52f, -18.43f, -5.56f, -28.66f, -3.41f)
            curveToRelative(-6.1f, -0.57f, -11.55f, -0.79f, -17.3f, 0.68f)
            arcToRelative(1.56f, 1.56f, 0.0f, false, true, -1.13f, -1.18f)
            curveToRelative(0.64f, -1.0f, 4.65f, -3.46f, 9.0f, -4.7f)
            curveToRelative(0.85f, -0.24f, 0.52f, -0.64f, 0.0f, -0.45f)
            arcTo(35.0f, 35.0f, 0.0f, false, false, 48.0f, 35.0f)
            arcToRelative(14.0f, 14.0f, 0.0f, false, true, -1.53f, -1.2f)
            curveToRelative(-1.0f, -0.52f, -2.0f, -0.53f, -2.65f, -1.44f)
            curveToRelative(4.0f, -4.89f, 7.0f, -5.58f, 10.6f, -7.69f)
            curveToRelative(0.1f, -0.11f, 0.0f, -0.31f, -0.29f, -0.19f)
            curveToRelative(-4.15f, 1.88f, -8.0f, 4.13f, -10.79f, 7.84f)
            arcTo(21.79f, 21.79f, 0.0f, false, true, 40.0f, 31.68f)
            curveToRelative(0.81f, -1.23f, 2.58f, -4.74f, 3.58f, -6.21f)
            curveToRelative(0.07f, -0.11f, -0.24f, -0.28f, -0.28f, -0.23f)
            curveToRelative(-1.35f, 1.47f, -3.46f, 6.0f, -4.0f, 6.25f)
            curveToRelative(-1.24f, 0.68f, -3.64f, -0.49f, -4.79f, 0.87f)
            curveToRelative(-1.17f, -3.91f, 0.24f, -8.35f, 4.11f, -12.13f)
            curveToRelative(0.31f, -0.34f, 0.09f, -0.46f, -0.28f, -0.15f)
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
            moveTo(179.05f, 129.51f)
            quadToRelative(0.42f, 4.53f, 0.85f, 9.0f)
            curveToRelative(-3.59f, 2.54f, -0.46f, 7.68f, -0.57f, 11.44f)
            curveToRelative(0.51f, 3.35f, -1.7f, 4.0f, -1.69f, 7.51f)
            curveToRelative(0.62f, 0.91f, 2.72f, 1.22f, 1.69f, 2.73f)
            arcToRelative(2.54f, 2.54f, 0.0f, false, false, -0.21f, 2.54f)
            curveToRelative(0.86f, 0.91f, 2.26f, 0.53f, 3.34f, 0.19f)
            curveToRelative(1.14f, -0.17f, 2.78f, -0.4f, 3.29f, 0.68f)
            curveToRelative(1.26f, 1.7f, -0.11f, 3.7f, 0.12f, 5.63f)
            curveToRelative(-1.42f, 1.08f, -3.47f, 1.59f, -3.41f, 3.7f)
            arcToRelative(9.49f, 9.49f, 0.0f, false, true, -7.06f, 1.48f)
            arcToRelative(4.61f, 4.61f, 0.0f, false, true, -2.9f, 0.11f)
            curveToRelative(1.26f, -0.85f, 0.34f, -2.33f, -0.68f, -2.73f)
            curveToRelative(1.08f, -0.91f, 3.29f, -1.25f, 4.0f, -2.84f)
            curveToRelative(-0.4f, -2.22f, 3.36f, -1.6f, 2.0f, -4.1f)
            curveToRelative(1.0f, -1.0f, -0.17f, -2.28f, -0.29f, -3.41f)
            curveToRelative(-0.28f, -1.31f, -2.27f, -2.45f, -1.0f, -4.0f)
            curveToRelative(0.36f, -2.26f, 0.27f, -4.61f, 0.73f, -6.83f)
            curveToRelative(-0.11f, -0.06f, -0.21f, -0.17f, -0.32f, -0.23f)
            curveToRelative(0.68f, -4.0f, 1.83f, -8.85f, -0.52f, -12.45f)
            curveToRelative(0.52f, -3.3f, 3.08f, -7.11f, 1.0f, -10.64f)
            curveToRelative(0.74f, -0.74f, 0.06f, -2.72f, 1.2f, -2.73f)
            curveToRelative(0.78f, 1.47f, 0.28f, 3.39f, 0.4f, 4.89f)
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
            moveTo(14.38f, 33.2f)
            curveToRelative(0.41f, 0.29f, 0.45f, 0.89f, 0.33f, 2.0f)
            curveToRelative(-1.65f, 1.59f, -2.57f, 3.21f, -4.23f, 4.57f)
            arcToRelative(12.24f, 12.24f, 0.0f, false, true, 3.9f, -6.58f)
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
            moveTo(1.34f, 59.21f)
            curveToRelative(0.37f, -0.8f, -1.0f, -3.47f, 1.2f, -2.45f)
            curveToRelative(1.42f, -0.73f, 0.73f, -1.82f, 1.07f, -3.0f)
            curveTo(4.07f, 51.0f, 4.7f, 47.89f, 6.8f, 46.12f)
            curveToRelative(0.86f, -0.62f, 2.62f, 0.23f, 2.85f, -1.36f)
            curveToRelative(-0.06f, -1.25f, -0.23f, -3.36f, 1.47f, -3.53f)
            arcToRelative(40.0f, 40.0f, 0.0f, false, false, 4.56f, -5.06f)
            curveToRelative(1.31f, -0.74f, 2.5f, 0.52f, 3.92f, 0.29f)
            arcToRelative(6.58f, 6.58f, 0.0f, false, true, 5.87f, -3.87f)
            arcToRelative(5.0f, 5.0f, 0.0f, false, true, 3.18f, 1.0f)
            curveToRelative(1.59f, -0.79f, 4.0f, -1.07f, 5.39f, 0.12f)
            arcTo(47.06f, 47.06f, 0.0f, false, true, 35.32f, 40.0f)
            curveToRelative(-0.44f, 0.15f, -2.0f, -0.2f, -2.58f, 0.42f)
            curveToRelative(-1.3f, 0.68f, -2.9f, 1.25f, -3.69f, 2.45f)
            arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.29f, 2.33f)
            curveToRelative(0.23f, 0.17f, 0.34f, 0.57f, 0.68f, 0.4f)
            curveToRelative(0.32f, -0.45f, -0.06f, -1.6f, 0.33f, -2.17f)
            arcToRelative(7.32f, 7.32f, 0.0f, false, true, 5.53f, -2.62f)
            curveToRelative(-0.22f, 1.43f, 0.18f, 4.45f, -1.88f, 3.7f)
            curveToRelative(-0.11f, 0.24f, -0.42f, 0.25f, -0.27f, 0.69f)
            curveToRelative(0.44f, 1.19f, 1.0f, -0.52f, 1.35f, 0.0f)
            curveToRelative(0.35f, 1.25f, -1.25f, 1.71f, -0.68f, 2.61f)
            curveToRelative(0.85f, -0.11f, 1.0f, -1.25f, 1.48f, -1.93f)
            curveToRelative(0.15f, 0.15f, -0.17f, 0.86f, 0.4f, 0.68f)
            arcToRelative(2.8f, 2.8f, 0.0f, false, false, 0.57f, 2.06f)
            curveToRelative(0.85f, -0.35f, 1.82f, -1.37f, 1.65f, 0.39f)
            arcToRelative(0.29f, 0.29f, 0.0f, false, false, 0.52f, 0.18f)
            curveToRelative(0.68f, -0.75f, -0.06f, -1.55f, -0.23f, -2.23f)
            curveToRelative(0.95f, -1.19f, 1.0f, -2.0f, 2.0f, -3.13f)
            curveToRelative(1.77f, 1.65f, 1.33f, 3.93f, 1.56f, 6.0f)
            arcToRelative(6.4f, 6.4f, 0.0f, false, true, -3.0f, 4.78f)
            curveToRelative(-1.65f, -0.68f, -5.23f, 1.14f, -5.17f, -2.33f)
            curveToRelative(-1.6f, -0.12f, -2.28f, -2.11f, -3.7f, -1.0f)
            curveToRelative(-2.0f, 0.29f, -3.75f, 1.19f, -5.74f, 1.25f)
            curveToRelative(-2.58f, -0.73f, 0.79f, -1.57f, 1.0f, -3.12f)
            arcToRelative(9.27f, 9.27f, 0.0f, false, false, -3.46f, -9.56f)
            curveToRelative(-0.28f, 0.0f, -0.62f, 0.05f, -0.8f, -0.29f)
            curveToRelative(0.12f, -0.33f, 0.68f, -0.68f, 0.29f, -1.08f)
            arcToRelative(4.82f, 4.82f, 0.0f, false, false, -3.42f, 0.52f)
            arcTo(11.45f, 11.45f, 0.0f, false, false, 13.06f, 49.0f)
            curveToRelative(-1.08f, -0.29f, -1.42f, 0.51f, -1.94f, 1.14f)
            curveToRelative(1.09f, 1.3f, -1.08f, 1.25f, -1.47f, 2.16f)
            curveToRelative(0.06f, 0.91f, -2.5f, 2.0f, -0.4f, 2.45f)
            curveToRelative(0.79f, -0.06f, -0.23f, 0.62f, -0.57f, 0.85f)
            curveToRelative(-1.48f, 0.06f, -2.39f, 1.25f, -3.24f, 2.16f)
            curveTo(5.27f, 59.0f, 6.86f, 58.82f, 7.32f, 59.66f)
            curveToRelative(-1.48f, 1.77f, -4.27f, 2.39f, -4.89f, 4.9f)
            curveToRelative(0.56f, 0.57f, 0.84f, -0.46f, 1.47f, -0.29f)
            curveToRelative(1.19f, 0.11f, 2.45f, 0.79f, 3.59f, 0.17f)
            curveToRelative(0.28f, -0.51f, 0.74f, -1.08f, 1.36f, -1.0f)
            curveToRelative(0.91f, 0.33f, 0.4f, 1.3f, 1.09f, 1.76f)
            curveToRelative(0.68f, -0.11f, 1.42f, -1.0f, 2.33f, -0.28f)
            curveToRelative(-0.43f, 1.37f, 0.73f, 2.0f, 0.5f, 3.29f)
            curveToRelative(0.29f, 0.74f, 1.37f, 0.35f, 1.77f, 0.0f)
            curveToRelative(1.31f, -1.19f, -0.06f, 0.62f, 0.0f, 1.0f)
            arcToRelative(1.57f, 1.57f, 0.0f, false, true, -0.11f, 1.36f)
            curveToRelative(-1.37f, -2.1f, -4.27f, -2.33f, -6.26f, -1.93f)
            curveToRelative(-1.14f, 2.28f, -4.73f, 0.4f, -4.95f, 3.7f)
            arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.79f, 3.52f)
            curveTo(2.0f, 69.39f, 2.78f, 65.8f, 1.34f, 59.21f)
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
            moveTo(36.27f, 45.56f)
            curveToRelative(-1.08f, -0.06f, -0.79f, -1.31f, -0.4f, -1.88f)
            arcToRelative(6.5f, 6.5f, 0.0f, false, false, 2.05f, -2.45f)
            curveToRelative(0.34f, 0.0f, 0.43f, 0.11f, 0.4f, 0.26f)
            arcToRelative(8.67f, 8.67f, 0.0f, false, true, -2.0f, 4.07f)
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
            moveTo(39.84f, 43.2f)
            curveToRelative(-0.76f, 1.0f, -1.16f, 2.4f, -1.81f, 3.0f)
            curveToRelative(-0.35f, 0.34f, -0.78f, 0.4f, -1.47f, -0.13f)
            arcTo(9.72f, 9.72f, 0.0f, false, false, 38.71f, 42.0f)
            curveToRelative(0.75f, -0.4f, 0.85f, 0.66f, 1.13f, 1.17f)
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
            moveTo(37.23f, 41.46f)
            curveToRelative(-0.39f, 0.29f, -1.36f, 1.88f, -1.36f, 0.85f)
            curveToRelative(0.1f, -0.72f, 0.17f, -1.09f, 0.22f, -1.59f)
            curveToRelative(0.34f, 0.09f, 1.07f, 0.0f, 1.29f, 0.17f)
            reflectiveCurveToRelative(0.13f, 0.27f, -0.15f, 0.57f)
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
            moveTo(41.84f, 74.51f)
            curveToRelative(2.28f, 2.39f, 5.33f, 4.19f, 7.68f, 6.71f)
            curveToRelative(0.0f, 1.82f, -2.1f, 2.22f, -3.3f, 3.13f)
            curveToRelative(-0.1f, 0.64f, -0.91f, 0.62f, -0.79f, 1.36f)
            arcToRelative(5.72f, 5.72f, 0.0f, false, true, -1.65f, 3.81f)
            curveToRelative(-2.51f, -3.58f, -2.0f, -8.93f, -4.78f, -12.68f)
            curveToRelative(-0.51f, -1.0f, 0.29f, -1.48f, 1.25f, -1.25f)
            curveToRelative(0.61f, -0.72f, 1.0f, -0.37f, 1.59f, -1.08f)
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
            moveTo(39.68f, 63.48f)
            arcTo(9.14f, 9.14f, 0.0f, false, false, 43.2f, 70.0f)
            arcTo(4.31f, 4.31f, 0.0f, false, true, 42.0f, 73.0f)
            arcToRelative(0.77f, 0.77f, 0.0f, false, true, -0.85f, 0.0f)
            curveToRelative(-2.78f, -2.62f, -4.6f, -5.91f, -4.32f, -9.84f)
            curveToRelative(1.37f, 0.34f, 2.38f, -2.1f, 2.84f, 0.29f)
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
            moveTo(41.05f, 73.54f)
            curveToRelative(-0.18f, 0.74f, -1.14f, 0.18f, -1.49f, 0.68f)
            curveToRelative(-0.22f, -0.5f, -0.59f, -0.28f, -1.0f, 0.0f)
            arcToRelative(1.59f, 1.59f, 0.0f, false, true, -0.68f, 1.0f)
            curveToRelative(-1.54f, -3.0f, -3.0f, -5.62f, -3.07f, -9.26f)
            curveToRelative(0.17f, -0.34f, 0.85f, -0.47f, 1.0f, -0.8f)
            arcToRelative(18.09f, 18.09f, 0.0f, false, false, 5.18f, 8.41f)
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
            moveTo(42.7f, 74.39f)
            curveToRelative(0.0f, -1.25f, 1.7f, -2.0f, 1.81f, -3.33f)
            curveToRelative(1.43f, 0.34f, 2.73f, 2.0f, 4.33f, 2.66f)
            curveToRelative(1.0f, 0.73f, 3.0f, 1.08f, 2.73f, 2.83f)
            reflectiveCurveToRelative(-0.33f, 3.89f, -1.81f, 4.23f)
            curveToRelative(-2.16f, -2.21f, -4.67f, -3.94f, -7.06f, -6.39f)
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
            moveTo(44.74f, 70.41f)
            curveToRelative(-0.22f, -1.14f, 0.4f, -2.0f, 0.0f, -3.12f)
            arcToRelative(22.0f, 22.0f, 0.0f, false, false, 8.0f, 3.29f)
            curveToRelative(-0.17f, 1.48f, -0.52f, 3.41f, -1.77f, 3.75f)
            curveToRelative(-1.85f, -1.2f, -4.54f, -2.61f, -6.25f, -3.92f)
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
            moveTo(43.38f, 69.33f)
            arcToRelative(7.39f, 7.39f, 0.0f, false, true, -3.0f, -5.85f)
            arcTo(30.68f, 30.68f, 0.0f, false, false, 43.0f, 66.0f)
            arcToRelative(5.11f, 5.11f, 0.0f, false, true, 0.4f, 3.33f)
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
            moveTo(40.08f, 55.57f)
            curveToRelative(1.53f, -0.38f, 1.62f, -2.14f, 2.0f, -3.18f)
            curveToRelative(0.27f, -0.71f, 0.73f, -1.09f, 1.86f, -0.77f)
            curveToRelative(3.0f, 0.51f, 4.75f, 3.83f, 5.15f, 6.22f)
            arcToRelative(9.4f, 9.4f, 0.0f, false, true, -4.94f, 8.37f)
            curveToRelative(-3.59f, -2.57f, -0.12f, -8.25f, -4.1f, -10.64f)
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
            moveTo(28.84f, 55.57f)
            arcToRelative(7.43f, 7.43f, 0.0f, false, true, 0.21f, -2.0f)
            curveToRelative(1.81f, 0.85f, -0.57f, 2.93f, 1.08f, 3.81f)
            curveToRelative(0.28f, 0.25f, -0.12f, 0.34f, -0.29f, 0.51f)
            curveToRelative(-1.18f, -0.26f, 0.0f, -1.36f, -1.0f, -2.27f)
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
            moveTo(26.82f, 56.65f)
            arcToRelative(3.67f, 3.67f, 0.0f, false, true, -2.16f, -2.0f)
            arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.74f, -0.68f)
            arcToRelative(4.09f, 4.09f, 0.0f, false, false, -0.58f, 2.73f)
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
            moveTo(11.0f, 52.67f)
            curveToRelative(0.67f, -0.8f, 2.61f, -1.0f, 2.0f, -2.45f)
            curveToRelative(2.85f, 0.4f, 0.11f, -2.0f, 1.08f, -3.13f)
            curveToRelative(0.69f, -1.36f, 0.74f, -3.13f, 1.37f, -4.66f)
            curveToRelative(0.57f, 1.88f, -1.14f, 4.66f, 0.4f, 6.42f)
            curveToRelative(0.9f, 2.51f, 3.52f, 3.54f, 5.91f, 4.1f)
            curveTo(17.89f, 54.49f, 15.0f, 50.8f, 11.0f, 52.67f)
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
            moveTo(22.73f, 46.92f)
            curveToRelative(0.74f, -1.25f, -1.0f, -3.77f, -5.21f, -2.83f)
            curveToRelative(-0.59f, 0.0f, -0.73f, -0.43f, 0.2f, -1.94f)
            arcToRelative(18.51f, 18.51f, 0.0f, false, true, 1.2f, -1.6f)
            curveToRelative(2.0f, -0.45f, 3.41f, 1.76f, 4.38f, 3.13f)
            arcToRelative(6.68f, 6.68f, 0.0f, false, true, 0.0f, 6.54f)
            curveToRelative(-0.74f, 1.71f, -2.62f, 1.14f, -3.81f, 0.68f)
            curveToRelative(-0.74f, -0.28f, -1.87f, -0.91f, -2.0f, -1.93f)
            curveToRelative(1.82f, -0.17f, 4.32f, -0.06f, 5.29f, -2.0f)
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
            moveTo(17.0f, 47.49f)
            arcTo(1.28f, 1.28f, 0.0f, false, true, 18.0f, 45.84f)
            curveToRelative(0.68f, -0.17f, 1.36f, 0.44f, 0.85f, 1.08f)
            curveToRelative(-0.56f, 0.17f, -1.0f, 1.42f, -1.76f, 0.57f)
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
            moveTo(16.58f, 76.84f)
            curveToRelative(-2.0f, -2.9f, -0.16f, -6.82f, 0.0f, -10.12f)
            arcToRelative(28.5f, 28.5f, 0.0f, false, true, 2.34f, -2.16f)
            arcToRelative(25.66f, 25.66f, 0.0f, false, false, 6.82f, -3.13f)
            arcTo(4.56f, 4.56f, 0.0f, false, true, 24.1f, 64.0f)
            curveToRelative(-2.79f, 0.4f, -6.21f, 2.06f, -7.23f, 5.24f)
            curveToRelative(-1.0f, 4.0f, 2.05f, 6.71f, 4.38f, 9.1f)
            curveToRelative(-1.59f, -0.57f, -3.81f, 0.17f, -4.67f, -1.48f)
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
            moveTo(24.48f, 70.89f)
            arcToRelative(2.57f, 2.57f, 0.0f, false, false, -2.0f, -3.0f)
            curveToRelative(-0.94f, -0.41f, -2.11f, -0.11f, -3.19f, -0.17f)
            curveToRelative(-0.23f, -0.91f, 1.0f, -1.0f, 1.36f, -1.47f)
            curveToRelative(0.63f, -0.46f, 1.65f, -0.23f, 2.34f, -0.69f)
            curveToRelative(1.42f, 1.88f, 4.66f, 4.21f, 3.0f, 6.94f)
            curveToRelative(-0.8f, 1.76f, -3.42f, 2.16f, -4.0f, 4.26f)
            curveToRelative(-1.0f, -0.53f, -4.93f, -3.89f, -2.76f, -3.91f)
            curveToRelative(2.68f, 0.7f, 4.79f, -0.26f, 5.19f, -1.92f)
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
            moveTo(20.0f, 70.3f)
            curveToRelative(0.68f, 0.74f, -0.51f, 0.74f, -0.8f, 1.08f)
            curveToRelative(-0.91f, 0.57f, -1.08f, 0.05f, -1.0f, -1.0f)
            curveToRelative(0.63f, 0.06f, 1.13f, -0.22f, 1.76f, -0.11f)
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
            moveTo(15.91f, 94.0f)
            curveTo(13.63f, 90.09f, 8.0f, 89.18f, 7.6f, 83.78f)
            arcToRelative(1.73f, 1.73f, 0.0f, false, true, 1.0f, 0.45f)
            curveToRelative(2.16f, 3.25f, 5.4f, 5.35f, 7.51f, 9.0f)
            curveToRelative(-0.23f, 0.23f, -0.12f, 0.57f, -0.17f, 0.8f)
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
            moveTo(38.21f, 88.44f)
            arcToRelative(12.71f, 12.71f, 0.0f, false, false, -8.0f, -3.0f)
            curveToRelative(-0.74f, -0.4f, -0.34f, -0.86f, -0.11f, -1.37f)
            curveToRelative(0.4f, -1.65f, -1.14f, -2.16f, -1.37f, -3.52f)
            curveToRelative(-2.45f, 0.11f, -3.77f, -1.76f, -5.71f, -2.45f)
            arcToRelative(0.87f, 0.87f, 0.0f, false, true, 0.18f, -0.85f)
            curveToRelative(1.56f, -1.56f, 4.61f, -3.41f, 4.28f, -6.26f)
            arcToRelative(6.21f, 6.21f, 0.0f, false, false, -2.44f, -5.17f)
            curveToRelative(0.16f, -3.19f, 2.73f, -4.72f, 4.09f, -6.83f)
            curveToRelative(0.91f, -0.06f, 2.45f, 1.31f, 3.13f, -0.16f)
            curveToRelative(0.0f, -1.66f, 1.82f, -1.71f, 2.61f, -2.85f)
            curveToRelative(1.14f, 0.06f, 1.83f, -1.54f, 3.0f, -0.4f)
            arcToRelative(4.92f, 4.92f, 0.0f, false, true, 2.73f, 2.16f)
            curveToRelative(0.45f, 1.71f, 0.22f, 4.0f, 0.68f, 5.86f)
            curveTo(40.0f, 62.62f, 39.56f, 61.0f, 38.74f, 60.0f)
            arcToRelative(0.1f, 0.1f, 0.0f, false, false, -0.17f, 0.05f)
            curveToRelative(-0.14f, 1.0f, -0.16f, 2.0f, -1.0f, 2.37f)
            reflectiveCurveToRelative(-0.72f, -0.76f, -1.37f, -0.46f)
            curveToRelative(-1.0f, 1.08f, 0.29f, 3.24f, -1.93f, 3.0f)
            curveToRelative(-0.45f, 0.23f, -0.11f, 0.79f, 0.11f, 1.0f)
            curveToRelative(-0.17f, 4.0f, 1.6f, 6.43f, 3.88f, 11.21f)
            curveToRelative(-1.71f, 2.73f, -3.54f, 5.63f, -6.72f, 6.42f)
            curveToRelative(0.05f, 0.68f, 1.19f, 0.48f, 1.66f, 0.23f)
            curveToRelative(2.55f, -1.19f, 3.81f, -4.0f, 5.58f, -5.85f)
            curveToRelative(2.35f, 3.53f, 2.43f, 8.41f, 4.65f, 12.16f)
            curveToRelative(-1.3f, 2.68f, -4.33f, 3.36f, -7.23f, 3.53f)
            curveToRelative(0.35f, -1.65f, 2.61f, -3.51f, 2.06f, -5.18f)
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
            moveTo(174.52f, 90.05f)
            arcToRelative(20.0f, 20.0f, 0.0f, false, true, 2.32f, 8.63f)
            curveToRelative(-1.14f, 2.11f, 0.0f, 4.84f, -0.28f, 7.11f)
            curveToRelative(1.13f, 6.33f, 0.66f, 9.1f, 1.12f, 13.65f)
            curveToRelative(-1.65f, -2.0f, -1.2f, -6.08f, -2.05f, -8.75f)
            curveToRelative(-2.45f, -6.15f, 0.68f, -11.89f, -1.48f, -18.0f)
            curveToRelative(-1.0f, -0.51f, 0.46f, -1.59f, -0.79f, -1.88f)
            curveToRelative(-0.33f, -0.55f, 0.88f, -1.15f, 1.16f, -0.72f)
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
            moveTo(191.62f, 61.43f)
            arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.56f, 1.08f)
            curveToRelative(-1.25f, -0.57f, -2.33f, 0.45f, -3.29f, 0.68f)
            curveToRelative(0.25f, 0.83f, -1.08f, 0.79f, -0.4f, 1.48f)
            arcToRelative(4.25f, 4.25f, 0.0f, false, true, 3.13f, -0.79f)
            curveToRelative(1.54f, 0.62f, 1.93f, 2.33f, 2.9f, 3.69f)
            curveToRelative(0.0f, 3.64f, -0.63f, 6.88f, -0.57f, 10.23f)
            curveToRelative(-1.54f, -1.25f, -4.0f, -2.1f, -5.06f, -4.49f)
            curveToRelative(-1.77f, -1.0f, -2.74f, -2.56f, -4.22f, -3.58f)
            curveToRelative(-1.25f, -0.23f, -3.75f, -0.86f, -4.66f, 0.57f)
            curveToRelative(-1.71f, -1.14f, 0.91f, -2.68f, 0.4f, -4.38f)
            curveToRelative(1.25f, -2.16f, 1.7f, -5.12f, 4.67f, -5.75f)
            arcToRelative(6.4f, 6.4f, 0.0f, false, true, 6.54f, 1.26f)
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
            moveTo(174.44f, 67.8f)
            arcToRelative(0.74f, 0.74f, 0.0f, false, false, -0.18f, -0.45f)
            curveToRelative(-2.69f, 0.0f, -4.49f, 0.85f, -6.82f, 1.0f)
            curveToRelative(-0.34f, 2.27f, -0.91f, 5.0f, -1.08f, 7.39f)
            curveToRelative(-1.48f, -1.71f, -3.87f, -2.27f, -5.57f, -3.12f)
            arcToRelative(26.73f, 26.73f, 0.0f, false, true, -4.27f, -1.54f)
            curveToRelative(7.62f, -3.36f, 16.21f, -5.86f, 24.06f, -9.39f)
            curveToRelative(0.28f, 0.0f, 1.76f, -0.79f, 1.08f, 0.23f)
            arcToRelative(33.0f, 33.0f, 0.0f, false, false, -3.13f, 7.28f)
            curveToRelative(-1.59f, -0.35f, -2.36f, -1.8f, -4.09f, -1.42f)
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
            moveTo(79.0f, 36.9f)
            arcToRelative(82.83f, 82.83f, 0.0f, false, true, 9.85f, 2.44f)
            curveToRelative(11.55f, 1.14f, 20.82f, 7.63f, 31.51f, 10.24f)
            curveToRelative(6.66f, 1.76f, 14.22f, 1.43f, 21.0f, 0.28f)
            curveToRelative(4.15f, 0.0f, 6.88f, -1.0f, 10.92f, -1.25f)
            arcToRelative(69.58f, 69.58f, 0.0f, false, true, 13.08f, -2.45f)
            curveToRelative(5.41f, -1.93f, 11.2f, -2.73f, 16.39f, -5.06f)
            curveToRelative(0.68f, -1.0f, 0.33f, -2.44f, 0.84f, -3.52f)
            curveToRelative(1.26f, -2.79f, 2.68f, -5.74f, 5.58f, -7.22f)
            arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.42f, 1.08f)
            curveToRelative(-1.37f, -0.06f, -2.64f, -0.12f, -3.21f, 1.07f)
            curveToRelative(0.0f, 0.52f, -0.27f, 1.08f, 0.36f, 1.37f)
            arcToRelative(2.46f, 2.46f, 0.0f, false, true, 2.73f, -0.68f)
            curveToRelative(1.88f, 0.35f, 1.37f, 2.33f, 2.05f, 3.53f)
            arcToRelative(4.21f, 4.21f, 0.0f, false, false, -3.13f, -0.4f)
            curveToRelative(-0.75f, 1.0f, -1.65f, 1.08f, -1.36f, 2.21f)
            curveToRelative(1.08f, 0.57f, 1.53f, -1.13f, 2.95f, -0.45f)
            arcToRelative(5.19f, 5.19f, 0.0f, false, true, 2.22f, 2.62f)
            curveToRelative(0.0f, 4.95f, -1.76f, 10.0f, -3.81f, 14.33f)
            curveToRelative(-0.91f, 0.45f, -1.65f, 0.63f, -2.22f, 1.65f)
            curveToRelative(0.74f, -0.06f, 1.59f, -0.85f, 2.44f, -0.57f)
            curveToRelative(-1.0f, 2.28f, -3.46f, 2.56f, -5.56f, 3.3f)
            curveToRelative(-6.89f, 2.0f, -13.94f, 5.0f, -20.77f, 6.94f)
            curveToRelative(-0.34f, -0.51f, 0.23f, -1.82f, -1.08f, -1.48f)
            curveToRelative(-1.42f, -0.57f, -1.0f, -2.11f, -2.44f, -2.33f)
            curveToRelative(-0.52f, -0.63f, -1.08f, -2.0f, -2.22f, -2.0f)
            curveToRelative(-2.9f, 1.0f, -2.45f, -3.35f, -5.46f, -2.45f)
            arcToRelative(7.37f, 7.37f, 0.0f, false, false, -4.9f, 4.38f)
            curveToRelative(0.29f, 2.11f, 1.82f, 3.93f, 1.25f, 6.55f)
            curveToRelative(-5.57f, 0.0f, -10.4f, -2.9f, -16.27f, -1.25f)
            curveToRelative(-2.67f, -0.69f, -4.49f, 1.3f, -7.1f, 0.39f)
            curveToRelative(-0.86f, 0.62f, 0.5f, 0.62f, 0.68f, 1.0f)
            curveToRelative(3.0f, 0.0f, 5.69f, -1.31f, 8.58f, -0.4f)
            curveToRelative(6.1f, 0.4f, 11.44f, 2.5f, 17.53f, 2.84f)
            curveToRelative(5.35f, 1.0f, 10.24f, 2.68f, 13.76f, 6.43f)
            curveToRelative(0.86f, 2.79f, 0.1f, 6.0f, 2.06f, 8.59f)
            curveToRelative(0.73f, 3.25f, 3.74f, 4.36f, 4.55f, 7.0f)
            arcToRelative(5.1f, 5.1f, 0.0f, false, true, 0.41f, 3.21f)
            curveToRelative(0.0f, 0.77f, -0.48f, 0.86f, -0.43f, 0.0f)
            reflectiveCurveToRelative(-0.42f, -2.08f, -2.38f, -2.08f)
            curveToRelative(-1.31f, -1.13f, -2.11f, -1.55f, -3.61f, -1.4f)
            curveToRelative(-3.7f, 0.65f, -8.06f, 1.78f, -9.59f, 6.0f)
            curveToRelative(-2.84f, 2.79f, -4.21f, 6.83f, -7.27f, 9.67f)
            arcToRelative(56.0f, 56.0f, 0.0f, false, false, -6.26f, 7.62f)
            curveToRelative(0.39f, 1.6f, -0.51f, 2.22f, -1.77f, 2.5f)
            arcToRelative(2.73f, 2.73f, 0.0f, false, false, -1.36f, 0.2f)
            curveToRelative(-0.7f, 0.49f, -0.62f, -0.14f, -1.0f, 0.0f)
            curveToRelative(-0.9f, -0.41f, 0.53f, -1.4f, -0.36f, -1.48f)
            arcToRelative(5.79f, 5.79f, 0.0f, false, true, -4.37f, 0.68f)
            curveToRelative(-1.71f, -0.46f, -0.12f, -2.45f, -0.8f, -3.7f)
            arcToRelative(16.23f, 16.23f, 0.0f, false, false, -1.37f, -3.0f)
            curveToRelative(-1.08f, -0.46f, -3.0f, 0.85f, -4.0f, -0.8f)
            arcToRelative(4.1f, 4.1f, 0.0f, false, false, 1.93f, -3.7f)
            curveToRelative(1.19f, -1.31f, 3.13f, -2.16f, 2.55f, -4.49f)
            curveToRelative(2.74f, -1.71f, 0.41f, -4.72f, 2.0f, -6.94f)
            curveToRelative(-1.0f, -2.0f, 1.0f, -3.7f, 1.0f, -5.75f)
            curveToRelative(1.47f, -1.13f, 1.59f, -2.95f, 2.0f, -4.77f)
            curveToRelative(-0.52f, -1.0f, -1.83f, -1.37f, -2.62f, -2.0f)
            curveToRelative(-2.33f, 0.34f, -4.37f, -0.57f, -6.7f, -0.85f)
            arcToRelative(1.24f, 1.24f, 0.0f, false, true, -0.77f, -1.18f)
            curveToRelative(0.0f, -0.55f, -0.92f, 0.0f, -0.72f, -0.88f)
            curveToRelative(-5.51f, -0.27f, -10.59f, 1.54f, -16.38f, 0.86f)
            curveToRelative(-1.6f, 0.0f, -2.11f, -3.23f, -4.1f, -1.76f)
            arcToRelative(45.92f, 45.92f, 0.0f, false, true, -9.55f, 2.27f)
            curveToRelative(-0.87f, -1.0f, -1.83f, -0.46f, -2.85f, -0.39f)
            curveToRelative(-1.14f, 0.39f, -1.76f, 2.27f, -3.3f, 1.64f)
            curveToRelative(-1.13f, 0.29f, -1.59f, -1.0f, -2.15f, -1.47f)
            curveToRelative(-4.73f, -0.63f, -6.21f, 4.6f, -10.25f, 5.46f)
            curveToRelative(-1.0f, 1.7f, -2.33f, 4.0f, -4.66f, 3.81f)
            curveToRelative(-1.25f, 1.42f, -2.79f, 2.39f, -4.21f, 3.81f)
            curveToRelative(-2.11f, 1.59f, -2.62f, 4.26f, -2.84f, 6.82f)
            curveToRelative(-1.65f, 0.23f, -3.08f, -1.93f, -4.79f, -0.57f)
            curveToRelative(-3.12f, 2.22f, -1.53f, 5.58f, -1.36f, 8.76f)
            curveToRelative(-0.51f, 1.25f, -2.33f, 0.46f, -3.41f, 0.69f)
            curveToRelative(-2.5f, -0.46f, -3.53f, -3.36f, -5.46f, -4.21f)
            arcToRelative(11.91f, 11.91f, 0.0f, false, true, -4.0f, -8.19f)
            curveToRelative(1.14f, -0.91f, 1.08f, -2.56f, 1.65f, -3.87f)
            arcToRelative(4.57f, 4.57f, 0.0f, false, false, 3.53f, -2.56f)
            curveToRelative(0.06f, -0.91f, -0.16f, -3.3f, 1.54f, -1.76f)
            curveToRelative(2.22f, 0.24f, 2.9f, -2.68f, 4.49f, -3.59f)
            curveToRelative(1.31f, -1.54f, -1.08f, -4.49f, 2.16f, -4.21f)
            arcToRelative(5.09f, 5.09f, 0.0f, false, false, 2.22f, -3.41f)
            curveToRelative(0.06f, -1.25f, -1.0f, -2.0f, 0.0f, -3.12f)
            curveToRelative(2.27f, 0.22f, 3.25f, -1.37f, 4.78f, -2.62f)
            curveToRelative(1.37f, -1.71f, 0.22f, -5.52f, 3.81f, -4.5f)
            curveToRelative(1.65f, -0.73f, 3.87f, -1.0f, 3.7f, -3.58f)
            arcToRelative(0.88f, 0.88f, 0.0f, false, false, 0.16f, -1.23f)
            curveToRelative(-0.46f, -0.52f, -1.13f, -0.13f, -1.3f, -0.81f)
            curveToRelative(1.0f, -0.29f, 2.0f, -0.4f, 2.61f, -1.37f)
            curveToRelative(-0.22f, -1.68f, 1.43f, -2.11f, 2.45f, -2.85f)
            curveToRelative(1.65f, -1.08f, 3.76f, -1.08f, 5.35f, -2.33f)
            curveToRelative(0.12f, -1.48f, -1.88f, -1.36f, -1.53f, -2.84f)
            curveToRelative(-0.17f, -1.25f, -3.87f, -1.0f, -1.48f, -2.22f)
            arcToRelative(8.24f, 8.24f, 0.0f, false, false, 2.84f, -1.2f)
            curveToRelative(-0.68f, -1.54f, -2.45f, -2.0f, -4.32f, -1.76f)
            curveToRelative(-0.62f, -1.13f, -2.73f, -0.46f, -2.33f, -2.22f)
            curveToRelative(-0.58f, -0.68f, -1.6f, -0.45f, -2.34f, -0.68f)
            arcToRelative(9.9f, 9.9f, 0.0f, false, true, -1.76f, -2.85f)
            curveToRelative(0.66f, 0.13f, 0.84f, -0.54f, 0.68f, -1.25f)
            curveToRelative(-1.82f, -0.45f, -1.37f, -3.0f, -3.41f, -2.84f)
            curveToRelative(-0.91f, -0.58f, -3.67f, 0.0f, -1.21f, -1.36f)
            arcToRelative(63.17f, 63.17f, 0.0f, false, true, 8.14f, 0.0f)
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
            moveTo(49.63f, 39.58f)
            curveToRelative(-0.05f, 0.34f, -1.08f, 0.92f, -0.39f, 1.37f)
            curveToRelative(1.0f, -0.85f, 2.1f, 0.17f, 2.44f, 1.08f)
            arcToRelative(10.62f, 10.62f, 0.0f, false, true, 1.54f, 5.34f)
            arcToRelative(8.32f, 8.32f, 0.0f, false, true, -0.68f, 3.53f)
            curveToRelative(0.11f, 0.23f, 0.51f, 0.4f, 0.68f, 0.12f)
            curveToRelative(1.71f, -3.39f, 0.1f, -9.39f, -2.73f, -11.72f)
            curveToRelative(-0.06f, -0.74f, 1.0f, -1.31f, 1.48f, -1.65f)
            curveToRelative(5.46f, -2.0f, 10.58f, -0.11f, 16.38f, -0.11f)
            curveToRelative(0.0f, 0.67f, 0.0f, 1.48f, 0.79f, 1.76f)
            curveToRelative(2.23f, -0.8f, 3.42f, 0.74f, 4.56f, 2.05f)
            curveToRelative(-0.17f, 0.74f, -0.86f, 1.76f, -0.46f, 2.73f)
            curveToRelative(1.83f, -0.29f, 1.31f, 2.5f, 3.41f, 1.76f)
            curveToRelative(0.69f, 0.23f, -0.05f, 0.57f, 0.17f, 1.0f)
            curveToRelative(2.51f, 0.52f, 4.22f, 2.85f, 7.13f, 2.72f)
            arcToRelative(1.89f, 1.89f, 0.0f, false, false, 0.0f, 0.29f)
            curveToRelative(-1.42f, 0.74f, -3.23f, 1.14f, -3.74f, 2.57f)
            curveToRelative(0.51f, 0.33f, 1.47f, 0.79f, 1.47f, 1.0f)
            arcToRelative(0.54f, 0.54f, 0.0f, false, false, 0.18f, 0.85f)
            arcToRelative(4.64f, 4.64f, 0.0f, false, true, 2.44f, 1.37f)
            curveToRelative(-1.93f, 1.64f, -5.4f, 0.91f, -6.53f, 3.81f)
            curveToRelative(-1.37f, 0.34f, -0.69f, 2.0f, -2.06f, 2.16f)
            curveToRelative(-0.9f, 0.0f, -2.9f, -0.17f, -1.93f, 1.36f)
            curveToRelative(0.51f, 0.58f, 1.08f, 0.52f, 1.65f, 1.0f)
            curveToRelative(0.91f, 3.69f, -3.92f, 2.33f, -5.74f, 3.8f)
            arcToRelative(14.09f, 14.09f, 0.0f, false, true, -3.53f, 6.15f)
            curveToRelative(-1.2f, 0.74f, -3.82f, 0.06f, -3.59f, 2.22f)
            curveToRelative(-0.1f, 1.36f, 0.94f, 3.08f, -0.36f, 4.2f)
            curveToRelative(-0.84f, 1.31f, -2.36f, 1.0f, -3.33f, 2.16f)
            curveToRelative(-0.23f, 1.82f, -0.35f, 3.93f, -2.0f, 5.0f)
            curveToRelative(-0.33f, 0.8f, -0.46f, 1.1f, -1.19f, 1.32f)
            arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.22f, -1.2f)
            curveToRelative(-1.22f, 0.21f, -0.22f, 3.0f, -0.91f, 4.09f)
            curveToRelative(-0.8f, 0.46f, -1.48f, 1.71f, -2.74f, 1.25f)
            curveToRelative(-1.81f, 0.12f, -1.13f, 2.34f, -1.64f, 3.25f)
            curveToRelative(-0.46f, 0.28f, -0.4f, -0.35f, -0.57f, -0.69f)
            curveToRelative(-0.41f, -1.0f, -3.75f, -2.28f, -4.89f, -2.44f)
            curveToRelative(0.63f, -0.09f, 0.9f, -1.2f, 1.34f, -1.29f)
            curveToRelative(0.15f, -0.05f, 0.37f, 0.13f, 0.53f, 0.32f)
            arcToRelative(16.91f, 16.91f, 0.0f, false, false, 1.63f, 1.66f)
            curveToRelative(0.19f, 0.15f, 0.42f, 0.0f, 0.23f, -0.23f)
            curveToRelative(-0.27f, -0.42f, -1.5f, -1.88f, -1.69f, -2.07f)
            arcTo(9.8f, 9.8f, 0.0f, false, false, 46.51f, 86.0f)
            arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.82f, -2.91f)
            arcToRelative(8.61f, 8.61f, 0.0f, false, true, 1.76f, 2.81f)
            curveToRelative(0.16f, 0.31f, 0.49f, 0.16f, 0.46f, -0.06f)
            arcToRelative(9.53f, 9.53f, 0.0f, false, false, -1.67f, -3.23f)
            curveToRelative(0.0f, -0.53f, 0.54f, -1.0f, 1.21f, -1.56f)
            arcToRelative(4.18f, 4.18f, 0.0f, false, true, 0.67f, -2.0f)
            curveToRelative(-0.39f, -1.19f, 0.26f, -1.61f, 0.0f, -2.84f)
            arcTo(38.73f, 38.73f, 0.0f, false, true, 58.0f, 80.43f)
            curveToRelative(0.14f, 0.14f, 0.29f, 0.0f, 0.19f, -0.15f)
            arcToRelative(27.85f, 27.85f, 0.0f, false, false, -6.32f, -5.48f)
            curveToRelative(0.34f, -1.43f, 1.75f, -2.34f, 1.59f, -4.1f)
            arcToRelative(26.0f, 26.0f, 0.0f, false, false, 6.44f, -2.0f)
            curveToRelative(0.43f, -0.18f, 0.5f, -0.46f, 0.0f, -0.27f)
            curveToRelative(-1.84f, 0.66f, -4.28f, 1.7f, -6.26f, 1.43f)
            curveToRelative(0.12f, -2.67f, 0.63f, -6.14f, -1.52f, -7.79f)
            curveToRelative(0.27f, 2.56f, 1.3f, 4.89f, 0.67f, 7.79f)
            arcToRelative(21.84f, 21.84f, 0.0f, false, true, -7.62f, -3.0f)
            arcToRelative(13.88f, 13.88f, 0.0f, false, false, 4.1f, -4.78f)
            arcToRelative(6.47f, 6.47f, 0.0f, false, false, 0.11f, -6.43f)
            curveToRelative(-1.76f, -2.0f, -3.0f, -5.35f, -6.54f, -4.78f)
            arcToRelative(11.18f, 11.18f, 0.0f, false, false, -1.88f, -7.79f)
            curveToRelative(1.25f, -2.9f, 4.33f, -4.72f, 6.54f, -6.65f)
            curveToRelative(1.37f, 0.62f, 1.54f, 1.87f, 2.16f, 3.12f)
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
            moveTo(46.9f, 36.17f)
            curveTo(44.0f, 37.88f, 42.35f, 40.0f, 40.37f, 42.31f)
            curveToRelative(-1.66f, -0.62f, -0.91f, -2.44f, 0.0f, -3.41f)
            arcToRelative(51.7f, 51.7f, 0.0f, false, false, 2.73f, -5.06f)
            arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.8f, 2.33f)
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
            moveTo(42.53f, 33.27f)
            arcToRelative(64.66f, 64.66f, 0.0f, false, true, -3.82f, 7.39f)
            curveToRelative(-0.11f, 0.0f, -0.33f, 0.07f, -0.4f, -0.11f)
            curveToRelative(1.15f, -2.56f, 0.58f, -5.06f, 1.08f, -7.68f)
            curveToRelative(1.26f, -0.45f, 2.0f, 0.28f, 3.14f, 0.4f)
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
            moveTo(37.64f, 40.1f)
            curveToRelative(-0.41f, -0.23f, -1.08f, -0.06f, -1.53f, -0.12f)
            curveToRelative(-0.12f, -2.16f, -1.21f, -4.28f, -1.22f, -6.43f)
            curveToRelative(0.17f, -0.28f, 1.09f, -0.4f, 1.38f, -0.5f)
            curveToRelative(0.62f, -0.52f, 1.77f, -0.23f, 2.62f, -0.46f)
            curveToRelative(-0.63f, 2.27f, 0.16f, 5.45f, -1.25f, 7.51f)
        }
    }
        .build()
}
