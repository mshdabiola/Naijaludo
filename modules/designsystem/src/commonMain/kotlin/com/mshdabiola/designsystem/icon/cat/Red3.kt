package com.mshdabiola.ludo.screen.game.component.cat

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

fun Cat.getRed(iconColor: Long, accentColor: Long): ImageVector {
    return Builder(
        name = "Red3",
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
            moveTo(183.74f, 43.36f)
            curveToRelative(-4.32f, 4.63f, -8.22f, 10.74f, -14.92f, 12.0f)
            curveToRelative(-0.93f, 0.15f, -1.82f, 0.0f, -1.75f, 1.22f)
            curveToRelative(1.39f, 6.59f, 0.46f, 13.0f, -1.06f, 19.39f)
            arcToRelative(38.53f, 38.53f, 0.0f, false, true, -1.55f, 5.57f)
            curveToRelative(-2.66f, 11.34f, -8.24f, 20.79f, -14.8f, 30.0f)
            curveToRelative(-5.68f, 6.21f, -12.68f, 13.37f, -20.48f, 17.32f)
            curveToRelative(-4.12f, 2.87f, -9.62f, 3.81f, -14.51f, 5.42f)
            curveToRelative(-1.83f, 1.56f, -9.55f, 2.91f, -10.84f, 3.19f)
            curveToRelative(-4.17f, 0.88f, -8.38f, 2.07f, -13.0f, 1.24f)
            curveToRelative(-2.66f, 1.76f, -7.61f, 0.9f, -9.0f, 4.72f)
            curveToRelative(0.31f, 3.71f, -1.15f, 7.53f, -1.0f, 11.35f)
            curveToRelative(-0.08f, 1.82f, 0.36f, 3.89f, -0.12f, 5.51f)
            curveToRelative(0.0f, 6.34f, -4.49f, 12.79f, -0.81f, 18.7f)
            arcToRelative(25.38f, 25.38f, 0.0f, false, true, 3.94f, 13.45f)
            curveToRelative(-0.51f, 0.91f, -0.34f, 2.27f, -0.84f, 3.0f)
            curveToRelative(-0.2f, 1.92f, -1.25f, 0.35f, -2.44f, 0.77f)
            arcToRelative(138.94f, 138.94f, 0.0f, false, true, -17.33f, -9.38f)
            curveToRelative(-4.11f, -2.77f, -8.45f, -0.19f, -13.0f, -0.57f)
            curveToRelative(-4.55f, 0.63f, -9.48f, -0.93f, -13.33f, 1.13f)
            curveToRelative(-2.6f, 4.64f, -6.89f, 10.1f, -11.8f, 12.18f)
            curveToRelative(-1.63f, 1.16f, -3.16f, -0.38f, -4.27f, -1.6f)
            curveToRelative(-3.09f, -6.06f, -2.0f, -15.59f, 0.35f, -21.66f)
            arcTo(24.68f, 24.68f, 0.0f, false, false, 22.76f, 171.0f)
            curveToRelative(-4.85f, -6.0f, -7.1f, -16.58f, -3.59f, -24.24f)
            arcToRelative(12.91f, 12.91f, 0.0f, false, true, -0.65f, -7.69f)
            arcToRelative(34.86f, 34.86f, 0.0f, false, true, -4.6f, -5.4f)
            curveToRelative(-0.58f, -1.07f, -0.06f, -1.39f, 0.75f, -0.26f)
            arcToRelative(43.25f, 43.25f, 0.0f, false, false, 4.0f, 4.83f)
            arcTo(28.33f, 28.33f, 0.0f, false, true, 22.0f, 131.0f)
            arcToRelative(8.73f, 8.73f, 0.0f, false, true, -1.13f, -4.69f)
            curveToRelative(-1.24f, -9.1f, 3.23f, -16.72f, 5.74f, -24.42f)
            curveToRelative(2.44f, -7.3f, 5.64f, -14.48f, 7.0f, -22.41f)
            curveToRelative(1.29f, -11.0f, 2.56f, -23.0f, -1.06f, -32.89f)
            curveToRelative(-1.87f, -4.55f, -8.55f, -5.06f, -10.0f, -10.0f)
            arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.66f, -2.68f)
            curveToRelative(1.26f, -2.06f, 3.92f, -2.3f, 6.15f, -2.55f)
            curveToRelative(2.52f, 1.46f, 5.14f, -0.48f, 7.94f, -0.07f)
            curveToRelative(2.56f, 0.58f, 5.39f, -1.12f, 7.73f, 0.63f)
            curveToRelative(0.34f, 0.19f, 2.23f, 1.33f, 0.76f, 1.26f)
            arcTo(6.72f, 6.72f, 0.0f, false, false, 40.6f, 31.7f)
            arcToRelative(3.87f, 3.87f, 0.0f, false, false, -3.0f, 2.1f)
            curveToRelative(-0.46f, 1.1f, 0.0f, 2.23f, 0.27f, 3.24f)
            curveToRelative(-1.24f, 0.0f, -0.34f, -1.66f, -1.14f, -2.16f)
            curveToRelative(-0.42f, -1.25f, 1.0f, -2.31f, 0.15f, -3.17f)
            curveToRelative(-2.45f, 0.89f, -5.84f, 0.16f, -7.36f, 2.62f)
            arcToRelative(6.76f, 6.76f, 0.0f, false, false, -0.07f, 2.76f)
            curveToRelative(0.0f, 0.35f, -0.15f, 0.32f, -0.28f, 0.09f)
            curveToRelative(-0.41f, -0.68f, -1.39f, -1.44f, -0.49f, -2.36f)
            curveToRelative(-0.82f, -1.21f, 1.15f, -2.06f, 0.25f, -2.81f)
            arcToRelative(11.2f, 11.2f, 0.0f, false, false, -3.26f, 0.57f)
            curveToRelative(-1.09f, 0.72f, -2.66f, 1.65f, -2.55f, 3.3f)
            arcToRelative(5.05f, 5.05f, 0.0f, false, false, 1.46f, 3.0f)
            curveToRelative(3.39f, 3.13f, 8.94f, 5.0f, 9.24f, 10.14f)
            curveToRelative(0.57f, 0.56f, 0.35f, 1.66f, 0.79f, 2.27f)
            curveToRelative(-0.19f, 1.64f, 0.63f, 3.0f, 0.62f, 4.55f)
            curveToRelative(0.85f, 14.31f, -0.82f, 28.45f, -6.27f, 40.48f)
            curveToRelative(-2.88f, 10.86f, -10.57f, 21.83f, -6.64f, 34.27f)
            arcToRelative(18.66f, 18.66f, 0.0f, false, true, 2.24f, -2.0f)
            arcToRelative(37.44f, 37.44f, 0.0f, false, true, -0.92f, -3.84f)
            curveToRelative(-0.41f, -2.25f, 0.24f, -2.14f, 0.67f, -0.13f)
            curveToRelative(0.21f, 1.0f, 0.72f, 2.48f, 0.88f, 3.27f)
            arcTo(54.2f, 54.2f, 0.0f, false, true, 31.0f, 125.69f)
            arcToRelative(16.43f, 16.43f, 0.0f, false, true, 0.09f, -4.13f)
            curveToRelative(0.54f, -2.85f, 0.7f, -1.0f, 0.64f, 0.0f)
            arcToRelative(23.6f, 23.6f, 0.0f, false, false, 0.15f, 3.78f)
            arcToRelative(28.53f, 28.53f, 0.0f, false, true, 7.0f, 0.09f)
            curveToRelative(5.08f, 0.86f, 9.05f, 4.09f, 13.54f, 6.11f)
            curveToRelative(0.4f, 0.25f, 0.21f, 0.56f, -0.29f, 0.32f)
            curveToRelative(-4.42f, -2.3f, -8.4f, -4.46f, -13.39f, -5.85f)
            curveToRelative(-2.4f, 0.0f, -4.64f, -0.5f, -6.8f, 0.52f)
            curveToRelative(0.32f, 4.83f, 2.28f, 9.17f, 4.16f, 13.19f)
            curveToRelative(0.18f, 0.52f, 0.47f, 0.94f, 1.0f, 0.61f)
            curveToRelative(1.46f, -2.46f, 4.36f, -3.0f, 6.63f, -3.94f)
            curveToRelative(4.35f, -1.34f, 9.22f, -1.36f, 12.8f, 1.37f)
            curveToRelative(0.23f, 0.5f, 0.0f, 0.77f, -0.44f, 0.57f)
            curveToRelative(-0.93f, -1.45f, -2.87f, -1.25f, -4.13f, -2.13f)
            curveToRelative(-2.0f, 0.0f, -3.68f, -0.44f, -5.52f, 0.0f)
            curveToRelative(-3.15f, 0.86f, -6.34f, 1.43f, -8.51f, 4.0f)
            curveToRelative(-0.31f, 0.54f, -0.25f, 0.94f, -1.12f, 0.84f)
            curveToRelative(0.45f, 0.7f, 1.0f, 1.64f, 1.29f, 2.16f)
            arcToRelative(12.28f, 12.28f, 0.0f, false, true, 6.54f, -0.6f)
            curveToRelative(1.33f, -2.23f, 3.86f, -2.35f, 6.26f, -2.25f)
            curveToRelative(2.58f, 2.81f, 6.0f, -1.48f, 8.7f, 0.29f)
            arcToRelative(12.88f, 12.88f, 0.0f, false, false, 1.5f, -2.45f)
            curveToRelative(-0.55f, -0.3f, -0.91f, 0.62f, -1.49f, 0.42f)
            curveToRelative(0.32f, -0.69f, 1.3f, -0.91f, 2.0f, -1.44f)
            arcToRelative(35.32f, 35.32f, 0.0f, false, false, 3.21f, -8.79f)
            curveToRelative(-3.46f, -0.21f, -6.0f, 1.92f, -8.89f, 3.14f)
            curveToRelative(-0.34f, 0.09f, -0.7f, 0.19f, -1.0f, 0.25f)
            curveToRelative(-0.61f, 0.11f, -0.62f, -0.34f, -0.06f, -0.53f)
            curveToRelative(3.51f, -1.0f, 6.0f, -3.84f, 10.13f, -3.55f)
            curveToRelative(0.54f, -1.35f, 1.0f, -6.29f, 1.17f, -7.31f)
            curveToRelative(0.0f, -0.27f, 0.57f, -0.16f, 0.57f, 0.18f)
            arcToRelative(61.0f, 61.0f, 0.0f, false, true, -0.9f, 7.3f)
            curveToRelative(5.0f, 0.0f, 10.31f, 3.78f, 13.49f, 7.68f)
            curveToRelative(1.0f, -1.08f, 2.0f, -2.83f, 2.79f, -3.86f)
            curveToRelative(0.29f, -0.45f, 0.95f, -0.22f, 0.57f, 0.45f)
            arcToRelative(48.08f, 48.08f, 0.0f, false, true, -3.0f, 4.33f)
            curveToRelative(1.45f, 1.65f, 0.87f, 3.35f, 2.1f, 4.93f)
            curveToRelative(0.9f, -1.2f, 7.0f, -2.69f, 10.15f, -3.9f)
            curveToRelative(0.8f, -2.14f, 3.73f, -0.72f, 4.76f, -2.79f)
            curveToRelative(4.49f, -4.63f, 9.22f, -11.0f, 7.86f, -18.69f)
            curveToRelative(-2.58f, -4.34f, -4.26f, -8.88f, -6.6f, -13.09f)
            curveToRelative(-2.0f, -5.67f, 0.33f, -11.73f, 2.43f, -16.81f)
            curveToRelative(0.85f, -2.14f, -1.13f, -2.57f, -1.82f, -4.0f)
            curveToRelative(-1.55f, -2.3f, 0.08f, -4.76f, 0.31f, -7.22f)
            curveToRelative(-2.57f, -1.64f, -2.27f, -4.67f, -2.2f, -7.37f)
            curveToRelative(-1.29f, -1.58f, -2.55f, -3.58f, -1.86f, -6.0f)
            curveToRelative(1.29f, -2.71f, -0.92f, -4.45f, -2.0f, -6.43f)
            arcToRelative(7.06f, 7.06f, 0.0f, false, true, 3.0f, -7.65f)
            curveToRelative(0.63f, -0.39f, 0.63f, -0.63f, 0.24f, -0.59f)
            curveToRelative(-2.56f, 0.35f, -4.84f, -0.19f, -7.33f, -0.57f)
            curveToRelative(-1.79f, 0.56f, -4.06f, 1.34f, -5.07f, 3.18f)
            curveToRelative(3.36f, 3.61f, 3.0f, 8.2f, 5.61f, 12.81f)
            curveToRelative(0.69f, 1.56f, -0.51f, 3.56f, 0.77f, 5.09f)
            curveToRelative(0.09f, 2.06f, 1.74f, 3.3f, 1.6f, 5.3f)
            curveToRelative(-1.0f, 2.65f, 1.94f, 3.95f, 1.3f, 6.51f)
            curveToRelative(-0.13f, 0.11f, -0.23f, 0.25f, -0.35f, 0.37f)
            curveToRelative(-1.18f, -1.17f, -0.11f, -3.44f, -1.76f, -4.52f)
            curveToRelative(0.93f, -3.87f, -1.67f, -6.35f, -2.11f, -9.72f)
            curveToRelative(0.64f, -3.88f, -3.0f, -7.58f, -3.3f, -11.94f)
            curveToRelative(-1.35f, -3.88f, -5.3f, -6.46f, -8.06f, -9.11f)
            curveToRelative(-1.25f, -3.69f, -2.15f, -7.21f, -5.21f, -9.75f)
            arcToRelative(11.0f, 11.0f, 0.0f, false, false, -10.32f, -1.9f)
            curveToRelative(-1.36f, 0.64f, -2.53f, 1.44f, -2.15f, 3.73f)
            curveToRelative(-0.87f, -0.28f, -1.13f, -1.58f, -0.9f, -2.63f)
            curveToRelative(0.38f, -0.45f, 1.0f, -0.82f, 0.75f, -1.35f)
            arcToRelative(7.67f, 7.67f, 0.0f, false, false, -4.75f, 0.35f)
            arcToRelative(4.78f, 4.78f, 0.0f, false, false, -2.52f, 2.6f)
            arcToRelative(5.49f, 5.49f, 0.0f, false, false, 1.83f, 5.56f)
            curveToRelative(0.11f, 0.1f, 0.0f, 0.2f, -0.2f, 0.13f)
            curveToRelative(-1.11f, -0.45f, -1.57f, -1.53f, -2.15f, -2.48f)
            curveToRelative(-1.18f, -2.17f, 0.36f, -5.2f, 0.83f, -6.35f)
            curveToRelative(-1.86f, -0.44f, -3.87f, -0.19f, -5.0f, 1.35f)
            curveTo(44.0f, 40.25f, 52.87f, 43.86f, 55.24f, 49.0f)
            curveToRelative(2.65f, 6.58f, 5.11f, 12.09f, 6.09f, 19.29f)
            curveToRelative(-0.11f, 2.51f, 0.32f, 5.55f, -0.7f, 7.81f)
            curveToRelative(-0.18f, 0.4f, -1.0f, 0.73f, -1.13f, -0.26f)
            arcToRelative(167.4f, 167.4f, 0.0f, false, false, -8.0f, -28.7f)
            arcToRelative(9.59f, 9.59f, 0.0f, false, true, -0.3f, -2.24f)
            curveToRelative(-3.1f, -3.08f, -6.13f, -6.32f, -4.58f, -11.0f)
            arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.56f, -2.45f)
            curveToRelative(2.26f, 0.8f, 4.35f, 0.13f, 6.36f, -0.13f)
            curveToRelative(3.95f, 2.0f, 6.25f, -1.0f, 10.0f, 0.55f)
            curveToRelative(6.24f, 0.74f, 9.0f, 7.2f, 10.55f, 12.55f)
            curveToRelative(1.88f, 1.26f, 3.57f, 3.0f, 5.33f, 4.35f)
            curveToRelative(1.25f, -1.71f, 2.73f, -2.06f, 4.07f, -3.06f)
            curveToRelative(-2.0f, -2.0f, -3.73f, -3.51f, -4.37f, -6.24f)
            arcToRelative(6.33f, 6.33f, 0.0f, false, true, 3.0f, -6.51f)
            curveToRelative(2.19f, -1.66f, 5.74f, -1.0f, 8.48f, -0.63f)
            curveToRelative(1.0f, 0.05f, 2.32f, -0.72f, 3.23f, 0.14f)
            curveToRelative(2.56f, -1.23f, 9.0f, -1.37f, 11.56f, 0.21f)
            curveToRelative(1.35f, 0.12f, 2.84f, -0.46f, 4.36f, -0.34f)
            curveToRelative(5.27f, -1.0f, 10.6f, -2.0f, 15.87f, -1.72f)
            lineToRelative(0.39f, -0.37f)
            curveToRelative(-13.42f, -1.93f, -28.0f, -3.29f, -36.41f, -14.0f)
            curveToRelative(-1.29f, -2.82f, -3.0f, -5.42f, -3.32f, -8.72f)
            curveToRelative(-0.18f, -1.3f, -0.63f, -3.0f, 0.18f, -4.1f)
            curveTo(90.53f, 0.15f, 94.59f, 1.21f, 96.69f, 0.13f)
            arcToRelative(17.45f, 17.45f, 0.0f, false, true, 7.0f, 0.59f)
            curveToRelative(2.2f, 0.57f, 4.0f, 2.11f, 6.36f, 2.27f)
            curveToRelative(7.33f, 1.55f, 14.52f, 3.87f, 22.06f, 4.48f)
            curveToRelative(3.06f, 1.19f, 7.24f, 1.0f, 10.49f, 1.87f)
            curveToRelative(9.46f, 0.0f, 17.86f, 3.82f, 26.51f, 6.37f)
            curveToRelative(5.23f, 2.64f, 10.76f, 3.76f, 14.12f, 8.78f)
            curveToRelative(3.76f, 5.27f, 4.24f, 13.45f, 0.48f, 18.87f)
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
            moveTo(71.29f, 185.55f)
            curveToRelative(0.78f, 1.0f, -0.32f, 3.0f, 1.55f, 3.42f)
            curveToRelative(1.33f, 0.35f, 2.3f, -0.37f, 3.53f, -0.26f)
            curveToRelative(0.6f, 1.2f, 0.95f, 2.56f, 2.4f, 2.92f)
            curveToRelative(-0.72f, -0.85f, -1.17f, -2.87f, -1.45f, -4.41f)
            arcToRelative(1.09f, 1.09f, 0.0f, false, false, -1.6f, 0.34f)
            curveToRelative(-1.18f, 0.07f, -2.49f, 0.37f, -3.07f, -1.0f)
            curveToRelative(-0.35f, -1.37f, 0.91f, -2.0f, 0.73f, -3.32f)
            curveToRelative(-2.2f, 0.67f, -3.68f, 2.31f, -6.31f, 1.85f)
            curveToRelative(1.17f, 1.63f, 2.62f, 0.7f, 4.22f, 0.47f)
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
            moveTo(64.14f, 175.15f)
            curveToRelative(0.83f, 1.69f, 1.21f, 3.79f, 2.48f, 5.0f)
            curveToRelative(0.13f, 0.12f, 0.25f, 0.0f, 0.22f, -0.15f)
            curveToRelative(-0.18f, -0.64f, 0.0f, -1.36f, -0.58f, -1.85f)
            curveToRelative(-0.64f, -0.9f, -1.22f, -2.24f, -2.0f, -3.14f)
            curveToRelative(-0.16f, -0.18f, -0.26f, -0.05f, -0.14f, 0.18f)
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
            moveTo(62.08f, 167.57f)
            curveToRelative(-0.36f, -0.93f, -0.18f, -2.75f, -1.6f, -2.21f)
            arcToRelative(1.75f, 1.75f, 0.0f, false, false, -0.39f, 1.78f)
            arcToRelative(1.21f, 1.21f, 0.0f, false, false, 2.0f, 0.43f)
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
            moveTo(58.46f, 179.36f)
            curveToRelative(0.0f, 0.76f, 2.17f, 2.79f, 1.4f, 0.29f)
            curveToRelative(-0.41f, -1.54f, -0.09f, -3.52f, -0.49f, -5.0f)
            arcToRelative(7.0f, 7.0f, 0.0f, false, false, -0.91f, 4.66f)
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
            moveTo(57.91f, 167.49f)
            curveToRelative(-0.33f, -1.18f, 0.27f, -4.88f, 2.0f, -4.87f)
            arcToRelative(3.67f, 3.67f, 0.0f, false, true, 3.46f, 1.45f)
            arcToRelative(4.64f, 4.64f, 0.0f, false, true, 1.14f, 3.39f)
            curveToRelative(1.77f, -0.62f, 2.77f, -5.0f, -1.44f, -6.0f)
            curveToRelative(-1.46f, -0.38f, -5.0f, -0.57f, -6.42f, 1.6f)
            arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.1f, 3.22f)
            curveToRelative(0.41f, 0.43f, 0.72f, 0.83f, 1.1f, 1.25f)
            curveToRelative(0.11f, 0.11f, 0.31f, 0.09f, 0.28f, 0.0f)
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
            moveTo(48.68f, 170.3f)
            curveToRelative(0.45f, 0.78f, 0.83f, 1.33f, 1.21f, 2.0f)
            curveToRelative(0.32f, -1.87f, 0.53f, -4.27f, 2.63f, -5.0f)
            arcToRelative(31.23f, 31.23f, 0.0f, false, true, 4.0f, 0.47f)
            arcTo(87.93f, 87.93f, 0.0f, false, true, 52.78f, 157.0f)
            curveToRelative(-1.35f, 0.23f, -3.26f, 0.8f, -4.65f, 0.5f)
            curveToRelative(-1.17f, -0.05f, -2.38f, -0.69f, -3.61f, -0.86f)
            arcToRelative(1.46f, 1.46f, 0.0f, false, false, 0.09f, 1.29f)
            arcToRelative(12.79f, 12.79f, 0.0f, false, true, 0.1f, 2.37f)
            curveToRelative(0.22f, 2.59f, -0.71f, 4.85f, -0.66f, 7.42f)
            arcToRelative(4.73f, 4.73f, 0.0f, false, true, 4.63f, 2.61f)
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
            moveTo(39.0f, 170.59f)
            arcToRelative(1.21f, 1.21f, 0.0f, false, false, 1.74f, -1.0f)
            arcTo(1.72f, 1.72f, 0.0f, false, false, 39.8f, 168.0f)
            curveToRelative(-1.52f, -0.07f, -0.77f, 1.61f, -0.81f, 2.61f)
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
            moveTo(36.57f, 184.54f)
            curveToRelative(1.0f, -2.3f, 1.55f, -6.18f, 0.06f, -8.42f)
            curveToRelative(-0.52f, 2.5f, -1.1f, 7.24f, -0.06f, 8.42f)
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
            moveTo(36.69f, 170.78f)
            curveToRelative(-0.29f, -1.65f, -1.48f, -3.82f, -0.29f, -5.65f)
            arcToRelative(3.71f, 3.71f, 0.0f, false, true, 4.51f, 0.17f)
            arcToRelative(3.21f, 3.21f, 0.0f, false, true, 1.29f, 2.9f)
            curveToRelative(1.44f, -0.82f, 0.83f, -2.84f, 1.41f, -4.17f)
            arcToRelative(7.0f, 7.0f, 0.0f, false, false, -6.7f, -1.0f)
            curveToRelative(-0.76f, 0.39f, -2.82f, 1.3f, -3.36f, 3.0f)
            curveToRelative(-0.44f, 2.46f, 2.24f, 5.0f, 3.14f, 4.78f)
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
            moveTo(27.13f, 186.57f)
            curveToRelative(1.16f, 0.58f, 2.5f, 0.7f, 3.46f, 1.68f)
            curveToRelative(-0.45f, 2.0f, -5.44f, 0.82f, -2.68f, 3.59f)
            arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.23f, 1.24f)
            arcToRelative(19.11f, 19.11f, 0.0f, false, true, -1.27f, 3.64f)
            curveToRelative(0.41f, 0.0f, 0.88f, 0.0f, 1.14f, -0.36f)
            curveToRelative(0.0f, -0.82f, 0.87f, -1.19f, 1.19f, -1.94f)
            curveToRelative(0.29f, -1.28f, -0.4f, -2.84f, 0.28f, -3.63f)
            arcToRelative(6.08f, 6.08f, 0.0f, false, false, 3.17f, -4.09f)
            curveToRelative(-2.58f, -0.06f, -5.26f, -0.64f, -6.92f, -2.89f)
            curveToRelative(-0.58f, 1.15f, 0.61f, 2.08f, 1.4f, 2.76f)
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
            moveTo(32.94f, 176.6f)
            curveToRelative(0.0f, -0.12f, -0.22f, -0.11f, -0.32f, 0.0f)
            arcToRelative(13.0f, 13.0f, 0.0f, false, false, -2.37f, 4.9f)
            curveToRelative(0.0f, 0.12f, 0.06f, 0.2f, 0.14f, 0.11f)
            curveToRelative(1.23f, -1.38f, 2.52f, -2.84f, 2.55f, -5.0f)
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
            moveTo(19.14f, 139.56f)
            curveToRelative(-0.15f, -0.19f, -0.5f, 4.54f, 0.19f, 6.21f)
            lineToRelative(0.41f, 0.0f)
            arcToRelative(9.16f, 9.16f, 0.0f, false, true, 2.85f, -3.4f)
            arcToRelative(39.79f, 39.79f, 0.0f, false, true, -3.45f, -2.83f)
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
            moveTo(25.0f, 129.69f)
            arcToRelative(14.9f, 14.9f, 0.0f, false, false, -5.64f, 9.13f)
            arcToRelative(21.3f, 21.3f, 0.0f, false, false, 3.84f, 3.11f)
            curveToRelative(0.55f, -0.23f, 3.91f, -2.3f, 6.86f, -2.62f)
            arcTo(39.87f, 39.87f, 0.0f, false, true, 25.0f, 129.69f)
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
            moveTo(23.8f, 142.44f)
            curveToRelative(1.81f, 1.47f, 8.26f, 4.52f, 8.26f, 4.52f)
            curveToRelative(0.67f, -0.88f, 1.77f, -1.44f, 2.33f, -2.3f)
            arcToRelative(28.61f, 28.61f, 0.0f, false, true, -3.86f, -4.56f)
            curveToRelative(-1.88f, -0.2f, -3.17f, 0.62f, -4.78f, 1.0f)
            curveToRelative(-0.49f, 0.34f, -2.1f, 1.19f, -1.95f, 1.32f)
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
            moveTo(34.58f, 138.15f)
            arcToRelative(34.55f, 34.55f, 0.0f, false, true, -3.35f, -11.55f)
            arcToRelative(15.57f, 15.57f, 0.0f, false, false, -5.66f, 2.53f)
            curveToRelative(1.11f, 3.92f, 3.22f, 7.11f, 5.26f, 10.19f)
            curveToRelative(0.0f, 0.0f, 3.28f, 0.37f, 4.52f, 0.51f)
            curveToRelative(-0.26f, 0.0f, -0.32f, -0.92f, -0.77f, -1.68f)
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
            moveTo(36.06f, 141.0f)
            curveToRelative(-1.69f, -1.0f, -4.57f, -0.9f, -4.79f, -1.0f)
            arcToRelative(40.87f, 40.87f, 0.0f, false, false, 3.7f, 4.27f)
            curveToRelative(0.62f, -0.42f, 1.94f, -0.6f, 2.47f, -1.0f)
            arcTo(22.28f, 22.28f, 0.0f, false, false, 36.06f, 141.0f)
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
            moveTo(38.0f, 144.17f)
            curveToRelative(-0.94f, -0.27f, -1.66f, 0.4f, -2.33f, 0.9f)
            arcToRelative(23.71f, 23.71f, 0.0f, false, true, 2.0f, 1.77f)
            curveToRelative(0.31f, 0.29f, 0.8f, 0.0f, 1.24f, -0.63f)
            arcToRelative(0.54f, 0.54f, 0.0f, false, false, 0.11f, -0.5f)
            arcToRelative(11.06f, 11.06f, 0.0f, false, false, -1.0f, -1.54f)
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
            moveTo(38.58f, 143.87f)
            curveToRelative(0.25f, 0.89f, 1.83f, 1.82f, 2.15f, 2.71f)
            arcToRelative(3.51f, 3.51f, 0.0f, false, false, -2.89f, 1.7f)
            curveToRelative(-0.68f, 0.67f, 0.94f, 1.21f, -0.37f, 1.68f)
            curveToRelative(-2.0f, -1.0f, -2.18f, 4.26f, -2.42f, 0.43f)
            curveToRelative(0.58f, -1.44f, 2.2f, -0.79f, 2.23f, -2.84f)
            curveToRelative(-0.13f, -0.07f, -0.13f, -0.31f, -0.24f, -0.4f)
            arcTo(20.5f, 20.5f, 0.0f, false, false, 35.0f, 145.3f)
            arcToRelative(9.61f, 9.61f, 0.0f, false, false, -2.27f, 1.85f)
            curveToRelative(-0.07f, 0.07f, 3.13f, 0.84f, 2.87f, 1.25f)
            reflectiveCurveToRelative(-3.18f, -0.83f, -3.24f, -0.73f)
            arcToRelative(7.57f, 7.57f, 0.0f, false, false, -0.56f, 1.17f)
            arcToRelative(3.08f, 3.08f, 0.0f, false, true, 0.0f, -1.39f)
            reflectiveCurveToRelative(-6.78f, -3.0f, -8.55f, -4.63f)
            curveToRelative(-0.1f, -0.09f, -2.25f, 1.94f, -2.19f, 3.32f)
            curveToRelative(4.45f, 0.31f, 8.0f, 0.38f, 11.39f, 4.0f)
            curveToRelative(-0.5f, 3.33f, 1.05f, 5.75f, 3.43f, 7.61f)
            curveToRelative(2.69f, 1.7f, 6.11f, 2.09f, 7.64f, 4.86f)
            curveToRelative(0.11f, 0.07f, 0.26f, -0.05f, 0.38f, -0.1f)
            curveToRelative(0.0f, -2.47f, -0.3f, -5.25f, 0.14f, -7.52f)
            curveToRelative(0.61f, -0.32f, 2.0f, -0.2f, 1.75f, -1.0f)
            curveToRelative(-0.45f, -0.49f, -1.0f, 0.37f, -1.27f, -0.46f)
            curveToRelative(0.0f, -0.18f, 0.0f, -0.41f, 0.0f, -0.59f)
            curveToRelative(1.5f, -0.81f, 3.38f, -0.79f, 4.1f, -2.46f)
            curveToRelative(-1.15f, -2.0f, 1.09f, -4.95f, -1.62f, -6.0f)
            arcToRelative(10.28f, 10.28f, 0.0f, false, false, -8.41f, -0.58f)
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
            moveTo(46.7f, 141.61f)
            curveToRelative(-0.65f, 0.09f, -1.58f, 1.17f, -0.77f, 1.49f)
            arcToRelative(3.88f, 3.88f, 0.0f, false, true, 2.45f, 1.7f)
            curveToRelative(0.83f, -0.14f, 1.0f, -1.25f, 1.95f, -1.74f)
            curveToRelative(0.57f, -0.74f, 1.23f, -0.6f, 1.47f, -1.51f)
            curveToRelative(-1.47f, -1.24f, -3.49f, -0.4f, -5.1f, 0.06f)
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
            moveTo(56.29f, 141.2f)
            curveToRelative(-3.09f, 0.69f, -6.44f, 2.14f, -7.4f, 5.32f)
            curveToRelative(0.12f, 2.77f, 0.59f, 5.61f, 3.53f, 6.74f)
            curveToRelative(-0.93f, 1.13f, 1.15f, 0.57f, 0.75f, 1.73f)
            curveToRelative(0.09f, 1.94f, 1.2f, 3.57f, 1.47f, 5.41f)
            curveToRelative(1.53f, -2.87f, 4.54f, -4.5f, 7.87f, -5.53f)
            arcToRelative(8.27f, 8.27f, 0.0f, false, false, 4.23f, -4.23f)
            curveToRelative(0.06f, -1.22f, 0.12f, -2.57f, 0.16f, -3.63f)
            curveToRelative(0.71f, 0.0f, 1.0f, 0.57f, 0.83f, 1.27f)
            curveToRelative(-0.33f, 0.75f, 0.8f, 0.44f, 1.1f, 0.34f)
            curveToRelative(1.67f, -2.0f, 4.46f, -2.57f, 7.16f, -2.51f)
            arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.78f, 0.78f)
            curveToRelative(-0.61f, -2.14f, -2.37f, -3.45f, -3.7f, -5.0f)
            curveToRelative(-0.23f, 0.0f, -8.1f, 5.79f, -12.09f, 6.5f)
            curveToRelative(0.11f, 0.3f, 0.3f, 1.0f, -0.23f, 1.08f)
            curveToRelative(-0.76f, 0.0f, -0.19f, -1.07f, -1.0f, -1.16f)
            curveToRelative(-1.17f, -1.4f, -3.67f, 2.0f, -2.89f, -1.0f)
            curveToRelative(0.08f, -2.0f, -3.11f, -0.25f, -2.74f, -1.94f)
            arcTo(2.89f, 2.89f, 0.0f, false, false, 56.7f, 145.0f)
            arcToRelative(20.61f, 20.61f, 0.0f, false, false, 2.64f, -3.62f)
            curveToRelative(-0.46f, -0.59f, -2.4f, 0.06f, -3.05f, -0.2f)
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
            moveTo(65.12f, 143.53f)
            curveToRelative(0.75f, 0.32f, 1.12f, 1.53f, 1.56f, 2.13f)
            arcToRelative(33.0f, 33.0f, 0.0f, false, false, 6.6f, -4.24f)
            arcToRelative(22.63f, 22.63f, 0.0f, false, false, -7.13f, -3.16f)
            curveToRelative(-0.67f, 1.23f, -2.29f, 2.93f, -2.87f, 3.84f)
            curveToRelative(0.06f, 0.44f, 0.94f, 1.11f, 1.84f, 1.43f)
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
            moveTo(62.66f, 142.84f)
            curveToRelative(-1.34f, 1.65f, -2.67f, 2.4f, -4.0f, 3.93f)
            curveToRelative(0.0f, 1.11f, 1.45f, 0.3f, 2.08f, 0.79f)
            arcToRelative(4.14f, 4.14f, 0.0f, false, false, 1.2f, 0.08f)
            arcToRelative(19.39f, 19.39f, 0.0f, false, false, 4.0f, -1.55f)
            curveToRelative(-0.59f, -1.14f, -1.77f, -3.08f, -3.28f, -3.25f)
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
            moveTo(57.29f, 145.3f)
            arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.08f, 0.75f)
            arcToRelative(24.0f, 24.0f, 0.0f, false, false, 3.77f, -3.62f)
            curveToRelative(-0.32f, -0.83f, -1.29f, -0.67f, -2.0f, -1.06f)
            arcToRelative(40.44f, 40.44f, 0.0f, false, true, -2.81f, 3.93f)
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
            moveTo(60.54f, 140.69f)
            curveToRelative(0.71f, 0.0f, 1.55f, 0.77f, 2.26f, 0.95f)
            curveToRelative(0.5f, -0.27f, 1.9f, -2.61f, 2.58f, -3.46f)
            curveToRelative(-1.22f, -0.47f, -2.33f, 0.15f, -3.43f, -0.13f)
            curveToRelative(-0.45f, 0.86f, -0.9f, 1.83f, -1.41f, 2.64f)
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
            moveTo(72.94f, 131.06f)
            arcToRelative(14.51f, 14.51f, 0.0f, false, false, -7.33f, -2.45f)
            arcToRelative(46.23f, 46.23f, 0.0f, false, true, -3.17f, 8.59f)
            arcToRelative(7.11f, 7.11f, 0.0f, false, true, 3.49f, 0.24f)
            curveToRelative(1.13f, -2.07f, 2.89f, -4.82f, 3.6f, -7.0f)
            curveToRelative(0.14f, -0.42f, 0.92f, -0.46f, 0.73f, 0.18f)
            curveToRelative(-0.79f, 2.43f, -2.49f, 4.76f, -3.63f, 7.0f)
            curveToRelative(2.62f, 0.58f, 5.0f, 2.44f, 7.46f, 3.19f)
            arcToRelative(57.3f, 57.3f, 0.0f, false, false, 4.31f, -4.0f)
            curveToRelative(-0.84f, -2.26f, -2.92f, -3.37f, -5.46f, -5.7f)
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
            moveTo(78.8f, 137.51f)
            curveToRelative(-0.85f, 0.69f, -2.34f, 2.65f, -4.17f, 3.83f)
            curveToRelative(3.15f, 2.53f, 4.46f, 5.65f, 5.64f, 9.17f)
            curveToRelative(0.0f, 0.0f, 0.06f, 0.0f, 0.07f, 0.06f)
            reflectiveCurveToRelative(0.15f, 0.07f, 0.19f, 0.0f)
            curveToRelative(1.68f, -4.83f, 0.45f, -8.9f, -1.73f, -13.0f)
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
            moveTo(52.31f, 47.7f)
            curveToRelative(1.42f, 2.52f, 7.0f, 20.07f, 7.55f, 27.2f)
            curveToRelative(0.0f, 0.54f, 0.6f, 0.3f, 0.71f, -0.92f)
            reflectiveCurveToRelative(-0.31f, -9.58f, -1.94f, -14.0f)
            curveToRelative(-0.92f, -2.48f, -4.07f, -11.74f, -5.81f, -13.47f)
            curveToRelative(-1.07f, -1.08f, -1.26f, -0.2f, -0.51f, 1.15f)
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
            moveTo(101.8f, 1.65f)
            curveToRelative(-3.12f, -1.14f, -7.0f, -0.49f, -9.86f, 0.5f)
            arcToRelative(4.3f, 4.3f, 0.0f, false, false, -1.0f, 4.24f)
            curveToRelative(2.82f, 1.29f, 2.64f, 5.58f, 6.0f, 6.2f)
            curveToRelative(-0.16f, -0.36f, -0.13f, -1.07f, -0.53f, -1.44f)
            arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.0f, -4.74f)
            curveToRelative(2.0f, -1.0f, 3.91f, -2.36f, 6.42f, -1.95f)
            arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -2.81f)
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
            moveTo(144.11f, 33.36f)
            curveToRelative(-3.14f, -1.84f, -7.33f, -1.55f, -10.86f, -2.58f)
            curveToRelative(-1.55f, 0.58f, -3.48f, 0.32f, -5.25f, 0.47f)
            curveToRelative(-7.0f, -0.3f, -13.63f, 2.76f, -20.62f, 1.64f)
            curveToRelative(-2.42f, -1.28f, -8.29f, -0.36f, -9.6f, 0.58f)
            arcToRelative(2.62f, 2.62f, 0.0f, false, false, -1.54f, 2.87f)
            curveToRelative(0.1f, 0.42f, -0.26f, 0.58f, -0.45f, 0.86f)
            curveToRelative(-0.8f, -0.39f, -0.23f, -1.42f, -0.37f, -2.13f)
            arcToRelative(3.58f, 3.58f, 0.0f, false, true, 1.37f, -1.94f)
            curveToRelative(-2.45f, -0.34f, -7.0f, 0.28f, -7.75f, 2.78f)
            curveToRelative(0.1f, 0.47f, -0.25f, 1.58f, -0.75f, 1.0f)
            curveToRelative(-0.73f, -0.8f, -0.08f, -2.06f, 0.3f, -2.81f)
            curveToRelative(0.86f, -1.0f, 2.15f, -0.8f, 3.18f, -1.52f)
            arcToRelative(7.76f, 7.76f, 0.0f, false, false, -7.36f, 3.16f)
            curveToRelative(-0.67f, 1.85f, -1.0f, 5.0f, 0.43f, 6.19f)
            curveToRelative(3.65f, 6.67f, 12.65f, 3.48f, 19.0f, 3.93f)
            curveToRelative(2.19f, -0.49f, 4.76f, -0.14f, 6.64f, -1.53f)
            curveToRelative(1.41f, -1.41f, -1.68f, -3.24f, 0.37f, -4.33f)
            curveToRelative(1.64f, -1.34f, 3.33f, 0.32f, 5.0f, 0.45f)
            reflectiveCurveToRelative(2.91f, 2.13f, 4.48f, 1.08f)
            curveToRelative(1.86f, -2.21f, 5.63f, 1.42f, 6.34f, -2.72f)
            curveToRelative(1.29f, -1.18f, 4.72f, 1.08f, 5.0f, -1.72f)
            curveToRelative(4.25f, -3.17f, 7.0f, 2.18f, 11.0f, 2.7f)
            curveToRelative(0.55f, -0.27f, 1.2f, -0.47f, 1.45f, -1.0f)
            curveToRelative(0.0f, -0.82f, 0.15f, -1.87f, 1.0f, -2.07f)
            curveToRelative(0.77f, 0.15f, 1.59f, 0.0f, 1.68f, -0.75f)
            curveToRelative(0.0f, -1.41f, -1.49f, -2.0f, -2.71f, -2.53f)
        }
    }
        .build()
}
