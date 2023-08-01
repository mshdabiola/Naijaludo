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

fun Fish.getGreen(iconColor:Long, accentColor:Long): ImageVector
{
    return Builder(name = "Green7", defaultWidth = 200.0.dp, defaultHeight = 200.0.dp,
                viewportWidth = 200.0f, viewportHeight = 200.0f).apply {
            path(fill = SolidColor(Color(iconColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.11f, 96.71f)
                curveToRelative(7.59f, -7.0f, 15.53f, -13.44f, 23.15f, -20.0f)
                curveToRelative(8.57f, -7.46f, 18.47f, -11.39f, 28.87f, -14.06f)
                curveToRelative(2.0f, 0.06f, 2.79f, -1.93f, 3.87f, -3.18f)
                curveToRelative(1.0f, 0.35f, 2.2f, 0.0f, 3.16f, 0.37f)
                curveToRelative(1.35f, -0.92f, 1.45f, -3.13f, 3.26f, -3.07f)
                curveToRelative(1.0f, -1.54f, 2.0f, -3.0f, 3.0f, -4.57f)
                arcToRelative(3.17f, 3.17f, 0.0f, false, true, 1.71f, 0.77f)
                curveToRelative(1.49f, -1.68f, 3.0f, -3.37f, 4.48f, -5.0f)
                curveToRelative(0.71f, 0.38f, 1.17f, 1.24f, 1.84f, 1.62f)
                curveToRelative(2.25f, -1.62f, 3.84f, -3.94f, 6.1f, -5.6f)
                curveToRelative(0.47f, 0.69f, 0.8f, 1.62f, 1.22f, 2.2f)
                curveToRelative(1.0f, -0.53f, 1.87f, -2.12f, 3.0f, -2.09f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 1.5f, 3.54f)
                curveToRelative(1.11f, 0.59f, 2.0f, 1.62f, 3.4f, 1.66f)
                curveToRelative(1.49f, 1.45f, 4.12f, 0.72f, 5.14f, 2.92f)
                curveToRelative(2.48f, 0.47f, 4.39f, 2.25f, 7.17f, 2.09f)
                curveToRelative(1.25f, 1.0f, 2.6f, 1.89f, 4.41f, 1.58f)
                curveToRelative(1.08f, 1.43f, 3.39f, 0.78f, 4.42f, 2.57f)
                curveToRelative(1.16f, 0.28f, 2.22f, -0.49f, 3.17f, 0.21f)
                curveToRelative(1.66f, 2.3f, 4.38f, 2.82f, 6.84f, 3.53f)
                curveToRelative(2.1f, 2.67f, 5.65f, 2.0f, 7.52f, 5.16f)
                curveToRelative(1.47f, 0.56f, 3.36f, 0.57f, 4.28f, 2.13f)
                curveToRelative(3.27f, -0.55f, 3.0f, 3.41f, 5.79f, 3.78f)
                curveToRelative(2.0f, 2.46f, 5.35f, 2.56f, 7.09f, 5.0f)
                curveToRelative(-0.84f, 1.14f, -2.0f, 2.31f, -2.28f, 3.55f)
                arcTo(28.3f, 28.3f, 0.0f, false, false, 160.93f, 84.0f)
                curveToRelative(13.27f, -4.92f, 25.16f, -13.6f, 39.07f, -16.77f)
                curveToRelative(-0.55f, 2.35f, -0.53f, 5.72f, -3.38f, 7.25f)
                curveToRelative(-0.53f, 2.79f, -4.89f, 4.0f, -4.39f, 7.26f)
                curveToRelative(-0.87f, 1.0f, -2.18f, 1.9f, -2.14f, 3.38f)
                curveToRelative(-0.39f, 0.75f, -1.57f, 1.2f, -1.19f, 2.3f)
                curveToRelative(-1.0f, 1.62f, -2.0f, 3.27f, -2.92f, 5.0f)
                curveToRelative(-0.17f, 3.2f, 2.49f, 5.69f, 4.26f, 8.35f)
                curveToRelative(0.0f, 2.33f, 2.7f, 3.69f, 2.83f, 6.0f)
                arcToRelative(11.88f, 11.88f, 0.0f, false, true, 5.52f, 9.39f)
                curveToRelative(-20.85f, -1.74f, -36.0f, -12.79f, -39.0f, -13.68f)
                curveToRelative(-4.0f, -1.89f, -7.07f, 1.4f, -10.1f, 3.44f)
                curveToRelative(-1.17f, 0.45f, -2.61f, 0.2f, -3.75f, 0.61f)
                curveToRelative(-1.41f, 3.17f, -4.7f, 1.55f, -5.92f, 4.77f)
                arcToRelative(9.77f, 9.77f, 0.0f, false, false, -2.49f, 0.0f)
                curveToRelative(-1.25f, 1.73f, -3.14f, 1.87f, -4.81f, 2.47f)
                curveToRelative(-1.11f, 1.0f, -1.3f, 3.25f, -3.3f, 2.95f)
                curveToRelative(-0.52f, 2.76f, -4.0f, 0.85f, -4.84f, 3.6f)
                curveToRelative(-2.81f, 0.08f, -2.18f, 3.5f, -4.76f, 3.79f)
                curveToRelative(0.23f, 3.18f, -3.89f, 1.25f, -4.0f, 4.22f)
                curveToRelative(-3.0f, -0.37f, -2.62f, 3.14f, -5.43f, 3.13f)
                curveToRelative(0.13f, 1.0f, 0.22f, 1.94f, 0.35f, 2.9f)
                curveToRelative(-7.7f, -0.14f, -15.0f, -2.0f, -22.18f, -3.64f)
                curveToRelative(-5.48f, 2.51f, -14.59f, 3.55f, -14.84f, 3.74f)
                curveToRelative(-1.51f, 2.21f, 0.31f, 4.79f, -1.0f, 6.92f)
                curveToRelative(0.1f, 0.72f, 0.84f, 1.38f, 0.66f, 2.0f)
                curveToRelative(0.66f, 2.43f, -2.1f, 3.51f, -1.0f, 5.91f)
                curveToRelative(-1.81f, 1.71f, -0.9f, 4.75f, -1.8f, 6.73f)
                curveToRelative(-3.17f, -2.82f, -6.79f, -5.25f, -9.55f, -8.5f)
                arcToRelative(3.59f, 3.59f, 0.0f, false, true, -1.62f, 0.23f)
                curveToRelative(-3.15f, -4.9f, -6.58f, -9.66f, -9.0f, -14.83f)
                curveToRelative(-7.52f, -2.5f, -15.08f, -5.0f, -22.0f, -8.74f)
                curveTo(18.76f, 117.0f, 7.48f, 112.59f, 0.24f, 102.0f)
                curveToRelative(-1.0f, -2.0f, 1.46f, -3.16f, 0.87f, -5.31f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.67f, 72.83f)
                curveToRelative(-0.43f, -0.58f, -1.3f, -1.08f, -1.28f, -1.64f)
                curveToRelative(-3.34f, 0.22f, -4.52f, -3.54f, -8.0f, -3.12f)
                curveToRelative(-2.36f, -3.21f, -6.92f, -2.13f, -9.23f, -5.77f)
                curveToRelative(-1.63f, -0.53f, -3.43f, -0.66f, -4.55f, -2.3f)
                curveToRelative(-2.19f, -0.66f, -4.8f, -0.49f, -6.44f, -2.35f)
                curveToRelative(-3.68f, 0.93f, -4.77f, -3.07f, -8.32f, -2.41f)
                arcToRelative(8.54f, 8.54f, 0.0f, false, true, -2.28f, -1.51f)
                curveToRelative(-3.37f, 1.19f, -4.41f, -3.06f, -7.45f, -2.38f)
                curveToRelative(-1.23f, -0.2f, -2.09f, -1.31f, -3.11f, -1.94f)
                curveToRelative(-0.92f, 0.0f, -1.92f, 1.23f, -3.09f, 1.36f)
                curveToRelative(-0.75f, -0.63f, -1.49f, -1.21f, -2.24f, -1.83f)
                curveToRelative(-1.88f, 1.35f, -3.14f, 3.16f, -4.79f, 4.52f)
                arcTo(11.27f, 11.27f, 0.0f, false, false, 72.0f, 52.0f)
                curveToRelative(-2.0f, 1.17f, -3.0f, 5.56f, -5.61f, 3.73f)
                arcTo(47.68f, 47.68f, 0.0f, false, false, 63.74f, 61.0f)
                curveToRelative(24.7f, -5.33f, 63.2f, 14.0f, 75.19f, 18.79f)
                curveToRelative(1.2f, 0.0f, 2.21f, -1.51f, 3.38f, -1.91f)
                curveToRelative(-3.19f, -0.54f, -4.53f, -4.31f, -7.64f, -5.0f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(191.5f, 76.47f)
                arcTo(46.56f, 46.56f, 0.0f, false, false, 171.74f, 81.0f)
                curveToRelative(6.92f, -0.53f, 13.0f, -3.37f, 19.76f, -4.5f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(187.28f, 82.13f)
                arcToRelative(50.25f, 50.25f, 0.0f, false, false, -18.47f, 4.09f)
                arcToRelative(182.53f, 182.53f, 0.0f, false, false, 18.47f, -4.09f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(183.48f, 88.81f)
                arcToRelative(56.67f, 56.67f, 0.0f, false, false, -13.59f, 0.33f)
                curveToRelative(-0.79f, 1.1f, -2.16f, 1.3f, -3.22f, 2.0f)
                curveToRelative(5.52f, -1.0f, 11.0f, -2.17f, 16.81f, -2.28f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.86f, 94.27f)
                curveToRelative(4.82f, -0.15f, 9.64f, -0.29f, 14.46f, -0.47f)
                arcToRelative(32.87f, 32.87f, 0.0f, false, false, -14.46f, 0.47f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(194.09f, 112.0f)
                arcToRelative(110.79f, 110.79f, 0.0f, false, false, -19.63f, -5.62f)
                arcTo(55.24f, 55.24f, 0.0f, false, false, 194.09f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(189.48f, 106.0f)
                curveToRelative(-6.37f, -1.75f, -12.9f, -3.58f, -19.51f, -4.3f)
                curveToRelative(2.06f, 1.0f, 15.0f, 3.65f, 19.51f, 4.3f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(185.46f, 100.87f)
                curveToRelative(-5.59f, -1.29f, -11.13f, -2.81f, -17.1f, -3.23f)
                curveToRelative(5.08f, 2.12f, 11.26f, 2.41f, 17.1f, 3.23f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(107.07f, 131.84f)
                curveToRelative(0.82f, -0.74f, 1.0f, -2.1f, 1.85f, -2.84f)
                curveToRelative(2.94f, 0.93f, 2.64f, -2.69f, 5.26f, -2.74f)
                curveToRelative(-0.21f, -2.85f, 3.59f, -2.14f, 3.9f, -4.66f)
                curveToRelative(4.61f, -2.44f, 8.0f, -6.11f, 12.54f, -8.71f)
                curveToRelative(2.06f, -3.0f, 5.61f, -2.33f, 7.82f, -5.0f)
                curveToRelative(3.38f, -0.47f, 5.65f, -3.89f, 8.92f, -4.64f)
                curveToRelative(-5.74f, -2.31f, -42.71f, 20.6f, -57.11f, 25.64f)
                curveToRelative(2.44f, 1.68f, 12.0f, 4.15f, 16.82f, 2.94f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(59.31f, 144.79f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.79f, -2.15f)
                arcToRelative(97.34f, 97.34f, 0.0f, false, false, 8.79f, 9.93f)
                curveToRelative(0.39f, -1.27f, -0.59f, -3.18f, 0.44f, -4.48f)
                curveToRelative(-0.75f, -1.63f, 1.89f, -2.68f, 0.41f, -4.32f)
                curveToRelative(0.5f, -0.55f, 0.28f, -1.44f, 0.78f, -2.0f)
                arcToRelative(19.36f, 19.36f, 0.0f, false, false, -0.82f, -2.07f)
                curveToRelative(2.34f, -1.82f, -1.0f, -4.0f, 1.0f, -6.0f)
                curveToRelative(-5.3f, 0.0f, -11.15f, -0.12f, -16.34f, 0.13f)
                curveToRelative(0.77f, 4.0f, 2.71f, 7.51f, 4.9f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(42.69f, 108.17f)
                curveToRelative(10.77f, -7.47f, 20.29f, -9.83f, 33.05f, -12.0f)
                curveToRelative(0.12f, 2.54f, -3.62f, 2.83f, -3.93f, 5.35f)
                curveToRelative(-2.51f, 0.49f, -2.23f, 3.35f, -4.31f, 4.37f)
                arcToRelative(8.74f, 8.74f, 0.0f, false, false, -1.53f, 3.0f)
                arcToRelative(12.39f, 12.39f, 0.0f, false, false, -3.9f, 4.34f)
                curveToRelative(-3.34f, 1.79f, -5.84f, 5.0f, -9.41f, 6.23f)
                curveToRelative(-3.12f, 0.84f, 0.86f, -9.05f, -6.25f, -9.13f)
                curveToRelative(5.3f, 3.29f, 2.81f, 9.91f, 2.74f, 10.92f)
                curveToRelative(22.43f, 8.22f, 45.11f, -0.71f, 48.15f, -1.5f)
                curveTo(84.0f, 121.94f, 67.37f, 125.0f, 54.06f, 121.08f)
                curveToRelative(3.11f, -3.72f, 8.0f, -4.3f, 10.21f, -8.82f)
                curveTo(122.0f, 114.8f, 131.32f, 99.91f, 131.0f, 100.0f)
                curveTo(109.11f, 85.71f, 60.74f, 83.7f, 59.41f, 85.83f)
                curveToRelative(24.58f, 1.0f, 49.3f, 4.29f, 68.51f, 14.82f)
                curveToRelative(-18.54f, 8.0f, -39.53f, 10.54f, -61.41f, 8.95f)
                arcToRelative(11.08f, 11.08f, 0.0f, false, true, 4.68f, -6.25f)
                curveTo(72.0f, 101.0f, 74.94f, 100.0f, 76.12f, 97.87f)
                curveToRelative(1.2f, -1.09f, 2.47f, -1.85f, 3.7f, -2.78f)
                curveToRelative(-12.85f, -1.56f, -32.93f, 8.56f, -33.0f, 8.56f)
                curveToRelative(-9.3f, -7.71f, -2.08f, -14.53f, -8.62f, -17.15f)
                curveTo(71.26f, 60.22f, 121.38f, 95.77f, 156.0f, 93.23f)
                arcToRelative(150.3f, 150.3f, 0.0f, false, false, 11.28f, 10.16f)
                curveToRelative(-1.91f, -3.58f, -5.19f, -6.81f, -7.67f, -10.0f)
                curveToRelative(2.62f, -2.9f, 4.91f, -5.92f, 7.33f, -8.9f)
                curveToRelative(-2.12f, 1.1f, -3.66f, 2.9f, -5.59f, 4.45f)
                curveTo(127.31f, 90.72f, 92.79f, 50.06f, 42.9f, 72.07f)
                curveToRelative(51.0f, -16.39f, 81.73f, 14.37f, 109.87f, 19.18f)
                curveTo(126.0f, 95.0f, 68.71f, 55.41f, 35.69f, 86.87f)
                curveToRelative(-2.11f, -0.7f, -4.84f, -5.17f, -8.31f, 1.21f)
                curveToRelative(1.47f, -0.64f, 5.07f, -4.18f, 7.09f, 0.64f)
                curveToRelative(1.56f, 0.21f, 3.79f, -0.45f, 4.42f, 1.29f)
                curveToRelative(2.25f, 4.0f, -0.1f, 10.36f, 5.29f, 12.72f)
                curveToRelative(-5.19f, 6.15f, -14.34f, 22.1f, -20.59f, 16.59f)
                curveTo(28.23f, 128.0f, 39.0f, 112.0f, 42.69f, 108.17f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.0f, 116.43f)
                curveToRelative(2.49f, -1.29f, 5.33f, -2.17f, 6.54f, -5.0f)
                curveToRelative(2.84f, -1.2f, 3.14f, -4.8f, 6.22f, -5.76f)
                curveToRelative(1.27f, -2.09f, 2.18f, -4.31f, 4.23f, -6.06f)
                curveToRelative(-7.75f, 1.43f, -14.71f, 4.88f, -21.79f, 8.0f)
                curveToRelative(2.57f, 2.68f, 5.24f, 4.92f, 4.8f, 8.8f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(30.39f, 109.12f)
                curveToRelative(0.08f, 1.32f, 4.87f, 5.94f, -6.21f, 5.0f)
                curveToRelative(-5.78f, 1.17f, 17.23f, -25.85f, -3.05f, -23.94f)
                curveToRelative(13.59f, 2.91f, 3.16f, 17.35f, -0.66f, 23.0f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, -4.25f, 1.32f)
                curveToRelative(9.14f, 5.39f, 22.25f, -0.76f, 14.17f, -5.37f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.62f, 100.64f)
                curveTo(23.0f, 99.55f, 21.08f, 88.85f, 14.26f, 92.0f)
                curveToRelative(-4.15f, 1.62f, -3.08f, 10.45f, 3.36f, 8.6f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 110.16f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, false, 2.21f, -1.26f)
                curveToRelative(3.32f, -6.14f, -11.66f, -7.75f, -3.93f, -14.12f)
                curveToRelative(-1.48f, 0.0f, -2.58f, -0.91f, -3.63f, 0.62f)
                curveTo(2.35f, 102.22f, 16.0f, 105.17f, 11.0f, 110.16f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.56f, 102.56f)
                arcTo(22.37f, 22.37f, 0.0f, false, false, 8.0f, 106.14f)
                curveToRelative(-0.82f, -2.35f, -5.07f, -9.27f, -4.39f, -3.58f)
            }
        }
        .build()
    }

