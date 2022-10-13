package com.mshdabiola.ludo.ui.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.mshdabiola.ludo.R
import com.mshdabiola.naijaludo.state.Box
import com.mshdabiola.naijaludo.state.GameColor
import com.mshdabiola.naijaludo.state.Point


@Composable
fun BoxUi(box: Box, sizeScale: Int = 1) {
    val oneUnit = LocalUnitDP.current
    Surface(
        modifier = Modifier
            .size(oneUnit * sizeScale)
            .offset(oneUnit * box.point.x, oneUnit * box.point.y),
        color = if (box.showColor) box.color.toColor() else Color.Transparent,
        border = BorderStroke((0.3f).dp, MaterialTheme.colorScheme.onSecondaryContainer.copy(alpha = 0.4f))
    ) {}

}

@Composable
fun SafeBoxUi(box: Box) {
    val oneUnit = LocalUnitDP.current
    Surface(
        modifier = Modifier
            .size(oneUnit)
            .offset(oneUnit * box.point.x, oneUnit * box.point.y),
        color = if (box.showColor) box.color.toColor() else Color.Transparent,
        border = BorderStroke((0.3f).dp, MaterialTheme.colorScheme.onSecondaryContainer.copy(alpha = 0.4f))
    ) {
        Box(
            modifier = Modifier
                .padding(2.dp)
                .fillMaxWidth()

                .clip(CircleShape)
                .background(Color.White)
                .border(1.dp, Color.Black, CircleShape)
        )

    }

}

@Composable
fun HomeBoxUi(box: Box) {
    val oneUnit = LocalUnitDP.current
    Box(
        modifier = Modifier
            .size(oneUnit * 6)
            .offset(oneUnit * box.point.x, oneUnit * box.point.y)
            .innerShadow(box.color.toColor())

    )

}

@Composable
fun ImageBoxUi(box: Box, @DrawableRes drawableRes: Int = R.drawable.red) {
    val oneUnit = LocalUnitDP.current
    Box(
        modifier = Modifier
            .size(oneUnit * 6)
            .offset(oneUnit * box.point.x, oneUnit * box.point.y)


    ) {
        Image(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            painter = painterResource(id = drawableRes),
            contentDescription = ""
        )
    }

}

@Preview
@Composable
fun HomeBoxUiPreview() {

    CompositionLocalProvider(LocalUnitDP provides 100.dp) {

        ImageBoxUi(box = Box(point = Point.zero, showColor = true))
    }

}


@Composable
fun ArrowBox(modifier: Modifier) {

    Box(modifier = modifier) {
        Icon(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.arrow),
            contentDescription = "",
            tint = MaterialTheme.colorScheme.onSecondaryContainer.copy(alpha = 0.4f)
        )
    }
}



fun Modifier.innerShadow(
    foreGroundColor: Color = Color.Red,
    shadowColor: Color = Color.Black
) = composed(
    inspectorInfo = {

    },
    factory = {


        val paint = remember() {
            Paint()
        }

        val foregroundPaint = remember() {
            Paint().apply {
                color = shadowColor
            }
        }

        val frameworkPaint = remember {
            paint.asFrameworkPaint()
        }

        Modifier.drawWithContent {
            this.drawIntoCanvas {


                val radius = 4.dp.toPx()

                frameworkPaint.color = Color.Transparent.toArgb()

                //frameworkPaint.
                frameworkPaint.setShadowLayer(
                    radius,
                    0f,
                    0f,
                    foreGroundColor.copy(alpha = 0.7f).toArgb()
                )


                it.drawRoundRect(
                    left = 0f,
                    top = 0f,
                    right = this.size.width,
                    bottom = this.size.height,
                    radiusX = 0.dp.toPx(),
                    radiusY = 0.dp.toPx(),
                    paint = foregroundPaint
                )

                it.drawRoundRect(
                    left = 0f,
                    top = 0f,
                    right = this.size.width,
                    bottom = this.size.height,
                    radiusX = 5.dp.toPx(),
                    radiusY = 5.dp.toPx(),
                    paint = paint
                )


                drawContent()

            }
        }
    }
)
//
//fun Point.toOffset() = Offset(x, y)
fun Point.toIntOffset() = IntOffset(x.toInt(), y.toInt())
fun GameColor.toColor(): Color {
    return when (this) {
        GameColor.RED -> Color.Red
        GameColor.YELLOW -> Color.Yellow
        GameColor.BLUE -> Color.Blue
        GameColor.GREEN -> Color.Green
    }
}




