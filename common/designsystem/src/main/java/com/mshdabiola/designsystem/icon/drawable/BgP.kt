package com.mshdabiola.designsystem.icon.drawable

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.icon.Drawable

public val Drawable.BgP: ImageVector
    get() {
        if (_bgP != null) {
            return _bgP!!
        }
        _bgP = Builder(name = "BgP", defaultWidth = 723.32.dp, defaultHeight = 1600.0.dp,
                viewportWidth = 723.32f, viewportHeight = 1600.0f).apply {
            path(fill = SolidColor(Color(0xFFa2d2da)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                    = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.63f, 0.0f)
                horizontalLineToRelative(720.0f)
                verticalLineToRelative(1600.0f)
                horizontalLineToRelative(-720.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF94c124)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                    = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.63f, 1052.19f)
                horizontalLineToRelative(719.47f)
                verticalLineToRelative(547.81f)
                horizontalLineToRelative(-719.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF86a32d)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                    = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(80.37f, 949.38f)
                curveTo(52.78f, 978.0f, 26.78f, 1008.05f, 0.63f, 1038.0f)
                verticalLineTo(870.0f)
                curveToRelative(28.8f, 20.84f, 56.26f, 43.48f, 83.0f, 67.1f)
                curveTo(87.51f, 942.51f, 83.44f, 946.19f, 80.37f, 949.38f)
                close()
            }
            path(fill = SolidColor(Color(0xFF90af2c)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                    = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.63f, 1056.82f)
                curveToRelative(86.71f, 0.91f, 172.88f, 2.0f, 259.59f, 2.62f)
                lineToRelative(13.48f, 0.09f)
                curveToRelative(38.69f, 0.24f, 77.38f, 0.47f, 116.07f, 0.48f)
                lineToRelative(20.68f, 0.0f)
                lineToRelative(6.18f, 0.0f)
                horizontalLineToRelative(2.52f)
                quadToRelative(11.52f, 0.0f, 23.0f, -0.1f)
                quadToRelative(28.14f, -0.18f, 56.26f, -0.61f)
                curveToRelative(35.45f, -0.55f, 70.88f, -3.0f, 106.36f, -2.39f)
                curveToRelative(5.08f, 0.09f, 10.51f, -1.49f, 15.11f, 2.2f)
                curveToRelative(3.73f, 4.11f, 8.64f, 2.86f, 13.26f, 2.9f)
                quadToRelative(7.68f, 0.06f, 15.37f, 0.07f)
                quadToRelative(11.31f, 0.0f, 22.62f, 0.0f)
                horizontalLineToRelative(3.5f)
                lineToRelative(5.81f, 0.0f)
                quadToRelative(10.37f, -0.06f, 20.75f, -0.2f)
                quadToRelative(9.71f, -0.09f, 19.4f, -0.25f)
                verticalLineTo(969.92f)
                curveToRelative(-3.45f, -0.41f, -5.58f, -4.29f, -8.2f, -6.37f)
                quadToRelative(-8.5f, -6.75f, -17.0f, -13.53f)
                quadToRelative(-11.52f, -9.18f, -23.1f, -18.26f)
                curveToRelative(-23.42f, -18.29f, -47.28f, -36.0f, -72.85f, -51.42f)
                curveToRelative(-17.16f, -10.38f, -31.16f, -8.69f, -46.46f, 3.17f)
                curveToRelative(-13.16f, 10.19f, -25.69f, 21.0f, -37.73f, 32.42f)
                quadToRelative(-16.0f, 15.0f, -30.91f, 31.16f)
                curveToRelative(-6.61f, 7.06f, -11.37f, 9.38f, -19.76f, 2.13f)
                curveToRelative(-6.77f, -5.86f, -14.75f, -10.28f, -22.41f, -15.12f)
                curveToRelative(-1.95f, -1.24f, -3.89f, -2.5f, -5.79f, -3.82f)
                curveToRelative(-12.09f, -8.46f, -23.15f, -8.06f, -34.6f, 0.64f)
                curveToRelative(-0.48f, 0.36f, -1.0f, 0.74f, -1.44f, 1.13f)
                curveToRelative(-1.73f, 1.42f, -3.35f, 3.12f, -5.07f, 4.73f)
                curveToRelative(-3.08f, 2.89f, -6.45f, 5.45f, -11.27f, 5.44f)
                arcToRelative(38.9f, 38.9f, 0.0f, false, false, -4.0f, 2.06f)
                curveToRelative(-11.0f, 6.44f, -18.13f, 17.36f, -27.28f, 25.91f)
                curveToRelative(-13.3f, 12.42f, -13.06f, 12.85f, -27.27f, 0.95f)
                lineToRelative(-0.43f, -0.36f)
                curveToRelative(-16.11f, -13.48f, -32.14f, -27.0f, -48.9f, -39.71f)
                arcToRelative(50.2f, 50.2f, 0.0f, false, false, -5.48f, -3.71f)
                arcToRelative(24.6f, 24.6f, 0.0f, false, false, -6.92f, -2.83f)
                curveToRelative(-19.19f, -12.93f, -38.0f, -26.51f, -57.65f, -38.63f)
                curveToRelative(-30.86f, -19.0f, -35.74f, -18.71f, -63.83f, 4.56f)
                curveToRelative(-16.38f, 13.59f, -31.45f, 28.76f, -47.11f, 43.23f)
                curveToRelative(-2.72f, 2.52f, -4.58f, 6.4f, -8.8f, 6.52f)
                arcToRelative(7.43f, 7.43f, 0.0f, false, true, -1.46f, -0.09f)
                curveToRelative(-0.28f, 6.54f, -5.79f, 9.44f, -9.5f, 13.56f)
                curveTo(50.92f, 980.87f, 25.1f, 1008.2f, 0.63f, 1035.38f)
                close()
            }
            path(fill = SolidColor(Color(0xFF86a32d)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                    = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(263.73f, 921.53f)
                curveToRelative(14.75f, 12.38f, 29.44f, 24.83f, 44.27f, 37.12f)
                curveToRelative(8.0f, 6.62f, 16.77f, 12.39f, 24.15f, 19.62f)
                curveToRelative(5.64f, 5.52f, 9.17f, 6.38f, 14.7f, 0.07f)
                curveToRelative(11.85f, -13.53f, 26.36f, -24.57f, 37.19f, -39.12f)
                curveToRelative(-17.23f, -13.89f, -36.17f, -25.0f, -55.62f, -35.48f)
                curveToRelative(-16.89f, -9.09f, -32.28f, -7.59f, -47.15f, 3.79f)
                curveTo(275.33f, 912.07f, 269.57f, 916.85f, 263.73f, 921.53f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFA1D5F4), 0.99f to Color(0xFFDAEFFD), start
                    = Offset(115.15569f,427.9957f), end = Offset(67.446f,349.1392f)), stroke = null,
                    fillAlpha = 0.7f, strokeAlpha = 0.7f, strokeLineWidth = 0.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.63f, 402.85f)
                curveToRelative(2.11f, 0.0f, 4.39f, 0.06f, 6.81f, 0.17f)
                curveToRelative(-4.85f, -2.6f, -7.9f, -6.86f, -7.38f, -11.1f)
                curveToRelative(0.53f, -4.44f, 4.82f, -7.58f, 10.47f, -8.23f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, -0.72f, -5.31f)
                curveToRelative(1.0f, -8.54f, 12.67f, -13.58f, 26.0f, -11.26f)
                arcToRelative(37.05f, 37.05f, 0.0f, false, true, 10.43f, 3.42f)
                curveToRelative(3.0f, -2.51f, 7.71f, -3.76f, 13.0f, -3.13f)
                arcToRelative(12.27f, 12.27f, 0.0f, false, true, -0.09f, -3.58f)
                curveTo(60.0f, 356.0f, 68.18f, 351.0f, 77.27f, 352.56f)
                curveToRelative(0.39f, 0.07f, 0.77f, 0.15f, 1.16f, 0.24f)
                arcToRelative(22.16f, 22.16f, 0.0f, false, true, 26.0f, -18.38f)
                arcToRelative(25.19f, 25.19f, 0.0f, false, true, 20.55f, 26.45f)
                arcToRelative(13.16f, 13.16f, 0.0f, false, true, 8.18f, 5.33f)
                curveToRelative(2.29f, -10.0f, 13.49f, -16.26f, 25.95f, -14.1f)
                curveToRelative(13.17f, 2.3f, 22.77f, 13.11f, 21.44f, 24.15f)
                arcToRelative(16.92f, 16.92f, 0.0f, false, true, -5.34f, 10.38f)
                curveToRelative(12.51f, 3.0f, 21.62f, 8.46f, 21.06f, 13.0f)
                curveToRelative(-0.42f, 3.51f, -6.38f, 5.59f, -14.83f, 5.74f)
                arcToRelative(7.69f, 7.69f, 0.0f, false, true, 0.86f, 4.35f)
                curveToRelative(-0.79f, 6.6f, -11.72f, 10.67f, -27.91f, 11.57f)
                curveToRelative(-3.37f, 6.35f, -18.13f, 9.67f, -38.16f, 9.24f)
                curveToRelative(-5.38f, 1.12f, -13.19f, 1.47f, -22.51f, 1.0f)
                quadToRelative(-2.76f, 0.09f, -6.0f, 0.0f)
                arcToRelative(3.14f, 3.14f, 0.0f, false, true, 1.18f, 2.47f)
                curveToRelative(-0.53f, 4.42f, -17.74f, 5.07f, -38.44f, 1.47f)
                reflectiveCurveToRelative(-37.0f, -10.1f, -36.51f, -14.52f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, true, 0.23f, -0.68f)
                curveToRelative(-5.0f, -1.32f, -9.57f, -2.68f, -13.54f, -4.0f)
            }
            path(fill = linearGradient(0.0f to Color(0xFF9FD4F5), 0.98f to Color(0xFFEFF8FB), start
                    = Offset(635.36f,401.1f), end = Offset(596.21f,277.0f)), stroke = null,
                    fillAlpha = 0.7f, strokeAlpha = 0.7f, strokeLineWidth = 0.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(716.56f, 286.82f)
                arcToRelative(18.86f, 18.86f, 0.0f, false, false, -9.74f, 2.59f)
                curveToRelative(-1.0f, -4.21f, -4.12f, -7.29f, -7.81f, -7.29f)
                curveToRelative(-3.37f, 0.0f, -6.26f, 2.56f, -7.5f, 6.2f)
                arcToRelative(19.09f, 19.09f, 0.0f, false, false, -6.5f, -1.11f)
                arcToRelative(19.73f, 19.73f, 0.0f, false, false, -4.64f, 0.55f)
                arcToRelative(11.84f, 11.84f, 0.0f, false, false, 2.56f, -7.21f)
                curveToRelative(0.0f, -8.23f, -9.17f, -14.91f, -20.47f, -14.91f)
                reflectiveCurveTo(642.0f, 272.32f, 642.0f, 280.55f)
                arcToRelative(12.47f, 12.47f, 0.0f, false, false, 4.1f, 8.94f)
                lineToRelative(-0.26f, 0.28f)
                arcToRelative(10.55f, 10.55f, 0.0f, false, false, -6.55f, -2.16f)
                curveToRelative(-4.85f, 0.0f, -8.85f, 3.0f, -9.35f, 6.83f)
                arcToRelative(26.08f, 26.08f, 0.0f, false, false, -9.45f, -1.74f)
                curveToRelative(-11.88f, 0.0f, -21.51f, 7.65f, -21.51f, 17.07f)
                curveToRelative(0.0f, 5.51f, 3.29f, 10.41f, 8.41f, 13.53f)
                horizontalLineToRelative(-0.06f)
                arcToRelative(6.28f, 6.28f, 0.0f, false, false, -6.0f, 3.55f)
                arcToRelative(12.37f, 12.37f, 0.0f, false, false, -6.14f, -1.59f)
                curveToRelative(-6.0f, 0.0f, -10.87f, 4.0f, -10.87f, 9.0f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, false, 0.07f, 1.0f)
                arcToRelative(11.56f, 11.56f, 0.0f, false, false, -2.16f, -0.2f)
                arcToRelative(11.32f, 11.32f, 0.0f, false, false, -3.0f, 0.41f)
                arcTo(17.3f, 17.3f, 0.0f, false, false, 566.37f, 330.0f)
                curveToRelative(-9.23f, 0.0f, -16.71f, 6.85f, -16.71f, 15.3f)
                arcToRelative(14.53f, 14.53f, 0.0f, false, false, 4.16f, 10.1f)
                arcToRelative(5.53f, 5.53f, 0.0f, false, false, -2.75f, 3.51f)
                arcToRelative(4.82f, 4.82f, 0.0f, false, false, -2.45f, -0.67f)
                arcToRelative(5.27f, 5.27f, 0.0f, false, false, -4.89f, 3.68f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, -5.35f, -1.33f)
                curveToRelative(-4.75f, 0.0f, -8.65f, 2.77f, -9.14f, 6.31f)
                curveToRelative(-0.29f, 0.0f, -0.59f, 0.0f, -0.89f, 0.0f)
                curveToRelative(-5.53f, 0.0f, -10.0f, 3.87f, -10.0f, 8.63f)
                arcToRelative(8.19f, 8.19f, 0.0f, false, false, 3.66f, 6.67f)
                curveToRelative(-3.0f, 0.0f, -5.33f, 2.0f, -5.33f, 4.51f)
                reflectiveCurveToRelative(2.43f, 4.51f, 5.43f, 4.51f)
                arcToRelative(5.93f, 5.93f, 0.0f, false, false, 3.89f, -1.37f)
                arcToRelative(5.73f, 5.73f, 0.0f, false, false, 1.22f, 0.77f)
                curveToRelative(-8.68f, 1.27f, -14.62f, 2.87f, -16.55f, 4.63f)
                verticalLineToRelative(2.52f)
                curveToRelative(4.67f, 4.28f, 32.79f, 7.57f, 66.79f, 7.57f)
                curveToRelative(30.49f, 0.0f, 56.25f, -2.65f, 64.61f, -6.28f)
                horizontalLineToRelative(2.86f)
                curveToRelative(42.0f, 0.0f, 64.88f, -1.53f, 78.41f, -3.73f)
                lineTo(723.34f, 288.0f)
                arcTo(19.7f, 19.7f, 0.0f, false, false, 716.56f, 286.82f)
                close()
                moveTo(527.56f, 386.91f)
                curveToRelative(0.0f, -0.09f, 0.0f, -0.17f, 0.0f, -0.26f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, false, 0.0f, -0.15f)
                lineToRelative(0.47f, 0.21f)
                arcTo(5.11f, 5.11f, 0.0f, false, false, 527.51f, 386.91f)
                close()
            }
            path(fill = null, stroke = null, fillAlpha = 0.7f, strokeAlpha = 0.7f, strokeLineWidth =
                    0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(261.0f, 498.51f)
                arcToRelative(13.6f, 13.6f, 0.0f, false, true, 11.52f, 5.85f)
                arcToRelative(4.71f, 4.71f, 0.0f, false, true, 1.0f, -0.11f)
                arcToRelative(5.35f, 5.35f, 0.0f, false, true, 4.72f, 3.24f)
                arcTo(16.37f, 16.37f, 0.0f, false, true, 291.0f, 501.74f)
                curveToRelative(8.59f, 0.0f, 15.56f, 6.0f, 15.56f, 13.45f)
                arcToRelative(11.38f, 11.38f, 0.0f, false, true, -0.12f, 1.66f)
                curveToRelative(6.18f, 0.58f, 11.0f, 6.44f, 11.0f, 13.58f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, -0.86f, 5.06f)
                arcToRelative(8.82f, 8.82f, 0.0f, false, true, 8.24f, 8.56f)
                arcToRelative(8.58f, 8.58f, 0.0f, false, true, -0.11f, 1.35f)
                arcToRelative(9.69f, 9.69f, 0.0f, false, true, 4.28f, -1.0f)
                arcToRelative(9.07f, 9.07f, 0.0f, false, true, 9.31f, 8.79f)
                quadToRelative(0.0f, 0.31f, 0.0f, 0.63f)
                curveToRelative(4.79f, 0.66f, 8.05f, 2.0f, 8.05f, 3.49f)
                curveToRelative(0.0f, 2.0f, -6.0f, 3.73f, -13.6f, 3.93f)
                arcToRelative(9.77f, 9.77f, 0.0f, false, true, -3.73f, 0.74f)
                arcToRelative(9.64f, 9.64f, 0.0f, false, true, -4.59f, -1.15f)
                curveToRelative(-3.49f, -0.47f, -6.2f, -1.28f, -7.46f, -2.26f)
                curveToRelative(-1.23f, 0.12f, -2.51f, 0.18f, -3.83f, 0.18f)
                curveToRelative(-8.0f, 0.0f, -14.62f, -2.28f, -15.72f, -5.23f)
                arcToRelative(76.21f, 76.21f, 0.0f, false, true, -12.19f, 0.92f)
                curveToRelative(-12.34f, 0.0f, -22.52f, -2.59f, -24.0f, -5.94f)
                curveToRelative(-2.18f, 0.13f, -4.44f, 0.21f, -6.77f, 0.21f)
                curveToRelative(-18.33f, 0.0f, -33.2f, -4.5f, -33.2f, -10.0f)
                curveToRelative(0.0f, -4.0f, 7.56f, -7.38f, 18.55f, -9.0f)
                arcToRelative(10.05f, 10.05f, 0.0f, false, true, -2.83f, -6.94f)
                curveToRelative(0.0f, -5.74f, 5.0f, -10.4f, 11.19f, -10.58f)
                arcToRelative(9.47f, 9.47f, 0.0f, false, true, -0.28f, -2.33f)
                curveToRelative(0.0f, -6.24f, 5.89f, -11.3f, 13.15f, -11.3f)
                close()
                moveTo(260.5f, 521.09f)
                curveToRelative(-0.2f, 0.0f, -0.41f, 0.0f, -0.61f, 0.0f)
                curveToRelative(0.0f, 0.18f, 0.06f, 0.35f, 0.08f, 0.53f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFBAE3F7), 1.0f to Color(0xFFFFFFFF), start =
                    Offset(387.64f,639.67f), end = Offset(370.58f,578.25f)), stroke = null,
                    fillAlpha = 0.7f, strokeAlpha = 0.7f, strokeLineWidth = 0.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(406.87f, 582.65f)
                curveToRelative(-4.89f, 0.0f, -9.15f, 2.17f, -11.36f, 5.37f)
                arcToRelative(5.09f, 5.09f, 0.0f, false, false, -5.64f, 2.88f)
                arcToRelative(16.66f, 16.66f, 0.0f, false, false, -12.59f, -5.29f)
                curveToRelative(-8.47f, 0.0f, -15.34f, 5.54f, -15.34f, 12.37f)
                arcToRelative(10.88f, 10.88f, 0.0f, false, false, 0.11f, 1.52f)
                arcTo(12.28f, 12.28f, 0.0f, false, false, 351.18f, 612.0f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, 0.85f, 4.65f)
                curveToRelative(-4.57f, 0.39f, -8.13f, 3.77f, -8.13f, 7.87f)
                arcToRelative(7.33f, 7.33f, 0.0f, false, false, 0.11f, 1.24f)
                arcToRelative(10.14f, 10.14f, 0.0f, false, false, -4.22f, -0.91f)
                curveToRelative(-5.07f, 0.0f, -9.18f, 3.62f, -9.18f, 8.08f)
                curveToRelative(0.0f, 0.19f, 0.0f, 0.39f, 0.0f, 0.58f)
                curveToRelative(-4.72f, 0.61f, -7.93f, 1.82f, -7.93f, 3.21f)
                curveToRelative(0.0f, 1.88f, 5.88f, 3.43f, 13.41f, 3.61f)
                arcToRelative(10.29f, 10.29f, 0.0f, false, false, 3.68f, 0.68f)
                arcToRelative(10.14f, 10.14f, 0.0f, false, false, 4.53f, -1.06f)
                curveToRelative(3.44f, -0.43f, 6.11f, -1.17f, 7.36f, -2.08f)
                curveToRelative(1.2f, 0.11f, 2.47f, 0.17f, 3.77f, 0.17f)
                curveToRelative(7.89f, 0.0f, 14.42f, -2.09f, 15.51f, -4.81f)
                arcToRelative(80.76f, 80.76f, 0.0f, false, false, 12.0f, 0.85f)
                curveToRelative(12.16f, 0.0f, 22.21f, -2.38f, 23.7f, -5.47f)
                quadToRelative(3.24f, 0.2f, 6.68f, 0.2f)
                curveToRelative(18.08f, 0.0f, 32.75f, -4.13f, 32.75f, -9.23f)
                curveToRelative(0.0f, -3.64f, -7.46f, -6.78f, -18.3f, -8.29f)
                arcToRelative(8.91f, 8.91f, 0.0f, false, false, 2.8f, -6.38f)
                curveToRelative(0.0f, -5.27f, -4.91f, -9.56f, -11.0f, -9.72f)
                arcToRelative(8.51f, 8.51f, 0.0f, false, false, 0.28f, -2.15f)
                curveToRelative(0.0f, -5.73f, -5.81f, -10.38f, -13.0f, -10.38f)
                close()
                moveTo(407.37f, 603.41f)
                lineTo(407.97f, 603.41f)
                curveToRelative(0.0f, 0.16f, -0.06f, 0.32f, -0.08f, 0.48f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFB1DFF9), 1.0f to Color(0xFFFFFFFF), start =
                    Offset(600.6f,544.19f), end = Offset(588.78f,465.13f)), stroke = null, fillAlpha
                    = 0.7f, strokeAlpha = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(613.42f, 462.0f)
                curveToRelative(-12.24f, 0.0f, -22.17f, 11.18f, -22.17f, 25.0f)
                curveToRelative(0.0f, 0.83f, 0.0f, 1.65f, 0.11f, 2.47f)
                arcToRelative(11.78f, 11.78f, 0.0f, false, false, -5.0f, 5.14f)
                arcToRelative(31.72f, 31.72f, 0.0f, false, false, -15.78f, -3.93f)
                curveToRelative(-13.09f, 0.0f, -23.72f, 7.0f, -23.72f, 15.55f)
                arcToRelative(10.61f, 10.61f, 0.0f, false, false, 0.75f, 3.9f)
                curveToRelative(-8.67f, 2.79f, -14.75f, 9.34f, -14.75f, 17.0f)
                arcToRelative(15.27f, 15.27f, 0.0f, false, false, 3.47f, 9.52f)
                arcToRelative(5.57f, 5.57f, 0.0f, false, false, -1.92f, 4.0f)
                arcToRelative(4.63f, 4.63f, 0.0f, false, false, 0.22f, 1.38f)
                curveTo(523.11f, 535.84f, 515.0f, 545.0f, 515.0f, 547.49f)
                curveToRelative(-8.44f, -3.0f, -21.25f, 15.26f, -2.57f, 15.26f)
                curveToRelative(10.23f, 0.0f, 54.52f, -0.42f, 60.73f, -1.72f)
                curveToRelative(10.0f, 1.33f, 23.82f, -7.4f, 37.52f, -7.4f)
                curveToRelative(32.21f, 0.0f, 58.34f, -4.4f, 58.34f, -9.83f)
                arcToRelative(2.09f, 2.09f, 0.0f, false, false, -0.46f, -1.23f)
                curveToRelative(18.09f, -0.8f, 30.8f, -2.7f, 30.8f, -4.9f)
                curveToRelative(0.0f, -1.94f, -9.8f, -3.64f, -24.43f, -4.57f)
                arcToRelative(16.16f, 16.16f, 0.0f, false, false, 4.2f, -10.58f)
                curveToRelative(0.0f, -11.0f, -12.46f, -20.0f, -28.06f, -20.44f)
                curveToRelative(-0.61f, -7.7f, -7.0f, -14.0f, -15.51f, -15.86f)
                curveTo(635.25f, 472.76f, 625.45f, 462.0f, 613.42f, 462.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFBEE2F9), 1.0f to Color(0xFFFFFFFF), start =
                    Offset(146.01f,195.21f), end = Offset(130.59f,125.48f)), stroke = null,
                    fillAlpha = 0.7f, strokeAlpha = 0.7f, strokeLineWidth = 0.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(0.0f, 162.72f)
                arcToRelative(21.53f, 21.53f, 0.0f, false, true, 16.92f, -0.66f)
                curveTo(17.34f, 152.56f, 24.2f, 145.0f, 32.6f, 145.0f)
                curveToRelative(7.74f, 0.0f, 14.17f, 6.42f, 15.46f, 14.87f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, 3.86f, 0.86f)
                arcToRelative(21.76f, 21.76f, 0.0f, false, true, -0.14f, -2.44f)
                curveToRelative(0.0f, -12.09f, 9.53f, -21.89f, 21.29f, -21.89f)
                arcTo(20.71f, 20.71f, 0.0f, false, true, 84.0f, 139.5f)
                curveToRelative(-0.07f, -0.76f, -0.11f, -1.54f, -0.11f, -2.32f)
                curveToRelative(0.0f, -14.25f, 11.88f, -25.8f, 26.52f, -25.8f)
                arcToRelative(26.79f, 26.79f, 0.0f, false, true, 19.36f, 8.18f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 3.0f, -0.36f)
                curveToRelative(6.27f, 0.0f, 11.53f, 4.76f, 12.9f, 11.15f)
                arcToRelative(25.21f, 25.21f, 0.0f, false, true, 11.17f, -2.55f)
                curveToRelative(9.78f, 0.0f, 18.07f, 5.34f, 20.92f, 12.73f)
                arcToRelative(24.54f, 24.54f, 0.0f, false, true, 7.0f, -1.0f)
                arcToRelative(24.86f, 24.86f, 0.0f, false, true, 3.14f, 0.19f)
                arcToRelative(21.84f, 21.84f, 0.0f, false, true, 21.28f, -15.83f)
                curveToRelative(10.75f, 0.0f, 19.7f, 7.41f, 21.61f, 17.21f)
                arcToRelative(13.3f, 13.3f, 0.0f, false, true, 8.75f, 12.5f)
                arcToRelative(13.88f, 13.88f, 0.0f, false, true, -0.14f, 2.0f)
                curveToRelative(4.21f, 2.61f, 7.14f, 5.57f, 8.45f, 8.76f)
                arcToRelative(25.7f, 25.7f, 0.0f, false, true, 5.29f, -0.54f)
                curveToRelative(6.89f, 0.0f, 12.78f, 2.63f, 15.21f, 6.35f)
                curveToRelative(14.18f, 2.6f, 23.52f, 7.0f, 23.52f, 12.0f)
                curveToRelative(0.0f, 8.0f, -23.75f, 14.47f, -53.0f, 14.47f)
                arcToRelative(174.76f, 174.76f, 0.0f, false, true, -25.49f, -1.78f)
                curveToRelative(-3.91f, 7.14f, -38.49f, 12.73f, -80.57f, 12.73f)
                curveToRelative(-22.8f, 0.0f, -43.39f, -1.64f, -58.1f, -4.28f)
                curveToRelative(-8.25f, 3.92f, -25.69f, 6.62f, -45.87f, 6.62f)
                arcTo(187.68f, 187.68f, 0.0f, false, true, 0.0f, 207.85f)
                close()
            }
        }
        .build()
        return _bgP!!
    }

private var _bgP: ImageVector? = null
