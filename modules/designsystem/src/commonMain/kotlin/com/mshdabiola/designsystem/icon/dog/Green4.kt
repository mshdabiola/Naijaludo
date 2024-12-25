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

fun Dog.getGreen(iconColor: Long, accentColor: Long): ImageVector {
    return Builder(
        name = "Green4",
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
            moveTo(199.65f, 163.37f)
            curveToRelative(-0.8f, -7.13f, -0.61f, -14.9f, -1.93f, -21.91f)
            lineTo(198.0f, 141.0f)
            arcToRelative(12.07f, 12.07f, 0.0f, false, false, -7.28f, -4.46f)
            curveToRelative(-11.54f, -2.64f, -14.0f, -22.71f, -14.56f, -23.46f)
            curveToRelative(0.69f, -4.0f, -1.0f, -8.0f, -1.62f, -11.94f)
            curveToRelative(-2.0f, -3.79f, -8.62f, -21.0f, -35.21f, -24.63f)
            curveToRelative(-1.86f, 0.07f, -3.6f, -1.22f, -5.35f, -1.29f)
            curveToRelative(-2.69f, -1.0f, -17.2f, -2.54f, -17.2f, -2.54f)
            curveToRelative(-1.33f, -0.11f, -2.92f, -0.76f, -4.63f, -0.53f)
            curveToRelative(-6.07f, -1.41f, -11.26f, -1.59f, -17.28f, -3.0f)
            curveToRelative(-2.73f, -0.37f, -8.57f, -0.91f, -8.57f, -0.91f)
            curveToRelative(-3.52f, -0.94f, -7.73f, -0.22f, -10.72f, -2.38f)
            lineToRelative(-0.19f, 0.38f)
            curveToRelative(-4.7f, -0.38f, -7.51f, -4.0f, -11.45f, -5.84f)
            arcToRelative(32.76f, 32.76f, 0.0f, false, true, -9.82f, -8.19f)
            curveToRelative(-2.38f, -3.0f, -6.29f, -4.31f, -9.28f, -6.25f)
            curveToRelative(-1.21f, -0.45f, -2.5f, -1.44f, -3.83f, -2.0f)
            curveTo(36.65f, 42.48f, 33.33f, 33.0f, 31.52f, 28.83f)
            curveToRelative(-0.5f, -1.1f, -1.48f, -2.0f, -1.52f, -3.18f)
            curveToRelative(0.0f, 0.0f, -1.12f, -0.51f, -1.82f, 6.67f)
            curveToRelative(0.0f, 0.0f, -3.3f, -4.66f, -4.74f, -7.0f)
            curveToRelative(-0.68f, 0.19f, -1.29f, -1.59f, -1.36f, -0.27f)
            curveToRelative(0.3f, 2.65f, 0.07f, 5.39f, 0.53f, 7.89f)
            lineToRelative(0.26f, 0.19f)
            curveToRelative(-0.26f, 2.08f, 0.5f, 4.43f, 0.76f, 6.63f)
            curveToRelative(0.0f, 0.0f, -7.83f, 3.2f, -11.0f, 14.28f)
            curveToRelative(-0.34f, 3.0f, -2.73f, 4.59f, -4.17f, 6.83f)
            curveTo(7.22f, 60.86f, 7.0f, 62.45f, 6.0f, 62.48f)
            curveTo(4.11f, 64.65f, 1.46f, 65.63f, 0.13f, 68.32f)
            arcToRelative(2.91f, 2.91f, 0.0f, false, false, 0.76f, 2.92f)
            curveToRelative(2.54f, 1.85f, 6.0f, 1.67f, 9.17f, 1.63f)
            curveToRelative(2.12f, 0.0f, 6.22f, -2.77f, 6.75f, -2.28f)
            curveTo(16.0f, 72.0f, 7.08f, 81.23f, 14.69f, 85.07f)
            curveToRelative(1.51f, -0.42f, 2.0f, -2.08f, 2.72f, -3.1f)
            curveToRelative(0.42f, 0.6f, 2.56f, 2.28f, 11.56f, -8.57f)
            curveToRelative(-0.66f, 6.69f, 9.74f, 11.0f, 9.93f, 18.49f)
            curveToRelative(-1.49f, 9.8f, 9.44f, 22.17f, 11.72f, 27.36f)
            curveToRelative(1.47f, 3.3f, 11.05f, 24.5f, 7.65f, 35.93f)
            curveToRelative(-1.09f, 2.8f, -3.94f, 5.53f, -6.18f, 7.73f)
            curveToRelative(-2.0f, 1.1f, -5.15f, 0.19f, -6.48f, 2.54f)
            arcToRelative(3.3f, 3.3f, 0.0f, false, false, -0.07f, 2.54f)
            curveToRelative(0.8f, 0.64f, 1.0f, 1.36f, 1.63f, 2.2f)
            curveToRelative(-0.68f, 0.9f, -1.78f, 1.93f, -1.82f, 3.25f)
            curveToRelative(0.53f, 2.2f, 2.61f, 0.91f, 4.09f, 1.67f)
            curveToRelative(2.0f, -0.11f, 4.09f, -0.68f, 5.84f, 0.27f)
            curveToRelative(0.49f, -0.15f, 2.57f, 0.23f, 3.26f, 0.0f)
            curveToRelative(2.8f, -0.38f, 4.58f, -3.0f, 6.37f, -4.81f)
            arcToRelative(44.26f, 44.26f, 0.0f, false, true, 2.72f, -7.0f)
            curveToRelative(2.09f, -1.9f, 2.85f, -4.67f, 3.76f, -7.21f)
            curveToRelative(0.11f, -2.91f, 1.86f, -5.15f, 1.89f, -8.07f)
            curveToRelative(1.22f, -4.36f, 1.22f, -9.21f, 2.81f, -13.37f)
            curveToRelative(-1.54f, -5.56f, 1.93f, -8.3f, 1.93f, -8.3f)
            curveToRelative(1.52f, -0.12f, 18.89f, 4.64f, 40.21f, -2.88f)
            curveToRelative(0.84f, 2.08f, 13.55f, 10.55f, 18.46f, 24.0f)
            curveToRelative(-1.12f, 6.66f, -13.19f, 10.54f, -14.74f, 10.92f)
            arcToRelative(3.51f, 3.51f, 0.0f, false, true, -1.82f, 0.26f)
            curveToRelative(-1.41f, 0.61f, -1.37f, 2.35f, -1.82f, 3.49f)
            curveToRelative(1.25f, 0.08f, 2.08f, 1.14f, 3.37f, 0.61f)
            verticalLineToRelative(0.11f)
            curveToRelative(2.0f, -0.45f, 3.45f, 1.25f, 5.35f, 0.27f)
            curveToRelative(1.17f, 0.72f, 2.88f, 0.15f, 4.0f, -0.46f)
            curveToRelative(3.0f, -2.54f, 7.4f, -3.83f, 10.73f, -6.0f)
            curveToRelative(0.0f, 0.0f, 10.1f, -6.0f, 12.09f, -10.31f)
            curveToRelative(-0.19f, -0.37f, -10.33f, -10.44f, -8.45f, -16.9f)
            arcTo(96.93f, 96.93f, 0.0f, false, false, 173.0f, 146.35f)
            curveToRelative(0.08f, 1.67f, 1.1f, 3.11f, 1.75f, 4.66f)
            curveToRelative(9.76f, 11.31f, 12.12f, 7.77f, 12.65f, 7.16f)
            arcToRelative(28.62f, 28.62f, 0.0f, false, true, -0.11f, -5.53f)
            arcToRelative(12.0f, 12.0f, 0.0f, false, true, 2.27f, 9.17f)
            horizontalLineToRelative(-0.07f)
            curveToRelative(-0.3f, 0.69f, 0.0f, 1.9f, -0.64f, 2.46f)
            curveToRelative(-1.18f, 1.18f, -2.0f, 2.62f, -3.38f, 3.64f)
            curveToRelative(-1.78f, 1.33f, -2.24f, 3.83f, -1.71f, 6.18f)
            curveToRelative(0.73f, -0.26f, 0.95f, 0.61f, 1.63f, 0.72f)
            arcToRelative(3.27f, 3.27f, 0.0f, false, false, 2.47f, -0.46f)
            curveToRelative(1.0f, 0.35f, 2.35f, -0.3f, 3.53f, -0.07f)
            curveToRelative(0.9f, -0.84f, 2.27f, -0.61f, 3.37f, -0.91f)
            curveToRelative(2.0f, -0.42f, 2.69f, -2.54f, 4.0f, -3.9f)
            lineToRelative(0.91f, -2.0f)
            curveToRelative(0.0f, -1.37f, 0.79f, -2.73f, 0.0f, -4.09f)
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
            moveTo(1.0f, 68.59f)
            curveToRelative(0.37f, -0.65f, 1.32f, -0.23f, 1.89f, -0.54f)
            arcToRelative(5.1f, 5.1f, 0.0f, false, false, 0.38f, 2.81f)
            curveTo(2.63f, 70.41f, 0.55f, 70.0f, 1.0f, 68.59f)
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
            moveTo(18.32f, 46.49f)
            curveToRelative(-2.52f, 3.28f, -1.85f, 7.07f, -4.16f, 7.0f)
            curveToRelative(0.26f, -2.88f, 2.2f, -5.08f, 4.16f, -7.0f)
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
            moveTo(14.69f, 83.71f)
            reflectiveCurveToRelative(-3.53f, -4.95f, 3.82f, -12.13f)
            curveToRelative(-3.46f, 5.67f, -1.74f, 9.21f, -3.82f, 12.13f)
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
            moveTo(24.81f, 67.94f)
            curveToRelative(-2.75f, 1.54f, -1.52f, 3.53f, -2.39f, 4.0f)
            arcToRelative(2.2f, 2.2f, 0.0f, false, false, -2.28f, 1.28f)
            curveToRelative(0.12f, 0.62f, -0.49f, 1.0f, -0.79f, 1.37f)
            curveToRelative(0.64f, -2.35f, 1.4f, -4.89f, 3.52f, -6.29f)
            curveToRelative(0.0f, -1.1f, 1.44f, -1.71f, 2.2f, -2.19f)
            curveToRelative(0.3f, 0.68f, -0.19f, 1.21f, -0.26f, 1.81f)
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
            moveTo(39.63f, 79.31f)
            arcToRelative(14.61f, 14.61f, 0.0f, false, false, -1.18f, 4.47f)
            curveToRelative(-2.24f, -2.31f, -6.37f, -4.28f, -6.93f, -8.11f)
            curveToRelative(-1.56f, -2.84f, 2.0f, -5.49f, -0.61f, -7.8f)
            curveToRelative(1.67f, -4.65f, -6.9f, -4.1f, -9.74f, -3.72f)
            curveToRelative(-0.38f, 0.53f, -1.18f, 0.0f, -1.63f, 0.46f)
            curveToRelative(-0.57f, -0.46f, -3.68f, -0.76f, -4.47f, -0.57f)
            curveToRelative(-1.48f, 0.0f, -1.86f, -1.59f, -2.28f, -2.62f)
            curveToRelative(-0.49f, -1.21f, 0.83f, -1.62f, 1.0f, -2.57f)
            curveToRelative(1.83f, -8.6f, 5.76f, -5.0f, 6.36f, -4.44f)
            curveToRelative(-0.11f, 0.87f, 0.73f, 1.11f, 1.29f, 1.44f)
            curveToRelative(-1.27f, 0.08f, -4.28f, -1.82f, -4.28f, -1.82f)
            lineToRelative(-2.0f, 3.19f)
            curveToRelative(0.09f, 1.27f, 1.59f, 0.0f, 1.75f, -0.53f)
            arcTo(2.85f, 2.85f, 0.0f, false, false, 18.17f, 59.0f)
            curveToRelative(2.0f, -2.56f, 6.83f, -2.39f, 6.83f, -2.39f)
            curveToRelative(1.0f, -2.06f, -2.47f, -1.67f, -3.38f, -2.54f)
            curveToRelative(-2.31f, -0.75f, -0.83f, -3.25f, -1.63f, -4.88f)
            curveToRelative(0.76f, -2.47f, 6.0f, -5.44f, 5.16f, -6.56f)
            curveToRelative(-1.0f, -0.78f, -2.88f, -0.19f, -2.88f, -0.19f)
            curveToRelative(1.51f, -0.76f, 3.18f, -2.08f, 5.08f, -1.18f)
            curveToRelative(0.34f, -0.07f, 0.6f, -0.26f, 1.0f, -0.18f)
            curveToRelative(1.25f, 1.44f, -1.86f, 1.47f, -0.34f, 2.65f)
            curveToRelative(0.68f, -0.38f, 1.67f, 0.07f, 1.82f, -1.0f)
            curveToRelative(0.19f, -3.0f, -0.34f, -6.07f, -0.27f, -9.37f)
            curveToRelative(0.91f, 2.5f, 1.05f, 8.61f, 2.62f, 9.29f)
            lineToRelative(-0.91f, 3.0f)
            curveToRelative(0.27f, 0.38f, 0.64f, 0.8f, 1.1f, 0.38f)
            reflectiveCurveToRelative(1.44f, -0.11f, 1.82f, -0.38f)
            arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.26f, 1.75f)
            curveToRelative(0.34f, 1.06f, 0.38f, 2.35f, 1.0f, 3.26f)
            curveToRelative(0.45f, 0.15f, 0.79f, -1.1f, 0.79f, -1.37f)
            arcToRelative(5.11f, 5.11f, 0.0f, false, false, 2.28f, 2.2f)
            curveToRelative(0.45f, -1.48f, 1.17f, -4.93f, 1.17f, -4.93f)
            curveToRelative(3.83f, 2.16f, 13.0f, 5.27f, 16.56f, 10.92f)
            curveToRelative(0.46f, 0.26f, -0.19f, 1.1f, 0.57f, 1.1f)
            curveToRelative(0.31f, -0.61f, 0.83f, 0.0f, 1.06f, 0.18f)
            curveToRelative(1.14f, 1.29f, 2.0f, 2.77f, 3.11f, 4.0f)
            curveToRelative(-1.0f, 0.38f, -2.0f, -0.22f, -2.73f, -0.52f)
            curveToRelative(-1.53f, 2.0f, 2.24f, 5.07f, 3.83f, 5.79f)
            curveToRelative(-1.17f, 1.48f, -6.0f, -0.07f, -4.47f, 3.3f)
            curveToRelative(-0.19f, 0.53f, -2.39f, -1.25f, -3.37f, -1.63f)
            curveToRelative(-0.84f, 0.0f, -0.73f, 4.36f, -0.54f, 5.72f)
            curveToRelative(-1.66f, -0.41f, -2.69f, -2.09f, -4.62f, -1.62f)
            arcToRelative(12.0f, 12.0f, 0.0f, false, true, -1.82f, 6.0f)
            curveToRelative(-0.07f, -2.08f, -0.11f, -4.13f, -1.0f, -5.83f)
            curveToRelative(-0.34f, 0.45f, -1.21f, 0.22f, -1.63f, 0.56f)
            curveToRelative(-2.29f, 1.79f, -1.91f, 5.29f, -3.0f, 6.0f)
            curveToRelative(-0.68f, -0.23f, -1.0f, -1.82f, -2.0f, -1.1f)
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
            moveTo(47.28f, 166.63f)
            curveToRelative(0.0f, -0.54f, 0.57f, -0.8f, 1.06f, -1.0f)
            curveToRelative(2.0f, 0.0f, 3.6f, -1.25f, 5.31f, -1.82f)
            curveToRelative(0.49f, -1.21f, 2.0f, -1.1f, 2.73f, -2.0f)
            curveToRelative(-0.76f, 2.05f, -2.16f, 4.67f, -4.21f, 5.27f)
            curveToRelative(-2.0f, 1.69f, -2.73f, 0.83f, -2.73f, 0.83f)
            curveToRelative(2.75f, -1.7f, -2.18f, -0.47f, -2.16f, -1.28f)
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
            moveTo(145.41f, 139.07f)
            lineToRelative(0.38f, 0.19f)
            curveToRelative(0.41f, 1.56f, 1.78f, 2.77f, 2.08f, 4.36f)
            curveToRelative(0.11f, 0.76f, 0.88f, 0.12f, 1.29f, 0.57f)
            curveToRelative(0.5f, 1.0f, 2.61f, 3.16f, 0.45f, 4.17f)
            curveToRelative(-1.78f, 1.59f, -8.92f, 1.84f, -6.82f, 3.45f)
            curveToRelative(1.69f, -0.57f, 1.25f, 0.91f, 1.25f, 0.91f)
            curveToRelative(-4.62f, 3.26f, -13.87f, 10.65f, -15.72f, 9.93f)
            arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.17f, -1.18f)
            curveToRelative(-1.12f, -1.7f, -4.05f, 1.0f, -4.81f, 0.53f)
            curveToRelative(-0.08f, -0.45f, -2.77f, 0.08f, -4.55f, -0.27f)
            curveToRelative(0.42f, -1.81f, 2.47f, -1.81f, 3.83f, -2.08f)
            curveToRelative(0.15f, 0.12f, 0.0f, 0.38f, 0.18f, 0.53f)
            curveToRelative(12.47f, -5.81f, 13.8f, -10.0f, 14.37f, -10.65f)
            curveToRelative(0.35f, -2.95f, -1.37f, -5.64f, -2.38f, -8.18f)
            curveToRelative(-4.0f, -5.65f, -13.92f, -15.6f, -13.47f, -18.72f)
            curveToRelative(3.0f, -1.06f, 16.0f, -4.27f, 18.92f, 2.46f)
            curveToRelative(0.53f, 0.68f, -0.49f, 1.48f, 0.12f, 2.27f)
            curveToRelative(-0.12f, 0.27f, -0.27f, 0.65f, -0.65f, 0.61f)
            curveToRelative(-0.76f, 1.44f, -2.16f, 0.84f, -3.45f, 1.1f)
            curveToRelative(-0.91f, 2.0f, 1.74f, 0.72f, 2.47f, 1.48f)
            curveToRelative(0.75f, 0.6f, 1.7f, 0.95f, 2.42f, 1.44f)
            curveToRelative(-0.34f, 0.76f, -1.74f, 1.0f, -2.0f, 1.89f)
            curveToRelative(1.86f, 1.56f, 4.0f, 2.54f, 4.89f, 5.19f)
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
            moveTo(159.89f, 134.52f)
            arcToRelative(23.44f, 23.44f, 0.0f, false, true, -14.22f, -9.28f)
            horizontalLineToRelative(-0.53f)
            curveToRelative(-1.0f, -1.74f, -7.0f, -12.18f, -26.91f, -4.09f)
            curveToRelative(-3.83f, 0.57f, -7.08f, 2.73f, -11.29f, 2.73f)
            curveToRelative(-11.16f, 2.44f, -27.67f, 0.91f, -27.67f, 0.91f)
            curveToRelative(0.72f, -2.8f, -1.59f, -4.55f, -1.25f, -7.09f)
            curveToRelative(-0.53f, -0.08f, -1.0f, -1.55f, -1.63f, -0.64f)
            curveToRelative(0.19f, 1.21f, -1.1f, 1.06f, -0.83f, 2.27f)
            curveToRelative(-0.16f, 4.24f, -3.79f, 2.81f, -4.48f, 3.3f)
            curveToRelative(0.0f, 0.72f, 3.85f, 3.79f, -0.53f, 4.73f)
            arcTo(3.39f, 3.39f, 0.0f, false, false, 67.0f, 128.0f)
            curveToRelative(0.0f, 0.26f, 0.3f, 0.45f, 0.46f, 0.65f)
            curveToRelative(1.13f, -0.54f, 2.57f, 0.67f, 3.94f, 0.0f)
            arcToRelative(2.45f, 2.45f, 0.0f, false, true, 1.7f, 1.47f)
            curveToRelative(-0.3f, 0.72f, 0.49f, 0.91f, 0.57f, 1.44f)
            curveToRelative(0.0f, 1.55f, 0.46f, 3.79f, -0.76f, 4.74f)
            curveToRelative(-0.23f, 1.89f, -1.59f, 3.64f, -0.72f, 5.65f)
            curveToRelative(0.08f, 1.85f, -1.32f, 6.0f, -1.44f, 6.7f)
            arcToRelative(0.54f, 0.54f, 0.0f, false, false, -0.64f, 0.38f)
            lineToRelative(0.19f, 0.72f)
            curveToRelative(-1.06f, 0.42f, 1.13f, 5.88f, -2.2f, 10.39f)
            curveToRelative(-0.91f, 0.68f, -3.14f, 0.64f, -2.47f, 2.61f)
            curveToRelative(-0.64f, 0.3f, -2.72f, 10.87f, -8.79f, 11.37f)
            curveToRelative(0.0f, -0.23f, 0.23f, -0.42f, 0.15f, -0.72f)
            curveToRelative(-1.28f, 0.07f, -2.08f, -1.67f, -3.52f, -0.65f)
            lineToRelative(-0.72f, -0.07f)
            curveToRelative(-0.08f, -3.41f, -2.84f, 0.68f, -4.48f, 0.46f)
            curveToRelative(-0.45f, -0.88f, 0.69f, -1.07f, 0.54f, -1.94f)
            curveToRelative(1.17f, -0.53f, 20.35f, -9.61f, 8.64f, -39.71f)
            lineToRelative(0.19f, -0.57f)
            arcTo(139.29f, 139.29f, 0.0f, false, false, 52.0f, 118.15f)
            verticalLineToRelative(-0.45f)
            curveToRelative(-4.13f, -6.75f, -9.13f, -13.27f, -10.46f, -21.11f)
            arcToRelative(39.83f, 39.83f, 0.0f, false, true, -0.79f, -6.06f)
            curveToRelative(0.75f, 0.0f, 0.67f, -0.91f, 0.52f, -1.37f)
            curveToRelative(0.27f, -1.7f, -0.91f, -2.88f, -0.34f, -4.54f)
            curveToRelative(1.0f, 0.72f, 1.9f, 2.31f, 3.45f, 1.44f)
            curveToRelative(-0.15f, -1.0f, -1.17f, -1.63f, -0.56f, -2.73f)
            arcToRelative(36.36f, 36.36f, 0.0f, false, true, 1.28f, -5.54f)
            curveToRelative(0.5f, 2.09f, -0.49f, 4.06f, -0.53f, 6.18f)
            curveToRelative(0.46f, 0.76f, 0.84f, 0.11f, 1.37f, -0.11f)
            curveToRelative(0.45f, -0.68f, 1.17f, -0.49f, 1.82f, -0.8f)
            curveToRelative(1.59f, -1.51f, 2.31f, -3.75f, 3.79f, -5.45f)
            curveToRelative(0.0f, 0.0f, 1.0f, -0.74f, 2.92f, 2.0f)
            curveToRelative(0.0f, 0.0f, 1.34f, 0.48f, 1.28f, -5.9f)
            arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.16f, 1.81f)
            curveToRelative(0.0f, 1.0f, 1.0f, 0.84f, 1.75f, 1.06f)
            curveToRelative(0.75f, -0.49f, 0.0f, -1.7f, 0.64f, -2.16f)
            arcToRelative(7.41f, 7.41f, 0.0f, false, true, -0.57f, -3.37f)
            curveToRelative(2.62f, 0.42f, 5.35f, -3.37f, 5.91f, -4.55f)
            arcToRelative(1.53f, 1.53f, 0.0f, false, false, -1.36f, -0.45f)
            arcToRelative(0.91f, 0.91f, 0.0f, false, true, -1.36f, 0.0f)
            curveToRelative(-0.42f, -0.84f, -1.41f, -0.72f, -2.0f, -1.37f)
            curveToRelative(1.0f, 0.0f, 2.82f, 0.63f, 4.17f, -0.72f)
            curveToRelative(-0.31f, -0.87f, -1.56f, -1.21f, -1.75f, -2.2f)
            curveToRelative(1.22f, 0.84f, 2.73f, 1.41f, 3.0f, 3.0f)
            arcToRelative(2.81f, 2.81f, 0.0f, false, true, 1.18f, 3.11f)
            arcToRelative(2.13f, 2.13f, 0.0f, false, false, -1.82f, 0.45f)
            arcTo(16.9f, 16.9f, 0.0f, false, true, 67.1f, 71.0f)
            curveToRelative(-0.41f, 0.39f, -2.0f, 0.4f, -1.1f, 2.43f)
            curveToRelative(-2.25f, 7.0f, -7.35f, 7.81f, -8.26f, 8.64f)
            lineToRelative(0.15f, 1.21f)
            lineToRelative(1.22f, 0.08f)
            curveToRelative(-4.55f, 2.44f, -5.65f, 4.93f, -5.65f, 4.93f)
            curveToRelative(0.0f, 1.68f, 1.93f, -0.46f, 3.07f, -0.39f)
            curveToRelative(0.0f, 0.0f, -4.66f, 5.0f, -4.55f, 7.93f)
            curveToRelative(0.11f, 0.15f, 4.57f, -8.42f, 8.38f, -6.94f)
            curveToRelative(-0.12f, -1.1f, 1.0f, -1.0f, 1.17f, -1.06f)
            curveToRelative(-0.62f, -2.22f, -2.76f, -1.32f, -3.18f, -1.29f)
            curveToRelative(1.33f, -2.26f, 5.57f, -2.27f, 5.57f, -2.27f)
            curveToRelative(0.11f, -1.21f, -1.93f, -2.0f, -1.93f, -2.0f)
            arcToRelative(26.81f, 26.81f, 0.0f, false, true, 6.1f, -3.91f)
            curveToRelative(3.0f, -4.0f, 5.57f, -0.68f, 6.63f, 0.0f)
            curveToRelative(2.11f, 2.72f, -4.85f, 2.36f, -5.08f, 4.82f)
            curveToRelative(0.49f, 0.38f, 3.0f, -0.87f, 5.0f, 0.26f)
            curveToRelative(0.07f, 1.63f, -6.82f, 4.17f, -5.2f, 6.67f)
            curveToRelative(1.56f, -0.72f, 3.53f, -2.91f, 5.2f, -1.29f)
            curveToRelative(1.51f, -0.07f, 1.1f, -2.0f, 2.54f, -2.0f)
            lineToRelative(2.08f, 0.38f)
            curveToRelative(0.68f, 1.13f, -2.54f, 0.32f, -2.27f, 2.27f)
            curveToRelative(0.34f, 0.27f, 3.24f, -1.38f, 3.82f, 1.89f)
            curveToRelative(-0.3f, 0.8f, -2.86f, -2.32f, -1.55f, 0.12f)
            curveToRelative(-0.34f, 2.35f, -0.08f, 8.73f, -3.26f, 9.55f)
            curveToRelative(-0.19f, 1.0f, 2.47f, 2.61f, 2.47f, 2.61f)
            curveToRelative(0.11f, 1.86f, -2.69f, 1.0f, -2.0f, 2.65f)
            curveToRelative(3.3f, 1.6f, 0.19f, 5.08f, -0.19f, 6.9f)
            curveToRelative(0.12f, 0.23f, 0.35f, 0.19f, 0.57f, 0.19f)
            curveToRelative(0.35f, -1.17f, 1.52f, -1.44f, 2.43f, -2.0f)
            curveToRelative(0.87f, 0.19f, 1.29f, 1.29f, 2.2f, 0.27f)
            curveToRelative(5.15f, -1.29f, 10.39f, 0.11f, 14.48f, 2.46f)
            curveToRelative(0.87f, -0.72f, -1.48f, -2.73f, 0.6f, -2.35f)
            curveToRelative(5.86f, 1.16f, 8.42f, 6.0f, 9.29f, 5.27f)
            curveToRelative(1.06f, -0.61f, 0.57f, -1.86f, 1.18f, -2.65f)
            curveToRelative(0.67f, 1.0f, 1.32f, 2.39f, 2.84f, 2.19f)
            curveToRelative(1.0f, -1.09f, 1.51f, -2.8f, 2.8f, -3.56f)
            curveToRelative(1.89f, 0.08f, 3.9f, 0.53f, 4.74f, -1.44f)
            curveToRelative(1.71f, -1.32f, 6.06f, 2.0f, 6.0f, -1.74f)
            curveToRelative(0.9f, -0.15f, 1.29f, -1.37f, 2.27f, -0.53f)
            curveToRelative(0.76f, -0.53f, 1.21f, -2.46f, 2.58f, -2.0f)
            curveToRelative(0.61f, -0.34f, 1.14f, -1.1f, 1.71f, -0.27f)
            curveToRelative(0.76f, 1.0f, 1.17f, 2.32f, 2.39f, 2.66f)
            curveToRelative(1.0f, 0.26f, 0.79f, 2.35f, 2.16f, 1.62f)
            curveToRelative(1.39f, 0.12f, 2.95f, 1.68f, 4.54f, 0.46f)
            curveToRelative(0.83f, 0.23f, 1.48f, -0.56f, 2.2f, -0.91f)
            curveToRelative(-0.31f, -0.72f, -1.37f, -0.6f, -1.74f, -1.36f)
            arcToRelative(25.85f, 25.85f, 0.0f, false, false, 2.38f, -5.91f)
            curveToRelative(1.25f, -0.31f, 1.56f, 1.55f, 2.81f, 1.55f)
            arcToRelative(1.53f, 1.53f, 0.0f, false, false, 0.53f, 0.8f)
            arcToRelative(0.88f, 0.88f, 0.0f, false, false, 0.83f, -1.18f)
            curveToRelative(-0.18f, -1.52f, 2.16f, -1.0f, 2.46f, -2.54f)
            lineToRelative(1.26f, -0.38f)
            curveToRelative(-0.55f, 2.47f, 1.93f, 6.48f, 1.93f, 6.48f)
            curveToRelative(-3.62f, -1.0f, -3.3f, 3.57f, -2.27f, 5.46f)
            curveToRelative(-0.5f, 0.34f, -0.23f, 1.29f, -1.1f, 0.8f)
            curveToRelative(-0.61f, -1.22f, -2.54f, 0.26f, -2.54f, 0.26f)
            curveToRelative(0.49f, 0.91f, 2.12f, 0.87f, 1.89f, 2.28f)
            curveToRelative(-0.34f, 0.79f, 0.26f, 1.44f, 0.46f, 2.12f)
            arcToRelative(3.9f, 3.9f, 0.0f, false, false, -4.63f, 1.82f)
            curveToRelative(1.48f, -0.23f, 1.48f, 1.32f, 2.47f, 1.81f)
            curveToRelative(2.38f, 2.89f, 5.87f, 4.63f, 9.25f, 6.18f)
            arcToRelative(10.36f, 10.36f, 0.0f, false, false, 5.38f, 4.0f)
            curveToRelative(0.42f, 0.87f, -0.35f, 1.1f, -0.72f, 1.55f)
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
            moveTo(196.62f, 169.35f)
            arcToRelative(4.41f, 4.41f, 0.0f, false, false, -1.71f, 2.2f)
            curveToRelative(-3.12f, -1.9f, -4.32f, 1.17f, -5.27f, 0.91f)
            curveToRelative(-0.42f, -1.0f, 1.27f, -2.69f, -0.45f, -3.11f)
            curveToRelative(-1.44f, -0.33f, -1.57f, 3.71f, -3.76f, 3.0f)
            curveToRelative(-1.0f, -3.61f, 4.82f, -4.62f, 5.19f, -7.19f)
            curveToRelative(0.76f, -0.31f, 2.94f, -15.12f, -6.82f, -18.73f)
            curveToRelative(-2.8f, -1.59f, -6.4f, -2.0f, -10.08f, -1.93f)
            curveToRelative(-2.14f, -0.4f, -7.58f, -3.26f, -9.1f, -5.64f)
            curveToRelative(-0.3f, -0.5f, 0.23f, -1.29f, -0.45f, -1.63f)
            arcToRelative(5.88f, 5.88f, 0.0f, false, true, -3.11f, 0.37f)
            curveToRelative(-0.45f, -0.64f, 0.0f, -3.52f, 0.53f, -3.29f)
            curveToRelative(11.0f, 5.88f, 10.76f, 3.45f, 10.84f, 3.37f)
            curveToRelative(-1.55f, -1.55f, -4.05f, -1.71f, -5.91f, -3.0f)
            arcToRelative(17.46f, 17.46f, 0.0f, false, false, 3.64f, -1.63f)
            curveToRelative(0.53f, -1.83f, -6.44f, -1.0f, -6.44f, -1.0f)
            arcTo(12.35f, 12.35f, 0.0f, false, true, 161.0f, 129.0f)
            curveToRelative(0.46f, -0.49f, 0.61f, -0.83f, 0.0f, -1.17f)
            curveToRelative(-2.8f, 0.65f, -5.79f, -4.78f, -6.48f, -5.91f)
            curveToRelative(0.38f, 0.11f, 0.65f, 0.45f, 1.18f, 0.45f)
            lineToRelative(0.3f, -0.57f)
            curveToRelative(0.05f, 0.27f, 1.06f, 0.72f, 1.06f, 0.72f)
            curveToRelative(0.35f, -1.1f, -3.4f, -9.7f, 1.94f, -8.64f)
            curveToRelative(1.43f, -0.34f, 2.31f, 2.62f, 3.18f, 0.76f)
            curveToRelative(-0.11f, -1.82f, -3.11f, -3.14f, -1.1f, -4.93f)
            curveToRelative(0.34f, 0.19f, 0.76f, 1.0f, 1.18f, 0.19f)
            curveToRelative(1.92f, 1.39f, -0.84f, 1.44f, 2.46f, 1.44f)
            curveToRelative(0.65f, -1.21f, -1.17f, -1.93f, -0.53f, -3.25f)
            curveToRelative(2.31f, -0.31f, 3.56f, 1.77f, 5.45f, 2.8f)
            curveToRelative(0.0f, -0.53f, 0.88f, -1.67f, 0.61f, -2.28f)
            curveToRelative(-5.48f, -8.94f, -2.8f, -10.53f, -2.8f, -10.53f)
            curveToRelative(4.4f, 2.73f, 9.13f, 27.82f, 12.47f, 33.65f)
            curveToRelative(3.43f, 6.73f, 15.94f, 5.85f, 15.92f, 11.18f)
            arcTo(59.65f, 59.65f, 0.0f, false, false, 197.37f, 161.0f)
            curveToRelative(-1.17f, 0.83f, 0.65f, 1.51f, 0.15f, 2.61f)
            curveToRelative(0.11f, 2.0f, 0.76f, 4.25f, -0.9f, 5.72f)
        }
    }
        .build()
}
