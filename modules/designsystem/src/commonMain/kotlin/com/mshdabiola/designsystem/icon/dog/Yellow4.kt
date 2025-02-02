package com.mshdabiola.designsystem.icon.dog

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

fun Dog.getYellow(iconColor: Color, accentColor: Color): ImageVector {
    return Builder(
        name = "Yellow4",
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
            moveTo(144.0f, 0.46f)
            arcToRelative(70.08f, 70.08f, 0.0f, false, false, 10.23f, 11.87f)
            curveToRelative(1.68f, 1.43f, 6.09f, 0.46f, 6.77f, 1.18f)
            curveToRelative(8.43f, 8.29f, 21.32f, 5.13f, 24.93f, 3.2f)
            horizontalLineToRelative(1.42f)
            curveToRelative(1.74f, 2.44f, -3.11f, 6.0f, -3.88f, 7.31f)
            arcToRelative(17.59f, 17.59f, 0.0f, false, false, -2.55f, 3.35f)
            lineToRelative(2.24f, -0.12f)
            curveToRelative(1.06f, 1.05f, 3.48f, 0.27f, 3.67f, 2.0f)
            curveToRelative(-2.13f, 4.17f, -10.76f, 9.1f, -10.76f, 9.1f)
            curveToRelative(-0.58f, 0.75f, -1.49f, 1.4f, -1.33f, 2.55f)
            curveToRelative(-0.75f, 2.0f, -3.0f, 3.54f, -3.57f, 5.66f)
            curveToRelative(-2.0f, 2.05f, -4.57f, 8.89f, -8.58f, 12.68f)
            curveToRelative(-0.94f, 0.12f, -1.06f, 1.21f, -1.28f, 2.0f)
            arcToRelative(45.24f, 45.24f, 0.0f, false, false, -7.52f, 7.67f)
            curveToRelative(-1.0f, 0.29f, -0.84f, 1.68f, -2.0f, 1.65f)
            curveToRelative(-1.0f, 1.9f, -2.79f, 3.0f, -4.1f, 4.7f)
            curveToRelative(0.47f, 1.0f, -1.09f, 0.65f, -1.12f, 1.49f)
            curveToRelative(0.38f, 0.56f, -0.28f, 1.18f, -0.47f, 1.65f)
            curveToRelative(0.66f, 1.21f, -0.46f, 2.17f, -0.8f, 3.1f)
            curveToRelative(1.0f, 1.31f, -0.47f, 2.49f, -0.53f, 3.67f)
            curveToRelative(0.18f, 1.24f, -0.56f, 2.0f, -0.9f, 3.14f)
            arcToRelative(4.81f, 4.81f, 0.0f, false, true, 0.25f, 3.64f)
            curveToRelative(-0.13f, 2.0f, -2.18f, 7.58f, -2.24f, 8.67f)
            curveToRelative(-2.0f, 3.0f, -1.31f, 7.0f, -2.33f, 8.36f)
            arcToRelative(2.54f, 2.54f, 0.0f, false, true, -0.16f, 1.86f)
            curveToRelative(-0.25f, 3.27f, 1.62f, 6.13f, 1.59f, 9.39f)
            curveToRelative(0.46f, 1.12f, -0.07f, 2.21f, 0.74f, 3.36f)
            arcToRelative(24.26f, 24.26f, 0.0f, false, true, 0.16f, 2.76f)
            curveToRelative(-0.62f, 2.0f, 1.15f, 3.42f, 0.22f, 5.44f)
            arcToRelative(69.83f, 69.83f, 0.0f, false, true, 2.52f, 7.0f)
            curveToRelative(0.09f, 3.32f, 0.4f, 6.59f, 0.52f, 9.91f)
            curveToRelative(2.68f, 0.34f, 5.56f, -1.68f, 8.3f, -0.31f)
            curveToRelative(1.27f, 1.56f, 3.67f, -0.65f, 4.54f, 1.59f)
            curveToRelative(1.05f, 0.37f, 1.64f, 1.61f, 2.55f, 2.51f)
            curveToRelative(1.77f, 0.47f, 1.61f, 2.46f, 2.73f, 3.67f)
            arcToRelative(26.4f, 26.4f, 0.0f, false, true, 0.31f, 10.23f)
            curveToRelative(-1.0f, 1.24f, -0.68f, 3.08f, -2.0f, 4.0f)
            curveToRelative(-0.06f, 1.0f, -0.93f, 1.44f, -1.55f, 2.09f)
            curveToRelative(-0.41f, 0.46f, -0.25f, 1.12f, -1.0f, 1.43f)
            curveToRelative(-0.06f, 1.52f, -1.42f, 2.27f, -2.11f, 3.51f)
            curveToRelative(-1.86f, 0.84f, -3.36f, 2.42f, -5.44f, 3.0f)
            curveToRelative(-1.0f, 1.18f, -3.0f, 1.42f, -4.32f, 1.49f)
            curveToRelative(-0.77f, 0.0f, -1.18f, 0.84f, -1.93f, 0.43f)
            curveToRelative(-0.46f, 0.87f, -1.64f, 1.56f, -1.0f, 2.61f)
            arcToRelative(1.56f, 1.56f, 0.0f, false, true, -0.43f, 1.65f)
            curveToRelative(0.31f, 1.52f, -0.25f, 2.58f, -0.38f, 4.0f)
            arcToRelative(25.07f, 25.07f, 0.0f, false, true, -1.55f, 2.24f)
            curveToRelative(-0.72f, 0.84f, -1.59f, 1.43f, -1.65f, 2.73f)
            curveToRelative(0.0f, 1.5f, -1.58f, 1.47f, -2.33f, 2.39f)
            curveToRelative(-0.71f, 2.15f, -3.51f, 1.13f, -5.28f, 2.0f)
            curveToRelative(-0.69f, -0.16f, -1.18f, -0.62f, -1.8f, -0.38f)
            curveToRelative(-0.5f, 0.78f, -1.0f, 0.13f, -1.72f, 0.0f)
            curveToRelative(-0.15f, -1.18f, -1.39f, -0.62f, -2.14f, -0.8f)
            curveToRelative(-1.0f, -0.41f, -0.9f, -1.65f, -1.37f, -2.49f)
            curveToRelative(-1.24f, -0.31f, -0.68f, -1.87f, -2.0f, -2.3f)
            curveToRelative(-0.06f, -0.25f, 0.29f, -2.73f, 1.0f, -3.36f)
            curveToRelative(-1.83f, 0.22f, -3.48f, 1.34f, -5.38f, 1.65f)
            curveToRelative(-1.93f, 2.17f, -5.65f, 0.37f, -7.0f, 0.44f)
            curveToRelative(-1.15f, -1.68f, -2.8f, 0.18f, -4.32f, -0.75f)
            curveToRelative(-3.05f, 0.89f, -8.65f, -1.67f, -11.93f, 0.47f)
            curveToRelative(-0.75f, 0.24f, -3.18f, -0.8f, -4.85f, -0.47f)
            curveToRelative(0.0f, -0.34f, -2.52f, -3.36f, -4.35f, -2.83f)
            curveToRelative(-1.0f, -0.34f, -2.14f, -0.8f, -3.26f, -1.06f)
            curveToRelative(-0.47f, -1.49f, -2.06f, -0.49f, -3.08f, -1.11f)
            curveToRelative(-0.93f, -0.47f, -2.52f, 0.65f, -3.36f, -0.59f)
            curveToRelative(-1.09f, -0.94f, -2.67f, -0.35f, -3.73f, -1.56f)
            curveToRelative(-1.0f, -0.65f, -4.75f, -2.42f, -5.71f, -2.18f)
            curveToRelative(-0.81f, 0.0f, -1.31f, -0.71f, -2.12f, -0.65f)
            curveToRelative(-1.77f, 1.09f, -2.67f, -1.12f, -4.47f, -0.53f)
            arcToRelative(25.78f, 25.78f, 0.0f, false, false, -8.86f, -0.74f)
            curveToRelative(-1.0f, 0.28f, -1.65f, 0.9f, -2.55f, 1.18f)
            curveToRelative(-1.31f, -0.9f, -3.0f, -0.06f, -4.38f, -0.9f)
            curveToRelative(-4.0f, -2.16f, -14.25f, -1.79f, -15.6f, -3.64f)
            curveToRelative(-3.23f, -1.21f, -7.0f, -1.12f, -10.0f, -3.0f)
            curveToRelative(-0.75f, -1.0f, -2.05f, -0.94f, -3.11f, -1.22f)
            arcToRelative(1.57f, 1.57f, 0.0f, false, true, -0.37f, -1.24f)
            arcToRelative(11.47f, 11.47f, 0.0f, false, true, -2.24f, -3.51f)
            curveToRelative(-0.62f, -2.42f, 1.22f, -4.54f, 0.13f, -6.93f)
            arcToRelative(4.74f, 4.74f, 0.0f, false, true, 0.46f, -2.0f)
            curveToRelative(-0.09f, -0.47f, -0.74f, -0.53f, -0.59f, -1.12f)
            curveToRelative(0.56f, -0.53f, 0.37f, -1.09f, 0.87f, -1.64f)
            curveToRelative(1.46f, -0.38f, 5.85f, -0.83f, 6.06f, 1.58f)
            curveToRelative(0.59f, 0.0f, 0.91f, -0.78f, 1.5f, -0.84f)
            curveToRelative(0.4f, -1.8f, -0.1f, -4.0f, 1.55f, -5.44f)
            arcToRelative(12.83f, 12.83f, 0.0f, false, true, 4.79f, 1.0f)
            curveToRelative(2.39f, 0.29f, 2.27f, 2.68f, 3.41f, 4.2f)
            curveToRelative(0.32f, 0.53f, -0.34f, 1.21f, 0.32f, 1.65f)
            curveToRelative(0.09f, 1.43f, 10.25f, 2.79f, 13.85f, 3.63f)
            curveToRelative(2.83f, 0.5f, 15.67f, -4.59f, 19.62f, -6.18f)
            curveToRelative(26.41f, -7.82f, 25.88f, -8.8f, 25.88f, -8.8f)
            reflectiveCurveToRelative(-0.81f, -0.36f, 1.49f, -2.24f)
            curveToRelative(0.62f, -1.77f, 3.27f, -2.17f, 3.14f, -4.41f)
            curveToRelative(0.62f, -1.68f, -1.08f, -2.17f, -0.8f, -3.79f)
            curveToRelative(-0.31f, -1.4f, -2.12f, -2.39f, -1.87f, -4.0f)
            curveToRelative(-6.3f, -7.67f, -8.24f, -15.85f, -12.56f, -21.0f)
            curveToRelative(-2.0f, -3.17f, -6.66f, -11.31f, -7.3f, -15.35f)
            curveToRelative(0.27f, -1.08f, -0.53f, -2.89f, 0.0f, -3.14f)
            curveToRelative(0.0f, -0.31f, -0.84f, -3.51f, -0.06f, -4.7f)
            curveToRelative(0.09f, -1.61f, 0.06f, -2.79f, 0.22f, -4.25f)
            arcToRelative(2.9f, 2.9f, 0.0f, false, true, 0.31f, -2.3f)
            curveToRelative(0.31f, -1.87f, -1.68f, -1.77f, -2.71f, -2.49f)
            curveToRelative(-0.4f, -0.43f, -1.3f, 0.0f, -1.49f, -0.65f)
            curveToRelative(-3.0f, 0.43f, -5.93f, -0.4f, -8.73f, -1.06f)
            curveToRelative(-2.0f, -0.65f, -3.92f, 0.37f, -6.0f, -0.28f)
            curveToRelative(-1.77f, -1.8f, -4.57f, -0.53f, -6.62f, -1.65f)
            curveToRelative(-1.0f, -0.28f, -2.0f, -1.0f, -3.14f, -0.52f)
            curveToRelative(-6.61f, -0.15f, -12.86f, -3.67f, -14.23f, -3.73f)
            curveToRelative(-2.11f, -1.37f, -4.32f, 0.0f, -6.59f, -0.75f)
            curveToRelative(-1.71f, -0.87f, -3.73f, -2.39f, -5.72f, -1.27f)
            curveToRelative(-5.94f, -0.71f, -4.69f, -5.94f, -5.46f, -7.31f)
            curveToRelative(0.09f, -2.58f, -2.0f, -4.69f, -1.0f, -7.3f)
            curveToRelative(-1.0f, -0.69f, 0.37f, -1.49f, 0.22f, -2.24f)
            curveToRelative(-0.59f, -1.0f, 0.28f, -2.33f, -0.43f, -3.3f)
            curveToRelative(-0.5f, -0.43f, 0.09f, -0.77f, 0.06f, -1.33f)
            curveToRelative(0.21f, -0.34f, 1.56f, -0.26f, 1.64f, -1.34f)
            arcToRelative(6.14f, 6.14f, 0.0f, false, true, 7.18f, 5.0f)
            curveToRelative(3.25f, 4.77f, 10.44f, 5.26f, 12.43f, 5.51f)
            curveToRelative(4.51f, 0.9f, 8.64f, 0.46f, 13.21f, 0.68f)
            curveToRelative(7.49f, 0.1f, 29.0f, -0.23f, 32.0f, -4.41f)
            lineToRelative(2.3f, -1.34f)
            curveToRelative(0.59f, -0.44f, 1.43f, -0.31f, 2.0f, -1.0f)
            curveToRelative(0.12f, -1.68f, 2.2f, -0.19f, 3.0f, -1.28f)
            curveToRelative(1.22f, -1.33f, 2.93f, -1.0f, 4.26f, -2.0f)
            curveToRelative(2.58f, -0.28f, 10.44f, -4.19f, 12.09f, -5.28f)
            curveToRelative(0.87f, -0.59f, 2.14f, -0.87f, 2.61f, -1.8f)
            curveToRelative(2.15f, -1.31f, 11.1f, -6.78f, 13.0f, -8.49f)
            curveToRelative(1.65f, -0.34f, 2.8f, -1.46f, 4.47f, -1.64f)
            curveToRelative(2.34f, 0.52f, 3.74f, -1.68f, 5.69f, -2.34f)
            curveToRelative(0.0f, 0.0f, 0.24f, -2.0f, 2.83f, -1.92f)
            curveToRelative(0.84f, -0.66f, 0.0f, -1.37f, -0.15f, -2.0f)
            curveToRelative(-2.3f, -1.58f, -7.0f, -9.41f, -3.05f, -12.74f)
            curveToRelative(-0.68f, -0.77f, -2.52f, -0.22f, -2.33f, -1.64f)
            curveToRelative(-0.08f, -2.8f, 7.78f, 1.31f, 11.19f, 3.29f)
            curveToRelative(-0.19f, -1.59f, -0.81f, -3.39f, -0.9f, -5.1f)
            curveToRelative(0.12f, -4.0f, 5.81f, -10.5f, 8.0f, -8.26f)
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
            moveTo(156.23f, 15.0f)
            curveToRelative(-0.29f, -0.16f, -1.15f, -0.34f, -1.28f, 0.15f)
            lineToRelative(1.28f, -0.15f)
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
            moveTo(138.7f, 14.26f)
            curveToRelative(0.09f, 0.93f, 0.0f, 2.17f, 0.65f, 2.92f)
            curveToRelative(0.16f, 0.34f, 0.0f, 0.8f, 0.37f, 1.0f)
            curveToRelative(-0.28f, -0.65f, 0.07f, -1.68f, -0.65f, -2.24f)
            curveToRelative(-0.25f, -0.46f, -0.12f, -1.24f, -0.37f, -1.7f)
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
            moveTo(155.33f, 18.36f)
            arcToRelative(1.12f, 1.12f, 0.0f, false, false, 0.59f, -1.0f)
            horizontalLineToRelative(-1.0f)
            curveToRelative(-0.19f, 0.47f, 0.28f, 0.66f, 0.44f, 1.0f)
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
            moveTo(164.59f, 51.62f)
            curveToRelative(0.15f, -0.29f, 0.77f, 0.0f, 0.65f, -0.5f)
            arcToRelative(1.45f, 1.45f, 0.0f, false, false, -1.0f, -0.25f)
            curveToRelative(-0.27f, 0.18f, -0.15f, 0.68f, -0.59f, 0.68f)
            curveToRelative(-0.59f, 0.0f, -0.33f, -1.27f, -1.05f, -0.59f)
            curveToRelative(-2.0f, -0.18f, -1.26f, -2.1f, -0.15f, -2.17f)
            curveToRelative(0.33f, 0.46f, 0.83f, -0.07f, 1.2f, 0.46f)
            curveToRelative(0.78f, -1.83f, 2.52f, -2.49f, 3.95f, -4.0f)
            arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 0.0f)
            curveToRelative(0.59f, -1.15f, -0.66f, -0.59f, -1.12f, -1.06f)
            curveToRelative(-1.37f, -0.52f, -2.67f, -3.45f, -4.48f, -1.61f)
            arcToRelative(4.15f, 4.15f, 0.0f, false, true, -2.24f, -1.06f)
            curveToRelative(-0.84f, -0.12f, -2.23f, 1.27f, -2.61f, -0.06f)
            curveToRelative(0.11f, -2.34f, 3.48f, -1.46f, 4.42f, -1.59f)
            curveToRelative(1.0f, -0.74f, 2.05f, -0.09f, 3.14f, 0.22f)
            arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.16f, 0.0f)
            arcToRelative(15.23f, 15.23f, 0.0f, false, false, 1.28f, -2.67f)
            curveToRelative(-2.0f, -0.68f, -4.29f, 1.21f, -6.0f, -0.31f)
            curveToRelative(-0.09f, -0.53f, 0.56f, -1.58f, -0.31f, -1.62f)
            arcToRelative(1.86f, 1.86f, 0.0f, false, true, -1.56f, -0.52f)
            curveToRelative(-0.87f, -1.0f, 0.9f, -2.93f, -1.0f, -3.21f)
            curveToRelative(-1.13f, -3.58f, -15.76f, 0.81f, -15.76f, 0.81f)
            arcToRelative(1.53f, 1.53f, 0.0f, false, true, -0.37f, 1.0f)
            arcToRelative(2.82f, 2.82f, 0.0f, false, true, 2.77f, 0.84f)
            curveToRelative(0.34f, 0.1f, 1.24f, -0.18f, 1.27f, 0.44f)
            curveToRelative(-0.5f, 1.29f, -2.78f, -0.17f, -3.2f, 1.12f)
            curveToRelative(0.31f, 0.34f, 0.0f, 0.81f, -0.15f, 1.12f)
            curveToRelative(0.87f, 0.37f, 0.31f, 1.46f, 0.9f, 2.0f)
            curveToRelative(1.86f, 0.43f, 6.89f, -0.68f, 7.73f, 0.52f)
            curveToRelative(0.25f, 1.45f, -1.64f, 2.0f, -1.64f, 2.0f)
            curveToRelative(0.12f, 0.49f, 0.8f, 0.0f, 1.0f, 0.46f)
            reflectiveCurveToRelative(-0.4f, 1.12f, 0.37f, 1.34f)
            curveToRelative(3.09f, 1.31f, 1.0f, 2.0f, 3.36f, 4.63f)
            curveToRelative(1.65f, 0.0f, 0.65f, 1.33f, 0.65f, 1.33f)
            arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.22f, 1.5f)
            curveToRelative(0.09f, 0.12f, -0.13f, 1.16f, -1.55f, 0.31f)
            curveToRelative(-0.56f, -0.31f, -1.46f, -0.41f, -1.81f, -1.06f)
            curveToRelative(0.9f, -0.09f, -0.12f, -0.81f, 0.25f, -1.27f)
            curveToRelative(-0.77f, -0.2f, -0.77f, -1.28f, -0.75f, -1.4f)
            curveToRelative(-0.93f, 0.18f, -0.55f, -1.0f, -0.74f, -1.28f)
            lineToRelative(-2.76f, -2.23f)
            curveToRelative(-0.07f, -1.0f, -1.22f, -0.59f, -1.65f, -1.22f)
            curveToRelative(-1.18f, -1.57f, -2.39f, -0.8f, -2.39f, -0.8f)
            lineToRelative(-0.6f, -0.53f)
            curveToRelative(-0.09f, 1.05f, 2.82f, 2.05f, 0.9f, 4.32f)
            curveToRelative(0.6f, 0.31f, 1.53f, 0.5f, 1.56f, 1.37f)
            arcToRelative(0.94f, 0.94f, 0.0f, false, true, -0.9f, 0.37f)
            lineToRelative(-0.28f, 1.11f)
            curveToRelative(0.47f, 0.13f, 1.12f, 0.0f, 1.4f, 0.38f)
            curveToRelative(-0.87f, 1.83f, 3.0f, 1.9f, 2.0f, 4.17f)
            curveToRelative(0.49f, 0.49f, 1.55f, 0.18f, 2.0f, 1.0f)
            curveToRelative(0.34f, 1.05f, 2.39f, 1.49f, 1.39f, 2.76f)
            curveToRelative(0.25f, 0.31f, 0.35f, -0.25f, 0.59f, -0.15f)
            curveToRelative(0.0f, 1.12f, 1.09f, 0.65f, 1.44f, 1.49f)
            curveToRelative(1.61f, 1.15f, 6.0f, -5.0f, 7.0f, -6.49f)
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
            moveTo(148.77f, 68.4f)
            curveToRelative(-0.47f, -1.09f, 0.84f, -1.25f, 0.37f, -2.15f)
            arcToRelative(22.92f, 22.92f, 0.0f, false, true, 4.16f, -0.74f)
            curveToRelative(1.0f, -0.37f, -0.37f, -0.84f, 0.1f, -1.49f)
            curveToRelative(1.0f, -0.41f, -0.16f, -2.37f, 1.34f, -1.59f)
            lineToRelative(2.08f, -1.71f)
            arcToRelative(8.39f, 8.39f, 0.0f, false, true, -3.3f, -1.49f)
            curveToRelative(-0.06f, 0.09f, -0.28f, 0.31f, -0.43f, 0.16f)
            lineToRelative(-0.38f, -0.44f)
            lineToRelative(-1.18f, 0.81f)
            curveToRelative(-0.49f, -0.59f, -1.18f, -1.0f, -1.21f, -1.87f)
            curveToRelative(-0.93f, -0.52f, -1.93f, 2.09f, -2.45f, 0.06f)
            curveToRelative(-0.41f, -0.71f, 0.87f, -1.39f, -0.22f, -1.77f)
            arcTo(5.52f, 5.52f, 0.0f, false, true, 146.0f, 54.0f)
            curveToRelative(-0.22f, 1.0f, -1.55f, -0.22f, -1.71f, 0.84f)
            curveToRelative(-0.37f, -0.72f, -1.43f, -0.44f, -1.33f, -1.37f)
            curveToRelative(-1.21f, 0.37f, -4.54f, -2.36f, -5.6f, -2.52f)
            curveToRelative(1.59f, 1.18f, 2.93f, 1.81f, 4.1f, 3.58f)
            curveToRelative(1.18f, -0.25f, 1.4f, 1.15f, 2.0f, 1.92f)
            reflectiveCurveToRelative(-0.46f, 1.06f, -0.49f, 1.65f)
            curveToRelative(-1.09f, 0.0f, -0.63f, -1.71f, -1.59f, -2.0f)
            curveToRelative(-0.25f, 0.0f, -0.43f, -0.37f, -0.65f, -0.22f)
            curveToRelative(0.28f, 0.47f, 0.74f, 0.93f, 0.43f, 1.5f)
            curveToRelative(-0.15f, 0.49f, -0.93f, -0.1f, -1.12f, 0.52f)
            curveToRelative(-0.43f, -0.52f, -1.0f, 0.0f, -1.55f, -0.31f)
            curveToRelative(-1.31f, -1.24f, -3.42f, -0.65f, -4.85f, -1.55f)
            curveToRelative(-1.0f, -0.78f, -2.0f, -2.0f, -3.51f, -1.65f)
            curveToRelative(0.59f, 0.28f, 1.0f, 1.43f, 1.71f, 1.06f)
            curveToRelative(0.41f, 0.16f, 0.34f, 0.71f, 0.44f, 1.12f)
            arcToRelative(8.74f, 8.74f, 0.0f, false, true, 4.0f, 3.26f)
            arcToRelative(0.79f, 0.79f, 0.0f, false, false, -0.16f, 0.9f)
            lineTo(138.48f, 63.0f)
            curveToRelative(3.51f, 0.53f, 2.64f, 3.26f, 4.0f, 3.73f)
            arcToRelative(2.91f, 2.91f, 0.0f, false, true, 2.67f, 0.46f)
            curveToRelative(0.0f, 1.06f, 1.59f, 0.0f, 1.12f, 1.13f)
            curveToRelative(0.62f, 1.33f, 1.49f, -0.26f, 2.55f, 0.12f)
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
            moveTo(125.49f, 88.32f)
            curveToRelative(0.0f, -1.12f, -1.43f, -0.46f, -1.49f, -1.55f)
            arcToRelative(1.42f, 1.42f, 0.0f, false, true, -1.06f, -0.53f)
            curveToRelative(-1.0f, 0.25f, -0.86f, -0.84f, -1.71f, -0.9f)
            curveToRelative(-0.62f, 0.25f, -1.21f, -0.1f, -1.77f, -0.28f)
            curveToRelative(0.0f, -0.84f, -1.18f, -0.35f, -1.49f, -0.16f)
            curveToRelative(-2.0f, -0.21f, -3.51f, 1.09f, -5.22f, 0.16f)
            lineToRelative(-0.84f, 0.06f)
            curveToRelative(0.93f, 0.19f, 1.68f, 1.12f, 2.76f, 0.53f)
            curveToRelative(0.57f, 0.12f, -0.18f, 0.59f, 0.38f, 0.65f)
            arcToRelative(0.87f, 0.87f, 0.0f, false, true, 0.81f, 0.25f)
            curveToRelative(0.71f, 0.0f, 1.67f, -0.75f, 2.11f, 0.06f)
            curveToRelative(1.09f, 1.06f, 3.0f, 0.75f, 4.54f, 1.12f)
            curveToRelative(0.71f, 0.59f, 1.86f, 0.34f, 2.39f, 1.06f)
            curveToRelative(0.19f, -0.16f, 0.44f, -0.25f, 0.59f, -0.47f)
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
            moveTo(101.56f, 183.9f)
            curveToRelative(-2.07f, -1.48f, -8.08f, -1.43f, -8.08f, -1.43f)
            curveToRelative(0.16f, 2.0f, -7.71f, 1.67f, -10.28f, 3.0f)
            curveToRelative(1.0f, 0.56f, 6.4f, 2.77f, 7.45f, 3.42f)
            curveToRelative(0.0f, 0.75f, 0.87f, 0.71f, 1.22f, 1.12f)
            curveToRelative(2.38f, -4.0f, 4.66f, -1.87f, 4.75f, -1.61f)
            curveToRelative(-0.22f, 0.68f, -1.0f, 1.11f, -1.71f, 1.55f)
            curveToRelative(0.43f, 0.68f, 4.23f, -1.31f, 5.29f, -1.87f)
            curveToRelative(1.0f, 0.69f, 1.83f, -1.33f, 2.92f, -0.53f)
            curveToRelative(0.15f, 1.35f, -1.87f, 1.16f, -2.0f, 1.65f)
            verticalLineToRelative(1.28f)
            curveToRelative(0.77f, -0.6f, 11.06f, 1.0f, 11.12f, -3.21f)
            curveToRelative(-0.12f, -0.5f, -4.94f, -0.52f, -5.0f, -0.83f)
            reflectiveCurveToRelative(0.5f, -0.72f, 0.59f, -1.13f)
            curveToRelative(-0.62f, -0.24f, -1.55f, 0.0f, -1.93f, -0.74f)
            curveToRelative(0.8f, -2.61f, -0.15f, -3.2f, -0.15f, -3.2f)
            curveToRelative(-0.69f, 0.28f, -2.0f, 4.12f, -4.17f, 2.55f)
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
            moveTo(131.4f, 177.62f)
            curveToRelative(0.08f, 1.24f, -3.26f, 1.52f, -3.45f, 2.55f)
            lineToRelative(-0.53f, 0.22f)
            arcToRelative(0.65f, 0.65f, 0.0f, false, true, 0.09f, 0.37f)
            lineToRelative(-0.46f, 0.06f)
            curveToRelative(0.0f, 0.19f, 0.0f, 0.44f, -0.22f, 0.46f)
            curveToRelative(-0.56f, -0.37f, -1.09f, -0.09f, -1.56f, 0.22f)
            curveToRelative(0.0f, 0.07f, 0.0f, 0.1f, -0.09f, 0.16f)
            curveToRelative(1.09f, 0.12f, 2.0f, -0.25f, 3.0f, -0.16f)
            curveToRelative(0.41f, 0.63f, -0.09f, 1.46f, -0.21f, 2.15f)
            curveToRelative(0.87f, 0.12f, 2.62f, -0.41f, 2.7f, 0.37f)
            curveToRelative(-0.81f, 0.44f, -2.37f, 1.51f, -1.59f, 3.23f)
            curveToRelative(1.0f, 0.56f, 1.34f, -1.3f, 1.81f, -1.58f)
            curveToRelative(0.65f, 0.53f, 1.18f, -1.09f, 1.55f, 0.0f)
            curveToRelative(0.28f, 0.75f, -0.56f, 1.0f, -0.59f, 1.65f)
            curveToRelative(0.44f, 0.21f, 0.9f, -0.72f, 1.34f, -0.07f)
            curveToRelative(0.09f, 1.53f, -0.9f, 2.43f, -1.4f, 3.73f)
            curveToRelative(1.18f, -0.15f, 1.12f, -2.2f, 2.45f, -2.39f)
            curveToRelative(0.53f, 0.47f, 0.38f, 2.08f, 0.38f, 2.08f)
            curveToRelative(0.56f, -0.24f, 0.53f, -1.3f, 1.33f, -1.18f)
            curveToRelative(0.5f, 0.84f, -0.43f, 1.49f, -0.22f, 2.15f)
            curveToRelative(0.38f, -0.28f, 0.41f, -1.4f, 1.19f, -1.0f)
            curveToRelative(0.56f, 1.15f, 0.22f, 4.1f, 0.22f, 4.1f)
            arcToRelative(3.73f, 3.73f, 0.0f, false, false, 1.64f, -2.29f)
            curveToRelative(1.0f, -0.16f, 0.62f, -1.28f, 1.06f, -1.75f)
            curveToRelative(1.62f, -1.36f, 2.3f, -1.0f, 2.39f, -1.0f)
            curveToRelative(0.22f, -1.43f, 0.43f, -2.89f, 0.65f, -4.32f)
            curveToRelative(-0.22f, -0.16f, -0.46f, -0.28f, -0.43f, -0.62f)
            curveToRelative(0.0f, -0.87f, 0.81f, -1.46f, 0.74f, -2.36f)
            arcToRelative(4.93f, 4.93f, 0.0f, false, true, -1.71f, 1.24f)
            curveToRelative(-0.28f, 1.18f, -1.27f, 1.92f, -1.21f, 3.14f)
            curveToRelative(-0.12f, 0.37f, -0.62f, 0.28f, -0.81f, 0.09f)
            curveToRelative(-0.37f, -0.78f, 0.38f, -1.52f, -0.09f, -2.17f)
            curveToRelative(0.0f, -0.41f, -0.31f, -3.33f, 0.53f, -4.54f)
            curveToRelative(-0.16f, -0.09f, -1.0f, 0.34f, -1.34f, 0.28f)
            arcToRelative(7.48f, 7.48f, 0.0f, false, true, 0.59f, -2.77f)
            curveToRelative(0.07f, -0.37f, -0.49f, -0.12f, -0.52f, -0.5f)
            curveToRelative(0.15f, -0.62f, 0.9f, -0.71f, 1.37f, -1.05f)
            arcToRelative(10.92f, 10.92f, 0.0f, false, true, 2.51f, -2.83f)
            arcToRelative(0.88f, 0.88f, 0.0f, false, true, 0.75f, 0.22f)
            curveToRelative(-1.22f, 0.31f, -0.6f, 1.55f, -1.71f, 2.0f)
            curveToRelative(0.49f, 0.13f, 0.22f, 0.85f, 0.31f, 1.13f)
            curveToRelative(-0.72f, 0.27f, -0.75f, 0.87f, -1.12f, 1.39f)
            lineToRelative(1.61f, -0.8f)
            arcToRelative(1.22f, 1.22f, 0.0f, false, true, 0.47f, 0.8f)
            curveToRelative(-0.59f, 0.53f, -1.4f, 0.56f, -1.65f, 1.44f)
            curveToRelative(1.39f, 0.64f, -0.43f, 2.92f, -0.43f, 2.92f)
            arcToRelative(7.33f, 7.33f, 0.0f, false, true, 3.26f, -2.12f)
            curveToRelative(0.16f, -0.65f, -0.84f, -0.74f, -0.65f, -1.49f)
            curveToRelative(0.68f, -0.81f, 0.37f, -2.0f, 1.4f, -2.52f)
            curveToRelative(0.46f, -0.4f, -0.22f, -0.71f, 0.0f, -1.21f)
            arcToRelative(11.59f, 11.59f, 0.0f, false, false, 0.68f, -5.34f)
            curveToRelative(0.28f, -1.13f, 1.87f, -1.65f, 1.77f, -3.0f)
            curveToRelative(0.56f, -0.78f, 1.68f, -0.87f, 1.81f, -1.86f)
            curveToRelative(0.37f, -0.25f, 1.15f, -0.31f, 1.11f, -0.16f)
            lineToRelative(1.12f, -0.74f)
            lineToRelative(0.31f, 0.65f)
            curveToRelative(0.72f, -0.38f, 1.71f, -0.25f, 2.3f, -0.81f)
            curveToRelative(0.81f, 0.22f, 0.47f, -1.0f, 1.34f, -0.59f)
            curveToRelative(0.35f, 0.91f, -1.0f, 1.27f, -1.0f, 1.86f)
            curveToRelative(0.93f, -0.24f, 3.2f, -1.59f, 3.42f, -0.68f)
            curveToRelative(0.05f, 0.68f, -0.85f, 0.47f, -1.13f, 0.84f)
            curveToRelative(0.47f, 0.52f, -0.4f, 0.65f, -0.59f, 1.0f)
            curveToRelative(-0.24f, 1.0f, 1.06f, 1.65f, 0.59f, 2.61f)
            curveToRelative(0.81f, 0.5f, 1.93f, -0.24f, 2.62f, 0.0f)
            curveToRelative(0.12f, 0.72f, -2.81f, 1.0f, -2.0f, 3.0f)
            curveToRelative(-0.8f, 0.43f, -0.65f, 1.49f, -0.65f, 2.23f)
            curveToRelative(-0.81f, 1.53f, -3.7f, 1.06f, -2.92f, 3.52f)
            arcToRelative(18.7f, 18.7f, 0.0f, false, true, -5.0f, 1.93f)
            curveToRelative(-0.78f, 0.31f, -1.43f, 1.18f, -2.15f, 1.64f)
            arcToRelative(9.25f, 9.25f, 0.0f, false, false, 4.23f, -1.0f)
            curveToRelative(-0.31f, -0.81f, 0.62f, -0.44f, 0.84f, -0.84f)
            curveToRelative(1.18f, -1.31f, 2.89f, -1.34f, 4.25f, -2.24f)
            curveToRelative(2.45f, -4.08f, 4.23f, -5.28f, 4.33f, -6.87f)
            curveToRelative(0.46f, -0.46f, 1.0f, -0.87f, 0.8f, -1.55f)
            curveToRelative(-0.43f, -1.0f, 0.84f, -1.74f, 1.12f, -2.68f)
            curveToRelative(0.0f, -0.9f, 1.0f, -1.42f, 0.69f, -2.33f)
            curveToRelative(0.59f, -0.12f, 0.45f, -1.44f, 0.06f, -3.57f)
            curveToRelative(-0.34f, -1.25f, -0.09f, -2.64f, -1.18f, -3.51f)
            lineToRelative(-0.47f, -2.4f)
            curveToRelative(-2.33f, -0.77f, -2.58f, -3.0f, -4.69f, -3.94f)
            curveToRelative(-1.31f, 0.56f, -2.39f, -0.85f, -3.73f, -0.9f)
            arcToRelative(5.09f, 5.09f, 0.0f, false, false, -3.42f, 0.37f)
            arcToRelative(3.92f, 3.92f, 0.0f, false, false, -3.08f, 1.0f)
            lineToRelative(-0.8f, -0.37f)
            curveToRelative(-0.35f, 0.5f, -0.44f, 1.83f, -1.43f, 1.18f)
            curveToRelative(-0.22f, -0.4f, -0.66f, -0.81f, -1.19f, -0.43f)
            curveToRelative(-0.43f, 0.65f, -0.31f, 1.74f, -1.0f, 2.08f)
            reflectiveCurveToRelative(0.34f, 1.33f, -0.37f, 1.8f)
            curveToRelative(-0.28f, 0.75f, 1.15f, 1.18f, 0.22f, 1.87f)
            lineToRelative(-0.16f, 0.59f)
            curveToRelative(-0.62f, -0.06f, -2.0f, -1.29f, -3.51f, -0.16f)
            curveToRelative(0.72f, 0.81f, -2.72f, 2.43f, -3.35f, 4.48f)
            curveToRelative(-0.38f, 0.56f, -1.68f, 0.31f, -1.19f, 1.43f)
            lineToRelative(-1.55f, 2.52f)
            arcToRelative(0.52f, 0.52f, 0.0f, false, true, 0.06f, 0.83f)
            curveToRelative(-1.86f, 0.47f, 0.0f, 2.61f, -1.71f, 2.9f)
            lineToRelative(-1.33f, 0.46f)
            curveToRelative(0.09f, 0.22f, 1.05f, 0.19f, 0.86f, 0.9f)
            curveToRelative(0.0f, 0.56f, -0.55f, 0.84f, -1.0f, 1.0f)
            curveToRelative(0.0f, 0.77f, 1.86f, 0.56f, 1.0f, 1.39f)
            arcToRelative(2.78f, 2.78f, 0.0f, false, false, -2.0f, 2.4f)
            curveToRelative(1.39f, 0.06f, 2.7f, -1.12f, 4.22f, -1.18f)
            curveToRelative(0.35f, 0.15f, 0.28f, 0.46f, 0.38f, 0.74f)
            curveToRelative(-1.81f, -0.28f, -5.27f, 1.5f, -5.0f, 2.89f)
            curveToRelative(1.09f, 1.31f, 3.19f, -2.0f, 4.11f, -0.43f)
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
            moveTo(150.54f, 171.22f)
            curveToRelative(0.28f, 0.0f, 0.43f, -0.63f, 0.47f, -1.0f)
            curveToRelative(-0.31f, -0.49f, -1.12f, -0.93f, -1.06f, -1.62f)
            lineToRelative(-0.53f, 0.38f)
            curveToRelative(0.0f, 0.37f, 0.93f, 0.09f, 0.84f, 0.75f)
            arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.28f, 1.49f)
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
            moveTo(126.39f, 175.0f)
            lineToRelative(0.38f, 0.59f)
            arcToRelative(8.69f, 8.69f, 0.0f, false, false, 0.74f, -1.77f)
            curveToRelative(-1.15f, -0.55f, -0.65f, 1.0f, -1.12f, 1.18f)
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
            moveTo(52.55f, 164.78f)
            curveToRelative(-14.48f, 3.63f, -18.36f, 2.3f, -21.78f, 0.9f)
            curveToRelative(-5.38f, -0.2f, -7.8f, -4.0f, -8.74f, -3.35f)
            curveToRelative(-0.18f, -0.13f, -0.49f, -0.07f, -0.74f, -0.07f)
            curveToRelative(-0.09f, 0.13f, -0.56f, 1.72f, -1.18f, 1.4f)
            curveToRelative(-0.06f, 0.22f, -0.37f, 1.19f, 0.28f, 1.5f)
            curveToRelative(0.12f, 1.0f, -1.0f, 0.87f, -0.65f, 1.86f)
            curveToRelative(1.39f, 0.71f, -0.25f, 2.15f, 0.8f, 3.0f)
            arcToRelative(2.56f, 2.56f, 0.0f, false, true, -0.52f, 1.65f)
            curveToRelative(0.18f, 1.09f, 1.7f, 0.0f, 1.74f, 1.06f)
            curveToRelative(2.17f, 1.0f, 3.82f, 0.4f, 6.09f, 0.81f)
            curveToRelative(0.56f, 0.24f, 0.84f, 0.77f, 1.27f, 1.0f)
            arcToRelative(26.19f, 26.19f, 0.0f, false, true, 14.48f, 3.2f)
            curveToRelative(4.21f, -0.71f, 5.47f, -3.39f, 6.25f, -3.88f)
            lineToRelative(1.86f, 0.06f)
            curveToRelative(-0.37f, -1.18f, 1.12f, -0.62f, 1.5f, -1.4f)
            arcToRelative(0.86f, 0.86f, 0.0f, false, true, 0.9f, 0.37f)
            arcToRelative(24.34f, 24.34f, 0.0f, false, false, 3.07f, 0.07f)
            curveToRelative(0.41f, -0.5f, -0.52f, -0.5f, -0.15f, -1.0f)
            curveToRelative(0.74f, 0.0f, 6.74f, -3.23f, 7.67f, -3.35f)
            curveToRelative(1.16f, 0.31f, 3.35f, 1.07f, 4.85f, -0.31f)
            curveToRelative(0.13f, 0.12f, 1.31f, 0.24f, 1.12f, -0.44f)
            curveToRelative(0.87f, -0.59f, 2.21f, -0.56f, 2.67f, -1.55f)
            curveToRelative(7.0f, -0.16f, 7.26f, -1.14f, 7.78f, -1.74f)
            lineTo(80.3f, 164.0f)
            lineToRelative(4.0f, -2.15f)
            curveToRelative(0.47f, -0.81f, 0.0f, -1.86f, 0.37f, -2.55f)
            curveToRelative(3.23f, -2.27f, 4.08f, -4.29f, 5.32f, -4.1f)
            lineToRelative(0.59f, -1.43f)
            curveToRelative(-5.36f, 3.87f, -28.0f, 6.42f, -38.0f, 11.0f)
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
            moveTo(77.44f, 71.85f)
            curveToRelative(0.13f, 0.15f, 0.47f, 0.0f, 0.38f, 0.28f)
            verticalLineToRelative(0.47f)
            lineToRelative(1.06f, 0.15f)
            curveToRelative(0.77f, 3.45f, 4.78f, 2.86f, 5.65f, 2.15f)
            curveToRelative(1.43f, -0.07f, 0.59f, 1.0f, 1.28f, 1.11f)
            curveToRelative(2.39f, -1.24f, 3.94f, 1.62f, 6.18f, 1.34f)
            curveToRelative(0.65f, 0.81f, 1.71f, 0.0f, 2.33f, 0.69f)
            arcToRelative(2.52f, 2.52f, 0.0f, false, true, 1.77f, 0.43f)
            curveToRelative(-1.26f, 2.0f, -5.4f, 0.46f, -6.46f, -0.12f)
            curveToRelative(-2.57f, -0.69f, -2.57f, 3.51f, -9.48f, 3.35f)
            curveToRelative(-1.55f, -0.37f, -1.58f, 1.06f, -2.24f, 1.87f)
            curveToRelative(0.07f, 0.62f, -0.56f, 0.77f, -0.9f, 1.0f)
            curveToRelative(0.66f, 1.66f, -1.9f, 5.0f, -1.0f, 7.46f)
            curveToRelative(-0.81f, 3.46f, 0.0f, 6.09f, 0.74f, 6.28f)
            curveToRelative(0.1f, 0.34f, 0.25f, 0.87f, -0.21f, 1.0f)
            curveToRelative(2.0f, 6.46f, 5.12f, 9.3f, 6.71f, 11.63f)
            curveToRelative(1.21f, 1.93f, 1.71f, 4.22f, 3.35f, 5.9f)
            curveToRelative(0.54f, 1.56f, 2.0f, 3.0f, 2.46f, 4.54f)
            curveToRelative(1.27f, 0.5f, 3.2f, 6.7f, 6.4f, 9.64f)
            curveToRelative(0.65f, 1.05f, 2.52f, 0.49f, 2.77f, 2.0f)
            curveToRelative(1.67f, 1.12f, 3.0f, 3.45f, 5.28f, 3.73f)
            curveToRelative(0.56f, -0.47f, 0.78f, 0.06f, 1.27f, 0.28f)
            arcToRelative(15.9f, 15.9f, 0.0f, false, false, 4.0f, 0.37f)
            curveToRelative(0.78f, 0.71f, 0.5f, 1.93f, 1.74f, 2.11f)
            curveToRelative(1.24f, 0.75f, 2.8f, -0.25f, 4.0f, 0.38f)
            curveToRelative(0.45f, 1.82f, 1.71f, 1.24f, 1.87f, 1.24f)
            curveToRelative(0.46f, 0.81f, 1.3f, 1.12f, 2.0f, 1.8f)
            lineToRelative(1.28f, -0.06f)
            curveToRelative(-0.12f, 0.53f, 1.21f, 1.31f, 0.0f, 1.49f)
            curveToRelative(-1.21f, -0.15f, -4.0f, -0.81f, -4.26f, -0.68f)
            curveToRelative(0.22f, 0.43f, 0.13f, 0.46f, -0.06f, 0.9f)
            arcToRelative(4.21f, 4.21f, 0.0f, false, false, -3.82f, -0.31f)
            curveToRelative(-2.91f, -1.0f, -3.36f, 0.71f, -3.58f, 1.0f)
            arcToRelative(19.46f, 19.46f, 0.0f, false, false, -5.0f, -0.06f)
            curveToRelative(0.12f, 1.62f, -3.42f, 0.43f, -1.18f, 2.08f)
            curveToRelative(0.65f, 0.06f, 2.0f, -0.19f, 2.08f, 0.53f)
            curveToRelative(0.0f, 0.0f, -5.35f, -0.34f, -8.64f, 2.0f)
            curveToRelative(0.41f, 0.28f, -1.46f, 1.54f, -1.21f, 3.64f)
            curveToRelative(-2.08f, 0.95f, -1.37f, 1.83f, -1.34f, 2.0f)
            curveToRelative(0.25f, 1.0f, -1.15f, 0.68f, -1.0f, 1.7f)
            curveToRelative(-0.5f, 0.5f, -1.34f, -0.06f, -1.87f, 0.44f)
            arcToRelative(1.66f, 1.66f, 0.0f, false, true, -0.52f, 1.86f)
            curveToRelative(-2.0f, -1.6f, -3.08f, 0.25f, -3.79f, 0.47f)
            curveToRelative(0.43f, 1.71f, 3.11f, -0.34f, 3.11f, 1.18f)
            curveToRelative(0.43f, 0.41f, 1.18f, 0.56f, 1.27f, 1.21f)
            curveToRelative(-0.34f, 0.63f, -1.0f, 0.56f, -1.55f, 1.0f)
            curveToRelative(0.43f, 0.31f, 1.36f, -0.07f, 1.39f, 0.59f)
            curveToRelative(1.0f, 0.16f, 0.84f, -1.51f, 3.61f, -1.87f)
            curveToRelative(2.47f, -0.13f, 2.0f, 1.43f, 2.0f, 1.43f)
            curveToRelative(1.31f, 0.38f, 3.11f, -1.55f, 3.83f, 0.6f)
            curveToRelative(1.54f, 2.6f, 3.25f, -0.94f, 6.71f, 0.8f)
            curveToRelative(0.31f, 4.72f, 5.32f, 2.52f, 5.87f, 2.55f)
            curveToRelative(4.31f, -0.14f, 2.12f, 6.07f, 3.73f, 6.0f)
            curveToRelative(1.44f, -3.62f, 3.55f, -1.3f, 4.0f, -0.65f)
            curveToRelative(2.14f, 1.67f, 2.92f, -3.23f, 4.0f, -3.67f)
            curveToRelative(1.81f, -0.31f, 3.0f, -2.24f, 4.54f, -3.0f)
            curveToRelative(0.25f, -1.09f, 1.62f, -1.49f, 1.43f, -2.76f)
            arcToRelative(8.61f, 8.61f, 0.0f, false, true, 3.26f, -3.3f)
            curveToRelative(-1.49f, -1.37f, 2.65f, -4.66f, 4.33f, -5.22f)
            arcToRelative(36.72f, 36.72f, 0.0f, false, true, 3.73f, -5.22f)
            arcToRelative(44.61f, 44.61f, 0.0f, false, false, 1.58f, -9.39f)
            curveToRelative(-0.59f, -2.2f, -0.53f, -4.63f, -1.8f, -6.43f)
            curveToRelative(0.12f, -1.4f, -1.09f, -2.27f, -0.91f, -3.73f)
            curveToRelative(-0.62f, -1.53f, 0.1f, -3.36f, -0.87f, -4.69f)
            verticalLineTo(121.0f)
            arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.83f, -2.89f)
            arcToRelative(17.61f, 17.61f, 0.0f, false, false, -2.0f, -5.91f)
            curveToRelative(0.21f, -1.77f, -1.28f, -2.86f, -0.75f, -4.63f)
            curveToRelative(0.0f, 0.0f, -0.75f, 0.54f, -1.12f, -1.49f)
            lineToRelative(-1.77f, -3.0f)
            curveToRelative(-0.47f, -0.43f, -1.34f, -1.0f, -1.43f, -1.71f)
            arcToRelative(0.83f, 0.83f, 0.0f, false, true, -1.0f, -0.09f)
            curveToRelative(0.4f, -2.0f, -1.81f, -2.83f, -2.92f, -3.79f)
            curveToRelative(-1.31f, 0.0f, -0.5f, -1.46f, -1.25f, -2.0f)
            curveToRelative(-0.9f, -0.87f, -3.2f, -0.53f, -2.61f, -2.46f)
            curveToRelative(-1.06f, 0.25f, -1.49f, -0.77f, -2.55f, -0.31f)
            arcToRelative(2.45f, 2.45f, 0.0f, false, false, -1.27f, -2.23f)
            curveToRelative(-0.65f, 0.09f, -1.3f, 0.49f, -2.0f, 0.24f)
            curveToRelative(-0.84f, -0.52f, -1.28f, -1.49f, -2.52f, -1.21f)
            curveToRelative(-0.87f, -0.65f, -1.77f, -1.77f, -3.14f, -1.64f)
            curveToRelative(-0.77f, -0.85f, -2.0f, -0.81f, -3.14f, -0.88f)
            curveToRelative(-0.65f, -1.18f, -2.58f, -0.74f, -3.0f, -2.11f)
            curveToRelative(-1.43f, -0.22f, -3.43f, -2.85f, -5.07f, -3.2f)
            curveToRelative(-0.71f, -0.28f, -0.71f, -1.0f, -1.48f, -1.18f)
            arcToRelative(0.54f, 0.54f, 0.0f, false, true, 0.21f, -0.6f)
            curveToRelative(-0.65f, -2.44f, 2.33f, -1.21f, 2.33f, -1.21f)
            lineToRelative(-0.62f, 0.6f)
            curveToRelative(0.16f, 0.28f, 0.72f, 0.49f, 0.9f, 0.09f)
            arcToRelative(7.47f, 7.47f, 0.0f, false, true, 2.0f, 1.18f)
            curveToRelative(1.55f, -0.31f, 2.15f, 1.74f, 3.79f, 1.43f)
            curveToRelative(5.06f, -1.24f, 5.07f, 0.59f, 5.07f, 0.59f)
            arcToRelative(8.4f, 8.4f, 0.0f, false, false, 3.29f, -0.22f)
            arcToRelative(5.13f, 5.13f, 0.0f, false, false, 4.17f, -0.46f)
            arcToRelative(10.59f, 10.59f, 0.0f, false, true, 5.31f, 0.68f)
            curveToRelative(0.16f, 0.0f, 0.34f, -0.28f, 0.5f, -0.06f)
            curveToRelative(0.25f, 0.75f, 1.21f, 0.65f, 1.8f, 1.0f)
            lineToRelative(1.55f, 1.0f)
            lineToRelative(0.16f, -0.22f)
            curveToRelative(-0.65f, -0.41f, -1.93f, -0.78f, -1.93f, -1.81f)
            lineToRelative(-2.24f, -1.0f)
            curveToRelative(-0.28f, 1.12f, -1.0f, -0.78f, -1.49f, 0.06f)
            curveToRelative(-1.43f, 0.19f, -2.55f, -1.0f, -3.66f, -1.62f)
            arcToRelative(3.22f, 3.22f, 0.0f, false, true, -2.77f, -1.42f)
            curveToRelative(-0.77f, -0.2f, -1.34f, -1.25f, -1.93f, -1.34f)
            curveToRelative(-1.49f, -1.0f, -9.47f, -2.0f, -9.47f, -2.0f)
            arcToRelative(2.64f, 2.64f, 0.0f, false, false, -2.62f, 1.21f)
            curveToRelative(-0.84f, 0.16f, -1.27f, -0.8f, -2.08f, -1.0f)
            curveToRelative(-0.12f, -1.12f, 1.09f, -1.68f, 1.18f, -2.83f)
            curveToRelative(0.93f, -0.56f, 4.55f, -0.45f, 4.94f, -2.18f)
            arcToRelative(8.4f, 8.4f, 0.0f, false, true, -7.83f, -1.33f)
            curveToRelative(-0.93f, 0.0f, -1.4f, -0.75f, -1.8f, -1.4f)
            curveToRelative(-0.25f, -1.84f, -2.52f, -2.34f, -2.08f, -4.48f)
            curveToRelative(-0.78f, -0.46f, -1.74f, -1.37f, -2.77f, -0.68f)
            curveToRelative(-0.37f, -0.1f, -0.65f, -0.44f, -1.12f, -0.31f)
            curveToRelative(0.56f, 1.12f, -1.12f, 0.4f, -1.0f, 1.37f)
            arcToRelative(14.9f, 14.9f, 0.0f, false, false, -2.39f, 1.24f)
            reflectiveCurveToRelative(-2.55f, 0.52f, -2.68f, 0.62f)
            curveToRelative(-5.63f, -2.0f, -4.38f, 1.86f, -4.94f, 2.73f)
            curveToRelative(0.0f, 2.0f, -3.54f, 3.39f, -3.36f, 3.83f)
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
            moveTo(114.37f, 37.16f)
            curveToRelative(-1.06f, 0.62f, -1.59f, 1.59f, -2.74f, 1.93f)
            arcToRelative(3.22f, 3.22f, 0.0f, false, true, -2.17f, 1.21f)
            curveToRelative(-0.75f, 1.06f, -2.68f, 1.21f, -2.18f, 2.89f)
            curveToRelative(-1.31f, 0.84f, -2.8f, 0.44f, -3.85f, 1.5f)
            curveToRelative(0.0f, 0.37f, 0.0f, 0.83f, -0.31f, 1.0f)
            curveToRelative(-0.41f, 0.0f, -1.15f, -0.31f, -1.5f, 0.31f)
            arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.16f, 1.0f)
            arcToRelative(5.93f, 5.93f, 0.0f, false, true, -2.7f, 2.55f)
            curveToRelative(-0.47f, 0.06f, -1.31f, -0.53f, -1.34f, 0.37f)
            curveToRelative(-0.9f, 0.47f, -2.14f, 0.28f, -2.89f, 1.0f)
            arcToRelative(4.54f, 4.54f, 0.0f, false, true, -2.39f, -0.53f)
            curveToRelative(-0.13f, 0.87f, -1.0f, 0.34f, -1.59f, 0.59f)
            arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.62f, 1.74f)
            curveToRelative(-0.77f, 0.87f, -2.14f, 1.27f, -3.0f, 1.93f)
            curveToRelative(-1.09f, 0.21f, -2.15f, -0.35f, -3.14f, -0.38f)
            curveToRelative(0.47f, 1.37f, -1.06f, 1.0f, -1.65f, 1.34f)
            arcToRelative(2.2f, 2.2f, 0.0f, false, false, -2.17f, -0.44f)
            arcToRelative(1.69f, 1.69f, 0.0f, false, false, -0.75f, 1.0f)
            curveToRelative(-0.77f, 0.28f, -1.33f, 1.65f, -2.3f, 1.06f)
            curveToRelative(-0.71f, 0.18f, -1.61f, 1.0f, -2.39f, 0.43f)
            curveToRelative(-20.62f, 3.93f, -40.65f, 1.28f, -46.83f, 1.06f)
            curveToRelative(-6.08f, -0.54f, -9.52f, -7.12f, -10.51f, -7.83f)
            curveToRelative(-0.15f, 0.4f, -1.27f, 0.52f, -1.27f, 0.68f)
            arcToRelative(2.39f, 2.39f, 0.0f, false, true, 1.55f, 1.4f)
            curveToRelative(-1.15f, 0.4f, 0.38f, 1.34f, -0.65f, 1.71f)
            curveToRelative(0.0f, 0.28f, 0.0f, 3.0f, 0.49f, 3.66f)
            curveToRelative(0.44f, 0.38f, 1.65f, 0.1f, 1.28f, 1.13f)
            curveToRelative(0.0f, 0.09f, 0.06f, 0.24f, -0.06f, 0.31f)
            arcToRelative(1.13f, 1.13f, 0.0f, false, false, -1.06f, -0.47f)
            curveToRelative(-0.12f, 0.56f, 0.38f, 1.21f, -0.43f, 1.34f)
            curveToRelative(-1.0f, -0.22f, -1.06f, 1.0f, -1.5f, 1.58f)
            arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.07f, 1.56f)
            curveToRelative(0.28f, 1.33f, 2.51f, 0.0f, 3.07f, 1.0f)
            curveToRelative(0.53f, -0.1f, 1.43f, -0.44f, 2.0f, 0.0f)
            curveToRelative(0.72f, 1.49f, 3.0f, -0.53f, 3.36f, 1.43f)
            curveToRelative(0.75f, 0.81f, 1.93f, -1.37f, 2.17f, 0.43f)
            curveToRelative(0.44f, 0.25f, 0.72f, 0.94f, 1.28f, 0.47f)
            curveToRelative(0.31f, -0.68f, 1.21f, -0.9f, 1.77f, -1.43f)
            arcToRelative(6.51f, 6.51f, 0.0f, false, false, 3.36f, 0.22f)
            curveToRelative(0.34f, 0.56f, 0.87f, 0.56f, 1.43f, 0.53f)
            arcToRelative(1.07f, 1.07f, 0.0f, false, true, 1.64f, -0.44f)
            curveToRelative(0.44f, 0.65f, 0.94f, 1.37f, 1.93f, 1.0f)
            reflectiveCurveTo(42.0f, 68.0f, 42.0f, 68.0f)
            curveToRelative(0.9f, 0.0f, 2.08f, 0.35f, 2.76f, -0.31f)
            curveToRelative(0.22f, -0.59f, 0.38f, -1.21f, 1.06f, -1.4f)
            curveToRelative(0.75f, 0.0f, 1.61f, 2.08f, 3.2f, 1.49f)
            curveToRelative(1.0f, -0.34f, 0.37f, -2.51f, 2.08f, -1.86f)
            curveToRelative(2.79f, 0.26f, 2.15f, 1.83f, 2.34f, 1.86f)
            curveToRelative(0.58f, -0.34f, 3.07f, -1.92f, 3.72f, -1.7f)
            curveToRelative(1.6f, 2.42f, 2.15f, 1.8f, 2.52f, 1.7f)
            curveToRelative(0.22f, -0.31f, 0.09f, -0.87f, 0.59f, -0.9f)
            reflectiveCurveToRelative(2.64f, 2.59f, 4.2f, -0.9f)
            arcToRelative(9.13f, 9.13f, 0.0f, false, false, 2.61f, -1.18f)
            curveToRelative(1.55f, 1.62f, 3.14f, -1.06f, 4.26f, 1.71f)
            curveToRelative(0.87f, -0.06f, 1.77f, -0.81f, 2.67f, -0.22f)
            curveToRelative(1.08f, 0.47f, -0.38f, 2.18f, 1.27f, 2.15f)
            arcToRelative(1.48f, 1.48f, 0.0f, false, true, -0.15f, 1.49f)
            curveToRelative(1.0f, 0.37f, 1.74f, -0.56f, 2.45f, -1.0f)
            curveToRelative(0.19f, -1.22f, 1.71f, -0.87f, 1.71f, -2.15f)
            curveToRelative(0.28f, -0.65f, -0.53f, -0.9f, -0.12f, -1.49f)
            curveToRelative(0.68f, -0.37f, 0.56f, -1.06f, 0.65f, -1.65f)
            curveToRelative(2.19f, -2.53f, 5.21f, 0.85f, 6.34f, -1.86f)
            curveToRelative(0.68f, 0.0f, 2.34f, 2.0f, 3.57f, 0.06f)
            curveToRelative(0.0f, -0.53f, -0.34f, -1.68f, 0.31f, -2.0f)
            lineToRelative(2.55f, -0.06f)
            curveToRelative(-0.09f, -0.19f, -0.34f, -1.21f, 1.71f, -1.12f)
            arcToRelative(6.19f, 6.19f, 0.0f, false, false, 4.7f, 0.81f)
            curveToRelative(0.21f, 0.53f, 0.61f, 0.0f, 0.89f, 0.15f)
            arcToRelative(3.09f, 3.09f, 0.0f, false, true, -0.09f, 3.0f)
            lineToRelative(2.49f, 0.59f)
            curveToRelative(0.4f, 0.59f, -0.19f, 1.12f, -0.1f, 1.74f)
            curveToRelative(1.85f, 0.0f, 1.84f, 1.61f, 2.77f, 1.86f)
            curveToRelative(-0.1f, 1.46f, 1.37f, 0.06f, 1.71f, -0.15f)
            reflectiveCurveToRelative(2.21f, 0.88f, 3.29f, -1.59f)
            curveToRelative(1.28f, 0.34f, 3.21f, 0.1f, 3.42f, 1.8f)
            curveToRelative(0.72f, 0.75f, 3.0f, -0.71f, 3.36f, -0.21f)
            reflectiveCurveToRelative(0.47f, 0.71f, 0.9f, 1.0f)
            arcToRelative(2.23f, 2.23f, 0.0f, false, true, 2.46f, -0.53f)
            lineToRelative(0.37f, 0.68f)
            lineToRelative(2.76f, -0.46f)
            curveToRelative(0.66f, 1.83f, 2.86f, 0.19f, 4.0f, 1.43f)
            curveToRelative(1.25f, 0.09f, 6.2f, 3.56f, 7.68f, 3.2f)
            curveToRelative(-1.0f, -1.09f, -1.68f, -2.52f, -2.89f, -3.36f)
            curveToRelative(-0.07f, -1.18f, -1.09f, -1.55f, -1.34f, -2.61f)
            arcToRelative(1.89f, 1.89f, 0.0f, false, true, -2.0f, -1.55f)
            curveToRelative(-2.0f, 0.29f, -0.93f, -2.58f, -0.68f, -3.73f)
            curveToRelative(-0.56f, 0.0f, 0.0f, -0.84f, -0.66f, -0.59f)
            curveToRelative(0.13f, -1.12f, -0.49f, -1.74f, -0.9f, -2.61f)
            curveToRelative(-1.15f, -0.62f, -2.52f, -0.84f, -3.14f, -2.12f)
            curveToRelative(0.22f, -0.77f, -0.59f, -1.52f, -0.21f, -2.29f)
            curveToRelative(-0.84f, -0.78f, -2.05f, -1.22f, -2.55f, -2.31f)
            curveToRelative(-0.84f, 0.19f, -0.19f, -0.9f, -0.65f, -1.21f)
            curveToRelative(-0.35f, -0.9f, 0.83f, -1.3f, 0.65f, -2.08f)
            curveToRelative(0.53f, -0.75f, 1.68f, 0.62f, 2.0f, -0.69f)
            curveToRelative(1.24f, 0.26f, 1.77f, 1.31f, 2.89f, 1.87f)
            curveToRelative(0.28f, -0.13f, 0.77f, -0.56f, 1.0f, -0.06f)
            curveToRelative(0.47f, 1.0f, 2.15f, 1.18f, 2.92f, 2.0f)
            curveToRelative(1.93f, -0.5f, 3.48f, 0.9f, 5.16f, 1.49f)
            curveToRelative(0.19f, 0.93f, 1.43f, 0.87f, 1.55f, 1.87f)
            curveToRelative(0.32f, 0.46f, 1.0f, 0.8f, 1.34f, 0.43f)
            curveToRelative(-0.59f, -1.3f, -1.12f, -2.58f, -2.39f, -3.26f)
            curveToRelative(-0.35f, -0.25f, 0.0f, -0.62f, 0.15f, -0.84f)
            curveToRelative(-0.31f, -0.56f, -0.43f, -1.18f, -1.11f, -1.49f)
            arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.59f, -0.9f)
            curveToRelative(1.79f, 0.0f, 2.85f, 1.36f, 4.56f, 1.27f)
            curveToRelative(0.25f, 0.68f, 0.91f, -0.31f, 1.34f, 0.22f)
            curveToRelative(0.25f, 0.46f, -0.25f, 1.36f, 0.44f, 1.49f)
            curveToRelative(0.33f, -0.87f, 1.17f, 0.5f, 1.27f, -0.65f)
            curveToRelative(0.15f, -0.78f, -1.0f, -1.34f, -0.06f, -1.87f)
            curveToRelative(2.0f, -0.49f, 2.85f, 3.51f, 3.0f, 3.95f)
            lineToRelative(0.81f, -0.22f)
            curveToRelative(1.15f, 1.27f, 2.83f, 1.87f, 3.45f, 3.52f)
            curveToRelative(0.59f, -0.1f, 1.08f, -0.72f, 1.61f, -0.16f)
            curveToRelative(0.68f, 2.38f, 2.33f, 1.18f, 2.33f, 1.18f)
            curveToRelative(-0.25f, -0.37f, -1.0f, -0.81f, -0.68f, -1.65f)
            arcToRelative(4.59f, 4.59f, 0.0f, false, true, -2.46f, -1.12f)
            curveToRelative(-0.24f, -0.65f, 0.41f, -1.08f, 0.44f, -1.49f)
            arcToRelative(3.24f, 3.24f, 0.0f, false, true, -3.0f, -2.46f)
            lineToRelative(-0.28f, -0.06f)
            curveToRelative(-0.41f, -0.68f, -0.87f, -1.43f, -1.22f, -2.08f)
            curveToRelative(1.5f, -1.28f, -0.68f, -2.67f, 0.47f, -4.0f)
            curveToRelative(-1.34f, -1.71f, -0.47f, -3.39f, -1.65f, -3.36f)
            arcToRelative(1.38f, 1.38f, 0.0f, false, true, -1.27f, -0.43f)
            curveToRelative(0.0f, -0.69f, -0.59f, -1.09f, -0.65f, -1.74f)
            curveToRelative(-1.0f, 0.06f, -1.21f, -0.6f, -2.0f, -1.0f)
            arcToRelative(0.79f, 0.79f, 0.0f, false, true, 0.31f, -0.84f)
            curveToRelative(-0.56f, -0.5f, -2.05f, -0.37f, -1.59f, -1.49f)
            arcToRelative(2.86f, 2.86f, 0.0f, false, false, -1.39f, -0.75f)
            curveToRelative(-0.13f, -0.49f, -0.28f, -1.15f, -0.75f, -1.4f)
            arcToRelative(2.63f, 2.63f, 0.0f, false, true, -2.55f, -0.46f)
            curveToRelative(-0.65f, 0.31f, -1.0f, -0.5f, -1.71f, -0.43f)
            curveToRelative(-3.58f, -0.75f, -8.64f, 1.05f, -8.64f, 1.05f)
            curveToRelative(-2.43f, -1.44f, -7.89f, 3.17f, -10.31f, 4.32f)
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
            moveTo(130.0f, 29.0f)
            reflectiveCurveToRelative(4.66f, 0.52f, 5.31f, 1.49f)
            curveToRelative(0.66f, -0.47f, 1.4f, 0.0f, 2.09f, -0.38f)
            curveToRelative(0.0f, 0.66f, 1.0f, 0.16f, 0.9f, 1.0f)
            curveToRelative(0.8f, -0.22f, 3.07f, 1.0f, 3.0f, 2.17f)
            curveToRelative(0.53f, 0.1f, 0.47f, 0.75f, 1.12f, 0.38f)
            curveToRelative(0.09f, 0.74f, 2.0f, 1.56f, 2.55f, 0.65f)
            curveToRelative(0.33f, -1.0f, -2.14f, -0.65f, -2.77f, -1.12f)
            curveToRelative(0.0f, -0.65f, -0.4f, -1.21f, -1.12f, -1.0f)
            curveToRelative(-0.25f, -2.0f, -3.17f, -1.56f, -3.0f, -2.68f)
            curveToRelative(-1.0f, -0.46f, -2.3f, 0.73f, -6.0f, -1.64f)
            verticalLineToRelative(0.59f)
            curveToRelative(-0.71f, -0.5f, -1.46f, 0.22f, -2.11f, 0.53f)
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
            moveTo(157.94f, 22.15f)
            lineToRelative(0.15f, 0.16f)
            curveToRelative(-0.28f, 0.21f, 0.1f, 0.68f, 0.16f, 0.59f)
            curveToRelative(0.06f, 0.09f, 0.21f, 0.21f, 0.06f, 0.31f)
            curveToRelative(-0.72f, 0.62f, -0.87f, -0.9f, -1.34f, 0.15f)
            curveToRelative(0.72f, 0.37f, -0.12f, 0.93f, 0.16f, 1.4f)
            curveToRelative(-0.1f, -0.13f, -0.25f, 0.0f, -0.37f, -0.06f)
            lineToRelative(-0.16f, 0.37f)
            lineToRelative(-0.47f, -0.21f)
            lineToRelative(-0.21f, 0.43f)
            lineToRelative(0.21f, 0.16f)
            curveToRelative(-0.19f, 0.52f, -3.0f, 0.47f, -2.36f, 2.0f)
            curveToRelative(0.47f, 1.11f, 1.49f, 0.47f, 1.86f, 0.66f)
            curveToRelative(1.54f, -0.74f, 1.56f, -1.4f, 1.56f, -1.4f)
            arcToRelative(11.84f, 11.84f, 0.0f, false, true, 2.18f, -0.47f)
            curveToRelative(0.12f, 0.44f, 0.84f, 0.44f, 1.24f, 0.31f)
            curveToRelative(0.15f, -0.59f, -0.84f, -0.4f, -0.75f, -1.0f)
            curveToRelative(-0.34f, -0.25f, -0.06f, -1.31f, 0.1f, -1.49f)
            curveToRelative(-0.13f, 0.0f, -0.34f, 0.43f, -0.53f, 0.06f)
            curveToRelative(0.15f, -0.47f, 0.9f, -1.0f, 0.43f, -1.4f)
            curveToRelative(-0.28f, -1.4f, 1.81f, -1.74f, 0.9f, -3.0f)
            curveToRelative(0.5f, -0.84f, -0.4f, -1.22f, 0.0f, -2.12f)
            curveToRelative(-0.06f, -0.28f, -1.24f, -0.31f, -1.0f, 0.38f)
            curveToRelative(-0.37f, 0.12f, -0.81f, -0.25f, -1.12f, -0.07f)
            curveToRelative(0.72f, 0.75f, -0.71f, 0.84f, -0.22f, 1.65f)
            lineToRelative(0.38f, 0.44f)
            arcToRelative(3.69f, 3.69f, 0.0f, false, false, -0.9f, 2.08f)
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
            moveTo(156.23f, 20.9f)
            lineToRelative(0.15f, 0.13f)
            arcToRelative(11.7f, 11.7f, 0.0f, false, true, 1.34f, -4.54f)
            curveToRelative(-0.84f, 1.4f, -2.11f, 2.71f, -1.49f, 4.41f)
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
            moveTo(136.3f, 17.67f)
            curveToRelative(0.0f, 0.53f, 0.6f, 0.28f, 0.82f, 0.25f)
            arcTo(16.63f, 16.63f, 0.0f, false, false, 139.6f, 19.0f)
            curveToRelative(-0.28f, -0.28f, 0.22f, -0.34f, 0.12f, -0.62f)
            curveToRelative(-0.74f, 0.43f, -1.3f, -0.44f, -2.08f, -0.37f)
            curveToRelative(-0.12f, -0.56f, -1.0f, -0.44f, -1.34f, -0.38f)
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
            moveTo(132.14f, 13.07f)
            arcToRelative(16.4f, 16.4f, 0.0f, false, true, -2.7f, -0.46f)
            arcToRelative(3.22f, 3.22f, 0.0f, false, false, 1.49f, 0.59f)
            curveToRelative(1.18f, 0.9f, 1.24f, 2.7f, 2.61f, 3.45f)
            curveToRelative(0.65f, 1.0f, 1.68f, 0.59f, 2.61f, 1.0f)
            lineToRelative(0.15f, -0.22f)
            curveToRelative(-0.52f, 0.13f, -0.8f, -1.0f, -1.7f, -0.74f)
            curveToRelative(-0.16f, -0.81f, -0.9f, 0.37f, -0.9f, -0.47f)
            curveToRelative(-0.63f, 0.0f, -0.39f, -2.33f, -1.65f, -2.0f)
            curveToRelative(-0.31f, -0.15f, -0.28f, -0.78f, 0.09f, -1.12f)
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
            moveTo(141.9f, 1.73f)
            curveToRelative(0.34f, 0.4f, 1.4f, 0.12f, 1.87f, 0.74f)
            lineToRelative(0.21f, -0.09f)
            arcToRelative(1.39f, 1.39f, 0.0f, false, false, -2.08f, -0.65f)
        }
    }
        .build()
}
