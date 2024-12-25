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

fun Dragon.getBlue(iconColor: Long, accentColor: Long): ImageVector {
    return Builder(
        name = "Blue9",
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
            moveTo(28.42f, 0.74f)
            arcToRelative(8.25f, 8.25f, 0.0f, false, true, 4.0f, 1.67f)
            curveToRelative(1.07f, 0.86f, 3.76f, 5.39f, 5.18f, 5.85f)
            curveToRelative(3.76f, 1.9f, 7.54f, 11.0f, 7.74f, 11.23f)
            curveToRelative(3.77f, 2.81f, 6.0f, 11.52f, 6.0f, 11.58f)
            curveToRelative(2.93f, -0.79f, 25.08f, 45.29f, 27.0f, 47.43f)
            curveToRelative(0.0f, 0.1f, 0.88f, 8.92f, 6.22f, 12.22f)
            curveToRelative(-0.39f, -0.83f, -4.07f, -5.78f, -4.92f, -9.82f)
            curveToRelative(-0.57f, -3.52f, 6.32f, -8.0f, 6.63f, -8.23f)
            lineToRelative(0.63f, -0.58f)
            curveToRelative(4.0f, -0.48f, 8.72f, -3.94f, 8.72f, -3.94f)
            curveToRelative(1.14f, -2.16f, 11.18f, -3.81f, 10.62f, -5.3f)
            curveToRelative(0.0f, 0.0f, 0.47f, -8.73f, 0.6f, -9.05f)
            reflectiveCurveToRelative(3.82f, -3.27f, 3.92f, -3.46f)
            curveToRelative(0.32f, -0.57f, 0.75f, -14.0f, 1.0f, -14.28f)
            curveToRelative(0.06f, -0.07f, 6.38f, -2.35f, 6.58f, -2.58f)
            reflectiveCurveToRelative(2.73f, -8.33f, 2.76f, -8.36f)
            reflectiveCurveTo(125.0f, 23.28f, 125.0f, 23.2f)
            reflectiveCurveTo(128.19f, 17.0f, 128.25f, 17.0f)
            curveToRelative(0.36f, -0.4f, 5.78f, -1.23f, 6.0f, -1.42f)
            reflectiveCurveToRelative(1.48f, -4.6f, 1.72f, -4.87f)
            curveToRelative(0.39f, 0.0f, 6.48f, -0.13f, 7.0f, -0.69f)
            curveToRelative(0.25f, -0.29f, 2.25f, -3.45f, 2.44f, -3.72f)
            curveToRelative(0.45f, -0.17f, 5.48f, 1.91f, 5.84f, 1.65f)
            lineToRelative(2.78f, -2.0f)
            curveToRelative(2.17f, -1.36f, 7.09f, 8.56f, 7.48f, 8.72f)
            curveToRelative(0.16f, -0.09f, 4.33f, -3.1f, 5.0f, -3.46f)
            curveToRelative(2.0f, 4.28f, 3.34f, 21.0f, 3.52f, 21.7f)
            arcToRelative(16.0f, 16.0f, 0.0f, false, true, 3.27f, 0.71f)
            curveToRelative(0.81f, 3.79f, -0.4f, 20.62f, -0.4f, 20.62f)
            curveToRelative(0.0f, 0.2f, 2.9f, 0.25f, 2.43f, 2.71f)
            curveToRelative(-0.46f, 3.13f, -3.62f, 18.74f, -3.78f, 19.2f)
            arcToRelative(9.55f, 9.55f, 0.0f, false, false, 1.89f, 1.46f)
            curveToRelative(0.61f, 1.67f, -2.71f, 11.22f, -3.1f, 11.74f)
            curveToRelative(-2.58f, 1.68f, -6.89f, 11.52f, -6.73f, 11.85f)
            curveToRelative(0.0f, 0.0f, 3.81f, 2.48f, 1.43f, 5.65f)
            curveToRelative(0.0f, 0.0f, -1.27f, 6.0f, -4.57f, 6.93f)
            curveToRelative(-0.89f, 0.13f, -15.3f, 0.74f, -18.7f, 2.82f)
            curveToRelative(-0.6f, 0.56f, 2.94f, 4.72f, 2.82f, 5.81f)
            arcToRelative(27.32f, 27.32f, 0.0f, false, false, 3.32f, -0.82f)
            curveToRelative(3.88f, 0.0f, 4.74f, 20.75f, 5.0f, 21.13f)
            curveToRelative(49.55f, 16.43f, 26.43f, 40.06f, 25.26f, 40.84f)
            curveToRelative(-1.64f, 1.09f, -7.75f, 14.14f, -10.53f, 13.9f)
            arcToRelative(30.11f, 30.11f, 0.0f, false, true, -0.28f, -3.36f)
            arcToRelative(24.47f, 24.47f, 0.0f, false, true, 1.57f, -2.0f)
            arcToRelative(7.54f, 7.54f, 0.0f, false, false, -0.09f, -2.65f)
            curveToRelative(0.21f, -0.31f, 1.68f, -1.35f, 1.94f, -1.66f)
            curveToRelative(0.0f, -0.22f, 0.0f, -2.37f, 0.0f, -2.66f)
            curveToRelative(1.0f, -0.67f, 1.33f, -1.39f, 1.14f, -2.17f)
            arcToRelative(0.48f, 0.48f, 0.0f, false, false, -0.35f, -0.13f)
            curveToRelative(-0.29f, 0.52f, -6.92f, 15.29f, -7.64f, 11.22f)
            curveToRelative(9.19f, -18.57f, 0.78f, -28.47f, 0.6f, -29.11f)
            curveToRelative(0.2f, -6.62f, -3.85f, -11.61f, -3.93f, -11.79f)
            curveToRelative(3.68f, 18.21f, 1.51f, 27.81f, 1.19f, 30.67f)
            arcToRelative(12.26f, 12.26f, 0.0f, false, false, 0.14f, 3.56f)
            curveToRelative(2.5f, 8.0f, -0.93f, 10.47f, -0.93f, 10.47f)
            reflectiveCurveToRelative(-2.34f, 2.0f, -3.78f, 2.14f)
            curveToRelative(-0.89f, 0.22f, -4.74f, -1.65f, -4.92f, -1.81f)
            arcToRelative(3.48f, 3.48f, 0.0f, false, true, -0.8f, -1.45f)
            curveToRelative(0.84f, 0.08f, 10.23f, 1.87f, 8.55f, -2.58f)
            curveToRelative(-0.08f, 0.0f, -3.6f, 2.09f, -4.94f, 1.55f)
            curveToRelative(-0.84f, -0.26f, -3.91f, -3.13f, -3.51f, -4.29f)
            curveToRelative(1.59f, 1.0f, 6.68f, 1.87f, 6.0f, -0.51f)
            curveToRelative(-2.0f, 0.44f, -6.46f, 1.0f, -7.17f, -2.57f)
            curveToRelative(2.14f, 0.51f, 7.83f, 1.8f, 5.5f, -3.27f)
            curveToRelative(-1.47f, -2.68f, -9.7f, -18.63f, -9.7f, -18.63f)
            curveToRelative(-0.26f, -0.56f, -37.43f, 17.07f, -62.52f, -5.07f)
            curveToRelative(-1.45f, -1.41f, -5.71f, -4.84f, -9.69f, -5.7f)
            curveToRelative(-7.26f, -1.61f, -11.51f, -9.28f, -11.78f, -9.76f)
            arcToRelative(7.87f, 7.87f, 0.0f, false, false, -7.25f, -4.29f)
            curveToRelative(-2.17f, 6.15f, -17.29f, 24.09f, -17.47f, 24.94f)
            arcToRelative(90.29f, 90.29f, 0.0f, false, true, -0.59f, 12.68f)
            reflectiveCurveToRelative(-3.91f, 4.06f, -5.28f, 5.78f)
            curveToRelative(-4.39f, 6.06f, -10.66f, 2.09f, -11.0f, 2.0f)
            curveToRelative(0.08f, -0.29f, 9.72f, -3.19f, 10.09f, -6.52f)
            curveToRelative(-2.91f, 1.11f, -10.56f, 2.81f, -12.0f, -2.54f)
            curveToRelative(0.37f, 0.0f, 11.0f, 1.0f, 13.0f, -4.4f)
            curveToRelative(0.0f, -0.09f, -10.94f, 5.1f, -13.74f, -3.72f)
            curveToRelative(9.47f, 4.47f, 20.0f, -12.46f, 4.4f, -25.78f)
            curveToRelative(5.59f, -0.77f, 9.53f, 3.25f, 9.8f, 3.35f)
            curveToRelative(0.65f, -0.36f, 2.91f, -6.67f, 1.17f, -10.17f)
            curveToRelative(-1.86f, -3.17f, -0.09f, -12.41f, -0.09f, -12.41f)
            reflectiveCurveToRelative(-6.39f, -7.4f, -7.33f, -8.57f)
            curveToRelative(1.64f, -0.22f, 13.36f, 1.55f, 12.0f, 13.69f)
            curveToRelative(3.32f, 1.53f, 8.3f, -6.65f, 8.7f, -7.55f)
            curveToRelative(0.69f, -4.29f, 6.64f, -9.0f, 6.64f, -9.0f)
            curveToRelative(2.48f, -8.4f, 10.64f, 0.0f, 10.75f, 0.37f)
            curveToRelative(0.0f, 0.1f, -0.85f, 6.63f, 1.69f, 11.42f)
            curveToRelative(0.23f, -0.09f, 0.37f, -0.19f, 0.41f, -0.34f)
            curveTo(65.34f, 120.0f, 65.0f, 104.92f, 67.0f, 102.46f)
            curveToRelative(0.37f, 0.16f, 3.18f, 2.23f, 3.75f, 3.42f)
            curveToRelative(3.0f, 7.92f, 13.0f, 11.72f, 13.06f, 11.75f)
            reflectiveCurveToRelative(6.36f, 12.8f, 14.7f, 17.94f)
            curveToRelative(2.26f, 5.07f, 7.17f, 18.47f, 40.8f, 23.85f)
            arcToRelative(37.86f, 37.86f, 0.0f, false, false, -3.54f, -2.54f)
            curveToRelative(-1.65f, -1.1f, -31.21f, -9.13f, -34.31f, -22.65f)
            curveToRelative(-0.44f, -1.29f, -12.0f, -9.64f, -14.42f, -17.17f)
            curveTo(76.7f, 111.77f, 73.0f, 101.55f, 71.49f, 101.27f)
            curveToRelative(-3.78f, -1.86f, -5.63f, -6.92f, -6.59f, -8.0f)
            arcToRelative(16.25f, 16.25f, 0.0f, false, true, -2.6f, -3.49f)
            curveToRelative(-0.43f, -1.55f, -6.73f, -6.72f, -8.0f, -10.21f)
            curveToRelative(-0.32f, -0.64f, -7.11f, -9.0f, -7.75f, -10.41f)
            arcToRelative(17.5f, 17.5f, 0.0f, false, false, -4.78f, -6.0f)
            arcToRelative(17.88f, 17.88f, 0.0f, false, true, -2.6f, -4.52f)
            curveToRelative(-3.61f, -3.29f, -8.8f, -11.55f, -8.8f, -11.55f)
            curveToRelative(-0.09f, -1.0f, -6.73f, -9.17f, -7.7f, -13.54f)
            curveToRelative(-3.41f, -4.28f, -5.0f, -13.77f, -5.0f, -13.77f)
            arcToRelative(38.24f, 38.24f, 0.0f, false, false, -1.31f, -4.27f)
            curveToRelative(-2.42f, -3.67f, 1.0f, -8.0f, 0.16f, -10.52f)
            curveToRelative(-0.11f, -2.7f, 8.21f, -6.64f, 11.86f, -4.25f)
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
            moveTo(175.51f, 177.55f)
            arcToRelative(1.3f, 1.3f, 0.0f, false, false, 0.0f, 0.8f)
            lineToRelative(1.35f, -0.3f)
            curveToRelative(0.09f, 1.2f, 0.86f, 1.07f, 0.86f, 1.07f)
            curveToRelative(1.0f, -0.27f, 0.41f, -2.23f, 0.41f, -2.23f)
            reflectiveCurveToRelative(-0.84f, -0.26f, -2.64f, 0.66f)
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
            moveTo(37.64f, 146.63f)
            reflectiveCurveToRelative(0.0f, 5.75f, -2.93f, 7.0f)
            curveToRelative(0.0f, 0.12f, 1.08f, 4.29f, 2.14f, 5.08f)
            curveToRelative(0.0f, 0.0f, 3.63f, -6.75f, 2.65f, -16.83f)
            horizontalLineToRelative(-0.24f)
            arcToRelative(29.26f, 29.26f, 0.0f, false, false, -1.62f, 4.73f)
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
            moveTo(68.17f, 135.85f)
            curveToRelative(-0.37f, -0.33f, -1.51f, -5.79f, -2.94f, -6.44f)
            arcToRelative(42.68f, 42.68f, 0.0f, false, true, -6.86f, -9.18f)
            curveToRelative(-4.0f, 0.91f, -14.64f, 15.75f, -16.08f, 16.64f)
            curveToRelative(0.0f, 0.14f, 0.72f, 8.61f, 0.9f, 9.0f)
            curveToRelative(2.11f, -1.15f, 7.58f, -7.69f, 9.07f, -12.17f)
            curveToRelative(1.88f, -1.81f, 13.35f, -1.59f, 15.34f, 2.32f)
            curveToRelative(0.0f, 0.0f, 1.68f, 11.46f, 4.73f, 12.79f)
            curveToRelative(2.13f, -0.51f, -4.16f, -12.93f, -4.16f, -12.93f)
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
            moveTo(139.29f, 78.62f)
            curveToRelative(3.84f, 0.58f, -9.12f, -49.17f, -9.12f, -49.17f)
            curveToRelative(8.13f, 44.33f, 4.65f, 48.49f, 9.12f, 49.17f)
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
            moveTo(143.55f, 76.86f)
            arcToRelative(144.0f, 144.0f, 0.0f, false, false, -1.85f, -53.5f)
            curveToRelative(2.34f, 37.94f, -2.27f, 54.35f, 1.85f, 53.5f)
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
            moveTo(147.32f, 75.34f)
            reflectiveCurveToRelative(7.09f, 4.57f, 4.7f, -58.44f)
            curveToRelative(-2.36f, 54.41f, -7.76f, 58.23f, -4.7f, 58.44f)
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
            moveTo(161.52f, 20.21f)
            curveToRelative(-4.11f, 51.21f, -10.85f, 57.73f, -7.37f, 57.27f)
            curveToRelative(8.21f, -1.0f, 7.37f, -57.27f, 7.37f, -57.27f)
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
            moveTo(160.37f, 91.5f)
            reflectiveCurveToRelative(5.36f, -9.4f, 10.0f, -25.25f)
            curveToRelative(0.0f, 0.0f, -7.76f, 19.78f, -10.72f, 21.75f)
            horizontalLineToRelative(-0.12f)
            curveToRelative(-0.38f, -0.87f, -2.62f, -4.14f, -2.81f, -4.44f)
            curveToRelative(2.3f, 4.77f, 2.26f, 15.11f, 3.65f, 17.88f)
            curveToRelative(2.13f, -3.0f, 0.0f, -9.93f, 0.0f, -9.93f)
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
            moveTo(145.21f, 80.16f)
            reflectiveCurveToRelative(0.0f, 0.07f, -0.12f, 0.12f)
            curveToRelative(8.5f, 10.81f, 10.29f, 29.21f, 10.45f, 29.0f)
            curveToRelative(1.2f, 0.43f, 3.9f, -20.36f, -10.33f, -29.16f)
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
            moveTo(151.0f, 107.34f)
            horizontalLineToRelative(0.12f)
            reflectiveCurveTo(150.0f, 91.76f, 139.83f, 85.07f)
            lineToRelative(0.0f, 0.0f)
            lineToRelative(-0.08f, 0.0f)
            curveToRelative(-0.07f, 0.0f, 7.47f, 10.0f, 11.32f, 22.21f)
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
            moveTo(134.27f, 91.0f)
            lineToRelative(0.0f, 0.0f)
            lineToRelative(-0.08f, 0.0f)
            reflectiveCurveToRelative(8.76f, 7.72f, 12.0f, 12.88f)
            curveToRelative(-0.58f, -4.72f, -6.09f, -10.67f, -11.92f, -12.94f)
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
            moveTo(139.49f, 110.91f)
            curveToRelative(-1.52f, -5.32f, -8.64f, -13.65f, -8.64f, -13.65f)
            curveToRelative(-0.42f, -0.51f, -1.58f, -10.54f, -1.57f, -10.73f)
            curveToRelative(0.4f, -0.15f, 5.88f, -0.27f, 5.55f, -1.14f)
            arcToRelative(13.0f, 13.0f, 0.0f, false, false, -1.94f, -0.86f)
            curveToRelative(-0.58f, -2.54f, -11.61f, -43.11f, -13.0f, -46.43f)
            arcToRelative(2.57f, 2.57f, 0.0f, false, false, -0.86f, 0.14f)
            curveToRelative(0.0f, 0.11f, 8.78f, 31.66f, 12.23f, 46.0f)
            curveToRelative(0.0f, 0.0f, -3.62f, -0.54f, -3.62f, -0.54f)
            reflectiveCurveToRelative(-0.57f, 6.35f, -0.63f, 6.36f)
            curveToRelative(-0.25f, -0.41f, -13.36f, -30.4f, -15.58f, -31.1f)
            curveToRelative(0.0f, 0.11f, 13.86f, 31.81f, 13.8f, 32.35f)
            curveToRelative(-0.63f, -0.52f, -6.59f, -4.67f, -6.67f, -4.76f)
            reflectiveCurveToRelative(-0.32f, -0.56f, -0.87f, -1.58f)
            curveToRelative(-3.0f, -5.54f, -9.0f, -13.0f, -11.57f, -15.07f)
            curveToRelative(0.0f, 0.15f, 10.28f, 15.63f, 10.22f, 15.69f)
            curveToRelative(-0.46f, -0.31f, -2.0f, -1.26f, -4.68f, -2.85f)
            curveToRelative(-0.54f, -0.33f, -11.07f, -10.14f, -13.0f, -11.37f)
            curveToRelative(0.0f, 0.0f, 7.38f, 7.35f, 7.09f, 7.68f)
            lineTo(104.0f, 81.42f)
            curveToRelative(-0.13f, -0.07f, -9.6f, -8.0f, -9.64f, -8.0f)
            lineToRelative(-0.17f, 0.08f)
            reflectiveCurveToRelative(7.06f, 7.58f, 7.26f, 7.86f)
            curveToRelative(0.0f, 0.08f, -3.67f, -1.54f, -3.76f, -1.54f)
            curveToRelative(-0.27f, 0.25f, -1.55f, 2.08f, -1.55f, 2.08f)
            lineToRelative(-8.4f, -5.0f)
            quadToRelative(0.85f, 0.6f, 8.0f, 7.0f)
            arcToRelative(31.76f, 31.76f, 0.0f, false, false, -0.64f, 3.31f)
            curveToRelative(-0.66f, -0.26f, -8.9f, -4.66f, -9.32f, -4.71f)
            curveToRelative(0.81f, 0.69f, 8.75f, 6.53f, 8.91f, 6.74f)
            reflectiveCurveToRelative(0.54f, 4.0f, 0.69f, 4.55f)
            curveToRelative(0.0f, 0.0f, 0.14f, -10.35f, 2.66f, -12.27f)
            curveToRelative(0.45f, 0.0f, 5.53f, 2.4f, 5.78f, 2.51f)
            arcToRelative(20.11f, 20.11f, 0.0f, false, true, 1.86f, -3.62f)
            curveToRelative(0.28f, 0.0f, 1.93f, 1.41f, 5.0f, 4.27f)
            curveToRelative(20.63f, 10.0f, 27.0f, 26.31f, 27.24f, 26.67f)
            arcToRelative(1.73f, 1.73f, 0.0f, false, false, 1.66f, -0.56f)
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
            moveTo(106.47f, 128.88f)
            curveToRelative(0.08f, 0.0f, 13.4f, 0.58f, 30.72f, 20.0f)
            curveToRelative(8.91f, -11.0f, 19.72f, 29.37f, 19.95f, 29.82f)
            curveToRelative(-0.4f, -17.86f, -8.21f, -29.24f, -8.25f, -30.0f)
            curveToRelative(0.65f, -5.43f, -1.57f, -12.86f, -1.66f, -12.83f)
            reflectiveCurveToRelative(-0.47f, 9.0f, -0.86f, 9.25f)
            arcToRelative(9.0f, 9.0f, 0.0f, false, false, -3.65f, -3.71f)
            reflectiveCurveTo(131.26f, 108.48f, 108.0f, 88.77f)
            curveToRelative(23.07f, 26.6f, 31.61f, 48.48f, 33.26f, 51.91f)
            curveToRelative(-4.64f, -1.18f, -5.67f, 4.28f, -6.0f, 4.34f)
            arcToRelative(57.82f, 57.82f, 0.0f, false, true, -4.0f, -4.6f)
            curveTo(129.49f, 136.51f, 114.0f, 105.0f, 105.42f, 97.91f)
            curveToRelative(0.09f, 0.1f, 18.94f, 28.0f, 21.0f, 38.45f)
            quadToRelative(-0.5f, -0.5f, -5.59f, -4.29f)
            arcToRelative(14.06f, 14.06f, 0.0f, false, true, -3.27f, -2.88f)
            curveToRelative(-3.0f, -5.58f, -11.94f, -20.26f, -15.44f, -21.88f)
            curveToRelative(0.0f, 0.35f, 10.25f, 14.81f, 10.35f, 19.13f)
            arcToRelative(9.0f, 9.0f, 0.0f, false, false, -4.9f, 1.0f)
            curveToRelative(-2.76f, -3.89f, -11.15f, -14.06f, -11.35f, -14.29f)
            curveToRelative(0.12f, 0.87f, 9.88f, 15.57f, 10.24f, 15.75f)
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
            moveTo(20.45f, 11.49f)
            curveToRelative(0.16f, 3.39f, 12.71f, 13.93f, 12.71f, 13.93f)
            reflectiveCurveToRelative(2.51f, 4.7f, 2.46f, 4.92f)
            curveToRelative(-1.12f, -0.63f, -8.71f, -5.36f, -9.21f, -5.62f)
            curveToRelative(0.0f, 0.23f, 11.75f, 10.5f, 12.88f, 11.48f)
            arcToRelative(16.38f, 16.38f, 0.0f, false, true, 3.23f, 4.92f)
            curveToRelative(-0.37f, 0.0f, -8.94f, -4.57f, -10.44f, -5.25f)
            curveTo(32.53f, 37.25f, 45.8f, 46.14f, 46.43f, 47.0f)
            curveToRelative(0.29f, 0.41f, 3.89f, 6.39f, 4.29f, 7.29f)
            curveToRelative(-0.55f, -0.17f, -11.0f, -5.32f, -11.36f, -5.47f)
            curveToRelative(-0.85f, -0.36f, 14.32f, 9.87f, 14.37f, 9.94f)
            reflectiveCurveToRelative(2.43f, 3.8f, 2.69f, 4.35f)
            curveToRelative(-0.2f, 0.12f, -7.42f, -2.15f, -9.13f, -2.37f)
            quadToRelative(0.09f, 0.09f, 10.22f, 5.0f)
            curveToRelative(1.0f, 0.47f, 3.66f, 4.26f, 4.8f, 6.0f)
            curveToRelative(-0.22f, 0.06f, -11.36f, -3.11f, -11.78f, -3.14f)
            curveToRelative(0.16f, 0.14f, 13.94f, 7.0f, 14.18f, 7.29f)
            reflectiveCurveTo(66.0f, 77.65f, 68.19f, 80.8f)
            curveToRelative(-0.22f, 0.12f, -9.43f, -1.64f, -9.44f, -1.54f)
            curveToRelative(0.29f, 0.11f, 11.59f, 4.44f, 11.85f, 4.63f)
            reflectiveCurveTo(75.0f, 89.43f, 75.0f, 89.6f)
            curveToRelative(-0.46f, -0.1f, -6.74f, -1.11f, -7.09f, -0.91f)
            arcToRelative(80.23f, 80.23f, 0.0f, false, false, 8.46f, 3.18f)
            curveToRelative(0.85f, 0.3f, 5.14f, 5.36f, 5.3f, 5.64f)
            curveToRelative(-0.45f, 0.43f, -2.72f, 0.38f, -6.78f, -0.15f)
            curveToRelative(0.07f, 0.24f, 8.81f, 2.91f, 9.0f, 3.0f)
            arcToRelative(50.63f, 50.63f, 0.0f, false, true, 3.89f, 4.59f)
            reflectiveCurveToRelative(-0.43f, 5.82f, 1.34f, 9.36f)
            curveToRelative(0.12f, 0.0f, -1.0f, -10.0f, 2.12f, -12.52f)
            curveToRelative(0.0f, -0.14f, -19.35f, -20.69f, -19.41f, -21.33f)
            curveToRelative(0.0f, 0.0f, -0.52f, -5.15f, -0.62f, -5.15f)
            reflectiveCurveToRelative(-0.84f, 2.79f, -1.0f, 3.19f)
            arcToRelative(30.76f, 30.76f, 0.0f, false, true, -3.47f, -4.39f)
            reflectiveCurveToRelative(-0.52f, -6.21f, -0.9f, -7.61f)
            curveToRelative(-0.12f, 0.21f, -1.23f, 4.3f, -1.52f, 4.38f)
            arcToRelative(12.27f, 12.27f, 0.0f, false, true, -2.0f, -2.81f)
            curveTo(62.15f, 67.93f, 60.51f, 59.0f, 60.38f, 58.0f)
            curveToRelative(-0.14f, 0.24f, -0.7f, 5.44f, -0.77f, 5.71f)
            curveToRelative(-0.63f, -0.29f, -3.25f, -4.65f, -3.32f, -5.6f)
            curveToRelative(0.0f, 0.0f, -1.51f, -12.18f, -2.32f, -12.69f)
            curveToRelative(0.0f, 0.3f, -0.4f, 8.29f, -0.54f, 8.34f)
            curveToRelative(-3.1f, -4.58f, -4.66f, -7.0f, -4.68f, -7.21f)
            curveToRelative(0.0f, 0.0f, -2.4f, -13.29f, -2.43f, -13.44f)
            reflectiveCurveToRelative(0.23f, 9.9f, 0.15f, 10.27f)
            curveToRelative(-0.11f, 0.0f, -1.62f, -2.61f, -3.67f, -6.0f)
            curveToRelative(-0.41f, -0.66f, -2.5f, -14.7f, -3.19f, -16.75f)
            curveToRelative(-0.09f, 0.09f, -0.2f, 10.78f, -0.31f, 10.76f)
            curveToRelative(-0.88f, -2.0f, -3.46f, -7.0f, -3.78f, -8.48f)
            curveToRelative(-0.07f, -0.31f, -3.23f, -12.28f, -3.81f, -12.75f)
            curveToRelative(-0.42f, 0.8f, 1.06f, 9.56f, 0.94f, 9.6f)
            curveToRelative(-0.17f, -0.24f, -8.36f, -12.3f, -8.59f, -12.46f)
            curveToRelative(-0.19f, 1.41f, 5.46f, 11.5f, 5.5f, 12.24f)
            arcToRelative(78.38f, 78.38f, 0.0f, false, true, -9.11f, -8.0f)
        }
    }
        .build()
}
