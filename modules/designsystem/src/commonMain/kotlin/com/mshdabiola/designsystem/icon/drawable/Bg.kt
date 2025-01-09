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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.icon.Drawable

public val Drawable.Bg: ImageVector
    get() {
        if (_bg != null) {
            return _bg!!
        }
        _bg = Builder(
            name = "Bg",
            defaultWidth = 100.0.dp,
            defaultHeight = 221.20834.dp,
            viewportWidth = 723.3f,
            viewportHeight = 1600.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFFa2d2da)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(0.6f, 0.0f)
                horizontalLineToRelative(720.0f)
                verticalLineToRelative(1600.0f)
                horizontalLineToRelative(-720.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF94c124)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(0.6f, 1052.2f)
                horizontalLineToRelative(719.5f)
                verticalLineToRelative(547.8f)
                horizontalLineToRelative(-719.5f)
                close()
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF464B46)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(700.8f, 1115.6f)
                    reflectiveCurveToRelative(-52.5f, 13.8f, -103.9f, 50.9f)
                    curveToRelative(-0.7f, 0.5f, -1.4f, 1.0f, -2.2f, 1.6f)
                    curveToRelative(-29.2f, 21.5f, -57.8f, 50.7f, -76.0f, 89.2f)
                    curveTo(476.2f, 1347.7f, 453.0f, 1421.1f, 381.0f, 1473.8f)
                    curveToRelative(-0.8f, 0.6f, -1.6f, 1.2f, -2.3f, 1.7f)
                    arcTo(297.1f, 297.1f, 0.0f, false, true, 335.0f, 1501.2f)
                    curveToRelative(-75.8f, 36.7f, -245.6f, 60.2f, -323.3f, 92.3f)
                    curveToRelative(-3.3f, 1.3f, -7.0f, 3.0f, -11.1f, 5.0f)
                    verticalLineTo(1440.6f)
                    arcToRelative(234.4f, 234.4f, 0.0f, false, true, 25.1f, -9.2f)
                    curveToRelative(86.5f, -25.8f, 245.2f, -36.4f, 332.7f, -168.8f)
                    curveToRelative(32.2f, -48.6f, 163.8f, -121.5f, 163.8f, -121.5f)
                    lineTo(673.8f, 1113.0f)
                    lineToRelative(8.0f, 0.8f)
                    horizontalLineToRelative(0.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFCBD5CB)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(702.7f, 1115.0f)
                    arcToRelative(332.6f, 332.6f, 0.0f, false, false, -52.1f, 20.5f)
                    curveToRelative(-8.4f, 4.1f, -16.6f, 8.5f, -24.6f, 13.3f)
                    reflectiveCurveToRelative(-15.9f, 9.8f, -23.5f, 15.2f)
                    curveToRelative(-1.9f, 1.3f, -3.8f, 2.8f, -5.7f, 4.1f)
                    reflectiveCurveToRelative(-3.8f, 2.8f, -5.6f, 4.2f)
                    lineToRelative(-5.5f, 4.3f)
                    lineToRelative(-5.3f, 4.5f)
                    curveToRelative(-1.8f, 1.5f, -3.5f, 3.1f, -5.2f, 4.7f)
                    reflectiveCurveToRelative(-3.5f, 3.1f, -5.1f, 4.8f)
                    lineToRelative(-5.0f, 4.9f)
                    lineToRelative(-1.2f, 1.2f)
                    lineToRelative(-1.2f, 1.3f)
                    lineToRelative(-2.4f, 2.6f)
                    arcToRelative(221.2f, 221.2f, 0.0f, false, false, -32.7f, 45.0f)
                    lineToRelative(-0.9f, 1.5f)
                    lineToRelative(-0.8f, 1.6f)
                    lineToRelative(-1.6f, 3.1f)
                    curveToRelative(-1.0f, 2.1f, -2.1f, 4.1f, -3.1f, 6.3f)
                    lineToRelative(-5.9f, 12.7f)
                    curveToRelative(-3.9f, 8.5f, -7.7f, 17.0f, -11.5f, 25.6f)
                    curveToRelative(-7.6f, 17.1f, -15.2f, 34.2f, -23.2f, 51.1f)
                    curveToRelative(-4.1f, 8.4f, -8.2f, 16.9f, -12.6f, 25.1f)
                    reflectiveCurveToRelative(-9.0f, 16.5f, -13.9f, 24.5f)
                    arcToRelative(293.9f, 293.9f, 0.0f, false, true, -33.8f, 45.1f)
                    arcToRelative(261.8f, 261.8f, 0.0f, false, true, -20.3f, 19.7f)
                    curveToRelative(-1.8f, 1.6f, -3.6f, 3.0f, -5.4f, 4.5f)
                    lineToRelative(-2.7f, 2.3f)
                    curveToRelative(-0.9f, 0.7f, -1.9f, 1.4f, -2.8f, 2.2f)
                    lineToRelative(-5.6f, 4.3f)
                    lineToRelative(-5.8f, 4.1f)
                    curveToRelative(-1.9f, 1.4f, -3.9f, 2.7f, -5.9f, 4.0f)
                    reflectiveCurveToRelative(-3.9f, 2.6f, -5.9f, 3.8f)
                    curveToRelative(-4.1f, 2.4f, -8.0f, 4.9f, -12.2f, 7.2f)
                    curveToRelative(-2.1f, 1.1f, -4.1f, 2.3f, -6.2f, 3.4f)
                    lineToRelative(-6.3f, 3.2f)
                    lineToRelative(-3.1f, 1.6f)
                    lineTo(335.0f, 1503.9f)
                    curveToRelative(-2.2f, 1.0f, -4.3f, 2.0f, -6.4f, 2.9f)
                    curveToRelative(-8.6f, 3.8f, -17.5f, 7.0f, -26.4f, 10.1f)
                    reflectiveCurveToRelative(-17.8f, 5.9f, -26.8f, 8.6f)
                    curveToRelative(-18.0f, 5.2f, -36.1f, 10.0f, -54.3f, 14.4f)
                    curveToRelative(-36.4f, 8.8f, -72.9f, 16.8f, -109.3f, 25.3f)
                    curveToRelative(-18.2f, 4.2f, -36.3f, 8.7f, -54.3f, 13.7f)
                    reflectiveCurveToRelative(-35.9f, 10.5f, -53.0f, 18.0f)
                    lineToRelative(-0.2f, -0.4f)
                    lineToRelative(6.4f, -3.0f)
                    curveToRelative(1.1f, -0.5f, 2.1f, -1.0f, 3.2f, -1.5f)
                    lineToRelative(3.3f, -1.4f)
                    curveToRelative(2.2f, -0.9f, 4.3f, -1.8f, 6.5f, -2.6f)
                    reflectiveCurveToRelative(4.4f, -1.7f, 6.6f, -2.5f)
                    curveToRelative(8.8f, -3.2f, 17.7f, -6.1f, 26.7f, -8.9f)
                    curveToRelative(17.9f, -5.4f, 36.0f, -10.3f, 54.1f, -14.9f)
                    reflectiveCurveToRelative(36.3f, -9.0f, 54.5f, -13.4f)
                    reflectiveCurveToRelative(36.3f, -8.8f, 54.5f, -13.4f)
                    reflectiveCurveToRelative(36.2f, -9.3f, 54.0f, -14.6f)
                    reflectiveCurveToRelative(35.6f, -11.0f, 52.7f, -18.3f)
                    curveToRelative(2.2f, -0.9f, 4.2f, -1.9f, 6.3f, -2.8f)
                    lineToRelative(3.2f, -1.4f)
                    lineToRelative(3.1f, -1.6f)
                    lineToRelative(6.2f, -3.1f)
                    curveToRelative(2.0f, -1.1f, 4.1f, -2.2f, 6.1f, -3.3f)
                    curveToRelative(4.1f, -2.2f, 8.1f, -4.6f, 12.1f, -6.9f)
                    curveToRelative(2.0f, -1.2f, 3.9f, -2.5f, 5.9f, -3.7f)
                    reflectiveCurveToRelative(3.9f, -2.5f, 5.8f, -3.8f)
                    lineToRelative(5.7f, -4.0f)
                    lineToRelative(5.6f, -4.2f)
                    curveToRelative(0.9f, -0.7f, 1.9f, -1.4f, 2.8f, -2.1f)
                    lineToRelative(2.7f, -2.2f)
                    curveToRelative(1.8f, -1.5f, 3.6f, -2.9f, 5.4f, -4.4f)
                    arcToRelative(258.6f, 258.6f, 0.0f, false, false, 20.1f, -19.2f)
                    arcToRelative(290.0f, 290.0f, 0.0f, false, false, 33.6f, -44.3f)
                    curveToRelative(5.0f, -7.9f, 9.6f, -16.0f, 14.0f, -24.2f)
                    reflectiveCurveToRelative(8.6f, -16.5f, 12.7f, -24.9f)
                    curveToRelative(8.2f, -16.8f, 15.8f, -33.8f, 23.5f, -50.9f)
                    curveToRelative(3.9f, -8.5f, 7.7f, -17.0f, 11.7f, -25.5f)
                    lineToRelative(6.0f, -12.7f)
                    curveToRelative(1.0f, -2.1f, 2.1f, -4.2f, 3.2f, -6.3f)
                    lineToRelative(1.6f, -3.1f)
                    lineToRelative(0.8f, -1.6f)
                    lineToRelative(0.9f, -1.5f)
                    arcToRelative(223.1f, 223.1f, 0.0f, false, true, 33.5f, -45.2f)
                    lineToRelative(2.4f, -2.5f)
                    lineToRelative(1.2f, -1.3f)
                    lineToRelative(1.3f, -1.2f)
                    lineToRelative(5.1f, -4.9f)
                    curveToRelative(1.7f, -1.6f, 3.5f, -3.2f, 5.2f, -4.7f)
                    reflectiveCurveToRelative(3.5f, -3.2f, 5.3f, -4.6f)
                    lineToRelative(5.4f, -4.5f)
                    lineToRelative(5.5f, -4.3f)
                    curveToRelative(1.8f, -1.5f, 3.7f, -2.8f, 5.6f, -4.2f)
                    reflectiveCurveToRelative(3.8f, -2.8f, 5.7f, -4.1f)
                    curveToRelative(7.7f, -5.4f, 15.6f, -10.4f, 23.7f, -15.1f)
                    reflectiveCurveToRelative(16.4f, -9.1f, 24.9f, -13.1f)
                    arcToRelative(332.6f, 332.6f, 0.0f, false, true, 52.4f, -20.1f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFCBD5CB)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(1.3f, 1436.1f)
                    curveToRelative(6.0f, -2.6f, 12.0f, -5.0f, 18.1f, -7.2f)
                    curveToRelative(3.1f, -1.1f, 6.2f, -2.1f, 9.3f, -3.0f)
                    lineToRelative(9.4f, -2.7f)
                    curveToRelative(12.5f, -3.4f, 25.1f, -6.3f, 37.7f, -9.1f)
                    curveToRelative(25.1f, -5.7f, 50.3f, -11.3f, 75.0f, -18.2f)
                    quadToRelative(18.6f, -5.1f, 36.8f, -11.4f)
                    reflectiveQuadToRelative(35.9f, -13.9f)
                    curveToRelative(5.9f, -2.5f, 11.7f, -5.3f, 17.5f, -8.1f)
                    curveToRelative(5.7f, -3.0f, 11.4f, -5.8f, 17.0f, -9.0f)
                    curveToRelative(5.6f, -3.0f, 11.0f, -6.5f, 16.5f, -9.8f)
                    curveToRelative(5.3f, -3.6f, 10.7f, -7.0f, 15.9f, -10.9f)
                    curveToRelative(5.3f, -3.7f, 10.2f, -7.8f, 15.2f, -11.8f)
                    curveToRelative(2.5f, -2.1f, 4.8f, -4.2f, 7.3f, -6.3f)
                    curveToRelative(1.2f, -1.1f, 2.4f, -2.1f, 3.6f, -3.2f)
                    lineToRelative(3.5f, -3.3f)
                    arcTo(283.4f, 283.4f, 0.0f, false, false, 346.0f, 1280.1f)
                    lineToRelative(5.9f, -7.6f)
                    lineToRelative(1.5f, -1.9f)
                    lineToRelative(1.4f, -2.0f)
                    lineToRelative(2.8f, -3.9f)
                    curveToRelative(1.9f, -2.6f, 3.6f, -5.2f, 5.6f, -7.9f)
                    reflectiveCurveToRelative(3.9f, -5.2f, 6.0f, -7.7f)
                    arcToRelative(239.9f, 239.9f, 0.0f, false, true, 28.1f, -26.7f)
                    curveToRelative(20.0f, -16.4f, 41.2f, -31.1f, 62.8f, -45.2f)
                    quadToRelative(16.2f, -10.5f, 32.8f, -20.5f)
                    curveToRelative(11.1f, -6.7f, 22.2f, -13.1f, 33.5f, -19.4f)
                    lineToRelative(0.1f, 0.0f)
                    horizontalLineToRelative(0.1f)
                    lineToRelative(151.7f, -27.6f)
                    lineToRelative(-151.5f, 28.6f)
                    lineToRelative(0.2f, -0.1f)
                    curveToRelative(-11.2f, 6.3f, -22.3f, 12.9f, -33.3f, 19.6f)
                    reflectiveCurveToRelative(-21.9f, 13.6f, -32.7f, 20.7f)
                    curveToRelative(-21.5f, 14.1f, -42.6f, 29.0f, -62.4f, 45.4f)
                    arcToRelative(235.6f, 235.6f, 0.0f, false, false, -27.7f, 26.7f)
                    curveToRelative(-4.1f, 4.9f, -7.6f, 10.2f, -11.3f, 15.5f)
                    lineToRelative(-2.8f, 4.0f)
                    lineToRelative(-1.4f, 2.0f)
                    lineToRelative(-1.5f, 1.9f)
                    lineToRelative(-5.9f, 7.7f)
                    arcToRelative(287.3f, 287.3f, 0.0f, false, true, -26.2f, 28.6f)
                    lineToRelative(-3.5f, 3.4f)
                    curveToRelative(-1.2f, 1.1f, -2.4f, 2.2f, -3.6f, 3.2f)
                    curveToRelative(-2.4f, 2.1f, -4.8f, 4.3f, -7.3f, 6.4f)
                    curveToRelative(-5.1f, 4.0f, -10.0f, 8.2f, -15.3f, 12.0f)
                    curveToRelative(-5.1f, 3.9f, -10.6f, 7.4f, -15.9f, 11.1f)
                    curveToRelative(-5.5f, 3.4f, -10.9f, 6.9f, -16.6f, 10.0f)
                    curveToRelative(-5.6f, 3.3f, -11.4f, 6.2f, -17.1f, 9.2f)
                    curveToRelative(-5.8f, 2.8f, -11.6f, 5.7f, -17.6f, 8.3f)
                    quadToRelative(-17.7f, 7.9f, -36.1f, 14.3f)
                    reflectiveQuadToRelative(-37.0f, 11.7f)
                    curveToRelative(-24.9f, 7.1f, -50.0f, 12.9f, -75.1f, 18.7f)
                    curveToRelative(-12.5f, 3.0f, -25.0f, 5.9f, -37.4f, 9.4f)
                    lineToRelative(-9.2f, 2.7f)
                    quadToRelative(-4.6f, 1.4f, -9.1f, 3.0f)
                    curveToRelative(-6.0f, 2.1f, -11.9f, 4.6f, -17.8f, 7.1f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFCBD5CB)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(1.2f, 1507.0f)
                    curveToRelative(7.2f, -3.3f, 14.5f, -6.4f, 21.9f, -9.1f)
                    curveToRelative(3.7f, -1.4f, 7.5f, -2.6f, 11.2f, -3.8f)
                    reflectiveCurveToRelative(7.6f, -2.3f, 11.4f, -3.2f)
                    lineToRelative(1.0f, 3.8f)
                    curveToRelative(-3.8f, 1.0f, -7.5f, 2.0f, -11.1f, 3.3f)
                    reflectiveCurveToRelative(-7.3f, 2.6f, -10.9f, 4.0f)
                    curveToRelative(-7.2f, 2.8f, -14.3f, 6.1f, -21.3f, 9.5f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFCBD5CB)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(149.5f, 1476.1f)
                    arcToRelative(460.4f, 460.4f, 0.0f, false, false, 51.1f, -10.0f)
                    arcToRelative(290.3f, 290.3f, 0.0f, false, false, 49.0f, -17.4f)
                    lineToRelative(1.2f, 2.6f)
                    arcToRelative(293.2f, 293.2f, 0.0f, false, true, -49.4f, 17.8f)
                    arcTo(462.9f, 462.9f, 0.0f, false, true, 150.0f, 1479.4f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFCBD5CB)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(331.5f, 1386.0f)
                    quadToRelative(8.4f, -9.9f, 15.8f, -20.7f)
                    reflectiveQuadToRelative(13.9f, -22.0f)
                    curveToRelative(2.2f, -3.8f, 4.3f, -7.6f, 6.3f, -11.4f)
                    curveToRelative(1.0f, -1.9f, 2.0f, -3.9f, 3.0f, -5.8f)
                    reflectiveCurveToRelative(2.0f, -3.9f, 3.1f, -5.8f)
                    arcToRelative(143.6f, 143.6f, 0.0f, false, true, 15.5f, -21.2f)
                    lineToRelative(1.3f, 1.1f)
                    arcToRelative(141.9f, 141.9f, 0.0f, false, false, -15.2f, 21.0f)
                    curveToRelative(-1.1f, 1.9f, -2.1f, 3.8f, -3.0f, 5.7f)
                    reflectiveCurveToRelative(-2.0f, 3.9f, -3.0f, 5.8f)
                    curveToRelative(-2.0f, 3.9f, -4.1f, 7.7f, -6.3f, 11.5f)
                    quadToRelative(-6.5f, 11.4f, -13.9f, 22.2f)
                    curveToRelative(-5.0f, 7.2f, -10.3f, 14.2f, -15.9f, 20.9f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFCBD5CB)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(468.4f, 1230.8f)
                    curveToRelative(6.9f, -5.3f, 13.9f, -10.5f, 20.8f, -15.8f)
                    reflectiveCurveToRelative(13.7f, -10.7f, 20.3f, -16.4f)
                    curveToRelative(3.3f, -2.8f, 6.5f, -5.8f, 9.6f, -8.8f)
                    curveToRelative(1.5f, -1.5f, 3.1f, -3.1f, 4.7f, -4.6f)
                    reflectiveCurveToRelative(3.4f, -2.8f, 5.1f, -4.1f)
                    arcToRelative(190.9f, 190.9f, 0.0f, false, true, 22.3f, -13.7f)
                    lineToRelative(0.3f, 0.6f)
                    arcToRelative(190.3f, 190.3f, 0.0f, false, false, -22.1f, 13.8f)
                    curveToRelative(-1.7f, 1.3f, -3.4f, 2.7f, -5.0f, 4.1f)
                    reflectiveCurveToRelative(-3.1f, 3.0f, -4.7f, 4.6f)
                    curveToRelative(-3.1f, 3.1f, -6.3f, 6.0f, -9.6f, 8.9f)
                    curveToRelative(-6.6f, 5.7f, -13.4f, 11.2f, -20.3f, 16.6f)
                    reflectiveCurveToRelative(-13.8f, 10.6f, -20.7f, 15.9f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFCBD5CB)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(647.1f, 1125.7f)
                    curveToRelative(14.6f, -5.5f, 29.4f, -10.9f, 44.2f, -16.0f)
                    quadToRelative(-22.2f, 7.7f, -44.1f, 16.2f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF86a32d)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(80.4f, 949.4f)
                    curveTo(52.8f, 978.0f, 26.8f, 1008.0f, 0.6f, 1038.0f)
                    verticalLineTo(870.0f)
                    curveToRelative(28.8f, 20.8f, 56.3f, 43.5f, 83.0f, 67.1f)
                    curveTo(87.5f, 942.5f, 83.4f, 946.2f, 80.4f, 949.4f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF90af2c)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(0.6f, 1056.8f)
                    curveToRelative(86.7f, 0.9f, 172.9f, 2.0f, 259.6f, 2.6f)
                    lineToRelative(13.5f, 0.1f)
                    curveToRelative(38.7f, 0.2f, 77.4f, 0.5f, 116.1f, 0.5f)
                    lineToRelative(20.7f, 0.0f)
                    lineToRelative(6.2f, 0.0f)
                    horizontalLineToRelative(2.5f)
                    quadToRelative(11.5f, 0.0f, 23.0f, -0.1f)
                    quadToRelative(28.1f, -0.2f, 56.3f, -0.6f)
                    curveToRelative(35.5f, -0.6f, 70.9f, -3.0f, 106.4f, -2.4f)
                    curveToRelative(5.1f, 0.1f, 10.5f, -1.5f, 15.1f, 2.2f)
                    curveToRelative(3.7f, 4.1f, 8.6f, 2.9f, 13.3f, 2.9f)
                    quadToRelative(7.7f, 0.1f, 15.4f, 0.1f)
                    quadToRelative(11.3f, 0.0f, 22.6f, 0.0f)
                    horizontalLineToRelative(3.5f)
                    lineToRelative(5.8f, 0.0f)
                    quadToRelative(10.4f, -0.1f, 20.8f, -0.2f)
                    quadToRelative(9.7f, -0.1f, 19.4f, -0.3f)
                    verticalLineTo(969.9f)
                    curveToRelative(-3.5f, -0.4f, -5.6f, -4.3f, -8.2f, -6.4f)
                    quadToRelative(-8.5f, -6.8f, -17.0f, -13.5f)
                    quadToRelative(-11.5f, -9.2f, -23.1f, -18.3f)
                    curveToRelative(-23.4f, -18.3f, -47.3f, -36.0f, -72.8f, -51.4f)
                    curveToRelative(-17.2f, -10.4f, -31.2f, -8.7f, -46.5f, 3.2f)
                    curveToRelative(-13.2f, 10.2f, -25.7f, 21.0f, -37.7f, 32.4f)
                    quadToRelative(-16.0f, 15.0f, -30.9f, 31.2f)
                    curveToRelative(-6.6f, 7.1f, -11.4f, 9.4f, -19.8f, 2.1f)
                    curveToRelative(-6.8f, -5.9f, -14.8f, -10.3f, -22.4f, -15.1f)
                    curveToRelative(-2.0f, -1.2f, -3.9f, -2.5f, -5.8f, -3.8f)
                    curveToRelative(-12.1f, -8.5f, -23.1f, -8.1f, -34.6f, 0.6f)
                    curveToRelative(-0.5f, 0.4f, -1.0f, 0.7f, -1.4f, 1.1f)
                    curveToRelative(-1.7f, 1.4f, -3.3f, 3.1f, -5.1f, 4.7f)
                    curveToRelative(-3.1f, 2.9f, -6.4f, 5.4f, -11.3f, 5.4f)
                    arcToRelative(38.9f, 38.9f, 0.0f, false, false, -4.0f, 2.1f)
                    curveToRelative(-11.0f, 6.4f, -18.1f, 17.4f, -27.3f, 25.9f)
                    curveToRelative(-13.3f, 12.4f, -13.1f, 12.9f, -27.3f, 0.9f)
                    lineToRelative(-0.4f, -0.4f)
                    curveToRelative(-16.1f, -13.5f, -32.1f, -27.0f, -48.9f, -39.7f)
                    arcToRelative(50.2f, 50.2f, 0.0f, false, false, -5.5f, -3.7f)
                    arcToRelative(24.6f, 24.6f, 0.0f, false, false, -6.9f, -2.8f)
                    curveToRelative(-19.2f, -12.9f, -38.0f, -26.5f, -57.7f, -38.6f)
                    curveToRelative(-30.9f, -19.0f, -35.7f, -18.7f, -63.8f, 4.6f)
                    curveToRelative(-16.4f, 13.6f, -31.5f, 28.8f, -47.1f, 43.2f)
                    curveToRelative(-2.7f, 2.5f, -4.6f, 6.4f, -8.8f, 6.5f)
                    arcToRelative(7.4f, 7.4f, 0.0f, false, true, -1.5f, -0.1f)
                    curveToRelative(-0.3f, 6.5f, -5.8f, 9.4f, -9.5f, 13.6f)
                    curveTo(50.9f, 980.9f, 25.1f, 1008.2f, 0.6f, 1035.4f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF86a32d)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(263.7f, 921.5f)
                    curveToRelative(14.8f, 12.4f, 29.4f, 24.8f, 44.3f, 37.1f)
                    curveToRelative(8.0f, 6.6f, 16.8f, 12.4f, 24.1f, 19.6f)
                    curveToRelative(5.6f, 5.5f, 9.2f, 6.4f, 14.7f, 0.1f)
                    curveToRelative(11.9f, -13.5f, 26.4f, -24.6f, 37.2f, -39.1f)
                    curveToRelative(-17.2f, -13.9f, -36.2f, -25.0f, -55.6f, -35.5f)
                    curveToRelative(-16.9f, -9.1f, -32.3f, -7.6f, -47.2f, 3.8f)
                    curveTo(275.3f, 912.1f, 269.6f, 916.8f, 263.7f, 921.5f)
                    close()
                }
                path(
                    fill = linearGradient(
                        0.0f to Color(0xFFA1D5F4),
                        1.0f to Color(0xFFDAEFFD),
                        start = Offset(114.4f, 428.9f),
                        end = Offset(66.7f, 350.0f),
                    ),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd,
                ) {
                    moveTo(0.6f, 402.9f)
                    curveToRelative(2.1f, 0.0f, 4.4f, 0.1f, 6.8f, 0.2f)
                    curveToRelative(-4.8f, -2.6f, -7.9f, -6.9f, -7.4f, -11.1f)
                    curveToRelative(0.5f, -4.4f, 4.8f, -7.6f, 10.5f, -8.2f)
                    arcToRelative(11.0f, 11.0f, 0.0f, false, true, -0.7f, -5.3f)
                    curveToRelative(1.0f, -8.5f, 12.7f, -13.6f, 26.0f, -11.3f)
                    arcToRelative(37.0f, 37.0f, 0.0f, false, true, 10.4f, 3.4f)
                    curveToRelative(3.0f, -2.5f, 7.7f, -3.8f, 13.0f, -3.1f)
                    arcToRelative(12.3f, 12.3f, 0.0f, false, true, -0.1f, -3.6f)
                    curveTo(60.0f, 356.0f, 68.2f, 351.0f, 77.3f, 352.6f)
                    curveToRelative(0.4f, 0.1f, 0.8f, 0.2f, 1.2f, 0.2f)
                    arcToRelative(22.2f, 22.2f, 0.0f, false, true, 26.0f, -18.4f)
                    arcToRelative(25.2f, 25.2f, 0.0f, false, true, 20.5f, 26.5f)
                    arcToRelative(13.2f, 13.2f, 0.0f, false, true, 8.2f, 5.3f)
                    curveToRelative(2.3f, -10.0f, 13.5f, -16.3f, 26.0f, -14.1f)
                    curveToRelative(13.2f, 2.3f, 22.8f, 13.1f, 21.4f, 24.1f)
                    arcToRelative(16.9f, 16.9f, 0.0f, false, true, -5.3f, 10.4f)
                    curveToRelative(12.5f, 3.0f, 21.6f, 8.5f, 21.1f, 13.0f)
                    curveToRelative(-0.4f, 3.5f, -6.4f, 5.6f, -14.8f, 5.7f)
                    arcToRelative(7.7f, 7.7f, 0.0f, false, true, 0.9f, 4.3f)
                    curveToRelative(-0.8f, 6.6f, -11.7f, 10.7f, -27.9f, 11.6f)
                    curveToRelative(-3.4f, 6.3f, -18.1f, 9.7f, -38.2f, 9.2f)
                    curveToRelative(-5.4f, 1.1f, -13.2f, 1.5f, -22.5f, 1.0f)
                    quadToRelative(-2.8f, 0.1f, -6.0f, 0.0f)
                    arcToRelative(3.1f, 3.1f, 0.0f, false, true, 1.2f, 2.5f)
                    curveToRelative(-0.5f, 4.4f, -17.7f, 5.1f, -38.4f, 1.5f)
                    reflectiveCurveToRelative(-37.0f, -10.1f, -36.5f, -14.5f)
                    arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.2f, -0.7f)
                    curveToRelative(-5.0f, -1.3f, -9.6f, -2.7f, -13.5f, -4.0f)
                }
                path(
                    fill = linearGradient(
                        0.0f to Color(0xFF9FD4F5),
                        1.0f to Color(0xFFEFF8FB),
                        start = Offset(635.4f, 401.1f),
                        end = Offset(596.2f, 277.0f),
                    ),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd,
                ) {
                    moveTo(716.6f, 286.8f)
                    arcToRelative(18.9f, 18.9f, 0.0f, false, false, -9.7f, 2.6f)
                    curveToRelative(-1.0f, -4.2f, -4.1f, -7.3f, -7.8f, -7.3f)
                    curveToRelative(-3.4f, 0.0f, -6.3f, 2.6f, -7.5f, 6.2f)
                    arcToRelative(19.1f, 19.1f, 0.0f, false, false, -6.5f, -1.1f)
                    arcToRelative(19.7f, 19.7f, 0.0f, false, false, -4.6f, 0.6f)
                    arcToRelative(11.8f, 11.8f, 0.0f, false, false, 2.6f, -7.2f)
                    curveToRelative(0.0f, -8.2f, -9.2f, -14.9f, -20.5f, -14.9f)
                    reflectiveCurveTo(642.0f, 272.3f, 642.0f, 280.5f)
                    arcToRelative(12.5f, 12.5f, 0.0f, false, false, 4.1f, 8.9f)
                    lineToRelative(-0.3f, 0.3f)
                    arcToRelative(10.6f, 10.6f, 0.0f, false, false, -6.6f, -2.2f)
                    curveToRelative(-4.8f, 0.0f, -8.9f, 3.0f, -9.4f, 6.8f)
                    arcToRelative(26.1f, 26.1f, 0.0f, false, false, -9.4f, -1.7f)
                    curveToRelative(-11.9f, 0.0f, -21.5f, 7.7f, -21.5f, 17.1f)
                    curveToRelative(0.0f, 5.5f, 3.3f, 10.4f, 8.4f, 13.5f)
                    horizontalLineToRelative(-0.1f)
                    arcToRelative(6.3f, 6.3f, 0.0f, false, false, -6.0f, 3.5f)
                    arcToRelative(12.4f, 12.4f, 0.0f, false, false, -6.1f, -1.6f)
                    curveToRelative(-6.0f, 0.0f, -10.9f, 4.0f, -10.9f, 9.0f)
                    arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.1f, 1.0f)
                    arcToRelative(11.6f, 11.6f, 0.0f, false, false, -2.2f, -0.2f)
                    arcToRelative(11.3f, 11.3f, 0.0f, false, false, -3.0f, 0.4f)
                    arcTo(17.3f, 17.3f, 0.0f, false, false, 566.4f, 330.0f)
                    curveToRelative(-9.2f, 0.0f, -16.7f, 6.8f, -16.7f, 15.3f)
                    arcToRelative(14.5f, 14.5f, 0.0f, false, false, 4.2f, 10.1f)
                    arcToRelative(5.5f, 5.5f, 0.0f, false, false, -2.8f, 3.5f)
                    arcToRelative(4.8f, 4.8f, 0.0f, false, false, -2.5f, -0.7f)
                    arcToRelative(5.3f, 5.3f, 0.0f, false, false, -4.9f, 3.7f)
                    arcToRelative(11.0f, 11.0f, 0.0f, false, false, -5.3f, -1.3f)
                    curveToRelative(-4.8f, 0.0f, -8.6f, 2.8f, -9.1f, 6.3f)
                    curveToRelative(-0.3f, 0.0f, -0.6f, 0.0f, -0.9f, 0.0f)
                    curveToRelative(-5.5f, 0.0f, -10.0f, 3.9f, -10.0f, 8.6f)
                    arcToRelative(8.2f, 8.2f, 0.0f, false, false, 3.7f, 6.7f)
                    curveToRelative(-3.0f, 0.0f, -5.3f, 2.0f, -5.3f, 4.5f)
                    reflectiveCurveToRelative(2.4f, 4.5f, 5.4f, 4.5f)
                    arcToRelative(5.9f, 5.9f, 0.0f, false, false, 3.9f, -1.4f)
                    arcToRelative(5.7f, 5.7f, 0.0f, false, false, 1.2f, 0.8f)
                    curveToRelative(-8.7f, 1.3f, -14.6f, 2.9f, -16.5f, 4.6f)
                    verticalLineToRelative(2.5f)
                    curveToRelative(4.7f, 4.3f, 32.8f, 7.6f, 66.8f, 7.6f)
                    curveToRelative(30.5f, 0.0f, 56.3f, -2.7f, 64.6f, -6.3f)
                    horizontalLineToRelative(2.9f)
                    curveToRelative(42.0f, 0.0f, 64.9f, -1.5f, 78.4f, -3.7f)
                    lineTo(723.3f, 288.0f)
                    arcTo(19.7f, 19.7f, 0.0f, false, false, 716.6f, 286.8f)
                    close()
                    moveTo(527.6f, 386.9f)
                    curveToRelative(0.0f, -0.1f, 0.0f, -0.2f, 0.0f, -0.3f)
                    arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.0f, -0.2f)
                    lineToRelative(0.5f, 0.2f)
                    arcTo(5.1f, 5.1f, 0.0f, false, false, 527.5f, 386.9f)
                    close()
                }
                path(
                    fill = null,
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd,
                ) {
                    moveTo(261.0f, 498.5f)
                    arcToRelative(13.6f, 13.6f, 0.0f, false, true, 11.5f, 5.8f)
                    arcToRelative(4.7f, 4.7f, 0.0f, false, true, 1.0f, -0.1f)
                    arcToRelative(5.3f, 5.3f, 0.0f, false, true, 4.7f, 3.2f)
                    arcTo(16.4f, 16.4f, 0.0f, false, true, 291.0f, 501.7f)
                    curveToRelative(8.6f, 0.0f, 15.6f, 6.0f, 15.6f, 13.4f)
                    arcToRelative(11.4f, 11.4f, 0.0f, false, true, -0.1f, 1.7f)
                    curveToRelative(6.2f, 0.6f, 11.0f, 6.4f, 11.0f, 13.6f)
                    arcToRelative(15.0f, 15.0f, 0.0f, false, true, -0.9f, 5.1f)
                    arcToRelative(8.8f, 8.8f, 0.0f, false, true, 8.2f, 8.6f)
                    arcToRelative(8.6f, 8.6f, 0.0f, false, true, -0.1f, 1.4f)
                    arcToRelative(9.7f, 9.7f, 0.0f, false, true, 4.3f, -1.0f)
                    arcToRelative(9.1f, 9.1f, 0.0f, false, true, 9.3f, 8.8f)
                    quadToRelative(0.0f, 0.3f, 0.0f, 0.6f)
                    curveToRelative(4.8f, 0.7f, 8.1f, 2.0f, 8.1f, 3.5f)
                    curveToRelative(0.0f, 2.0f, -6.0f, 3.7f, -13.6f, 3.9f)
                    arcToRelative(9.8f, 9.8f, 0.0f, false, true, -3.7f, 0.7f)
                    arcToRelative(9.6f, 9.6f, 0.0f, false, true, -4.6f, -1.1f)
                    curveToRelative(-3.5f, -0.5f, -6.2f, -1.3f, -7.5f, -2.3f)
                    curveToRelative(-1.2f, 0.1f, -2.5f, 0.2f, -3.8f, 0.2f)
                    curveToRelative(-8.0f, 0.0f, -14.6f, -2.3f, -15.7f, -5.2f)
                    arcToRelative(76.2f, 76.2f, 0.0f, false, true, -12.2f, 0.9f)
                    curveToRelative(-12.3f, 0.0f, -22.5f, -2.6f, -24.0f, -5.9f)
                    curveToRelative(-2.2f, 0.1f, -4.4f, 0.2f, -6.8f, 0.2f)
                    curveToRelative(-18.3f, 0.0f, -33.2f, -4.5f, -33.2f, -10.0f)
                    curveToRelative(0.0f, -4.0f, 7.6f, -7.4f, 18.5f, -9.0f)
                    arcToRelative(10.1f, 10.1f, 0.0f, false, true, -2.8f, -6.9f)
                    curveToRelative(0.0f, -5.7f, 5.0f, -10.4f, 11.2f, -10.6f)
                    arcToRelative(9.5f, 9.5f, 0.0f, false, true, -0.3f, -2.3f)
                    curveToRelative(0.0f, -6.2f, 5.9f, -11.3f, 13.1f, -11.3f)
                    close()
                    moveTo(260.5f, 521.1f)
                    curveToRelative(-0.2f, 0.0f, -0.4f, 0.0f, -0.6f, 0.0f)
                    curveToRelative(0.0f, 0.2f, 0.1f, 0.3f, 0.1f, 0.5f)
                    close()
                }
                path(
                    fill = linearGradient(
                        0.0f to Color(0xFFBAE3F7),
                        1.0f to Color(0xFFFFFFFF),
                        start = Offset(387.6f, 639.7f),
                        end = Offset(370.6f, 578.3f),
                    ),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd,
                ) {
                    moveTo(406.9f, 582.7f)
                    curveToRelative(-4.9f, 0.0f, -9.1f, 2.2f, -11.4f, 5.4f)
                    arcToRelative(5.1f, 5.1f, 0.0f, false, false, -5.6f, 2.9f)
                    arcToRelative(16.7f, 16.7f, 0.0f, false, false, -12.6f, -5.3f)
                    curveToRelative(-8.5f, 0.0f, -15.3f, 5.5f, -15.3f, 12.4f)
                    arcToRelative(10.9f, 10.9f, 0.0f, false, false, 0.1f, 1.5f)
                    arcTo(12.3f, 12.3f, 0.0f, false, false, 351.2f, 612.0f)
                    arcToRelative(13.0f, 13.0f, 0.0f, false, false, 0.9f, 4.7f)
                    curveToRelative(-4.6f, 0.4f, -8.1f, 3.8f, -8.1f, 7.9f)
                    arcToRelative(7.3f, 7.3f, 0.0f, false, false, 0.1f, 1.2f)
                    arcToRelative(10.1f, 10.1f, 0.0f, false, false, -4.2f, -0.9f)
                    curveToRelative(-5.1f, 0.0f, -9.2f, 3.6f, -9.2f, 8.1f)
                    curveToRelative(0.0f, 0.2f, 0.0f, 0.4f, 0.0f, 0.6f)
                    curveToRelative(-4.7f, 0.6f, -7.9f, 1.8f, -7.9f, 3.2f)
                    curveToRelative(0.0f, 1.9f, 5.9f, 3.4f, 13.4f, 3.6f)
                    arcToRelative(10.3f, 10.3f, 0.0f, false, false, 3.7f, 0.7f)
                    arcToRelative(10.1f, 10.1f, 0.0f, false, false, 4.5f, -1.1f)
                    curveToRelative(3.4f, -0.4f, 6.1f, -1.2f, 7.4f, -2.1f)
                    curveToRelative(1.2f, 0.1f, 2.5f, 0.2f, 3.8f, 0.2f)
                    curveToRelative(7.9f, 0.0f, 14.4f, -2.1f, 15.5f, -4.8f)
                    arcToRelative(80.8f, 80.8f, 0.0f, false, false, 12.0f, 0.9f)
                    curveToRelative(12.2f, 0.0f, 22.2f, -2.4f, 23.7f, -5.5f)
                    quadToRelative(3.2f, 0.2f, 6.7f, 0.2f)
                    curveToRelative(18.1f, 0.0f, 32.8f, -4.1f, 32.8f, -9.2f)
                    curveToRelative(0.0f, -3.6f, -7.5f, -6.8f, -18.3f, -8.3f)
                    arcToRelative(8.9f, 8.9f, 0.0f, false, false, 2.8f, -6.4f)
                    curveToRelative(0.0f, -5.3f, -4.9f, -9.6f, -11.0f, -9.7f)
                    arcToRelative(8.5f, 8.5f, 0.0f, false, false, 0.3f, -2.2f)
                    curveToRelative(0.0f, -5.7f, -5.8f, -10.4f, -13.0f, -10.4f)
                    close()
                    moveTo(407.4f, 603.4f)
                    lineTo(408.0f, 603.4f)
                    curveToRelative(0.0f, 0.2f, -0.1f, 0.3f, -0.1f, 0.5f)
                    close()
                }
                path(
                    fill = linearGradient(
                        0.0f to Color(0xFFB1DFF9),
                        1.0f to Color(0xFFFFFFFF),
                        start = Offset(600.6f, 544.2f),
                        end = Offset(588.8f, 465.1f),
                    ),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd,
                ) {
                    moveTo(613.4f, 462.0f)
                    curveToRelative(-12.2f, 0.0f, -22.2f, 11.2f, -22.2f, 25.0f)
                    curveToRelative(0.0f, 0.8f, 0.0f, 1.6f, 0.1f, 2.5f)
                    arcToRelative(11.8f, 11.8f, 0.0f, false, false, -5.0f, 5.1f)
                    arcToRelative(31.7f, 31.7f, 0.0f, false, false, -15.8f, -3.9f)
                    curveToRelative(-13.1f, 0.0f, -23.7f, 7.0f, -23.7f, 15.6f)
                    arcToRelative(10.6f, 10.6f, 0.0f, false, false, 0.8f, 3.9f)
                    curveToRelative(-8.7f, 2.8f, -14.8f, 9.3f, -14.8f, 17.0f)
                    arcToRelative(15.3f, 15.3f, 0.0f, false, false, 3.5f, 9.5f)
                    arcToRelative(5.6f, 5.6f, 0.0f, false, false, -1.9f, 4.0f)
                    arcToRelative(4.6f, 4.6f, 0.0f, false, false, 0.2f, 1.4f)
                    curveTo(523.1f, 535.8f, 515.0f, 545.0f, 515.0f, 547.5f)
                    curveToRelative(-8.4f, -3.0f, -21.3f, 15.3f, -2.6f, 15.3f)
                    curveToRelative(10.2f, 0.0f, 54.5f, -0.4f, 60.7f, -1.7f)
                    curveToRelative(10.0f, 1.3f, 23.8f, -7.4f, 37.5f, -7.4f)
                    curveToRelative(32.2f, 0.0f, 58.3f, -4.4f, 58.3f, -9.8f)
                    arcToRelative(2.1f, 2.1f, 0.0f, false, false, -0.5f, -1.2f)
                    curveToRelative(18.1f, -0.8f, 30.8f, -2.7f, 30.8f, -4.9f)
                    curveToRelative(0.0f, -1.9f, -9.8f, -3.6f, -24.4f, -4.6f)
                    arcToRelative(16.2f, 16.2f, 0.0f, false, false, 4.2f, -10.6f)
                    curveToRelative(0.0f, -11.0f, -12.5f, -20.0f, -28.1f, -20.4f)
                    curveToRelative(-0.6f, -7.7f, -7.0f, -14.0f, -15.5f, -15.9f)
                    curveTo(635.3f, 472.8f, 625.5f, 462.0f, 613.4f, 462.0f)
                    close()
                }
                path(
                    fill = linearGradient(
                        0.0f to Color(0xFFBEE2F9),
                        1.0f to Color(0xFFFFFFFF),
                        start = Offset(146.0f, 195.2f),
                        end = Offset(130.6f, 125.5f),
                    ),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd,
                ) {
                    moveTo(0.0f, 162.7f)
                    arcToRelative(21.5f, 21.5f, 0.0f, false, true, 16.9f, -0.7f)
                    curveTo(17.3f, 152.6f, 24.2f, 145.0f, 32.6f, 145.0f)
                    curveToRelative(7.7f, 0.0f, 14.2f, 6.4f, 15.5f, 14.9f)
                    arcToRelative(11.0f, 11.0f, 0.0f, false, true, 3.9f, 0.9f)
                    arcToRelative(21.8f, 21.8f, 0.0f, false, true, -0.1f, -2.4f)
                    curveToRelative(0.0f, -12.1f, 9.5f, -21.9f, 21.3f, -21.9f)
                    arcTo(20.7f, 20.7f, 0.0f, false, true, 84.0f, 139.5f)
                    curveToRelative(-0.1f, -0.8f, -0.1f, -1.5f, -0.1f, -2.3f)
                    curveToRelative(0.0f, -14.3f, 11.9f, -25.8f, 26.5f, -25.8f)
                    arcToRelative(26.8f, 26.8f, 0.0f, false, true, 19.4f, 8.2f)
                    arcToRelative(12.2f, 12.2f, 0.0f, false, true, 3.0f, -0.4f)
                    curveToRelative(6.3f, 0.0f, 11.5f, 4.8f, 12.9f, 11.1f)
                    arcToRelative(25.2f, 25.2f, 0.0f, false, true, 11.2f, -2.5f)
                    curveToRelative(9.8f, 0.0f, 18.1f, 5.3f, 20.9f, 12.7f)
                    arcToRelative(24.5f, 24.5f, 0.0f, false, true, 7.0f, -1.0f)
                    arcToRelative(24.9f, 24.9f, 0.0f, false, true, 3.1f, 0.2f)
                    arcToRelative(21.8f, 21.8f, 0.0f, false, true, 21.3f, -15.8f)
                    curveToRelative(10.8f, 0.0f, 19.7f, 7.4f, 21.6f, 17.2f)
                    arcToRelative(13.3f, 13.3f, 0.0f, false, true, 8.8f, 12.5f)
                    arcToRelative(13.9f, 13.9f, 0.0f, false, true, -0.1f, 2.0f)
                    curveToRelative(4.2f, 2.6f, 7.1f, 5.6f, 8.4f, 8.8f)
                    arcToRelative(25.7f, 25.7f, 0.0f, false, true, 5.3f, -0.5f)
                    curveToRelative(6.9f, 0.0f, 12.8f, 2.6f, 15.2f, 6.3f)
                    curveToRelative(14.2f, 2.6f, 23.5f, 7.0f, 23.5f, 12.0f)
                    curveToRelative(0.0f, 8.0f, -23.8f, 14.5f, -53.0f, 14.5f)
                    arcToRelative(174.8f, 174.8f, 0.0f, false, true, -25.5f, -1.8f)
                    curveToRelative(-3.9f, 7.1f, -38.5f, 12.7f, -80.6f, 12.7f)
                    curveToRelative(-22.8f, 0.0f, -43.4f, -1.6f, -58.1f, -4.3f)
                    curveToRelative(-8.3f, 3.9f, -25.7f, 6.6f, -45.9f, 6.6f)
                    arcTo(187.7f, 187.7f, 0.0f, false, true, 0.0f, 207.9f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFc6c6c6)), stroke = null, fillAlpha = 0.86f,
                    strokeAlpha = 0.86f, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero,
                ) {
                    moveTo(699.7f, 853.6f)
                    curveToRelative(0.7f, -43.2f, 0.2f, -86.3f, 0.3f, -129.5f)
                    curveToRelative(0.0f, -3.6f, -1.4f, -4.8f, -4.7f, -4.8f)
                    curveToRelative(-8.2f, 0.1f, -16.3f, 0.1f, -24.5f, 0.0f)
                    curveToRelative(-4.3f, -0.1f, -5.5f, 1.9f, -5.5f, 5.8f)
                    curveToRelative(0.0f, 2.3f, 0.0f, 4.6f, 0.0f, 6.8f)
                    curveToRelative(0.0f, 4.6f, -0.1f, 9.1f, 0.1f, 13.7f)
                    curveToRelative(0.1f, 3.6f, -1.1f, 5.8f, -4.3f, 7.6f)
                    curveTo(649.0f, 759.9f, 637.0f, 766.9f, 624.9f, 773.9f)
                    lineToRelative(-5.0f, 2.9f)
                    horizontalLineToRelative(0.0f)
                    curveToRelative(-13.2f, 7.6f, -26.3f, 15.3f, -39.6f, 22.7f)
                    curveToRelative(-5.3f, 2.9f, -10.1f, 7.2f, -16.8f, 7.1f)
                    horizontalLineToRelative(-0.7f)
                    curveToRelative(-12.4f, -0.1f, -24.9f, -0.1f, -37.3f, 0.0f)
                    arcToRelative(14.7f, 14.7f, 0.0f, false, true, -7.6f, -1.9f)
                    lineToRelative(-29.6f, -17.0f)
                    quadToRelative(-29.9f, -17.1f, -59.7f, -34.1f)
                    curveToRelative(-2.8f, -1.6f, -4.0f, -3.6f, -3.9f, -6.8f)
                    curveToRelative(0.2f, -7.0f, 0.0f, -14.0f, 0.2f, -21.0f)
                    curveToRelative(0.1f, -5.6f, -0.4f, -6.3f, -6.2f, -6.3f)
                    curveToRelative(-7.2f, 0.0f, -14.3f, 0.0f, -21.5f, 0.0f)
                    curveToRelative(-6.8f, 0.0f, -6.9f, 0.1f, -6.9f, 7.1f)
                    quadToRelative(0.0f, 71.0f, 0.0f, 142.0f)
                    arcToRelative(176.8f, 176.8f, 0.0f, false, true, -2.3f, 26.8f)
                    curveToRelative(-5.0f, 32.3f, -17.1f, 62.0f, -32.4f, 90.4f)
                    quadToRelative(-2.4f, 4.6f, -5.0f, 9.1f)
                    curveToRelative(-8.1f, 14.4f, -17.0f, 28.3f, -26.2f, 42.0f)
                    lineToRelative(-0.5f, 0.8f)
                    curveToRelative(-3.8f, 5.7f, -7.7f, 11.3f, -11.6f, 16.9f)
                    curveToRelative(-16.9f, 24.3f, -34.0f, 48.3f, -52.9f, 71.0f)
                    quadToRelative(-4.6f, 5.5f, -9.3f, 10.9f)
                    arcToRelative(9.1f, 9.1f, 0.0f, false, false, -2.6f, 6.3f)
                    curveToRelative(0.1f, 11.7f, 0.0f, 23.3f, 0.2f, 35.0f)
                    curveToRelative(0.1f, 7.0f, 0.6f, 7.3f, 7.5f, 7.3f)
                    lineTo(415.6f, 1184.9f)
                    curveToRelative(7.0f, 0.0f, 14.0f, 0.0f, 21.0f, 0.0f)
                    curveToRelative(1.6f, 0.0f, 3.8f, 0.4f, 4.4f, -1.5f)
                    curveToRelative(1.2f, -4.1f, 4.4f, -3.4f, 7.3f, -3.4f)
                    horizontalLineToRelative(0.3f)
                    curveToRelative(-2.3f, -1.7f, -1.3f, -4.0f, -0.4f, -6.3f)
                    lineTo(448.0f, 1173.7f)
                    curveToRelative(-5.2f, 0.0f, -6.4f, -1.8f, -6.4f, -6.7f)
                    quadToRelative(0.0f, -20.6f, 0.1f, -41.1f)
                    quadToRelative(0.1f, -62.9f, 0.0f, -125.8f)
                    lineTo(441.6f, 988.5f)
                    curveToRelative(0.0f, -6.6f, 0.0f, -6.6f, 6.7f, -6.6f)
                    horizontalLineToRelative(97.0f)
                    curveToRelative(32.3f, 0.0f, 64.7f, 0.1f, 97.0f, -0.1f)
                    curveToRelative(4.9f, 0.0f, 6.2f, 1.6f, 6.1f, 6.3f)
                    quadToRelative(-0.2f, 70.0f, -0.1f, 139.9f)
                    quadToRelative(0.0f, 19.5f, 0.1f, 39.0f)
                    curveToRelative(0.0f, 4.8f, -1.3f, 6.5f, -5.9f, 6.6f)
                    arcToRelative(15.7f, 15.7f, 0.0f, false, true, 1.0f, 6.3f)
                    curveToRelative(1.8f, -0.1f, 3.8f, -0.5f, 4.6f, 1.4f)
                    curveToRelative(1.6f, 3.9f, 4.8f, 3.5f, 7.9f, 3.5f)
                    horizontalLineToRelative(64.5f)
                    lineTo(720.6f, 956.5f)
                    curveTo(706.8f, 923.8f, 699.1f, 889.8f, 699.7f, 853.6f)
                    close()
                    moveTo(572.1f, 811.0f)
                    quadToRelative(30.9f, -17.6f, 61.7f, -35.2f)
                    horizontalLineToRelative(0.0f)
                    quadToRelative(13.6f, -7.8f, 27.1f, -15.6f)
                    curveToRelative(4.0f, -2.3f, 4.6f, -1.1f, 4.6f, 2.9f)
                    curveToRelative(0.0f, 0.9f, 0.0f, 1.9f, 0.0f, 2.8f)
                    curveToRelative(-0.1f, 20.7f, 0.0f, 41.4f, 0.0f, 62.1f)
                    quadToRelative(0.0f, 32.5f, 0.0f, 65.0f)
                    curveToRelative(0.0f, 5.4f, -0.3f, 5.6f, -5.2f, 2.8f)
                    quadToRelative(-43.8f, -25.0f, -87.5f, -50.0f)
                    curveToRelative(-2.9f, -1.6f, -4.3f, -3.7f, -4.2f, -7.2f)
                    quadToRelative(0.1f, -4.1f, 0.1f, -8.2f)
                    curveToRelative(0.0f, -4.3f, 0.0f, -8.5f, -0.1f, -12.7f)
                    arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.5f, -3.3f)
                    arcTo(6.5f, 6.5f, 0.0f, false, true, 572.1f, 811.0f)
                    close()
                    moveTo(545.1f, 810.5f)
                    curveToRelative(2.5f, 0.0f, 5.3f, -0.3f, 5.2f, 3.6f)
                    curveToRelative(0.0f, 4.7f, 0.0f, 9.3f, 0.0f, 14.0f)
                    horizontalLineToRelative(0.0f)
                    lineTo(550.3f, 829.0f)
                    curveToRelative(0.0f, 4.2f, -0.1f, 8.5f, 0.0f, 12.7f)
                    curveToRelative(0.1f, 3.8f, -2.3f, 3.8f, -5.0f, 3.8f)
                    reflectiveCurveToRelative(-5.6f, 0.4f, -5.5f, -3.8f)
                    quadToRelative(0.0f, -6.7f, 0.1f, -13.4f)
                    quadToRelative(0.0f, -7.0f, 0.0f, -14.1f)
                    curveTo(539.8f, 810.4f, 542.5f, 810.6f, 545.1f, 810.6f)
                    close()
                    moveTo(424.7f, 763.5f)
                    curveToRelative(0.0f, -5.3f, 0.1f, -5.3f, 4.7f, -2.7f)
                    lineToRelative(47.9f, 27.4f)
                    lineToRelative(40.5f, 23.2f)
                    arcToRelative(6.7f, 6.7f, 0.0f, false, true, 3.8f, 6.5f)
                    quadToRelative(-0.1f, 5.9f, -0.1f, 11.8f)
                    quadToRelative(0.0f, 4.6f, 0.0f, 9.2f)
                    curveToRelative(0.0f, 2.8f, -1.2f, 4.5f, -3.7f, 5.9f)
                    quadTo(473.3f, 870.2f, 428.8f, 896.0f)
                    curveToRelative(-3.0f, 1.7f, -3.9f, 1.6f, -3.9f, -2.2f)
                    curveToRelative(0.1f, -22.0f, 0.1f, -44.0f, 0.1f, -66.0f)
                    horizontalLineToRelative(-0.2f)
                    lineTo(424.7f, 817.0f)
                    quadTo(424.7f, 790.2f, 424.7f, 763.5f)
                    close()
                    moveTo(409.4f, 1173.0f)
                    curveToRelative(0.1f, 5.1f, -1.5f, 6.5f, -6.5f, 6.4f)
                    curveToRelative(-13.9f, -0.3f, -14.0f, -0.1f, -14.0f, -13.9f)
                    lineTo(388.9f, 1151.0f)
                    arcToRelative(222.1f, 222.1f, 0.0f, false, true, 0.2f, -25.0f)
                    curveToRelative(0.8f, -13.2f, 2.4f, -26.4f, 3.6f, -39.6f)
                    curveToRelative(2.6f, -27.6f, 1.7f, -55.2f, 1.9f, -82.8f)
                    curveToRelative(0.0f, -0.3f, 0.0f, -0.6f, 0.0f, -0.9f)
                    curveToRelative(0.0f, -5.8f, 0.3f, -5.8f, 6.5f, -5.9f)
                    horizontalLineToRelative(0.0f)
                    curveToRelative(4.3f, 0.0f, 8.7f, 0.1f, 13.0f, 0.0f)
                    curveToRelative(2.9f, -0.1f, 4.4f, 1.0f, 4.3f, 4.0f)
                    curveToRelative(-0.2f, 17.1f, 0.4f, 34.3f, -1.0f, 51.4f)
                    curveToRelative(-0.9f, 11.1f, -1.6f, 22.2f, -2.7f, 33.3f)
                    curveToRelative(-1.2f, 11.3f, -3.2f, 22.4f, -4.3f, 33.6f)
                    curveToRelative(-0.2f, 2.3f, -0.4f, 4.6f, -0.6f, 6.8f)
                    curveTo(408.8f, 1141.6f, 409.3f, 1157.3f, 409.4f, 1173.0f)
                    close()
                    moveTo(417.3f, 1178.4f)
                    curveToRelative(-2.5f, 0.0f, -1.5f, -2.5f, -1.5f, -3.9f)
                    curveToRelative(0.3f, -16.1f, -0.6f, -32.3f, 0.3f, -48.5f)
                    curveToRelative(0.2f, -3.6f, 0.5f, -7.3f, 0.9f, -10.9f)
                    curveToRelative(0.2f, -1.8f, 0.6f, -3.5f, 0.9f, -5.3f)
                    lineToRelative(0.7f, 0.3f)
                    lineTo(418.6f, 1126.0f)
                    quadToRelative(0.0f, 24.3f, 0.0f, 48.6f)
                    curveTo(418.6f, 1176.0f, 419.1f, 1178.4f, 417.3f, 1178.4f)
                    close()
                    moveTo(431.6f, 922.4f)
                    curveToRelative(-6.9f, 0.0f, -6.3f, -0.1f, -7.1f, -6.9f)
                    curveToRelative(-0.9f, -8.4f, 3.0f, -12.2f, 10.0f, -16.0f)
                    curveToRelative(26.1f, -14.4f, 51.8f, -29.6f, 77.5f, -44.5f)
                    curveToRelative(5.8f, -3.3f, 11.2f, -6.0f, 18.5f, -5.3f)
                    curveToRelative(10.7f, 1.1f, 21.6f, 0.3f, 32.5f, 0.2f)
                    arcToRelative(17.9f, 17.9f, 0.0f, false, true, 9.5f, 2.5f)
                    curveTo(602.0f, 869.3f, 631.4f, 886.3f, 661.0f, 903.0f)
                    curveToRelative(4.7f, 2.7f, 4.5f, 6.4f, 4.5f, 10.6f)
                    curveToRelative(-0.1f, 8.9f, 0.0f, 8.9f, -8.9f, 8.9f)
                    horizontalLineToRelative(-225.0f)
                    close()
                    moveTo(673.0f, 1179.1f)
                    curveToRelative(-2.6f, -0.1f, -1.8f, -2.5f, -1.8f, -3.9f)
                    quadToRelative(-0.1f, -23.5f, -0.1f, -47.1f)
                    quadToRelative(0.0f, -12.7f, 0.0f, -25.5f)
                    arcToRelative(177.7f, 177.7f, 0.0f, false, true, 3.5f, 25.4f)
                    curveToRelative(1.1f, 15.7f, 0.6f, 31.3f, 0.6f, 47.0f)
                    curveTo(675.2f, 1176.7f, 675.8f, 1179.1f, 673.0f, 1179.1f)
                    close()
                    moveTo(701.5f, 1175.6f)
                    curveToRelative(0.0f, 2.9f, -1.5f, 3.7f, -4.1f, 3.7f)
                    curveToRelative(-4.0f, -0.1f, -8.0f, -0.2f, -12.0f, 0.0f)
                    curveToRelative(-3.6f, 0.2f, -4.6f, -1.5f, -4.6f, -4.8f)
                    curveToRelative(0.1f, -10.0f, -0.2f, -20.0f, 0.1f, -30.0f)
                    curveToRelative(0.1f, -5.6f, -0.1f, -11.1f, -0.5f, -16.6f)
                    curveToRelative(-0.8f, -11.1f, -2.4f, -22.1f, -3.8f, -33.1f)
                    curveToRelative(-1.9f, -14.9f, -3.0f, -29.8f, -3.8f, -44.7f)
                    curveToRelative(-0.8f, -15.8f, -1.1f, -31.6f, -1.9f, -47.3f)
                    curveToRelative(-0.1f, -2.5f, 0.2f, -4.1f, 1.3f, -5.0f)
                    curveToRelative(0.9f, -0.8f, 2.4f, -1.1f, 4.6f, -0.9f)
                    arcToRelative(114.6f, 114.6f, 0.0f, false, false, 14.0f, 0.0f)
                    curveToRelative(3.5f, -0.2f, 4.7f, 1.3f, 4.7f, 4.7f)
                    curveToRelative(-0.1f, 4.7f, -0.1f, 9.4f, -0.1f, 14.4f)
                    curveToRelative(0.0f, 5.5f, 0.0f, 11.5f, 0.0f, 18.5f)
                    curveToRelative(-0.8f, 27.3f, 2.8f, 57.7f, 5.4f, 88.2f)
                    curveToRelative(0.1f, 1.7f, 0.3f, 3.4f, 0.4f, 5.1f)
                    curveTo(702.1f, 1143.6f, 701.3f, 1159.7f, 701.5f, 1175.6f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFd4c389)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(227.2f, 1125.1f)
                    lineToRelative(3.9f, 5.0f)
                    lineToRelative(0.1f, 1.0f)
                    lineToRelative(-6.9f, 0.0f)
                    lineToRelative(2.9f, -5.9f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFfff9db)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(200.4f, 1146.2f)
                    lineToRelative(2.0f, 3.4f)
                    lineToRelative(25.8f, -0.5f)
                    lineToRelative(0.0f, -23.6f)
                    lineToRelative(-9.3f, -11.2f)
                    lineToRelative(-2.3f, -3.0f)
                    lineToRelative(-17.3f, 0.0f)
                    lineToRelative(1.1f, 35.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFf9eaaf)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(166.8f, 1129.2f)
                    lineToRelative(0.0f, 20.5f)
                    lineToRelative(35.6f, 0.0f)
                    lineToRelative(0.0f, -24.5f)
                    lineToRelative(-35.6f, 4.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFd4c389)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(215.0f, 1112.6f)
                    lineToRelative(13.2f, 17.0f)
                    lineToRelative(0.0f, -2.9f)
                    lineToRelative(-12.6f, -15.3f)
                    lineToRelative(-0.6f, 1.3f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFfdcc68)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(198.8f, 1128.2f)
                    lineToRelative(-0.6f, 1.5f)
                    lineToRelative(2.8f, 1.5f)
                    lineToRelative(15.6f, -20.1f)
                    lineToRelative(-0.4f, -1.6f)
                    lineToRelative(-1.9f, 0.3f)
                    lineToRelative(-15.5f, 18.3f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFec6669)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(163.0f, 1128.6f)
                    lineToRelative(-2.4f, 1.0f)
                    lineToRelative(1.1f, 1.5f)
                    lineToRelative(39.3f, 0.1f)
                    lineToRelative(-0.7f, -1.6f)
                    lineToRelative(-1.7f, -0.9f)
                    lineToRelative(-35.6f, -0.1f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFf3956a)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(216.2f, 1109.7f)
                    lineToRelative(-37.3f, 0.0f)
                    lineToRelative(-18.3f, 20.0f)
                    lineToRelative(39.7f, 0.0f)
                    lineToRelative(15.9f, -20.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFfdcc68)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(216.2f, 1109.7f)
                    lineToRelative(0.2f, 0.2f)
                    lineToRelative(16.0f, 20.2f)
                    lineToRelative(-1.1f, 1.0f)
                    lineToRelative(-15.7f, -19.7f)
                    lineToRelative(0.7f, -1.7f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFd4c389)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(227.7f, 1128.9f)
                    lineToRelative(1.0f, 1.4f)
                    lineToRelative(0.5f, -1.7f)
                    lineToRelative(-1.5f, -1.9f)
                    lineToRelative(-0.1f, 2.2f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFcc6635)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(172.9f, 1133.7f)
                    horizontalLineToRelative(3.7f)
                    verticalLineToRelative(3.2f)
                    horizontalLineToRelative(-3.7f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFcc6635)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(189.8f, 1133.7f)
                    horizontalLineToRelative(3.7f)
                    verticalLineToRelative(3.2f)
                    horizontalLineToRelative(-3.7f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFcc6635)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(214.1f, 1120.9f)
                    horizontalLineToRelative(3.1f)
                    verticalLineToRelative(4.3f)
                    horizontalLineToRelative(-3.1f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFf9eaaf)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(94.7f, 1230.3f)
                    lineToRelative(0.0f, 30.1f)
                    lineToRelative(-4.4f, 0.4f)
                    lineToRelative(-46.9f, 0.0f)
                    lineToRelative(0.0f, -25.0f)
                    lineToRelative(51.3f, -5.4f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFfff9db)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(130.6f, 1235.4f)
                    lineToRelative(0.0f, 25.4f)
                    lineToRelative(-40.5f, 0.0f)
                    lineToRelative(0.0f, -28.0f)
                    lineToRelative(22.3f, -24.5f)
                    lineToRelative(18.2f, 27.1f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFcc4417)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(133.1f, 1238.1f)
                    lineToRelative(-0.6f, 1.1f)
                    lineToRelative(-1.9f, 0.0f)
                    lineToRelative(-19.3f, -28.2f)
                    lineToRelative(1.1f, -1.5f)
                    lineToRelative(20.7f, 28.7f)
                    close()
                }
                path(
                    fill = linearGradient(
                        0.0f to Color(0xFFEB5B1D),
                        1.0f to Color(0xFFE73E18),
                        start = Offset(89.3f, 1208.1f),
                        end = Offset(66.0f, 1234.9f),
                    ),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(112.7f, 1209.0f)
                    lineToRelative(-0.3f, -2.6f)
                    lineToRelative(-50.7f, 0.4f)
                    lineToRelative(-25.3f, 32.3f)
                    lineToRelative(54.6f, 0.0f)
                    lineToRelative(21.7f, -30.1f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFf28a1a)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(89.3f, 1239.2f)
                    lineToRelative(23.1f, -32.7f)
                    lineToRelative(23.6f, 32.7f)
                    lineToRelative(-3.5f, 0.0f)
                    lineToRelative(-19.9f, -28.8f)
                    lineToRelative(-19.9f, 28.8f)
                    lineToRelative(-3.5f, 0.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFcc6635)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(108.0f, 1227.3f)
                    horizontalLineToRelative(6.5f)
                    verticalLineToRelative(5.7f)
                    horizontalLineToRelative(-6.5f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFcc6635)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(75.4f, 1242.8f)
                    horizontalLineToRelative(6.5f)
                    verticalLineToRelative(5.6f)
                    horizontalLineToRelative(-6.5f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFcc6635)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero,
                ) {
                    moveTo(53.7f, 1242.8f)
                    horizontalLineToRelative(6.4f)
                    verticalLineToRelative(5.6f)
                    horizontalLineToRelative(-6.4f)
                    close()
                }
            }
        }
            .build()
        return _bg!!
    }

private var _bg: ImageVector? = null

public val Drawable.Bg2: ImageVector
    get() {
        if (_bg2 != null) {
            return _bg2!!
        }
        _bg2 = Builder(
            name = "Bg",
            defaultWidth = 222.22223.dp,
            defaultHeight = 100.0.dp,
            viewportWidth = 1600.0f,
            viewportHeight = 720.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFFa2d2da)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(0.0f, 720.0f)
                lineToRelative(0.0f, -720.0f)
                lineToRelative(1600.0f, -0.0f)
                lineToRelative(0.0f, 720.0f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFFA1D5F4),
                    1.0f to Color(0xFFDAEFFD),
                    start =
                    Offset(445.6f, 275.1f),
                    end = Offset(397.9f, 196.2f),
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(332.3f, 249.4f)
                curveToRelative(2.1f, 0.0f, 4.4f, 0.1f, 6.8f, 0.2f)
                curveToRelative(-4.8f, -2.6f, -7.9f, -6.9f, -7.4f, -11.1f)
                curveToRelative(0.5f, -4.4f, 4.8f, -7.6f, 10.5f, -8.2f)
                arcToRelative(11.1f, 11.1f, 0.0f, false, true, -0.7f, -5.3f)
                curveToRelative(1.0f, -8.5f, 12.7f, -13.6f, 26.0f, -11.3f)
                arcToRelative(37.5f, 37.5f, 0.0f, false, true, 10.4f, 3.4f)
                curveToRelative(3.0f, -2.5f, 7.7f, -3.8f, 13.0f, -3.1f)
                arcToRelative(12.7f, 12.7f, 0.0f, false, true, -0.1f, -3.6f)
                curveToRelative(0.9f, -7.8f, 9.1f, -12.8f, 18.2f, -11.3f)
                curveToRelative(0.4f, 0.1f, 0.8f, 0.2f, 1.1f, 0.2f)
                arcToRelative(22.2f, 22.2f, 0.0f, false, true, 26.0f, -18.4f)
                arcToRelative(25.2f, 25.2f, 0.0f, false, true, 20.6f, 26.5f)
                arcToRelative(13.1f, 13.1f, 0.0f, false, true, 8.2f, 5.3f)
                curveToRelative(2.3f, -10.0f, 13.5f, -16.3f, 26.0f, -14.1f)
                curveToRelative(13.2f, 2.3f, 22.8f, 13.1f, 21.4f, 24.1f)
                arcToRelative(16.9f, 16.9f, 0.0f, false, true, -5.3f, 10.4f)
                curveToRelative(12.5f, 3.0f, 21.6f, 8.4f, 21.1f, 13.0f)
                curveToRelative(-0.4f, 3.5f, -6.4f, 5.6f, -14.8f, 5.7f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, 0.9f, 4.3f)
                curveToRelative(-0.8f, 6.6f, -11.7f, 10.7f, -27.9f, 11.6f)
                curveToRelative(-3.4f, 6.3f, -18.1f, 9.7f, -38.2f, 9.2f)
                curveToRelative(-5.4f, 1.1f, -13.2f, 1.5f, -22.5f, 1.0f)
                curveToRelative(-1.8f, 0.1f, -3.8f, 0.1f, -6.0f, 0.0f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, 1.2f, 2.5f)
                curveToRelative(-0.5f, 4.4f, -17.8f, 5.1f, -38.4f, 1.5f)
                reflectiveCurveTo(345.1f, 272.0f, 345.6f, 267.6f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.2f, -0.7f)
                curveToRelative(-5.0f, -1.3f, -9.6f, -2.7f, -13.5f, -4.0f)
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFF9FD4F5),
                    1.0f to Color(0xFFEFF8FB),
                    start =
                    Offset(1512.0f, 144.0f),
                    end = Offset(1472.9f, 19.9f),
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(1593.2f, 29.7f)
                arcToRelative(18.9f, 18.9f, 0.0f, false, false, -9.7f, 2.6f)
                curveToRelative(-1.0f, -4.2f, -4.1f, -7.3f, -7.8f, -7.3f)
                curveToRelative(-3.4f, 0.0f, -6.3f, 2.6f, -7.5f, 6.2f)
                arcToRelative(19.1f, 19.1f, 0.0f, false, false, -6.5f, -1.1f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, -4.6f, 0.6f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 2.6f, -7.2f)
                curveToRelative(0.0f, -8.2f, -9.2f, -14.9f, -20.5f, -14.9f)
                reflectiveCurveToRelative(-20.5f, 6.7f, -20.5f, 14.9f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, 4.1f, 8.9f)
                lineToRelative(-0.3f, 0.3f)
                arcToRelative(10.6f, 10.6f, 0.0f, false, false, -6.6f, -2.2f)
                curveToRelative(-4.8f, 0.0f, -8.9f, 3.0f, -9.4f, 6.8f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, false, -9.4f, -1.7f)
                curveToRelative(-11.9f, 0.0f, -21.5f, 7.7f, -21.5f, 17.1f)
                curveToRelative(0.0f, 5.5f, 3.3f, 10.4f, 8.4f, 13.5f)
                lineTo(1484.0f, 66.2f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, -6.0f, 3.5f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, false, -6.1f, -1.6f)
                curveToRelative(-6.0f, 0.0f, -10.9f, 4.0f, -10.9f, 9.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.1f, 1.0f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, -2.2f, -0.2f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, false, -3.0f, 0.4f)
                arcToRelative(17.3f, 17.3f, 0.0f, false, false, -12.8f, -5.5f)
                curveToRelative(-9.2f, 0.0f, -16.7f, 6.8f, -16.7f, 15.3f)
                arcToRelative(14.5f, 14.5f, 0.0f, false, false, 4.2f, 10.1f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -2.8f, 3.5f)
                arcToRelative(4.8f, 4.8f, 0.0f, false, false, -2.5f, -0.7f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, false, -4.9f, 3.7f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, -5.3f, -1.3f)
                curveToRelative(-4.8f, 0.0f, -8.6f, 2.8f, -9.1f, 6.3f)
                curveToRelative(-0.3f, 0.0f, -0.6f, 0.0f, -0.9f, 0.0f)
                curveToRelative(-5.5f, 0.0f, -10.0f, 3.9f, -10.0f, 8.6f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 3.7f, 6.7f)
                curveToRelative(-3.0f, 0.0f, -5.3f, 2.0f, -5.3f, 4.5f)
                reflectiveCurveToRelative(2.4f, 4.5f, 5.4f, 4.5f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 3.9f, -1.4f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 1.2f, 0.8f)
                curveToRelative(-8.7f, 1.3f, -14.6f, 2.9f, -16.5f, 4.6f)
                verticalLineToRelative(2.5f)
                curveToRelative(4.7f, 4.3f, 32.8f, 7.6f, 66.8f, 7.6f)
                curveToRelative(30.5f, 0.0f, 56.3f, -2.7f, 64.6f, -6.3f)
                horizontalLineToRelative(2.9f)
                curveToRelative(42.0f, 0.0f, 64.9f, -1.5f, 78.4f, -3.7f)
                lineTo(1600.0f, 30.9f)
                arcTo(19.7f, 19.7f, 0.0f, false, false, 1593.2f, 29.7f)
                close()
                moveTo(1404.2f, 129.8f)
                curveToRelative(0.0f, -0.1f, 0.0f, -0.2f, 0.0f, -0.3f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.0f, -0.2f)
                lineToRelative(0.5f, 0.2f)
                arcTo(5.1f, 5.1f, 0.0f, false, false, 1404.2f, 129.8f)
                close()
            }
            path(
                fill = null,
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(1029.2f, 46.6f)
                arcToRelative(13.6f, 13.6f, 0.0f, false, true, 11.5f, 5.8f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, 1.0f, -0.1f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, 4.7f, 3.2f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, true, 12.8f, -5.7f)
                curveToRelative(8.6f, 0.0f, 15.6f, 6.0f, 15.6f, 13.4f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, true, -0.1f, 1.7f)
                curveToRelative(6.2f, 0.6f, 11.0f, 6.4f, 11.0f, 13.6f)
                arcToRelative(15.3f, 15.3f, 0.0f, false, true, -0.9f, 5.1f)
                arcToRelative(8.8f, 8.8f, 0.0f, false, true, 8.2f, 8.6f)
                arcToRelative(7.4f, 7.4f, 0.0f, false, true, -0.1f, 1.3f)
                arcToRelative(9.7f, 9.7f, 0.0f, false, true, 4.3f, -1.0f)
                arcToRelative(9.1f, 9.1f, 0.0f, false, true, 9.3f, 8.8f)
                curveToRelative(0.0f, 0.2f, 0.0f, 0.4f, 0.0f, 0.6f)
                curveToRelative(4.8f, 0.7f, 8.0f, 2.0f, 8.0f, 3.5f)
                curveToRelative(0.0f, 2.0f, -6.0f, 3.7f, -13.6f, 3.9f)
                arcToRelative(9.9f, 9.9f, 0.0f, false, true, -3.7f, 0.7f)
                arcToRelative(9.6f, 9.6f, 0.0f, false, true, -4.6f, -1.1f)
                curveToRelative(-3.5f, -0.5f, -6.2f, -1.3f, -7.5f, -2.3f)
                curveToRelative(-1.2f, 0.1f, -2.5f, 0.2f, -3.8f, 0.2f)
                curveToRelative(-8.0f, 0.0f, -14.6f, -2.3f, -15.7f, -5.2f)
                arcToRelative(76.2f, 76.2f, 0.0f, false, true, -12.2f, 0.9f)
                curveToRelative(-12.3f, 0.0f, -22.5f, -2.6f, -24.0f, -5.9f)
                quadToRelative(-3.3f, 0.2f, -6.8f, 0.2f)
                curveToRelative(-18.3f, 0.0f, -33.2f, -4.5f, -33.2f, -10.0f)
                curveToRelative(0.0f, -4.0f, 7.6f, -7.4f, 18.6f, -9.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -2.8f, -7.0f)
                curveToRelative(0.0f, -5.7f, 5.0f, -10.4f, 11.2f, -10.6f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, true, -0.3f, -2.3f)
                curveToRelative(0.0f, -6.2f, 5.9f, -11.3f, 13.2f, -11.3f)
                close()
                moveTo(1028.6f, 69.2f)
                lineTo(1028.0f, 69.2f)
                curveToRelative(0.0f, 0.2f, 0.0f, 0.3f, 0.1f, 0.5f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFFBAE3F7),
                    1.0f to Color(0xFFFFFFFF),
                    start =
                    Offset(1201.6f, 293.9f),
                    end = Offset(1184.5f, 232.5f),
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(1220.8f, 236.9f)
                curveToRelative(-4.9f, 0.0f, -9.2f, 2.2f, -11.4f, 5.4f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, false, -1.0f, -0.1f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, false, -4.7f, 3.0f)
                arcToRelative(16.6f, 16.6f, 0.0f, false, false, -12.6f, -5.3f)
                curveToRelative(-8.5f, 0.0f, -15.4f, 5.5f, -15.4f, 12.4f)
                arcToRelative(9.7f, 9.7f, 0.0f, false, false, 0.1f, 1.5f)
                curveToRelative(-6.1f, 0.5f, -10.9f, 5.9f, -10.9f, 12.5f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, 0.9f, 4.7f)
                curveToRelative(-4.6f, 0.4f, -8.1f, 3.8f, -8.1f, 7.9f)
                arcTo(7.2f, 7.2f, 0.0f, false, false, 1158.0f, 280.0f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, false, -4.2f, -0.9f)
                curveToRelative(-5.1f, 0.0f, -9.2f, 3.6f, -9.2f, 8.1f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, 0.6f)
                curveToRelative(-4.7f, 0.6f, -7.9f, 1.8f, -7.9f, 3.2f)
                curveToRelative(0.0f, 1.9f, 5.9f, 3.4f, 13.4f, 3.6f)
                arcToRelative(10.3f, 10.3f, 0.0f, false, false, 8.2f, -0.4f)
                curveToRelative(3.5f, -0.4f, 6.1f, -1.2f, 7.4f, -2.1f)
                curveToRelative(1.2f, 0.1f, 2.5f, 0.2f, 3.8f, 0.2f)
                curveToRelative(7.9f, 0.0f, 14.4f, -2.1f, 15.5f, -4.8f)
                arcToRelative(80.8f, 80.8f, 0.0f, false, false, 12.0f, 0.9f)
                curveToRelative(12.2f, 0.0f, 22.2f, -2.4f, 23.7f, -5.5f)
                curveToRelative(2.2f, 0.1f, 4.4f, 0.2f, 6.7f, 0.2f)
                curveToRelative(18.1f, 0.0f, 32.8f, -4.1f, 32.8f, -9.2f)
                curveToRelative(0.0f, -3.6f, -7.5f, -6.8f, -18.3f, -8.3f)
                arcToRelative(8.9f, 8.9f, 0.0f, false, false, 2.8f, -6.4f)
                curveToRelative(0.0f, -5.3f, -4.9f, -9.6f, -11.0f, -9.7f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 0.3f, -2.1f)
                curveToRelative(0.0f, -5.7f, -5.8f, -10.4f, -13.0f, -10.4f)
                close()
                moveTo(1221.3f, 257.6f)
                lineTo(1221.9f, 257.6f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -0.1f, 0.5f)
                curveTo(1221.7f, 257.9f, 1221.5f, 257.8f, 1221.3f, 257.6f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFFB1DFF9),
                    1.0f to Color(0xFFFFFFFF),
                    start =
                    Offset(814.7f, 215.6f),
                    end = Offset(802.8f, 136.6f),
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(827.5f, 133.4f)
                curveToRelative(-12.2f, 0.0f, -22.2f, 11.2f, -22.2f, 25.0f)
                curveToRelative(0.0f, 0.8f, 0.0f, 1.6f, 0.1f, 2.5f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -4.9f, 5.1f)
                arcTo(31.7f, 31.7f, 0.0f, false, false, 784.7f, 162.0f)
                curveToRelative(-13.1f, 0.0f, -23.7f, 7.0f, -23.7f, 15.6f)
                arcToRelative(10.6f, 10.6f, 0.0f, false, false, 0.8f, 3.9f)
                curveToRelative(-8.7f, 2.8f, -14.8f, 9.3f, -14.8f, 17.0f)
                arcToRelative(15.2f, 15.2f, 0.0f, false, false, 3.5f, 9.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -1.9f, 4.0f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, 0.2f, 1.4f)
                curveToRelative(-11.6f, -6.1f, -19.7f, 3.1f, -19.7f, 5.6f)
                curveToRelative(-8.4f, -3.0f, -21.3f, 15.3f, -2.6f, 15.3f)
                curveToRelative(10.2f, 0.0f, 54.5f, -0.4f, 60.7f, -1.7f)
                curveToRelative(10.0f, 1.3f, 23.8f, -7.4f, 37.5f, -7.4f)
                curveToRelative(32.2f, 0.0f, 58.3f, -4.4f, 58.3f, -9.8f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -0.5f, -1.2f)
                curveToRelative(18.1f, -0.8f, 30.8f, -2.7f, 30.8f, -4.9f)
                curveToRelative(0.0f, -1.9f, -9.8f, -3.6f, -24.4f, -4.6f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 893.2f, 194.0f)
                curveToRelative(0.0f, -11.0f, -12.5f, -20.0f, -28.0f, -20.5f)
                curveToRelative(-0.6f, -7.7f, -7.0f, -14.0f, -15.5f, -15.9f)
                curveTo(849.3f, 144.2f, 839.5f, 133.4f, 827.5f, 133.4f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFFBEE2F9),
                    1.0f to Color(0xFFFFFFFF),
                    start =
                    Offset(146.6f, 114.3f),
                    end = Offset(131.2f, 44.6f),
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(0.6f, 81.8f)
                arcToRelative(21.5f, 21.5f, 0.0f, false, true, 16.9f, -0.7f)
                curveToRelative(0.4f, -9.5f, 7.3f, -17.1f, 15.7f, -17.1f)
                curveToRelative(7.7f, 0.0f, 14.2f, 6.4f, 15.5f, 14.9f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, 3.9f, 0.9f)
                arcToRelative(21.8f, 21.8f, 0.0f, false, true, -0.1f, -2.4f)
                curveToRelative(0.0f, -12.1f, 9.5f, -21.9f, 21.3f, -21.9f)
                arcToRelative(20.7f, 20.7f, 0.0f, false, true, 10.9f, 3.1f)
                curveToRelative(-0.1f, -0.8f, -0.1f, -1.5f, -0.1f, -2.3f)
                curveToRelative(0.0f, -14.3f, 11.9f, -25.8f, 26.5f, -25.8f)
                arcToRelative(26.8f, 26.8f, 0.0f, false, true, 19.4f, 8.2f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 3.0f, -0.4f)
                curveToRelative(6.3f, 0.0f, 11.5f, 4.8f, 12.9f, 11.1f)
                arcToRelative(25.2f, 25.2f, 0.0f, false, true, 11.2f, -2.5f)
                curveToRelative(9.8f, 0.0f, 18.1f, 5.3f, 20.9f, 12.7f)
                arcToRelative(24.5f, 24.5f, 0.0f, false, true, 7.0f, -1.0f)
                arcToRelative(24.9f, 24.9f, 0.0f, false, true, 3.1f, 0.2f)
                arcTo(21.8f, 21.8f, 0.0f, false, true, 209.7f, 43.0f)
                curveToRelative(10.8f, 0.0f, 19.7f, 7.4f, 21.6f, 17.2f)
                arcToRelative(13.3f, 13.3f, 0.0f, false, true, 8.8f, 12.5f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, true, -0.1f, 2.0f)
                curveToRelative(4.2f, 2.6f, 7.1f, 5.6f, 8.4f, 8.8f)
                arcToRelative(25.7f, 25.7f, 0.0f, false, true, 5.3f, -0.5f)
                curveToRelative(6.9f, 0.0f, 12.8f, 2.6f, 15.2f, 6.3f)
                curveToRelative(14.2f, 2.6f, 23.5f, 7.0f, 23.5f, 12.0f)
                curveToRelative(0.0f, 8.0f, -23.8f, 14.5f, -53.0f, 14.5f)
                arcTo(174.8f, 174.8f, 0.0f, false, true, 213.9f, 114.0f)
                curveToRelative(-3.9f, 7.1f, -38.5f, 12.7f, -80.6f, 12.7f)
                curveToRelative(-22.8f, 0.0f, -43.4f, -1.6f, -58.1f, -4.3f)
                curveTo(67.0f, 126.3f, 49.5f, 129.0f, 29.4f, 129.0f)
                arcTo(187.7f, 187.7f, 0.0f, false, true, 0.6f, 127.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF94c124)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(0.0f, 397.0f)
                horizontalLineToRelative(1600.0f)
                verticalLineToRelative(323.0f)
                horizontalLineToRelative(-1600.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF86a32d)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(0.0f, 397.9f)
                lineToRelative(132.1f, -0.1f)
                curveToRelative(22.0f, -25.0f, 43.6f, -50.5f, 66.8f, -74.6f)
                curveToRelative(2.2f, -2.3f, 5.1f, -4.9f, 2.3f, -8.8f)
                curveToRelative(-29.3f, -26.0f, -60.0f, -50.3f, -93.4f, -70.8f)
                curveToRelative(-26.0f, -16.0f, -33.0f, -14.9f, -57.0f, 4.0f)
                curveTo(32.7f, 261.9f, 17.1f, 278.8f, 0.0f, 294.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF90af2c)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(201.2f, 314.5f)
                curveToRelative(-0.2f, 4.7f, -4.1f, 6.8f, -6.8f, 9.7f)
                quadToRelative(-29.1f, 32.3f, -58.2f, 64.6f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -4.2f, 9.1f)
                curveToRelative(68.0f, 0.7f, 136.0f, 1.6f, 204.0f, 2.0f)
                curveToRelative(53.5f, 0.3f, 107.0f, 0.6f, 160.5f, -0.2f)
                curveToRelative(25.3f, -0.4f, 50.6f, -2.2f, 76.0f, -1.7f)
                curveToRelative(3.6f, 0.1f, 7.5f, -1.1f, 10.8f, 1.6f)
                curveToRelative(2.7f, 2.9f, 6.2f, 2.0f, 9.5f, 2.1f)
                curveToRelative(29.3f, 0.2f, 58.5f, -0.2f, 87.8f, -0.8f)
                arcToRelative(44.9f, 44.9f, 0.0f, false, true, 15.0f, 1.7f)
                curveToRelative(37.2f, 1.9f, 74.3f, 0.6f, 111.5f, 0.7f)
                arcToRelative(8.8f, 8.8f, 0.0f, false, false, 8.2f, -3.0f)
                curveToRelative(-1.1f, -7.1f, -7.0f, -5.3f, -11.2f, -5.3f)
                quadToRelative(-31.4f, -0.6f, -62.8f, -0.1f)
                curveToRelative(-8.6f, 0.1f, -15.2f, -2.4f, -21.9f, -8.2f)
                curveToRelative(-20.1f, -17.5f, -39.7f, -35.7f, -60.8f, -51.9f)
                curveToRelative(-4.7f, 3.0f, -6.6f, -1.5f, -9.1f, -3.6f)
                curveToRelative(-26.2f, -20.8f, -51.9f, -42.1f, -80.7f, -59.5f)
                curveToRelative(-12.3f, -7.4f, -22.3f, -6.2f, -33.2f, 2.3f)
                curveToRelative(-17.7f, 13.7f, -33.8f, 29.1f, -49.0f, 45.5f)
                curveToRelative(-4.7f, 5.1f, -8.1f, 6.7f, -14.1f, 1.5f)
                reflectiveCurveToRelative(-13.5f, -8.9f, -20.1f, -13.5f)
                curveToRelative(-9.0f, -6.3f, -17.2f, -5.7f, -25.8f, 1.3f)
                curveToRelative(-3.5f, 2.8f, -6.3f, 7.3f, -11.7f, 7.3f)
                curveToRelative(-9.6f, 4.2f, -15.1f, 13.2f, -22.4f, 20.0f)
                curveToRelative(-9.5f, 8.9f, -9.3f, 9.2f, -19.5f, 0.7f)
                curveToRelative(-11.6f, -9.7f, -23.1f, -19.5f, -35.2f, -28.6f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, false, -8.9f, -4.7f)
                curveToRelative(-13.7f, -9.2f, -27.1f, -19.0f, -41.2f, -27.6f)
                curveToRelative(-22.0f, -13.6f, -25.5f, -13.4f, -45.6f, 3.3f)
                curveToRelative(-11.7f, 9.7f, -22.5f, 20.6f, -33.7f, 30.9f)
                curveTo(206.4f, 311.9f, 205.0f, 315.1f, 201.2f, 314.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF86a32d)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(658.5f, 334.9f)
                curveToRelative(3.3f, 10.7f, 13.8f, 14.3f, 20.9f, 21.1f)
                curveToRelative(13.1f, 12.5f, 27.5f, 23.6f, 40.9f, 35.9f)
                curveToRelative(4.6f, 4.2f, 8.9f, 6.3f, 15.1f, 6.2f)
                curveToRelative(22.9f, -0.3f, 45.8f, -0.2f, 68.8f, -0.1f)
                curveToRelative(3.6f, 0.0f, 7.5f, -1.1f, 10.7f, 1.5f)
                curveToRelative(1.5f, 3.0f, 4.3f, 3.7f, 7.2f, 4.3f)
                curveToRelative(9.8f, -0.6f, 19.6f, -0.2f, 29.3f, -1.5f)
                curveToRelative(7.9f, -2.5f, 16.1f, -1.3f, 24.1f, -1.4f)
                curveToRelative(16.9f, -0.2f, 33.8f, -0.2f, 50.7f, 0.0f)
                curveToRelative(7.0f, 0.1f, 12.3f, -2.1f, 16.8f, -7.5f)
                curveToRelative(9.3f, -11.1f, 18.7f, -22.3f, 28.4f, -33.1f)
                curveToRelative(3.1f, -3.4f, 5.1f, -7.3f, 2.3f, -11.9f)
                curveToRelative(-48.4f, -43.5f, -97.7f, -85.7f, -153.5f, -119.6f)
                curveToRelative(-2.6f, -1.6f, -5.5f, -2.7f, -8.1f, -4.3f)
                curveToRelative(-15.6f, -9.6f, -29.9f, -7.0f, -44.2f, 3.5f)
                curveToRelative(-28.2f, 20.9f, -52.6f, 45.8f, -76.8f, 70.9f)
                curveTo(680.0f, 310.6f, 669.4f, 322.9f, 658.5f, 334.9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF86a32d)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(328.9f, 303.4f)
                curveToRelative(10.5f, 8.9f, 21.0f, 17.8f, 31.6f, 26.5f)
                curveToRelative(5.7f, 4.7f, 12.0f, 8.9f, 17.3f, 14.0f)
                curveToRelative(4.0f, 4.0f, 6.6f, 4.6f, 10.5f, 0.1f)
                curveToRelative(8.5f, -9.7f, 18.8f, -17.6f, 26.5f, -28.0f)
                curveToRelative(-12.3f, -9.9f, -25.8f, -17.9f, -39.7f, -25.4f)
                curveToRelative(-12.1f, -6.5f, -23.1f, -5.4f, -33.7f, 2.7f)
                curveTo(337.2f, 296.6f, 333.1f, 300.0f, 328.9f, 303.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF90af2c)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(1596.3f, 267.7f)
                curveToRelative(1.2f, -0.8f, 2.5f, -1.4f, 3.7f, -2.0f)
                verticalLineTo(393.9f)
                curveToRelative(-2.5f, 0.0f, -5.0f, 0.0f, -7.4f, 0.1f)
                curveToRelative(-3.6f, 0.1f, -7.5f, -1.1f, -10.8f, 1.6f)
                curveToRelative(-2.7f, 2.9f, -6.2f, 2.0f, -9.5f, 2.1f)
                curveToRelative(-29.3f, 0.2f, -58.5f, -0.2f, -87.8f, -0.8f)
                arcToRelative(45.0f, 45.0f, 0.0f, false, false, -15.0f, 1.7f)
                curveToRelative(-37.1f, 1.9f, -74.3f, 0.6f, -111.4f, 0.7f)
                arcToRelative(8.8f, 8.8f, 0.0f, false, true, -8.2f, -3.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, 0.1f, -0.6f)
                curveToRelative(1.4f, -6.4f, 7.0f, -4.6f, 11.0f, -4.7f)
                quadToRelative(31.4f, -0.6f, 62.8f, -0.1f)
                curveToRelative(8.6f, 0.1f, 15.3f, -2.4f, 21.9f, -8.2f)
                curveToRelative(20.1f, -17.5f, 39.7f, -35.7f, 60.8f, -51.9f)
                curveToRelative(4.7f, 3.0f, 6.6f, -1.5f, 9.2f, -3.6f)
                curveTo(1541.9f, 306.4f, 1567.6f, 285.1f, 1596.3f, 267.7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF86a32d)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(1506.5f, 330.8f)
                curveToRelative(-3.3f, 10.7f, -13.8f, 14.3f, -20.9f, 21.1f)
                curveToRelative(-13.1f, 12.5f, -27.5f, 23.6f, -40.9f, 35.9f)
                curveToRelative(-4.6f, 4.2f, -8.9f, 6.3f, -15.1f, 6.2f)
                curveToRelative(-22.9f, -0.3f, -45.8f, -0.2f, -68.8f, -0.1f)
                curveToRelative(-3.6f, 0.0f, -7.5f, -1.1f, -10.7f, 1.5f)
                curveToRelative(-1.5f, 3.0f, -4.3f, 3.7f, -7.2f, 4.3f)
                curveToRelative(-9.8f, -0.6f, -19.6f, -0.2f, -29.3f, -1.5f)
                curveToRelative(-7.9f, -2.5f, -16.1f, -1.3f, -24.1f, -1.4f)
                curveToRelative(-16.9f, -0.2f, -33.8f, -0.2f, -50.7f, 0.0f)
                curveToRelative(-7.0f, 0.1f, -12.3f, -2.1f, -16.8f, -7.5f)
                curveToRelative(-9.3f, -11.1f, -18.7f, -22.3f, -28.4f, -33.1f)
                curveToRelative(-3.1f, -3.4f, -5.1f, -7.3f, -2.3f, -11.9f)
                curveToRelative(48.4f, -43.5f, 97.7f, -85.7f, 153.5f, -119.6f)
                curveToRelative(2.6f, -1.6f, 5.5f, -2.7f, 8.0f, -4.3f)
                curveToRelative(15.6f, -9.6f, 29.9f, -7.0f, 44.2f, 3.5f)
                curveToRelative(28.2f, 20.9f, 52.6f, 45.8f, 76.8f, 70.9f)
                curveTo(1485.0f, 306.5f, 1495.6f, 318.8f, 1506.5f, 330.8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF90af2c)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(1302.9f, 393.9f)
                curveToRelative(-19.5f, -0.1f, -39.2f, -1.1f, -58.6f, 0.3f)
                curveToRelative(-12.0f, 0.9f, -19.0f, -4.5f, -25.1f, -12.7f)
                curveToRelative(-2.8f, -3.8f, -6.7f, -6.9f, -9.0f, -10.9f)
                curveToRelative(-5.4f, -9.5f, -17.6f, -14.1f, -19.1f, -26.4f)
                curveToRelative(-3.3f, 1.6f, -4.9f, -0.7f, -6.8f, -2.7f)
                curveToRelative(-18.0f, -19.4f, -35.6f, -39.1f, -54.2f, -57.8f)
                curveToRelative(-15.2f, -15.3f, -29.6f, -31.6f, -48.3f, -42.9f)
                verticalLineToRelative(4.8f)
                curveToRelative(-18.2f, 11.2f, -32.3f, 27.2f, -47.2f, 42.1f)
                curveToRelative(-18.6f, 18.7f, -36.2f, 38.5f, -54.2f, 57.8f)
                curveToRelative(-1.9f, 2.0f, -3.5f, 4.3f, -6.8f, 2.7f)
                curveToRelative(-1.5f, 12.3f, -13.7f, 16.9f, -19.1f, 26.4f)
                curveToRelative(-2.3f, 4.0f, -6.1f, 7.0f, -9.0f, 10.9f)
                curveToRelative(-6.1f, 8.3f, -13.1f, 13.6f, -25.1f, 12.7f)
                curveToRelative(-19.4f, -1.4f, -39.1f, -0.4f, -58.6f, -0.3f)
                curveToRelative(-3.6f, 0.0f, -7.5f, -1.2f, -10.6f, 1.9f)
                curveToRelative(3.7f, 4.0f, 8.6f, 3.6f, 13.3f, 3.6f)
                curveToRelative(68.9f, 0.9f, 137.8f, -3.4f, 206.8f, -2.1f)
                curveToRelative(4.0f, 0.1f, 8.2f, -0.1f, 11.3f, -3.5f)
                curveToRelative(0.0f, -1.1f, 0.0f, -2.3f, 0.0f, -3.4f)
                curveToRelative(3.0f, 2.7f, 6.9f, 2.9f, 10.6f, 2.8f)
                curveToRelative(68.9f, -1.3f, 137.8f, 3.0f, 206.8f, 2.1f)
                curveToRelative(4.7f, -0.1f, 9.6f, 0.3f, 13.3f, -3.6f)
                curveTo(1310.4f, 392.7f, 1306.5f, 394.0f, 1302.9f, 393.9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFc6c6c6)), stroke = null, fillAlpha = 0.86f,
                strokeAlpha =
                0.86f,
                strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero,
            ) {
                moveTo(1578.8f, 187.9f)
                curveToRelative(0.7f, -43.2f, 0.2f, -86.3f, 0.3f, -129.5f)
                curveToRelative(0.0f, -3.6f, -1.4f, -4.8f, -4.7f, -4.8f)
                curveToRelative(-8.2f, 0.1f, -16.3f, 0.1f, -24.5f, 0.0f)
                curveToRelative(-4.3f, -0.1f, -5.5f, 1.9f, -5.5f, 5.8f)
                curveToRelative(0.0f, 2.3f, 0.0f, 4.6f, 0.0f, 6.8f)
                curveToRelative(0.0f, 4.6f, -0.1f, 9.1f, 0.0f, 13.7f)
                curveToRelative(0.1f, 3.6f, -1.1f, 5.8f, -4.3f, 7.6f)
                curveTo(1528.0f, 94.2f, 1516.0f, 101.3f, 1504.0f, 108.2f)
                lineToRelative(-5.0f, 2.9f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-13.2f, 7.6f, -26.3f, 15.3f, -39.6f, 22.7f)
                curveToRelative(-5.3f, 2.9f, -10.1f, 7.2f, -16.8f, 7.1f)
                horizontalLineToRelative(-0.7f)
                curveToRelative(-12.4f, -0.1f, -24.9f, -0.1f, -37.3f, 0.0f)
                arcTo(14.7f, 14.7f, 0.0f, false, true, 1397.0f, 139.0f)
                lineToRelative(-29.6f, -17.0f)
                quadToRelative(-29.9f, -17.1f, -59.7f, -34.1f)
                curveToRelative(-2.8f, -1.6f, -4.0f, -3.6f, -3.9f, -6.8f)
                curveToRelative(0.2f, -7.0f, 0.0f, -14.0f, 0.2f, -21.0f)
                curveToRelative(0.1f, -5.6f, -0.4f, -6.3f, -6.2f, -6.3f)
                curveToRelative(-7.2f, 0.0f, -14.3f, 0.0f, -21.5f, 0.0f)
                curveToRelative(-6.8f, 0.0f, -6.9f, 0.1f, -6.9f, 7.1f)
                quadToRelative(0.0f, 71.0f, 0.0f, 142.0f)
                arcToRelative(176.8f, 176.8f, 0.0f, false, true, -2.3f, 26.8f)
                curveToRelative(-5.0f, 32.3f, -17.1f, 62.0f, -32.4f, 90.4f)
                quadToRelative(-2.5f, 4.6f, -5.0f, 9.1f)
                curveToRelative(-8.1f, 14.4f, -17.0f, 28.3f, -26.2f, 42.0f)
                lineToRelative(-0.5f, 0.8f)
                curveToRelative(-3.8f, 5.7f, -7.7f, 11.3f, -11.6f, 16.9f)
                curveToRelative(-16.9f, 24.3f, -34.0f, 48.3f, -52.9f, 71.0f)
                quadToRelative(-4.6f, 5.5f, -9.3f, 10.9f)
                arcToRelative(9.1f, 9.1f, 0.0f, false, false, -2.6f, 6.3f)
                curveToRelative(0.1f, 11.7f, 0.0f, 23.3f, 0.2f, 35.0f)
                curveToRelative(0.1f, 7.0f, 0.6f, 7.3f, 7.5f, 7.3f)
                horizontalLineToRelative(160.5f)
                curveToRelative(7.0f, 0.0f, 14.0f, 0.0f, 21.0f, 0.0f)
                curveToRelative(1.6f, 0.0f, 3.8f, 0.4f, 4.4f, -1.5f)
                curveToRelative(1.2f, -4.1f, 4.4f, -3.4f, 7.3f, -3.4f)
                horizontalLineToRelative(0.3f)
                curveToRelative(-2.3f, -1.7f, -1.3f, -4.0f, -0.4f, -6.3f)
                horizontalLineToRelative(-0.2f)
                curveToRelative(-5.2f, 0.0f, -6.4f, -1.8f, -6.4f, -6.7f)
                quadToRelative(0.0f, -20.6f, 0.1f, -41.1f)
                quadToRelative(0.1f, -62.9f, 0.0f, -125.8f)
                lineTo(1320.8f, 322.8f)
                curveToRelative(0.0f, -6.6f, 0.0f, -6.6f, 6.7f, -6.6f)
                horizontalLineToRelative(97.0f)
                curveToRelative(32.3f, 0.0f, 64.7f, 0.1f, 97.0f, -0.1f)
                curveToRelative(4.9f, 0.0f, 6.2f, 1.6f, 6.1f, 6.3f)
                quadToRelative(-0.2f, 70.0f, -0.1f, 139.9f)
                quadToRelative(0.0f, 19.5f, 0.1f, 39.0f)
                curveToRelative(0.0f, 4.8f, -1.3f, 6.5f, -5.9f, 6.6f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, true, 1.0f, 6.3f)
                curveToRelative(1.8f, -0.1f, 3.8f, -0.5f, 4.6f, 1.4f)
                curveToRelative(1.6f, 3.9f, 4.8f, 3.5f, 7.9f, 3.5f)
                horizontalLineToRelative(64.5f)
                lineTo(1599.8f, 290.8f)
                curveTo(1585.8f, 258.1f, 1578.2f, 224.2f, 1578.8f, 187.9f)
                close()
                moveTo(1451.2f, 145.4f)
                quadToRelative(30.9f, -17.6f, 61.7f, -35.2f)
                arcToRelative(0.0f, 0.0f, 0.0f, false, true, 0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                quadToRelative(13.6f, -7.8f, 27.1f, -15.6f)
                curveToRelative(4.0f, -2.3f, 4.6f, -1.1f, 4.6f, 2.9f)
                curveToRelative(0.0f, 0.9f, 0.0f, 1.9f, 0.0f, 2.8f)
                curveToRelative(-0.1f, 20.7f, 0.0f, 41.4f, 0.0f, 62.1f)
                quadToRelative(0.0f, 32.5f, 0.0f, 65.0f)
                curveToRelative(0.0f, 5.4f, -0.3f, 5.6f, -5.2f, 2.8f)
                quadToRelative(-43.8f, -25.0f, -87.5f, -50.0f)
                curveToRelative(-2.9f, -1.6f, -4.3f, -3.7f, -4.2f, -7.2f)
                quadToRelative(0.1f, -4.1f, 0.1f, -8.2f)
                curveToRelative(0.0f, -4.3f, 0.0f, -8.5f, -0.1f, -12.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.5f, -3.3f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 1451.2f, 145.4f)
                close()
                moveTo(1424.2f, 144.9f)
                curveToRelative(2.5f, 0.0f, 5.3f, -0.3f, 5.2f, 3.6f)
                curveToRelative(0.0f, 4.7f, 0.0f, 9.3f, 0.0f, 14.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(0.8f)
                curveToRelative(0.0f, 4.2f, -0.1f, 8.5f, 0.0f, 12.7f)
                curveToRelative(0.1f, 3.8f, -2.3f, 3.8f, -5.0f, 3.8f)
                reflectiveCurveToRelative(-5.6f, 0.4f, -5.5f, -3.8f)
                quadToRelative(0.0f, -6.7f, 0.1f, -13.4f)
                quadToRelative(0.0f, -7.0f, 0.0f, -14.1f)
                curveTo(1418.9f, 144.7f, 1421.6f, 144.9f, 1424.1f, 144.9f)
                close()
                moveTo(1303.8f, 97.8f)
                curveToRelative(0.0f, -5.3f, 0.1f, -5.3f, 4.7f, -2.7f)
                quadToRelative(23.9f, 13.7f, 47.9f, 27.4f)
                lineToRelative(40.5f, 23.2f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, true, 3.8f, 6.5f)
                quadToRelative(-0.1f, 5.9f, -0.1f, 11.8f)
                quadToRelative(0.0f, 4.6f, 0.0f, 9.2f)
                curveToRelative(0.0f, 2.8f, -1.2f, 4.5f, -3.7f, 5.9f)
                quadToRelative(-44.6f, 25.5f, -89.1f, 51.3f)
                curveToRelative(-3.0f, 1.7f, -3.9f, 1.6f, -3.9f, -2.2f)
                curveToRelative(0.1f, -22.0f, 0.0f, -44.0f, 0.0f, -66.0f)
                horizontalLineToRelative(-0.2f)
                lineTo(1303.7f, 151.3f)
                quadTo(1303.8f, 124.5f, 1303.8f, 97.8f)
                close()
                moveTo(1288.5f, 507.3f)
                curveToRelative(0.0f, 5.1f, -1.5f, 6.5f, -6.5f, 6.4f)
                curveToRelative(-14.0f, -0.3f, -14.0f, -0.1f, -14.0f, -13.9f)
                lineTo(1268.0f, 485.3f)
                arcToRelative(222.1f, 222.1f, 0.0f, false, true, 0.2f, -25.0f)
                curveToRelative(0.8f, -13.2f, 2.4f, -26.4f, 3.6f, -39.6f)
                curveToRelative(2.6f, -27.6f, 1.7f, -55.2f, 1.9f, -82.8f)
                curveToRelative(0.0f, -0.3f, 0.0f, -0.6f, 0.0f, -0.9f)
                curveToRelative(0.0f, -5.8f, 0.3f, -5.8f, 6.5f, -5.9f)
                horizontalLineToRelative(0.0f)
                curveToRelative(4.3f, 0.0f, 8.7f, 0.1f, 13.0f, 0.0f)
                curveToRelative(2.9f, -0.1f, 4.4f, 1.0f, 4.3f, 4.0f)
                curveToRelative(-0.2f, 17.1f, 0.4f, 34.3f, -1.0f, 51.4f)
                curveToRelative(-0.9f, 11.1f, -1.6f, 22.2f, -2.7f, 33.3f)
                curveToRelative(-1.2f, 11.3f, -3.2f, 22.4f, -4.3f, 33.6f)
                curveToRelative(-0.2f, 2.3f, -0.4f, 4.6f, -0.6f, 6.8f)
                curveTo(1287.8f, 475.9f, 1288.3f, 491.6f, 1288.5f, 507.3f)
                close()
                moveTo(1296.4f, 512.7f)
                curveToRelative(-2.5f, 0.0f, -1.5f, -2.5f, -1.5f, -3.9f)
                curveToRelative(0.3f, -16.1f, -0.6f, -32.3f, 0.3f, -48.5f)
                curveToRelative(0.2f, -3.6f, 0.5f, -7.3f, 0.9f, -10.9f)
                curveToRelative(0.2f, -1.8f, 0.6f, -3.5f, 0.9f, -5.3f)
                lineToRelative(0.7f, 0.3f)
                verticalLineToRelative(15.8f)
                quadToRelative(0.0f, 24.3f, 0.0f, 48.6f)
                curveTo(1297.6f, 510.3f, 1298.2f, 512.7f, 1296.4f, 512.7f)
                close()
                moveTo(1310.7f, 256.7f)
                curveToRelative(-6.9f, 0.0f, -6.3f, -0.1f, -7.1f, -6.9f)
                curveToRelative(-0.9f, -8.4f, 3.0f, -12.2f, 10.0f, -16.0f)
                curveToRelative(26.1f, -14.4f, 51.8f, -29.6f, 77.5f, -44.5f)
                curveToRelative(5.8f, -3.3f, 11.2f, -6.0f, 18.5f, -5.3f)
                curveToRelative(10.7f, 1.1f, 21.6f, 0.3f, 32.5f, 0.2f)
                arcToRelative(17.9f, 17.9f, 0.0f, false, true, 9.5f, 2.5f)
                curveToRelative(29.4f, 16.9f, 58.8f, 33.9f, 88.4f, 50.6f)
                curveToRelative(4.7f, 2.7f, 4.5f, 6.4f, 4.5f, 10.6f)
                curveToRelative(-0.1f, 8.9f, 0.0f, 8.9f, -8.9f, 8.9f)
                horizontalLineToRelative(-225.0f)
                close()
                moveTo(1552.0f, 513.4f)
                curveToRelative(-2.6f, -0.1f, -1.8f, -2.5f, -1.8f, -3.9f)
                quadToRelative(-0.1f, -23.5f, -0.1f, -47.1f)
                quadToRelative(0.0f, -12.7f, 0.0f, -25.5f)
                arcToRelative(177.7f, 177.7f, 0.0f, false, true, 3.5f, 25.4f)
                curveToRelative(1.1f, 15.7f, 0.6f, 31.3f, 0.6f, 47.0f)
                curveTo(1554.3f, 511.0f, 1554.9f, 513.4f, 1552.0f, 513.4f)
                close()
                moveTo(1580.5f, 509.9f)
                curveToRelative(0.0f, 2.9f, -1.5f, 3.7f, -4.1f, 3.7f)
                curveToRelative(-4.0f, -0.1f, -8.0f, -0.2f, -12.0f, 0.0f)
                curveToRelative(-3.6f, 0.2f, -4.6f, -1.5f, -4.6f, -4.8f)
                curveToRelative(0.1f, -10.0f, -0.2f, -20.0f, 0.1f, -30.0f)
                curveToRelative(0.1f, -5.6f, -0.1f, -11.1f, -0.5f, -16.6f)
                curveToRelative(-0.8f, -11.1f, -2.4f, -22.1f, -3.8f, -33.1f)
                curveToRelative(-1.9f, -14.9f, -3.0f, -29.8f, -3.8f, -44.7f)
                curveToRelative(-0.8f, -15.8f, -1.1f, -31.6f, -1.9f, -47.3f)
                curveToRelative(-0.1f, -2.5f, 0.2f, -4.1f, 1.3f, -5.0f)
                reflectiveCurveToRelative(2.4f, -1.1f, 4.6f, -0.9f)
                arcToRelative(114.6f, 114.6f, 0.0f, false, false, 14.0f, 0.0f)
                curveToRelative(3.5f, -0.2f, 4.7f, 1.3f, 4.7f, 4.7f)
                curveToRelative(-0.1f, 4.7f, -0.1f, 9.4f, -0.1f, 14.4f)
                curveToRelative(0.0f, 5.5f, 0.0f, 11.5f, 0.0f, 18.5f)
                curveToRelative(-0.8f, 27.3f, 2.8f, 57.7f, 5.4f, 88.2f)
                curveToRelative(0.1f, 1.7f, 0.3f, 3.4f, 0.4f, 5.1f)
                curveTo(1581.2f, 477.9f, 1580.4f, 494.0f, 1580.5f, 509.9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1d1d1b)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(1499.7f, 661.4f)
                lineTo(1506.3f, 662.5f)
            }
            path(
                fill = SolidColor(Color(0xFFf9eaaf)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(716.8f, 579.5f)
                lineToRelative(0.0f, 30.1f)
                lineToRelative(-4.4f, 0.4f)
                lineToRelative(-46.9f, 0.0f)
                lineToRelative(0.0f, -25.0f)
                lineToRelative(51.3f, -5.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFfff9db)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(752.7f, 584.6f)
                lineToRelative(0.0f, 25.4f)
                lineToRelative(-40.5f, 0.0f)
                lineToRelative(0.0f, -28.0f)
                lineToRelative(22.3f, -24.5f)
                lineToRelative(18.2f, 27.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFcc4417)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(755.2f, 587.3f)
                lineToRelative(-0.5f, 1.1f)
                lineToRelative(-1.9f, 0.0f)
                lineToRelative(-19.3f, -28.2f)
                lineToRelative(1.1f, -1.5f)
                lineToRelative(20.7f, 28.7f)
                close()
            }
            path(
                fill = linearGradient(
                    0.0f to Color(0xFFEB5B1D),
                    1.0f to Color(0xFFE73E18),
                    start =
                    Offset(711.4f, 557.3f),
                    end = Offset(688.1f, 584.1f),
                ),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(734.8f, 558.3f)
                lineToRelative(-0.3f, -2.6f)
                lineToRelative(-50.7f, 0.4f)
                lineToRelative(-25.3f, 32.3f)
                lineToRelative(54.6f, 0.0f)
                lineToRelative(21.7f, -30.1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFf28a1a)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(711.4f, 588.4f)
                lineToRelative(23.1f, -32.7f)
                lineToRelative(23.6f, 32.7f)
                lineToRelative(-3.5f, 0.0f)
                lineToRelative(-19.9f, -28.8f)
                lineToRelative(-19.9f, 28.8f)
                lineToRelative(-3.5f, 0.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFcc6635)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(730.1f, 576.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(5.7f)
                horizontalLineToRelative(-6.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFcc6635)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(697.5f, 592.0f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(5.6f)
                horizontalLineToRelative(-6.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFcc6635)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(675.8f, 592.0f)
                horizontalLineToRelative(6.4f)
                verticalLineToRelative(5.6f)
                horizontalLineToRelative(-6.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFd4c389)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(216.1f, 498.1f)
                lineToRelative(3.9f, 5.0f)
                lineToRelative(0.1f, 1.0f)
                lineToRelative(-6.9f, 0.0f)
                lineToRelative(2.9f, -6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFfff9db)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(189.3f, 519.2f)
                lineToRelative(2.0f, 3.4f)
                lineToRelative(25.8f, -0.5f)
                lineToRelative(0.0f, -23.6f)
                lineToRelative(-9.3f, -11.2f)
                lineToRelative(-2.3f, -3.0f)
                lineToRelative(-17.3f, 0.0f)
                lineToRelative(1.1f, 35.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFf9eaaf)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(155.7f, 502.2f)
                lineToRelative(0.0f, 20.5f)
                lineToRelative(35.6f, 0.0f)
                lineToRelative(0.0f, -24.5f)
                lineToRelative(-35.6f, 4.1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFd4c389)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(203.9f, 485.6f)
                lineToRelative(13.2f, 16.9f)
                lineToRelative(0.0f, -2.9f)
                lineToRelative(-12.6f, -15.3f)
                lineToRelative(-0.6f, 1.3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFfdcc68)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(187.7f, 501.3f)
                lineToRelative(-0.6f, 1.5f)
                lineToRelative(2.8f, 1.5f)
                lineToRelative(15.6f, -20.1f)
                lineToRelative(-0.4f, -1.6f)
                lineToRelative(-1.9f, 0.3f)
                lineToRelative(-15.5f, 18.3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFec6669)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(151.9f, 501.6f)
                lineToRelative(-2.4f, 1.0f)
                lineToRelative(1.1f, 1.5f)
                lineToRelative(39.3f, 0.1f)
                lineToRelative(-0.7f, -1.6f)
                lineToRelative(-1.7f, -0.9f)
                lineToRelative(-35.6f, -0.1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFf3956a)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(205.1f, 482.7f)
                lineToRelative(-37.3f, 0.0f)
                lineToRelative(-18.3f, 20.0f)
                lineToRelative(39.7f, 0.0f)
                lineToRelative(15.9f, -20.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFfdcc68)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(205.1f, 482.7f)
                lineToRelative(0.2f, 0.2f)
                lineToRelative(15.9f, 20.2f)
                lineToRelative(-1.1f, 1.0f)
                lineToRelative(-15.7f, -19.7f)
                lineToRelative(0.7f, -1.7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFd4c389)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(216.6f, 501.9f)
                lineToRelative(1.0f, 1.4f)
                lineToRelative(0.6f, -1.7f)
                lineToRelative(-1.5f, -1.9f)
                lineToRelative(-0.1f, 2.2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFcc6635)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(161.7f, 506.7f)
                horizontalLineToRelative(3.7f)
                verticalLineToRelative(3.2f)
                horizontalLineToRelative(-3.7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFcc6635)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(178.7f, 506.7f)
                horizontalLineToRelative(3.7f)
                verticalLineToRelative(3.2f)
                horizontalLineToRelative(-3.7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFcc6635)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(203.0f, 493.9f)
                horizontalLineToRelative(3.1f)
                verticalLineToRelative(4.3f)
                horizontalLineToRelative(-3.1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFd4c389)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(506.8f, 432.0f)
                lineToRelative(1.5f, 1.9f)
                lineToRelative(0.1f, 0.4f)
                lineToRelative(-2.7f, 0.0f)
                lineToRelative(1.1f, -2.3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFfff9db)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(496.4f, 440.2f)
                lineToRelative(0.8f, 1.3f)
                lineToRelative(10.0f, -0.2f)
                lineToRelative(0.0f, -9.1f)
                lineToRelative(-3.6f, -4.4f)
                lineToRelative(-0.9f, -1.2f)
                lineToRelative(-6.7f, 0.0f)
                lineToRelative(0.4f, 13.6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFf9eaaf)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(483.4f, 433.6f)
                lineToRelative(0.0f, 7.9f)
                lineToRelative(13.8f, 0.0f)
                lineToRelative(0.0f, -9.5f)
                lineToRelative(-13.8f, 1.6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFd4c389)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(502.1f, 427.2f)
                lineToRelative(5.1f, 6.6f)
                lineToRelative(0.0f, -1.1f)
                lineToRelative(-4.9f, -5.9f)
                lineToRelative(-0.2f, 0.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFfdcc68)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(495.8f, 433.3f)
                lineToRelative(-0.2f, 0.6f)
                lineToRelative(1.1f, 0.6f)
                lineToRelative(6.0f, -7.8f)
                lineToRelative(-0.1f, -0.6f)
                lineToRelative(-0.7f, 0.1f)
                lineToRelative(-6.0f, 7.1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFec6669)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(481.9f, 433.4f)
                lineToRelative(-0.9f, 0.4f)
                lineToRelative(0.4f, 0.6f)
                lineToRelative(15.2f, 0.0f)
                lineToRelative(-0.3f, -0.6f)
                lineToRelative(-0.7f, -0.4f)
                lineToRelative(-13.8f, -0.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFf3956a)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(502.5f, 426.1f)
                lineToRelative(-14.5f, 0.0f)
                lineToRelative(-7.1f, 7.8f)
                lineToRelative(15.4f, 0.0f)
                lineToRelative(6.2f, -7.8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFfdcc68)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(502.5f, 426.1f)
                lineToRelative(0.1f, 0.1f)
                lineToRelative(6.2f, 7.8f)
                lineToRelative(-0.4f, 0.4f)
                lineToRelative(-6.1f, -7.6f)
                lineToRelative(0.3f, -0.6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFd4c389)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(507.0f, 433.5f)
                lineToRelative(0.4f, 0.5f)
                lineToRelative(0.2f, -0.7f)
                lineToRelative(-0.6f, -0.7f)
                lineToRelative(-0.0f, 0.9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFcc6635)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(485.7f, 435.4f)
                horizontalLineToRelative(1.4f)
                verticalLineToRelative(1.3f)
                horizontalLineToRelative(-1.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFcc6635)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(492.3f, 435.4f)
                horizontalLineToRelative(1.4f)
                verticalLineToRelative(1.3f)
                horizontalLineToRelative(-1.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFcc6635)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(501.7f, 430.4f)
                horizontalLineToRelative(1.2f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF464B46)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(786.6f, 720.0f)
                lineToRelative(213.5f, 0.0f)
                reflectiveCurveToRelative(36.2f, -1.9f, 111.8f, -45.0f)
                curveToRelative(67.9f, -38.7f, 262.0f, -34.3f, 346.4f, -111.3f)
                curveToRelative(29.4f, -26.8f, 62.3f, -163.4f, 62.3f, -163.4f)
                horizontalLineToRelative(-45.6f)
                reflectiveCurveToRelative(-81.6f, 97.7f, -112.0f, 124.9f)
                curveToRelative(-38.7f, 34.6f, -325.3f, 28.1f, -393.6f, 63.8f)
                curveTo(894.7f, 627.9f, 786.6f, 720.0f, 786.6f, 720.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCBD5CB)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(1497.8f, 400.3f)
                quadToRelative(-11.6f, 20.5f, -23.8f, 40.6f)
                lineToRelative(-0.3f, -0.2f)
                quadTo(1485.9f, 420.6f, 1497.8f, 400.3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCBD5CB)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(1425.7f, 514.9f)
                curveToRelative(-4.3f, 6.0f, -8.8f, 11.9f, -13.5f, 17.6f)
                arcToRelative(144.1f, 144.1f, 0.0f, false, true, -15.1f, 16.2f)
                arcToRelative(108.5f, 108.5f, 0.0f, false, true, -18.5f, 12.4f)
                arcToRelative(181.1f, 181.1f, 0.0f, false, true, -20.1f, 9.3f)
                lineToRelative(-0.7f, -1.7f)
                arcToRelative(181.1f, 181.1f, 0.0f, false, false, 20.0f, -9.1f)
                arcToRelative(107.1f, 107.1f, 0.0f, false, false, 18.3f, -12.0f)
                arcToRelative(140.8f, 140.8f, 0.0f, false, false, 15.1f, -16.0f)
                curveToRelative(4.7f, -5.6f, 9.2f, -11.5f, 13.6f, -17.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCBD5CB)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(1272.8f, 592.0f)
                curveToRelative(-29.1f, 4.7f, -58.5f, 7.9f, -87.8f, 11.0f)
                lineToRelative(-0.3f, -3.4f)
                curveToRelative(29.3f, -2.8f, 58.6f, -5.8f, 87.7f, -10.2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCBD5CB)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(1097.2f, 612.7f)
                curveToRelative(-14.6f, 2.0f, -29.1f, 4.3f, -43.3f, 7.6f)
                arcToRelative(215.6f, 215.6f, 0.0f, false, false, -21.1f, 5.8f)
                lineToRelative(-2.6f, 0.9f)
                lineToRelative(-2.5f, 1.0f)
                curveToRelative(-1.7f, 0.6f, -3.3f, 1.4f, -5.0f, 2.0f)
                curveToRelative(-0.8f, 0.3f, -1.6f, 0.8f, -2.4f, 1.1f)
                reflectiveCurveToRelative(-1.6f, 0.7f, -2.4f, 1.2f)
                lineToRelative(-2.4f, 1.3f)
                curveToRelative(-0.8f, 0.4f, -1.6f, 0.9f, -2.4f, 1.4f)
                lineToRelative(-2.5f, -4.4f)
                lineToRelative(2.4f, -1.3f)
                lineToRelative(2.5f, -1.3f)
                curveToRelative(0.8f, -0.5f, 1.7f, -0.8f, 2.6f, -1.2f)
                reflectiveCurveToRelative(1.7f, -0.8f, 2.6f, -1.2f)
                curveToRelative(1.7f, -0.7f, 3.5f, -1.5f, 5.2f, -2.1f)
                lineToRelative(2.6f, -1.0f)
                lineToRelative(2.7f, -0.9f)
                arcToRelative(220.8f, 220.8f, 0.0f, false, true, 21.6f, -5.8f)
                curveToRelative(14.5f, -3.2f, 29.1f, -5.3f, 43.8f, -7.2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCBD5CB)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(938.7f, 682.3f)
                curveToRelative(-3.1f, 2.3f, -6.2f, 4.7f, -9.2f, 7.1f)
                curveToRelative(-1.5f, 1.2f, -3.0f, 2.4f, -4.5f, 3.7f)
                reflectiveCurveToRelative(-2.9f, 2.5f, -4.3f, 3.8f)
                reflectiveCurveToRelative(-2.8f, 2.6f, -4.2f, 3.9f)
                reflectiveCurveToRelative(-2.7f, 2.7f, -3.9f, 4.1f)
                arcToRelative(44.4f, 44.4f, 0.0f, false, false, -3.4f, 4.3f)
                curveToRelative(-0.4f, 0.7f, -0.9f, 1.4f, -1.2f, 2.1f)
                curveToRelative(-0.1f, 0.2f, -0.1f, 0.3f, -0.2f, 0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.2f, 0.4f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.3f, -0.1f, 0.3f)
                reflectiveCurveToRelative(0.0f, 0.1f, 0.0f, 0.0f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.0f, -0.1f)
                verticalLineToRelative(-0.1f)
                curveToRelative(0.0f, -0.1f, 0.0f, -0.3f, 0.0f, -0.4f)
                lineTo(900.6f, 713.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 0.0f, -0.6f)
                verticalLineToRelative(-0.3f)
                lineToRelative(0.0f, -0.5f)
                curveToRelative(0.0f, -0.3f, 0.1f, -0.4f, 0.1f, -0.7f)
                arcToRelative(9.8f, 9.8f, 0.0f, false, true, 0.3f, -1.1f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 0.4f, -0.9f)
                curveToRelative(0.1f, -0.3f, 0.3f, -0.6f, 0.4f, -0.9f)
                arcToRelative(28.6f, 28.6f, 0.0f, false, true, 1.8f, -2.9f)
                arcToRelative(54.4f, 54.4f, 0.0f, false, true, 4.0f, -4.9f)
                curveToRelative(1.4f, -1.5f, 2.8f, -3.0f, 4.3f, -4.4f)
                reflectiveCurveToRelative(2.9f, -2.8f, 4.5f, -4.0f)
                reflectiveCurveToRelative(3.0f, -2.6f, 4.6f, -3.9f)
                reflectiveCurveToRelative(3.1f, -2.5f, 4.7f, -3.7f)
                curveToRelative(3.1f, -2.5f, 6.3f, -4.8f, 9.5f, -7.1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCBD5CB)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(1477.9f, 399.8f)
                quadToRelative(-29.0f, 39.0f, -59.2f, 77.2f)
                curveToRelative(-10.1f, 12.7f, -20.4f, 25.2f, -31.0f, 37.5f)
                curveToRelative(-5.3f, 6.1f, -10.8f, 12.1f, -16.6f, 17.8f)
                curveToRelative(-0.7f, 0.7f, -1.5f, 1.4f, -2.2f, 2.1f)
                reflectiveCurveToRelative(-1.5f, 1.4f, -2.3f, 2.1f)
                arcToRelative(33.6f, 33.6f, 0.0f, false, true, -5.2f, 3.4f)
                arcToRelative(73.8f, 73.8f, 0.0f, false, true, -11.3f, 4.8f)
                arcToRelative(195.6f, 195.6f, 0.0f, false, true, -23.6f, 6.2f)
                curveToRelative(-8.0f, 1.6f, -16.0f, 3.0f, -24.0f, 4.2f)
                curveToRelative(-16.1f, 2.4f, -32.2f, 4.2f, -48.3f, 5.8f)
                curveToRelative(-32.3f, 3.2f, -64.6f, 5.7f, -96.9f, 8.5f)
                reflectiveCurveToRelative(-64.6f, 5.6f, -96.6f, 10.0f)
                curveToRelative(-16.0f, 2.2f, -32.0f, 4.8f, -47.6f, 8.6f)
                arcToRelative(180.9f, 180.9f, 0.0f, false, false, -22.9f, 6.9f)
                curveToRelative(-1.9f, 0.7f, -3.7f, 1.5f, -5.4f, 2.3f)
                reflectiveCurveToRelative(-3.5f, 1.7f, -5.3f, 2.7f)
                lineToRelative(-5.3f, 2.9f)
                lineToRelative(-5.3f, 3.0f)
                curveToRelative(-14.0f, 8.0f, -27.7f, 16.6f, -41.2f, 25.5f)
                reflectiveCurveToRelative(-26.7f, 18.2f, -39.9f, 27.6f)
                reflectiveCurveToRelative(-26.1f, 19.1f, -38.9f, 29.0f)
                reflectiveCurveToRelative(-25.5f, 19.9f, -38.0f, 30.1f)
                lineToRelative(-4.4f, -5.4f)
                curveToRelative(12.7f, -10.2f, 25.5f, -20.1f, 38.5f, -29.9f)
                reflectiveCurveToRelative(26.1f, -19.4f, 39.3f, -28.8f)
                reflectiveCurveToRelative(26.7f, -18.5f, 40.3f, -27.4f)
                reflectiveCurveToRelative(27.5f, -17.3f, 41.7f, -25.3f)
                lineToRelative(5.3f, -3.0f)
                lineToRelative(5.4f, -2.9f)
                curveToRelative(1.8f, -0.9f, 3.6f, -1.9f, 5.6f, -2.8f)
                reflectiveCurveToRelative(3.8f, -1.7f, 5.8f, -2.4f)
                arcToRelative(188.4f, 188.4f, 0.0f, false, true, 23.6f, -6.9f)
                curveToRelative(15.9f, -3.7f, 32.0f, -6.1f, 48.1f, -8.2f)
                curveToRelative(32.2f, -4.1f, 64.6f, -6.7f, 96.9f, -9.2f)
                reflectiveCurveToRelative(64.7f, -4.7f, 96.9f, -7.6f)
                curveToRelative(16.1f, -1.5f, 32.2f, -3.2f, 48.3f, -5.4f)
                curveToRelative(8.0f, -1.1f, 16.0f, -2.4f, 23.9f, -3.9f)
                arcToRelative(195.8f, 195.8f, 0.0f, false, false, 23.5f, -5.9f)
                arcToRelative(72.3f, 72.3f, 0.0f, false, false, 11.1f, -4.6f)
                arcToRelative(31.6f, 31.6f, 0.0f, false, false, 5.0f, -3.2f)
                curveToRelative(0.8f, -0.6f, 1.5f, -1.3f, 2.2f, -2.0f)
                reflectiveCurveToRelative(1.5f, -1.4f, 2.2f, -2.1f)
                curveToRelative(5.8f, -5.6f, 11.3f, -11.6f, 16.7f, -17.6f)
                curveToRelative(10.7f, -12.1f, 21.1f, -24.6f, 31.3f, -37.2f)
                quadTo(1448.7f, 438.6f, 1477.9f, 399.8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCBD5CB)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(983.9f, 710.0f)
                quadToRelative(20.1f, -5.3f, 40.1f, -11.3f)
                curveToRelative(13.3f, -4.0f, 26.5f, -8.2f, 39.6f, -12.8f)
                curveToRelative(6.5f, -2.3f, 13.0f, -4.8f, 19.3f, -7.5f)
                curveToRelative(3.1f, -1.4f, 6.3f, -2.8f, 9.2f, -4.5f)
                arcToRelative(49.2f, 49.2f, 0.0f, false, false, 4.3f, -2.6f)
                arcToRelative(23.8f, 23.8f, 0.0f, false, false, 1.9f, -1.4f)
                curveToRelative(0.3f, -0.3f, 0.6f, -0.5f, 0.8f, -0.8f)
                lineToRelative(0.9f, -1.0f)
                arcToRelative(23.5f, 23.5f, 0.0f, false, true, 4.7f, -3.3f)
                curveToRelative(1.6f, -0.9f, 3.2f, -1.7f, 4.8f, -2.4f)
                curveToRelative(3.3f, -1.5f, 6.6f, -2.7f, 9.9f, -3.9f)
                curveToRelative(6.6f, -2.3f, 13.3f, -4.4f, 20.0f, -6.3f)
                curveToRelative(13.4f, -3.8f, 27.0f, -7.2f, 40.5f, -10.4f)
                reflectiveCurveToRelative(27.1f, -6.4f, 40.7f, -9.5f)
                curveToRelative(27.1f, -6.2f, 54.3f, -12.1f, 81.4f, -18.4f)
                reflectiveCurveToRelative(54.1f, -12.8f, 80.8f, -20.5f)
                arcToRelative(402.6f, 402.6f, 0.0f, false, false, 39.5f, -13.3f)
                curveToRelative(3.2f, -1.3f, 6.4f, -2.7f, 9.4f, -4.3f)
                curveToRelative(1.5f, -0.8f, 3.0f, -1.6f, 4.5f, -2.5f)
                arcToRelative(30.7f, 30.7f, 0.0f, false, false, 4.1f, -3.0f)
                curveToRelative(5.1f, -4.5f, 9.3f, -10.2f, 13.1f, -16.0f)
                curveToRelative(7.5f, -11.6f, 13.7f, -24.1f, 19.5f, -36.7f)
                reflectiveCurveToRelative(11.0f, -25.5f, 16.1f, -38.5f)
                quadToRelative(15.0f, -38.9f, 27.2f, -78.9f)
                quadToRelative(-12.0f, 40.0f, -26.6f, 79.1f)
                curveToRelative(-4.9f, 13.0f, -10.1f, 25.9f, -15.8f, 38.6f)
                reflectiveCurveToRelative(-11.9f, 25.2f, -19.4f, 37.0f)
                curveToRelative(-3.8f, 5.8f, -7.9f, 11.6f, -13.2f, 16.3f)
                arcToRelative(30.7f, 30.7f, 0.0f, false, true, -4.3f, 3.2f)
                curveToRelative(-1.5f, 0.9f, -3.0f, 1.7f, -4.6f, 2.5f)
                curveToRelative(-3.1f, 1.6f, -6.3f, 3.0f, -9.5f, 4.4f)
                arcToRelative(399.1f, 399.1f, 0.0f, false, true, -39.5f, 13.6f)
                curveToRelative(-26.7f, 7.9f, -53.7f, 14.6f, -80.8f, 21.1f)
                reflectiveCurveToRelative(-54.2f, 12.7f, -81.3f, 19.1f)
                curveToRelative(-13.5f, 3.2f, -27.1f, 6.4f, -40.5f, 9.8f)
                reflectiveCurveToRelative(-26.9f, 6.8f, -40.3f, 10.7f)
                curveToRelative(-6.7f, 2.0f, -13.3f, 4.0f, -19.7f, 6.4f)
                curveToRelative(-3.2f, 1.2f, -6.4f, 2.4f, -9.5f, 3.8f)
                curveToRelative(-1.5f, 0.7f, -3.0f, 1.5f, -4.5f, 2.3f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, -3.8f, 2.7f)
                lineToRelative(-0.9f, 0.9f)
                curveToRelative(-0.3f, 0.4f, -0.7f, 0.7f, -1.1f, 1.0f)
                curveToRelative(-0.7f, 0.6f, -1.5f, 1.2f, -2.2f, 1.7f)
                curveToRelative(-1.5f, 1.0f, -3.1f, 2.0f, -4.6f, 2.8f)
                curveToRelative(-3.1f, 1.7f, -6.3f, 3.2f, -9.5f, 4.7f)
                curveToRelative(-6.4f, 2.9f, -13.0f, 5.4f, -19.5f, 7.8f)
                curveToRelative(-13.1f, 4.8f, -26.4f, 9.1f, -39.7f, 13.2f)
                reflectiveCurveToRelative(-26.7f, 8.0f, -40.2f, 11.6f)
                close()
            }
        }
            .build()
        return _bg2!!
    }

private var _bg2: ImageVector? = null
