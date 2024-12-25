package com.mshdabiola.ludo.screen.game.component.head

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

fun Head.getYellow(iconColor: Long, accentColor: Long): ImageVector {
    return Builder(
        name = "Yellow5",
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
            moveTo(191.0f, 70.59f)
            reflectiveCurveToRelative(-1.0f, 4.75f, -7.24f, 7.0f)
            curveToRelative(-3.0f, 1.75f, -6.48f, 8.74f, -7.0f, 9.25f)
            curveToRelative(0.25f, 0.25f, 3.74f, 0.0f, 7.23f, 3.24f)
            curveToRelative(-1.74f, 7.24f, -2.74f, 9.24f, -2.74f, 9.24f)
            curveToRelative(-4.73f, 4.5f, -9.23f, 9.49f, -11.72f, 15.48f)
            curveToRelative(-3.0f, 4.0f, -2.49f, 9.49f, -5.49f, 13.24f)
            curveToRelative(-0.25f, 1.5f, -1.5f, 2.75f, -2.24f, 4.0f)
            curveToRelative(-1.25f, 2.24f, -3.74f, 2.24f, -5.0f, 4.24f)
            curveToRelative(-1.25f, 0.75f, -1.5f, 2.0f, -2.0f, 3.0f)
            curveToRelative(0.0f, 0.0f, 0.0f, 0.5f, -3.74f, 8.74f)
            curveToRelative(-0.25f, 0.75f, -0.5f, 3.25f, -0.75f, 3.75f)
            curveToRelative(0.0f, 0.0f, 0.0f, 1.25f, -0.25f, 3.49f)
            curveToRelative(-0.5f, 3.75f, -2.0f, 6.0f, -3.0f, 8.49f)
            arcToRelative(0.61f, 0.61f, 0.0f, false, true, -1.0f, -0.25f)
            curveToRelative(2.0f, -3.24f, 0.0f, -7.73f, 1.75f, -11.23f)
            curveToRelative(1.0f, -3.0f, 4.49f, -13.74f, 5.0f, -15.49f)
            arcToRelative(22.0f, 22.0f, 0.0f, false, true, 2.0f, -5.74f)
            reflectiveCurveToRelative(1.75f, -4.75f, 6.0f, -13.49f)
            curveToRelative(0.74f, -2.25f, 4.49f, -11.74f, 5.23f, -14.23f)
            curveToRelative(1.5f, -4.5f, 1.25f, -6.24f, 1.0f, -6.49f)
            curveToRelative(-1.25f, 5.74f, -3.5f, 10.73f, -6.0f, 16.0f)
            curveToRelative(-2.0f, 4.74f, -4.75f, 9.24f, -7.23f, 14.0f)
            arcToRelative(74.83f, 74.83f, 0.0f, false, false, -3.75f, 12.74f)
            curveToRelative(-1.0f, 2.74f, -1.49f, 1.0f, -1.49f, 0.5f)
            arcToRelative(32.0f, 32.0f, 0.0f, false, false, -0.26f, -5.0f)
            arcToRelative(63.53f, 63.53f, 0.0f, false, false, -2.0f, 7.74f)
            arcToRelative(23.09f, 23.09f, 0.0f, false, true, -0.5f, 7.24f)
            arcToRelative(33.2f, 33.2f, 0.0f, false, true, -1.0f, 4.0f)
            curveToRelative(-0.74f, 2.5f, -2.0f, 5.25f, -2.74f, 7.75f)
            curveToRelative(-0.5f, 1.0f, -0.5f, 2.25f, -1.25f, 3.24f)
            curveToRelative(-1.74f, -0.25f, 0.0f, -6.24f, -1.24f, -7.49f)
            curveToRelative(0.0f, 4.75f, -3.49f, 10.0f, -3.74f, 10.74f)
            curveToRelative(-0.76f, 0.75f, -1.5f, 2.0f, -2.5f, 2.25f)
            curveToRelative(-0.75f, 2.0f, -0.75f, 4.24f, -1.25f, 6.24f)
            curveToRelative(-2.0f, 6.75f, -11.0f, 18.73f, -14.0f, 20.23f)
            curveToRelative(-4.0f, 2.0f, -8.48f, 3.75f, -13.0f, 2.75f)
            curveToRelative(0.0f, 0.0f, -2.25f, -0.25f, -7.74f, -1.5f)
            curveToRelative(-8.48f, -2.25f, -11.0f, -5.49f, -12.0f, -6.0f)
            curveToRelative(-4.49f, -2.75f, -7.48f, -8.0f, -10.22f, -12.49f)
            curveToRelative(-1.75f, -3.25f, -2.25f, -8.24f, -7.74f, -15.0f)
            curveToRelative(-3.49f, -6.49f, -3.0f, -7.74f, -3.0f, -7.74f)
            arcToRelative(5.56f, 5.56f, 0.0f, false, true, 0.25f, -2.0f)
            arcToRelative(66.61f, 66.61f, 0.0f, false, false, -0.75f, -7.0f)
            arcToRelative(32.1f, 32.1f, 0.0f, false, false, -3.24f, -8.49f)
            curveToRelative(-0.5f, 0.0f, -7.73f, -14.73f, -8.48f, -16.0f)
            curveToRelative(0.0f, 0.0f, 0.0f, 0.5f, 5.0f, 11.49f)
            curveToRelative(0.5f, 1.24f, 3.74f, 7.48f, 4.74f, 14.48f)
            curveToRelative(0.0f, 1.0f, 0.5f, 7.0f, -0.5f, 7.74f)
            arcToRelative(0.92f, 0.92f, 0.0f, false, true, -0.75f, 0.25f)
            curveToRelative(-0.5f, -0.25f, -0.5f, -1.0f, -0.5f, -1.49f)
            arcToRelative(64.28f, 64.28f, 0.0f, false, false, -3.74f, -9.0f)
            lineToRelative(-3.74f, -6.25f)
            curveToRelative(-0.25f, 0.5f, 1.0f, 3.5f, 0.49f, 4.49f)
            curveToRelative(-0.49f, 0.0f, -0.49f, -0.74f, -1.0f, -1.0f)
            curveToRelative(-2.5f, -2.25f, -6.0f, -5.25f, -7.49f, -8.25f)
            curveToRelative(-0.49f, -0.49f, -3.24f, -8.24f, -3.49f, -8.49f)
            curveToRelative(0.0f, 0.5f, 0.5f, 1.75f, -0.74f, 1.75f)
            curveToRelative(-0.26f, -0.25f, -3.25f, -0.5f, -6.49f, -11.74f)
            curveToRelative(-1.25f, -7.49f, -1.5f, -8.24f, -1.5f, -8.24f)
            arcToRelative(26.85f, 26.85f, 0.0f, false, true, -2.74f, -3.25f)
            curveToRelative(-1.5f, -4.0f, -1.5f, -8.74f, -1.0f, -13.23f)
            arcToRelative(21.63f, 21.63f, 0.0f, false, true, -1.74f, -2.5f)
            arcToRelative(17.67f, 17.67f, 0.0f, false, false, 0.5f, 6.25f)
            curveToRelative(0.5f, 2.0f, 0.0f, 4.49f, 0.25f, 6.74f)
            curveToRelative(1.49f, 4.0f, 5.23f, 7.0f, 5.23f, 11.48f)
            curveToRelative(-0.75f, 0.5f, -1.49f, 1.26f, -2.74f, 1.0f)
            curveToRelative(-0.5f, -0.25f, -1.5f, 0.26f, -4.49f, -1.0f)
            curveToRelative(-3.24f, -1.75f, -6.48f, -8.0f, -18.46f, -10.48f)
            curveToRelative(0.0f, -1.0f, -0.25f, -1.75f, 0.5f, -2.5f)
            curveToRelative(1.25f, -0.5f, 5.0f, -5.0f, 6.0f, -5.75f)
            curveToRelative(1.49f, -1.24f, 5.24f, -3.0f, 5.49f, -3.24f)
            curveToRelative(-0.75f, 0.0f, -1.5f, -0.25f, -2.0f, 0.0f)
            arcToRelative(3.7f, 3.7f, 0.0f, false, false, -3.49f, 0.75f)
            arcToRelative(0.54f, 0.54f, 0.0f, false, true, -0.5f, -0.5f)
            curveToRelative(0.0f, -1.75f, 1.5f, -2.5f, 2.74f, -3.25f)
            curveToRelative(2.25f, -0.75f, 4.49f, -0.75f, 6.49f, -1.75f)
            curveToRelative(-3.49f, -0.5f, -7.0f, -3.0f, -7.24f, -3.75f)
            curveToRelative(-6.0f, -7.0f, -3.73f, -20.47f, -6.23f, -26.0f)
            curveToRelative(-1.75f, -3.51f, -3.24f, -11.74f, -3.74f, -16.0f)
            curveToRelative(-0.5f, -2.5f, 0.0f, -5.74f, 0.0f, -8.49f)
            curveToRelative(0.0f, 0.0f, 1.74f, -8.74f, 7.0f, -12.0f)
            curveToRelative(5.0f, -3.0f, 13.0f, -2.25f, 18.0f, 0.75f)
            curveToRelative(4.24f, 0.5f, 8.0f, -1.0f, 12.22f, -1.75f)
            curveToRelative(0.5f, 0.0f, 3.25f, -2.25f, 4.49f, -3.49f)
            curveToRelative(0.5f, -0.25f, 4.49f, -2.25f, 5.24f, -2.75f)
            curveToRelative(-1.5f, 0.25f, -3.24f, 0.25f, -4.49f, 1.0f)
            arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.0f, -1.0f)
            arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.75f, -1.0f)
            arcToRelative(30.0f, 30.0f, 0.0f, false, true, 9.72f, -3.5f)
            curveToRelative(1.0f, -0.24f, 2.25f, -0.24f, 3.25f, -0.5f)
            curveToRelative(-0.5f, -0.25f, -2.74f, -1.0f, -1.0f, -2.0f)
            curveToRelative(2.49f, 0.0f, 5.0f, -0.51f, 7.23f, 0.0f)
            curveToRelative(1.75f, 0.25f, 6.0f, 1.0f, 6.24f, 1.0f)
            curveToRelative(-1.75f, -1.5f, -5.24f, -1.5f, -6.0f, -4.24f)
            arcToRelative(5.88f, 5.88f, 0.0f, false, true, -0.5f, -2.0f)
            curveToRelative(0.5f, -0.25f, 0.75f, 0.0f, 1.25f, 0.25f)
            curveToRelative(5.49f, 3.0f, 14.0f, 5.5f, 14.22f, 5.74f)
            curveToRelative(0.0f, 0.0f, 0.5f, 0.5f, 2.49f, 0.25f)
            arcTo(4.57f, 4.57f, 0.0f, false, false, 83.0f, 6.9f)
            curveToRelative(0.0f, -0.24f, -0.75f, 0.0f, -0.25f, -0.49f)
            reflectiveCurveToRelative(1.25f, 0.0f, 2.0f, 0.0f)
            arcToRelative(7.28f, 7.28f, 0.0f, false, true, 4.0f, 1.75f)
            arcTo(8.49f, 8.49f, 0.0f, false, false, 86.0f, 3.66f)
            arcToRelative(0.24f, 0.24f, 0.0f, false, true, 0.25f, -0.25f)
            curveToRelative(2.0f, 0.5f, 3.24f, 2.25f, 4.74f, 3.49f)
            arcTo(23.88f, 23.88f, 0.0f, false, false, 93.7f, 9.4f)
            arcToRelative(19.32f, 19.32f, 0.0f, false, true, 2.75f, -4.0f)
            curveToRelative(0.74f, -0.75f, 1.5f, -1.25f, 2.24f, -2.0f)
            curveToRelative(0.5f, -0.25f, 0.5f, 0.25f, 0.75f, 0.5f)
            curveTo(98.0f, 5.41f, 97.69f, 7.41f, 97.69f, 9.4f)
            curveToRelative(1.25f, -1.0f, 1.5f, -2.25f, 2.5f, -3.24f)
            curveToRelative(0.25f, -0.5f, 2.74f, -5.0f, 6.0f, -6.0f)
            curveToRelative(0.75f, -0.25f, 1.25f, -0.25f, 1.25f, 0.26f)
            curveToRelative(-0.25f, 0.49f, -3.74f, 4.48f, -4.49f, 6.0f)
            arcToRelative(15.0f, 15.0f, 0.0f, false, false, 3.24f, -0.75f)
            lineToRelative(4.24f, -3.75f)
            curveToRelative(1.5f, -0.75f, 3.5f, -3.0f, 4.25f, -0.5f)
            arcToRelative(7.31f, 7.31f, 0.0f, false, false, -3.5f, 3.74f)
            curveToRelative(3.0f, 0.26f, 4.49f, 0.26f, 4.49f, 0.26f)
            curveToRelative(0.75f, 0.5f, -0.75f, 1.25f, 0.25f, 1.49f)
            arcToRelative(7.19f, 7.19f, 0.0f, false, true, 2.0f, -0.24f)
            curveToRelative(0.49f, -0.25f, 7.48f, 0.24f, 8.73f, 0.0f)
            curveToRelative(0.25f, 0.0f, 0.25f, 0.24f, 0.5f, 0.24f)
            curveToRelative(0.0f, 0.0f, 0.0f, 0.51f, -1.25f, 1.5f)
            arcToRelative(15.28f, 15.28f, 0.0f, false, false, 3.49f, 0.25f)
            arcToRelative(30.63f, 30.63f, 0.0f, false, false, 4.74f, 0.5f)
            curveToRelative(0.75f, 0.25f, 1.25f, 0.0f, 1.0f, 0.76f)
            curveToRelative(-0.74f, 0.49f, -1.0f, 0.24f, -1.49f, 0.74f)
            arcToRelative(13.82f, 13.82f, 0.0f, false, true, -1.24f, 0.75f)
            arcToRelative(88.75f, 88.75f, 0.0f, false, true, 8.72f, 2.5f)
            curveToRelative(2.24f, 0.25f, 6.49f, 2.74f, 6.24f, 3.0f)
            curveToRelative(-0.75f, 0.51f, -2.24f, 0.26f, -3.0f, 0.76f)
            arcToRelative(48.29f, 48.29f, 0.0f, false, false, 5.48f, 1.75f)
            curveToRelative(0.0f, 0.49f, -1.5f, 0.49f, -2.0f, 0.49f)
            curveToRelative(1.25f, 1.0f, 2.74f, 1.75f, 4.0f, 2.75f)
            curveToRelative(2.0f, 1.75f, 4.0f, 3.5f, 6.0f, 5.49f)
            arcToRelative(26.88f, 26.88f, 0.0f, false, false, 4.49f, 0.0f)
            curveToRelative(3.0f, -0.49f, 7.24f, -0.74f, 10.48f, -1.5f)
            curveToRelative(0.25f, 0.0f, 7.73f, -1.0f, 11.47f, 0.0f)
            curveToRelative(7.0f, 3.25f, 9.23f, 7.25f, 9.23f, 7.25f)
            curveToRelative(2.25f, 4.0f, 1.0f, 16.73f, 1.0f, 22.23f)
            curveToRelative(-0.25f, 5.49f, -2.49f, 10.0f, -3.49f, 14.48f)
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
            moveTo(191.73f, 34.88f)
            curveToRelative(-2.5f, -3.75f, -5.0f, -5.75f, -7.49f, -6.5f)
            curveToRelative(-2.74f, -1.0f, -5.0f, -0.5f, -7.48f, -0.5f)
            arcToRelative(23.41f, 23.41f, 0.0f, false, false, -5.49f, 0.5f)
            curveToRelative(-3.49f, 1.0f, -6.23f, 3.5f, -9.47f, 5.25f)
            arcToRelative(10.94f, 10.94f, 0.0f, false, false, -3.74f, 3.0f)
            curveToRelative(0.74f, 1.75f, 2.0f, 2.74f, 2.74f, 4.0f)
            curveToRelative(1.25f, 1.25f, 6.73f, -2.0f, 9.48f, -3.49f)
            curveToRelative(10.72f, -6.25f, 11.22f, -5.0f, 13.71f, -4.5f)
            curveToRelative(2.75f, 0.5f, 5.0f, 3.75f, 5.49f, 6.49f)
            curveToRelative(0.5f, 3.0f, 2.5f, 15.49f, 0.0f, 16.0f)
            curveToRelative(0.0f, 0.0f, -1.24f, 0.0f, -5.24f, -6.49f)
            curveToRelative(-0.25f, 0.0f, -6.0f, -6.0f, -9.0f, -8.24f)
            curveToRelative(-6.73f, -3.0f, -8.48f, 3.75f, -8.48f, 4.5f)
            curveToRelative(0.0f, 0.0f, -0.75f, 3.24f, 1.75f, 11.49f)
            curveToRelative(0.0f, 3.49f, 1.5f, 4.49f, 1.5f, 4.49f)
            arcToRelative(7.32f, 7.32f, 0.0f, false, false, 3.24f, 0.5f)
            curveToRelative(0.75f, -0.75f, 1.24f, -2.0f, 2.24f, -2.75f)
            curveToRelative(-0.25f, -0.24f, 1.5f, -2.0f, -1.25f, -4.49f)
            curveToRelative(-1.24f, -2.25f, -4.0f, -2.75f, -5.0f, -5.25f)
            curveToRelative(-0.25f, -0.5f, -1.0f, -1.0f, -1.0f, -1.74f)
            horizontalLineToRelative(0.5f)
            arcToRelative(28.32f, 28.32f, 0.0f, false, false, 7.0f, 5.49f)
            arcToRelative(5.0f, 5.0f, 0.0f, false, true, 2.75f, 4.49f)
            curveToRelative(0.0f, 1.75f, -1.5f, 2.75f, -2.24f, 4.25f)
            curveToRelative(-0.51f, 2.0f, -1.5f, 4.5f, -0.26f, 6.75f)
            curveToRelative(0.0f, 0.49f, 0.0f, 1.0f, -0.5f, 1.24f)
            curveToRelative(-0.74f, 0.0f, -1.49f, -0.25f, -2.0f, 0.5f)
            arcToRelative(6.21f, 6.21f, 0.0f, false, false, -1.75f, 6.25f)
            reflectiveCurveToRelative(-0.25f, 1.0f, -2.74f, 1.25f)
            arcToRelative(19.0f, 19.0f, 0.0f, false, false, 0.75f, 4.0f)
            curveToRelative(4.0f, -1.5f, 3.24f, -6.75f, 7.0f, -5.74f)
            curveToRelative(1.75f, -0.25f, 1.25f, -2.75f, 1.5f, -4.25f)
            curveToRelative(0.0f, -2.25f, -0.25f, -4.75f, -0.25f, -6.74f)
            curveToRelative(0.25f, -2.25f, 3.0f, -4.0f, 1.74f, -6.5f)
            curveToRelative(0.0f, -1.0f, 1.25f, -1.0f, 1.75f, -1.49f)
            curveToRelative(1.75f, 0.49f, 2.24f, -2.25f, 2.49f, -2.25f)
            lineToRelative(5.0f, 2.49f)
            curveToRelative(-0.25f, 0.0f, -5.0f, 11.0f, -5.0f, 11.0f)
            curveToRelative(-0.25f, 2.49f, -4.24f, 5.74f, -4.24f, 5.74f)
            arcToRelative(9.3f, 9.3f, 0.0f, false, true, -0.25f, 2.74f)
            curveToRelative(-0.5f, 1.75f, -4.24f, 1.0f, -4.0f, 3.0f)
            curveTo(174.0f, 84.57f, 171.0f, 87.08f, 170.0f, 87.57f)
            lineToRelative(-0.25f, 4.0f)
            curveToRelative(0.75f, -0.25f, 1.49f, -1.25f, 2.24f, -1.75f)
            curveToRelative(1.5f, -1.25f, 3.0f, -2.25f, 4.0f, -4.0f)
            curveToRelative(1.75f, -3.0f, 3.74f, -6.49f, 7.0f, -8.48f)
            arcToRelative(6.6f, 6.6f, 0.0f, false, true, 1.24f, -1.51f)
            curveToRelative(4.24f, -3.24f, 5.0f, -5.49f, 5.0f, -5.49f)
            curveToRelative(1.25f, -3.25f, 3.5f, -11.0f, 3.5f, -15.0f)
            reflectiveCurveToRelative(1.49f, -16.73f, -1.0f, -20.48f)
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
            moveTo(159.3f, 46.37f)
            curveToRelative(-1.24f, -4.5f, -5.48f, -8.5f, -9.48f, -10.5f)
            verticalLineToRelative(-0.24f)
            curveToRelative(0.25f, -0.5f, 1.0f, -0.5f, 1.75f, -0.25f)
            curveToRelative(1.0f, 0.25f, 2.25f, 0.0f, 3.0f, 0.49f)
            arcToRelative(14.22f, 14.22f, 0.0f, false, false, -5.0f, -4.49f)
            curveToRelative(-0.74f, -0.75f, -2.24f, -0.5f, -2.74f, -1.25f)
            curveToRelative(0.5f, -1.0f, 1.49f, -0.25f, 2.25f, -0.5f)
            lineToRelative(-1.0f, -1.5f)
            curveToRelative(-2.74f, -2.49f, -5.49f, -6.0f, -9.48f, -5.49f)
            curveToRelative(-0.75f, 0.0f, -1.5f, 0.75f, -2.24f, 0.5f)
            curveToRelative(0.0f, -0.25f, 0.24f, -0.5f, 0.0f, -0.75f)
            arcToRelative(6.74f, 6.74f, 0.0f, false, true, 4.24f, -1.5f)
            arcToRelative(20.14f, 20.14f, 0.0f, false, false, -6.49f, -1.49f)
            curveToRelative(-1.25f, -0.25f, -2.5f, 0.74f, -3.24f, -0.25f)
            arcToRelative(2.25f, 2.25f, 0.0f, false, false, 1.24f, -1.0f)
            curveToRelative(1.25f, -0.5f, 2.5f, 0.24f, 3.5f, -0.25f)
            curveToRelative(-3.5f, -1.0f, -11.0f, -1.51f, -12.47f, -1.51f)
            curveToRelative(-0.75f, -0.24f, 0.0f, -1.24f, 0.49f, -1.49f)
            curveToRelative(0.0f, 0.0f, 0.5f, -0.25f, 4.24f, -0.5f)
            arcToRelative(5.0f, 5.0f, 0.0f, false, false, -2.74f, -0.75f)
            curveToRelative(-3.74f, -0.25f, -6.74f, 2.25f, -10.72f, 1.5f)
            arcToRelative(1.9f, 1.9f, 0.0f, false, true, -0.5f, -1.0f)
            curveToRelative(0.25f, -0.5f, 0.75f, -0.75f, 1.24f, -1.25f)
            curveToRelative(2.25f, -0.5f, 2.0f, -1.0f, 2.0f, -1.0f)
            arcToRelative(59.72f, 59.72f, 0.0f, false, false, -11.48f, 0.5f)
            curveToRelative(-2.49f, 0.75f, -4.74f, 2.75f, -7.0f, 4.24f)
            arcToRelative(7.76f, 7.76f, 0.0f, false, true, -2.0f, 0.51f)
            curveToRelative(-1.25f, 0.5f, -3.25f, 0.5f, -3.75f, 2.25f)
            curveToRelative(-0.25f, 0.24f, -0.74f, 0.49f, -1.0f, 0.24f)
            curveToRelative(-1.0f, -0.74f, -0.5f, -2.24f, -1.0f, -3.0f)
            arcToRelative(6.7f, 6.7f, 0.0f, false, false, -6.0f, -1.74f)
            curveToRelative(0.0f, 0.5f, 1.0f, 0.5f, 0.49f, 1.0f)
            curveToRelative(-0.25f, 0.74f, -1.0f, 0.25f, -1.49f, 0.25f)
            curveToRelative(-1.25f, -0.5f, -2.25f, 0.0f, -3.49f, 0.24f)
            arcToRelative(26.77f, 26.77f, 0.0f, false, true, -3.25f, 1.0f)
            curveToRelative(0.5f, 0.5f, 2.25f, 1.0f, 2.0f, 1.75f)
            arcToRelative(15.29f, 15.29f, 0.0f, false, false, -3.24f, 0.74f)
            curveToRelative(0.5f, 0.25f, 1.25f, 1.75f, 1.5f, 1.75f)
            curveToRelative(0.0f, 0.75f, -0.75f, 1.0f, -1.25f, 1.0f)
            curveToRelative(0.0f, 0.5f, 0.75f, 1.75f, 1.25f, 1.75f)
            curveToRelative(0.0f, 0.0f, 0.25f, 0.5f, -0.5f, 1.25f)
            arcToRelative(38.24f, 38.24f, 0.0f, false, false, 9.0f, 5.49f)
            curveToRelative(-2.0f, -2.24f, -3.49f, -4.5f, -5.73f, -6.49f)
            arcToRelative(8.77f, 8.77f, 0.0f, false, false, -1.25f, -2.0f)
            curveToRelative(0.0f, -0.5f, 0.75f, -0.5f, 1.0f, -0.5f)
            arcToRelative(32.0f, 32.0f, 0.0f, false, true, 5.23f, 1.5f)
            curveToRelative(3.0f, 0.75f, 4.24f, 4.24f, 5.24f, 6.74f)
            curveToRelative(0.5f, 0.75f, 0.5f, 2.0f, 1.25f, 2.75f)
            curveToRelative(-1.25f, -4.49f, -2.25f, -8.74f, -3.24f, -13.24f)
            curveToRelative(-0.25f, -0.25f, 0.0f, -0.49f, 0.0f, -0.74f)
            arcToRelative(1.48f, 1.48f, 0.0f, false, true, 1.0f, 0.25f)
            arcToRelative(44.0f, 44.0f, 0.0f, false, true, 3.24f, 9.73f)
            curveToRelative(0.25f, -3.0f, 0.25f, -6.24f, 1.75f, -8.74f)
            curveToRelative(0.25f, -0.25f, 1.0f, -0.25f, 1.0f, 0.0f)
            curveToRelative(-0.75f, 3.5f, -0.5f, 7.0f, -0.5f, 10.24f)
            curveToRelative(1.25f, -4.0f, 2.0f, -8.24f, 5.49f, -11.23f)
            arcToRelative(26.83f, 26.83f, 0.0f, false, true, 6.73f, -2.51f)
            lineToRelative(0.5f, 0.51f)
            curveToRelative(0.25f, 0.25f, 0.0f, 0.5f, -0.25f, 0.5f)
            arcToRelative(20.76f, 20.76f, 0.0f, false, false, -6.74f, 8.73f)
            curveToRelative(3.75f, -2.49f, 6.74f, -6.24f, 11.0f, -7.48f)
            arcToRelative(0.62f, 0.62f, 0.0f, false, true, 1.0f, 0.25f)
            curveToRelative(0.25f, 0.74f, -0.75f, 1.24f, -1.0f, 1.74f)
            arcToRelative(16.24f, 16.24f, 0.0f, false, true, 7.23f, -1.74f)
            curveToRelative(1.0f, 0.24f, 2.5f, 0.0f, 3.0f, 1.24f)
            arcToRelative(14.93f, 14.93f, 0.0f, false, true, -2.75f, 1.5f)
            horizontalLineToRelative(4.0f)
            curveToRelative(0.24f, 0.25f, 1.0f, 0.5f, 0.74f, 1.0f)
            curveToRelative(-1.0f, 0.75f, -2.0f, 1.25f, -2.74f, 1.75f)
            arcToRelative(16.13f, 16.13f, 0.0f, false, true, 5.0f, -0.5f)
            curveToRelative(2.0f, 0.5f, 4.24f, 0.5f, 6.24f, 1.75f)
            arcToRelative(0.92f, 0.92f, 0.0f, false, true, -0.51f, 1.25f)
            arcToRelative(18.35f, 18.35f, 0.0f, false, false, -4.48f, 1.5f)
            curveToRelative(3.49f, -0.76f, 7.72f, -1.5f, 11.22f, -0.25f)
            lineToRelative(0.5f, 0.25f)
            curveToRelative(0.25f, 1.0f, -1.0f, 1.0f, -1.5f, 1.74f)
            curveToRelative(3.0f, 0.25f, 3.24f, 0.25f, 3.24f, 0.25f)
            arcToRelative(7.17f, 7.17f, 0.0f, false, true, 3.5f, 2.0f)
            arcToRelative(0.78f, 0.78f, 0.0f, false, true, 0.0f, 1.0f)
            curveToRelative(-1.0f, 0.0f, -2.25f, 0.5f, -3.25f, 0.5f)
            curveToRelative(2.5f, 1.74f, 7.74f, 2.75f, 8.73f, 5.0f)
            curveToRelative(0.25f, 0.25f, 0.0f, 0.5f, 0.0f, 0.75f)
            arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.24f, -0.75f)
            arcToRelative(10.91f, 10.91f, 0.0f, false, false, 2.49f, 1.75f)
            curveToRelative(3.75f, 1.75f, 6.74f, 5.5f, 10.0f, 8.24f)
            lineToRelative(-0.75f, -3.0f)
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
            moveTo(122.14f, 59.85f)
            curveToRelative(-3.25f, 0.0f, -6.0f, 9.24f, -5.74f, 8.74f)
            curveToRelative(0.0f, 0.0f, 1.25f, -2.49f, 9.23f, -4.24f)
            lineToRelative(-3.49f, -4.5f)
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
            moveTo(128.87f, 70.34f)
            arcToRelative(14.94f, 14.94f, 0.0f, false, false, -4.74f, -1.5f)
            arcToRelative(7.43f, 7.43f, 0.0f, false, false, -2.0f, 1.0f)
            arcToRelative(6.85f, 6.85f, 0.0f, false, true, 6.48f, 2.25f)
            curveToRelative(1.75f, 1.75f, 2.0f, 3.0f, 4.0f, 4.75f)
            curveToRelative(-1.0f, -2.26f, -1.49f, -4.75f, -3.74f, -6.5f)
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
            moveTo(119.14f, 38.12f)
            curveToRelative(-2.74f, 0.26f, -5.49f, -0.5f, -7.73f, 0.51f)
            arcToRelative(15.16f, 15.16f, 0.0f, false, true, -1.25f, -1.0f)
            curveToRelative(-1.49f, -3.0f, -5.0f, -3.24f, -8.0f, -3.49f)
            arcTo(11.12f, 11.12f, 0.0f, false, false, 96.0f, 36.38f)
            curveToRelative(-0.5f, 1.49f, -0.25f, 3.0f, -0.5f, 4.74f)
            verticalLineToRelative(1.5f)
            reflectiveCurveToRelative(5.73f, -3.0f, 10.22f, -1.0f)
            curveToRelative(0.0f, 0.5f, -0.74f, 0.5f, -1.0f, 1.0f)
            curveToRelative(-0.5f, -0.25f, -1.0f, 0.0f, -1.5f, -0.25f)
            curveToRelative(-2.0f, -0.75f, -4.0f, 0.25f, -5.74f, 1.24f)
            arcToRelative(6.58f, 6.58f, 0.0f, false, false, -1.74f, 2.76f)
            curveToRelative(-0.25f, 0.49f, 0.25f, 1.24f, -0.5f, 1.24f)
            curveToRelative(-0.75f, 0.75f, -0.75f, -0.25f, -1.0f, -0.49f)
            curveToRelative(0.0f, 0.0f, -1.5f, -4.5f, -13.22f, -4.0f)
            arcToRelative(0.92f, 0.92f, 0.0f, false, true, 0.25f, -0.75f)
            curveToRelative(1.75f, 0.0f, 3.75f, 0.25f, 5.49f, -0.25f)
            arcToRelative(15.87f, 15.87f, 0.0f, false, false, 3.49f, 0.0f)
            lineTo(93.0f, 43.61f)
            curveToRelative(-0.74f, -4.73f, -2.0f, -6.73f, -2.0f, -6.73f)
            arcToRelative(11.06f, 11.06f, 0.0f, false, false, -8.0f, -1.5f)
            curveToRelative(-2.25f, 1.0f, -5.24f, 1.25f, -7.73f, 2.0f)
            curveToRelative(-2.0f, -1.0f, -3.74f, -3.24f, -6.24f, -2.49f)
            curveToRelative(-3.0f, 1.5f, -6.24f, 2.74f, -8.73f, 5.24f)
            arcToRelative(31.77f, 31.77f, 0.0f, false, true, 7.0f, 0.5f)
            arcToRelative(11.1f, 11.1f, 0.0f, false, true, 8.47f, 2.5f)
            curveToRelative(3.25f, 0.25f, 7.0f, 0.75f, 9.73f, 2.75f)
            curveToRelative(3.25f, -0.25f, 7.0f, 0.25f, 8.73f, 3.49f)
            arcToRelative(7.92f, 7.92f, 0.0f, false, true, 6.73f, -0.5f)
            curveToRelative(1.25f, -0.25f, 2.0f, -1.25f, 3.25f, -1.74f)
            curveToRelative(1.74f, -1.25f, 4.24f, -0.75f, 6.0f, 0.0f)
            arcToRelative(6.54f, 6.54f, 0.0f, false, true, 5.0f, -3.75f)
            curveToRelative(2.0f, -1.25f, 2.5f, -3.5f, 4.0f, -5.0f)
            verticalLineToRelative(-0.26f)
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
            moveTo(122.64f, 73.84f)
            curveToRelative(-1.25f, 0.5f, -1.25f, 1.5f, -1.5f, 2.49f)
            curveToRelative(0.0f, 0.76f, 0.75f, 1.0f, 1.25f, 1.5f)
            arcToRelative(2.52f, 2.52f, 0.0f, false, false, 2.24f, -0.74f)
            arcToRelative(2.66f, 2.66f, 0.0f, false, false, 0.5f, -3.0f)
            curveToRelative(-0.5f, -1.0f, -1.75f, -0.75f, -2.49f, -0.25f)
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
            moveTo(127.87f, 73.84f)
            curveToRelative(-0.49f, 0.74f, 0.25f, 1.25f, 0.0f, 2.25f)
            curveToRelative(0.0f, 1.74f, -1.49f, 2.74f, -3.0f, 3.49f)
            arcToRelative(4.55f, 4.55f, 0.0f, false, true, -4.0f, -0.75f)
            curveToRelative(-1.49f, -0.75f, -1.75f, -2.5f, -1.49f, -4.0f)
            arcToRelative(3.37f, 3.37f, 0.0f, false, false, -1.25f, 1.5f)
            arcToRelative(4.89f, 4.89f, 0.0f, false, false, -0.75f, 3.0f)
            arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.74f, 3.0f)
            curveToRelative(3.0f, 0.0f, 7.48f, -0.25f, 8.73f, -3.75f)
            arcToRelative(5.9f, 5.9f, 0.0f, false, false, -2.0f, -4.74f)
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
            moveTo(118.15f, 69.84f)
            arcToRelative(38.09f, 38.09f, 0.0f, false, false, -3.74f, 3.0f)
            curveToRelative(-1.25f, 1.5f, -2.25f, 3.49f, -4.25f, 4.5f)
            curveToRelative(-1.49f, 1.49f, 1.0f, 2.0f, 1.0f, 3.49f)
            curveToRelative(3.25f, -3.49f, 3.74f, -8.0f, 7.73f, -11.0f)
            horizontalLineToRelative(0.51f)
            curveToRelative(0.24f, -0.25f, -0.51f, -0.5f, -1.25f, 0.0f)
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
            moveTo(128.12f, 93.07f)
            curveToRelative(-1.24f, 0.0f, -2.49f, 0.75f, -3.49f, -0.25f)
            arcToRelative(16.37f, 16.37f, 0.0f, false, false, 7.0f, -4.0f)
            curveToRelative(1.0f, -1.5f, 2.25f, -3.0f, 1.75f, -5.0f)
            curveToRelative(-0.75f, 1.0f, -1.0f, 1.5f, -2.24f, 2.0f)
            curveToRelative(0.0f, 0.5f, -3.25f, 2.25f, -4.0f, 2.5f)
            curveToRelative(-2.5f, 1.0f, -6.0f, 0.25f, -8.24f, -0.75f)
            curveToRelative(2.25f, -0.49f, 4.74f, 0.75f, 7.0f, -0.25f)
            arcToRelative(27.49f, 27.49f, 0.0f, false, false, 6.49f, -5.49f)
            curveToRelative(-2.0f, 0.25f, -3.25f, 1.75f, -5.24f, 2.24f)
            curveToRelative(-3.25f, 1.0f, -6.74f, 1.0f, -9.48f, -1.24f)
            arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.74f, 0.25f)
            curveToRelative(0.25f, 1.74f, 1.74f, 3.24f, 2.74f, 5.0f)
            curveToRelative(2.0f, 1.75f, 3.0f, 2.5f, 3.0f, 2.5f)
            arcToRelative(16.92f, 16.92f, 0.0f, false, false, 3.0f, 2.25f)
            curveToRelative(-3.75f, -0.25f, -7.49f, -1.75f, -8.73f, -5.5f)
            curveToRelative(-0.5f, -2.0f, -1.75f, -2.75f, -1.25f, -1.5f)
            arcToRelative(1.18f, 1.18f, 0.0f, false, true, -0.25f, 1.5f)
            curveToRelative(0.5f, 1.25f, 1.75f, 2.5f, 0.75f, 4.0f)
            arcToRelative(17.46f, 17.46f, 0.0f, false, false, 4.74f, 6.49f)
            curveToRelative(2.24f, 1.0f, 5.24f, 2.0f, 7.73f, 1.0f)
            curveToRelative(1.5f, -1.0f, 2.49f, -3.25f, 4.49f, -3.0f)
            curveToRelative(4.0f, -1.74f, 5.0f, -6.24f, 5.49f, -10.23f)
            curveToRelative(0.0f, 0.0f, -4.49f, 5.49f, -7.49f, 7.49f)
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
            moveTo(66.0f, 12.4f)
            curveToRelative(-6.0f, 3.25f, -8.0f, 4.24f, -8.0f, 4.24f)
            curveToRelative(0.0f, -0.25f, -2.74f, 1.51f, -3.73f, 2.76f)
            lineToRelative(3.0f, -0.76f)
            curveToRelative(0.74f, -0.25f, 1.5f, 0.0f, 1.25f, 0.76f)
            lineToRelative(-3.75f, 2.24f)
            curveToRelative(-1.74f, 1.5f, -2.74f, 2.75f, -4.24f, 4.24f)
            curveToRelative(0.25f, 0.0f, 1.75f, -0.24f, 3.0f, -0.24f)
            curveToRelative(0.25f, 0.0f, 0.25f, 0.24f, 0.5f, 0.5f)
            curveToRelative(-0.5f, 0.74f, -1.75f, 1.25f, -2.25f, 2.0f)
            arcToRelative(5.06f, 5.06f, 0.0f, false, true, -2.0f, 3.5f)
            curveToRelative(-1.0f, 1.75f, -3.24f, 2.0f, -4.49f, 3.5f)
            curveToRelative(-1.74f, 3.0f, -5.0f, 5.49f, -7.48f, 7.74f)
            curveToRelative(-0.5f, 1.25f, -1.74f, 2.0f, -2.0f, 3.25f)
            horizontalLineToRelative(3.49f)
            lineToRelative(2.24f, -1.25f)
            arcToRelative(103.85f, 103.85f, 0.0f, false, true, 12.48f, -9.74f)
            curveToRelative(-1.75f, 0.0f, -1.75f, -0.75f, -1.75f, -0.75f)
            curveToRelative(1.25f, -0.5f, 2.74f, -1.0f, 4.0f, -1.5f)
            curveToRelative(2.75f, -1.75f, 3.0f, -2.25f, 3.0f, -2.25f)
            curveToRelative(-0.24f, 0.0f, -2.0f, 0.0f, -2.24f, -0.5f)
            lineToRelative(-1.5f, -0.5f)
            curveToRelative(4.24f, -1.25f, 5.24f, -2.5f, 5.24f, -2.5f)
            curveToRelative(-0.75f, 0.26f, -2.0f, -0.75f, -2.24f, -0.75f)
            curveToRelative(-0.26f, -0.24f, 0.0f, -0.5f, 0.0f, -0.74f)
            curveToRelative(1.0f, 0.0f, 3.49f, -3.0f, 4.73f, -3.25f)
            arcToRelative(13.19f, 13.19f, 0.0f, false, true, -2.49f, -1.25f)
            curveToRelative(0.25f, -0.25f, 0.0f, -0.5f, 0.25f, -0.75f)
            curveToRelative(0.0f, 0.25f, 2.74f, -1.0f, 3.74f, -1.75f)
            lineTo(68.0f, 16.89f)
            curveToRelative(0.0f, -0.5f, -2.49f, -0.5f, -2.74f, -0.74f)
            curveToRelative(-0.5f, -1.5f, 1.25f, -1.25f, 2.0f, -2.0f)
            curveToRelative(0.49f, -0.25f, 6.0f, -2.25f, 8.23f, -3.0f)
            curveToRelative(-3.0f, 0.0f, -7.0f, -0.25f, -9.48f, 1.25f)
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
            moveTo(108.42f, 88.57f)
            arcToRelative(5.0f, 5.0f, 0.0f, false, false, -2.0f, -1.0f)
            arcToRelative(7.92f, 7.92f, 0.0f, false, false, -3.49f, 0.5f)
            curveToRelative(-1.24f, 0.25f, -2.0f, 1.5f, -3.24f, 1.75f)
            curveToRelative(-2.0f, 0.5f, -3.24f, -1.25f, -5.0f, -0.5f)
            curveToRelative(-3.0f, 2.5f, -5.0f, -2.49f, -8.0f, -1.0f)
            arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.0f, 2.25f)
            lineToRelative(1.74f, -0.5f)
            curveToRelative(1.26f, -0.25f, 2.26f, 1.0f, 3.0f, 2.0f)
            curveToRelative(0.25f, 0.5f, 0.5f, 1.25f, 1.0f, 1.5f)
            arcToRelative(11.17f, 11.17f, 0.0f, false, true, 3.0f, 0.25f)
            arcToRelative(8.19f, 8.19f, 0.0f, false, false, 7.24f, -0.5f)
            curveToRelative(0.49f, -1.5f, 2.0f, -1.75f, 3.24f, -2.0f)
            curveToRelative(1.0f, -1.0f, 2.74f, 0.25f, 3.74f, -1.0f)
            curveToRelative(0.5f, -0.5f, 0.0f, -1.25f, -0.25f, -1.75f)
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
            moveTo(75.0f, 65.1f)
            curveToRelative(-0.5f, -0.26f, -0.75f, -1.0f, -1.25f, -1.75f)
            curveToRelative(-0.75f, -0.5f, -7.0f, 2.0f, -7.23f, 2.0f)
            lineTo(65.0f, 66.84f)
            curveToRelative(7.48f, -0.5f, 10.0f, 2.0f, 10.0f, 2.0f)
            curveToRelative(0.74f, -2.74f, 0.0f, -3.74f, 0.0f, -3.74f)
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
            moveTo(78.74f, 75.83f)
            curveTo(75.0f, 68.84f, 71.0f, 68.34f, 71.0f, 68.34f)
            curveToRelative(-0.75f, 0.25f, -1.26f, 0.25f, -1.5f, 0.5f)
            curveToRelative(1.5f, 0.75f, 2.74f, 2.75f, 4.24f, 3.5f)
            curveToRelative(0.75f, 1.0f, 5.74f, 5.0f, 5.24f, 7.24f)
            curveToRelative(0.24f, 0.25f, 2.24f, 1.25f, 2.49f, 2.0f)
            curveToRelative(0.0f, -0.25f, -1.49f, -4.49f, -2.74f, -5.75f)
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
            moveTo(70.0f, 73.09f)
            arcToRelative(2.15f, 2.15f, 0.0f, false, false, -1.49f, 1.74f)
            arcToRelative(1.58f, 1.58f, 0.0f, false, false, 0.5f, 2.0f)
            arcToRelative(1.65f, 1.65f, 0.0f, false, false, 1.5f, 0.25f)
            arcToRelative(2.41f, 2.41f, 0.0f, false, false, 1.74f, -2.0f)
            curveToRelative(0.25f, -0.75f, -0.74f, -1.75f, -2.25f, -2.0f)
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
            moveTo(74.0f, 75.09f)
            arcToRelative(3.28f, 3.28f, 0.0f, false, true, -0.5f, 3.0f)
            arcToRelative(3.35f, 3.35f, 0.0f, false, true, -3.0f, 1.25f)
            curveToRelative(-1.75f, 0.5f, -3.24f, -0.75f, -4.49f, -2.24f)
            arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.0f, -4.25f)
            curveToRelative(-1.5f, 0.75f, -3.5f, 2.0f, -4.0f, 4.0f)
            curveToRelative(-0.25f, 2.0f, -0.49f, 2.74f, 1.25f, 5.0f)
            curveToRelative(4.0f, 2.24f, 6.74f, 1.25f, 6.74f, 1.25f)
            arcToRelative(14.6f, 14.6f, 0.0f, false, false, 4.49f, -1.0f)
            curveToRelative(0.49f, -0.5f, 2.0f, -0.75f, 1.74f, -2.0f)
            curveToRelative(0.25f, -2.0f, -1.5f, -3.75f, -3.24f, -5.0f)
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
            moveTo(24.86f, 50.12f)
            lineToRelative(1.5f, -1.0f)
            curveToRelative(0.0f, -0.25f, 2.0f, -3.24f, 1.5f, -5.0f)
            curveToRelative(-1.75f, 1.75f, -3.74f, 3.49f, -3.0f, 6.0f)
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
            moveTo(158.31f, 64.35f)
            curveToRelative(-0.51f, -6.0f, -5.0f, -10.49f, -8.74f, -14.48f)
            curveToRelative(-1.49f, -3.75f, -11.72f, -7.75f, -11.72f, -7.75f)
            arcToRelative(20.63f, 20.63f, 0.0f, false, false, -15.0f, -0.25f)
            reflectiveCurveToRelative(-1.0f, 0.25f, -9.73f, 4.75f)
            curveToRelative(-1.75f, 2.0f, -0.5f, 4.49f, 0.25f, 6.49f)
            curveToRelative(-0.25f, 0.5f, 0.5f, 2.0f, -0.5f, 2.0f)
            curveToRelative(-0.25f, -0.25f, -1.5f, -3.74f, -2.5f, -5.23f)
            curveToRelative(-1.0f, 0.25f, -1.74f, -0.76f, -2.24f, -1.26f)
            curveToRelative(-1.25f, -1.0f, -4.24f, 0.25f, -4.49f, 0.25f)
            curveToRelative(-2.5f, 1.75f, -1.0f, 5.75f, -1.5f, 8.74f)
            curveToRelative(-0.25f, 0.0f, -0.74f, 0.5f, -1.0f, 0.5f)
            arcToRelative(7.06f, 7.06f, 0.0f, false, true, -0.74f, -2.49f)
            curveToRelative(0.49f, -2.25f, 0.24f, -4.75f, -1.75f, -6.0f)
            curveToRelative(-1.25f, 0.0f, -2.49f, 0.0f, -3.24f, 0.75f)
            curveToRelative(-0.25f, 0.5f, -0.75f, 1.0f, -0.5f, 1.5f)
            curveToRelative(1.5f, 1.75f, 1.75f, 4.0f, 2.0f, 6.24f)
            arcToRelative(1.27f, 1.27f, 0.0f, false, true, -1.0f, 0.5f)
            curveToRelative(-0.5f, -2.0f, -0.75f, -4.24f, -2.25f, -6.0f)
            curveToRelative(-1.49f, -0.5f, -2.0f, -2.0f, -2.24f, -3.5f)
            curveToRelative(-1.25f, -1.5f, -2.74f, -2.49f, -4.49f, -2.25f)
            arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.24f, 1.75f)
            curveToRelative(-1.25f, 0.5f, -1.0f, 2.25f, -2.5f, 2.0f)
            curveToRelative(-0.25f, -1.25f, 1.5f, -2.5f, 0.5f, -3.75f)
            arcToRelative(35.14f, 35.14f, 0.0f, false, false, -5.24f, -2.49f)
            curveToRelative(-0.5f, 0.25f, -2.24f, -0.25f, -2.74f, -0.25f)
            curveToRelative(-10.23f, -7.0f, -48.64f, -1.75f, -40.16f, 25.0f)
            curveToRelative(0.25f, 0.75f, 0.25f, 1.5f, 0.5f, 2.25f)
            curveToRelative(0.25f, 4.49f, 3.74f, 12.73f, 4.24f, 13.0f)
            arcToRelative(28.53f, 28.53f, 0.0f, false, true, 2.24f, 6.5f)
            arcToRelative(20.86f, 20.86f, 0.0f, false, false, 3.0f, 4.0f)
            arcToRelative(1.36f, 1.36f, 0.0f, false, false, 1.25f, 0.74f)
            arcToRelative(3.68f, 3.68f, 0.0f, false, false, 2.24f, 1.0f)
            curveToRelative(0.5f, 0.25f, 1.25f, 0.25f, 1.74f, 0.74f)
            curveToRelative(-0.74f, -2.49f, -2.0f, -4.74f, -2.24f, -7.24f)
            curveToRelative(-0.75f, 0.0f, -1.0f, -0.75f, -1.74f, -1.25f)
            curveToRelative(0.0f, 0.0f, -0.26f, -3.74f, 2.24f, -5.0f)
            curveToRelative(0.0f, -0.75f, 9.23f, -7.5f, 9.23f, -7.74f)
            arcToRelative(13.5f, 13.5f, 0.0f, false, true, 1.25f, -3.25f)
            curveToRelative(1.0f, -3.25f, 1.49f, -5.24f, 1.49f, -5.24f)
            curveToRelative(-0.25f, -1.0f, -4.24f, -0.76f, -2.74f, -2.0f)
            curveToRelative(1.75f, -0.76f, 5.73f, -4.75f, 9.48f, -4.5f)
            arcToRelative(11.52f, 11.52f, 0.0f, false, true, 8.23f, 1.0f)
            curveToRelative(0.0f, -0.25f, 4.74f, 7.0f, 6.0f, 8.74f)
            arcToRelative(9.37f, 9.37f, 0.0f, false, true, 1.75f, 4.0f)
            curveToRelative(0.75f, 5.5f, 1.25f, 5.75f, 1.25f, 5.75f)
            curveToRelative(1.74f, 1.0f, -1.25f, 1.75f, -0.5f, 3.0f)
            curveToRelative(0.25f, 1.5f, 0.0f, 3.25f, 0.74f, 4.49f)
            curveToRelative(1.25f, -1.24f, 2.25f, -1.0f, 3.74f, -1.24f)
            arcToRelative(4.49f, 4.49f, 0.0f, false, true, 3.75f, 1.74f)
            curveToRelative(1.0f, 0.5f, 1.74f, -0.5f, 3.0f, -0.25f)
            curveToRelative(1.25f, -0.5f, 0.5f, -1.24f, 0.75f, -2.5f)
            curveToRelative(-1.0f, -1.5f, 0.75f, -2.74f, 0.5f, -4.24f)
            curveToRelative(-1.75f, -0.75f, -3.0f, -2.5f, -4.24f, -3.75f)
            arcTo(7.0f, 7.0f, 0.0f, false, false, 90.0f, 75.59f)
            curveToRelative(-1.75f, -1.0f, -2.51f, -3.25f, -2.51f, -5.25f)
            curveToRelative(0.25f, -0.25f, 0.5f, -0.75f, 1.0f, -0.75f)
            curveToRelative(0.49f, 0.25f, 0.0f, 1.0f, 0.25f, 1.5f)
            arcToRelative(3.52f, 3.52f, 0.0f, false, false, 3.49f, 2.25f)
            arcToRelative(16.84f, 16.84f, 0.0f, false, false, 7.0f, 0.0f)
            curveToRelative(-0.25f, -1.5f, 0.75f, -2.5f, 1.0f, -3.75f)
            curveToRelative(0.25f, -0.25f, 1.0f, 0.0f, 1.25f, 0.25f)
            curveToRelative(-1.0f, 2.0f, 0.25f, 4.0f, 0.0f, 6.0f)
            curveToRelative(-2.0f, 2.5f, -4.74f, 10.24f, -4.49f, 11.49f)
            curveToRelative(0.0f, 0.75f, 1.0f, 0.5f, 1.74f, 1.0f)
            curveToRelative(2.0f, 0.5f, 2.49f, -2.25f, 4.74f, -2.25f)
            curveToRelative(2.0f, 0.76f, 4.49f, 0.51f, 6.24f, 2.0f)
            curveToRelative(0.0f, -0.75f, 0.25f, -1.24f, 0.25f, -2.0f)
            curveToRelative(-1.5f, -1.5f, -2.5f, -3.49f, -4.49f, -4.24f)
            arcToRelative(5.5f, 5.5f, 0.0f, false, true, -3.25f, -4.49f)
            curveToRelative(2.25f, -2.0f, 2.75f, -5.0f, 4.24f, -7.5f)
            arcToRelative(6.27f, 6.27f, 0.0f, false, true, 3.5f, -2.75f)
            curveToRelative(0.24f, 0.0f, 4.0f, -5.0f, 4.24f, -5.0f)
            lineToRelative(5.48f, -4.75f)
            arcToRelative(60.2f, 60.2f, 0.0f, false, true, 6.74f, 0.0f)
            curveToRelative(1.25f, 0.0f, 2.74f, -0.74f, 4.24f, -0.74f)
            lineToRelative(-0.5f, -1.0f)
            curveToRelative(-0.75f, -1.0f, -2.25f, -1.5f, -3.24f, -2.5f)
            curveToRelative(-1.75f, -0.5f, -3.25f, 0.75f, -4.49f, 1.0f)
            arcToRelative(9.27f, 9.27f, 0.0f, false, true, 2.24f, -2.25f)
            curveToRelative(2.0f, -0.5f, 4.74f, -2.25f, 6.49f, -0.75f)
            curveToRelative(1.0f, 0.0f, 2.24f, 1.5f, 3.0f, 2.0f)
            curveToRelative(2.25f, 3.0f, 3.24f, 6.24f, 5.24f, 9.0f)
            curveToRelative(1.74f, -0.25f, 2.49f, -2.5f, 4.49f, -1.75f)
            curveToRelative(2.49f, 1.0f, 0.0f, 4.0f, 0.0f, 6.24f)
            curveToRelative(0.0f, 0.0f, -0.25f, 0.25f, -0.25f, 3.0f)
            verticalLineToRelative(2.0f)
            curveToRelative(0.0f, 0.5f, 0.25f, 1.25f, 0.25f, 1.75f)
            arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 0.5f)
            reflectiveCurveToRelative(-0.75f, -3.25f, -5.24f, -9.0f)
            arcToRelative(2.36f, 2.36f, 0.0f, false, true, -2.24f, 0.51f)
            curveToRelative(-2.25f, -0.75f, -1.75f, -3.5f, -2.5f, -5.25f)
            curveToRelative(-1.5f, 0.25f, -2.74f, 0.75f, -4.0f, 0.5f)
            curveToRelative(0.0f, 0.0f, 0.75f, 1.0f, 1.5f, 2.25f)
            curveToRelative(0.75f, 1.0f, 0.5f, 1.75f, 0.5f, 3.0f)
            curveToRelative(1.5f, 1.0f, 2.0f, 2.25f, 2.74f, 3.74f)
            lineToRelative(2.5f, 6.74f)
            lineToRelative(1.24f, 3.0f)
            arcToRelative(17.92f, 17.92f, 0.0f, false, false, 5.24f, 4.0f)
            arcToRelative(1.9f, 1.9f, 0.0f, false, false, 1.25f, -0.25f)
            curveToRelative(0.74f, 1.0f, -0.51f, 2.5f, -0.75f, 3.5f)
            arcToRelative(12.29f, 12.29f, 0.0f, false, false, -0.75f, 1.24f)
            curveToRelative(-1.74f, 1.25f, -2.74f, -1.24f, -4.49f, -1.0f)
            curveToRelative(-0.75f, 0.74f, -0.5f, 1.74f, -1.25f, 2.49f)
            curveToRelative(-0.49f, 2.25f, -2.49f, 4.75f, -4.0f, 6.49f)
            curveToRelative(0.75f, -0.25f, 2.75f, -1.49f, 3.0f, -1.0f)
            arcToRelative(34.79f, 34.79f, 0.0f, false, true, 1.0f, 5.49f)
            curveToRelative(0.0f, 2.25f, -1.74f, 4.0f, -2.74f, 5.74f)
            curveToRelative(-0.5f, 0.0f, -1.0f, 0.0f, -0.75f, -0.75f)
            curveToRelative(0.75f, -1.49f, 1.5f, -3.49f, 0.75f, -5.24f)
            arcToRelative(4.09f, 4.09f, 0.0f, false, false, -1.25f, -2.25f)
            arcToRelative(41.42f, 41.42f, 0.0f, false, true, -5.0f, 2.0f)
            reflectiveCurveToRelative(-3.75f, 1.75f, -10.48f, -1.0f)
            curveToRelative(-2.0f, -1.74f, -3.0f, -2.5f, -3.0f, -2.5f)
            lineToRelative(-3.5f, -3.49f)
            curveToRelative(-1.0f, -1.0f, -2.74f, -0.5f, -4.0f, -0.5f)
            curveToRelative(-0.5f, 0.25f, -0.75f, 0.75f, -1.49f, 1.0f)
            curveToRelative(-0.5f, 0.75f, 0.0f, 2.0f, -0.75f, 2.49f)
            curveToRelative(-0.5f, 0.25f, -1.0f, -0.25f, -1.5f, -0.5f)
            arcToRelative(4.22f, 4.22f, 0.0f, false, false, -4.49f, 0.5f)
            curveToRelative(-1.25f, 0.5f, -5.49f, -0.5f, -6.0f, -0.74f)
            arcToRelative(10.66f, 10.66f, 0.0f, false, false, -4.0f, 1.24f)
            curveToRelative(-1.25f, -0.5f, 0.25f, -1.0f, 0.25f, -1.74f)
            arcTo(2.0f, 2.0f, 0.0f, false, false, 88.0f, 92.32f)
            curveToRelative(-0.5f, -1.25f, -1.74f, -0.25f, -2.74f, -0.5f)
            reflectiveCurveToRelative(-1.24f, -1.25f, -1.49f, -2.0f)
            curveToRelative(-0.5f, 0.25f, -1.0f, -0.5f, -1.25f, -0.75f)
            arcToRelative(6.09f, 6.09f, 0.0f, false, false, 0.0f, 3.0f)
            curveToRelative(-0.25f, 0.75f, -0.5f, 1.75f, -0.75f, 1.25f)
            curveToRelative(-2.5f, -2.25f, -0.75f, -6.24f, -1.74f, -9.25f)
            curveToRelative(-1.5f, 1.26f, 0.25f, 2.76f, -0.25f, 4.25f)
            arcToRelative(24.57f, 24.57f, 0.0f, false, true, -1.25f, 4.0f)
            curveToRelative(-0.25f, 1.0f, -3.74f, 4.0f, -4.0f, 4.0f)
            curveToRelative(-2.74f, 1.25f, -3.49f, 0.76f, -3.49f, 0.76f)
            curveToRelative(7.73f, -4.75f, 7.23f, -9.0f, 7.48f, -9.25f)
            verticalLineToRelative(-3.5f)
            curveToRelative(-1.5f, -0.49f, -4.0f, 0.5f, -5.74f, 1.0f)
            curveToRelative(-2.75f, 0.49f, -4.49f, 0.74f, -7.0f, 0.0f)
            arcToRelative(13.33f, 13.33f, 0.0f, false, true, -4.49f, -2.5f)
            curveTo(63.0f, 87.08f, 66.0f, 87.08f, 66.0f, 87.08f)
            curveToRelative(2.49f, 0.49f, 4.74f, -1.0f, 7.48f, -0.5f)
            curveToRelative(0.0f, 0.0f, 0.25f, 0.0f, 0.5f, 0.74f)
            arcToRelative(4.94f, 4.94f, 0.0f, false, true, -2.75f, 0.5f)
            curveToRelative(-3.49f, 1.0f, -8.0f, 1.5f, -11.0f, -0.5f)
            arcToRelative(16.18f, 16.18f, 0.0f, false, false, 3.24f, 3.75f)
            curveToRelative(2.74f, 1.0f, 6.0f, -0.25f, 9.0f, -0.25f)
            curveToRelative(1.0f, -0.25f, 1.25f, -0.75f, 1.75f, -0.5f)
            curveToRelative(0.0f, 0.0f, -0.25f, 1.25f, -3.49f, 2.0f)
            arcToRelative(13.0f, 13.0f, 0.0f, false, false, -3.74f, 0.75f)
            curveToRelative(-1.0f, 0.5f, -2.25f, 0.25f, -3.5f, 0.25f)
            curveToRelative(-3.24f, -1.0f, -4.48f, -4.75f, -6.73f, -6.74f)
            curveToRelative(0.75f, 4.24f, 0.5f, 9.0f, 3.74f, 12.23f)
            arcToRelative(7.12f, 7.12f, 0.0f, false, false, 7.23f, 2.0f)
            curveToRelative(1.0f, -0.25f, 2.0f, -0.75f, 3.0f, -1.0f)
            curveToRelative(0.25f, 0.25f, 0.0f, 0.25f, 0.25f, 0.75f)
            curveToRelative(-2.5f, 1.5f, -6.74f, 2.25f, -9.23f, 0.75f)
            curveToRelative(-2.25f, -2.0f, -4.74f, -3.25f, -5.74f, -6.0f)
            curveToRelative(-1.74f, -2.24f, -1.25f, -4.24f, -3.24f, -5.49f)
            arcToRelative(2.72f, 2.72f, 0.0f, false, false, -2.75f, -0.5f)
            arcToRelative(13.06f, 13.06f, 0.0f, false, false, 1.5f, 7.0f)
            arcToRelative(7.78f, 7.78f, 0.0f, false, true, 1.74f, 2.5f)
            arcToRelative(2.88f, 2.88f, 0.0f, false, true, -2.49f, 0.0f)
            curveToRelative(-1.49f, -1.0f, -3.24f, -0.75f, -5.0f, -0.49f)
            curveToRelative(-0.26f, 0.24f, 9.47f, 24.21f, 9.47f, 25.0f)
            arcToRelative(19.57f, 19.57f, 0.0f, false, false, 4.0f, 2.0f)
            reflectiveCurveToRelative(1.5f, 0.5f, 3.74f, -1.5f)
            curveToRelative(0.0f, 0.0f, 0.0f, -0.5f, 4.0f, -7.5f)
            arcToRelative(16.29f, 16.29f, 0.0f, false, false, -2.5f, -2.49f)
            arcToRelative(21.47f, 21.47f, 0.0f, false, true, -4.0f, -2.75f)
            arcToRelative(13.07f, 13.07f, 0.0f, false, true, -3.74f, -4.49f)
            curveToRelative(-0.75f, -1.0f, -1.0f, -2.5f, -1.75f, -3.5f)
            curveToRelative(-0.74f, -0.75f, -1.49f, -1.25f, -1.75f, -2.25f)
            arcToRelative(3.27f, 3.27f, 0.0f, false, true, 2.5f, 0.75f)
            curveToRelative(1.0f, 0.25f, 2.0f, -0.25f, 2.75f, 0.5f)
            curveToRelative(0.5f, 0.5f, -0.51f, 2.0f, -0.51f, 2.25f)
            curveToRelative(-0.24f, 1.74f, 0.76f, 3.0f, 1.25f, 4.24f)
            arcToRelative(10.78f, 10.78f, 0.0f, false, false, 4.49f, 3.5f)
            curveToRelative(1.25f, 0.25f, 3.25f, -1.5f, 4.24f, 0.0f)
            curveToRelative(1.5f, -1.75f, 2.0f, -4.0f, 2.5f, -6.0f)
            curveToRelative(0.5f, -3.24f, 4.74f, -4.24f, 5.23f, -7.49f)
            curveToRelative(0.5f, 0.5f, 0.0f, 2.0f, -0.24f, 3.0f)
            curveToRelative(-0.75f, 1.0f, -2.0f, 1.5f, -2.5f, 2.5f)
            curveToRelative(0.0f, 1.24f, -0.75f, 2.25f, -0.75f, 3.75f)
            arcToRelative(50.13f, 50.13f, 0.0f, false, true, 3.49f, -4.0f)
            curveToRelative(1.5f, -2.0f, 4.5f, -2.25f, 6.0f, -3.75f)
            lineToRelative(3.74f, -3.0f)
            reflectiveCurveToRelative(0.5f, -0.5f, 1.5f, 0.24f)
            curveToRelative(-0.5f, 1.5f, -1.75f, 2.0f, -2.49f, 3.25f)
            curveToRelative(-1.5f, 1.0f, -3.0f, 2.25f, -4.74f, 2.25f)
            curveToRelative(-0.25f, 0.25f, -7.74f, 10.23f, -8.73f, 11.0f)
            curveToRelative(-0.5f, 0.25f, -1.26f, 0.25f, -1.26f, 1.0f)
            curveToRelative(0.25f, 2.25f, -1.0f, 8.75f, -1.0f, 9.25f)
            arcToRelative(19.13f, 19.13f, 0.0f, false, true, -2.0f, 2.74f)
            curveToRelative(-5.49f, 2.5f, -3.0f, 16.24f, -3.0f, 16.73f)
            arcToRelative(33.91f, 33.91f, 0.0f, false, true, 1.5f, 7.25f)
            curveToRelative(0.5f, 1.0f, 0.25f, 8.0f, 1.25f, 9.74f)
            curveToRelative(0.25f, 1.5f, 7.0f, 6.0f, 8.48f, 6.74f)
            curveToRelative(3.49f, 1.25f, 11.0f, -1.49f, 23.0f, 0.75f)
            curveToRelative(1.49f, 0.25f, 2.73f, 0.75f, 4.23f, 1.0f)
            curveToRelative(3.0f, 0.0f, 5.74f, 0.5f, 9.0f, 0.0f)
            curveToRelative(2.25f, -1.0f, 5.0f, -0.5f, 6.74f, -2.5f)
            curveToRelative(3.0f, -3.74f, 11.47f, -11.49f, 11.72f, -12.0f)
            arcToRelative(1.94f, 1.94f, 0.0f, false, true, 2.0f, 0.49f)
            curveToRelative(0.5f, 0.76f, 1.25f, 3.0f, 0.5f, 3.25f)
            curveToRelative(-0.75f, 0.0f, -0.5f, -1.0f, -1.24f, -1.25f)
            curveToRelative(0.0f, 0.0f, -0.5f, 0.0f, -13.0f, 11.74f)
            curveToRelative(-3.74f, 1.5f, -4.0f, 1.25f, -4.0f, 1.25f)
            curveToRelative(-0.26f, 0.25f, -4.74f, 0.75f, -6.49f, 1.0f)
            curveToRelative(-0.5f, 0.25f, -6.74f, -0.75f, -8.0f, -0.5f)
            arcToRelative(66.26f, 66.26f, 0.0f, false, false, -9.72f, -0.75f)
            curveToRelative(-1.5f, 0.0f, -3.0f, -0.25f, -4.25f, 0.75f)
            arcToRelative(9.67f, 9.67f, 0.0f, false, false, 0.5f, 4.0f)
            reflectiveCurveToRelative(0.5f, 0.25f, 4.74f, 3.25f)
            curveToRelative(0.0f, 0.0f, 11.47f, 1.75f, 14.0f, 1.5f)
            curveToRelative(2.0f, 0.25f, 3.24f, -0.75f, 5.0f, -1.0f)
            curveToRelative(2.74f, -1.75f, 6.48f, -0.5f, 8.72f, -3.0f)
            curveToRelative(0.0f, 0.0f, 0.5f, -0.25f, 3.0f, -3.24f)
            curveToRelative(0.5f, -0.75f, 1.75f, -3.25f, 2.74f, -3.0f)
            arcToRelative(35.23f, 35.23f, 0.0f, false, true, 5.49f, -5.0f)
            arcToRelative(17.52f, 17.52f, 0.0f, false, true, 3.74f, -2.75f)
            curveToRelative(-0.25f, 2.0f, -2.74f, 3.49f, -3.24f, 5.49f)
            curveToRelative(-1.5f, 0.5f, -4.24f, 2.75f, -4.49f, 2.5f)
            curveToRelative(-2.49f, 3.0f, -16.0f, 14.73f, -16.0f, 15.0f)
            curveToRelative(-2.25f, 3.25f, -2.25f, 3.5f, -2.25f, 3.5f)
            curveToRelative(-0.5f, 0.0f, -2.24f, -0.75f, -2.49f, -1.75f)
            curveToRelative(0.0f, 0.0f, -0.25f, -0.25f, -3.24f, 1.25f)
            curveToRelative(-1.5f, 1.5f, -1.75f, 1.25f, -1.75f, 1.25f)
            arcToRelative(4.15f, 4.15f, 0.0f, false, false, -0.75f, -3.0f)
            curveToRelative(-1.75f, -0.76f, -2.74f, -2.0f, -4.49f, -2.0f)
            curveToRelative(-1.25f, -0.25f, -2.25f, 0.0f, -3.24f, -0.75f)
            curveToRelative(-4.0f, -0.5f, -8.23f, -1.0f, -11.0f, -4.5f)
            curveToRelative(0.0f, 0.0f, -1.5f, -3.25f, -6.74f, -10.0f)
            curveToRelative(-0.75f, 0.0f, -1.5f, -0.75f, -2.24f, -0.5f)
            curveToRelative(1.74f, 3.25f, 3.0f, 7.0f, 4.73f, 10.24f)
            curveToRelative(2.25f, 4.25f, 5.74f, 8.0f, 9.23f, 11.49f)
            curveToRelative(3.74f, 2.75f, 11.0f, 5.0f, 12.73f, 5.74f)
            curveToRelative(2.0f, 0.75f, 6.0f, 0.25f, 8.22f, 0.25f)
            curveToRelative(5.49f, 0.25f, 11.23f, -0.75f, 15.22f, -4.24f)
            curveToRelative(2.74f, -3.25f, 4.49f, -7.0f, 6.48f, -11.0f)
            arcToRelative(62.21f, 62.21f, 0.0f, false, false, 2.75f, -7.25f)
            curveToRelative(1.5f, -4.0f, 2.24f, -8.24f, 4.23f, -11.73f)
            curveToRelative(0.76f, -2.25f, 1.26f, -3.0f, 0.51f, -6.0f)
            arcToRelative(18.14f, 18.14f, 0.0f, false, false, -0.75f, -3.49f)
            reflectiveCurveToRelative(-1.0f, -3.5f, 1.74f, -11.74f)
            verticalLineToRelative(-5.24f)
            curveToRelative(0.25f, -3.75f, 0.0f, -4.25f, 0.0f, -4.25f)
            arcToRelative(49.49f, 49.49f, 0.0f, false, true, 2.25f, -6.49f)
            lineToRelative(3.24f, -8.5f)
            curveToRelative(6.49f, -6.0f, 6.74f, -12.73f, 7.23f, -13.48f)
            curveToRelative(0.0f, -1.25f, 0.25f, -4.75f, 0.75f, -5.0f)
            curveToRelative(-0.25f, -0.76f, 2.5f, -8.75f, 3.24f, -10.0f)
            curveToRelative(1.0f, -2.51f, 2.25f, -5.0f, 3.5f, -7.5f)
            curveToRelative(0.5f, -2.0f, 1.0f, -4.0f, 1.5f, -5.74f)
            curveToRelative(0.25f, -3.25f, 1.0f, -6.49f, 0.0f, -9.49f)
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
            moveTo(29.6f, 34.38f)
            curveToRelative(-1.49f, -2.0f, -2.25f, -5.74f, -5.23f, -4.75f)
            curveToRelative(-1.25f, 0.25f, -2.0f, 0.75f, -3.0f, 1.0f)
            curveToRelative(-5.0f, 3.25f, -6.48f, 5.75f, -7.24f, 7.0f)
            curveToRelative(0.0f, 0.0f, -1.0f, 1.5f, -2.24f, 6.25f)
            curveToRelative(0.0f, 5.49f, 1.25f, 8.24f, 1.25f, 8.24f)
            curveToRelative(-0.5f, 0.75f, 1.75f, 2.74f, 2.49f, 2.5f)
            curveToRelative(0.75f, -0.75f, 3.0f, -1.0f, 3.25f, -1.0f)
            arcToRelative(5.56f, 5.56f, 0.0f, false, false, -0.5f, 1.75f)
            curveToRelative(-2.25f, 2.49f, -2.0f, 6.49f, -2.0f, 6.49f)
            curveToRelative(0.25f, 1.0f, -0.25f, 1.75f, 0.25f, 2.5f)
            arcToRelative(1.92f, 1.92f, 0.0f, false, false, 0.5f, -1.26f)
            curveToRelative(0.5f, -3.49f, 4.74f, -11.0f, 4.49f, -12.0f)
            arcToRelative(19.0f, 19.0f, 0.0f, false, false, -0.75f, -3.75f)
            arcToRelative(3.39f, 3.39f, 0.0f, false, true, 0.5f, -2.49f)
            curveToRelative(1.0f, -0.25f, 1.75f, -0.75f, 3.0f, -1.0f)
            arcToRelative(37.92f, 37.92f, 0.0f, false, false, 3.49f, -2.25f)
            curveToRelative(1.74f, -0.75f, 1.74f, -2.25f, 2.24f, -4.25f)
            arcToRelative(12.55f, 12.55f, 0.0f, false, false, -0.5f, -3.0f)
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
            moveTo(34.09f, 25.88f)
            curveToRelative(-0.5f, -0.49f, -5.0f, -4.74f, -13.72f, -5.0f)
            curveToRelative(-4.0f, 1.0f, -8.48f, 3.0f, -11.0f, 6.75f)
            curveTo(6.9f, 32.38f, 7.15f, 37.87f, 6.66f, 43.37f)
            arcTo(40.76f, 40.76f, 0.0f, false, false, 7.9f, 51.11f)
            curveToRelative(0.75f, 1.25f, 3.5f, 11.24f, 3.5f, 13.0f)
            curveToRelative(0.49f, 13.73f, 7.23f, 21.48f, 7.23f, 21.48f)
            curveToRelative(1.74f, 0.49f, 3.49f, 1.74f, 5.49f, 1.25f)
            curveToRelative(-0.26f, -0.51f, -0.75f, -1.0f, -1.0f, -1.5f)
            curveToRelative(-3.49f, -7.5f, -4.24f, -7.5f, -4.24f, -7.5f)
            arcToRelative(2.26f, 2.26f, 0.0f, false, true, -1.5f, 2.25f)
            curveToRelative(-1.25f, 0.25f, -0.5f, -7.0f, 0.75f, -9.49f)
            curveToRelative(-1.25f, 0.25f, -2.0f, 1.75f, -3.24f, 1.75f)
            arcToRelative(0.86f, 0.86f, 0.0f, false, true, -0.25f, -1.25f)
            curveToRelative(0.25f, -0.75f, 0.25f, -1.75f, 0.5f, -2.25f)
            curveToRelative(1.24f, -1.75f, -0.5f, -4.74f, -0.76f, -4.74f)
            curveToRelative(-1.0f, -2.5f, -4.0f, -8.24f, -4.23f, -12.0f)
            arcTo(116.89f, 116.89f, 0.0f, false, true, 9.9f, 38.88f)
            arcToRelative(48.0f, 48.0f, 0.0f, false, false, 0.0f, -6.0f)
            curveToRelative(0.74f, -1.0f, 1.0f, -2.0f, 2.24f, -3.0f)
            curveToRelative(1.75f, -1.75f, 4.49f, -2.24f, 7.0f, -3.0f)
            curveToRelative(3.0f, -1.0f, 5.73f, 0.25f, 8.22f, 1.5f)
            curveToRelative(0.76f, 0.51f, 2.0f, 1.0f, 2.25f, 2.0f)
            curveToRelative(2.0f, 2.0f, 2.0f, 6.0f, 5.74f, 6.25f)
            curveToRelative(1.74f, -1.75f, 4.0f, -3.0f, 3.74f, -5.5f)
            curveToRelative(-0.25f, -1.0f, -3.49f, -4.25f, -5.0f, -5.25f)
            close()
        }
        path(
            fill = SolidColor(Color(iconColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(158.06f, 69.34f)
            curveToRelative(-0.26f, 0.5f, -1.0f, 3.75f, -1.25f, 4.25f)
            curveToRelative(-0.51f, 1.0f, -0.51f, 2.5f, -1.0f, 3.75f)
            curveToRelative(-0.5f, 0.49f, -4.24f, 9.24f, -4.49f, 9.74f)
            curveToRelative(-0.5f, 2.0f, -2.49f, 4.0f, -2.74f, 6.24f)
            verticalLineToRelative(3.25f)
            curveToRelative(-0.5f, -0.26f, -1.25f, 0.25f, -2.25f, 0.74f)
            arcToRelative(6.32f, 6.32f, 0.0f, false, true, -3.0f, 2.75f)
            curveToRelative(0.26f, 4.74f, -4.0f, 8.0f, -4.48f, 7.75f)
            curveToRelative(1.0f, -1.25f, 2.0f, -1.76f, 2.24f, -3.75f)
            curveToRelative(0.25f, -1.25f, 1.25f, -3.0f, 0.25f, -4.25f)
            arcToRelative(12.15f, 12.15f, 0.0f, false, false, 2.25f, -1.49f)
            curveToRelative(2.0f, -1.75f, 3.49f, -4.25f, 2.49f, -7.0f)
            curveToRelative(0.5f, -1.0f, 1.75f, -1.75f, 2.5f, -3.0f)
            arcToRelative(11.57f, 11.57f, 0.0f, false, false, 1.74f, -4.0f)
            arcToRelative(17.15f, 17.15f, 0.0f, false, true, -0.75f, -3.0f)
            curveToRelative(0.25f, -0.25f, 0.0f, -2.75f, 0.0f, -3.75f)
            lineToRelative(-2.24f, 1.5f)
            arcToRelative(37.0f, 37.0f, 0.0f, false, true, 1.25f, -5.0f)
            curveToRelative(0.25f, -0.75f, 0.25f, -4.0f, 0.5f, -4.25f)
            curveToRelative(0.0f, 0.0f, -0.25f, -0.25f, 0.0f, -3.0f)
            curveToRelative(-0.76f, -2.74f, -0.76f, -5.49f, -2.75f, -8.24f)
            curveToRelative(0.0f, -0.24f, 0.5f, -0.24f, 0.5f, -0.24f)
            arcToRelative(4.35f, 4.35f, 0.0f, false, true, 2.25f, 2.0f)
            curveToRelative(1.0f, 1.25f, 1.49f, 3.25f, 2.24f, 3.25f)
            verticalLineTo(61.35f)
            curveToRelative(0.5f, 0.0f, 1.25f, -0.25f, 1.49f, 0.5f)
            curveToRelative(0.5f, 0.0f, 0.5f, 1.75f, 0.5f, 2.25f)
            arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 4.24f)
            arcToRelative(1.46f, 1.46f, 0.0f, false, true, 1.0f, 0.25f)
            curveToRelative(0.5f, 0.0f, 0.25f, 0.5f, 0.25f, 1.0f)
            arcToRelative(1.53f, 1.53f, 0.0f, false, false, 0.25f, 1.75f)
            curveToRelative(0.75f, -0.5f, 0.5f, -1.5f, 1.0f, -1.75f)
            curveToRelative(-0.25f, -0.5f, 1.25f, -3.74f, 1.25f, -5.0f)
            curveToRelative(0.0f, 0.0f, 0.25f, 0.0f, 1.0f, 0.75f)
            curveToRelative(0.0f, 1.49f, 0.74f, 2.5f, 0.0f, 4.0f)
            close()
        }
        path(
            fill = SolidColor(Color(iconColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(105.67f, 67.35f)
            arcToRelative(6.54f, 6.54f, 0.0f, false, true, -5.48f, -2.25f)
            curveToRelative(-0.25f, -0.75f, 1.5f, -3.0f, 2.5f, -2.75f)
            curveToRelative(1.0f, 1.5f, 1.74f, 3.25f, 3.48f, 3.75f)
            curveToRelative(0.25f, 0.49f, -0.25f, 1.0f, -0.5f, 1.25f)
            close()
        }
        path(
            fill = SolidColor(Color(iconColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(92.45f, 67.09f)
            reflectiveCurveToRelative(-2.24f, 1.25f, -3.49f, -0.25f)
            curveToRelative(2.25f, -0.5f, 3.0f, -3.0f, 4.74f, -4.49f)
            curveToRelative(0.5f, -0.25f, 1.5f, -0.5f, 1.5f, 0.25f)
            curveToRelative(0.5f, 1.25f, 1.25f, 1.25f, 0.75f, 2.24f)
            arcToRelative(40.16f, 40.16f, 0.0f, false, true, -3.5f, 2.25f)
            close()
        }
        path(
            fill = SolidColor(Color(iconColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(82.0f, 60.1f)
            horizontalLineToRelative(0.0f)
            curveToRelative(-1.25f, 0.5f, -2.49f, 1.25f, -4.24f, 0.75f)
            curveToRelative(-1.5f, -0.25f, -3.24f, -0.75f, -4.0f, -2.25f)
            curveToRelative(-1.5f, -1.25f, -2.24f, -2.74f, -1.75f, -5.49f)
            curveToRelative(0.5f, 0.0f, 0.75f, -0.5f, 1.25f, -0.25f)
            curveToRelative(0.0f, 0.0f, 0.5f, 2.0f, 5.24f, 5.0f)
            curveToRelative(1.25f, 0.0f, 3.24f, 0.51f, 4.24f, -0.25f)
            curveToRelative(1.0f, -0.25f, 2.0f, -0.75f, 3.0f, -0.5f)
            curveToRelative(-2.24f, 2.5f, -3.74f, 3.0f, -3.74f, 3.0f)
            close()
        }
        path(
            fill = SolidColor(Color(iconColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(120.39f, 122.0f)
            arcToRelative(47.46f, 47.46f, 0.0f, false, true, -1.5f, 5.0f)
            arcToRelative(24.35f, 24.35f, 0.0f, false, true, -3.74f, 3.5f)
            arcToRelative(7.17f, 7.17f, 0.0f, false, true, -3.0f, 0.5f)
            curveToRelative(4.24f, -3.25f, 5.0f, -4.0f, 5.0f, -4.0f)
            reflectiveCurveToRelative(1.0f, -0.5f, 1.24f, -4.0f)
            curveToRelative(0.0f, -3.25f, 0.75f, -4.5f, 0.75f, -4.5f)
            arcToRelative(12.55f, 12.55f, 0.0f, false, true, 1.5f, -2.0f)
            lineToRelative(2.25f, 0.25f)
            lineToRelative(-2.5f, 5.25f)
            close()
        }
        path(
            fill = SolidColor(Color(iconColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(135.36f, 120.79f)
            curveToRelative(-5.0f, 4.0f, -5.0f, 4.5f, -5.0f, 4.5f)
            curveToRelative(-0.5f, 1.24f, 0.25f, 2.0f, 0.25f, 3.0f)
            curveToRelative(2.24f, 2.0f, 2.0f, 10.24f, 1.75f, 11.74f)
            arcToRelative(4.92f, 4.92f, 0.0f, false, false, -0.26f, -1.25f)
            arcToRelative(34.13f, 34.13f, 0.0f, false, false, -2.49f, -9.0f)
            curveToRelative(-0.5f, -0.75f, -1.5f, -0.75f, -2.0f, -1.25f)
            arcToRelative(4.45f, 4.45f, 0.0f, false, true, -2.0f, -1.75f)
            arcToRelative(3.84f, 3.84f, 0.0f, false, true, 0.25f, -1.0f)
            curveToRelative(1.0f, -2.0f, 0.25f, -4.75f, 1.0f, -7.0f)
            curveToRelative(-0.5f, -3.5f, -2.75f, -6.24f, -3.74f, -9.49f)
            curveToRelative(-3.25f, -2.74f, -10.73f, -9.74f, -11.23f, -9.74f)
            curveToRelative(2.25f, 3.25f, 5.24f, 6.0f, 7.49f, 9.24f)
            curveToRelative(0.0f, 0.25f, 0.24f, 0.75f, -0.26f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.5f, -1.0f, -1.0f)
            lineToRelative(-5.74f, -5.74f)
            curveToRelative(-1.0f, -0.75f, -1.75f, -2.5f, -3.24f, -2.25f)
            curveToRelative(-2.0f, -0.5f, -3.74f, 1.25f, -4.74f, 2.5f)
            curveToRelative(0.0f, 0.5f, 0.0f, 1.0f, -0.25f, 1.0f)
            curveToRelative(-2.0f, 0.25f, -3.5f, 2.5f, -4.0f, 4.0f)
            arcTo(24.27f, 24.27f, 0.0f, false, true, 98.0f, 114.3f)
            curveToRelative(-0.51f, -0.5f, -0.26f, -1.75f, -0.51f, -2.5f)
            arcToRelative(11.74f, 11.74f, 0.0f, false, false, -5.23f, -6.75f)
            curveToRelative(-0.75f, 0.25f, -1.0f, 1.26f, -1.75f, 0.75f)
            curveToRelative(-0.49f, -2.24f, -1.5f, -4.74f, -3.74f, -5.49f)
            arcToRelative(23.1f, 23.1f, 0.0f, false, true, -3.49f, 3.5f)
            curveTo(82.0f, 104.56f, 72.75f, 116.54f, 74.0f, 120.0f)
            arcToRelative(12.7f, 12.7f, 0.0f, false, false, 1.0f, 2.49f)
            curveToRelative(2.0f, 4.5f, 6.23f, 6.75f, 6.48f, 7.25f)
            curveToRelative(0.0f, 0.0f, 2.0f, 0.75f, 2.25f, 1.25f)
            curveToRelative(-0.5f, 1.0f, -1.5f, 0.5f, -2.75f, 0.25f)
            curveToRelative(-2.49f, -1.25f, -8.23f, -7.49f, -8.73f, -9.0f)
            arcToRelative(48.0f, 48.0f, 0.0f, false, true, 0.0f, -6.0f)
            arcToRelative(20.16f, 20.16f, 0.0f, false, true, 2.25f, -4.24f)
            curveToRelative(0.75f, -0.76f, 3.74f, -5.74f, 5.74f, -7.0f)
            curveToRelative(0.25f, -0.49f, 3.74f, -2.24f, 4.74f, -3.49f)
            arcToRelative(8.74f, 8.74f, 0.0f, false, false, 0.74f, -1.5f)
            curveToRelative(0.75f, -0.75f, 2.24f, -0.25f, 3.24f, 0.25f)
            curveToRelative(1.25f, 0.5f, 2.0f, 2.0f, 3.25f, 3.0f)
            curveToRelative(0.74f, 0.0f, 1.49f, 0.75f, 2.24f, 1.25f)
            curveToRelative(2.74f, -0.5f, 4.49f, -0.5f, 6.48f, -1.0f)
            curveToRelative(1.76f, -2.25f, 7.49f, -4.75f, 7.74f, -5.0f)
            arcToRelative(23.3f, 23.3f, 0.0f, false, true, 5.24f, 0.5f)
            reflectiveCurveToRelative(0.75f, 0.25f, 2.24f, 2.0f)
            curveToRelative(1.75f, 1.75f, 3.25f, 3.74f, 5.24f, 4.74f)
            curveToRelative(0.25f, 0.25f, 0.75f, 0.76f, 1.0f, 0.76f)
            curveToRelative(0.0f, 0.0f, 0.0f, -1.76f, -1.75f, -5.0f)
            curveToRelative(1.0f, 1.25f, 3.0f, 1.75f, 3.0f, 3.74f)
            curveToRelative(-0.25f, 3.25f, 2.0f, 5.75f, 3.5f, 8.25f)
            arcToRelative(18.55f, 18.55f, 0.0f, false, false, 3.24f, 4.49f)
            curveToRelative(1.49f, 0.25f, 3.49f, 0.5f, 4.49f, -0.75f)
            curveToRelative(1.5f, -1.5f, 1.74f, -5.0f, 2.0f, -5.0f)
            curveToRelative(0.5f, 0.5f, 0.25f, 1.5f, 0.5f, 2.25f)
            arcToRelative(6.88f, 6.88f, 0.0f, false, true, -2.0f, 6.24f)
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
            moveTo(22.87f, 36.12f)
            curveToRelative(-0.75f, 1.25f, -2.25f, 2.26f, -3.24f, 3.5f)
            curveToRelative(0.0f, 0.0f, -0.5f, 0.25f, -3.5f, 4.0f)
            arcToRelative(3.1f, 3.1f, 0.0f, false, false, 0.5f, 2.51f)
            arcToRelative(3.33f, 3.33f, 0.0f, false, true, 0.5f, 2.0f)
            curveToRelative(0.0f, -0.25f, -0.75f, 0.0f, -1.0f, 0.0f)
            curveToRelative(0.0f, -1.25f, -2.24f, -2.49f, -0.25f, -7.0f)
            curveToRelative(0.75f, -1.0f, 5.0f, -7.24f, 7.49f, -6.74f)
            curveToRelative(1.25f, 0.5f, -0.5f, 1.74f, -0.5f, 1.74f)
            close()
        }
        path(
            fill = SolidColor(Color(iconColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(54.3f, 67.09f)
            arcToRelative(16.6f, 16.6f, 0.0f, false, false, -3.75f, 5.25f)
            curveToRelative(-0.5f, -0.25f, 0.75f, -4.24f, 0.75f, -6.49f)
            curveToRelative(0.0f, 0.0f, 0.75f, -1.5f, 2.75f, -5.25f)
            curveToRelative(0.0f, 0.0f, 0.0f, -0.25f, -2.0f, 0.75f)
            curveToRelative(-0.25f, 0.0f, -4.74f, 9.24f, -4.49f, 10.49f)
            curveToRelative(-0.5f, 2.5f, -1.74f, 7.0f, -2.25f, 7.24f)
            curveToRelative(-0.25f, 2.0f, -0.5f, 7.24f, 0.0f, 7.75f)
            curveToRelative(0.0f, 1.24f, 0.0f, 6.0f, -0.74f, 6.49f)
            curveToRelative(0.0f, 0.0f, -0.5f, 0.25f, -6.0f, -12.49f)
            arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.5f, -1.25f)
            lineToRelative(-0.75f, -3.0f)
            reflectiveCurveToRelative(-0.25f, -2.0f, -0.74f, -6.24f)
            curveToRelative(0.0f, -1.0f, 0.49f, -2.49f, 0.24f, -3.75f)
            curveToRelative(0.0f, -0.25f, 1.0f, 0.0f, 1.0f, 0.0f)
            curveToRelative(0.0f, 2.0f, 1.25f, 5.5f, 1.0f, 5.5f)
            curveToRelative(0.5f, 0.25f, 0.25f, 1.0f, 0.75f, 1.0f)
            curveToRelative(0.0f, -0.75f, 0.74f, -1.25f, 0.74f, -2.0f)
            curveToRelative(0.26f, -0.25f, 1.5f, 0.0f, 1.5f, 0.0f)
            arcToRelative(2.69f, 2.69f, 0.0f, false, false, 0.5f, -2.0f)
            arcToRelative(7.52f, 7.52f, 0.0f, false, true, 3.5f, -6.49f)
            curveToRelative(0.25f, 0.75f, -0.26f, 1.0f, 0.0f, 1.5f)
            verticalLineToRelative(2.74f)
            lineToRelative(0.25f, 0.25f)
            reflectiveCurveToRelative(0.49f, -1.0f, 1.74f, -3.24f)
            curveToRelative(1.25f, -2.0f, 2.0f, -4.75f, 4.49f, -6.0f)
            curveToRelative(2.24f, -2.49f, 10.23f, -2.0f, 11.22f, 1.0f)
            curveToRelative(-0.75f, -0.25f, -7.23f, 5.75f, -9.22f, 8.24f)
            close()
        }
        path(
            fill = SolidColor(Color(iconColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(111.16f, 118.0f)
            curveToRelative(0.25f, 1.0f, 0.5f, 1.0f, 0.5f, 1.75f)
            curveToRelative(0.0f, 10.24f, -6.23f, 14.0f, -11.0f, 11.74f)
            curveToRelative(-0.49f, -0.25f, -1.24f, -1.0f, -1.24f, -1.5f)
            curveToRelative(-1.49f, 1.5f, -3.74f, 3.0f, -6.23f, 2.74f)
            curveToRelative(-3.0f, -0.24f, -5.0f, -3.24f, -6.0f, -5.74f)
            arcToRelative(17.92f, 17.92f, 0.0f, false, true, -0.75f, -7.24f)
            curveToRelative(-2.49f, 2.0f, -2.0f, -1.0f, -2.0f, -1.0f)
            curveToRelative(0.5f, -1.5f, 1.24f, -2.5f, 3.0f, -2.25f)
            arcToRelative(3.4f, 3.4f, 0.0f, false, true, -0.49f, 2.0f)
            lineToRelative(0.74f, 1.0f)
            curveToRelative(0.51f, 1.0f, 0.76f, 1.0f, 0.76f, 1.0f)
            arcToRelative(16.49f, 16.49f, 0.0f, false, true, 1.74f, 3.74f)
            reflectiveCurveToRelative(1.5f, 2.5f, 6.24f, 3.5f)
            curveToRelative(0.0f, 0.0f, -0.25f, 0.0f, 3.74f, -2.24f)
            curveToRelative(0.0f, 0.25f, 2.0f, 2.24f, 3.24f, 1.74f)
            curveToRelative(2.24f, -0.75f, 6.0f, -3.0f, 6.73f, -6.0f)
            curveToRelative(0.0f, -1.25f, 0.25f, -2.5f, -0.74f, -3.25f)
            arcToRelative(11.55f, 11.55f, 0.0f, false, true, -0.75f, -2.25f)
            curveToRelative(1.0f, -0.5f, 3.0f, -0.5f, 3.49f, 0.75f)
            curveToRelative(0.25f, 0.5f, 0.5f, 1.5f, 0.0f, 2.0f)
            arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.0f, -0.5f)
            close()
        }
        path(
            fill = SolidColor(Color(iconColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(117.4f, 158.75f)
            arcToRelative(33.42f, 33.42f, 0.0f, false, false, -4.74f, 2.0f)
            curveToRelative(-0.25f, 0.0f, -0.5f, -0.25f, -0.75f, -0.5f)
            curveToRelative(3.0f, -2.5f, 7.0f, -4.0f, 8.73f, -8.0f)
            curveToRelative(0.75f, 0.75f, 0.75f, 1.0f, 0.75f, 1.0f)
            arcToRelative(3.19f, 3.19f, 0.0f, false, false, -0.75f, 1.0f)
            horizontalLineToRelative(1.5f)
            curveToRelative(-1.0f, 2.0f, -3.0f, 3.0f, -4.74f, 4.49f)
            close()
        }
        path(
            fill = SolidColor(Color(iconColor)),
            stroke = null,
            strokeLineWidth = 0.0f,
            strokeLineCap = Butt,
            strokeLineJoin = Miter,
            strokeLineMiter = 4.0f,
            pathFillType = NonZero,
        ) {
            moveTo(82.73f, 159.5f)
            curveToRelative(-0.25f, 0.0f, -4.24f, 0.25f, -5.49f, 1.0f)
            arcToRelative(13.78f, 13.78f, 0.0f, false, true, -4.49f, -0.5f)
            reflectiveCurveToRelative(-0.75f, -0.25f, -2.0f, -0.75f)
            reflectiveCurveToRelative(-2.0f, -2.0f, -3.0f, -2.75f)
            curveToRelative(0.75f, -0.74f, 0.75f, -1.25f, 0.75f, -1.25f)
            curveToRelative(0.5f, -0.25f, 0.75f, 2.0f, 6.74f, 4.25f)
            curveToRelative(1.74f, 0.25f, 3.0f, -0.5f, 4.74f, -0.5f)
            curveToRelative(1.24f, -0.5f, 3.0f, -0.25f, 4.49f, -0.25f)
            curveToRelative(0.0f, 0.0f, 0.74f, 0.5f, -1.75f, 0.75f)
        }
    }
        .build()
}
