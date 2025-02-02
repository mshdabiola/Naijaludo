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

fun Cat.getYellow(iconColor: Color, accentColor: Color): ImageVector {
    return Builder(
        name = "Yellow3",
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
            moveTo(199.71f, 178.45f)
            curveToRelative(1.3f, -1.44f, -2.15f, -1.73f, -2.37f, -0.29f)
            curveToRelative(-2.0f, 0.63f, -3.39f, -0.92f, -4.54f, -2.0f)
            curveToRelative(1.16f, -0.77f, 6.0f, -1.42f, 6.0f, -3.16f)
            curveToRelative(-1.39f, -0.29f, -3.34f, 0.74f, -4.83f, 0.28f)
            curveToRelative(-2.42f, -0.35f, -4.67f, -0.23f, -6.23f, -2.36f)
            curveToRelative(-0.47f, -0.79f, -1.32f, -1.32f, -0.51f, -2.07f)
            curveToRelative(1.44f, 0.06f, 4.0f, 0.69f, 5.12f, -0.69f)
            arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.91f, -2.19f)
            curveToRelative(1.38f, -0.45f, 2.0f, 0.86f, 2.93f, 0.69f)
            arcToRelative(10.88f, 10.88f, 0.0f, false, false, -1.66f, -4.0f)
            curveToRelative(1.0f, -0.12f, 1.76f, 0.45f, 2.64f, 0.29f)
            curveToRelative(0.85f, -0.57f, 2.0f, 1.31f, 1.78f, -0.41f)
            curveToRelative(-1.37f, -1.0f, -2.7f, -1.72f, -4.14f, -2.75f)
            curveToRelative(0.11f, -1.0f, 2.07f, -0.53f, 1.9f, -1.85f)
            arcToRelative(6.15f, 6.15f, 0.0f, false, false, -2.07f, -1.21f)
            curveToRelative(-1.08f, -2.19f, -3.24f, -1.32f, -4.66f, -3.34f)
            curveToRelative(1.0f, -0.86f, 3.87f, -1.0f, 3.05f, -2.84f)
            arcToRelative(29.53f, 29.53f, 0.0f, false, true, -8.18f, 0.0f)
            curveToRelative(0.4f, -1.26f, 2.19f, -1.2f, 2.48f, -2.47f)
            arcToRelative(5.78f, 5.78f, 0.0f, false, false, -5.65f, -0.69f)
            curveToRelative(-0.46f, -0.69f, 0.25f, -1.67f, -0.21f, -2.31f)
            curveToRelative(-1.22f, 1.15f, -1.22f, 0.14f, -3.12f, 1.0f)
            curveToRelative(-1.0f, 0.69f, -1.49f, -0.9f, -2.37f, 0.58f)
            curveToRelative(-3.08f, 1.55f, 0.06f, -2.43f, -1.37f, -3.46f)
            curveToRelative(-1.5f, 0.23f, -1.85f, 2.19f, -3.29f, 1.9f)
            curveToRelative(-0.29f, -1.61f, 0.69f, -3.74f, -0.86f, -4.84f)
            curveToRelative(-1.38f, 0.52f, -2.36f, 1.44f, -3.69f, 2.07f)
            curveToRelative(-1.0f, 0.47f, -1.27f, 2.54f, -2.53f, 2.36f)
            arcToRelative(4.24f, 4.24f, 0.0f, false, false, -1.1f, -2.75f)
            curveToRelative(-3.22f, -1.62f, -2.93f, -5.65f, -3.45f, -8.59f)
            curveToRelative(-0.52f, -2.3f, -2.3f, -3.22f, -2.76f, -5.64f)
            curveToRelative(-2.59f, -5.75f, -5.82f, -11.63f, -8.0f, -18.0f)
            curveToRelative(-1.91f, -4.72f, -3.35f, -9.22f, -5.65f, -13.53f)
            curveToRelative(-2.0f, -2.54f, -3.92f, -6.11f, -6.22f, -8.59f)
            curveToRelative(-7.77f, -7.13f, -14.57f, -14.39f, -23.26f, -20.32f)
            curveToRelative(-3.68f, -2.0f, -6.91f, -4.09f, -11.17f, -4.72f)
            curveToRelative(-2.3f, -0.4f, -3.74f, -2.25f, -5.82f, -3.29f)
            curveToRelative(-1.08f, -1.0f, -3.0f, -0.74f, -4.26f, -1.67f)
            curveTo(88.0f, 52.92f, 82.6f, 52.58f, 79.49f, 51.0f)
            curveTo(78.28f, 49.64f, 81.0f, 49.76f, 81.0f, 48.67f)
            curveToRelative(-2.59f, 0.0f, -4.49f, -1.45f, -6.21f, -3.06f)
            curveToRelative(-0.35f, -1.0f, 0.8f, -0.89f, 1.26f, -0.4f)
            curveToRelative(0.63f, 0.34f, 1.41f, 0.16f, 1.1f, -0.69f)
            curveToRelative(-1.0f, -0.74f, -3.0f, -0.23f, -3.86f, -1.27f)
            curveToRelative(-0.75f, -0.75f, -2.59f, -1.14f, -1.78f, -2.48f)
            curveTo(70.33f, 40.26f, 68.38f, 40.0f, 68.0f, 39.1f)
            curveToRelative(0.23f, -0.86f, 2.13f, -0.91f, 2.18f, -2.07f)
            curveToRelative(0.0f, -0.86f, -0.45f, -0.05f, -0.8f, 0.0f)
            curveToRelative(-2.76f, -0.8f, -5.82f, -2.0f, -7.48f, -4.26f)
            curveToRelative(0.11f, -0.46f, 1.0f, -0.11f, 0.69f, -0.81f)
            curveToRelative(-1.9f, -0.86f, -3.75f, -2.0f, -5.53f, -2.93f)
            curveToRelative(-0.58f, -0.69f, -3.28f, -2.07f, -1.67f, -3.28f)
            curveToRelative(-2.88f, -0.4f, -5.06f, -2.42f, -7.43f, -3.74f)
            curveToRelative(-3.16f, -3.0f, -6.68f, -5.42f, -8.05f, -9.16f)
            curveToRelative(-1.16f, -3.11f, -4.78f, -4.32f, -7.14f, -5.64f)
            curveToRelative(-0.53f, 0.4f, 0.0f, 1.1f, -0.18f, 1.67f)
            curveToRelative(-0.75f, 1.49f, -0.69f, 3.68f, -1.67f, 5.13f)
            curveToRelative(-1.0f, -0.12f, -1.19f, -1.2f, -2.3f, -1.67f)
            curveToRelative(-2.42f, -1.22f, -5.13f, -2.89f, -7.89f, -1.79f)
            curveTo(18.0f, 9.22f, 15.4f, 4.72f, 10.0f, 4.0f)
            curveToRelative(-0.62f, -0.46f, -1.42f, -0.47f, -0.66f, 0.58f)
            curveToRelative(2.76f, 2.19f, 3.51f, 5.24f, 4.26f, 8.75f)
            curveToRelative(-0.8f, 0.58f, -1.84f, 0.06f, -2.65f, -0.17f)
            curveToRelative(-0.52f, 0.17f, -1.9f, -1.0f, -1.61f, 0.4f)
            curveToRelative(2.13f, 3.0f, -2.13f, 0.57f, -2.94f, 2.08f)
            curveToRelative(-0.51f, 0.86f, 0.87f, 1.0f, 1.0f, 1.67f)
            arcTo(11.88f, 11.88f, 0.0f, false, true, 4.58f, 18.0f)
            curveToRelative(-1.84f, 1.32f, 1.0f, 1.09f, 1.0f, 2.24f)
            arcToRelative(4.69f, 4.69f, 0.0f, false, true, -1.27f, 0.69f)
            curveToRelative(-0.75f, 0.75f, 0.18f, 1.62f, 0.87f, 2.07f)
            curveToRelative(1.55f, 2.59f, -2.71f, 2.14f, -2.94f, 4.26f)
            curveToRelative(0.46f, 0.3f, 1.0f, -0.11f, 1.56f, 0.0f)
            curveToRelative(0.33f, 1.22f, -1.45f, 1.28f, -1.85f, 2.19f)
            arcTo(1.71f, 1.71f, 0.0f, false, false, 3.19f, 32.2f)
            curveToRelative(1.61f, 2.07f, 0.59f, 5.52f, -0.57f, 7.37f)
            curveTo(0.93f, 41.34f, 1.56f, 42.5f, 1.36f, 44.05f)
            arcToRelative(1.72f, 1.72f, 0.0f, false, true, -0.64f, 0.47f)
            curveToRelative(-1.37f, 2.39f, -0.59f, 5.09f, 0.68f, 7.2f)
            arcTo(2.9f, 2.9f, 0.0f, false, false, 3.0f, 53.0f)
            curveToRelative(0.76f, 0.87f, 0.54f, 2.52f, 1.6f, 3.22f)
            arcToRelative(12.77f, 12.77f, 0.0f, false, false, 8.69f, 2.48f)
            arcToRelative(5.32f, 5.32f, 0.0f, false, false, 5.24f, 0.18f)
            arcToRelative(3.08f, 3.08f, 0.0f, false, true, 2.77f, 0.39f)
            curveToRelative(3.0f, -0.55f, 0.24f, 5.35f, 2.53f, 2.48f)
            curveToRelative(1.09f, 0.58f, 1.15f, 2.0f, 1.38f, 2.88f)
            curveToRelative(1.22f, -1.81f, 2.09f, -0.66f, 2.48f, 0.17f)
            curveTo(27.61f, 67.3f, 26.39f, 69.0f, 27.0f, 71.18f)
            curveToRelative(1.32f, 3.28f, 2.47f, 9.0f, -0.58f, 12.0f)
            curveToRelative(-0.52f, 1.33f, 1.09f, 1.39f, 1.78f, 2.08f)
            curveToRelative(0.47f, 0.74f, -0.34f, 1.49f, -0.8f, 2.0f)
            curveToRelative(-1.38f, 2.81f, 2.19f, 4.14f, 3.34f, 6.0f)
            curveToRelative(-0.69f, 2.3f, 1.61f, 3.0f, 2.88f, 4.0f)
            curveToRelative(-0.11f, 3.11f, 3.34f, 1.9f, 4.43f, 4.15f)
            curveToRelative(-0.63f, 2.0f, 1.15f, 2.12f, 2.08f, 3.28f)
            curveToRelative(-1.39f, 3.0f, 2.36f, 2.16f, 1.89f, 5.12f)
            curveToRelative(2.6f, 6.74f, 2.0f, 15.09f, 2.08f, 22.52f)
            curveToRelative(-0.58f, 12.26f, 1.0f, 24.64f, 1.07f, 36.5f)
            curveToRelative(-0.4f, 1.57f, -0.55f, 2.76f, -2.17f, 2.88f)
            curveToRelative(-5.13f, 1.44f, -11.22f, 2.7f, -12.72f, 8.29f)
            arcTo(5.84f, 5.84f, 0.0f, false, false, 33.6f, 184.0f)
            curveToRelative(4.2f, 0.0f, 8.0f, 1.0f, 11.86f, 0.69f)
            curveToRelative(0.92f, 1.09f, 0.51f, 2.76f, 1.38f, 3.86f)
            curveToRelative(2.48f, 5.52f, 8.92f, 0.11f, 12.61f, 3.56f)
            arcToRelative(4.21f, 4.21f, 0.0f, false, true, 2.13f, 0.58f)
            curveToRelative(7.9f, 1.0f, 15.31f, 5.53f, 24.0f, 2.76f)
            curveToRelative(2.08f, -0.06f, 4.49f, -0.69f, 6.0f, 0.52f)
            curveToRelative(4.15f, -2.08f, 9.15f, -1.61f, 13.53f, -1.09f)
            curveToRelative(6.51f, 1.38f, 13.3f, 0.86f, 20.33f, 1.0f)
            arcToRelative(83.08f, 83.08f, 0.0f, false, false, 8.29f, -2.77f)
            curveToRelative(1.44f, 0.64f, 3.11f, 0.8f, 4.54f, 1.5f)
            arcToRelative(39.82f, 39.82f, 0.0f, false, false, 11.0f, 0.29f)
            arcToRelative(7.21f, 7.21f, 0.0f, false, false, 6.92f, -2.19f)
            curveToRelative(1.38f, 0.23f, 2.42f, 0.57f, 3.74f, -0.17f)
            curveToRelative(0.57f, -1.1f, -0.63f, -1.91f, -0.86f, -2.77f)
            arcToRelative(0.86f, 0.86f, 0.0f, false, true, 1.09f, -0.81f)
            curveToRelative(2.53f, 1.62f, 6.56f, 1.16f, 9.0f, -0.28f)
            curveToRelative(3.0f, 1.83f, 2.23f, -3.28f, 5.41f, -1.67f)
            curveToRelative(1.74f, -0.57f, 3.74f, -0.41f, 5.41f, -1.21f)
            curveToRelative(2.0f, -0.06f, 3.52f, -1.56f, 5.36f, -1.56f)
            curveToRelative(3.54f, -2.73f, 8.07f, 1.66f, 10.65f, -0.8f)
            curveToRelative(1.45f, -0.56f, 2.24f, -1.28f, 2.19f, -2.65f)
            curveToRelative(-1.6f, 1.19f, -2.77f, 0.81f, -3.57f, -0.23f)
            curveToRelative(2.83f, 0.37f, 3.4f, -1.38f, 5.13f, -2.07f)
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
            moveTo(184.05f, 151.42f)
            curveToRelative(1.0f, 0.11f, 2.16f, -0.27f, 2.79f, 0.2f)
            arcToRelative(18.38f, 18.38f, 0.0f, false, true, -6.6f, 2.76f)
            arcToRelative(16.94f, 16.94f, 0.0f, false, true, 3.81f, -3.0f)
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
            moveTo(88.29f, 59.15f)
            curveToRelative(1.27f, 1.2f, 3.57f, 1.0f, 5.0f, 2.36f)
            curveToRelative(0.11f, -0.2f, 0.29f, -0.24f, 0.51f, 0.0f)
            curveToRelative(3.28f, 2.76f, 7.37f, 2.42f, 10.94f, 4.55f)
            curveToRelative(5.18f, 2.59f, 9.9f, 6.33f, 14.22f, 10.0f)
            curveToRelative(3.0f, 3.28f, 2.6f, 7.83f, 4.55f, 11.62f)
            arcToRelative(22.43f, 22.43f, 0.0f, false, true, -0.23f, 9.79f)
            curveToRelative(-1.5f, -0.57f, -0.63f, -2.81f, -1.27f, -4.14f)
            curveToRelative(-1.26f, 0.23f, -0.45f, 2.42f, -0.69f, 3.63f)
            curveToRelative(0.07f, 1.78f, 0.58f, 3.62f, -0.4f, 5.23f)
            curveToRelative(-0.46f, 0.3f, -0.12f, -4.15f, -1.27f, -1.37f)
            curveToRelative(-1.0f, 1.84f, -1.17f, 4.75f, -2.59f, 6.0f)
            curveToRelative(0.0f, -1.28f, -0.63f, -0.73f, -0.69f, -0.39f)
            curveToRelative(-1.51f, 4.41f, -3.73f, 8.75f, -4.0f, 14.0f)
            curveToRelative(-0.35f, 2.58f, -1.67f, 3.84f, -2.0f, 7.42f)
            curveToRelative(-0.28f, -0.45f, -0.4f, -1.26f, -0.92f, -1.78f)
            curveToRelative(0.0f, -6.22f, 2.08f, -11.92f, 1.9f, -18.37f)
            curveToRelative(0.35f, -1.49f, 0.75f, -3.58f, 0.29f, -4.72f)
            curveToRelative(-2.0f, 2.0f, -1.61f, 5.24f, -3.0f, 7.6f)
            curveToRelative(-0.12f, 2.65f, -2.09f, 4.37f, -2.89f, 6.67f)
            curveToRelative(-0.08f, 0.17f, -0.23f, 0.18f, -0.29f, 0.0f)
            curveToRelative(-0.17f, -1.78f, 0.29f, -3.39f, 0.12f, -5.24f)
            curveToRelative(-0.28f, -0.43f, -0.45f, -0.68f, -0.69f, -0.11f)
            curveToRelative(-0.93f, 1.73f, -1.38f, 4.09f, -2.77f, 5.64f)
            curveToRelative(-0.4f, 0.18f, -0.28f, -0.29f, -0.69f, -0.29f)
            curveToRelative(0.17f, -4.37f, 1.44f, -8.64f, 0.58f, -13.12f)
            curveToRelative(-1.1f, 0.34f, -0.58f, 2.24f, -2.0f, 2.0f)
            curveToRelative(-0.06f, 0.58f, -0.69f, 0.35f, -1.09f, 0.41f)
            arcToRelative(40.88f, 40.88f, 0.0f, false, true, 2.64f, -6.22f)
            curveToRelative(1.55f, -4.61f, 0.29f, -10.0f, 1.67f, -14.63f)
            curveTo(102.0f, 85.0f, 102.8f, 87.13f, 102.0f, 87.64f)
            curveToRelative(-0.12f, 0.7f, -1.16f, 0.87f, -1.27f, 0.12f)
            curveToRelative(0.0f, -0.35f, -0.52f, -0.45f, -0.52f, -0.81f)
            curveToRelative(-0.86f, 0.3f, -0.06f, 1.56f, -0.69f, 2.08f)
            curveToRelative(-0.57f, 0.75f, -1.61f, 1.38f, -2.24f, 1.0f)
            arcToRelative(30.9f, 30.9f, 0.0f, false, true, -3.57f, 5.94f)
            curveToRelative(-0.58f, 0.0f, -1.5f, -0.12f, -1.1f, -1.0f)
            arcToRelative(71.0f, 71.0f, 0.0f, false, true, 3.75f, -10.0f)
            curveToRelative(2.24f, -5.18f, 5.7f, -9.68f, 7.14f, -15.32f)
            curveToRelative(-0.3f, -0.81f, -1.39f, -0.81f, -2.08f, -0.58f)
            curveTo(100.0f, 70.77f, 99.0f, 73.54f, 96.18f, 73.66f)
            arcToRelative(10.46f, 10.46f, 0.0f, false, true, -1.37f, 2.52f)
            arcTo(5.0f, 5.0f, 0.0f, false, true, 92.9f, 79.0f)
            curveToRelative(-1.0f, 0.69f, -1.15f, -0.8f, -2.24f, -0.46f)
            arcTo(5.63f, 5.63f, 0.0f, false, false, 89.85f, 81.0f)
            curveToRelative(-0.87f, 1.56f, -2.53f, 3.46f, -2.08f, 5.64f)
            curveToRelative(-0.22f, 0.29f, -1.0f, 0.06f, -0.69f, -0.28f)
            arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.17f, -1.9f)
            curveToRelative(-2.88f, 1.21f, -3.22f, 4.83f, -4.54f, 7.6f)
            curveToRelative(-1.74f, 3.17f, -1.21f, 8.12f, -5.24f, 9.67f)
            curveToRelative(-0.24f, -1.0f, 0.28f, -2.76f, -0.29f, -3.91f)
            curveToRelative(0.17f, -1.78f, 0.92f, -3.57f, -0.12f, -5.24f)
            curveToRelative(-2.13f, 1.32f, -2.18f, 4.49f, -3.0f, 6.8f)
            arcToRelative(17.9f, 17.9f, 0.0f, false, true, -5.93f, 8.0f)
            arcToRelative(7.26f, 7.26f, 0.0f, false, true, 1.39f, -4.84f)
            curveToRelative(-0.65f, -0.35f, 0.0f, -0.81f, 0.0f, -1.27f)
            curveToRelative(1.0f, -1.0f, 0.8f, -2.82f, 1.77f, -3.86f)
            curveToRelative(2.66f, -4.43f, 6.8f, -5.29f, 10.0f, -9.0f)
            curveToRelative(1.9f, -1.73f, -1.0f, -4.09f, 1.38f, -5.52f)
            curveToRelative(2.24f, -2.07f, 2.0f, -5.3f, 2.36f, -8.41f)
            curveToRelative(-0.4f, -1.33f, -1.0f, -0.21f, -1.38f, 0.4f)
            curveToRelative(0.23f, 1.67f, -1.34f, 2.69f, -2.23f, 3.46f)
            horizontalLineToRelative(-0.42f)
            curveToRelative(3.22f, -2.14f, -0.06f, -6.86f, 2.76f, -9.1f)
            curveToRelative(2.36f, -3.0f, 1.79f, -7.14f, 2.07f, -10.94f)
            curveToRelative(1.0f, -0.92f, 1.67f, 0.86f, 2.88f, 0.81f)
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
            moveTo(86.0f, 160.6f)
            curveToRelative(-0.42f, -0.29f, 0.0f, -0.5f, 0.11f, -1.0f)
            curveToRelative(0.46f, 1.09f, 1.72f, 0.92f, 2.36f, 0.0f)
            curveToRelative(1.15f, -1.33f, 1.5f, -2.88f, 2.87f, -3.85f)
            verticalLineToRelative(1.66f)
            arcToRelative(10.29f, 10.29f, 0.0f, false, false, -1.9f, 4.26f)
            curveToRelative(-1.38f, 0.58f, -2.12f, 2.13f, -3.44f, 2.47f)
            curveToRelative(0.0f, -1.14f, 0.51f, -2.47f, 0.0f, -3.56f)
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
            moveTo(90.25f, 132.27f)
            arcTo(0.91f, 0.91f, 0.0f, false, true, 89.0f, 132.0f)
            arcToRelative(0.85f, 0.85f, 0.0f, false, false, -0.51f, -1.09f)
            curveToRelative(-2.19f, -0.41f, -3.69f, 2.53f, -5.7f, 1.0f)
            curveToRelative(0.46f, -0.64f, 0.81f, -0.93f, 0.87f, -1.68f)
            curveToRelative(-1.73f, -2.0f, -2.71f, 2.71f, -4.0f, 0.7f)
            curveToRelative(0.46f, -0.75f, 1.27f, -1.21f, 1.38f, -2.19f)
            curveToRelative(-0.86f, -0.34f, -1.55f, 0.63f, -2.47f, 0.69f)
            curveToRelative(-3.69f, -0.46f, -6.51f, 2.14f, -9.68f, 3.45f)
            curveToRelative(0.24f, -2.0f, 2.54f, -3.62f, 4.84f, -4.32f)
            curveTo(75.11f, 127.0f, 77.0f, 127.0f, 78.51f, 125.77f)
            curveToRelative(1.09f, -0.18f, 2.82f, -0.93f, 3.45f, 0.17f)
            curveToRelative(1.09f, -0.24f, 1.27f, -1.0f, 2.19f, -1.27f)
            curveToRelative(1.0f, -0.75f, 1.55f, -2.65f, 2.54f, -2.88f)
            arcToRelative(5.15f, 5.15f, 0.0f, false, false, 0.11f, 1.9f)
            curveToRelative(1.49f, -1.67f, 2.94f, -4.14f, 5.23f, -5.12f)
            curveToRelative(0.81f, -2.3f, 1.16f, -5.0f, 2.36f, -7.0f)
            curveToRelative(0.42f, -0.4f, 1.0f, -0.4f, 1.28f, -0.8f)
            arcToRelative(9.12f, 9.12f, 0.0f, false, true, 1.38f, 2.3f)
            curveToRelative(-1.67f, 3.74f, -2.6f, 8.06f, -5.71f, 10.94f)
            curveToRelative(0.0f, 0.23f, 0.3f, 0.41f, 0.41f, 0.57f)
            curveToRelative(1.9f, -0.86f, 2.94f, -2.24f, 4.84f, -3.0f)
            curveToRelative(0.21f, 0.7f, 0.75f, 0.16f, 1.0f, 0.52f)
            curveToRelative(-0.51f, 1.9f, -1.0f, 4.14f, -2.48f, 5.7f)
            curveToRelative(0.93f, 1.15f, 1.39f, -0.86f, 2.48f, -0.69f)
            curveToRelative(2.14f, -2.07f, 1.67f, 1.49f, 2.94f, 2.07f)
            curveToRelative(1.75f, 1.68f, 0.46f, 3.46f, -0.86f, 4.43f)
            curveToRelative(-0.29f, -0.63f, -1.16f, -2.0f, -2.36f, -1.26f)
            arcToRelative(3.33f, 3.33f, 0.0f, false, true, -2.47f, 0.12f)
            curveToRelative(-0.87f, -2.31f, -3.12f, -0.29f, -4.56f, -0.12f)
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
            moveTo(79.08f, 154.78f)
            curveToRelative(-0.75f, -0.11f, -0.92f, 0.75f, -1.38f, 1.1f)
            curveToRelative(-0.81f, -0.35f, -0.69f, -2.14f, -2.07f, -1.5f)
            curveToRelative(0.0f, -0.76f, -0.64f, -0.52f, -0.86f, -1.0f)
            curveToRelative(-0.87f, 0.0f, -1.16f, 1.27f, -2.2f, 0.86f)
            arcTo(4.05f, 4.05f, 0.0f, false, false, 72.0f, 152.6f)
            curveToRelative(-0.46f, 1.38f, -2.71f, 1.89f, -2.59f, 3.56f)
            curveToRelative(-1.15f, 0.75f, -2.07f, 2.42f, -3.45f, 2.0f)
            curveToRelative(-1.21f, -0.92f, -2.65f, -1.91f, -2.65f, -3.46f)
            curveToRelative(0.57f, -1.62f, -1.27f, -2.6f, 0.11f, -3.74f)
            curveToRelative(0.87f, 0.4f, 1.67f, -0.12f, 2.36f, -0.41f)
            curveToRelative(0.58f, 0.47f, -0.17f, 2.42f, 1.27f, 1.67f)
            curveToRelative(1.33f, -1.0f, 2.3f, -2.76f, 4.14f, -2.24f)
            curveToRelative(1.0f, 0.23f, 2.19f, 1.09f, 3.0f, 0.0f)
            curveToRelative(0.35f, -0.69f, 0.87f, -0.29f, 1.22f, -1.0f)
            curveToRelative(1.55f, -0.24f, 1.89f, 2.0f, 3.34f, 2.24f)
            curveToRelative(1.0f, -0.17f, 1.72f, -1.2f, 2.58f, -1.38f)
            curveToRelative(0.0f, 1.16f, 1.16f, 1.55f, 1.39f, 2.59f)
            curveToRelative(-0.17f, 3.46f, 0.87f, 6.05f, 1.26f, 9.27f)
            curveToRelative(-1.0f, 0.41f, -1.26f, -1.0f, -2.36f, -1.09f)
            curveToRelative(0.12f, -2.36f, -0.34f, -4.78f, -2.59f, -5.82f)
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
            moveTo(86.22f, 107.28f)
            curveToRelative(0.69f, -0.29f, 0.86f, -1.33f, 1.67f, -0.69f)
            curveToRelative(1.44f, -1.72f, 1.55f, -3.8f, 3.17f, -5.12f)
            curveToRelative(0.92f, -0.76f, 1.61f, 0.34f, 2.53f, -0.41f)
            curveToRelative(-1.0f, 3.74f, -4.09f, 6.22f, -4.72f, 10.08f)
            curveToRelative(-0.92f, 0.51f, -0.41f, -0.67f, -1.05f, -1.1f)
            arcToRelative(3.21f, 3.21f, 0.0f, false, false, -0.21f, -1.26f)
            curveToRelative(-0.87f, 1.0f, -2.42f, 1.85f, -3.29f, 3.16f)
            curveToRelative(-0.15f, -1.19f, -1.21f, -0.63f, -1.27f, 0.18f)
            curveToRelative(-0.34f, 0.63f, -0.68f, 1.84f, -1.49f, 1.79f)
            curveToRelative(-0.59f, -1.0f, 1.18f, -1.79f, -0.4f, -1.79f)
            curveToRelative(-0.87f, 2.82f, -2.25f, 4.89f, -4.84f, 6.0f)
            arcToRelative(5.74f, 5.74f, 0.0f, false, true, 0.92f, -2.76f)
            arcToRelative(89.54f, 89.54f, 0.0f, false, false, 7.37f, -13.93f)
            curveToRelative(0.53f, -0.11f, 0.86f, -1.56f, 1.21f, -0.41f)
            curveToRelative(-0.41f, 1.84f, -0.29f, 4.0f, -0.81f, 5.75f)
            arcToRelative(1.4f, 1.4f, 0.0f, false, false, 1.21f, 0.47f)
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
            moveTo(38.72f, 23.1f)
            arcToRelative(24.13f, 24.13f, 0.0f, false, false, 6.74f, 1.78f)
            curveToRelative(0.35f, 0.2f, 0.35f, 0.55f, 0.86f, 0.41f)
            curveToRelative(0.12f, -0.45f, 0.89f, -0.21f, 1.1f, -1.1f)
            curveToRelative(-1.86f, -0.45f, -1.9f, -2.0f, -2.77f, -3.16f)
            curveToRelative(2.13f, 1.32f, 3.74f, 3.22f, 6.33f, 4.0f)
            curveToRelative(0.24f, 0.92f, 1.5f, 0.69f, 2.08f, 1.21f)
            curveToRelative(-2.0f, 1.14f, -0.19f, 1.68f, 0.17f, 1.14f)
            curveToRelative(2.69f, 2.77f, 5.52f, 3.0f, 8.12f, 4.79f)
            curveToRelative(-0.18f, 0.46f, -0.53f, 0.18f, -0.92f, 0.86f)
            arcToRelative(28.46f, 28.46f, 0.0f, false, false, 7.71f, 4.66f)
            curveToRelative(-0.23f, 0.69f, -1.27f, 1.16f, -1.38f, 1.68f)
            curveToRelative(0.06f, 1.26f, 4.2f, 1.37f, 1.5f, 2.47f)
            curveToRelative(-2.0f, 0.17f, -4.84f, 0.51f, -6.45f, -0.8f)
            curveToRelative(-0.17f, -0.18f, -0.52f, 0.0f, -0.69f, 0.11f)
            curveToRelative(0.4f, 1.09f, 1.86f, 1.63f, 3.0f, 1.85f)
            curveToRelative(2.31f, 0.1f, 3.8f, -0.81f, 6.0f, -0.87f)
            curveToRelative(1.15f, 0.52f, 1.9f, 1.78f, 3.28f, 2.07f)
            curveToRelative(0.41f, 0.12f, -0.51f, 0.29f, -0.28f, 0.69f)
            arcToRelative(12.68f, 12.68f, 0.0f, false, false, 5.53f, 4.44f)
            arcToRelative(0.66f, 0.66f, 0.0f, false, true, -0.81f, 0.57f)
            curveToRelative(-0.12f, 0.0f, -0.35f, -0.06f, -0.41f, 0.12f)
            curveToRelative(1.61f, 1.67f, 4.2f, 2.81f, 6.0f, 3.85f)
            curveToRelative(0.0f, 0.75f, -0.75f, 0.69f, -1.21f, 0.87f)
            reflectiveCurveToRelative(-0.92f, -0.52f, -1.09f, 0.12f)
            curveToRelative(-3.81f, 0.57f, -6.23f, -1.16f, -9.16f, -3.0f)
            curveToRelative(-0.39f, -0.14f, -0.63f, -0.12f, -0.81f, 0.16f)
            curveToRelative(0.0f, 1.0f, 1.85f, 0.7f, 1.5f, 1.9f)
            curveToRelative(-2.42f, 0.69f, -4.15f, -1.67f, -6.0f, -1.9f)
            arcToRelative(4.38f, 4.38f, 0.0f, false, false, 2.07f, 2.31f)
            curveToRelative(0.75f, 1.51f, 0.3f, 2.46f, -0.18f, 2.94f)
            curveToRelative(-1.14f, -0.58f, -2.53f, -0.52f, -3.45f, -1.67f)
            curveToRelative(-0.46f, 0.4f, 0.06f, 1.09f, -0.11f, 1.67f)
            curveToRelative(-2.3f, -1.27f, -5.0f, -1.91f, -6.51f, -4.0f)
            curveToRelative(-0.06f, -0.46f, 0.0f, -1.0f, 0.58f, -1.0f)
            reflectiveCurveToRelative(1.21f, 0.3f, 1.38f, -0.51f)
            curveToRelative(0.17f, -0.41f, -0.29f, -0.41f, -0.46f, -0.58f)
            curveToRelative(-0.35f, 0.0f, -0.46f, -1.72f, -1.1f, -0.8f)
            arcToRelative(15.86f, 15.86f, 0.0f, false, true, -4.95f, -3.17f)
            arcToRelative(4.28f, 4.28f, 0.0f, false, false, 1.9f, -3.63f)
            curveToRelative(-0.75f, -0.81f, -1.61f, 0.93f, -2.76f, 0.18f)
            curveToRelative(1.38f, -1.0f, 3.28f, -2.2f, 3.74f, -3.92f)
            curveToRelative(-2.18f, 0.11f, -4.2f, -1.09f, -6.0f, -2.19f)
            curveToRelative(0.18f, -1.21f, 2.0f, -2.3f, 1.1f, -3.74f)
            arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 0.4f)
            arcToRelative(6.31f, 6.31f, 0.0f, false, true, -3.45f, -0.11f)
            curveToRelative(1.15f, -0.86f, 3.0f, -2.2f, 2.87f, -3.87f)
            curveToRelative(-0.74f, -0.22f, -1.37f, 0.59f, -2.18f, 0.7f)
            curveToRelative(-3.51f, -1.84f, -7.83f, -2.65f, -10.48f, -5.53f)
            curveToRelative(0.34f, -0.92f, 0.34f, -1.72f, 1.09f, -2.36f)
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
            moveTo(32.91f, 9.57f)
            curveToRelative(1.0f, 1.84f, 2.59f, 3.0f, 3.33f, 5.13f)
            curveToRelative(-0.8f, 0.39f, -2.06f, 0.39f, -2.36f, 1.61f)
            reflectiveCurveToRelative(1.33f, 1.67f, 1.39f, 2.93f)
            curveToRelative(-0.23f, 0.17f, -0.52f, 0.0f, -0.7f, 0.29f)
            curveToRelative(0.18f, 1.56f, 3.34f, 1.56f, 2.77f, 3.86f)
            curveToRelative(-0.69f, 1.0f, -1.8f, 0.29f, -2.24f, -0.29f)
            curveToRelative(-0.24f, -0.52f, -0.69f, -1.26f, -1.39f, -1.0f)
            curveToRelative(0.17f, 2.19f, 2.76f, 3.45f, 4.14f, 5.12f)
            curveToRelative(0.75f, 0.69f, -0.74f, 0.41f, -0.91f, 0.41f)
            curveToRelative(-1.21f, -0.46f, -3.4f, 0.52f, -3.45f, -1.38f)
            arcToRelative(1.06f, 1.06f, 0.0f, false, true, -1.16f, 0.0f)
            curveToRelative(-1.73f, -2.13f, -4.84f, -4.55f, -3.0f, -7.72f)
            verticalLineToRelative(-0.69f)
            curveToRelative(2.07f, -2.24f, 2.76f, -5.41f, 3.57f, -8.29f)
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
            moveTo(21.85f, 11.0f)
            curveToRelative(2.36f, 0.23f, 5.82f, 0.8f, 7.2f, 3.16f)
            curveToRelative(0.23f, 0.81f, 1.32f, 2.2f, 0.11f, 3.06f)
            arcToRelative(5.39f, 5.39f, 0.0f, false, true, -2.76f, 0.4f)
            curveToRelative(-0.46f, -1.84f, -2.88f, -0.28f, -3.06f, -2.18f)
            curveToRelative(0.59f, -0.87f, 0.35f, -2.0f, 1.0f, -2.77f)
            curveToRelative(-0.64f, -0.52f, -1.0f, 0.35f, -1.67f, 0.23f)
            curveToRelative(-0.46f, 1.16f, -1.21f, 0.75f, -2.07f, 0.87f)
            curveToRelative(-2.08f, 0.57f, -4.21f, 1.9f, -6.22f, 0.29f)
            arcToRelative(24.2f, 24.2f, 0.0f, false, false, 5.12f, -2.54f)
            curveToRelative(1.0f, 0.87f, 1.44f, -0.35f, 2.36f, -0.52f)
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
            moveTo(16.32f, 26.44f)
            curveToRelative(0.64f, 0.86f, -0.23f, 2.65f, 1.27f, 2.47f)
            curveToRelative(0.0f, 0.47f, 0.06f, 1.0f, -0.46f, 1.22f)
            curveToRelative(-0.86f, 0.0f, -1.0f, -1.0f, -1.49f, -1.5f)
            curveToRelative(-0.81f, -0.23f, -2.54f, 1.27f, -1.68f, -0.7f)
            curveToRelative(0.58f, -1.0f, 0.41f, -2.76f, 2.0f, -3.05f)
            curveToRelative(0.11f, 0.52f, -0.35f, 1.27f, 0.39f, 1.56f)
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
            moveTo(12.06f, 6.92f)
            curveToRelative(0.92f, -0.81f, 2.08f, 1.44f, 2.89f, 2.0f)
            curveToRelative(0.34f, 1.32f, 1.61f, 1.84f, 1.67f, 3.28f)
            arcTo(8.45f, 8.45f, 0.0f, false, true, 14.0f, 13.31f)
            curveToRelative(-0.63f, -2.3f, -0.23f, -4.78f, -1.9f, -6.39f)
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
            moveTo(4.7f, 21.32f)
            curveToRelative(0.69f, -0.53f, 2.24f, -0.18f, 2.07f, -1.56f)
            curveToRelative(-1.38f, -0.81f, -1.38f, -1.0f, 0.17f, -1.5f)
            curveToRelative(0.52f, -0.12f, 1.15f, 0.23f, 1.5f, -0.28f)
            curveToRelative(0.0f, -0.81f, -0.86f, -1.0f, -1.1f, -1.67f)
            curveToRelative(1.16f, -0.18f, 2.6f, -0.75f, 3.86f, -0.53f)
            curveToRelative(0.86f, -0.74f, -0.34f, -1.49f, -0.29f, -2.06f)
            curveToRelative(0.87f, 0.0f, 1.85f, 1.32f, 2.54f, 0.29f)
            curveToRelative(0.34f, 0.63f, 0.87f, 0.84f, 1.09f, 1.89f)
            curveToRelative(-1.0f, -0.06f, -2.13f, 0.06f, -2.48f, 0.87f)
            curveToRelative(0.58f, 1.27f, -0.63f, 1.72f, -1.67f, 1.78f)
            reflectiveCurveToRelative(-2.58f, -0.17f, -2.93f, 1.21f)
            curveToRelative(-0.12f, 1.73f, 0.81f, 3.74f, -1.1f, 4.32f)
            arcTo(0.88f, 0.88f, 0.0f, false, true, 6.0f, 22.81f)
            curveToRelative(-0.11f, -0.69f, -1.0f, -0.86f, -1.26f, -1.49f)
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
            moveTo(12.94f, 35.25f)
            curveToRelative(-0.4f, 0.0f, -0.48f, -0.4f, -0.56f, -0.68f)
            curveToRelative(-0.09f, -1.14f, 1.4f, -0.69f, 1.45f, 0.2f)
            curveToRelative(0.0f, 0.56f, -0.41f, 0.56f, -0.89f, 0.48f)
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
            moveTo(14.83f, 34.85f)
            curveToRelative(0.89f, 0.69f, 1.32f, 2.53f, 2.59f, 3.17f)
            curveToRelative(-0.86f, 0.92f, -2.12f, 1.16f, -3.75f, 1.0f)
            curveToRelative(1.0f, -1.0f, 1.0f, -2.82f, 1.16f, -4.14f)
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
            moveTo(11.27f, 37.76f)
            curveToRelative(-0.42f, 0.07f, -0.74f, -0.33f, -0.87f, -0.59f)
            arcToRelative(4.08f, 4.08f, 0.0f, false, true, 0.28f, -2.44f)
            curveToRelative(0.29f, -0.24f, 0.35f, -0.13f, 0.34f, 0.13f)
            arcToRelative(4.88f, 4.88f, 0.0f, false, false, 0.25f, 2.9f)
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
            moveTo(3.89f, 31.68f)
            curveToRelative(1.33f, -1.09f, 3.57f, -2.25f, 4.26f, -4.14f)
            curveToRelative(1.0f, -0.18f, 0.4f, 1.0f, 1.15f, 1.37f)
            curveToRelative(0.4f, 0.69f, 1.84f, 0.69f, 1.09f, 1.91f)
            curveToRelative(0.0f, 1.67f, -1.78f, 0.57f, -2.47f, 1.26f)
            curveToRelative(2.47f, 0.81f, 1.5f, 3.74f, 1.9f, 5.41f)
            curveTo(7.75f, 38.59f, 7.0f, 43.94f, 4.0f, 41.35f)
            curveToRelative(-0.51f, -0.11f, -1.26f, 0.23f, -1.61f, -0.28f)
            curveToRelative(1.5f, -2.71f, 4.0f, -6.51f, 1.5f, -9.39f)
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
            moveTo(1.52f, 50.85f)
            curveTo(0.9f, 49.42f, -0.14f, 47.11f, 0.83f, 45.21f)
            curveToRelative(0.3f, -1.0f, 1.91f, -2.0f, 2.0f, -0.12f)
            arcToRelative(18.44f, 18.44f, 0.0f, false, false, 1.49f, 7.83f)
            curveTo(2.66f, 53.0f, 2.12f, 52.0f, 1.52f, 50.85f)
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
            moveTo(6.38f, 56.72f)
            curveToRelative(-2.47f, -1.42f, -0.07f, -1.71f, 0.79f, -0.85f)
            curveToRelative(1.58f, 0.11f, 3.0f, 1.71f, 5.12f, 1.08f)
            curveToRelative(0.31f, 0.37f, 0.52f, 0.87f, 0.87f, 1.27f)
            arcToRelative(13.25f, 13.25f, 0.0f, false, true, -6.78f, -1.5f)
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
            moveTo(27.66f, 69.47f)
            curveToRelative(-0.92f, -1.21f, 0.87f, -2.72f, 0.81f, -4.11f)
            curveToRelative(0.18f, -0.4f, -0.35f, -1.43f, 0.41f, -1.21f)
            arcToRelative(2.62f, 2.62f, 0.0f, false, false, 1.26f, 1.67f)
            curveToRelative(1.1f, -1.73f, -0.29f, -3.45f, -0.4f, -5.12f)
            arcToRelative(13.1f, 13.1f, 0.0f, false, false, -4.0f, -3.06f)
            curveToRelative(-3.86f, -2.52f, -7.2f, 2.48f, -11.17f, 1.0f)
            curveToRelative(-0.06f, -0.22f, -0.34f, -0.68f, -0.69f, -0.57f)
            arcToRelative(6.09f, 6.09f, 0.0f, false, true, -1.09f, -1.79f)
            curveToRelative(-4.0f, -0.28f, -7.31f, -2.0f, -8.76f, -5.81f)
            arcToRelative(17.23f, 17.23f, 0.0f, false, true, -0.4f, -5.12f)
            arcToRelative(1.78f, 1.78f, 0.0f, false, true, 2.65f, -1.61f)
            curveToRelative(1.38f, 0.75f, 1.78f, 1.72f, 2.48f, 3.0f)
            curveToRelative(0.46f, -0.24f, 0.28f, -1.1f, 0.0f, -1.5f)
            curveToRelative(-0.06f, -0.05f, -0.18f, -0.12f, -0.12f, -0.29f)
            curveToRelative(1.84f, 1.0f, 2.59f, 3.57f, 4.0f, 5.13f)
            curveToRelative(0.51f, -0.92f, -0.41f, -1.22f, -0.69f, -2.0f)
            arcToRelative(10.16f, 10.16f, 0.0f, false, false, -5.65f, -5.24f)
            arcToRelative(28.75f, 28.75f, 0.0f, false, true, 4.0f, -4.66f)
            curveToRelative(1.68f, 1.21f, 3.92f, 2.42f, 6.22f, 1.49f)
            arcToRelative(4.94f, 4.94f, 0.0f, false, false, 2.07f, -1.49f)
            curveToRelative(-1.72f, -0.81f, -2.0f, -3.12f, -2.87f, -4.32f)
            curveToRelative(-0.58f, -0.92f, -1.44f, -1.0f, -2.19f, -1.67f)
            arcTo(5.78f, 5.78f, 0.0f, false, true, 15.0f, 30.0f)
            curveToRelative(2.18f, -0.11f, 1.49f, 2.3f, 2.18f, 3.57f)
            curveToRelative(0.63f, 1.73f, 1.38f, 3.45f, 3.34f, 3.91f)
            curveToRelative(0.4f, -0.75f, 0.75f, -1.2f, 1.67f, -1.26f)
            curveToRelative(0.46f, 0.12f, 1.0f, 0.29f, 1.2f, 0.8f)
            curveToRelative(0.18f, 0.93f, 0.65f, 2.3f, 1.85f, 2.54f)
            curveToRelative(6.91f, -1.44f, 6.28f, 8.52f, 13.65f, 6.9f)
            curveToRelative(0.74f, 0.3f, 1.44f, 0.41f, 1.55f, 1.22f)
            curveToRelative(0.75f, 0.92f, 1.79f, 1.09f, 2.59f, 2.0f)
            curveToRelative(0.52f, -0.17f, 1.0f, -0.11f, 1.27f, 0.41f)
            arcToRelative(18.94f, 18.94f, 0.0f, false, true, -4.73f, -0.41f)
            curveToRelative(-0.45f, 0.86f, 1.1f, 1.39f, 1.68f, 2.08f)
            arcToRelative(16.11f, 16.11f, 0.0f, false, true, 3.0f, 1.78f)
            curveToRelative(-1.9f, 0.29f, -4.0f, 0.0f, -5.81f, 0.29f)
            curveToRelative(0.0f, 2.0f, 2.0f, 2.53f, 2.18f, 4.43f)
            curveToRelative(-1.0f, -0.28f, -2.18f, -1.21f, -3.16f, -0.86f)
            arcToRelative(11.51f, 11.51f, 0.0f, false, true, 1.26f, 4.15f)
            curveToRelative(-1.09f, 0.0f, -3.28f, -1.85f, -3.17f, 0.0f)
            curveToRelative(1.61f, 3.0f, 2.25f, 7.19f, 0.53f, 10.24f)
            curveTo(35.9f, 68.87f, 34.46f, 66.51f, 33.0f, 64.0f)
            curveToRelative(-0.63f, -0.23f, -0.57f, 0.58f, -0.4f, 0.86f)
            curveToRelative(1.38f, 1.22f, 0.92f, 3.06f, 0.87f, 4.84f)
            curveToRelative(-0.64f, 0.64f, -0.41f, 1.9f, -1.28f, 2.59f)
            curveToRelative(-0.06f, -0.12f, -0.51f, -0.52f, -0.11f, -0.81f)
            arcTo(5.55f, 5.55f, 0.0f, false, false, 31.0f, 69.0f)
            curveToRelative(-0.69f, 0.74f, 0.52f, 2.0f, -0.12f, 2.47f)
            curveToRelative(-0.57f, -1.0f, -1.09f, 0.81f, -1.67f, 1.28f)
            reflectiveCurveToRelative(-0.34f, -0.47f, -0.8f, -0.69f)
            arcToRelative(2.28f, 2.28f, 0.0f, false, true, -0.7f, -2.58f)
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
            moveTo(36.77f, 182.82f)
            curveToRelative(-1.56f, -0.4f, 0.39f, -4.0f, -1.79f, -2.87f)
            arcToRelative(3.62f, 3.62f, 0.0f, false, false, -0.57f, 2.64f)
            curveToRelative(1.44f, 0.69f, -0.06f, 1.0f, -0.7f, 0.69f)
            curveToRelative(-2.88f, -1.0f, -3.35f, -3.09f, -2.33f, -5.09f)
            curveToRelative(1.43f, -2.78f, 5.32f, -3.37f, 8.0f, -4.87f)
            curveToRelative(2.36f, -1.27f, 5.87f, 0.18f, 6.22f, -3.63f)
            curveToRelative(0.69f, -6.39f, -0.86f, -13.18f, -0.69f, -20.0f)
            curveToRelative(-1.0f, -11.09f, 1.61f, -26.14f, -2.0f, -38.0f)
            curveToRelative(0.52f, -0.75f, -0.17f, -1.72f, -0.51f, -2.47f)
            curveToRelative(0.69f, -2.37f, -3.4f, -1.67f, -1.67f, -4.14f)
            curveToRelative(-0.58f, -1.67f, -2.6f, -1.9f, -2.25f, -4.15f)
            curveToRelative(-0.92f, -2.08f, -4.2f, -0.8f, -4.14f, -3.46f)
            curveToRelative(-1.1f, -1.72f, -3.71f, -1.9f, -2.95f, -4.48f)
            curveToRelative(-1.0f, -1.9f, -4.54f, -2.89f, -3.68f, -5.31f)
            curveToRelative(0.52f, -0.86f, 2.0f, -1.61f, 0.87f, -2.76f)
            curveToRelative(-0.53f, -0.58f, -1.49f, -0.52f, -1.67f, -1.27f)
            arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.67f, -9.26f)
            curveToRelative(0.28f, -0.87f, 2.0f, -1.44f, 2.59f, -2.48f)
            curveToRelative(0.75f, 0.4f, -0.35f, 1.26f, 0.4f, 1.79f)
            arcToRelative(9.21f, 9.21f, 0.0f, false, false, 2.65f, -5.94f)
            curveToRelative(0.87f, 1.91f, 1.67f, 4.09f, 0.81f, 6.22f)
            curveToRelative(0.63f, 0.35f, 1.0f, -0.34f, 1.14f, -0.81f)
            curveToRelative(2.08f, -2.81f, 2.0f, -8.29f, 0.12f, -11.34f)
            curveToRelative(0.75f, -0.28f, 1.67f, 0.47f, 2.36f, 0.69f)
            curveToRelative(0.35f, 0.35f, 0.41f, 1.1f, 1.0f, 1.1f)
            curveToRelative(0.24f, -1.21f, -0.75f, -2.19f, -0.45f, -3.57f)
            arcToRelative(2.19f, 2.19f, 0.0f, false, true, -0.41f, -1.56f)
            curveToRelative(1.38f, 0.0f, 2.41f, 1.0f, 3.34f, 1.85f)
            arcToRelative(2.38f, 2.38f, 0.0f, false, false, -0.3f, -2.0f)
            curveToRelative(-0.28f, -0.92f, -3.68f, -4.09f, -0.57f, -3.17f)
            curveToRelative(2.08f, 0.17f, 3.23f, -0.75f, 5.13f, -1.38f)
            curveToRelative(-0.81f, -1.15f, -2.42f, -1.09f, -3.57f, -2.25f)
            curveToRelative(0.52f, -0.74f, 1.9f, -0.17f, 3.05f, -0.51f)
            curveToRelative(0.23f, -0.18f, 0.0f, -0.53f, 0.0f, -0.69f)
            arcToRelative(19.91f, 19.91f, 0.0f, false, true, -5.7f, -5.0f)
            curveToRelative(0.15f, -0.29f, 0.45f, -0.29f, 0.79f, -0.22f)
            curveToRelative(1.16f, -0.12f, 2.15f, 0.91f, 2.55f, 1.08f)
            curveToRelative(0.46f, -1.38f, -1.21f, -2.14f, -1.68f, -3.46f)
            verticalLineToRelative(-0.4f)
            curveToRelative(1.51f, -0.46f, 3.12f, 0.17f, 4.56f, 0.0f)
            curveToRelative(0.74f, 0.0f, 0.57f, -0.57f, 0.28f, -0.86f)
            curveToRelative(-1.95f, -0.29f, -4.0f, 0.22f, -5.52f, -1.09f)
            arcToRelative(22.29f, 22.29f, 0.0f, false, true, -4.55f, -5.53f)
            curveToRelative(-0.26f, -1.0f, 0.43f, -1.61f, 1.15f, -2.0f)
            curveToRelative(0.22f, -0.13f, 1.26f, -0.1f, 1.21f, -0.73f)
            curveToRelative(-0.46f, -1.09f, -2.0f, -0.17f, -2.77f, -0.81f)
            arcToRelative(3.85f, 3.85f, 0.0f, false, true, -1.55f, -2.36f)
            curveTo(36.0f, 27.82f, 38.0f, 29.9f, 39.0f, 28.22f)
            curveToRelative(3.28f, 1.1f, 6.27f, 4.09f, 9.91f, 3.29f)
            arcToRelative(6.42f, 6.42f, 0.0f, false, true, -3.69f, 1.95f)
            curveToRelative(-0.29f, 0.12f, -0.52f, -0.28f, -0.69f, 0.0f)
            curveToRelative(0.69f, 1.45f, 2.59f, 1.21f, 3.85f, 1.78f)
            curveToRelative(0.64f, 0.3f, 3.46f, -0.68f, 1.79f, 1.0f)
            curveToRelative(-0.4f, 0.46f, -1.67f, 0.29f, -1.26f, 1.38f)
            arcToRelative(21.67f, 21.67f, 0.0f, false, false, 6.39f, 3.16f)
            curveToRelative(-0.93f, 2.14f, -3.81f, 1.73f, -5.71f, 2.0f)
            curveToRelative(0.81f, 1.56f, 2.77f, 2.13f, 4.61f, 2.08f)
            curveToRelative(0.06f, 1.32f, -2.65f, 0.63f, -1.67f, 2.19f)
            arcToRelative(17.0f, 17.0f, 0.0f, false, false, 5.64f, 3.85f)
            curveToRelative(1.0f, 0.93f, -0.63f, 0.87f, -1.0f, 0.87f)
            curveToRelative(-1.26f, 0.17f, -1.55f, -1.56f, -2.87f, -0.87f)
            curveToRelative(-1.33f, 0.52f, -1.16f, 2.36f, -1.0f, 3.63f)
            arcTo(11.38f, 11.38f, 0.0f, false, false, 57.0f, 59.84f)
            curveToRelative(-1.91f, -0.58f, -4.0f, -0.87f, -5.7f, -1.9f)
            curveToRelative(-1.16f, 0.68f, 0.4f, 1.49f, 0.4f, 2.47f)
            curveToRelative(-0.29f, 0.63f, 0.8f, 3.46f, -0.93f, 2.48f)
            curveToRelative(-1.2f, -1.16f, -2.87f, -1.1f, -4.31f, -1.67f)
            curveToRelative(-0.75f, 0.86f, 1.0f, 0.8f, 1.0f, 1.55f)
            curveToRelative(0.63f, 1.21f, 0.34f, 2.83f, 0.4f, 4.26f)
            curveToRelative(-1.0f, 0.0f, -1.62f, -1.38f, -2.59f, -2.07f)
            curveToRelative(-0.87f, -0.46f, -1.79f, -1.33f, -2.94f, -1.38f)
            arcToRelative(4.32f, 4.32f, 0.0f, false, true, -0.11f, 3.74f)
            arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.07f, -2.65f)
            curveToRelative(-0.7f, 0.29f, 0.11f, 0.58f, -0.17f, 1.0f)
            arcToRelative(11.17f, 11.17f, 0.0f, false, false, -0.53f, 2.94f)
            curveToRelative(1.33f, -0.12f, 0.35f, -4.21f, 1.9f, -1.84f)
            curveToRelative(0.57f, 1.09f, 0.12f, 2.07f, 0.46f, 3.22f)
            curveToRelative(0.11f, 0.0f, 0.17f, -0.12f, 0.23f, -0.17f)
            curveToRelative(0.53f, -1.68f, 1.22f, -3.34f, 1.56f, -5.0f)
            curveToRelative(1.67f, 1.1f, 3.63f, 2.08f, 4.0f, 4.0f)
            curveToRelative(1.21f, -0.35f, 1.15f, -1.9f, 1.67f, -2.88f)
            arcToRelative(4.16f, 4.16f, 0.0f, false, false, -0.81f, -3.17f)
            arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.29f, 1.9f)
            curveToRelative(0.74f, -0.23f, 0.86f, -1.0f, 1.0f, -1.9f)
            arcToRelative(10.2f, 10.2f, 0.0f, false, true, 0.18f, -2.65f)
            curveToRelative(1.44f, -0.06f, 2.76f, 0.69f, 4.15f, 0.41f)
            arcToRelative(1.44f, 1.44f, 0.0f, false, false, 1.2f, 0.46f)
            curveToRelative(1.22f, -1.62f, -0.92f, -1.68f, -1.38f, -2.65f)
            arcToRelative(7.23f, 7.23f, 0.0f, false, true, -2.47f, -5.24f)
            curveToRelative(0.39f, -0.69f, 1.37f, -0.46f, 2.06f, -0.69f)
            curveToRelative(1.85f, 1.09f, 2.0f, 3.46f, 4.44f, 4.15f)
            curveToRelative(1.73f, 0.8f, 3.52f, 1.73f, 5.24f, 2.36f)
            curveToRelative(0.86f, -1.16f, 3.8f, -0.47f, 3.86f, -2.25f)
            curveToRelative(0.17f, -0.64f, -0.29f, -1.0f, -0.29f, -1.5f)
            curveToRelative(2.36f, 2.19f, 3.74f, -3.28f, 5.82f, 0.11f)
            curveToRelative(1.73f, 0.18f, 3.45f, 1.56f, 5.12f, 0.41f)
            curveToRelative(0.8f, 0.0f, 1.21f, 0.46f, 1.67f, 1.15f)
            curveToRelative(-0.06f, 1.21f, 1.0f, 1.78f, 0.4f, 3.0f)
            curveToRelative(-0.63f, 0.63f, -1.32f, 1.67f, -2.36f, 0.86f)
            arcToRelative(10.66f, 10.66f, 0.0f, false, false, -2.76f, -1.39f)
            curveToRelative(-0.87f, 1.34f, 1.0f, 1.0f, 1.38f, 1.68f)
            curveToRelative(0.92f, 2.0f, 2.13f, 3.28f, 2.25f, 5.64f)
            curveToRelative(0.75f, 1.09f, -0.35f, 2.13f, -0.18f, 3.17f)
            arcToRelative(13.35f, 13.35f, 0.0f, false, false, -3.45f, -3.46f)
            arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.52f, 0.29f)
            curveToRelative(1.73f, 2.19f, 3.0f, 4.78f, 2.07f, 7.72f)
            arcToRelative(15.0f, 15.0f, 0.0f, false, true, -1.55f, 2.53f)
            curveToRelative(-0.92f, -0.35f, -1.26f, -1.5f, -2.19f, -1.56f)
            curveToRelative(-0.17f, 1.56f, 2.0f, 2.88f, 0.81f, 4.73f)
            curveToRelative(-0.69f, 0.51f, -0.18f, 2.07f, -1.38f, 1.89f)
            curveToRelative(-0.75f, -0.51f, -0.7f, -2.06f, -1.67f, -1.89f)
            curveToRelative(-0.41f, 0.81f, 0.57f, 1.44f, 0.46f, 2.36f)
            curveToRelative(-0.64f, 1.72f, -1.33f, 3.8f, -3.35f, 4.25f)
            curveToRelative(-1.26f, 0.59f, -4.43f, -2.0f, -3.56f, 1.27f)
            curveToRelative(-0.11f, 0.87f, -0.87f, 1.27f, -1.56f, 1.62f)
            curveToRelative(-1.09f, 0.28f, -2.94f, -2.3f, -2.88f, -0.24f)
            curveToRelative(0.66f, 3.09f, -1.07f, 5.72f, -1.54f, 9.16f)
            curveToRelative(0.0f, 0.12f, -0.14f, 0.12f, -0.14f, 0.0f)
            curveToRelative(-0.15f, -3.1f, -1.24f, -5.7f, -3.33f, -7.0f)
            curveToRelative(-0.28f, 1.16f, 0.7f, 2.48f, -0.22f, 3.75f)
            curveToRelative(-0.59f, -1.56f, -0.47f, -3.75f, -1.85f, -5.0f)
            curveToRelative(-1.0f, 1.0f, 0.69f, 1.84f, 0.69f, 2.93f)
            curveToRelative(0.0f, 2.0f, 0.63f, 3.57f, 0.18f, 5.36f)
            curveToRelative(0.17f, 0.12f, 0.61f, 0.71f, 0.69f, 0.28f)
            curveToRelative(-0.41f, -2.24f, 1.43f, -3.56f, 1.37f, -5.64f)
            curveToRelative(1.34f, 2.36f, 2.66f, 5.48f, 1.5f, 8.41f)
            curveToRelative(0.35f, 0.87f, 0.87f, 0.06f, 1.0f, -0.41f)
            curveToRelative(1.33f, -3.44f, 1.73f, -7.25f, 2.48f, -10.93f)
            arcTo(4.24f, 4.24f, 0.0f, false, false, 66.0f, 90.12f)
            arcToRelative(2.71f, 2.71f, 0.0f, false, false, 1.38f, -2.19f)
            arcTo(5.38f, 5.38f, 0.0f, false, false, 72.0f, 86.78f)
            curveToRelative(1.21f, -0.8f, 1.61f, -2.07f, 2.07f, -3.45f)
            curveToRelative(0.86f, -0.23f, 1.67f, 0.0f, 2.47f, -0.7f)
            curveToRelative(0.93f, -2.93f, 4.9f, -2.07f, 6.69f, -4.37f)
            curveToRelative(0.23f, 2.94f, -2.77f, 4.6f, -4.15f, 6.34f)
            curveToRelative(-0.11f, 1.15f, 1.61f, 1.49f, 0.81f, 2.87f)
            curveToRelative(-1.21f, 1.45f, -3.0f, 3.51f, -5.0f, 3.75f)
            curveToRelative(-2.0f, 2.0f, -4.42f, 3.16f, -5.69f, 5.7f)
            horizontalLineTo(69.0f)
            curveToRelative(-0.17f, -1.73f, 1.0f, -3.23f, 0.18f, -4.84f)
            horizontalLineToRelative(-0.41f)
            curveToRelative(-0.63f, 3.45f, -2.07f, 6.51f, -3.0f, 9.79f)
            curveToRelative(-0.75f, -0.35f, 0.34f, -1.16f, -0.41f, -1.67f)
            curveToRelative(-1.78f, 0.4f, -2.76f, 2.94f, -3.91f, 4.14f)
            curveToRelative(-1.84f, 6.8f, -5.59f, 12.67f, -5.53f, 20.0f)
            curveToRelative(0.46f, 0.45f, 0.75f, 0.74f, 1.16f, 1.08f)
            curveToRelative(0.16f, 2.31f, 0.7f, 4.78f, -0.18f, 6.68f)
            curveToRelative(-0.46f, 0.18f, -0.29f, 0.87f, -0.52f, 1.21f)
            arcToRelative(8.44f, 8.44f, 0.0f, false, false, -3.74f, 5.42f)
            curveToRelative(-0.17f, 1.14f, -2.07f, 1.73f, -0.86f, 2.87f)
            curveToRelative(0.74f, -0.12f, 1.21f, -1.32f, 2.07f, -0.69f)
            curveToRelative(-0.58f, 1.27f, 1.44f, 1.79f, 1.26f, 3.0f)
            curveToRelative(-3.68f, 3.7f, -6.9f, 8.41f, -7.88f, 13.82f)
            curveToRelative(0.69f, 0.87f, -0.29f, 2.19f, 0.86f, 2.66f)
            arcToRelative(4.87f, 4.87f, 0.0f, false, false, 0.69f, 4.0f)
            curveToRelative(1.21f, -0.87f, 0.46f, 1.72f, 1.21f, 2.36f)
            curveToRelative(0.64f, 1.61f, 1.9f, 3.1f, 1.39f, 5.0f)
            curveToRelative(-0.69f, 0.75f, -1.22f, 1.89f, -2.2f, 1.84f)
            curveToRelative(-0.22f, -0.34f, -0.75f, -0.64f, -0.86f, 0.0f)
            curveToRelative(1.56f, 0.58f, 1.21f, 2.82f, 0.86f, 4.14f)
            curveToRelative(-1.61f, 1.62f, -3.11f, 3.17f, -3.45f, 5.65f)
            curveToRelative(-2.88f, -0.4f, -6.11f, 0.86f, -8.86f, -0.58f)
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
            moveTo(83.23f, 195.26f)
            curveToRelative(-2.0f, 1.28f, -12.59f, -0.38f, -23.38f, -4.0f)
            curveToRelative(-0.71f, -1.55f, -2.92f, 0.0f, -3.34f, -1.79f)
            curveToRelative(-1.09f, -0.05f, -0.92f, -2.19f, -2.48f, -1.38f)
            curveToRelative(-0.17f, 0.34f, -0.8f, 0.8f, -0.51f, 1.5f)
            curveToRelative(-1.55f, 0.57f, -3.74f, 1.44f, -5.13f, 0.0f)
            curveToRelative(-1.2f, -1.61f, -2.24f, -3.86f, -2.0f, -5.82f)
            curveToRelative(-0.06f, -4.26f, 3.8f, -6.16f, 6.9f, -8.0f)
            curveToRelative(1.44f, 1.79f, 4.72f, 0.75f, 5.71f, 3.17f)
            arcToRelative(27.5f, 27.5f, 0.0f, false, true, 4.0f, 2.36f)
            curveToRelative(0.46f, -0.12f, 0.74f, 0.11f, 0.86f, 0.57f)
            arcToRelative(1.86f, 1.86f, 0.0f, false, false, 0.92f, 2.19f)
            curveToRelative(0.93f, 1.0f, 3.0f, -0.69f, 2.77f, 1.39f)
            curveToRelative(0.63f, 1.0f, 2.19f, 0.22f, 2.53f, 1.26f)
            curveToRelative(1.09f, 1.38f, 2.65f, 0.23f, 4.26f, 0.41f)
            curveToRelative(-0.23f, 1.31f, 1.32f, 1.31f, 2.07f, 1.77f)
            curveToRelative(0.46f, 0.12f, 1.1f, -0.22f, 1.39f, 0.3f)
            arcToRelative(1.27f, 1.27f, 0.0f, false, false, -0.29f, 2.07f)
            curveToRelative(1.44f, 2.07f, 4.49f, 1.84f, 6.5f, 2.58f)
            curveToRelative(0.29f, 0.7f, -0.39f, 1.16f, -0.8f, 1.39f)
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
            moveTo(91.64f, 194.46f)
            curveToRelative(-1.0f, -0.12f, -3.0f, 0.34f, -4.15f, -0.41f)
            curveToRelative(-0.12f, -0.29f, 0.28f, -0.51f, 0.0f, -0.69f)
            curveToRelative(-0.47f, 0.51f, -0.86f, 0.29f, -1.38f, 0.12f)
            curveToRelative(-0.7f, -0.87f, -0.18f, -2.0f, -1.1f, -2.77f)
            curveToRelative(-0.92f, 1.33f, -2.93f, 1.44f, -4.55f, 1.1f)
            curveToRelative(-1.0f, 0.12f, -1.38f, -0.64f, -2.07f, -0.92f)
            curveToRelative(-0.11f, -0.46f, 0.41f, -0.7f, 0.69f, -0.87f)
            curveToRelative(0.58f, -0.4f, 0.92f, 0.87f, 1.38f, 0.0f)
            curveToRelative(-0.4f, -2.18f, -2.93f, -1.49f, -4.43f, -2.18f)
            curveToRelative(0.12f, -0.3f, 0.69f, -0.81f, 0.29f, -1.28f)
            curveToRelative(-1.67f, -1.89f, -4.83f, 1.56f, -5.53f, -1.38f)
            arcToRelative(7.43f, 7.43f, 0.0f, false, false, -2.0f, -0.29f)
            curveToRelative(0.81f, -2.24f, -4.95f, -1.09f, -2.0f, -3.0f)
            curveToRelative(-1.44f, -2.18f, -4.0f, -2.07f, -6.21f, -3.05f)
            curveToRelative(0.51f, -1.1f, 2.07f, 0.18f, 2.76f, -0.69f)
            curveToRelative(-1.0f, -1.44f, -2.82f, -1.67f, -4.14f, -2.48f)
            curveToRelative(-1.44f, 0.18f, -3.0f, -0.35f, -4.15f, -0.17f)
            arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.21f, -1.9f)
            curveToRelative(-1.44f, -2.19f, -1.27f, -5.3f, -3.17f, -7.36f)
            curveToRelative(0.0f, -1.45f, 0.53f, -3.12f, 0.12f, -4.39f)
            curveToRelative(-0.81f, 0.18f, -2.76f, 2.48f, -1.79f, -0.17f)
            curveToRelative(0.35f, -1.32f, 1.51f, -2.76f, 1.39f, -4.26f)
            curveToRelative(-0.69f, 0.29f, -1.15f, 1.33f, -2.08f, 1.5f)
            curveToRelative(0.64f, -6.22f, 4.15f, -10.48f, 8.12f, -15.0f)
            curveToRelative(1.22f, -0.28f, 0.75f, 1.1f, 1.27f, 1.61f)
            curveToRelative(-0.23f, 3.92f, 0.17f, 8.18f, 1.78f, 11.06f)
            curveToRelative(0.87f, -0.29f, 0.29f, -1.21f, 0.87f, -1.61f)
            curveToRelative(1.38f, 1.55f, 0.52f, 4.49f, 2.3f, 5.92f)
            curveToRelative(2.19f, 3.0f, 3.23f, 5.37f, 5.3f, 8.3f)
            curveToRelative(0.75f, -0.92f, 0.69f, -2.48f, 1.61f, -3.46f)
            curveToRelative(1.0f, -0.06f, 2.42f, 2.3f, 3.46f, 0.29f)
            curveToRelative(1.49f, 0.06f, 2.58f, 3.29f, 4.31f, 1.38f)
            curveToRelative(0.64f, -0.4f, 1.15f, 0.17f, 1.67f, 0.52f)
            curveToRelative(0.12f, 0.52f, -1.38f, 1.21f, -0.28f, 1.56f)
            curveToRelative(1.0f, -1.0f, 2.24f, 0.0f, 3.0f, 0.4f)
            curveToRelative(0.11f, 1.32f, -1.0f, 3.4f, 0.4f, 4.55f)
            curveToRelative(2.41f, -0.92f, 1.09f, 2.47f, 1.67f, 3.74f)
            curveToRelative(0.35f, 0.87f, -0.18f, 2.19f, 0.69f, 2.76f)
            curveToRelative(0.58f, -0.4f, 1.0f, -1.0f, 1.61f, -0.17f)
            curveToRelative(-0.11f, 1.56f, 0.12f, 3.17f, 1.0f, 4.0f)
            curveToRelative(1.73f, -0.41f, 1.27f, -3.17f, 3.46f, -2.48f)
            curveToRelative(0.75f, -0.92f, 0.68f, -2.25f, 1.67f, -2.94f)
            curveToRelative(0.74f, 1.44f, -1.0f, 3.86f, 1.26f, 4.14f)
            curveToRelative(0.86f, 0.29f, 0.0f, 2.31f, 0.69f, 3.23f)
            curveToRelative(0.35f, 0.46f, 0.35f, 1.38f, 0.92f, 1.21f)
            curveToRelative(0.75f, -0.35f, 0.3f, -1.67f, 1.39f, -1.39f)
            curveToRelative(0.0f, 2.0f, -0.29f, 4.5f, 1.38f, 5.42f)
            curveToRelative(0.12f, 0.69f, 1.15f, 0.63f, 1.38f, 1.21f)
            curveToRelative(-2.65f, -0.52f, -5.18f, 0.29f, -7.71f, 1.27f)
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
            moveTo(144.26f, 148.73f)
            curveToRelative(-2.77f, -2.06f, -0.11f, -7.42f, -3.29f, -9.0f)
            curveToRelative(-0.75f, -1.84f, -0.8f, -3.91f, -1.55f, -5.69f)
            curveToRelative(-1.21f, 0.16f, -0.57f, 2.0f, -0.52f, 2.93f)
            arcToRelative(55.0f, 55.0f, 0.0f, false, true, 1.21f, 16.58f)
            curveToRelative(0.29f, 3.75f, -1.55f, 6.8f, -1.09f, 10.48f)
            curveToRelative(-1.0f, 2.3f, -2.36f, 4.0f, -3.57f, 6.33f)
            curveToRelative(-1.12f, 1.35f, -0.06f, 1.27f, 0.4f, 0.87f)
            curveToRelative(1.5f, -1.61f, 4.37f, -2.76f, 4.43f, -5.53f)
            curveToRelative(2.0f, 0.35f, 1.21f, -1.95f, 1.79f, -2.93f)
            curveToRelative(0.41f, 0.34f, 0.41f, 1.32f, 0.29f, 1.84f)
            curveToRelative(-2.0f, 5.06f, -2.14f, 10.94f, -4.15f, 16.0f)
            curveToRelative(-0.4f, 1.67f, -1.43f, 3.34f, -1.27f, 5.12f)
            curveToRelative(-0.05f, 1.67f, -2.07f, 2.0f, -1.49f, 3.74f)
            curveToRelative(-1.84f, 1.09f, -2.76f, 4.0f, -5.12f, 2.31f)
            curveToRelative(-0.64f, -1.91f, 1.08f, -2.89f, 1.26f, -4.55f)
            curveToRelative(-1.32f, -0.86f, -2.36f, 2.7f, -2.54f, 0.28f)
            arcToRelative(6.51f, 6.51f, 0.0f, false, false, 1.56f, -3.16f)
            curveToRelative(-1.09f, -0.24f, -1.89f, 1.0f, -2.94f, 1.38f)
            curveToRelative(1.16f, -3.45f, 3.54f, -7.08f, 3.42f, -10.65f)
            horizontalLineToRelative(-0.37f)
            curveToRelative(-1.37f, 3.39f, -4.0f, 6.35f, -6.0f, 9.38f)
            curveToRelative(-0.18f, -1.18f, -1.0f, -1.4f, -1.39f, -0.69f)
            curveToRelative(-0.34f, 0.52f, -0.46f, 1.44f, -1.27f, 1.0f)
            curveToRelative(0.3f, -1.39f, 1.16f, -2.71f, 0.81f, -4.15f)
            curveToRelative(-1.26f, 0.75f, -1.21f, 3.34f, -3.28f, 2.87f)
            curveToRelative(-0.52f, 0.35f, -2.0f, 2.42f, -1.27f, 0.69f)
            curveToRelative(2.82f, -3.34f, 5.41f, -8.06f, 7.89f, -11.85f)
            curveToRelative(1.15f, -3.35f, 2.87f, -6.69f, 3.17f, -10.49f)
            curveToRelative(-0.35f, -0.8f, -0.69f, 0.18f, -1.0f, 0.41f)
            curveToRelative(-0.45f, 3.68f, -1.89f, 7.08f, -5.0f, 9.27f)
            curveToRelative(-1.67f, 1.78f, -2.87f, 5.35f, -5.92f, 5.0f)
            curveToRelative(-1.21f, 1.9f, -2.0f, 4.0f, -4.0f, 5.52f)
            curveToRelative(-0.12f, -0.92f, 0.57f, -1.9f, 1.08f, -2.76f)
            curveToRelative(2.6f, -4.49f, 3.12f, -9.5f, 5.13f, -14.22f)
            arcToRelative(0.33f, 0.33f, 0.0f, false, false, -0.51f, -0.17f)
            curveToRelative(-2.08f, 2.59f, -1.56f, 6.0f, -3.63f, 8.46f)
            curveToRelative(-1.38f, 2.71f, -3.23f, 5.07f, -4.84f, 7.6f)
            curveToRelative(-0.8f, -0.46f, -1.73f, 0.41f, -1.67f, -1.0f)
            curveToRelative(-1.43f, 0.16f, -1.43f, 2.93f, -2.76f, 2.0f)
            arcToRelative(89.44f, 89.44f, 0.0f, false, false, 3.45f, -9.27f)
            curveToRelative(-0.86f, -0.8f, -0.57f, 0.93f, -1.2f, 1.09f)
            curveToRelative(-1.5f, 2.0f, -2.0f, 3.87f, -3.86f, 5.82f)
            curveToRelative(-1.67f, 0.35f, -1.39f, 2.59f, -2.77f, 3.28f)
            curveToRelative(-0.46f, -1.61f, 1.38f, -2.82f, 1.5f, -4.66f)
            curveToRelative(0.12f, -0.75f, 0.81f, -1.61f, 0.12f, -2.36f)
            curveToRelative(-0.87f, 0.17f, -1.16f, 2.07f, -2.19f, 1.38f)
            curveToRelative(1.72f, -3.52f, 1.61f, -7.54f, 3.34f, -10.93f)
            curveToRelative(0.11f, -0.53f, 1.44f, -0.59f, 0.8f, -1.39f)
            curveToRelative(-1.9f, 1.78f, -3.39f, 3.69f, -5.53f, 5.7f)
            curveToRelative(-1.21f, -2.25f, -2.0f, 1.84f, -3.16f, 0.4f)
            curveToRelative(-0.58f, -0.23f, -0.69f, 0.64f, -1.26f, 0.58f)
            curveToRelative(-0.12f, -0.75f, 0.33f, -1.73f, -0.42f, -2.24f)
            curveToRelative(-1.49f, 0.34f, -2.3f, 1.49f, -3.85f, 1.78f)
            curveToRelative(0.11f, -1.9f, 1.27f, -2.65f, 1.79f, -4.38f)
            curveToRelative(1.79f, -0.69f, 2.18f, -3.46f, 3.16f, -5.0f)
            curveToRelative(0.12f, -1.5f, 0.75f, -0.12f, 1.79f, -0.51f)
            curveToRelative(1.79f, -2.42f, 0.57f, -6.57f, 3.45f, -8.07f)
            arcToRelative(4.92f, 4.92f, 0.0f, false, true, 1.67f, -1.9f)
            curveToRelative(0.92f, -0.63f, 1.0f, 1.16f, 2.0f, 0.41f)
            curveToRelative(1.0f, -1.1f, 1.67f, -2.65f, 3.28f, -3.17f)
            curveToRelative(0.92f, -0.35f, 1.5f, 0.57f, 2.24f, 0.28f)
            curveToRelative(0.12f, 0.81f, -0.23f, 1.39f, 0.3f, 1.91f)
            curveToRelative(1.0f, -0.06f, 1.55f, -1.56f, 2.75f, -0.81f)
            curveToRelative(0.3f, -0.46f, 1.1f, -0.51f, 0.92f, 0.29f)
            curveToRelative(0.12f, 0.34f, -0.17f, 0.75f, 0.3f, 0.92f)
            curveToRelative(0.92f, -0.4f, 1.0f, -1.38f, 1.55f, -2.19f)
            curveToRelative(0.12f, -0.06f, 0.18f, 0.06f, 0.24f, 0.12f)
            curveToRelative(0.39f, 2.48f, -0.7f, 5.18f, -0.24f, 7.37f)
            horizontalLineToRelative(0.27f)
            curveToRelative(2.71f, -4.32f, 2.9f, -9.73f, 4.4f, -14.39f)
            curveToRelative(0.4f, -2.95f, 1.43f, -5.65f, 1.27f, -8.87f)
            curveToRelative(0.1f, 0.06f, 0.16f, -0.06f, 0.28f, -0.12f)
            curveToRelative(-0.06f, -3.57f, 0.17f, -7.66f, -0.69f, -11.05f)
            curveToRelative(-0.46f, 0.16f, -0.75f, -0.92f, -1.15f, -0.12f)
            curveToRelative(0.52f, 3.63f, 0.86f, 8.12f, -0.23f, 11.57f)
            curveToRelative(-1.4f, 0.75f, -1.15f, 2.44f, -1.53f, 3.6f)
            curveToRelative(-0.05f, 0.18f, -0.13f, 0.18f, -0.12f, 0.0f)
            curveToRelative(0.08f, -0.89f, -0.12f, -2.26f, 0.49f, -2.74f)
            curveToRelative(0.64f, -2.47f, 0.12f, -5.17f, -0.11f, -7.59f)
            curveToRelative(0.29f, -0.17f, 0.29f, -0.41f, 0.0f, -0.58f)
            reflectiveCurveToRelative(-0.38f, 0.36f, -0.81f, 0.41f)
            curveToRelative(-0.86f, 2.29f, -1.14f, 11.64f, -5.41f, 14.91f)
            arcToRelative(41.89f, 41.89f, 0.0f, false, false, 3.74f, -15.72f)
            arcToRelative(38.23f, 38.23f, 0.0f, false, true, 1.1f, -5.13f)
            curveToRelative(0.12f, -0.46f, -0.18f, -1.15f, -0.69f, -0.69f)
            curveToRelative(-1.21f, 4.32f, -1.85f, 9.0f, -4.0f, 12.84f)
            curveToRelative(-0.89f, 0.48f, -0.92f, 1.61f, -2.08f, 1.27f)
            curveToRelative(1.62f, -2.65f, 1.39f, -6.28f, 2.53f, -9.27f)
            curveToRelative(-1.0f, -3.0f, 0.59f, -6.28f, 1.51f, -9.1f)
            curveToRelative(2.53f, -0.69f, 1.15f, -4.08f, 3.74f, -5.12f)
            curveToRelative(1.15f, 0.0f, 0.51f, -1.56f, 1.2f, -2.08f)
            curveToRelative(0.29f, -2.0f, 2.71f, -0.91f, 3.0f, -2.93f)
            arcToRelative(28.2f, 28.2f, 0.0f, false, true, 1.49f, -4.66f)
            curveToRelative(0.63f, 2.93f, 0.0f, 7.48f, 3.46f, 9.09f)
            curveToRelative(1.78f, -0.23f, 2.41f, -2.25f, 3.05f, -3.45f)
            arcToRelative(63.87f, 63.87f, 0.0f, false, true, 4.3f, 7.31f)
            curveToRelative(-0.31f, 0.62f, 0.53f, 1.0f, -0.45f, 0.87f)
            arcToRelative(24.37f, 24.37f, 0.0f, false, false, -1.37f, -3.17f)
            curveToRelative(-0.41f, -0.18f, -0.64f, -0.8f, -1.22f, -0.58f)
            curveToRelative(-0.4f, 1.27f, 0.47f, 2.53f, 0.92f, 3.75f)
            curveToRelative(2.83f, 3.22f, 3.8f, 7.08f, 5.82f, 10.75f)
            arcToRelative(0.62f, 0.62f, 0.0f, false, false, -0.52f, 0.81f)
            curveToRelative(1.33f, 0.58f, 0.64f, 2.0f, 0.92f, 2.94f)
            curveToRelative(0.23f, 5.47f, 4.55f, 8.58f, 4.73f, 14.11f)
            arcToRelative(16.25f, 16.25f, 0.0f, false, true, 0.11f, 5.52f)
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
            moveTo(147.71f, 183.28f)
            arcToRelative(35.71f, 35.71f, 0.0f, false, true, -2.18f, -15.08f)
            arcToRelative(10.68f, 10.68f, 0.0f, false, true, 0.69f, -4.55f)
            curveToRelative(-0.24f, -5.58f, 2.3f, -11.23f, 0.0f, -16.47f)
            curveToRelative(0.0f, -1.19f, -0.46f, -2.94f, 0.8f, -1.09f)
            arcToRelative(61.74f, 61.74f, 0.0f, false, false, 1.67f, 8.87f)
            arcToRelative(17.83f, 17.83f, 0.0f, false, true, 0.57f, 9.0f)
            curveToRelative(-0.46f, 0.54f, -1.0f, -1.15f, -1.55f, -0.29f)
            curveToRelative(-2.24f, 2.87f, -0.34f, 6.57f, -0.51f, 10.07f)
            curveToRelative(1.73f, 4.0f, 2.0f, 8.53f, 3.56f, 12.56f)
            curveToRelative(-1.95f, 0.52f, -2.0f, -2.0f, -3.0f, -3.0f)
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
            moveTo(158.0f, 177.59f)
            curveToRelative(-1.09f, -4.09f, -2.36f, -8.29f, -2.64f, -12.56f)
            arcToRelative(93.93f, 93.93f, 0.0f, false, false, -4.15f, -24.47f)
            curveToRelative(-0.23f, -0.69f, -1.15f, -1.61f, -0.81f, -2.47f)
            curveToRelative(-2.88f, -5.3f, -4.72f, -12.32f, -7.88f, -18.0f)
            curveToRelative(-3.58f, -9.37f, -4.95f, -9.4f, -5.54f, -15.37f)
            curveToRelative(3.81f, 4.37f, 5.7f, 9.67f, 7.9f, 14.51f)
            curveToRelative(3.16f, 4.32f, 5.0f, 9.0f, 6.9f, 14.0f)
            curveToRelative(0.29f, 1.72f, 0.63f, 4.31f, 1.1f, 6.5f)
            arcToRelative(54.0f, 54.0f, 0.0f, false, true, 2.07f, 9.0f)
            arcToRelative(71.88f, 71.88f, 0.0f, false, true, 2.36f, 18.0f)
            curveToRelative(0.63f, 2.36f, 0.86f, 4.55f, 1.49f, 6.91f)
            curveToRelative(-0.75f, -0.05f, -0.4f, 0.7f, -0.4f, 1.09f)
            arcToRelative(24.17f, 24.17f, 0.0f, false, true, 1.56f, 6.74f)
            curveToRelative(-1.44f, -0.58f, -1.32f, -2.59f, -2.0f, -3.85f)
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
            moveTo(167.23f, 188.35f)
            curveToRelative(-1.27f, -0.69f, -2.82f, -0.34f, -3.46f, -1.9f)
            curveToRelative(-0.33f, 0.49f, -0.92f, 0.0f, -0.86f, -0.4f)
            curveToRelative(0.06f, -1.5f, -1.0f, -2.59f, -1.38f, -4.0f)
            curveToRelative(0.29f, 0.18f, 0.86f, -0.11f, 1.15f, 0.0f)
            arcToRelative(4.25f, 4.25f, 0.0f, false, false, 1.09f, 2.37f)
            curveToRelative(1.1f, 0.86f, 2.08f, 2.82f, 4.0f, 2.59f)
            curveToRelative(0.11f, 0.63f, -0.58f, 1.0f, -0.52f, 1.38f)
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
            moveTo(166.13f, 153.69f)
            curveToRelative(-0.63f, -1.62f, 1.1f, -2.7f, 0.12f, -4.15f)
            curveToRelative(-2.87f, 1.15f, -3.1f, 4.89f, -4.84f, 6.91f)
            curveToRelative(-0.8f, -1.0f, -1.0f, -3.0f, -2.47f, -3.34f)
            arcToRelative(46.65f, 46.65f, 0.0f, false, true, -2.24f, -11.58f)
            arcToRelative(10.41f, 10.41f, 0.0f, false, true, 2.65f, 5.53f)
            curveToRelative(0.05f, 0.23f, 0.39f, 0.35f, 0.52f, 0.17f)
            curveToRelative(1.67f, -2.47f, 2.7f, -5.0f, 5.69f, -5.58f)
            curveToRelative(0.46f, 1.5f, -0.46f, 4.0f, 0.81f, 4.72f)
            curveToRelative(1.2f, 0.0f, 2.47f, -2.81f, 3.22f, -1.67f)
            arcToRelative(22.51f, 22.51f, 0.0f, false, true, -1.0f, 3.75f)
            curveToRelative(0.06f, 0.22f, 0.2f, 0.45f, 0.41f, 0.28f)
            curveToRelative(1.91f, -1.88f, 5.81f, -2.0f, 7.19f, -2.36f)
            curveToRelative(0.0f, 0.69f, -1.61f, 0.35f, -2.07f, 0.81f)
            curveToRelative(-3.28f, 1.1f, -5.76f, 4.0f, -8.0f, 6.51f)
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
            moveTo(174.54f, 156.45f)
            curveToRelative(-0.57f, 0.0f, -0.74f, -1.9f, -1.78f, -0.8f)
            curveToRelative(-0.87f, 0.69f, -1.44f, 1.67f, -2.48f, 2.18f)
            curveToRelative(0.58f, -3.74f, 1.79f, -6.79f, 4.55f, -9.38f)
            curveToRelative(1.84f, -1.78f, 0.52f, 0.81f, 0.29f, 1.38f)
            curveToRelative(0.78f, 0.69f, 0.92f, -0.69f, 1.38f, -1.0f)
            curveToRelative(0.17f, -0.75f, 1.09f, -0.8f, 1.78f, -1.0f)
            curveToRelative(0.87f, 0.11f, 2.25f, -0.23f, 3.17f, 0.29f)
            curveToRelative(-0.92f, 0.86f, -2.64f, 2.0f, -3.0f, 3.57f)
            curveToRelative(1.21f, 0.87f, 2.07f, -0.92f, 3.34f, -0.4f)
            curveToRelative(-0.17f, 0.86f, -1.79f, 0.0f, -1.67f, 1.27f)
            curveToRelative(-1.44f, 2.0f, -4.44f, 1.55f, -5.53f, 3.85f)
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
            moveTo(180.0f, 158.15f)
            curveToRelative(-0.09f, 0.0f, -0.13f, -0.1f, -0.06f, -0.19f)
            arcToRelative(18.15f, 18.15f, 0.0f, false, true, 3.83f, -3.29f)
            curveToRelative(0.47f, -0.24f, 0.81f, 0.51f, 1.1f, -0.18f)
            curveToRelative(0.26f, 0.2f, 3.67f, 0.9f, 1.79f, 1.56f)
            curveToRelative(-2.68f, -0.11f, -4.29f, 0.9f, -6.66f, 2.1f)
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
            moveTo(187.09f, 159.62f)
            arcToRelative(6.94f, 6.94f, 0.0f, false, true, 4.64f, 2.21f)
            curveToRelative(-1.16f, -0.11f, -3.6f, 1.0f, -4.35f, -1.23f)
            curveToRelative(-0.51f, -0.18f, -1.44f, -0.8f, -0.29f, -1.0f)
        }
    }
        .build()
    return _yellow3!!
}

private var _yellow3: ImageVector? = null
