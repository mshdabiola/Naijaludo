package com.mshdabiola.ludo.screen.game.component.fish

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

fun Fish.getYellow(iconColor: Long, accentColor: Long): ImageVector {
    return Builder(
        name = "Yellow7",
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
            moveTo(105.0f, 0.15f)
            curveTo(93.45f, 8.0f, 73.79f, 39.55f, 66.27f, 54.0f)
            curveToRelative(-2.76f, -0.37f, -6.12f, 0.0f, -9.07f, -0.37f)
            arcToRelative(14.08f, 14.08f, 0.0f, false, true, -0.69f, 3.0f)
            curveToRelative(-3.18f, 0.79f, -6.49f, 1.21f, -9.77f, 1.86f)
            curveToRelative(0.51f, 1.0f, 1.0f, 2.0f, 1.55f, 3.0f)
            curveToRelative(-2.53f, 1.87f, -5.14f, 3.6f, -7.76f, 5.38f)
            verticalLineToRelative(0.32f)
            arcTo(53.49f, 53.49f, 0.0f, false, true, 47.44f, 70.0f)
            curveToRelative(-2.52f, 1.54f, -5.23f, 3.0f, -7.56f, 4.67f)
            curveToRelative(3.69f, 0.57f, 7.52f, 0.94f, 10.93f, 2.2f)
            curveToRelative(-2.81f, 2.57f, -6.17f, 4.72f, -9.11f, 6.92f)
            curveToRelative(2.24f, 1.17f, 4.95f, 1.59f, 6.91f, 3.0f)
            curveToRelative(-0.84f, 1.35f, -1.68f, 2.8f, -2.52f, 4.2f)
            curveToRelative(1.87f, 0.8f, 4.21f, 0.33f, 6.07f, 1.17f)
            arcTo(28.73f, 28.73f, 0.0f, false, true, 50.0f, 95.86f)
            curveToRelative(-0.88f, 1.59f, 1.83f, 1.5f, 2.86f, 2.0f)
            curveToRelative(3.45f, 0.0f, 1.54f, 3.32f, 1.35f, 5.0f)
            curveToRelative(0.8f, 0.8f, 2.38f, 0.38f, 2.66f, 1.68f)
            curveToRelative(-0.6f, 1.5f, -1.44f, 2.85f, -2.0f, 4.4f)
            arcToRelative(11.47f, 11.47f, 0.0f, false, false, 1.86f, 1.49f)
            curveToRelative(-1.77f, 4.53f, -1.26f, 9.44f, -1.35f, 14.63f)
            curveToRelative(0.19f, 0.42f, 0.19f, 0.89f, 0.65f, 1.21f)
            curveToRelative(0.38f, 5.1f, 5.33f, 8.37f, 7.43f, 12.76f)
            curveToRelative(2.62f, 0.7f, 4.49f, 3.09f, 7.38f, 3.0f)
            curveToRelative(2.76f, 2.25f, 6.26f, 0.0f, 9.44f, 0.65f)
            curveToRelative(2.19f, -1.31f, 4.62f, -2.33f, 6.73f, -4.0f)
            curveToRelative(1.4f, -2.44f, 2.0f, -5.38f, 3.69f, -7.58f)
            curveToRelative(0.51f, 6.55f, 2.75f, 12.81f, 0.0f, 19.0f)
            curveToRelative(-6.59f, 13.13f, -24.07f, 41.92f, -13.78f, 45.09f)
            curveToRelative(7.66f, -0.84f, 14.81f, 0.05f, 21.0f, -4.2f)
            curveToRelative(3.5f, -0.05f, 14.71f, 11.78f, 25.37f, 8.22f)
            curveToRelative(2.47f, -16.45f, -2.67f, -31.87f, -8.55f, -45.94f)
            curveToRelative(-0.75f, -8.08f, -0.28f, -16.91f, 4.85f, -23.22f)
            curveToRelative(1.13f, 3.0f, 1.55f, 6.35f, 2.53f, 9.44f)
            curveToRelative(2.57f, 0.79f, 5.33f, 1.12f, 7.89f, 1.86f)
            curveToRelative(19.06f, 1.84f, 20.28f, -13.78f, 19.53f, -19.2f)
            curveToRelative(0.84f, -1.36f, 1.68f, -2.81f, 2.52f, -4.21f)
            arcToRelative(57.24f, 57.24f, 0.0f, false, false, -5.0f, -8.41f)
            arcToRelative(34.21f, 34.21f, 0.0f, false, false, 5.37f, -1.68f)
            curveToRelative(-1.82f, -3.0f, -4.86f, -5.42f, -7.05f, -8.23f)
            curveToRelative(0.51f, -1.54f, 1.0f, -3.18f, 1.49f, -4.72f)
            curveToRelative(-2.57f, -0.28f, -5.37f, -0.14f, -8.0f, -0.18f)
            curveToRelative(-0.32f, -3.0f, -0.13f, -6.5f, -0.18f, -9.73f)
            curveToRelative(-1.07f, -4.81f, 2.15f, 0.52f, 3.17f, 1.0f)
            curveToRelative(5.47f, 1.4f, 11.68f, 1.49f, 17.34f, 1.86f)
            curveToRelative(0.28f, -0.46f, 0.93f, -0.46f, 1.0f, -1.0f)
            curveToRelative(-3.26f, -6.83f, -8.17f, -12.86f, -9.76f, -20.33f)
            curveToRelative(-0.75f, -5.42f, -6.77f, -6.69f, -10.28f, -9.77f)
            curveToRelative(-1.54f, -15.19f, -6.49f, -29.0f, -16.44f, -40.71f)
            curveToRelative(-1.26f, -3.55f, -1.73f, -7.66f, -5.23f, -9.95f)
            curveToRelative(-3.18f, -1.59f, -4.0f, -5.84f, -7.76f, -6.0f)
            curveTo(109.0f, 2.0f, 107.19f, -0.64f, 105.0f, 0.15f)
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
            moveTo(104.11f, 3.66f)
            curveToRelative(2.0f, -3.59f, 8.22f, 4.3f, 9.91f, 7.76f)
            curveToRelative(-2.35f, 2.2f, -8.32f, -4.91f, -9.91f, -7.76f)
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
            moveTo(101.78f, 12.77f)
            curveToRelative(-0.14f, -1.0f, -0.89f, -1.78f, -0.85f, -2.9f)
            curveToRelative(-1.0f, 0.24f, -3.0f, 2.15f, -3.0f, -0.33f)
            curveToRelative(1.26f, -1.16f, 2.62f, -2.75f, 4.0f, -3.87f)
            curveToRelative(0.93f, 0.0f, 6.25f, 6.55f, 5.56f, 18.51f)
            curveToRelative(0.18f, 2.94f, -3.18f, 4.48f, -2.71f, 7.57f)
            curveToRelative(-1.0f, 0.37f, -1.5f, -1.31f, -2.52f, -1.5f)
            curveToRelative(-11.37f, 0.0f, -11.6f, -14.53f, -2.53f, -13.65f)
            curveToRelative(3.6f, 0.7f, -0.89f, 1.36f, -1.31f, 2.06f)
            arcToRelative(7.69f, 7.69f, 0.0f, false, true, 2.85f, 1.0f)
            curveToRelative(0.8f, 0.42f, -6.64f, 1.0f, -2.71f, 5.89f)
            curveToRelative(-0.46f, 0.84f, -1.54f, 0.28f, -2.19f, 0.7f)
            curveToRelative(0.79f, 1.36f, 2.19f, 1.73f, 3.36f, 2.52f)
            curveToRelative(5.65f, -0.17f, 8.68f, -11.39f, 2.06f, -16.0f)
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
            moveTo(116.54f, 13.75f)
            curveToRelative(1.4f, 4.82f, 5.84f, 9.58f, 2.71f, 15.0f)
            arcTo(21.79f, 21.79f, 0.0f, false, true, 107.0f, 33.0f)
            curveToRelative(-1.5f, -4.86f, 5.47f, -7.66f, 2.0f, -12.48f)
            curveToRelative(0.37f, -1.07f, 2.57f, -1.54f, 1.54f, -3.0f)
            arcTo(14.0f, 14.0f, 0.0f, false, false, 108.0f, 15.62f)
            curveToRelative(1.17f, -3.18f, 4.62f, 1.0f, 8.55f, -1.87f)
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
            moveTo(52.0f, 59.88f)
            arcToRelative(44.75f, 44.75f, 0.0f, false, false, 7.25f, -1.0f)
            arcToRelative(14.8f, 14.8f, 0.0f, false, true, -0.51f, -2.52f)
            arcToRelative(73.41f, 73.41f, 0.0f, false, false, 7.56f, 0.84f)
            curveToRelative(0.7f, 1.12f, 0.14f, 2.9f, -0.19f, 4.2f)
            curveToRelative(-4.48f, -0.51f, -9.71f, -0.23f, -14.11f, -1.49f)
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
            moveTo(46.09f, 65.77f)
            curveToRelative(1.87f, -0.84f, 3.69f, -1.68f, 5.56f, -2.53f)
            curveToRelative(0.47f, -0.51f, -0.14f, -1.0f, -0.19f, -1.54f)
            curveToRelative(4.77f, -0.05f, 9.11f, 1.4f, 13.64f, 1.35f)
            arcToRelative(5.88f, 5.88f, 0.0f, false, false, -0.18f, 2.0f)
            curveToRelative(-6.17f, 0.47f, -12.43f, 1.22f, -18.83f, 0.71f)
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
            moveTo(72.16f, 65.77f)
            arcToRelative(18.0f, 18.0f, 0.0f, false, false, 0.51f, -7.25f)
            curveToRelative(3.26f, -8.92f, 8.08f, -10.79f, 8.23f, -10.93f)
            curveToRelative(0.7f, -5.66f, -0.28f, -13.74f, 6.72f, -15.66f)
            curveToRelative(1.82f, 0.05f, 3.64f, -0.18f, 4.53f, -2.0f)
            curveToRelative(-1.91f, -3.08f, -4.2f, -7.06f, -1.68f, -10.61f)
            curveToRelative(0.61f, -0.37f, 0.61f, -1.0f, 1.22f, -1.35f)
            curveToRelative(-1.45f, 2.8f, -1.78f, 7.06f, 0.32f, 9.58f)
            curveToRelative(0.93f, 0.84f, 1.4f, 2.52f, 2.85f, 2.52f)
            curveToRelative(-2.34f, 1.17f, -5.42f, 2.25f, -6.72f, 5.05f)
            curveToRelative(-1.13f, 1.17f, -2.67f, 1.54f, -4.0f, 2.06f)
            curveTo(82.0f, 42.0f, 85.38f, 48.89f, 79.21f, 51.79f)
            curveToRelative(-0.84f, 4.63f, -4.76f, 8.0f, -4.72f, 12.95f)
            curveToRelative(0.14f, 5.42f, 1.22f, 10.89f, 0.38f, 16.31f)
            curveToRelative(2.52f, 8.13f, -0.24f, 17.81f, 2.33f, 25.94f)
            arcToRelative(21.62f, 21.62f, 0.0f, false, true, -2.71f, -16.0f)
            curveToRelative(-2.0f, -6.17f, -1.87f, -13.13f, -1.3f, -19.72f)
            curveToRelative(-1.22f, -1.68f, 0.37f, -3.88f, -1.0f, -5.51f)
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
            moveTo(90.0f, 57.49f)
            curveToRelative(5.32f, 5.9f, 14.0f, -8.35f, 5.19f, -10.23f)
            curveToRelative(0.0f, -3.32f, 0.23f, -7.48f, 3.22f, -9.77f)
            curveToRelative(1.31f, 3.88f, -0.84f, 8.7f, 2.52f, 11.59f)
            curveToRelative(2.8f, 1.69f, 2.33f, -9.29f, 4.35f, -8.41f)
            curveToRelative(5.22f, -1.11f, -6.46f, 15.48f, 3.0f, 14.81f)
            curveToRelative(-11.68f, 7.34f, -21.87f, 19.0f, -25.75f, 31.64f)
            curveToRelative(3.65f, 1.87f, 8.09f, 1.0f, 12.0f, 2.67f)
            curveToRelative(-5.76f, 3.51f, -4.63f, 7.95f, -3.88f, 9.25f)
            curveToRelative(-2.71f, 2.53f, -3.55f, 6.0f, -4.0f, 9.25f)
            curveToRelative(-2.1f, -0.37f, -4.44f, 5.57f, -5.74f, 1.36f)
            curveTo(77.0f, 100.72f, 79.59f, 89.74f, 76.69f, 80.4f)
            curveTo(77.2f, 70.0f, 75.0f, 56.15f, 87.48f, 46.75f)
            curveToRelative(0.51f, -3.56f, 1.3f, -10.93f, 4.86f, -9.45f)
            curveToRelative(-0.7f, 4.54f, -2.15f, 8.89f, -1.36f, 13.79f)
            curveToRelative(-0.84f, 1.92f, -8.51f, 8.56f, -6.72f, 20.7f)
            arcTo(40.77f, 40.77f, 0.0f, false, true, 90.0f, 57.49f)
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
            moveTo(120.42f, 57.17f)
            curveToRelative(-2.25f, 2.66f, -5.52f, 4.25f, -8.23f, 6.4f)
            arcTo(95.77f, 95.77f, 0.0f, false, false, 91.31f, 85.44f)
            curveToRelative(-1.4f, 1.27f, -2.38f, -0.28f, -4.0f, 0.0f)
            arcTo(149.0f, 149.0f, 0.0f, false, true, 119.06f, 57.0f)
            curveToRelative(0.47f, 0.05f, 1.0f, -0.09f, 1.36f, 0.19f)
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
            moveTo(116.54f, 62.54f)
            curveToRelative(-4.0f, 6.64f, -6.45f, 13.83f, -9.39f, 20.89f)
            curveToRelative(-1.54f, 0.84f, -2.76f, 0.7f, -4.21f, 1.68f)
            arcToRelative(45.34f, 45.34f, 0.0f, false, true, 13.6f, -22.57f)
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
            moveTo(98.88f, 85.25f)
            arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.34f, 1.18f)
            curveToRelative(3.0f, -6.64f, 8.31f, -12.53f, 14.0f, -18.0f)
            curveToRelative(-3.22f, 5.61f, -6.0f, 11.36f, -9.62f, 16.82f)
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
            moveTo(120.42f, 60.35f)
            curveToRelative(-1.83f, 6.4f, -5.14f, 12.19f, -6.22f, 18.88f)
            curveToRelative(-1.44f, 1.0f, -2.61f, 2.61f, -4.0f, 3.69f)
            arcToRelative(56.21f, 56.21f, 0.0f, false, true, 10.24f, -22.57f)
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
            moveTo(122.94f, 60.2f)
            curveToRelative(0.7f, -0.23f, 1.12f, 0.57f, 1.35f, 1.0f)
            curveToRelative(0.1f, 2.62f, -0.84f, 5.0f, -0.51f, 7.57f)
            curveToRelative(-2.76f, 3.13f, -3.83f, 6.92f, -7.24f, 9.77f)
            arcToRelative(65.57f, 65.57f, 0.0f, false, true, 6.4f, -18.33f)
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
            moveTo(85.42f, 84.42f)
            curveTo(91.26f, 71.7f, 103.74f, 58.34f, 117.57f, 55.0f)
            curveToRelative(-10.84f, 9.49f, -22.94f, 17.86f, -32.15f, 29.45f)
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
            moveTo(51.79f, 70.3f)
            arcToRelative(15.9f, 15.9f, 0.0f, false, false, -1.17f, -2.38f)
            curveToRelative(4.06f, -1.17f, 9.3f, -0.56f, 13.78f, -0.47f)
            arcToRelative(5.42f, 5.42f, 0.0f, false, true, 0.0f, 3.0f)
            curveTo(58.1f, 71.75f, 51.0f, 72.59f, 44.6f, 73.67f)
            curveToRelative(2.28f, -1.0f, 4.85f, -2.06f, 7.19f, -3.37f)
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
            moveTo(54.31f, 77.17f)
            curveTo(53.52f, 76.0f, 52.54f, 75.3f, 52.0f, 74.51f)
            curveToRelative(4.26f, -0.84f, 8.46f, -1.83f, 12.81f, -2.39f)
            curveToRelative(-0.15f, 1.27f, 0.32f, 2.29f, 0.14f, 3.56f)
            curveToRelative(-5.28f, 1.21f, -10.05f, 3.73f, -15.28f, 5.37f)
            curveToRelative(1.0f, -1.31f, 3.27f, -2.2f, 4.67f, -3.88f)
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
            moveTo(52.63f, 84.93f)
            arcToRelative(32.0f, 32.0f, 0.0f, false, false, -4.2f, -1.36f)
            curveTo(53.28f, 81.42f, 59.0f, 79.0f, 64.78f, 77.87f)
            curveToRelative(0.37f, 1.17f, 0.56f, 2.43f, 0.84f, 3.69f)
            arcToRelative(139.19f, 139.19f, 0.0f, false, true, -14.49f, 5.71f)
            curveToRelative(0.52f, -0.8f, 1.36f, -1.41f, 1.5f, -2.34f)
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
            moveTo(55.84f, 90.0f)
            curveToRelative(-0.32f, -0.19f, -2.0f, -1.22f, -2.37f, -1.41f)
            curveTo(57.2f, 87.4f, 61.46f, 85.0f, 66.0f, 84.27f)
            curveToRelative(-0.15f, 1.64f, 0.93f, 2.81f, 1.0f, 4.35f)
            curveToRelative(-4.49f, 2.2f, -9.3f, 3.69f, -13.6f, 6.22f)
            curveToRelative(0.51f, -1.83f, 0.41f, -1.31f, 2.51f, -4.81f)
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
            moveTo(58.05f, 96.7f)
            curveToRelative(-0.85f, -0.69f, -1.92f, -0.6f, -2.71f, -1.35f)
            arcToRelative(71.0f, 71.0f, 0.0f, false, true, 11.45f, -4.53f)
            arcToRelative(7.9f, 7.9f, 0.0f, false, true, 0.32f, 2.33f)
            curveTo(64.4f, 96.24f, 61.0f, 98.0f, 57.68f, 100.07f)
            curveToRelative(-0.61f, -1.08f, 0.46f, -2.15f, 0.37f, -3.37f)
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
            moveTo(60.06f, 103.43f)
            arcToRelative(5.06f, 5.06f, 0.0f, false, false, -2.2f, -1.16f)
            curveToRelative(3.55f, -2.81f, 7.1f, -5.33f, 10.75f, -7.76f)
            arcToRelative(8.61f, 8.61f, 0.0f, false, true, 1.54f, 3.36f)
            arcToRelative(68.0f, 68.0f, 0.0f, false, true, -10.42f, 11.64f)
            curveToRelative(-5.14f, -0.42f, 0.38f, -4.0f, 0.33f, -6.08f)
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
            moveTo(70.8f, 101.75f)
            arcTo(15.64f, 15.64f, 0.0f, false, true, 72.0f, 104.28f)
            curveToRelative(-4.58f, 5.09f, -8.64f, 10.42f, -13.78f, 15.32f)
            curveToRelative(-3.75f, -6.43f, 7.7f, -12.0f, 12.61f, -17.85f)
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
            moveTo(57.2f, 124.14f)
            curveToRelative(5.24f, -6.12f, 10.0f, -12.48f, 15.8f, -18.37f)
            curveToRelative(0.84f, 0.94f, 1.68f, 2.15f, 2.52f, 3.23f)
            curveToRelative(-5.18f, 7.24f, -10.0f, 14.62f, -15.46f, 21.68f)
            curveToRelative(-3.51f, -1.12f, 1.35f, -5.75f, -2.86f, -6.54f)
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
            moveTo(63.23f, 135.08f)
            curveToRelative(-0.28f, -1.13f, 0.05f, -2.53f, -1.0f, -3.37f)
            arcToRelative(190.05f, 190.05f, 0.0f, false, true, 14.63f, -20.05f)
            arcToRelative(8.72f, 8.72f, 0.0f, false, true, 2.0f, 2.0f)
            curveToRelative(-5.19f, 7.44f, -8.79f, 15.47f, -12.43f, 23.56f)
            curveToRelative(-1.12f, 0.75f, -2.57f, -1.17f, -3.23f, -2.19f)
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
            moveTo(68.28f, 139.0f)
            curveToRelative(1.54f, -5.84f, 10.51f, -21.68f, 12.29f, -24.07f)
            arcToRelative(23.25f, 23.25f, 0.0f, false, true, 2.52f, 2.86f)
            curveToRelative(-4.0f, 7.61f, -7.9f, 15.37f, -11.26f, 23.0f)
            curveToRelative(-1.08f, -0.94f, -2.38f, -2.06f, -3.55f, -1.83f)
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
            moveTo(74.49f, 139.93f)
            curveToRelative(2.62f, -7.05f, 6.31f, -13.69f, 9.63f, -20.51f)
            curveToRelative(0.88f, 0.09f, 1.44f, 1.07f, 2.14f, 1.68f)
            curveToRelative(-1.3f, 6.45f, -3.92f, 12.38f, -5.51f, 18.69f)
            curveToRelative(-1.26f, 0.7f, -5.88f, 0.47f, -6.26f, 0.14f)
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
            moveTo(84.44f, 138.25f)
            curveToRelative(-0.32f, 0.38f, -0.37f, 0.84f, -0.83f, 1.17f)
            arcTo(86.89f, 86.89f, 0.0f, false, true, 87.48f, 124.0f)
            curveToRelative(0.84f, 2.0f, -0.37f, 12.57f, -3.0f, 14.3f)
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
            moveTo(76.18f, 192.09f)
            curveToRelative(0.22f, -9.53f, 10.6f, -28.41f, 14.15f, -35.47f)
            curveToRelative(0.61f, 1.82f, 1.73f, 3.69f, 0.33f, 5.51f)
            curveTo(85.19f, 172.0f, 83.0f, 183.25f, 79.21f, 193.77f)
            curveToRelative(-1.4f, 1.0f, -2.1f, -0.89f, -3.0f, -1.68f)
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
            moveTo(81.6f, 192.79f)
            arcToRelative(135.56f, 135.56f, 0.0f, false, true, 11.25f, -31.0f)
            curveToRelative(0.85f, 1.59f, 2.0f, 3.51f, 0.65f, 5.24f)
            arcToRelative(248.87f, 248.87f, 0.0f, false, false, -7.89f, 25.38f)
            curveToRelative(-1.26f, 0.42f, -2.75f, 0.0f, -4.0f, 0.37f)
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
            moveTo(94.86f, 189.05f)
            curveToRelative(1.36f, -7.71f, 2.71f, -15.47f, 4.0f, -23.18f)
            arcToRelative(3.37f, 3.37f, 0.0f, false, true, 2.71f, -1.35f)
            curveToRelative(0.7f, 8.18f, -0.51f, 16.0f, -1.5f, 23.69f)
            curveToRelative(-1.77f, -1.26f, -3.69f, 0.14f, -5.23f, 0.84f)
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
            moveTo(88.14f, 191.43f)
            curveToRelative(1.35f, -8.87f, 4.67f, -17.61f, 7.89f, -26.07f)
            arcToRelative(1.15f, 1.15f, 0.0f, false, true, 1.17f, 0.51f)
            arcTo(196.66f, 196.66f, 0.0f, false, false, 93.0f, 189.75f)
            curveToRelative(-0.94f, 2.63f, -4.0f, 1.64f, -4.85f, 1.68f)
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
            moveTo(102.62f, 189.75f)
            curveToRelative(0.42f, -8.13f, -0.19f, -17.05f, 0.47f, -25.23f)
            curveToRelative(1.16f, 1.16f, 4.2f, 0.56f, 3.73f, 2.85f)
            curveToRelative(0.42f, 7.94f, 1.68f, 26.45f, 1.82f, 27.76f)
            curveToRelative(-2.57f, -0.33f, -4.53f, -3.09f, -6.0f, -5.38f)
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
            moveTo(110.33f, 194.61f)
            curveToRelative(-0.61f, -9.16f, -1.45f, -18.6f, -1.83f, -28.08f)
            curveToRelative(1.36f, -3.65f, 1.45f, 1.59f, 1.83f, 2.52f)
            curveToRelative(2.33f, 8.69f, 2.89f, 18.18f, 4.71f, 27.11f)
            curveToRelative(-1.82f, 1.0f, -3.22f, -1.13f, -4.71f, -1.55f)
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
            moveTo(116.73f, 195.78f)
            curveToRelative(-2.25f, -10.14f, -3.37f, -21.0f, -5.24f, -31.12f)
            curveToRelative(0.47f, -0.24f, 0.38f, -0.75f, 0.84f, -1.0f)
            curveToRelative(3.56f, 10.32f, 5.89f, 21.45f, 7.76f, 32.61f)
            curveToRelative(-1.0f, 0.61f, -2.38f, -0.32f, -3.36f, -0.51f)
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
            moveTo(115.89f, 160.64f)
            curveToRelative(3.45f, 10.79f, 7.14f, 21.49f, 6.54f, 34.0f)
            curveToRelative(-3.65f, -10.65f, -4.22f, -21.86f, -8.74f, -32.94f)
            curveToRelative(0.56f, -0.43f, 1.21f, -1.73f, 2.2f, -1.0f)
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
            moveTo(122.43f, 125.49f)
            curveToRelative(0.74f, -0.51f, 2.0f, -4.0f, 2.19f, -1.54f)
            curveToRelative(0.89f, 4.39f, 2.34f, 8.55f, 2.71f, 13.13f)
            arcToRelative(23.33f, 23.33f, 0.0f, false, true, -2.71f, 1.0f)
            arcToRelative(70.26f, 70.26f, 0.0f, false, true, -2.19f, -12.62f)
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
            moveTo(130.18f, 139.28f)
            curveToRelative(-0.79f, -5.8f, -3.09f, -11.0f, -3.88f, -16.82f)
            arcToRelative(9.6f, 9.6f, 0.0f, false, true, 1.87f, -3.7f)
            curveToRelative(1.36f, 6.87f, 3.92f, 13.23f, 5.56f, 20.0f)
            curveToRelative(-1.0f, 0.65f, -2.48f, 0.09f, -3.55f, 0.51f)
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
            moveTo(136.06f, 138.77f)
            curveToRelative(-2.89f, -6.78f, -4.81f, -14.31f, -6.53f, -21.22f)
            curveToRelative(0.32f, -0.8f, 0.65f, -1.54f, 1.0f, -2.34f)
            curveToRelative(4.2f, 7.11f, 6.49f, 15.0f, 8.92f, 22.9f)
            curveToRelative(-0.94f, 0.7f, -2.43f, -0.05f, -3.37f, 0.66f)
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
            moveTo(141.44f, 137.41f)
            curveToRelative(-2.39f, -5.79f, -4.0f, -11.87f, -6.4f, -17.66f)
            curveToRelative(-0.52f, -3.0f, -4.07f, -6.22f, -1.68f, -9.07f)
            curveToRelative(4.11f, 8.36f, 8.22f, 16.73f, 10.79f, 25.75f)
            curveToRelative(-1.08f, 0.0f, -1.59f, 1.73f, -2.71f, 1.0f)
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
            moveTo(146.0f, 132.88f)
            arcToRelative(8.52f, 8.52f, 0.0f, false, true, -1.68f, -2.34f)
            curveToRelative(-2.71f, -7.0f, -6.36f, -13.51f, -9.25f, -20.37f)
            curveToRelative(0.0f, -0.85f, 0.84f, -1.27f, 1.0f, -2.0f)
            curveToRelative(4.26f, 6.86f, 8.65f, 13.69f, 11.13f, 21.35f)
            arcToRelative(7.0f, 7.0f, 0.0f, false, true, -1.22f, 3.37f)
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
            moveTo(150.17f, 117.92f)
            curveToRelative(-0.74f, 1.08f, -1.82f, 1.54f, -2.52f, 2.67f)
            curveToRelative(0.0f, 1.77f, 0.75f, 3.27f, 0.7f, 5.0f)
            curveToRelative(-2.89f, -6.77f, -7.47f, -12.85f, -11.44f, -19.16f)
            curveToRelative(-0.28f, -1.26f, 0.47f, -2.15f, 0.65f, -3.22f)
            curveToRelative(3.88f, 5.32f, 9.72f, 8.83f, 12.61f, 14.67f)
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
            moveTo(142.47f, 100.58f)
            curveToRelative(2.19f, 2.15f, 4.72f, 3.42f, 6.72f, 5.89f)
            curveToRelative(-0.09f, 0.24f, -0.6f, 0.28f, -0.84f, 0.52f)
            curveToRelative(-4.76f, 0.88f, -11.22f, -5.74f, -10.79f, -8.93f)
            arcToRelative(16.15f, 16.15f, 0.0f, false, true, 6.26f, -1.17f)
            curveToRelative(-0.42f, 1.26f, -0.46f, 2.62f, -1.35f, 3.69f)
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
            moveTo(138.77f, 74.18f)
            curveToRelative(1.36f, 3.22f, 3.37f, 6.22f, 4.0f, 9.72f)
            curveToRelative(-5.42f, -3.68f, -4.3f, -9.63f, -4.0f, -9.72f)
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
            moveTo(140.08f, 70.81f)
            horizontalLineToRelative(0.38f)
            curveToRelative(2.52f, 4.26f, 4.39f, 8.84f, 6.87f, 13.09f)
            curveToRelative(-0.57f, 0.33f, -1.26f, 0.14f, -1.83f, 0.37f)
            curveToRelative(-2.85f, -4.11f, -4.11f, -9.0f, -5.42f, -13.46f)
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
            moveTo(139.11f, 63.71f)
            arcToRelative(0.26f, 0.26f, 0.0f, false, false, 0.13f, -0.33f)
            curveToRelative(5.42f, 7.0f, 10.33f, 14.26f, 13.83f, 22.06f)
            curveToRelative(-5.43f, 1.32f, -9.16f, -14.8f, -14.0f, -21.73f)
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
            moveTo(157.74f, 85.44f)
            curveToRelative(-0.6f, -0.14f, -1.54f, 0.28f, -2.33f, -0.33f)
            curveToRelative(-3.74f, -4.15f, -15.0f, -25.0f, -14.81f, -25.09f)
            curveToRelative(7.56f, 1.5f, 9.61f, 16.46f, 17.14f, 25.42f)
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
            moveTo(136.25f, 66.09f)
            curveToRelative(-3.27f, 12.0f, 3.0f, 25.29f, -2.19f, 36.69f)
            curveToRelative(-0.66f, 6.41f, -24.0f, 26.0f, -22.57f, 54.0f)
            curveToRelative(-1.0f, 4.07f, -7.61f, 4.53f, -9.39f, 3.36f)
            curveToRelative(-0.74f, -0.23f, -1.58f, -0.14f, -2.19f, -0.65f)
            curveToRelative(1.59f, -4.86f, 9.58f, -7.48f, 8.41f, -13.65f)
            curveToRelative(2.61f, -3.22f, 2.57f, -8.13f, 2.71f, -11.78f)
            curveToRelative(1.68f, -1.49f, 0.79f, -4.11f, 1.49f, -6.0f)
            curveToRelative(4.06f, -4.54f, 0.28f, -11.64f, 3.88f, -16.36f)
            curveToRelative(1.12f, -1.49f, 2.71f, -3.0f, 1.82f, -5.19f)
            curveToRelative(-1.82f, 1.92f, -3.88f, 4.16f, -6.73f, 4.21f)
            curveToRelative(-1.77f, 7.0f, 0.28f, 16.12f, -7.19f, 20.19f)
            curveToRelative(-3.65f, 4.06f, 0.84f, 13.27f, -7.1f, 13.79f)
            curveToRelative(1.16f, 7.06f, 5.23f, 3.0f, 5.56f, 2.7f)
            curveToRelative(-0.66f, 3.89f, -5.1f, 15.11f, -8.92f, 6.22f)
            arcToRelative(5.68f, 5.68f, 0.0f, false, true, 0.37f, -2.71f)
            curveToRelative(0.18f, 1.63f, 3.21f, 8.09f, 6.0f, -0.33f)
            curveToRelative(-2.24f, 0.0f, -3.08f, -2.19f, -3.69f, -3.88f)
            curveToRelative(0.28f, -2.61f, -1.91f, -4.16f, -1.35f, -6.87f)
            curveToRelative(3.87f, 6.55f, 6.44f, -0.22f, 5.56f, -2.52f)
            curveToRelative(-6.13f, 0.66f, -7.3f, -3.31f, -6.73f, -5.89f)
            curveToRelative(4.1f, 8.66f, 8.54f, 3.05f, 8.74f, -0.7f)
            arcToRelative(5.55f, 5.55f, 0.0f, false, true, -3.37f, -3.0f)
            curveToRelative(-0.56f, -2.47f, 5.0f, 4.68f, 7.9f, -3.0f)
            arcToRelative(33.06f, 33.06f, 0.0f, false, false, 1.87f, -8.41f)
            curveToRelative(-1.08f, 1.92f, -3.6f, 1.78f, -5.56f, 1.5f)
            curveTo(94.39f, 127.89f, 92.66f, 117.0f, 92.0f, 116.57f)
            curveToRelative(-0.93f, 1.21f, -3.93f, 3.6f, -5.88f, -0.7f)
            curveToRelative(4.05f, 2.0f, 6.44f, -1.92f, 6.72f, -3.37f)
            curveToRelative(0.83f, 10.25f, 6.68f, 7.44f, 9.25f, 3.74f)
            curveToRelative(-0.93f, -1.73f, -2.0f, -3.55f, -1.35f, -5.75f)
            curveToRelative(3.91f, 9.45f, 9.52f, 3.14f, 9.76f, -0.51f)
            arcToRelative(8.28f, 8.28f, 0.0f, false, true, -1.35f, -4.67f)
            curveToRelative(0.7f, 0.93f, 3.91f, 7.86f, 9.06f, -4.4f)
            curveToRelative(-1.31f, -2.0f, -2.8f, -4.53f, -5.51f, -4.72f)
            curveToRelative(-2.6f, 4.72f, -8.5f, 5.35f, -8.86f, 4.16f)
            curveToRelative(-0.92f, 3.0f, -5.86f, 7.16f, -8.15f, 2.24f)
            curveToRelative(1.49f, 0.52f, 6.63f, 2.4f, 7.76f, -6.21f)
            curveToRelative(0.88f, 1.26f, 3.77f, 5.57f, 8.22f, -1.36f)
            curveToRelative(-0.24f, -3.82f, -5.19f, -5.23f, -6.73f, -4.86f)
            curveToRelative(0.65f, 4.08f, -7.29f, 9.45f, -7.89f, 2.66f)
            curveToRelative(2.23f, 2.82f, 9.0f, -0.22f, 4.86f, -5.7f)
            curveToRelative(5.46f, 0.24f, 18.86f, -4.8f, 23.87f, -18.0f)
            curveToRelative(0.51f, -2.8f, 0.14f, -6.21f, 0.0f, -8.93f)
            curveToRelative(-2.15f, -2.0f, -2.0f, -6.0f, -5.51f, -6.58f)
            curveToRelative(-1.87f, 0.0f, -5.0f, -3.0f, -4.58f, -3.51f)
            curveToRelative(6.4f, -7.0f, 11.3f, -14.53f, 13.0f, -23.41f)
            curveToRelative(6.78f, 11.35f, 9.3f, 24.91f, 7.57f, 39.39f)
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
            moveTo(121.26f, 16.6f)
            curveToRelative(2.0f, 3.6f, 4.34f, 7.0f, 4.9f, 11.12f)
            curveToRelative(-1.72f, 4.4f, -2.57f, 9.07f, -6.26f, 12.62f)
            curveToRelative(-2.38f, 0.7f, -2.29f, -2.66f, -4.2f, -3.17f)
            curveToRelative(-0.33f, 1.4f, -0.66f, 3.0f, -0.85f, 4.34f)
            curveToRelative(-3.87f, 2.24f, -4.1f, 6.31f, -6.72f, 9.26f)
            curveToRelative(1.82f, -4.77f, 4.35f, -10.15f, 2.38f, -15.66f)
            curveToRelative(4.86f, -1.68f, 11.73f, -2.71f, 12.43f, -9.07f)
            arcToRelative(50.55f, 50.55f, 0.0f, false, false, -6.4f, -16.0f)
            curveToRelative(0.28f, -1.54f, -0.47f, -2.29f, 0.0f, -3.69f)
            curveToRelative(3.59f, 2.43f, 3.41f, 6.73f, 4.72f, 10.23f)
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
            moveTo(114.53f, 9.22f)
            curveToRelative(-0.89f, -1.5f, -3.13f, -3.88f, -4.2f, -6.08f)
            curveToRelative(-0.33f, -2.0f, 3.91f, -1.2f, 4.2f, 6.08f)
        }
    }
        .build()
}
