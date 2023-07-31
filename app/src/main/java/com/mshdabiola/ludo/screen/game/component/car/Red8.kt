package com.mshdabiola.ludo.screen.game.component.car

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

fun Car.getRed(iconColor:Long, accentColor:Long): ImageVector
{
    return Builder(name = "Red8", defaultWidth = 200.0.dp, defaultHeight = 200.0.dp,
                viewportWidth = 200.0f, viewportHeight = 200.0f).apply {
            path(fill = SolidColor(Color(iconColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(114.07f, 5.68f)
                curveToRelative(-0.63f, -0.88f, 0.8f, -1.35f, 0.32f, -2.15f)
                curveTo(105.85f, 6.24f, 96.0f, 10.85f, 91.61f, 19.71f)
                curveToRelative(-0.39f, -3.69f, 3.46f, -6.44f, 6.0f, -8.59f)
                curveToRelative(0.51f, -1.39f, -1.44f, -0.83f, -2.0f, -1.58f)
                curveToRelative(-1.3f, -0.4f, -2.85f, 0.11f, -4.0f, 0.15f)
                lineTo(93.2f, 8.54f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 94.36f, 5.0f)
                curveTo(92.73f, 2.86f, 90.42f, 3.14f, 88.0f, 2.53f)
                curveToRelative(-0.44f, 0.21f, -0.28f, 0.68f, -0.44f, 1.0f)
                curveToRelative(-1.19f, 4.41f, -5.41f, 0.92f, -7.71f, 3.58f)
                curveTo(79.13f, 8.26f, 80.52f, 9.0f, 81.0f, 9.81f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, 0.12f, 0.44f)
                curveToRelative(0.08f, 0.24f, -0.16f, 0.28f, -0.28f, 0.44f)
                curveToRelative(-0.36f, -0.36f, -1.15f, 0.16f, -1.27f, -0.44f)
                curveToRelative(-4.29f, 0.0f, -7.79f, 1.87f, -10.73f, 5.0f)
                curveToRelative(-1.91f, 1.39f, -4.7f, -0.92f, -6.32f, 1.15f)
                arcToRelative(5.72f, 5.72f, 0.0f, false, false, -0.4f, 2.87f)
                curveToRelative(1.19f, -0.32f, 1.59f, -1.71f, 3.0f, -1.59f)
                curveToRelative(1.71f, 3.93f, 2.9f, 8.1f, 4.57f, 12.0f)
                curveToRelative(3.58f, 6.4f, 5.73f, 13.52f, 11.17f, 19.05f)
                arcToRelative(8.92f, 8.92f, 0.0f, false, true, -1.55f, 0.83f)
                curveTo(73.0f, 41.86f, 69.91f, 32.79f, 65.42f, 24.29f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -1.71f, -2.0f)
                curveToRelative(-0.68f, 0.0f, -0.48f, 0.84f, -0.72f, 1.28f)
                curveToRelative(0.48f, 17.9f, 8.52f, 37.42f, 9.07f, 37.15f)
                curveToRelative(0.0f, 0.16f, 1.67f, -0.88f, 1.59f, -0.8f)
                curveToRelative(-1.39f, -4.21f, -3.46f, -8.16f, -4.65f, -12.46f)
                curveToRelative(-0.92f, -4.88f, -2.27f, -10.0f, -2.0f, -15.0f)
                curveToRelative(3.73f, 7.15f, 6.8f, 14.71f, 12.6f, 20.91f)
                lineToRelative(1.15f, -2.15f)
                curveToRelative(1.19f, -1.31f, 2.94f, -0.32f, 4.14f, -1.43f)
                curveToRelative(-8.0f, -9.1f, -13.0f, -19.44f, -16.3f, -30.49f)
                arcToRelative(2.32f, 2.32f, 0.0f, false, false, 0.55f, -1.44f)
                curveToRelative(2.39f, -4.49f, 7.64f, -5.17f, 12.45f, -5.29f)
                curveToRelative(3.37f, 3.86f, 5.6f, -3.18f, 9.18f, -2.3f)
                curveToRelative(-2.71f, 1.59f, -6.12f, 3.86f, -7.16f, 7.0f)
                curveToRelative(0.2f, 0.23f, 0.56f, 0.08f, 0.84f, 0.12f)
                curveToRelative(2.38f, -3.0f, 5.84f, -5.21f, 9.58f, -5.13f)
                arcToRelative(17.53f, 17.53f, 0.0f, false, false, -4.0f, 6.0f)
                arcTo(5.74f, 5.74f, 0.0f, false, false, 91.77f, 24.0f)
                curveToRelative(6.68f, 5.48f, 16.9f, 2.54f, 24.61f, 5.56f)
                curveToRelative(2.94f, 1.71f, 5.72f, 4.62f, 6.44f, 8.0f)
                curveToRelative(-0.2f, 1.12f, -1.2f, 1.87f, -2.0f, 2.71f)
                curveToRelative(-10.06f, -10.0f, -28.7f, -1.0f, -37.64f, -13.6f)
                curveToRelative(-1.0f, -1.95f, -0.64f, -4.45f, -0.28f, -6.44f)
                curveToRelative(-1.94f, -0.74f, -2.27f, 3.4f, -2.27f, 5.3f)
                curveToRelative(2.07f, 8.0f, 11.17f, 12.23f, 18.72f, 13.0f)
                curveToRelative(7.0f, 0.0f, 15.3f, -2.31f, 20.59f, 2.58f)
                curveToRelative(-0.75f, 1.08f, -1.82f, 2.27f, -2.0f, 3.3f)
                lineToRelative(-2.47f, -0.71f)
                curveToRelative(-7.63f, -0.12f, -13.91f, 3.18f, -20.59f, 5.4f)
                curveToRelative(-4.85f, 2.83f, -10.57f, 3.42f, -14.59f, 8.0f)
                curveToRelative(-0.75f, 1.0f, -0.63f, 3.58f, -2.74f, 2.59f)
                curveToRelative(-6.48f, 2.43f, -12.4f, 7.08f, -17.17f, 12.72f)
                curveToRelative(-1.35f, -0.11f, -2.35f, 0.68f, -3.42f, 1.31f)
                curveToRelative(-2.66f, 4.18f, -3.14f, 9.27f, -3.42f, 14.44f)
                curveToRelative(-0.47f, 17.93f, 3.82f, 33.91f, 9.58f, 49.26f)
                curveToRelative(1.0f, 1.67f, 1.79f, 3.89f, 3.7f, 4.85f)
                curveToRelative(3.54f, 4.45f, 5.92f, 11.0f, 11.88f, 12.72f)
                curveToRelative(0.6f, -2.11f, -1.0f, -4.45f, -0.83f, -6.72f)
                curveToRelative(2.74f, 1.91f, 5.29f, 4.33f, 8.27f, 5.61f)
                arcToRelative(24.18f, 24.18f, 0.0f, false, false, 1.0f, 6.44f)
                curveToRelative(0.4f, 2.23f, 4.0f, 2.58f, 3.0f, 5.29f)
                curveToRelative(3.66f, 8.0f, 6.52f, 18.84f, 16.46f, 21.75f)
                curveToRelative(5.6f, 1.94f, 7.11f, 8.15f, 11.89f, 11.17f)
                curveToRelative(2.26f, 1.59f, 5.0f, 0.67f, 7.31f, -0.28f)
                lineToRelative(2.14f, 1.27f)
                curveToRelative(4.42f, 1.43f, 8.23f, -1.43f, 11.13f, -4.73f)
                curveToRelative(1.19f, -1.51f, 1.12f, -3.62f, 2.31f, -5.13f)
                curveToRelative(1.07f, -3.3f, 2.9f, -7.16f, 1.15f, -10.73f)
                curveToRelative(3.3f, -11.13f, 3.34f, -24.0f, 2.15f, -36.11f)
                arcToRelative(7.86f, 7.86f, 0.0f, false, false, 1.54f, -3.41f)
                curveToRelative(0.64f, -2.79f, -0.43f, -5.89f, -0.71f, -7.88f)
                lineToRelative(-0.12f, 0.16f)
                curveToRelative(-1.71f, -2.42f, -0.71f, -5.68f, -0.59f, -8.58f)
                curveToRelative(0.31f, -6.76f, -1.59f, -12.73f, -3.14f, -18.49f)
                horizontalLineToRelative(0.59f)
                arcToRelative(4.77f, 4.77f, 0.0f, false, false, 1.83f, -3.58f)
                curveToRelative(0.44f, -8.47f, 1.31f, -16.54f, -1.27f, -24.33f)
                curveToRelative(-1.35f, -2.91f, -2.15f, -6.88f, -5.72f, -8.0f)
                curveToRelative(-3.82f, -7.27f, -7.48f, -14.63f, -9.58f, -22.62f)
                arcToRelative(7.69f, 7.69f, 0.0f, false, false, 3.69f, -3.73f)
                curveToRelative(2.94f, -8.91f, 4.18f, -20.12f, 1.75f, -29.63f)
                curveTo(130.84f, 8.38f, 130.73f, 2.42f, 125.4f, 0.11f)
                arcToRelative(11.55f, 11.55f, 0.0f, false, false, -11.33f, 5.57f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(83.31f, 11.24f)
                curveToRelative(-1.0f, -0.79f, -0.76f, -2.14f, -1.44f, -3.14f)
                curveToRelative(2.19f, 0.0f, 4.45f, 0.76f, 6.0f, -1.15f)
                curveToRelative(0.8f, -1.15f, 2.31f, -2.62f, 3.7f, -1.43f)
                lineToRelative(0.28f, 0.32f)
                curveTo(91.06f, 8.14f, 88.0f, 7.07f, 86.6f, 9.0f)
                curveToRelative(-1.23f, 0.71f, -1.39f, 3.26f, -3.29f, 2.26f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.47f, 151.51f)
                curveToRelative(1.87f, 0.72f, 2.59f, 2.87f, 3.42f, 4.46f)
                arcToRelative(3.34f, 3.34f, 0.0f, false, false, -3.58f, 1.59f)
                curveToRelative(-0.15f, -1.95f, -1.0f, -4.26f, 0.16f, -6.05f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(89.75f, 161.13f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 0.71f, -1.43f)
                curveToRelative(1.0f, -0.15f, 1.31f, 1.0f, 1.75f, 1.55f)
                curveToRelative(0.0f, 0.76f, -0.88f, 0.68f, -1.31f, 1.0f)
                curveToRelative(-0.72f, 0.12f, -0.92f, -0.68f, -1.15f, -1.12f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(138.27f, 185.31f)
                curveToRelative(0.65f, 0.31f, 1.36f, 1.11f, 2.27f, 1.0f)
                curveToRelative(-0.43f, 1.0f, -1.47f, 0.44f, -2.0f, 1.31f)
                arcToRelative(1.85f, 1.85f, 0.0f, false, false, 1.59f, 1.0f)
                curveToRelative(0.0f, 0.68f, -0.71f, 1.23f, -1.31f, 1.43f)
                curveToRelative(-2.82f, 0.6f, -6.2f, 2.54f, -9.0f, 0.55f)
                curveToRelative(-0.75f, -1.58f, -1.59f, -3.41f, -0.4f, -5.12f)
                lineToRelative(0.72f, -1.0f)
                arcToRelative(3.56f, 3.56f, 0.0f, false, false, 2.15f, 1.87f)
                arcToRelative(8.39f, 8.39f, 0.0f, false, false, 6.0f, -1.0f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(115.22f, 179.86f)
                curveToRelative(-5.76f, -14.07f, -8.34f, -30.61f, -8.0f, -46.64f)
                curveToRelative(1.19f, 2.67f, 4.0f, 5.73f, 7.0f, 6.29f)
                arcToRelative(10.82f, 10.82f, 0.0f, false, false, 9.74f, -3.86f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, 2.15f, -9.46f)
                curveToRelative(-0.09f, -2.75f, -5.57f, -6.13f, -0.72f, -8.0f)
                curveToRelative(1.35f, 2.87f, 1.43f, 6.49f, 2.15f, 9.71f)
                lineToRelative(0.55f, 7.47f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.58f, 1.71f)
                curveToRelative(-0.16f, 3.9f, -0.8f, 9.18f, 3.29f, 11.17f)
                curveToRelative(1.68f, 10.78f, 0.92f, 22.82f, 0.6f, 33.76f)
                curveToRelative(-0.75f, -3.0f, -4.0f, -4.32f, -6.79f, -4.64f)
                arcToRelative(15.67f, 15.67f, 0.0f, false, false, -7.4f, 2.49f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(113.0f, 128.06f)
                arcToRelative(5.72f, 5.72f, 0.0f, false, false, 3.57f, 2.7f)
                curveToRelative(2.39f, 0.67f, 4.66f, -1.0f, 6.29f, -1.43f)
                arcToRelative(9.44f, 9.44f, 0.0f, false, true, -5.45f, 3.89f)
                curveToRelative(-1.11f, -0.08f, -1.91f, 0.0f, -2.86f, 0.0f)
                arcToRelative(5.08f, 5.08f, 0.0f, false, false, 5.72f, 1.71f)
                curveToRelative(0.84f, -0.47f, 1.43f, -0.2f, 2.15f, -0.87f)
                arcToRelative(7.53f, 7.53f, 0.0f, false, true, -8.31f, 2.74f)
                curveToRelative(-2.23f, -1.0f, -4.93f, -3.38f, -5.13f, -6.0f)
                curveToRelative(-0.71f, -5.0f, 5.09f, -5.85f, 8.0f, -7.87f)
                curveToRelative(1.47f, -0.24f, 3.7f, -1.48f, 4.45f, 0.59f)
                curveToRelative(0.72f, 1.39f, -0.95f, 2.19f, -1.43f, 3.3f)
                arcToRelative(1.18f, 1.18f, 0.0f, false, false, -0.87f, 0.72f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 0.4f)
                lineToRelative(-0.12f, 0.16f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(126.24f, 181.73f)
                curveToRelative(0.07f, 1.07f, -1.12f, 1.43f, -1.84f, 1.87f)
                curveToRelative(-1.23f, 0.52f, -2.66f, 0.55f, -3.89f, 1.15f)
                curveToRelative(-0.28f, -0.32f, 0.0f, 1.0f, 0.0f, 1.0f)
                curveToRelative(0.95f, 0.92f, 3.61f, 0.56f, 5.45f, 0.84f)
                arcToRelative(11.54f, 11.54f, 0.0f, false, true, -6.17f, 1.43f)
                curveToRelative(-0.63f, 0.36f, -0.31f, 0.77f, 0.16f, 1.16f)
                curveToRelative(1.59f, 1.07f, 4.26f, 1.0f, 6.17f, 0.27f)
                curveToRelative(-1.68f, 1.43f, -3.58f, 2.7f, -5.89f, 2.15f)
                arcToRelative(7.05f, 7.05f, 0.0f, false, true, -4.13f, -5.29f)
                curveToRelative(-0.09f, -2.23f, 1.51f, -4.21f, 3.42f, -5.29f)
                curveToRelative(2.0f, -0.91f, 5.24f, -1.51f, 6.72f, 0.72f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(139.0f, 182.44f)
                curveToRelative(-1.91f, 1.2f, -4.25f, 2.59f, -6.59f, 1.43f)
                lineToRelative(-1.28f, -1.0f)
                arcToRelative(225.0f, 225.0f, 0.0f, false, false, -0.44f, -34.07f)
                curveToRelative(3.7f, -0.32f, 7.87f, -0.24f, 11.0f, -2.31f)
                curveToRelative(0.19f, 12.09f, 0.11f, 24.77f, -2.71f, 35.94f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(141.86f, 139.07f)
                curveToRelative(-0.44f, 0.91f, 1.43f, 2.42f, 1.43f, 2.42f)
                curveToRelative(-0.28f, 1.0f, -1.71f, 1.75f, -2.59f, 2.59f)
                curveToRelative(-3.57f, 1.95f, -8.0f, 3.0f, -12.0f, 1.31f)
                curveToRelative(-2.19f, -1.39f, -1.79f, -4.13f, -2.0f, -6.44f)
                curveToRelative(3.18f, 3.73f, 8.83f, 1.47f, 12.44f, 0.28f)
                curveToRelative(0.88f, -0.48f, 3.14f, -2.39f, 2.75f, -0.16f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(138.4f, 104.28f)
                curveToRelative(3.61f, 5.92f, 3.14f, 13.52f, 3.73f, 20.63f)
                curveToRelative(-0.24f, 3.58f, 0.16f, 7.8f, -2.0f, 10.74f)
                curveToRelative(-3.0f, 1.55f, -6.19f, 3.18f, -9.89f, 2.7f)
                arcToRelative(60.92f, 60.92f, 0.0f, false, false, -1.0f, -15.14f)
                curveToRelative(-1.66f, -5.25f, -2.89f, -10.7f, -4.57f, -15.91f)
                curveToRelative(-0.07f, -1.11f, -0.59f, -2.86f, 0.44f, -3.58f)
                curveToRelative(3.78f, 1.47f, 7.51f, -1.39f, 11.57f, -1.43f)
                lineToRelative(1.71f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(117.25f, 93.86f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -3.18f, -1.31f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, -2.43f)
                arcToRelative(6.05f, 6.05f, 0.0f, false, true, 2.74f, -2.42f)
                curveToRelative(-0.91f, 0.75f, -1.07f, 1.79f, -1.59f, 2.7f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.75f, 2.0f)
                arcToRelative(8.58f, 8.58f, 0.0f, false, false, 6.12f, -1.59f)
                curveToRelative(-0.24f, -0.32f, -0.32f, -0.72f, -0.72f, -1.0f)
                curveToRelative(-0.79f, 0.2f, -1.39f, 1.55f, -2.42f, 0.83f)
                reflectiveCurveToRelative(0.28f, -1.31f, -0.12f, -2.0f)
                curveToRelative(1.23f, -1.87f, 3.57f, -3.49f, 6.0f, -3.0f)
                curveToRelative(-0.47f, 1.87f, -2.82f, 1.59f, -3.58f, 3.0f)
                curveToRelative(1.0f, 0.76f, 1.87f, -0.16f, 2.87f, -0.27f)
                lineToRelative(1.15f, -0.72f)
                curveToRelative(0.0f, 0.67f, -1.43f, 1.19f, -0.6f, 1.87f)
                curveToRelative(2.0f, 0.0f, 3.66f, -2.63f, 4.57f, -4.3f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, false, -1.11f, -2.74f)
                arcToRelative(14.93f, 14.93f, 0.0f, false, true, -1.43f, -0.44f)
                curveToRelative(1.59f, 0.0f, 3.3f, -1.15f, 4.85f, -0.12f)
                curveToRelative(1.55f, 2.07f, -0.32f, 4.14f, -1.27f, 5.85f)
                curveToRelative(-3.86f, 4.85f, -9.58f, 5.17f, -15.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(106.08f, 89.69f)
                curveToRelative(-1.11f, -4.16f, 7.8f, -12.75f, 16.54f, -14.34f)
                curveToRelative(-6.0f, 3.42f, -12.88f, 8.0f, -16.54f, 14.34f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(138.52f, 83.14f)
                lineToRelative(-1.39f, 1.0f)
                curveToRelative(0.19f, -1.0f, 0.87f, -2.7f, 0.0f, -4.0f)
                lineTo(134.7f, 77.4f)
                arcToRelative(14.29f, 14.29f, 0.0f, false, false, -6.0f, -1.75f)
                curveToRelative(1.23f, -0.87f, 2.94f, 0.0f, 4.41f, -0.71f)
                curveToRelative(0.08f, -0.4f, -0.4f, -0.6f, -0.44f, -1.0f)
                lineToRelative(0.92f, -0.5f)
                curveToRelative(0.24f, 3.74f, 6.24f, 5.73f, 4.93f, 9.7f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(125.0f, 46.47f)
                curveToRelative(2.94f, 7.51f, 5.41f, 15.23f, 9.0f, 22.46f)
                curveToRelative(-1.0f, 0.8f, -2.62f, 1.75f, -3.14f, 3.15f)
                lineToRelative(-2.58f, 0.43f)
                curveToRelative(0.76f, -0.08f, 1.31f, -0.83f, 1.87f, -1.15f)
                curveToRelative(0.0f, -1.08f, -1.83f, -2.0f, -2.3f, -3.14f)
                curveToRelative(-2.23f, -7.0f, -4.0f, -14.2f, -7.32f, -20.76f)
                curveToRelative(-0.24f, 0.0f, -0.4f, 0.28f, -0.56f, 0.44f)
                curveToRelative(1.67f, 6.4f, 3.54f, 12.73f, 5.0f, 19.17f)
                arcToRelative(7.29f, 7.29f, 0.0f, false, false, 1.87f, 4.0f)
                curveToRelative(-9.22f, 1.71f, -19.2f, 6.84f, -23.61f, 15.91f)
                curveToRelative(-1.55f, 2.62f, -0.32f, 5.84f, 1.15f, 8.15f)
                curveToRelative(5.09f, 5.36f, 12.36f, 6.23f, 19.72f, 6.43f)
                arcToRelative(45.09f, 45.09f, 0.0f, false, false, 9.66f, -0.77f)
                curveToRelative(2.39f, 1.43f, -6.2f, 1.86f, -9.38f, 1.75f)
                curveToRelative(-0.91f, 0.39f, -1.75f, 0.3f, -2.0f, 1.33f)
                curveToRelative(-0.72f, 4.0f, 3.37f, 7.56f, 0.16f, 11.0f)
                curveToRelative(-5.29f, 6.72f, -16.69f, 7.48f, -17.33f, 17.46f)
                curveToRelative(-0.12f, 20.0f, 4.37f, 38.37f, 9.73f, 56.26f)
                arcToRelative(8.48f, 8.48f, 0.0f, false, false, 6.0f, 6.28f)
                curveToRelative(2.82f, 0.52f, 5.29f, -1.0f, 7.15f, -3.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.16f, -0.88f)
                arcToRelative(4.47f, 4.47f, 0.0f, false, false, 4.14f, 2.59f)
                curveToRelative(0.19f, 0.87f, -1.0f, 1.59f, -0.12f, 2.42f)
                curveToRelative(1.07f, -0.32f, 1.19f, -1.95f, 2.54f, -2.15f)
                curveToRelative(0.88f, -0.87f, 2.1f, -1.82f, 3.45f, -1.42f)
                curveToRelative(-1.74f, 2.58f, -4.09f, 5.28f, -7.31f, 5.56f)
                arcToRelative(4.15f, 4.15f, 0.0f, false, true, -2.86f, -1.0f)
                arcToRelative(2.31f, 2.31f, 0.0f, false, false, 0.71f, -2.59f)
                curveToRelative(-0.11f, -0.08f, -0.19f, -0.36f, -0.43f, -0.28f)
                curveToRelative(-0.48f, 1.52f, -2.26f, 1.71f, -3.42f, 2.59f)
                arcToRelative(7.12f, 7.12f, 0.0f, false, true, -5.56f, -0.28f)
                curveToRelative(-4.37f, -3.34f, -7.0f, -8.11f, -9.9f, -12.44f)
                curveToRelative(-1.59f, -2.79f, -1.0f, -5.79f, -1.51f, -9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.91f, 0.94f)
                curveToRelative(-0.16f, 2.95f, 0.72f, 5.49f, 1.15f, 8.15f)
                curveToRelative(-8.22f, -2.26f, -12.8f, -11.37f, -15.74f, -18.44f)
                curveToRelative(-1.74f, -2.59f, 2.47f, -1.4f, 2.43f, -3.74f)
                curveToRelative(1.7f, -5.17f, -2.19f, -8.91f, -4.73f, -12.6f)
                curveToRelative(-3.9f, -14.24f, -8.71f, -32.68f, -1.43f, -46.92f)
                arcToRelative(10.57f, 10.57f, 0.0f, false, false, 1.43f, -3.74f)
                curveToRelative(-1.59f, -1.43f, -4.0f, -1.35f, -6.16f, -1.71f)
                curveToRelative(-5.0f, -0.2f, -9.58f, 1.0f, -13.0f, 4.3f)
                curveToRelative(-1.43f, -3.5f, 3.3f, -3.14f, 5.0f, -4.73f)
                curveToRelative(4.13f, -1.28f, 8.11f, -3.86f, 12.44f, -3.86f)
                curveToRelative(0.91f, 0.52f, 1.67f, 1.91f, 2.58f, 2.43f)
                curveToRelative(0.72f, -0.25f, 0.36f, -1.16f, 0.28f, -1.6f)
                curveTo(89.0f, 90.0f, 86.72f, 86.71f, 85.61f, 83.25f)
                lineToRelative(-0.16f, -0.12f)
                curveToRelative(-2.18f, -4.26f, -3.1f, -9.63f, -4.29f, -14.63f)
                curveToRelative(-0.6f, -1.0f, -1.87f, -0.4f, -2.71f, -0.28f)
                arcTo(38.25f, 38.25f, 0.0f, false, false, 62.71f, 79.39f)
                curveTo(59.38f, 84.6f, 61.0f, 92.15f, 63.0f, 97.12f)
                curveToRelative(-1.91f, 0.68f, -2.38f, 2.67f, -2.42f, 4.45f)
                curveToRelative(0.0f, 0.32f, -0.08f, 0.68f, 0.28f, 0.88f)
                curveToRelative(0.91f, -0.88f, 1.39f, -2.15f, 2.74f, -2.58f)
                lineToRelative(3.42f, 0.27f)
                lineToRelative(0.16f, 7.6f)
                lineToRelative(3.26f, 23.18f)
                curveToRelative(0.63f, 3.1f, 2.3f, 9.14f, 2.3f, 9.14f)
                curveToRelative(0.76f, 2.78f, 1.91f, 6.48f, 2.87f, 9.47f)
                arcToRelative(107.52f, 107.52f, 0.0f, false, true, -10.74f, -12.61f)
                curveToRelative(-5.08f, -9.0f, -5.88f, -20.59f, -8.15f, -31.21f)
                curveToRelative(-0.91f, -9.9f, -1.34f, -19.0f, 0.72f, -28.46f)
                arcToRelative(4.43f, 4.43f, 0.0f, false, true, 2.15f, -2.71f)
                curveToRelative(1.11f, -0.12f, 2.5f, 1.0f, 2.58f, -0.88f)
                curveToRelative(5.41f, -4.37f, 10.45f, -9.66f, 17.0f, -11.28f)
                arcToRelative(1.17f, 1.17f, 0.0f, false, false, 0.88f, 1.54f)
                curveToRelative(0.87f, -1.51f, -0.12f, -4.41f, 1.43f, -6.0f)
                curveToRelative(4.65f, -3.85f, 10.25f, -5.56f, 15.74f, -7.59f)
                curveToRelative(5.68f, -1.4f, 11.0f, -3.62f, 17.0f, -4.14f)
                arcTo(9.1f, 9.1f, 0.0f, false, true, 119.0f, 47.46f)
                curveToRelative(1.87f, -0.43f, 0.36f, -3.34f, 2.58f, -3.41f)
                arcTo(3.42f, 3.42f, 0.0f, false, true, 125.0f, 46.47f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.73f, 107.3f)
                curveToRelative(-0.79f, -0.16f, -0.87f, 0.76f, -1.27f, 1.15f)
                arcToRelative(11.21f, 11.21f, 0.0f, false, true, 0.12f, -4.73f)
                curveToRelative(0.91f, -1.19f, 2.62f, -1.47f, 3.3f, -2.86f)
                curveToRelative(-0.16f, 1.27f, 7.07f, 3.9f, 7.87f, 4.0f)
                curveToRelative(0.24f, 0.11f, 0.4f, -0.16f, 0.56f, -0.28f)
                curveToRelative(-1.83f, 2.54f, -2.31f, 5.8f, -2.86f, 9.0f)
                horizontalLineToRelative(-0.13f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.87f, -3.58f)
                curveToRelative(-0.84f, 0.72f, -6.0f, -1.66f, -6.72f, -2.7f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(65.58f, 92.27f)
                curveToRelative(-0.52f, -3.7f, -1.67f, -8.0f, 0.44f, -11.29f)
                arcToRelative(28.3f, 28.3f, 0.0f, false, true, 11.56f, -6.76f)
                lineToRelative(0.72f, 1.15f)
                lineToRelative(0.15f, 4.74f)
                curveToRelative(-1.5f, 0.0f, -10.65f, 4.41f, -11.6f, 5.44f)
                curveToRelative(0.92f, 2.43f, -0.52f, 4.62f, -1.27f, 6.72f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(111.37f, 6.67f)
                lineToRelative(-0.28f, 2.0f)
                arcToRelative(29.63f, 29.63f, 0.0f, false, false, -8.31f, 3.42f)
                curveToRelative(1.83f, -2.51f, 5.53f, -4.1f, 8.59f, -5.45f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.6f, 12.05f)
                lineToRelative(1.28f, -1.11f)
                curveToRelative(0.59f, 0.52f, 1.22f, 0.94f, 1.06f, 1.61f)
                curveToRelative(-0.55f, 0.52f, -1.82f, 0.0f, -2.34f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(111.81f, 13.39f)
                arcToRelative(1.37f, 1.37f, 0.0f, false, true, 1.27f, 0.6f)
                curveToRelative(-0.8f, 1.87f, -2.91f, 2.42f, -4.73f, 2.7f)
                curveToRelative(0.2f, -1.59f, 2.0f, -2.94f, 3.46f, -3.3f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(105.21f, 17.41f)
                lineToRelative(-0.56f, -0.44f)
                curveToRelative(0.32f, -0.24f, 0.32f, -0.24f, 0.56f, -0.72f)
                lineTo(107.52f, 14.0f)
                curveToRelative(0.47f, 1.59f, -1.08f, 2.73f, -2.31f, 3.45f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(118.25f, 11.0f)
                lineToRelative(1.0f, 1.31f)
                curveToRelative(-1.15f, 5.52f, -7.2f, 7.23f, -11.73f, 8.59f)
                curveToRelative(-2.06f, 0.27f, -4.53f, 0.75f, -6.16f, -0.44f)
                arcToRelative(4.82f, 4.82f, 0.0f, false, true, 2.31f, -4.73f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -1.0f, 3.42f)
                curveToRelative(1.27f, 1.67f, 3.82f, 0.51f, 5.61f, 0.43f)
                curveToRelative(3.34f, -1.15f, 7.11f, -2.5f, 9.0f, -6.0f)
                curveToRelative(0.63f, -1.35f, -0.63f, -2.66f, -1.15f, -3.3f)
                curveToRelative(0.56f, 0.2f, 1.55f, 0.16f, 2.15f, 0.72f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.25f, 5.68f)
                arcTo(9.84f, 9.84f, 0.0f, false, true, 124.0f, 10.0f)
                curveToRelative(-0.68f, -2.0f, -2.9f, -4.53f, -5.29f, -4.73f)
                arcTo(4.84f, 4.84f, 0.0f, false, true, 121.1f, 4.0f)
                curveToRelative(1.28f, 0.43f, 2.59f, 0.12f, 3.15f, 1.71f)
            }
        }
        .build()
    }

