package com.mshdabiola.ludo.screen.game.component.head

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.mshdabiola.ludo.screen.game.component.head.Head

fun Head.getRed(iconColor:Long, accentColor:Long): ImageVector
{
    return Builder(name = "Red5", defaultWidth = 200.0.dp, defaultHeight = 200.0.dp,
                viewportWidth = 200.0f, viewportHeight = 200.0f).apply {
            path(fill = SolidColor(Color(iconColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(83.22f, 160.9f)
                curveToRelative(2.76f, -0.25f, 5.26f, 1.75f, 7.76f, 0.5f)
                curveToRelative(3.25f, -1.25f, 7.75f, -0.25f, 10.0f, -3.5f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, 1.25f, -3.5f)
                curveToRelative(2.75f, 0.5f, 6.0f, 0.5f, 8.26f, -1.49f)
                curveToRelative(0.74f, 0.0f, 1.24f, -1.25f, 2.0f, -0.5f)
                curveToRelative(1.26f, -0.5f, 2.25f, 0.5f, 3.25f, 1.25f)
                arcToRelative(23.59f, 23.59f, 0.0f, false, false, 11.0f, 4.24f)
                curveToRelative(2.76f, 0.26f, 5.51f, -1.25f, 8.0f, -1.0f)
                arcToRelative(3.17f, 3.17f, 0.0f, false, false, 1.5f, -0.25f)
                arcToRelative(24.7f, 24.7f, 0.0f, false, true, -0.75f, -3.74f)
                arcToRelative(29.39f, 29.39f, 0.0f, false, false, 7.75f, -6.0f)
                curveToRelative(9.25f, 1.5f, 18.25f, -4.24f, 21.25f, -8.74f)
                curveToRelative(1.26f, -2.0f, 3.75f, -3.49f, 3.25f, -4.49f)
                arcToRelative(2.68f, 2.68f, 0.0f, false, true, -1.24f, -0.25f)
                curveToRelative(3.24f, -2.25f, 7.5f, -3.25f, 10.25f, -6.0f)
                curveToRelative(4.0f, -4.24f, 8.0f, -5.49f, 8.75f, -6.49f)
                curveToRelative(0.0f, -0.25f, 0.0f, -1.75f, -7.5f, -2.24f)
                curveToRelative(2.5f, -0.51f, 18.26f, -5.25f, 22.0f, -11.25f)
                curveToRelative(-0.49f, -2.49f, -9.76f, 2.51f, -16.5f, -3.0f)
                curveToRelative(0.25f, -2.0f, 2.75f, -3.25f, 2.5f, -5.24f)
                curveToRelative(-7.51f, 1.74f, -11.51f, 1.0f, -15.0f, -0.26f)
                arcToRelative(53.11f, 53.11f, 0.0f, false, false, -11.0f, -1.5f)
                curveToRelative(1.75f, -2.75f, 8.24f, -6.24f, 8.24f, -6.74f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -12.74f, -3.24f)
                curveToRelative(-3.51f, 0.0f, -9.26f, -2.25f, -9.76f, -3.0f)
                arcToRelative(7.33f, 7.33f, 0.0f, false, true, 4.0f, -2.75f)
                curveToRelative(0.0f, -0.75f, -1.0f, -1.25f, -1.5f, -1.5f)
                curveToRelative(-5.26f, -1.75f, -10.0f, -5.24f, -15.5f, -6.74f)
                arcToRelative(23.5f, 23.5f, 0.0f, false, true, 7.5f, -1.75f)
                curveTo(139.0f, 62.25f, 121.0f, 54.0f, 106.73f, 61.5f)
                curveToRelative(2.0f, -3.24f, 4.75f, -5.5f, 7.0f, -8.24f)
                curveToRelative(-1.76f, -4.0f, -14.0f, -2.24f, -18.52f, -1.25f)
                curveToRelative(1.76f, -1.74f, 7.0f, -3.74f, 7.0f, -4.0f)
                curveToRelative(-0.5f, -2.5f, -18.26f, -4.25f, -25.76f, -2.0f)
                arcToRelative(40.65f, 40.65f, 0.0f, false, true, 10.75f, -6.74f)
                reflectiveCurveToRelative(-12.0f, -6.5f, -29.25f, 5.49f)
                arcToRelative(8.31f, 8.31f, 0.0f, false, true, 2.75f, -4.0f)
                curveToRelative(-20.51f, 3.25f, -27.25f, 15.0f, -30.26f, 20.0f)
                arcToRelative(5.89f, 5.89f, 0.0f, false, true, 0.25f, -5.0f)
                curveTo(26.46f, 55.0f, 17.2f, 72.49f, 17.46f, 75.0f)
                curveToRelative(-1.0f, -1.25f, -1.0f, -2.5f, -0.75f, -4.49f)
                curveTo(10.46f, 73.0f, 8.45f, 84.73f, 8.45f, 84.73f)
                curveTo(8.0f, 84.0f, 7.46f, 83.0f, 6.2f, 83.0f)
                curveTo(4.0f, 87.48f, 3.46f, 96.21f, 4.7f, 102.46f)
                arcToRelative(7.61f, 7.61f, 0.0f, false, true, -4.49f, -1.25f)
                curveToRelative(-1.0f, 2.0f, 1.75f, 17.0f, 5.75f, 21.0f)
                curveToRelative(-1.0f, 0.0f, -3.25f, -1.25f, -4.75f, -2.5f)
                curveToRelative(-2.76f, 5.0f, 8.75f, 17.0f, 14.0f, 19.48f)
                curveToRelative(-3.0f, 0.75f, -6.5f, 0.25f, -9.5f, 1.0f)
                curveToRelative(-0.26f, 1.0f, 10.25f, 6.74f, 15.25f, 8.0f)
                arcToRelative(19.59f, 19.59f, 0.0f, false, false, -3.5f, 1.25f)
                curveToRelative(3.0f, 1.75f, 12.5f, 6.75f, 22.0f, 2.0f)
                arcToRelative(8.07f, 8.07f, 0.0f, false, false, 1.76f, 6.75f)
                curveToRelative(1.24f, -0.26f, 2.25f, -1.76f, 3.49f, -2.25f)
                curveToRelative(0.0f, 0.0f, 0.0f, 1.24f, 0.75f, 1.5f)
                arcToRelative(17.57f, 17.57f, 0.0f, false, true, 6.25f, -5.5f)
                reflectiveCurveToRelative(-3.0f, 7.24f, -1.5f, 9.74f)
                curveToRelative(4.0f, -4.0f, 8.76f, -8.49f, 14.26f, -9.74f)
                arcToRelative(7.18f, 7.18f, 0.0f, false, false, -0.75f, 4.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -1.75f, 7.51f, -2.5f)
                curveToRelative(0.75f, 0.0f, 3.25f, 7.24f, 7.24f, 8.74f)
                curveToRelative(2.0f, 1.0f, 3.25f, -0.5f, 4.75f, -1.25f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(62.47f, 146.91f)
                curveToRelative(0.75f, -0.5f, 1.25f, -0.5f, 1.75f, -1.0f)
                curveToRelative(0.75f, 0.24f, 1.25f, 1.0f, 1.75f, 1.24f)
                verticalLineToRelative(0.26f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.5f, -0.51f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(83.47f, 157.65f)
                curveToRelative(-0.25f, 0.25f, -0.74f, 0.25f, -1.24f, 0.51f)
                curveToRelative(-1.26f, 0.49f, -1.75f, 1.74f, -3.0f, 2.0f)
                curveToRelative(-1.0f, -1.5f, 3.0f, -2.5f, 4.25f, -2.5f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.48f, 155.41f)
                curveToRelative(-0.51f, -1.5f, -2.0f, -2.75f, -1.76f, -4.5f)
                arcToRelative(20.15f, 20.15f, 0.0f, false, true, 2.0f, -3.0f)
                lineToRelative(0.24f, 0.25f)
                lineToRelative(-1.0f, 2.0f)
                curveToRelative(-0.24f, 2.0f, 1.51f, 3.5f, 2.76f, 4.74f)
                curveToRelative(0.49f, 0.25f, 1.49f, 0.25f, 1.74f, 1.0f)
                curveToRelative(-1.25f, 0.0f, -3.0f, 0.49f, -4.0f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(85.0f, 159.65f)
                curveToRelative(0.51f, -0.75f, 1.26f, -1.0f, 1.76f, -1.75f)
                curveToRelative(2.0f, -2.25f, 5.0f, 0.26f, 7.25f, -0.49f)
                arcToRelative(32.23f, 32.23f, 0.0f, false, true, 5.0f, -0.26f)
                curveToRelative(-2.5f, 3.5f, -6.5f, 1.75f, -9.75f, 3.25f)
                curveToRelative(-1.5f, 0.5f, -2.76f, -0.5f, -4.26f, -0.75f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 127.93f)
                curveToRelative(0.5f, -0.74f, 1.25f, -2.25f, -1.0f, -3.0f)
                curveToRelative(0.25f, -0.5f, 1.0f, -0.75f, 1.0f, -1.25f)
                curveToRelative(1.5f, 1.25f, 2.0f, 4.24f, 2.0f, 4.24f)
                arcToRelative(2.66f, 2.66f, 0.0f, false, true, -2.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(71.47f, 151.66f)
                curveToRelative(-2.75f, -3.5f, -7.25f, -9.49f, -10.5f, -8.49f)
                curveToRelative(-1.5f, 0.25f, -1.5f, 3.0f, -1.75f, 2.75f)
                arcToRelative(4.89f, 4.89f, 0.0f, false, true, -1.5f, -0.75f)
                curveToRelative(-3.25f, -3.25f, -6.51f, -7.5f, -10.0f, -10.74f)
                curveToRelative(-1.51f, -2.0f, -3.5f, -3.5f, -4.51f, -5.75f)
                curveToRelative(0.26f, -2.25f, 3.25f, -0.75f, 3.75f, -2.49f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, false, -1.24f, -2.25f)
                curveToRelative(2.75f, -2.25f, 4.25f, -5.0f, 7.25f, -7.0f)
                curveToRelative(2.75f, 0.25f, 5.0f, -1.0f, 7.0f, -2.49f)
                curveToRelative(2.25f, -2.0f, 5.76f, -1.0f, 8.25f, 0.0f)
                curveTo(73.72f, 116.0f, 78.72f, 113.0f, 84.0f, 112.0f)
                curveToRelative(2.0f, 0.25f, 4.51f, -0.25f, 6.26f, 0.5f)
                curveToRelative(5.0f, 0.5f, 10.75f, -0.5f, 15.5f, 1.25f)
                curveToRelative(1.75f, 1.0f, 3.75f, 1.75f, 5.0f, 3.24f)
                curveToRelative(-2.75f, 1.25f, -5.5f, 2.51f, -8.5f, 3.75f)
                curveToRelative(-4.5f, 1.25f, -8.25f, 4.25f, -13.25f, 4.5f)
                curveToRelative(-4.0f, 0.24f, -7.76f, -0.75f, -11.75f, 0.24f)
                curveToRelative(-2.26f, 0.76f, -4.26f, 2.25f, -6.51f, 3.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.75f, -0.74f)
                arcToRelative(5.79f, 5.79f, 0.0f, false, false, -1.0f, -4.5f)
                curveToRelative(-1.24f, -1.25f, -2.25f, -3.75f, -4.5f, -3.5f)
                curveToRelative(-1.25f, 1.75f, -1.25f, 4.0f, -2.75f, 5.49f)
                curveToRelative(-1.0f, 1.51f, 1.75f, 3.0f, -0.75f, 4.0f)
                curveToRelative(-1.25f, 0.5f, -2.51f, -0.25f, -3.75f, -0.5f)
                curveToRelative(-0.25f, -0.5f, -1.0f, -0.5f, -0.75f, 0.5f)
                curveToRelative(1.0f, 2.0f, 5.0f, 2.75f, 6.0f, 1.5f)
                curveToRelative(1.49f, -1.75f, 4.25f, -0.5f, 6.0f, -1.0f)
                curveToRelative(0.74f, 2.0f, 3.49f, 0.0f, 4.24f, 2.25f)
                arcToRelative(11.84f, 11.84f, 0.0f, false, false, 7.51f, 6.74f)
                curveToRelative(2.0f, 1.25f, 2.25f, 3.5f, 2.5f, 5.25f)
                curveToRelative(-2.0f, 0.0f, -1.51f, 1.5f, -1.51f, 1.5f)
                curveToRelative(0.51f, 2.0f, -2.0f, 3.0f, -2.0f, 5.0f)
                arcToRelative(7.14f, 7.14f, 0.0f, false, false, 0.74f, 4.0f)
                curveToRelative(0.75f, 1.75f, -0.49f, 3.0f, -0.49f, 4.5f)
                curveToRelative(-3.0f, -2.0f, -4.0f, -5.0f, -6.0f, -7.74f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.22f, 130.43f)
                reflectiveCurveToRelative(3.5f, -1.75f, 11.75f, -3.24f)
                arcToRelative(33.47f, 33.47f, 0.0f, false, true, 5.0f, 0.0f)
                curveToRelative(1.0f, -0.51f, 1.75f, -0.51f, 2.75f, -1.0f)
                curveToRelative(-2.5f, 1.74f, -2.75f, 2.24f, -2.75f, 2.24f)
                curveToRelative(-3.25f, 2.5f, -7.5f, 2.0f, -11.26f, 3.25f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, true, -5.5f, -1.25f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(105.73f, 147.42f)
                lineToRelative(0.24f, 1.74f)
                curveToRelative(-0.24f, 1.5f, -1.49f, 1.5f, -2.49f, 1.75f)
                lineToRelative(2.25f, -3.49f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.23f, 153.16f)
                curveToRelative(2.0f, -1.5f, 6.5f, -2.5f, 6.5f, -2.5f)
                curveToRelative(-0.5f, -0.25f, -0.5f, 0.0f, -1.0f, 0.0f)
                curveToRelative(-0.5f, -0.25f, -1.49f, 0.0f, -1.75f, -0.75f)
                curveToRelative(0.75f, -0.75f, 2.0f, -0.75f, 2.75f, -1.5f)
                curveToRelative(-0.5f, -0.5f, -1.25f, -0.25f, -1.25f, -1.0f)
                curveToRelative(0.25f, -0.51f, 0.75f, -0.51f, 1.0f, -0.75f)
                curveToRelative(-0.26f, -0.51f, -0.51f, -0.26f, -0.76f, -0.51f)
                curveToRelative(0.0f, -0.5f, 0.76f, -0.5f, 1.0f, -1.0f)
                lineToRelative(-0.24f, -0.26f)
                arcToRelative(8.27f, 8.27f, 0.0f, false, true, -5.51f, 0.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.5f, -1.24f)
                arcToRelative(4.84f, 4.84f, 0.0f, false, true, 2.0f, -1.0f)
                curveToRelative(1.25f, -1.25f, 3.5f, -1.25f, 4.5f, -2.5f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, true, 2.25f, 0.5f)
                curveToRelative(-2.5f, 2.5f, -2.25f, 6.0f, -2.5f, 9.24f)
                arcToRelative(2.57f, 2.57f, 0.0f, false, true, -1.5f, 1.75f)
                arcToRelative(9.72f, 9.72f, 0.0f, false, true, -3.5f, 2.0f)
                arcToRelative(3.07f, 3.07f, 0.0f, false, true, -2.5f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(106.23f, 137.92f)
                curveToRelative(0.25f, -0.75f, 0.5f, -1.0f, 1.25f, -1.0f)
                curveToRelative(1.0f, 0.25f, 2.25f, 0.25f, 2.75f, 1.25f)
                curveToRelative(-1.5f, 1.0f, -2.5f, 2.25f, -4.0f, 2.75f)
                arcToRelative(11.54f, 11.54f, 0.0f, false, true, 0.0f, -3.0f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(55.0f, 148.16f)
                curveToRelative(-2.25f, -0.25f, -10.75f, 1.25f, -13.51f, 6.0f)
                curveToRelative(-2.0f, -5.49f, 2.26f, -13.24f, 2.26f, -13.24f)
                curveToRelative(-3.25f, -0.75f, -5.76f, 9.0f, -16.26f, 6.5f)
                arcToRelative(18.12f, 18.12f, 0.0f, false, false, 3.25f, -3.0f)
                curveToRelative(0.0f, -1.51f, -10.75f, 2.0f, -18.0f, -2.5f)
                curveToRelative(7.75f, -0.25f, 8.25f, -1.75f, 8.25f, -1.75f)
                curveToRelative(-4.74f, -3.74f, -10.5f, -7.74f, -13.75f, -13.0f)
                curveToRelative(2.75f, 0.74f, 6.74f, -0.25f, 7.74f, -1.51f)
                curveToRelative(-1.24f, -0.74f, -10.74f, -9.49f, -10.74f, -17.72f)
                arcToRelative(9.63f, 9.63f, 0.0f, false, false, 6.25f, 2.74f)
                curveTo(9.45f, 108.2f, 6.0f, 99.0f, 7.0f, 89.22f)
                arcToRelative(21.64f, 21.64f, 0.0f, false, false, 4.51f, 3.0f)
                curveToRelative(-0.5f, -6.74f, 0.24f, -12.0f, 3.49f, -15.48f)
                curveToRelative(-2.0f, 9.49f, 5.0f, 13.48f, 5.51f, 12.74f)
                curveTo(20.0f, 86.73f, 21.0f, 76.74f, 30.71f, 70.0f)
                curveToRelative(-3.49f, 10.73f, -1.24f, 15.23f, -1.24f, 15.23f)
                curveToRelative(1.49f, 0.5f, 5.74f, -7.49f, 6.49f, -9.49f)
                curveToRelative(2.0f, -5.5f, 7.51f, -10.24f, 12.51f, -13.49f)
                curveToRelative(-3.25f, 12.0f, -1.0f, 12.49f, -1.0f, 12.49f)
                curveToRelative(3.49f, -4.74f, 9.0f, -5.0f, 14.0f, -5.0f)
                curveToRelative(-4.26f, 2.0f, -5.25f, 4.25f, -6.75f, 7.25f)
                arcToRelative(28.5f, 28.5f, 0.0f, false, false, -9.26f, 0.75f)
                arcToRelative(11.71f, 11.71f, 0.0f, false, false, -7.75f, 6.74f)
                curveToRelative(-2.25f, 8.49f, 2.0f, 11.24f, 3.26f, 12.0f)
                curveToRelative(-1.76f, -8.75f, 3.25f, -12.74f, 5.24f, -14.0f)
                curveToRelative(3.0f, -2.0f, 7.25f, -3.0f, 10.76f, -1.5f)
                arcToRelative(3.09f, 3.09f, 0.0f, false, true, -0.51f, 2.5f)
                curveTo(55.0f, 85.48f, 53.0f, 84.73f, 51.0f, 85.23f)
                curveToRelative(-3.49f, 1.0f, -7.49f, 5.0f, -4.5f, 8.0f)
                curveToRelative(0.76f, -2.0f, 2.25f, -3.0f, 3.26f, -3.0f)
                curveToRelative(-0.25f, 1.5f, -2.5f, 4.75f, -0.5f, 5.24f)
                curveToRelative(0.5f, -2.0f, 2.25f, -3.0f, 3.5f, -4.74f)
                lineTo(54.47f, 89.0f)
                curveToRelative(-0.5f, 3.0f, 0.25f, 3.0f, 0.25f, 3.0f)
                curveToRelative(1.25f, 0.25f, 2.75f, -4.49f, 2.75f, -4.49f)
                curveToRelative(1.0f, -2.5f, 4.25f, -4.25f, 5.24f, -7.25f)
                curveToRelative(1.0f, -2.75f, 6.51f, -7.24f, 10.0f, -8.0f)
                curveToRelative(-1.25f, 1.5f, -3.75f, 6.5f, -2.75f, 7.0f)
                curveToRelative(0.5f, 0.0f, 8.75f, -6.49f, 17.25f, -8.24f)
                arcToRelative(27.85f, 27.85f, 0.0f, false, true, 6.25f, -1.0f)
                arcToRelative(11.79f, 11.79f, 0.0f, false, false, -4.75f, 6.24f)
                curveToRelative(1.0f, 0.75f, 9.76f, -3.75f, 12.76f, -5.5f)
                curveToRelative(8.0f, -5.0f, 20.25f, -3.49f, 23.0f, -2.0f)
                curveTo(122.0f, 69.0f, 118.23f, 70.0f, 117.0f, 71.49f)
                curveTo(127.49f, 76.74f, 131.48f, 82.0f, 131.48f, 82.0f)
                curveToRelative(3.0f, 3.5f, 4.76f, 3.75f, 5.5f, 3.75f)
                curveToRelative(-0.74f, 3.49f, 2.76f, 6.0f, 4.51f, 8.49f)
                arcToRelative(15.21f, 15.21f, 0.0f, false, false, 10.25f, 3.24f)
                curveToRelative(-7.0f, 4.0f, -7.5f, 8.25f, -5.5f, 10.5f)
                curveToRelative(2.5f, 2.49f, 5.25f, 4.49f, 7.5f, 7.24f)
                curveToRelative(2.0f, 1.74f, 4.76f, 0.75f, 7.26f, 1.5f)
                curveToRelative(-5.26f, 5.24f, 5.25f, 10.24f, 5.25f, 10.24f)
                curveToRelative(-8.5f, 6.0f, -14.51f, 7.23f, -15.76f, 7.49f)
                curveToRelative(-0.5f, 2.0f, 5.76f, 3.0f, 8.0f, 3.49f)
                curveToRelative(-3.25f, 1.75f, -6.25f, 4.25f, -9.76f, 5.25f)
                curveToRelative(-4.0f, 0.5f, -11.76f, 1.74f, -13.25f, -1.25f)
                curveToRelative(0.0f, -1.25f, 1.24f, -5.0f, 0.0f, -3.5f)
                reflectiveCurveToRelative(-3.0f, 4.25f, -6.0f, 5.5f)
                curveToRelative(-0.25f, 2.49f, 6.25f, 1.0f, 9.5f, 1.5f)
                curveToRelative(-2.26f, 1.49f, -4.0f, 3.74f, -9.26f, 5.0f)
                arcToRelative(26.35f, 26.35f, 0.0f, false, false, 3.0f, 4.0f)
                curveToRelative(-5.25f, 2.0f, -11.51f, 0.5f, -16.75f, -2.24f)
                curveToRelative(-4.26f, -2.25f, 0.75f, -7.49f, -0.75f, -8.74f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 4.0f, -5.5f)
                curveToRelative(1.49f, -1.49f, -5.76f, -8.74f, -10.76f, -8.0f)
                curveToRelative(-2.25f, 0.75f, -3.25f, 3.5f, -3.75f, 5.75f)
                curveToRelative(-0.5f, 3.0f, -0.25f, 7.0f, -1.5f, 10.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.25f, 2.24f)
                curveToRelative(-2.25f, 1.0f, -2.25f, 3.5f, -5.25f, 4.75f)
                curveToRelative(-5.26f, 2.0f, -8.75f, 0.5f, -10.26f, -1.5f)
                curveToRelative(-0.74f, -1.75f, -2.0f, -3.25f, -2.24f, -5.25f)
                arcToRelative(12.19f, 12.19f, 0.0f, false, false, -0.75f, -6.0f)
                curveToRelative(1.0f, -1.25f, 1.5f, -3.0f, 3.0f, -4.24f)
                arcToRelative(38.87f, 38.87f, 0.0f, false, true, 9.0f, -4.75f)
                curveToRelative(6.76f, -2.5f, 14.77f, -9.74f, 22.26f, -3.5f)
                curveToRelative(1.25f, 0.75f, 1.75f, 3.25f, 3.51f, 3.0f)
                curveToRelative(2.25f, -0.5f, 6.25f, -6.0f, 10.0f, -7.24f)
                curveToRelative(0.0f, 0.0f, 0.75f, 3.0f, -1.5f, 8.24f)
                curveToRelative(3.74f, -0.5f, 6.5f, -5.0f, 6.5f, -5.0f)
                curveToRelative(-0.75f, -1.0f, -2.0f, -0.25f, -2.76f, -0.49f)
                curveToRelative(0.26f, -2.0f, 0.26f, -6.25f, -1.0f, -7.0f)
                curveToRelative(-9.0f, 3.25f, -15.24f, -1.0f, -15.24f, -1.0f)
                curveTo(112.0f, 116.0f, 99.0f, 103.0f, 90.48f, 102.46f)
                curveToRelative(1.0f, -1.0f, 2.24f, -1.75f, 3.0f, -3.0f)
                curveToRelative(3.51f, -2.24f, 14.0f, -5.0f, 13.76f, -5.24f)
                curveToRelative(-3.0f, -0.5f, -6.0f, 0.25f, -9.0f, 0.75f)
                curveToRelative(-8.24f, 1.24f, -14.75f, 6.74f, -21.49f, 12.0f)
                arcToRelative(19.63f, 19.63f, 0.0f, false, true, -8.26f, 3.25f)
                curveToRelative(-4.25f, 1.25f, -8.25f, -2.49f, -12.0f, 0.5f)
                curveToRelative(-4.49f, 3.5f, -7.75f, 8.75f, -12.0f, 12.0f)
                curveToRelative(-1.26f, 0.5f, -2.25f, 0.5f, -3.0f, 1.5f)
                curveToRelative(-0.24f, 0.25f, -0.49f, 1.0f, 0.0f, 1.24f)
                curveToRelative(0.51f, 0.51f, -0.49f, 3.0f, 0.25f, 4.5f)
                curveToRelative(3.25f, 6.5f, 9.5f, 10.24f, 13.76f, 16.0f)
                curveToRelative(0.75f, 1.0f, 2.25f, 2.75f, 3.75f, 2.24f)
                curveToRelative(0.25f, 0.51f, 0.0f, 0.75f, 0.25f, 1.0f)
                curveToRelative(0.75f, 0.0f, 1.0f, -0.49f, 1.25f, -1.0f)
                curveToRelative(2.0f, 0.25f, 3.5f, 0.0f, 5.0f, 0.75f)
                curveTo(61.0f, 149.66f, 57.0f, 152.16f, 53.0f, 154.66f)
                curveToRelative(-0.51f, -0.75f, 2.0f, -4.0f, 2.0f, -6.5f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(114.23f, 136.17f)
                arcToRelative(7.76f, 7.76f, 0.0f, false, false, -5.0f, -3.24f)
                horizontalLineToRelative(1.0f)
                curveToRelative(2.0f, -0.25f, 6.75f, 3.5f, 6.75f, 3.5f)
                lineToRelative(-2.25f, 2.0f)
                curveToRelative(-1.25f, -0.25f, 0.0f, -1.5f, -0.5f, -2.25f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(60.72f, 136.17f)
                curveToRelative(-2.25f, -3.0f, -6.0f, -3.49f, -9.0f, -5.0f)
                curveToRelative(-0.5f, 0.0f, -1.0f, -0.75f, -1.5f, -0.25f)
                curveToRelative(0.0f, 1.0f, 1.26f, 1.5f, 2.0f, 2.0f)
                curveToRelative(1.75f, 1.0f, 2.75f, 2.75f, 4.5f, 3.5f)
                arcToRelative(29.63f, 29.63f, 0.0f, false, true, 6.25f, 4.0f)
                curveToRelative(-0.26f, -1.5f, -1.5f, -3.0f, -2.25f, -4.25f)
                close()
            }
            path(fill = SolidColor(Color(accentColor)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(58.47f, 119.69f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, true, 4.24f, -0.75f)
                curveToRelative(0.51f, -1.75f, -4.74f, -3.49f, -6.74f, 0.75f)
                curveToRelative(-0.5f, 1.0f, 0.25f, 2.5f, 2.0f, 1.5f)
                arcToRelative(1.11f, 1.11f, 0.0f, false, false, 0.5f, -1.5f)
            }
        }
        .build()
    }

