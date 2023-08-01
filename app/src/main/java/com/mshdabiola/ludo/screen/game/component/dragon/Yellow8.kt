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

fun Dragon.getYellow(iconColor:Long, accentColor:Long): ImageVector
{
    return Builder(name = "Yellow8", defaultWidth = 200.0.dp, defaultHeight = 200.0.dp,
                viewportWidth = 200.0f, viewportHeight = 200.0f).apply {
            path(fill = SolidColor(Color(iconColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(71.31f, 197.88f)
                arcToRelative(7.43f, 7.43f, 0.0f, false, false, 5.19f, -3.09f)
                curveToRelative(2.11f, -1.0f, 1.31f, -14.0f, 7.0f, -14.4f)
                arcToRelative(22.29f, 22.29f, 0.0f, false, false, 6.31f, -2.0f)
                arcToRelative(19.35f, 19.35f, 0.0f, false, false, 2.26f, 1.43f)
                reflectiveCurveToRelative(10.67f, -5.39f, 12.49f, 2.13f)
                curveToRelative(0.54f, 1.71f, 0.79f, 10.52f, 4.92f, 13.68f)
                curveToRelative(0.54f, -1.05f, 0.87f, -1.68f, 1.0f, -1.9f)
                curveToRelative(0.2f, -0.07f, 5.71f, 4.42f, 6.6f, 4.52f)
                curveToRelative(0.05f, -0.31f, 0.56f, -3.15f, 0.6f, -3.46f)
                curveToRelative(0.27f, -0.14f, 4.48f, 0.45f, 5.6f, 0.45f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.08f, -2.55f)
                curveToRelative(0.2f, -0.19f, 4.62f, 0.0f, 5.45f, -0.88f)
                curveToRelative(-0.24f, -0.4f, -14.67f, -9.39f, -12.93f, -16.78f)
                curveToRelative(-0.48f, -5.11f, 24.83f, -45.61f, 25.09f, -55.37f)
                curveToRelative(0.23f, -0.81f, 1.17f, -25.68f, 5.48f, -31.71f)
                curveToRelative(10.88f, -17.55f, -2.23f, -32.34f, -2.25f, -32.53f)
                arcTo(17.72f, 17.72f, 0.0f, false, true, 145.46f, 53.0f)
                curveToRelative(-5.7f, -10.34f, -5.25f, -16.29f, -5.08f, -16.63f)
                curveToRelative(-0.07f, -0.21f, -1.83f, -2.73f, -3.72f, -5.73f)
                curveToRelative(0.25f, -3.48f, -4.77f, -6.38f, -4.92f, -7.0f)
                curveToRelative(0.0f, 0.0f, -0.85f, -6.88f, -10.56f, -11.43f)
                curveToRelative(-0.1f, -2.1f, -3.89f, -4.3f, -5.59f, -4.74f)
                curveTo(110.0f, 6.59f, 108.27f, 0.11f, 105.44f, 0.0f)
                curveToRelative(-0.92f, -0.21f, -6.82f, 2.0f, -6.19f, 9.21f)
                curveToRelative(-0.14f, 0.31f, -9.65f, 7.5f, -10.13f, 11.94f)
                curveToRelative(0.31f, 0.0f, 10.92f, -7.92f, 12.82f, -7.11f)
                curveToRelative(0.15f, 0.18f, 3.64f, 2.19f, 2.66f, 5.25f)
                curveToRelative(0.0f, 0.13f, -2.66f, 10.55f, -7.58f, 11.34f)
                curveToRelative(-2.35f, -0.25f, -3.47f, -5.38f, -2.31f, -9.38f)
                curveToRelative(-2.1f, 0.0f, -3.93f, 2.67f, -3.93f, 2.67f)
                reflectiveCurveTo(86.91f, 25.11f, 86.0f, 27.68f)
                curveToRelative(0.0f, 0.06f, -1.48f, 6.0f, 0.74f, 8.1f)
                arcToRelative(10.57f, 10.57f, 0.0f, false, false, 0.45f, 5.57f)
                curveToRelative(7.61f, -4.54f, 12.13f, -3.78f, 12.6f, 0.0f)
                curveToRelative(-0.07f, 0.07f, -6.57f, 6.0f, -12.47f, 5.56f)
                curveToRelative(-0.85f, -0.13f, -12.14f, -10.0f, -21.89f, -12.78f)
                curveTo(64.68f, 33.0f, 64.0f, 16.4f, 57.0f, 19.0f)
                curveToRelative(-1.12f, -1.14f, -6.34f, -1.3f, -5.09f, 3.32f)
                curveToRelative(0.37f, 0.93f, 4.76f, 7.4f, 3.55f, 13.36f)
                curveToRelative(0.0f, 0.0f, -2.59f, 11.6f, 7.15f, 12.76f)
                curveToRelative(1.18f, 3.12f, 8.42f, 6.55f, 9.15f, 7.0f)
                curveTo(76.47f, 57.7f, 85.09f, 73.26f, 85.14f, 73.6f)
                arcToRelative(6.32f, 6.32f, 0.0f, false, false, 0.37f, 4.77f)
                arcToRelative(10.34f, 10.34f, 0.0f, false, false, 0.16f, 7.0f)
                curveToRelative(0.31f, 0.21f, -2.08f, 7.42f, -10.7f, 9.17f)
                curveTo(63.0f, 100.25f, 63.62f, 92.84f, 63.84f, 89.71f)
                curveToRelative(-0.66f, -12.08f, -7.0f, -7.76f, -7.17f, -7.71f)
                curveToRelative(-5.52f, -1.68f, 0.81f, 8.0f, -1.26f, 12.92f)
                curveToRelative(-0.46f, 11.51f, 8.15f, 14.41f, 8.51f, 14.67f)
                curveToRelative(4.32f, 3.64f, 16.47f, -1.11f, 18.14f, -2.0f)
                curveToRelative(7.07f, -2.92f, 2.29f, 7.54f, 2.6f, 7.91f)
                curveToRelative(2.13f, 0.53f, 3.28f, 0.81f, 3.44f, 0.88f)
                curveToRelative(0.08f, 0.34f, -1.0f, 4.74f, -1.26f, 6.77f)
                arcToRelative(19.38f, 19.38f, 0.0f, false, false, 3.25f, 0.6f)
                curveToRelative(0.1f, 0.14f, -3.81f, 3.22f, -4.44f, 8.0f)
                curveToRelative(-0.27f, 0.19f, -13.46f, 10.72f, -18.08f, 9.63f)
                curveToRelative(-4.23f, -0.65f, -6.34f, -20.71f, -6.67f, -21.51f)
                curveToRelative(-1.2f, -5.88f, -5.87f, -2.61f, -6.0f, -2.7f)
                curveToRelative(-3.41f, -2.71f, -4.56f, 3.35f, -3.51f, 6.48f)
                curveToRelative(3.58f, 5.37f, 1.37f, 13.44f, 3.66f, 17.18f)
                curveToRelative(1.82f, 8.92f, 7.08f, 13.3f, 7.08f, 13.3f)
                curveToRelative(2.81f, 5.43f, 16.1f, -1.53f, 16.7f, 1.3f)
                curveToRelative(-12.79f, 18.37f, -9.3f, 29.6f, -14.85f, 31.0f)
                arcToRelative(2.43f, 2.43f, 0.0f, false, true, -2.58f, 0.28f)
                curveToRelative(-2.23f, -0.24f, -0.06f, -17.0f, -8.25f, -12.42f)
                curveToRelative(5.81f, 4.22f, 3.63f, 8.6f, 3.6f, 8.55f)
                curveToRelative(0.0f, -7.44f, -5.15f, -9.15f, -6.77f, -8.06f)
                curveToRelative(-2.13f, 0.93f, 1.27f, 14.7f, 0.28f, 20.42f)
                curveToRelative(-0.35f, 6.54f, 7.61f, 4.0f, 7.61f, 4.0f)
                curveToRelative(3.67f, 2.46f, 9.6f, -1.65f, 13.46f, -1.33f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(91.81f, 25.72f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, true, 1.54f, -2.1f)
                lineToRelative(-0.58f, 3.17f)
                reflectiveCurveToRelative(-0.36f, -1.18f, -1.0f, -1.07f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(59.92f, 29.69f)
                verticalLineToRelative(-0.53f)
                lineToRelative(-0.05f, -0.85f)
                arcToRelative(16.25f, 16.25f, 0.0f, false, true, 0.0f, -3.0f)
                arcToRelative(3.29f, 3.29f, 0.0f, false, false, -0.3f, -1.26f)
                lineToRelative(-0.18f, -0.47f)
                lineToRelative(0.05f, -0.09f)
                lineToRelative(-0.05f, 0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.05f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.17f, 2.17f, 0.0f, false, true, 1.0f, 1.53f)
                horizontalLineToRelative(0.09f)
                quadToRelative(-0.13f, 0.61f, -0.45f, 4.71f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(59.88f, 85.0f)
                reflectiveCurveToRelative(1.58f, 1.9f, 1.48f, 2.84f)
                arcToRelative(14.67f, 14.67f, 0.0f, false, true, -0.87f, 2.49f)
                curveToRelative(-0.42f, -0.12f, 0.53f, -3.0f, -0.61f, -5.33f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(142.39f, 72.27f)
                curveToRelative(-0.42f, 0.9f, -0.89f, 4.0f, -1.43f, 9.32f)
                arcToRelative(29.0f, 29.0f, 0.0f, false, true, -4.45f, -4.68f)
                lineToRelative(-2.6f, 0.19f)
                curveToRelative(-0.25f, -0.3f, -3.78f, -3.72f, -3.78f, -3.72f)
                reflectiveCurveToRelative(-4.95f, 1.18f, -4.95f, 1.18f)
                reflectiveCurveTo(121.87f, 73.0f, 121.87f, 73.0f)
                lineToRelative(-3.75f, 0.13f)
                arcToRelative(9.31f, 9.31f, 0.0f, false, true, 3.41f, -0.91f)
                curveToRelative(0.37f, 0.0f, 3.43f, 1.4f, 3.55f, 1.34f)
                reflectiveCurveToRelative(3.9f, -1.66f, 4.0f, -1.64f)
                quadToRelative(0.59f, 0.0f, 4.79f, 3.91f)
                lineToRelative(0.0f, 0.0f)
                horizontalLineTo(134.0f)
                reflectiveCurveToRelative(1.94f, -1.08f, 2.0f, -1.07f)
                reflectiveCurveToRelative(4.12f, 5.09f, 4.33f, 5.44f)
                curveToRelative(0.21f, -0.77f, 0.34f, -9.32f, 0.34f, -9.32f)
                curveToRelative(-8.0f, -9.22f, -27.37f, -0.05f, -27.29f, -0.38f)
                curveToRelative(19.29f, -12.08f, 27.2f, -2.51f, 29.0f, 1.78f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(141.54f, 64.68f)
                curveToRelative(-0.52f, -0.18f, -5.0f, -3.16f, -5.51f, -3.48f)
                curveToRelative(-0.29f, 0.09f, -3.51f, 2.0f, -3.57f, 1.91f)
                arcToRelative(32.13f, 32.13f, 0.0f, false, false, -2.68f, -2.17f)
                curveToRelative(-0.1f, 0.07f, -7.75f, 3.22f, -7.75f, 3.0f)
                lineToRelative(0.84f, -4.23f)
                lineToRelative(-9.35f, 5.54f)
                arcToRelative(63.7f, 63.7f, 0.0f, false, false, 0.89f, -6.53f)
                lineTo(108.0f, 60.52f)
                horizontalLineToRelative(-0.14f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, -0.05f)
                reflectiveCurveToRelative(0.54f, -1.8f, 1.66f, -5.15f)
                lineToRelative(-0.1f, -0.13f)
                lineToRelative(-3.51f, 0.47f)
                reflectiveCurveToRelative(6.31f, -3.65f, 7.08f, -3.77f)
                curveToRelative(-0.07f, 0.21f, -3.38f, 6.91f, -3.0f, 6.85f)
                curveToRelative(0.86f, -0.17f, 7.0f, -3.81f, 7.0f, -3.66f)
                curveToRelative(0.19f, 0.43f, -1.85f, 8.05f, -1.91f, 8.26f)
                curveToRelative(0.61f, 0.0f, 9.0f, -7.49f, 9.21f, -7.61f)
                curveToRelative(0.86f, 2.6f, -0.91f, 6.61f, -0.94f, 6.82f)
                arcToRelative(18.49f, 18.49f, 0.0f, false, false, 7.45f, -6.39f)
                curveToRelative(0.48f, 0.49f, 3.44f, 4.53f, 3.49f, 4.58f)
                arcToRelative(36.47f, 36.47f, 0.0f, false, true, 3.31f, -3.28f)
                curveToRelative(0.14f, 0.14f, 2.5f, 3.07f, 2.53f, 3.0f)
                curveToRelative(-0.13f, -1.19f, -4.63f, -13.72f, -4.75f, -14.15f)
                curveToRelative(6.62f, 4.46f, 6.34f, 18.29f, 6.27f, 18.33f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(125.9f, 22.67f)
                curveToRelative(0.49f, 0.47f, 6.8f, 8.0f, 7.54f, 14.0f)
                curveTo(124.63f, 31.9f, 122.0f, 26.16f, 122.0f, 26.16f)
                reflectiveCurveToRelative(5.22f, 3.72f, 6.24f, 3.58f)
                curveToRelative(-0.18f, -0.51f, -2.66f, -5.26f, -2.67f, -6.85f)
                curveToRelative(0.11f, -0.18f, 0.22f, -0.25f, 0.34f, -0.22f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(105.25f, 5.07f)
                curveToRelative(-0.5f, 1.58f, -3.14f, 3.38f, -3.14f, 3.38f)
                curveToRelative(-1.0f, -0.26f, 2.55f, -3.75f, 3.14f, -3.38f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(106.47f, 7.89f)
                curveToRelative(1.0f, 3.45f, 6.7f, 2.44f, 6.81f, 3.46f)
                curveToRelative(0.0f, 0.0f, -7.0f, 1.53f, -6.81f, -3.46f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(94.39f, 16.07f)
                curveToRelative(1.38f, -1.8f, 6.36f, -5.92f, 6.94f, -4.35f)
                curveToRelative(0.29f, 1.28f, -6.94f, 4.35f, -6.94f, 4.35f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 12.89f)
                reflectiveCurveToRelative(6.85f, -5.0f, 7.0f, 2.25f)
                lineToRelative(-1.15f, -1.88f)
                reflectiveCurveToRelative(-1.43f, 0.86f, -1.66f, 1.0f)
                curveToRelative(-0.14f, -0.3f, -0.56f, -1.8f, -0.69f, -2.09f)
                curveToRelative(-1.0f, -0.22f, -2.67f, 1.08f, -2.89f, 1.23f)
                curveToRelative(0.0f, 0.0f, 6.45f, 4.92f, 8.54f, 9.29f)
                curveToRelative(-11.74f, -11.88f, -15.31f, -1.44f, -15.34f, -1.45f)
                curveToRelative(0.23f, -6.16f, 6.14f, -8.32f, 6.16f, -8.33f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(109.92f, 27.3f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, true, -5.61f, 4.28f)
                arcToRelative(44.21f, 44.21f, 0.0f, false, true, 3.86f, -10.32f)
                horizontalLineToRelative(0.18f)
                reflectiveCurveToRelative(-1.95f, 6.62f, -2.09f, 6.91f)
                curveToRelative(0.0f, 0.0f, 4.14f, -2.31f, 4.53f, -2.38f)
                curveToRelative(0.14f, 0.23f, 1.19f, 2.52f, 1.48f, 3.08f)
                arcToRelative(19.0f, 19.0f, 0.0f, false, false, 2.07f, -1.82f)
                lineTo(113.0f, 31.8f)
                lineToRelative(-3.06f, -4.5f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(94.38f, 70.89f)
                lineToRelative(-2.75f, 0.28f)
                verticalLineTo(69.49f)
                arcToRelative(27.22f, 27.22f, 0.0f, false, true, -6.06f, 0.84f)
                reflectiveCurveToRelative(0.0f, -6.71f, -0.07f, -6.77f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -3.31f, -1.7f)
                curveToRelative(0.0f, -0.38f, 0.65f, -2.07f, 0.7f, -2.44f)
                curveToRelative(-0.45f, -0.55f, -5.09f, -7.1f, -10.61f, -9.68f)
                curveToRelative(-10.46f, -3.43f, -8.12f, -9.0f, -8.08f, -9.0f)
                curveToRelative(0.31f, 0.24f, 1.77f, 5.3f, 7.0f, 6.68f)
                curveTo(75.52f, 48.76f, 83.61f, 58.0f, 83.61f, 58.0f)
                arcToRelative(18.42f, 18.42f, 0.0f, false, true, 3.16f, -3.6f)
                reflectiveCurveToRelative(-3.18f, 5.21f, -2.69f, 7.35f)
                curveToRelative(0.0f, 0.0f, 3.13f, -0.18f, 3.16f, -0.11f)
                lineToRelative(0.1f, 0.0f)
                arcTo(46.82f, 46.82f, 0.0f, false, false, 86.91f, 69.0f)
                arcToRelative(49.46f, 49.46f, 0.0f, false, false, 4.74f, -2.0f)
                curveToRelative(0.0f, -2.22f, 0.68f, -5.36f, 0.6f, -5.38f)
                reflectiveCurveToRelative(-2.38f, -0.76f, -2.74f, -0.92f)
                curveToRelative(5.23f, -11.43f, 17.7f, -19.87f, 18.24f, -19.79f)
                arcToRelative(15.23f, 15.23f, 0.0f, false, true, 0.71f, 3.66f)
                curveToRelative(0.29f, 0.0f, 5.78f, -4.74f, 5.78f, -4.74f)
                curveToRelative(0.18f, 0.18f, 1.53f, 1.85f, 2.0f, 2.39f)
                curveToRelative(0.15f, -0.23f, 1.23f, -1.91f, 1.37f, -2.09f)
                arcToRelative(22.78f, 22.78f, 0.0f, false, true, 2.31f, 0.64f)
                curveToRelative(0.0f, -0.05f, -1.5f, -11.09f, -1.5f, -11.11f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, true, 1.29f, 1.88f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, false, 1.49f, -1.34f)
                curveToRelative(0.74f, 0.83f, 3.0f, 5.65f, 3.2f, 5.87f)
                arcToRelative(14.73f, 14.73f, 0.0f, false, true, 1.79f, -0.76f)
                reflectiveCurveToRelative(3.23f, 7.34f, 3.5f, 7.63f)
                curveToRelative(0.8f, -1.0f, 1.39f, -1.72f, 1.76f, -2.23f)
                arcToRelative(43.15f, 43.15f, 0.0f, false, true, 4.61f, 2.56f)
                curveToRelative(-0.07f, -0.27f, -1.44f, -8.79f, -1.46f, -9.0f)
                curveToRelative(0.32f, -0.5f, 2.87f, 3.14f, 3.24f, 5.4f)
                arcToRelative(35.85f, 35.85f, 0.0f, false, true, 0.42f, 5.76f)
                arcToRelative(28.77f, 28.77f, 0.0f, false, true, -2.93f, -1.64f)
                curveToRelative(-0.27f, 0.07f, -2.6f, 2.18f, -2.87f, 2.37f)
                curveTo(132.24f, 46.0f, 122.16f, 34.3f, 121.28f, 34.0f)
                arcToRelative(4.85f, 4.85f, 0.0f, false, false, 0.22f, 0.78f)
                curveToRelative(0.65f, 1.91f, 1.42f, 9.12f, 1.42f, 9.41f)
                arcToRelative(49.63f, 49.63f, 0.0f, false, true, -4.22f, -3.09f)
                curveToRelative(0.0f, 0.11f, -2.32f, 4.8f, -2.32f, 4.8f)
                reflectiveCurveToRelative(-1.84f, -4.25f, -1.91f, -4.38f)
                curveToRelative(-0.18f, 0.1f, -7.28f, 7.32f, -7.38f, 7.32f)
                reflectiveCurveToRelative(-0.39f, -5.39f, -0.44f, -5.38f)
                curveToRelative(-0.23f, 0.19f, -12.3f, 9.1f, -15.31f, 16.72f)
                arcToRelative(6.45f, 6.45f, 0.0f, false, true, 2.6f, -0.52f)
                curveToRelative(-0.12f, 1.05f, -1.65f, 8.0f, -0.76f, 10.52f)
                lineToRelative(0.09f, 0.0f)
                reflectiveCurveToRelative(2.5f, -2.16f, 3.28f, -1.74f)
                curveToRelative(-0.66f, 5.0f, -1.14f, 8.26f, -1.14f, 8.26f)
                arcToRelative(56.49f, 56.49f, 0.0f, false, true, -1.0f, -5.77f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(118.91f, 78.05f)
                curveToRelative(16.81f, -7.14f, 21.07f, 12.26f, 21.47f, 13.39f)
                reflectiveCurveToRelative(0.25f, 1.52f, -0.33f, 1.58f)
                curveToRelative(0.0f, 0.0f, -8.48f, -16.65f, -21.14f, -15.0f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(65.42f, 103.69f)
                curveToRelative(6.22f, 6.49f, 20.4f, -4.11f, 22.0f, -4.26f)
                curveToRelative(-2.0f, -10.13f, 4.49f, -18.35f, 4.49f, -18.35f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.73f, 4.09f)
                reflectiveCurveToRelative(-3.19f, 3.54f, -3.52f, 10.94f)
                curveToRelative(0.13f, 0.12f, 8.33f, -1.68f, 8.7f, -1.7f)
                arcToRelative(16.84f, 16.84f, 0.0f, false, true, 0.61f, 5.1f)
                curveToRelative(1.0f, -0.16f, 9.1f, -4.6f, 9.1f, -4.6f)
                reflectiveCurveToRelative(0.41f, 1.6f, 0.47f, 1.8f)
                lineToRelative(0.15f, 0.0f)
                arcTo(109.73f, 109.73f, 0.0f, false, true, 116.3f, 86.6f)
                horizontalLineToRelative(0.14f)
                reflectiveCurveToRelative(-1.25f, 10.89f, -8.0f, 16.41f)
                curveToRelative(-0.29f, -0.62f, -1.15f, -3.26f, -1.5f, -4.23f)
                curveToRelative(-0.11f, 0.0f, -6.46f, 3.82f, -6.46f, 3.82f)
                horizontalLineToRelative(-0.19f)
                reflectiveCurveToRelative(-4.6f, -5.11f, -4.81f, -5.33f)
                curveToRelative(-0.28f, 0.14f, -11.2f, 5.14f, -12.53f, 5.71f)
                curveToRelative(0.0f, 0.0f, -13.32f, 9.58f, -17.52f, 0.71f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.49f, 118.88f)
                lineToRelative(1.14f, 2.46f)
                lineToRelative(-0.34f, 3.11f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, -0.8f, -5.57f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(59.0f, 133.59f)
                curveToRelative(2.7f, 1.45f, 1.21f, 12.07f, 8.0f, 15.21f)
                curveToRelative(-7.53f, -1.35f, -6.11f, -11.06f, -8.0f, -15.21f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(84.19f, 166.0f)
                horizontalLineTo(80.53f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(0.06f, 0.06f, 0.0f, false, false, -0.06f, 0.0f)
                curveToRelative(0.09f, -0.54f, 0.36f, -1.91f, 0.83f, -4.13f)
                horizontalLineToRelative(0.43f)
                lineToRelative(0.0f, 3.0f)
                curveToRelative(0.0f, 0.06f, 0.0f, 0.1f, 0.1f, 0.09f)
                lineToRelative(4.13f, -0.23f)
                arcToRelative(0.24f, 0.24f, 0.0f, false, false, 0.0f, 0.2f)
                horizontalLineToRelative(0.09f)
                arcToRelative(36.75f, 36.75f, 0.0f, false, false, -0.74f, 5.57f)
                arcToRelative(21.1f, 21.1f, 0.0f, false, false, 4.42f, -1.14f)
                curveToRelative(1.27f, -0.41f, 2.0f, -0.63f, 2.17f, -0.66f)
                arcToRelative(32.63f, 32.63f, 0.0f, false, false, 0.76f, 3.65f)
                curveToRelative(0.9f, 0.07f, 8.79f, -9.24f, 8.44f, -9.24f)
                curveToRelative(0.0f, 0.0f, -7.0f, -0.18f, -9.56f, -1.28f)
                curveToRelative(0.0f, -0.09f, 0.74f, -1.39f, 0.83f, -1.66f)
                curveToRelative(-1.34f, -0.67f, -3.75f, -1.71f, -7.25f, -3.13f)
                lineToRelative(0.25f, -3.89f)
                arcToRelative(9.42f, 9.42f, 0.0f, false, true, -1.72f, -0.77f)
                lineToRelative(0.0f, -0.72f)
                quadToRelative(-2.07f, -1.0f, -12.07f, -2.5f)
                verticalLineTo(149.0f)
                curveToRelative(4.9f, -3.23f, 14.53f, -1.5f, 15.33f, -1.0f)
                curveToRelative(-0.11f, 0.51f, -1.39f, 3.0f, -1.35f, 3.22f)
                curveToRelative(0.25f, 0.19f, 4.33f, 0.93f, 5.0f, 1.12f)
                curveToRelative(-0.36f, 0.72f, -2.93f, 3.62f, -3.0f, 3.93f)
                curveToRelative(0.55f, 0.56f, 8.34f, 1.79f, 8.45f, 1.81f)
                arcToRelative(31.36f, 31.36f, 0.0f, false, true, -3.43f, 3.26f)
                curveToRelative(2.47f, 0.47f, 11.16f, 0.36f, 11.68f, 0.28f)
                arcToRelative(0.09f, 0.09f, 0.0f, false, false, 0.0f, 0.07f)
                quadToRelative(-2.34f, 4.26f, -2.0f, 4.39f)
                arcToRelative(46.82f, 46.82f, 0.0f, false, false, 11.89f, -7.94f)
                curveToRelative(-1.5f, -5.17f, 13.69f, -23.68f, 13.0f, -33.74f)
                curveToRelative(-13.0f, 15.52f, -32.84f, 5.37f, -32.84f, 5.37f)
                curveToRelative(26.0f, 7.54f, 37.31f, -13.75f, 38.0f, -14.62f)
                curveToRelative(0.0f, 0.17f, -2.66f, 5.73f, -2.66f, 5.73f)
                curveToRelative(-1.26f, 18.32f, -14.9f, 29.24f, -14.58f, 38.09f)
                arcToRelative(26.87f, 26.87f, 0.0f, false, false, -6.66f, 16.0f)
                curveToRelative(0.25f, 0.16f, 4.2f, 2.9f, 5.17f, 5.68f)
                curveToRelative(0.5f, 0.57f, 4.44f, 6.84f, 4.39f, 6.85f)
                curveToRelative(-1.29f, -0.69f, -4.43f, -2.8f, -4.43f, -2.8f)
                horizontalLineToRelative(-0.15f)
                lineToRelative(-0.45f, 4.66f)
                horizontalLineToRelative(0.0f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, true, -1.48f, -4.19f)
                curveToRelative(-0.18f, 0.18f, -2.22f, 2.56f, -2.44f, 2.73f)
                curveToRelative(-0.64f, -1.13f, 1.88f, -7.34f, 1.84f, -7.54f)
                curveToRelative(-0.11f, -2.49f, -3.52f, -3.93f, -4.0f, -4.43f)
                curveToRelative(0.17f, -2.23f, 1.43f, -11.0f, 1.48f, -11.53f)
                arcToRelative(92.06f, 92.06f, 0.0f, false, true, -9.73f, 4.88f)
                reflectiveCurveToRelative(-4.37f, 5.0f, -7.7f, 5.34f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -0.85f, -3.61f)
                curveToRelative(-0.74f, 0.25f, -5.0f, 1.0f, -5.0f, 1.0f)
                curveToRelative(-0.12f, -0.37f, -0.41f, -2.41f, -0.89f, -6.1f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(57.22f, 193.85f)
                curveToRelative(23.13f, 2.0f, 11.1f, -15.2f, 22.49f, -19.72f)
                curveToRelative(-8.7f, 10.93f, 0.32f, 24.69f, -22.49f, 19.72f)
            }
        }
        .build()
    }

