package com.mshdabiola.ludo.screen.game.component.dragon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

fun Dragon.getGreen(iconColor: Long, accentColor: Long): ImageVector {
    return Builder(
        name = "Green9",
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
            moveTo(163.33f, 148.0f)
            curveToRelative(-4.83f, -2.27f, -30.37f, -37.0f, -33.5f, -42.24f)
            curveToRelative(-0.35f, -0.49f, -26.4f, -50.95f, -64.87f, -20.3f)
            curveToRelative(-2.27f, 1.09f, -14.0f, 3.33f, -18.48f, -14.66f)
            curveToRelative(-1.15f, -3.11f, -11.93f, -30.51f, -25.25f, -33.94f)
            curveToRelative(0.0f, 0.0f, -6.6f, -4.66f, -9.68f, -2.86f)
            arcToRelative(11.17f, 11.17f, 0.0f, false, true, -5.71f, 2.0f)
            curveToRelative(-4.21f, -0.53f, -6.26f, 1.78f, -5.68f, 3.0f)
            curveToRelative(3.09f, 0.4f, 9.76f, 1.05f, 10.18f, 1.56f)
            curveToRelative(-0.36f, 0.52f, -9.53f, -0.13f, -10.34f, 0.0f)
            curveToRelative(0.17f, 0.57f, 1.32f, 2.39f, 2.0f, 2.62f)
            curveToRelative(0.36f, 0.54f, 7.8f, 0.31f, 8.77f, 1.48f)
            curveToRelative(1.43f, 1.08f, 5.53f, 0.47f, 6.69f, 1.31f)
            curveToRelative(0.23f, 0.12f, 14.48f, 4.11f, 17.75f, 34.75f)
            curveToRelative(0.06f, 0.65f, -1.16f, 13.17f, 7.6f, 28.5f)
            curveToRelative(2.26f, 8.57f, -6.18f, 37.63f, -11.7f, 43.48f)
            curveToRelative(-0.25f, 0.5f, -4.56f, 3.72f, -4.52f, 5.48f)
            arcToRelative(13.79f, 13.79f, 0.0f, false, true, 2.8f, -0.11f)
            arcToRelative(14.21f, 14.21f, 0.0f, false, true, -0.15f, 1.71f)
            curveToRelative(0.23f, 0.13f, 2.69f, -0.15f, 3.26f, -0.1f)
            curveToRelative(0.11f, 0.22f, 0.06f, 1.39f, 0.21f, 1.56f)
            curveToRelative(0.51f, -0.17f, 1.36f, -0.52f, 2.55f, -1.0f)
            curveToRelative(1.37f, -1.41f, 5.85f, -0.86f, 6.63f, -1.51f)
            curveToRelative(3.88f, -2.0f, 10.9f, -28.71f, 15.7f, -28.93f)
            curveToRelative(-4.15f, -3.0f, -8.59f, -10.22f, -8.63f, -10.28f)
            curveToRelative(-0.94f, 0.44f, -3.66f, 9.67f, -3.46f, 11.74f)
            curveToRelative(-0.1f, 0.19f, -3.45f, 3.08f, -3.26f, 4.0f)
            curveToRelative(0.07f, 0.43f, 2.59f, 2.93f, 2.34f, 3.76f)
            curveToRelative(-0.36f, -0.13f, -4.29f, -2.42f, -4.0f, -4.27f)
            arcToRelative(16.14f, 16.14f, 0.0f, false, true, 3.17f, -3.44f)
            curveToRelative(1.26f, -8.35f, 4.79f, -12.81f, 4.78f, -12.85f)
            arcToRelative(19.45f, 19.45f, 0.0f, false, true, -1.35f, -6.86f)
            curveToRelative(0.0f, -0.34f, -2.52f, -5.1f, -2.12f, -6.5f)
            arcToRelative(36.51f, 36.51f, 0.0f, false, true, 3.19f, 4.25f)
            curveToRelative(0.0f, 0.17f, 2.2f, 16.0f, 13.89f, 20.63f)
            curveToRelative(-0.16f, -1.08f, -9.64f, -18.56f, -7.0f, -25.08f)
            curveToRelative(0.0f, 0.1f, 2.16f, 15.13f, 5.8f, 18.55f)
            curveToRelative(-5.34f, -18.83f, 5.11f, -22.86f, 5.2f, -22.82f)
            curveToRelative(-0.09f, 0.14f, -8.32f, 8.27f, -4.1f, 22.94f)
            curveToRelative(0.21f, 0.74f, 6.21f, 22.35f, 3.43f, 29.91f)
            curveToRelative(-0.39f, 2.23f, -6.36f, 6.73f, -5.94f, 10.63f)
            arcToRelative(18.75f, 18.75f, 0.0f, false, false, 3.33f, -0.76f)
            curveToRelative(0.12f, 0.26f, -0.12f, 2.46f, 0.48f, 2.48f)
            curveToRelative(0.25f, -0.16f, 2.76f, -1.66f, 3.5f, -2.15f)
            curveToRelative(0.06f, 0.18f, 0.33f, 2.61f, 0.35f, 2.65f)
            curveToRelative(0.44f, -0.16f, 3.16f, -2.08f, 3.38f, -2.13f)
            arcToRelative(2.9f, 2.9f, 0.0f, false, false, 0.63f, 1.69f)
            arcToRelative(16.75f, 16.75f, 0.0f, false, false, 4.65f, -1.2f)
            curveToRelative(3.88f, -8.23f, -0.57f, -29.08f, 4.53f, -35.55f)
            curveToRelative(3.27f, -8.65f, 2.87f, -12.66f, 2.33f, -16.57f)
            curveToRelative(-0.64f, -1.91f, 2.18f, -7.89f, 1.86f, -11.62f)
            curveToRelative(1.0f, 0.45f, 0.61f, 4.87f, 0.0f, 7.74f)
            curveToRelative(1.64f, -0.44f, 4.64f, -7.38f, 4.72f, -7.51f)
            arcToRelative(0.23f, 0.23f, 0.0f, false, true, 0.09f, 0.11f)
            curveToRelative(0.61f, 2.48f, -4.57f, 11.0f, -5.67f, 11.73f)
            curveToRelative(0.0f, 0.0f, 2.3f, 6.0f, -3.79f, 21.22f)
            curveToRelative(0.57f, 0.16f, 7.44f, 1.6f, 20.27f, -2.34f)
            curveToRelative(0.64f, -3.32f, 0.25f, -4.94f, 1.28f, -6.78f)
            curveToRelative(7.09f, -12.0f, 4.66f, -25.81f, 4.71f, -25.74f)
            arcToRelative(20.3f, 20.3f, 0.0f, false, true, 0.79f, 15.88f)
            curveToRelative(-9.19f, 21.29f, -8.48f, 27.38f, -7.07f, 32.29f)
            curveToRelative(-3.52f, -7.26f, -1.46f, -14.27f, -1.66f, -14.47f)
            curveToRelative(-1.25f, 0.65f, -6.81f, 2.36f, -7.13f, 2.57f)
            curveToRelative(-0.82f, 7.93f, 7.39f, 16.84f, 7.35f, 17.17f)
            curveToRelative(0.1f, 2.7f, -7.55f, 10.05f, -6.87f, 12.25f)
            curveToRelative(1.26f, -0.41f, 4.32f, -1.77f, 4.62f, -1.0f)
            arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.08f, 2.0f)
            curveToRelative(0.12f, -0.05f, 2.5f, -1.38f, 3.0f, -1.58f)
            reflectiveCurveToRelative(0.46f, 1.42f, 0.56f, 1.7f)
            arcToRelative(16.9f, 16.9f, 0.0f, false, true, 3.18f, -1.33f)
            curveToRelative(0.91f, -0.17f, 14.59f, -1.72f, 11.64f, -5.6f)
            curveToRelative(-0.09f, -0.34f, -3.88f, -4.92f, -4.06f, -6.9f)
            curveToRelative(-1.23f, -0.92f, -0.47f, 5.0f, -1.0f, 5.68f)
            curveToRelative(-2.42f, -4.12f, 2.9f, -11.67f, 3.28f, -12.9f)
            curveToRelative(2.74f, -4.33f, 2.09f, -16.38f, 3.09f, -19.44f)
            curveToRelative(1.48f, -4.55f, 5.0f, -17.15f, 2.83f, -21.48f)
            curveToRelative(3.77f, 1.0f, 1.19f, 18.93f, -2.13f, 24.5f)
            curveToRelative(0.9f, 0.68f, 10.2f, -9.24f, 10.76f, -11.27f)
            curveToRelative(1.93f, 1.1f, -9.41f, 12.0f, -9.77f, 12.39f)
            curveToRelative(0.0f, 0.18f, 8.66f, 1.28f, 16.0f, -2.86f)
            curveToRelative(0.34f, 1.09f, -3.0f, 3.05f, -3.24f, 3.19f)
            curveToRelative(0.0f, 0.29f, 5.53f, 10.16f, 27.37f, 23.85f)
            curveToRelative(-16.6f, -5.64f, -28.88f, -23.76f, -29.0f, -23.8f)
            reflectiveCurveToRelative(-4.5f, 1.76f, -6.08f, 1.31f)
            curveToRelative(0.38f, 0.48f, 29.54f, 37.55f, 62.22f, 24.08f)
            curveToRelative(2.7f, -0.86f, 14.8f, -6.06f, 15.15f, -9.0f)
            curveToRelative(-0.51f, 0.05f, -26.27f, 9.81f, -36.67f, 1.39f)
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
            moveTo(14.21f, 37.19f)
            arcToRelative(8.9f, 8.9f, 0.0f, false, true, -2.0f, -0.64f)
            curveToRelative(0.9f, -1.43f, 2.23f, 0.0f, 2.0f, 0.64f)
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
            moveTo(14.15f, 43.0f)
            lineToRelative(-1.27f, -0.22f)
            reflectiveCurveToRelative(-0.36f, -0.18f, 1.46f, -0.62f)
            arcToRelative(7.2f, 7.2f, 0.0f, false, true, 2.56f, -1.61f)
            arcToRelative(2.27f, 2.27f, 0.0f, false, false, 1.58f, -2.33f)
            reflectiveCurveToRelative(1.6f, 1.0f, -0.23f, 2.0f)
            arcTo(10.33f, 10.33f, 0.0f, false, false, 14.15f, 43.0f)
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
            moveTo(17.41f, 42.63f)
            curveToRelative(0.19f, -0.72f, 2.52f, -1.0f, 2.52f, -1.0f)
            lineToRelative(1.77f, -1.15f)
            curveToRelative(0.34f, 1.32f, -4.24f, 2.72f, -4.29f, 2.16f)
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
            moveTo(41.0f, 153.58f)
            curveToRelative(0.0f, 1.11f, -7.0f, 0.0f, -6.84f, -1.0f)
            curveToRelative(0.0f, -0.28f, 6.84f, 0.85f, 6.84f, 1.0f)
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
            moveTo(36.28f, 71.08f)
            curveToRelative(-0.27f, -3.4f, -0.87f, -11.87f, -4.0f, -15.0f)
            curveToRelative(0.0f, 0.0f, 5.23f, 0.79f, 5.32f, 20.14f)
            curveTo(38.09f, 83.0f, 39.47f, 93.5f, 47.84f, 102.0f)
            curveTo(35.33f, 94.0f, 36.51f, 74.0f, 36.28f, 71.08f)
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
            moveTo(75.69f, 133.43f)
            quadToRelative(0.24f, 3.52f, -1.32f, 4.53f)
            quadToRelative(0.61f, 3.0f, 1.4f, 11.83f)
            curveToRelative(1.0f, 5.62f, -3.58f, 6.74f, -5.56f, 6.65f)
            arcToRelative(38.25f, 38.25f, 0.0f, false, true, 3.14f, 2.4f)
            arcToRelative(59.87f, 59.87f, 0.0f, false, true, -5.71f, -2.32f)
            arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.09f, -0.61f)
            curveToRelative(2.85f, -0.42f, 6.89f, -0.5f, 7.5f, -4.68f)
            curveToRelative(-0.56f, -9.41f, -2.06f, -12.52f, -2.09f, -12.51f)
            arcToRelative(1.31f, 1.31f, 0.0f, false, true, -1.62f, 0.0f)
            reflectiveCurveToRelative(4.5f, -1.74f, 2.0f, -9.12f)
            curveToRelative(-1.42f, -3.35f, 5.27f, -18.86f, 1.92f, -24.59f)
            curveToRelative(6.87f, 3.62f, -3.0f, 21.43f, 0.21f, 28.44f)
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
            moveTo(107.3f, 150.79f)
            curveToRelative(-0.44f, 0.92f, -2.27f, 4.14f, -2.38f, 4.4f)
            curveToRelative(1.44f, 0.6f, 1.75f, 1.22f, 1.75f, 1.22f)
            curveToRelative(-2.21f, -0.94f, -7.51f, -1.35f, -6.28f, -2.24f)
            curveToRelative(1.23f, -0.52f, 4.27f, 0.89f, 4.27f, 0.89f)
            arcToRelative(24.0f, 24.0f, 0.0f, false, false, 2.42f, -6.47f)
            curveToRelative(-1.54f, -18.0f, 3.78f, -18.42f, 3.86f, -18.2f)
            curveToRelative(-4.46f, 5.28f, -2.12f, 18.4f, -3.64f, 20.4f)
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
            moveTo(149.77f, 140.22f)
            curveToRelative(-7.92f, -4.68f, -25.83f, -34.38f, -30.0f, -38.93f)
            curveToRelative(-3.29f, -5.08f, -9.44f, -14.35f, -23.88f, -18.34f)
            curveToRelative(-15.0f, -3.69f, -28.57f, 10.1f, -30.56f, 6.26f)
            curveToRelative(5.05f, -0.77f, 16.06f, -10.52f, 28.84f, -7.93f)
            curveToRelative(2.94f, 0.58f, 14.08f, 1.24f, 25.71f, 17.46f)
            curveToRelative(1.62f, 2.35f, 10.12f, 17.33f, 29.91f, 41.46f)
            arcToRelative(0.08f, 0.08f, 0.0f, false, false, -0.07f, 0.0f)
        }
    }
        .build()
}
