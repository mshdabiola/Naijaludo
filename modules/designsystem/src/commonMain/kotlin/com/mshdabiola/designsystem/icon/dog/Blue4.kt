package com.mshdabiola.ludo.screen.game.component.dog

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

fun Dog.getBlue(iconColor: Long, accentColor: Long): ImageVector {
    return Builder(
        name = "Blue4",
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
            moveTo(199.94f, 149.89f)
            curveToRelative(-1.55f, 3.69f, -4.92f, 6.41f, -7.58f, 9.43f)
            curveToRelative(-2.94f, 1.73f, -1.17f, 5.0f, -2.37f, 7.47f)
            curveToRelative(-0.07f, 1.52f, -1.88f, 1.2f, -1.78f, 2.8f)
            curveToRelative(-3.08f, 2.48f, -5.84f, 6.41f, -10.0f, 7.33f)
            curveToRelative(-3.4f, 2.34f, -8.0f, 1.67f, -11.73f, 0.75f)
            curveToRelative(-2.48f, -1.46f, -5.2f, -3.09f, -7.58f, -4.58f)
            arcToRelative(65.44f, 65.44f, 0.0f, false, true, -6.13f, -6.37f)
            curveToRelative(-2.72f, -2.52f, -5.1f, -6.17f, -7.55f, -8.68f)
            curveToRelative(-2.62f, -3.23f, -5.74f, -6.62f, -8.68f, -9.71f)
            curveToRelative(-7.54f, -6.38f, -20.0f, -10.84f, -24.23f, -12.22f)
            curveToRelative(-6.0f, -2.67f, -31.29f, -3.05f, -33.34f, -2.66f)
            curveToRelative(-21.0f, -1.42f, -21.91f, -5.0f, -26.61f, -5.0f)
            curveToRelative(-1.0f, 0.21f, -2.24f, 0.39f, -3.33f, 0.67f)
            curveToRelative(-9.85f, 3.93f, -18.78f, 9.6f, -28.31f, 14.38f)
            curveToRelative(-4.29f, 2.91f, -17.33f, 11.9f, -20.34f, 7.8f)
            curveToRelative(-2.57f, -3.7f, 7.0f, -9.0f, 11.16f, -11.13f)
            curveToRelative(0.74f, -0.35f, 16.16f, -10.24f, 18.35f, -11.47f)
            curveToRelative(4.64f, -2.31f, 9.11f, -4.33f, 12.86f, -8.26f)
            curveToRelative(1.09f, -1.89f, -0.95f, -6.66f, -1.87f, -7.9f)
            curveToRelative(-1.41f, -2.73f, -3.08f, -10.34f, -4.0f, -14.21f)
            curveToRelative(-0.82f, -6.09f, -0.36f, -12.47f, -1.7f, -18.27f)
            curveToRelative(-0.43f, -8.15f, -12.36f, -16.18f, -12.09f, -18.71f)
            curveToRelative(-2.75f, -4.68f, -3.47f, -25.72f, -5.0f, -32.56f)
            curveToRelative(-0.29f, -1.0f, 0.35f, -1.84f, 0.67f, -2.72f)
            curveToRelative(1.31f, -1.0f, 1.13f, -3.0f, 2.62f, -3.72f)
            curveToRelative(2.23f, -0.5f, 4.61f, -1.53f, 6.8f, -0.29f)
            curveToRelative(1.35f, -0.42f, 2.45f, 1.0f, 3.51f, 1.63f)
            curveToRelative(1.13f, 4.25f, -4.92f, 6.0f, -3.83f, 10.45f)
            curveToRelative(0.61f, -1.32f, 3.58f, -2.0f, 5.18f, -1.59f)
            curveToRelative(1.52f, -0.74f, 5.36f, -0.2f, 5.88f, 1.52f)
            curveToRelative(0.21f, 4.39f, -5.1f, 6.77f, -5.28f, 11.05f)
            curveToRelative(0.32f, 2.73f, -1.06f, 5.71f, 1.34f, 7.66f)
            curveToRelative(8.87f, 8.82f, 19.75f, 16.11f, 26.19f, 27.28f)
            curveToRelative(3.05f, 4.78f, 8.0f, 8.0f, 12.08f, 12.0f)
            lineToRelative(4.5f, -1.64f)
            reflectiveCurveTo(81.0f, 87.65f, 83.0f, 88.25f)
            curveToRelative(1.62f, 0.79f, 0.43f, 4.43f, 0.6f, 5.35f)
            curveToRelative(1.25f, 0.75f, 7.48f, -1.49f, 11.12f, -2.13f)
            curveToRelative(5.57f, -1.56f, 11.52f, -2.69f, 17.08f, -4.25f)
            curveToRelative(2.0f, -0.82f, 9.47f, -2.3f, 11.34f, -2.0f)
            curveToRelative(1.49f, -0.22f, 8.58f, -1.46f, 10.53f, -2.0f)
            curveToRelative(2.08f, -2.49f, 3.93f, -22.32f, 5.1f, -30.0f)
            curveToRelative(0.32f, -3.76f, -0.18f, -7.87f, -0.25f, -11.48f)
            curveToRelative(2.16f, -4.47f, 2.72f, -9.57f, 4.0f, -14.35f)
            curveToRelative(0.64f, -1.74f, 2.24f, -2.23f, 3.9f, -2.55f)
            curveToRelative(3.0f, 0.6f, 5.88f, -1.24f, 8.86f, 0.25f)
            curveToRelative(4.45f, 2.3f, -1.31f, 7.9f, -4.07f, 9.1f)
            curveTo(149.0f, 35.31f, 148.5f, 51.72f, 149.0f, 58.91f)
            curveToRelative(0.21f, 9.82f, 2.2f, 19.0f, 2.91f, 28.56f)
            curveToRelative(1.38f, 7.9f, 9.43f, 13.28f, 10.38f, 21.5f)
            curveToRelative(0.0f, 9.64f, 3.14f, 34.86f, 8.83f, 37.09f)
            curveToRelative(1.87f, -0.31f, 3.25f, -1.45f, 5.2f, -1.55f)
            curveToRelative(0.92f, -0.64f, 2.34f, -0.39f, 3.12f, -1.17f)
            curveToRelative(3.51f, -0.89f, 6.7f, -2.7f, 10.49f, -1.81f)
            curveToRelative(2.23f, 0.71f, 4.67f, 1.56f, 6.2f, 3.26f)
            curveToRelative(0.53f, 2.37f, 4.39f, 2.06f, 3.82f, 5.1f)
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
            moveTo(158.35f, 159.67f)
            curveToRelative(0.53f, -0.18f, 0.85f, 0.57f, 1.38f, 0.67f)
            curveToRelative(0.53f, 0.5f, -0.07f, 1.6f, 0.85f, 1.77f)
            curveToRelative(0.89f, -0.17f, 1.38f, 0.68f, 2.13f, 0.85f)
            curveToRelative(0.06f, -0.32f, -0.22f, -1.0f, 0.25f, -1.27f)
            curveToRelative(1.41f, 0.53f, 0.32f, -1.67f, 1.59f, -1.1f)
            arcToRelative(26.64f, 26.64f, 0.0f, false, false, -1.59f, -2.38f)
            arcToRelative(3.12f, 3.12f, 0.0f, false, true, -2.91f, 0.08f)
            arcToRelative(1.27f, 1.27f, 0.0f, false, false, -0.93f, -0.5f)
            curveToRelative(-0.35f, -0.57f, -0.88f, -0.74f, -1.0f, -1.45f)
            curveToRelative(-1.0f, -0.11f, -0.42f, 1.0f, -0.92f, 1.35f)
            curveToRelative(-0.32f, 0.92f, 0.43f, 1.59f, 1.17f, 2.0f)
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
            moveTo(60.24f, 128.71f)
            lineToRelative(-1.81f, -0.43f)
            curveToRelative(0.22f, 0.28f, 1.25f, 0.92f, 1.81f, 0.43f)
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
            moveTo(37.53f, 35.18f)
            arcToRelative(2.69f, 2.69f, 0.0f, false, false, -1.7f, 0.18f)
            curveToRelative(-0.33f, -1.82f, -2.0f, -1.38f, -2.13f, -0.85f)
            curveToRelative(0.18f, 0.28f, 0.0f, 0.6f, -0.17f, 0.85f)
            curveToRelative(-0.57f, -0.54f, -1.0f, 0.67f, -1.78f, 0.49f)
            curveToRelative(-0.43f, -0.64f, -0.21f, -1.38f, -0.95f, -1.77f)
            curveToRelative(-2.0f, -0.19f, -1.0f, 3.0f, -2.62f, 2.87f)
            curveToRelative(-0.05f, 3.58f, 1.65f, 6.59f, 2.12f, 10.06f)
            curveToRelative(0.21f, 0.85f, 1.24f, 1.17f, 1.7f, 1.7f)
            curveToRelative(-0.39f, -9.5f, 5.87f, -9.74f, 5.53f, -13.53f)
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
            moveTo(194.17f, 148.86f)
            arcToRelative(1.79f, 1.79f, 0.0f, false, true, -1.45f, -1.0f)
            arcToRelative(3.63f, 3.63f, 0.0f, false, false, -1.53f, -3.47f)
            curveToRelative(-3.0f, -3.3f, -8.0f, -0.43f, -11.48f, 0.49f)
            curveToRelative(-1.34f, 0.42f, -0.49f, 2.27f, -2.0f, 2.55f)
            reflectiveCurveToRelative(-3.22f, -1.77f, -4.5f, -0.07f)
            curveToRelative(-3.61f, 1.78f, -6.06f, -0.49f, -6.87f, -1.0f)
            curveToRelative(-0.29f, -1.18f, 1.45f, -0.78f, 1.45f, -0.78f)
            curveToRelative(-4.15f, -4.85f, -4.18f, -11.33f, -5.0f, -17.5f)
            curveToRelative(-1.0f, 0.53f, 0.68f, 3.0f, -1.09f, 2.37f)
            arcToRelative(8.35f, 8.35f, 0.0f, false, true, -1.0f, -6.55f)
            arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.92f, -0.07f)
            arcToRelative(53.68f, 53.68f, 0.0f, false, true, -0.56f, -6.62f)
            curveToRelative(-1.32f, 0.39f, -0.82f, -1.14f, -1.38f, -1.63f)
            curveToRelative(-0.57f, -0.78f, -1.0f, -2.0f, -1.78f, -2.55f)
            curveToRelative(-0.46f, -0.5f, -0.17f, -1.28f, 0.08f, -1.77f)
            curveToRelative(0.46f, -0.32f, 0.88f, -1.0f, 1.51f, -0.61f)
            curveToRelative(0.43f, 0.32f, 0.75f, 1.0f, 1.21f, 0.5f)
            curveToRelative(0.36f, -2.2f, -1.24f, -4.08f, -1.28f, -6.2f)
            curveToRelative(-1.8f, -4.5f, -6.05f, -8.0f, -7.58f, -12.68f)
            lineToRelative(-1.42f, -4.5f)
            curveToRelative(-0.35f, -3.3f, -1.45f, -6.66f, -1.13f, -10.0f)
            curveToRelative(-1.73f, -11.26f, -2.73f, -23.52f, -1.41f, -35.43f)
            arcToRelative(33.92f, 33.92f, 0.0f, false, true, 1.77f, -8.85f)
            curveToRelative(1.13f, -2.2f, 3.65f, -1.92f, 5.0f, -3.65f)
            arcToRelative(2.51f, 2.51f, 0.0f, false, false, 0.67f, -1.52f)
            arcToRelative(4.86f, 4.86f, 0.0f, false, true, -2.0f, 1.34f)
            curveToRelative(-0.53f, 0.0f, -0.53f, -0.67f, -0.28f, -0.92f)
            curveToRelative(0.53f, -0.67f, 1.41f, -1.17f, 1.27f, -2.12f)
            arcToRelative(0.67f, 0.67f, 0.0f, false, false, -1.09f, -0.11f)
            curveToRelative(-0.43f, 0.32f, -0.43f, 1.38f, -1.18f, 1.0f)
            curveToRelative(-0.35f, -0.64f, 0.65f, -1.13f, 0.08f, -1.77f)
            curveToRelative(-1.67f, -0.22f, -2.38f, 1.41f, -3.76f, 1.95f)
            curveToRelative(-0.49f, 0.28f, -0.32f, -0.57f, -0.85f, -0.25f)
            curveToRelative(-0.53f, -0.39f, 0.07f, -1.56f, -0.85f, -1.46f)
            curveToRelative(-0.49f, -0.1f, -0.85f, 0.68f, -1.27f, 0.25f)
            curveToRelative(-2.66f, 1.77f, -2.13f, 5.63f, -2.56f, 8.43f)
            curveToRelative(0.11f, 1.53f, 0.71f, 3.62f, -0.74f, 4.82f)
            arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.21f, 0.0f)
            curveToRelative(-2.19f, 2.87f, 0.68f, 6.13f, -0.49f, 9.21f)
            curveToRelative(-0.18f, 2.55f, 0.0f, 5.31f, -0.53f, 7.72f)
            curveToRelative(0.6f, 0.64f, 2.34f, -0.74f, 2.48f, 0.93f)
            curveToRelative(0.0f, 1.23f, 1.48f, 3.08f, -0.25f, 3.82f)
            curveToRelative(-0.46f, -0.14f, -0.53f, 0.29f, -0.78f, 0.53f)
            arcToRelative(1.68f, 1.68f, 0.0f, false, true, -1.34f, -1.0f)
            arcToRelative(9.83f, 9.83f, 0.0f, false, false, -0.36f, -1.88f)
            lineToRelative(-0.43f, 4.0f)
            curveToRelative(1.11f, -0.35f, 1.17f, 1.0f, 1.95f, 1.52f)
            curveToRelative(0.0f, 0.43f, 0.43f, 0.64f, 0.71f, 0.78f)
            arcToRelative(3.12f, 3.12f, 0.0f, false, true, 1.42f, 0.32f)
            arcToRelative(1.42f, 1.42f, 0.0f, false, true, 0.18f, 1.56f)
            curveToRelative(-0.71f, 0.75f, -0.21f, 2.66f, -1.78f, 2.63f)
            curveToRelative(-0.17f, 0.24f, 0.0f, 0.88f, -0.53f, 0.77f)
            curveToRelative(0.39f, -0.74f, -0.78f, -1.09f, -0.74f, -1.8f)
            curveToRelative(-0.29f, -1.6f, -1.13f, -3.0f, -1.28f, -4.57f)
            arcToRelative(1.86f, 1.86f, 0.0f, false, false, 0.07f, 1.7f)
            curveToRelative(-0.07f, 1.17f, 0.68f, 2.55f, 0.18f, 3.72f)
            lineToRelative(0.36f, 0.67f)
            curveToRelative(-0.11f, 2.52f, 0.78f, 5.1f, 0.84f, 7.65f)
            curveToRelative(-0.42f, 0.43f, -0.92f, 0.0f, -1.38f, -0.07f)
            curveToRelative(-0.88f, -0.81f, -1.0f, -2.0f, -1.27f, -3.0f)
            horizontalLineToRelative(-0.18f)
            arcTo(19.88f, 19.88f, 0.0f, false, true, 135.0f, 83.15f)
            arcToRelative(5.11f, 5.11f, 0.0f, false, false, 0.84f, 2.12f)
            curveToRelative(0.18f, -0.46f, 0.5f, 0.11f, 0.78f, 0.07f)
            curveToRelative(0.18f, 0.92f, 1.28f, 1.74f, 0.5f, 2.73f)
            curveToRelative(-0.5f, 0.32f, -0.85f, 0.11f, -1.45f, 0.18f)
            curveToRelative(-0.89f, 1.06f, -0.64f, 2.66f, -1.17f, 3.89f)
            curveToRelative(-0.25f, -0.24f, -0.93f, 0.18f, -0.85f, -0.49f)
            curveToRelative(0.38f, -0.57f, -0.39f, -1.06f, 0.0f, -1.56f)
            curveToRelative(-0.22f, -1.81f, -0.68f, -3.29f, -0.85f, -5.0f)
            curveToRelative(-1.81f, 0.29f, -3.0f, 0.53f, -4.68f, 0.93f)
            curveToRelative(-0.25f, 1.0f, -1.1f, 2.23f, -0.18f, 3.15f)
            curveToRelative(-0.53f, 1.0f, -0.67f, 2.2f, -1.2f, 3.22f)
            curveToRelative(-0.43f, 0.54f, -0.74f, 1.31f, -1.35f, 1.63f)
            curveToRelative(-1.38f, 0.6f, -2.09f, -0.57f, -3.0f, -1.27f)
            curveToRelative(-0.67f, -2.87f, 3.12f, -3.62f, 3.33f, -6.31f)
            curveToRelative(-2.62f, 0.32f, -5.63f, 1.1f, -8.43f, 1.28f)
            curveToRelative(-5.77f, 1.13f, -11.51f, 2.79f, -17.25f, 4.18f)
            arcTo(37.61f, 37.61f, 0.0f, false, false, 95.35f, 93.0f)
            curveToRelative(1.42f, 0.6f, 2.66f, -1.67f, 3.4f, 0.35f)
            curveToRelative(0.0f, 0.74f, -0.63f, 1.17f, -1.2f, 1.52f)
            curveToRelative(-0.89f, 0.39f, -1.45f, -0.78f, -2.2f, 0.0f)
            arcTo(3.3f, 3.3f, 0.0f, false, true, 93.0f, 94.2f)
            lineToRelative(0.14f, -0.6f)
            curveToRelative(-2.66f, 0.71f, -10.14f, 3.53f, -10.88f, 0.17f)
            arcToRelative(10.43f, 10.43f, 0.0f, false, true, 0.25f, -3.93f)
            curveToRelative(-0.93f, -1.21f, -4.64f, 3.75f, -8.0f, 3.76f)
            arcToRelative(5.75f, 5.75f, 0.0f, false, true, 0.76f, 3.57f)
            curveToRelative(-0.33f, -0.1f, -0.93f, 1.0f, -1.11f, 0.08f)
            curveToRelative(-0.43f, -3.33f, -3.4f, -5.39f, -5.42f, -7.23f)
            curveToRelative(-1.66f, -1.35f, -3.93f, -2.0f, -5.0f, -4.07f)
            horizontalLineToRelative(-0.25f)
            curveToRelative(0.14f, 0.63f, 1.0f, 1.84f, -0.07f, 2.19f)
            curveToRelative(-1.91f, 0.19f, -3.93f, -3.9f, -4.6f, -5.35f)
            curveToRelative(-0.68f, -1.84f, 1.92f, -0.78f, 2.65f, 0.07f)
            curveToRelative(-0.39f, -1.31f, -1.8f, -2.0f, -2.48f, -3.22f)
            curveToRelative(-1.77f, -2.23f, -9.59f, -12.8f, -18.1f, -18.88f)
            arcToRelative(14.93f, 14.93f, 0.0f, false, false, -2.8f, -2.7f)
            curveToRelative(-0.89f, 0.5f, -1.66f, -1.34f, -2.06f, 0.25f)
            curveToRelative(-0.24f, 0.32f, -0.78f, 0.75f, -1.2f, 0.32f)
            curveToRelative(-2.91f, -2.0f, -1.88f, -6.2f, -1.95f, -6.52f)
            curveToRelative(-6.28f, -2.39f, -6.8f, -17.92f, -6.7f, -19.73f)
            curveToRelative(-0.28f, -2.69f, 2.55f, -5.34f, 4.4f, -6.91f)
            curveToRelative(0.18f, -0.46f, -0.22f, -0.74f, -0.32f, -1.1f)
            curveToRelative(-0.61f, 1.1f, -1.81f, 1.53f, -2.55f, 2.56f)
            curveToRelative(-0.46f, 0.21f, -0.68f, -0.29f, -0.68f, -0.61f)
            reflectiveCurveToRelative(1.81f, -2.05f, 1.35f, -2.87f)
            arcToRelative(2.22f, 2.22f, 0.0f, false, false, -1.52f, 0.43f)
            reflectiveCurveTo(26.0f, 26.0f, 24.84f, 25.65f)
            curveToRelative(-0.63f, -0.57f, -0.11f, -1.63f, -0.74f, -2.2f)
            arcToRelative(5.2f, 5.2f, 0.0f, false, false, -2.73f, 1.35f)
            lineTo(20.1f, 27.28f)
            curveToRelative(-0.54f, 3.37f, 0.56f, 6.8f, 0.67f, 10.1f)
            curveToRelative(1.09f, 7.61f, 1.41f, 15.83f, 3.65f, 22.95f)
            arcToRelative(23.29f, 23.29f, 0.0f, false, false, 4.0f, 4.0f)
            curveToRelative(0.5f, -0.53f, -0.29f, -1.34f, 0.43f, -1.7f)
            curveToRelative(0.56f, 0.0f, 0.81f, 0.82f, 1.27f, 0.25f)
            horizontalLineToRelative(0.6f)
            curveToRelative(1.35f, 1.56f, 2.77f, 3.4f, 4.0f, 5.0f)
            curveToRelative(-0.27f, 0.61f, 1.21f, 1.46f, 0.08f, 1.78f)
            lineTo(34.0f, 69.36f)
            lineToRelative(-0.25f, 0.5f)
            curveToRelative(4.89f, 8.0f, 3.22f, 18.42f, 5.0f, 27.39f)
            arcToRelative(50.71f, 50.71f, 0.0f, false, false, 1.27f, 8.43f)
            curveToRelative(0.29f, 0.28f, 0.61f, 1.06f, 1.18f, 0.74f)
            curveToRelative(0.67f, -1.73f, -0.82f, -2.87f, -0.67f, -4.42f)
            curveToRelative(-1.06f, -0.38f, 0.1f, -0.93f, 0.1f, -0.93f)
            curveToRelative(1.17f, -0.17f, 3.8f, 1.2f, 3.3f, 3.33f)
            curveToRelative(1.52f, 2.17f, 3.71f, 4.0f, 3.08f, 6.88f)
            arcToRelative(2.24f, 2.24f, 0.0f, false, true, -2.31f, 0.42f)
            curveToRelative(-0.56f, 0.25f, -1.39f, 1.19f, -2.23f, 0.42f)
            curveToRelative(1.49f, 2.52f, 3.37f, 5.6f, 1.88f, 8.58f)
            curveTo(42.15f, 126.0f, 24.56f, 133.13f, 19.67f, 137.0f)
            curveToRelative(-4.5f, 2.62f, -20.22f, 11.63f, -18.0f, 13.43f)
            curveToRelative(2.25f, 2.72f, 14.18f, -5.67f, 17.26f, -7.73f)
            curveToRelative(2.13f, -0.92f, 25.74f, -15.33f, 30.19f, -15.23f)
            curveToRelative(1.8f, -0.28f, 4.14f, -0.92f, 6.0f, -0.07f)
            curveToRelative(-2.64f, -3.31f, -0.27f, -5.49f, 1.45f, -4.61f)
            reflectiveCurveToRelative(8.85f, 1.78f, 7.9f, 5.28f)
            curveToRelative(-0.28f, 1.63f, -2.54f, 0.0f, -3.4f, 1.1f)
            arcToRelative(12.13f, 12.13f, 0.0f, false, false, 3.08f, 1.0f)
            curveToRelative(1.91f, -0.14f, 3.0f, -3.0f, 5.0f, -1.21f)
            curveToRelative(2.34f, 3.12f, 6.7f, 2.56f, 10.31f, 2.48f)
            curveToRelative(0.14f, -0.35f, -0.21f, -0.85f, -0.53f, -1.2f)
            curveToRelative(0.78f, -0.95f, 0.0f, -1.45f, 0.1f, -1.7f)
            curveToRelative(1.12f, -1.2f, 7.3f, 1.38f, 9.43f, 3.0f)
            curveToRelative(0.29f, 0.31f, 0.78f, 0.1f, 1.21f, 0.17f)
            curveToRelative(0.31f, -0.32f, 0.35f, -1.0f, 0.92f, -0.49f)
            curveToRelative(1.87f, -0.76f, 0.0f, -3.42f, 1.87f, -3.33f)
            lineToRelative(0.08f, -1.0f)
            curveToRelative(0.35f, -0.32f, 0.67f, 0.21f, 0.84f, 0.35f)
            curveToRelative(3.51f, -0.56f, 1.83f, 3.43f, 3.65f, 3.83f)
            arcToRelative(0.67f, 0.67f, 0.0f, false, true, 0.86f, 0.42f)
            horizontalLineToRelative(1.56f)
            arcToRelative(2.48f, 2.48f, 0.0f, false, true, 4.14f, -1.38f)
            curveToRelative(0.57f, 1.7f, 2.38f, 1.35f, 3.75f, 1.63f)
            curveToRelative(0.89f, -0.56f, 4.61f, -1.25f, 4.08f, 2.13f)
            arcToRelative(32.16f, 32.16f, 0.0f, false, false, 5.89f, 1.63f)
            curveToRelative(-0.32f, -0.75f, -0.93f, -1.67f, -0.36f, -2.55f)
            curveToRelative(0.88f, -0.82f, 2.41f, -0.29f, 3.47f, -0.11f)
            curveToRelative(3.15f, 0.67f, 1.73f, 5.0f, 5.0f, 5.63f)
            curveToRelative(2.34f, 1.63f, 4.92f, 2.8f, 7.37f, 4.57f)
            arcToRelative(58.42f, 58.42f, 0.0f, false, true, 8.43f, 6.63f)
            curveToRelative(2.48f, 3.47f, 4.93f, 7.19f, 7.9f, 10.13f)
            curveToRelative(3.26f, -1.0f, 5.81f, 4.64f, 6.49f, 7.65f)
            lineToRelative(1.27f, 1.53f)
            arcToRelative(4.7f, 4.7f, 0.0f, false, false, 0.0f, -2.63f)
            curveToRelative(-0.21f, -0.28f, -0.46f, -0.53f, -0.36f, -0.95f)
            curveToRelative(-1.59f, -1.31f, -1.16f, -3.4f, -1.34f, -5.25f)
            curveToRelative(0.0f, -2.12f, 1.6f, -3.57f, 2.0f, -5.52f)
            curveToRelative(2.09f, -1.7f, 7.26f, 0.56f, 8.61f, 3.29f)
            curveToRelative(1.27f, 1.49f, 3.16f, 1.67f, 3.72f, 3.58f)
            curveToRelative(-0.14f, 6.49f, 2.27f, 9.71f, 3.51f, 11.12f)
            curveToRelative(-0.1f, 0.22f, -0.18f, 0.53f, -0.42f, 0.61f)
            curveToRelative(-1.35f, -0.25f, -2.73f, -1.0f, -4.0f, -0.08f)
            curveToRelative(-2.35f, -0.68f, -1.49f, -2.65f, -1.95f, -3.22f)
            curveToRelative(-1.49f, 0.25f, -2.16f, -1.45f, -3.5f, -1.56f)
            arcToRelative(9.0f, 9.0f, 0.0f, false, false, 1.27f, 5.0f)
            curveToRelative(-0.64f, 0.84f, 0.57f, 1.23f, 1.0f, 1.69f)
            curveToRelative(6.32f, 4.72f, 19.37f, -1.77f, 22.6f, -7.83f)
            curveToRelative(1.35f, -1.34f, -0.77f, -3.0f, 0.53f, -4.14f)
            curveToRelative(-0.25f, -2.88f, 7.2f, -7.49f, 8.58f, -10.74f)
            curveToRelative(-1.17f, -1.0f, -1.0f, -3.36f, -2.87f, -3.47f)
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
            moveTo(197.15f, 149.47f)
            curveToRelative(-0.11f, 0.46f, 0.46f, 0.63f, 0.74f, 0.92f)
            lineToRelative(0.42f, -0.18f)
            curveToRelative(-0.47f, -1.18f, -1.16f, -0.74f, -1.16f, -0.74f)
        }
    }
        .build()
}
