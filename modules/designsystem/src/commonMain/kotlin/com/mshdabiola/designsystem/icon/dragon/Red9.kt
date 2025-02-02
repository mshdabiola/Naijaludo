package com.mshdabiola.designsystem.icon.dragon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

fun Dragon.getRed(iconColor: Color, accentColor: Color): ImageVector {
    return Builder(
        name = "Red9",
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
            moveTo(118.14f, 0.0f)
            curveToRelative(3.87f, 2.8f, 11.53f, 6.66f, 11.71f, 9.5f)
            curveToRelative(-0.22f, 0.2f, -6.12f, 1.48f, -7.22f, 0.41f)
            curveToRelative(0.0f, 0.0f, -4.79f, -3.52f, -9.37f, -2.36f)
            arcToRelative(0.35f, 0.35f, 0.0f, false, false, 0.0f, 0.25f)
            curveToRelative(3.62f, 1.29f, 6.75f, 2.55f, 8.15f, 4.41f)
            arcToRelative(0.64f, 0.64f, 0.0f, false, true, -0.06f, 0.47f)
            reflectiveCurveToRelative(-4.15f, 4.44f, -2.38f, 5.0f)
            curveToRelative(0.27f, -0.12f, 2.39f, -1.85f, 3.0f, -2.09f)
            arcToRelative(0.39f, 0.39f, 0.0f, false, true, 0.16f, 0.27f)
            curveToRelative(-0.78f, 1.18f, -6.24f, 4.71f, -5.93f, 6.0f)
            arcToRelative(35.65f, 35.65f, 0.0f, false, false, 6.33f, -2.66f)
            curveToRelative(1.75f, -1.52f, 4.0f, -6.66f, 4.32f, -6.64f)
            curveToRelative(0.0f, 0.0f, 3.21f, -0.5f, 2.41f, 2.06f)
            curveToRelative(-1.23f, 3.48f, -9.93f, 8.0f, -9.73f, 9.29f)
            curveToRelative(3.81f, 0.08f, 12.52f, -8.7f, 12.52f, -8.7f)
            curveToRelative(0.48f, -1.0f, 4.62f, 0.55f, 4.13f, 2.0f)
            curveToRelative(-0.08f, 0.58f, -3.15f, 1.36f, -3.75f, 2.17f)
            curveToRelative(-0.18f, 0.7f, 0.81f, 1.0f, 2.1f, 1.6f)
            curveToRelative(2.25f, 0.35f, 1.63f, 5.23f, 1.64f, 5.41f)
            curveToRelative(-0.31f, 0.21f, -5.69f, 0.46f, -6.38f, 1.92f)
            curveToRelative(1.63f, 1.0f, 5.63f, 4.32f, 6.86f, 6.21f)
            curveToRelative(-0.21f, 0.0f, -4.63f, -3.31f, -5.0f, -3.4f)
            arcToRelative(19.8f, 19.8f, 0.0f, false, false, -5.0f, -0.23f)
            arcToRelative(21.79f, 21.79f, 0.0f, false, false, -4.9f, 1.13f)
            arcToRelative(0.46f, 0.46f, 0.0f, false, false, -0.14f, 0.38f)
            curveToRelative(0.32f, 0.14f, 6.0f, 2.94f, 6.62f, 4.35f)
            arcToRelative(7.15f, 7.15f, 0.0f, false, false, -0.74f, 1.65f)
            curveToRelative(0.13f, 0.15f, 2.22f, 2.22f, 2.63f, 2.67f)
            arcToRelative(0.35f, 0.35f, 0.0f, false, true, -0.18f, 0.28f)
            arcToRelative(28.27f, 28.27f, 0.0f, false, true, -2.5f, -1.81f)
            curveToRelative(-6.65f, -5.86f, -12.25f, -3.27f, -12.64f, -2.86f)
            curveToRelative(0.0f, 0.28f, 0.88f, 1.63f, 0.36f, 1.72f)
            curveToRelative(-0.71f, 0.32f, -6.0f, 0.33f, -5.92f, 1.23f)
            curveToRelative(0.09f, 1.65f, 1.6f, 8.74f, 5.28f, 8.57f)
            curveToRelative(0.05f, 0.0f, 3.4f, -1.92f, 4.34f, -1.57f)
            curveToRelative(0.0f, 0.69f, -5.52f, 3.29f, -5.57f, 3.87f)
            curveToRelative(0.31f, 1.0f, 2.0f, 1.93f, 2.28f, 2.1f)
            curveToRelative(-1.29f, 0.09f, -3.29f, -1.89f, -4.62f, -3.26f)
            curveToRelative(-4.54f, -5.0f, -10.32f, -2.33f, -12.88f, -3.0f)
            curveToRelative(-0.77f, 0.38f, -0.05f, 2.88f, -0.91f, 3.46f)
            curveToRelative(-1.84f, 1.82f, -5.91f, -1.57f, -7.27f, -0.08f)
            curveToRelative(0.08f, 0.19f, 1.63f, 7.15f, 7.4f, 9.52f)
            arcToRelative(9.51f, 9.51f, 0.0f, false, false, 1.67f, -0.71f)
            curveToRelative(1.14f, -0.57f, 4.17f, -2.44f, 8.47f, 0.92f)
            curveToRelative(-5.86f, -2.0f, -4.61f, 0.18f, -7.36f, -1.0f)
            curveToRelative(-1.4f, 0.73f, -6.29f, 2.82f, -6.55f, 3.28f)
            curveToRelative(0.23f, 0.16f, 0.86f, 1.24f, 4.24f, 2.53f)
            curveToRelative(-4.21f, 0.17f, -12.0f, -5.87f, -12.57f, -5.83f)
            reflectiveCurveToRelative(-8.62f, 1.94f, -11.71f, 1.21f)
            arcToRelative(16.87f, 16.87f, 0.0f, false, false, 1.0f, 3.62f)
            curveToRelative(-0.26f, 0.2f, -4.06f, 0.71f, -4.25f, 0.76f)
            curveToRelative(-0.06f, 0.26f, 0.62f, 5.41f, 2.0f, 6.38f)
            curveToRelative(0.0f, 0.0f, 2.14f, 1.0f, 4.26f, 4.47f)
            arcTo(12.36f, 12.36f, 0.0f, false, false, 78.66f, 72.0f)
            curveToRelative(-2.54f, -2.27f, -1.86f, -4.48f, -1.88f, -4.53f)
            curveToRelative(1.88f, 4.53f, 5.2f, 4.07f, 5.41f, 4.07f)
            curveToRelative(-2.32f, 0.8f, -4.91f, 3.53f, -5.0f, 3.6f)
            curveToRelative(0.0f, 0.84f, 2.86f, 1.0f, 2.9f, 1.09f)
            curveToRelative(-1.62f, 1.11f, -4.87f, 0.26f, -5.46f, 0.09f)
            curveToRelative(-8.13f, -3.26f, -17.3f, 3.41f, -19.34f, 2.51f)
            curveToRelative(-1.09f, 1.11f, 0.61f, 3.44f, 1.06f, 5.23f)
            curveToRelative(-0.28f, 0.48f, -6.84f, 3.69f, -7.07f, 4.87f)
            arcTo(54.93f, 54.93f, 0.0f, false, true, 55.0f, 95.47f)
            curveToRelative(0.11f, 0.21f, 4.45f, 0.77f, 4.86f, 0.91f)
            curveToRelative(-0.32f, 0.12f, -6.22f, 0.35f, -7.38f, 1.42f)
            curveToRelative(-0.42f, 0.2f, -5.72f, 0.6f, -6.68f, 1.52f)
            curveToRelative(0.0f, 2.62f, 6.41f, 8.87f, 6.56f, 9.07f)
            reflectiveCurveToRelative(5.55f, -5.0f, 8.5f, -4.81f)
            curveToRelative(-2.12f, 1.49f, -14.31f, 9.92f, -13.65f, 12.09f)
            curveToRelative(0.19f, 0.12f, 8.41f, 1.48f, 10.41f, 6.46f)
            arcToRelative(30.5f, 30.5f, 0.0f, false, false, -7.31f, 5.44f)
            curveToRelative(-1.15f, 2.19f, -5.94f, 4.37f, -5.35f, 5.7f)
            curveToRelative(0.76f, 1.07f, 7.0f, 3.06f, 8.55f, 3.86f)
            curveToRelative(0.52f, -0.36f, 1.38f, -9.77f, 11.18f, -9.25f)
            curveToRelative(0.0f, -0.11f, 0.27f, -4.95f, 0.31f, -4.93f)
            curveToRelative(0.08f, 0.19f, 1.34f, 4.2f, 1.64f, 4.69f)
            arcToRelative(12.1f, 12.1f, 0.0f, false, false, 1.89f, 0.06f)
            curveToRelative(-3.23f, 2.06f, -9.57f, 1.62f, -11.0f, 3.54f)
            curveToRelative(-0.68f, 3.2f, -8.18f, 13.52f, -6.07f, 15.34f)
            curveToRelative(1.64f, 1.92f, 7.57f, -0.68f, 15.0f, 0.9f)
            curveToRelative(2.15f, -0.64f, 7.19f, -6.95f, 7.5f, -7.16f)
            curveToRelative(0.27f, 1.41f, -1.27f, 2.69f, -1.22f, 2.83f)
            reflectiveCurveToRelative(0.45f, 3.0f, 1.57f, 4.0f)
            curveToRelative(0.2f, 0.0f, 2.79f, -0.44f, 3.1f, -0.52f)
            curveToRelative(0.89f, 1.1f, -6.39f, 2.0f, -7.26f, 2.65f)
            curveToRelative(-0.2f, 0.16f, -8.42f, 12.72f, -6.53f, 14.29f)
            curveToRelative(0.42f, 0.12f, 7.93f, -0.33f, 8.17f, -0.23f)
            curveToRelative(1.61f, 0.43f, 1.09f, 3.89f, 1.17f, 4.0f)
            curveToRelative(0.26f, 0.45f, 8.0f, 0.57f, 11.84f, -2.12f)
            quadToRelative(2.64f, -4.4f, 2.84f, -4.77f)
            reflectiveCurveToRelative(-2.0f, -1.75f, -2.39f, -2.0f)
            curveToRelative(-0.18f, 0.07f, -3.83f, 4.45f, -9.22f, 2.77f)
            curveToRelative(3.31f, 0.0f, 6.61f, -1.0f, 8.1f, -4.57f)
            curveToRelative(0.38f, 0.0f, 5.31f, 3.33f, 5.37f, 5.53f)
            curveToRelative(0.0f, 0.89f, -2.56f, 8.48f, -2.44f, 8.83f)
            curveToRelative(0.12f, 0.0f, 9.41f, -4.25f, 9.58f, -4.44f)
            arcToRelative(12.22f, 12.22f, 0.0f, false, false, 0.59f, -1.11f)
            arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.41f, 0.13f)
            arcToRelative(1.75f, 1.75f, 0.0f, false, true, -0.65f, 1.6f)
            curveToRelative(-0.65f, 0.5f, -6.36f, 3.43f, -6.89f, 4.12f)
            arcToRelative(27.68f, 27.68f, 0.0f, false, false, 4.19f, 0.77f)
            curveToRelative(0.27f, 0.0f, 5.23f, -2.54f, 5.54f, -2.06f)
            arcToRelative(9.62f, 9.62f, 0.0f, false, false, 0.75f, 1.0f)
            arcToRelative(15.29f, 15.29f, 0.0f, false, true, -1.29f, 1.24f)
            curveToRelative(-0.21f, 0.2f, -2.19f, 4.21f, -2.29f, 4.4f)
            curveToRelative(0.15f, 0.24f, 1.71f, 0.86f, 1.78f, 1.07f)
            curveToRelative(0.0f, 0.0f, -0.22f, 1.78f, -0.25f, 2.5f)
            curveToRelative(0.47f, 0.0f, 4.5f, -1.06f, 4.63f, -1.0f)
            curveToRelative(-0.66f, 3.11f, 2.12f, 8.8f, 2.36f, 10.87f)
            curveToRelative(2.0f, 9.88f, 8.37f, 9.94f, 8.43f, 9.76f)
            curveToRelative(-0.11f, -1.66f, -0.34f, -3.64f, 0.58f, -4.21f)
            arcToRelative(10.27f, 10.27f, 0.0f, false, false, 2.22f, -5.7f)
            curveToRelative(2.0f, -3.88f, 2.7f, -5.31f, 1.75f, -8.93f)
            arcToRelative(12.69f, 12.69f, 0.0f, false, true, -0.29f, -2.45f)
            curveToRelative(0.12f, -0.57f, 1.65f, -3.87f, 0.5f, -6.18f)
            arcToRelative(7.73f, 7.73f, 0.0f, false, true, -4.56f, 2.06f)
            curveToRelative(5.57f, -5.73f, 5.0f, -11.64f, 4.82f, -11.66f)
            curveToRelative(-2.0f, 2.6f, -4.38f, 2.4f, -4.58f, 2.25f)
            curveToRelative(2.44f, -1.0f, 6.17f, -5.76f, 7.25f, -9.51f)
            curveToRelative(0.0f, 0.0f, 12.95f, 1.52f, 13.73f, 4.62f)
            curveToRelative(0.0f, 0.0f, 1.3f, 5.66f, 4.72f, 7.12f)
            curveToRelative(0.19f, 0.0f, 0.44f, -1.15f, 0.44f, -2.13f)
            curveToRelative(0.22f, 0.0f, 2.0f, 0.78f, 2.28f, 0.83f)
            arcToRelative(15.19f, 15.19f, 0.0f, false, true, 0.09f, -2.42f)
            arcToRelative(26.08f, 26.08f, 0.0f, false, false, 3.12f, 1.07f)
            reflectiveCurveToRelative(-4.35f, -6.31f, -3.74f, -10.91f)
            curveToRelative(-0.2f, -2.21f, -7.0f, -4.44f, -8.0f, -6.63f)
            arcToRelative(51.24f, 51.24f, 0.0f, false, false, -7.4f, -2.93f)
            arcToRelative(6.2f, 6.2f, 0.0f, false, false, -0.56f, 1.8f)
            curveToRelative(13.44f, 7.77f, 10.33f, 8.8f, 10.26f, 8.8f)
            curveToRelative(-1.41f, -3.11f, -10.61f, -6.72f, -10.84f, -6.77f)
            curveToRelative(-1.4f, 3.52f, -6.48f, 6.42f, -6.61f, 6.5f)
            curveToRelative(2.43f, -3.54f, 5.62f, -10.48f, 7.0f, -13.08f)
            curveToRelative(1.1f, -1.0f, 5.0f, -2.89f, 4.56f, -2.89f)
            curveToRelative(3.18f, -0.49f, 12.57f, -1.0f, 14.12f, 1.37f)
            curveToRelative(0.0f, 0.07f, 0.0f, 5.23f, 1.87f, 7.2f)
            arcToRelative(14.08f, 14.08f, 0.0f, false, true, 1.46f, -0.81f)
            arcToRelative(11.16f, 11.16f, 0.0f, false, false, 2.08f, 0.93f)
            curveToRelative(0.29f, -1.79f, 0.44f, -2.82f, 0.45f, -3.11f)
            curveToRelative(0.19f, -0.14f, 1.79f, 0.28f, 2.27f, 0.23f)
            curveToRelative(0.52f, -1.57f, -2.17f, -7.0f, -2.17f, -7.66f)
            curveToRelative(0.23f, 0.0f, 2.14f, 0.22f, 2.5f, 0.21f)
            curveToRelative(0.06f, -0.12f, -0.51f, -8.57f, -20.66f, -9.88f)
            arcToRelative(52.12f, 52.12f, 0.0f, false, true, -6.88f, 0.9f)
            curveToRelative(-10.47f, 1.38f, -11.86f, 9.86f, -14.36f, 11.26f)
            curveToRelative(-0.15f, 0.12f, -5.83f, 7.35f, -10.53f, 7.47f)
            curveToRelative(0.06f, -0.07f, 6.36f, -4.29f, 7.16f, -6.69f)
            curveToRelative(-3.58f, 0.32f, -8.89f, 4.21f, -9.65f, 4.33f)
            curveToRelative(2.05f, -3.59f, 10.48f, -5.62f, 10.63f, -5.8f)
            curveToRelative(-6.36f, -3.08f, -15.26f, 2.56f, -16.17f, 2.51f)
            curveToRelative(3.43f, -2.69f, 5.5f, -6.0f, 17.9f, -4.77f)
            curveToRelative(0.05f, 0.0f, 2.92f, -3.65f, 3.08f, -3.92f)
            curveToRelative(-6.45f, -7.0f, -17.88f, -3.4f, -18.24f, -3.45f)
            curveToRelative(0.55f, -0.34f, 7.9f, -6.78f, 19.87f, 1.77f)
            curveToRelative(3.18f, -4.24f, 9.72f, -5.68f, 10.0f, -5.88f)
            curveToRelative(0.0f, -0.1f, -0.48f, -10.0f, -0.08f, -10.59f)
            arcToRelative(13.26f, 13.26f, 0.0f, false, true, 2.46f, -1.84f)
            curveToRelative(5.78f, 0.45f, 4.0f, 1.0f, 11.1f, -1.12f)
            curveToRelative(1.49f, 5.32f, 4.34f, 5.26f, 4.56f, 5.3f)
            curveToRelative(-1.68f, -4.14f, 2.21f, -9.83f, 1.0f, -12.7f)
            curveTo(142.65f, 97.0f, 132.79f, 103.0f, 124.0f, 102.81f)
            curveToRelative(0.83f, 5.9f, 0.07f, 6.81f, -0.13f, 7.51f)
            curveToRelative(-0.09f, -0.24f, -0.08f, -8.48f, -3.34f, -7.55f)
            curveToRelative(-3.82f, 3.55f, 0.71f, 19.31f, 0.5f, 19.91f)
            arcToRelative(2.08f, 2.08f, 0.0f, false, true, -0.7f, 0.8f)
            curveToRelative(-6.85f, 0.75f, -7.06f, -9.0f, -20.71f, -7.93f)
            curveToRelative(11.67f, -6.11f, 18.43f, 7.59f, 19.69f, 4.2f)
            curveToRelative(-2.83f, -7.75f, -2.12f, -16.24f, -2.15f, -16.52f)
            curveToRelative(-9.1f, -0.87f, -25.89f, 6.23f, -26.49f, 6.32f)
            curveToRelative(0.16f, -0.18f, 2.08f, -2.81f, 12.06f, -6.3f)
            curveToRelative(-8.73f, -4.0f, -20.88f, -1.52f, -21.13f, -1.66f)
            curveToRelative(10.1f, -9.23f, 32.5f, 1.08f, 37.53f, 0.11f)
            curveToRelative(8.0f, -0.69f, 17.86f, -10.57f, 18.41f, -11.0f)
            arcToRelative(10.23f, 10.23f, 0.0f, false, true, 2.0f, -1.39f)
            arcTo(6.85f, 6.85f, 0.0f, false, false, 141.69f, 88.0f)
            quadToRelative(1.6f, -1.53f, 2.73f, -1.0f)
            curveToRelative(0.13f, 0.4f, 1.39f, 5.09f, 3.8f, 7.0f)
            curveToRelative(0.19f, 0.0f, 1.26f, -1.71f, 1.29f, -1.79f)
            curveToRelative(0.22f, 0.06f, 1.37f, 1.0f, 1.84f, 1.39f)
            curveToRelative(0.2f, -0.18f, 1.49f, -2.23f, 1.62f, -2.31f)
            arcToRelative(11.25f, 11.25f, 0.0f, false, false, 2.14f, 0.79f)
            arcToRelative(32.77f, 32.77f, 0.0f, false, true, -1.54f, -6.74f)
            curveToRelative(0.06f, -1.56f, -2.44f, -5.1f, -0.57f, -9.0f)
            curveToRelative(-13.0f, -7.82f, -27.09f, 12.6f, -34.78f, 7.71f)
            curveToRelative(-6.27f, -1.61f, -7.79f, -11.75f, -29.37f, -9.94f)
            curveToRelative(18.66f, -7.36f, 28.8f, 10.56f, 33.36f, 9.94f)
            curveToRelative(0.0f, -0.07f, -0.46f, -14.7f, -8.79f, -19.83f)
            curveToRelative(2.7f, -0.39f, 7.84f, 5.44f, 8.0f, 5.41f)
            curveToRelative(-0.54f, -1.83f, -0.45f, -9.44f, 2.8f, -13.76f)
            arcToRelative(18.64f, 18.64f, 0.0f, false, false, 9.12f, -10.69f)
            curveToRelative(0.3f, -1.33f, 1.48f, -4.47f, 3.75f, -5.0f)
            curveToRelative(-0.09f, 0.19f, -3.0f, 3.47f, -3.32f, 6.58f)
            curveToRelative(-2.0f, 7.0f, -9.71f, 10.83f, -9.71f, 10.83f)
            curveToRelative(-0.17f, 0.12f, -3.2f, 9.39f, -1.0f, 12.1f)
            curveToRelative(1.08f, -0.42f, 13.48f, -20.32f, 15.77f, -25.86f)
            curveToRelative(9.59f, -20.26f, -3.61f, -34.08f, -5.3f, -35.38f)
            curveTo(130.0f, 1.41f, 118.33f, -0.2f, 118.14f, 0.0f)
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
            moveTo(107.56f, 186.88f)
            curveToRelative(-0.81f, -0.73f, 0.72f, -1.35f, 0.72f, -1.35f)
            curveToRelative(0.0f, 1.42f, -0.72f, 1.35f, -0.72f, 1.35f)
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
            moveTo(109.56f, 194.9f)
            arcToRelative(0.56f, 0.56f, 0.0f, false, false, -1.0f, -0.1f)
            curveToRelative(0.0f, 0.06f, -0.13f, 0.1f, -0.3f, 0.1f)
            curveToRelative(0.0f, -0.11f, 0.13f, -0.76f, 0.13f, -0.76f)
            reflectiveCurveToRelative(1.49f, -0.14f, 1.14f, 0.76f)
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
            moveTo(112.0f, 193.89f)
            reflectiveCurveToRelative(0.15f, -3.41f, 0.29f, -4.0f)
            arcToRelative(8.53f, 8.53f, 0.0f, false, false, 0.28f, -1.95f)
            arcToRelative(13.33f, 13.33f, 0.0f, false, true, 1.0f, -4.29f)
            curveToRelative(0.12f, -0.61f, 2.0f, -2.41f, 2.0f, -2.41f)
            arcTo(39.46f, 39.46f, 0.0f, false, false, 112.0f, 193.89f)
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
            moveTo(125.52f, 135.09f)
            arcToRelative(11.57f, 11.57f, 0.0f, false, true, 0.25f, -3.33f)
            reflectiveCurveToRelative(2.0f, 6.25f, 1.69f, 6.49f)
            curveToRelative(-0.76f, -0.33f, -1.91f, -2.63f, -1.94f, -3.16f)
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
            moveTo(96.51f, 154.0f)
            curveToRelative(0.72f, 1.38f, 16.28f, 5.63f, 21.14f, -4.81f)
            arcToRelative(13.0f, 13.0f, 0.0f, false, true, 5.44f, -6.53f)
            arcToRelative(0.27f, 0.27f, 0.0f, false, false, 0.0f, 0.12f)
            curveToRelative(-5.85f, 5.8f, -3.45f, 17.47f, -25.09f, 14.21f)
            curveToRelative(1.53f, 6.18f, 7.41f, 9.0f, 7.41f, 9.0f)
            arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.88f, 8.6f)
            curveToRelative(-1.16f, -8.66f, -4.8f, -5.95f, -9.17f, -11.67f)
            curveToRelative(-0.64f, -0.81f, -6.36f, -13.24f, -10.19f, -14.14f)
            curveToRelative(-8.26f, -3.37f, -8.67f, -9.32f, -8.67f, -9.32f)
            horizontalLineToRelative(0.12f)
            curveToRelative(3.42f, 7.31f, 11.13f, 6.48f, 16.1f, 14.5f)
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
            moveTo(72.21f, 118.16f)
            arcToRelative(33.07f, 33.07f, 0.0f, false, true, -7.12f, 4.53f)
            arcToRelative(0.24f, 0.24f, 0.0f, false, false, 0.0f, -0.15f)
            curveToRelative(0.79f, -1.12f, 7.0f, -4.35f, 7.14f, -4.46f)
            lineToRelative(0.0f, 0.08f)
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
            moveTo(73.06f, 90.94f)
            arcToRelative(5.72f, 5.72f, 0.0f, false, true, -4.64f, 2.0f)
            curveToRelative(-2.3f, 4.63f, -3.0f, 10.45f, -2.79f, 10.47f)
            curveToRelative(0.0f, 0.0f, 4.41f, 0.74f, 4.41f, 0.87f)
            arcToRelative(19.78f, 19.78f, 0.0f, false, true, -8.44f, -0.79f)
            lineToRelative(2.57f, -0.15f)
            curveToRelative(0.0f, -0.07f, 1.11f, -7.0f, 2.78f, -10.35f)
            curveToRelative(-7.81f, -1.75f, -7.0f, -4.83f, -7.18f, -5.26f)
            curveToRelative(0.0f, 0.0f, 5.65f, 6.1f, 13.29f, 3.22f)
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
            moveTo(115.22f, 86.4f)
            curveToRelative(4.24f, 3.0f, 9.0f, -0.64f, 13.77f, -2.26f)
            curveToRelative(2.1f, -0.66f, 10.88f, -7.82f, 14.38f, -5.0f)
            arcToRelative(6.77f, 6.77f, 0.0f, false, true, 1.19f, 1.75f)
            curveToRelative(-5.0f, -3.52f, -13.0f, 3.65f, -14.61f, 4.0f)
            curveToRelative(-2.41f, 0.56f, -8.69f, 5.94f, -15.3f, 2.56f)
            curveToRelative(-3.5f, -2.0f, -16.45f, -12.18f, -28.0f, -2.75f)
            curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, -0.08f, -0.08f)
            reflectiveCurveToRelative(9.52f, -13.1f, 28.62f, 1.71f)
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
            moveTo(123.87f, 47.39f)
            arcTo(13.45f, 13.45f, 0.0f, false, false, 126.0f, 48.0f)
            lineToRelative(-2.35f, 0.13f)
            curveToRelative(-0.07f, 0.0f, -4.49f, -1.68f, -4.49f, -1.68f)
            curveToRelative(0.74f, -0.52f, 2.56f, 0.19f, 4.67f, 1.0f)
        }
    }
        .build()
}
