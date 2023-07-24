package com.mshdabiola.ludo.screen.game.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.VectorPainter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.R
import com.mshdabiola.ludo.screen.game.component.board.DefaultBoard
import com.mshdabiola.ludo.screen.game.component.board.UBoard
import com.mshdabiola.ludo.screen.game.state.BoardUiState
import com.mshdabiola.ludo.screen.game.state.toBoardUiState
import com.mshdabiola.naijaludo.model.Board
import com.mshdabiola.naijaludo.model.GameColor

@Composable
fun BoardUi(
    modifier: Modifier = Modifier,
    boardUiStateProvider: () -> BoardUiState,
    content: @Composable BoxScope.() -> Unit = {},
) {
    val board= LocalBoard.current

    val pathColor= MaterialTheme.colorScheme
        .onSecondaryContainer
        .copy(alpha = 0.4f)
    val bgColor=Color.White




    val boardUiState=boardUiStateProvider()
    val colors= remember(boardUiState.colors) {
        board.getHouseColor(boardUiState.colors)
    }



    val painters=board.getIcons()
        .map {
            rememberVectorPainter(image = it)
        }
    val rotate= remember (boardUiState.colors){
        boardUiState.colors.indexOf(GameColor.RED)*90f
    }



    val thirdHouse= colors[2]
    val firstHouse= colors[0]
    val secondHouse= colors[1]
    val fourthHouse= colors[3]


    val middleVector=ImageVector.vectorResource(id = R.drawable.middle)
    val middlePainter = rememberVectorPainter(image = middleVector)

//    val boardUiState = boardUiStateProvider()
//    AnimatedVisibility(
//        modifier = modifier
//            .aspectRatio(1f),
//        visible = boardUiState.pathBoxes.isNotEmpty(),
//    ) {
        BoxWithConstraints(
            modifier= modifier
                .aspectRatio(1f)
                .drawBehind {
                    val unit = size.width.div(15)
                    val strokeWidth = unit.times(0.07f)
                    drawRect(bgColor)
                    drawRect(pathColor, style = Stroke(width = strokeWidth))

                    //read safe path
                    drawRect(firstHouse, Offset(unit.times(1f), unit.times(6)), Size(unit, unit))
                    drawRect(
                        firstHouse,
                        Offset(unit.times(1f), unit.times(7)),
                        Size(unit.times(5), unit)
                    )
                    repeat(5) {
                        val first = it + 1
                        drawCircle(
                            bgColor, unit.div(3f),
                            Offset(unit.times(first + 0.5f), unit.times(7.5f))
                        )
                        drawCircle(
                            pathColor, unit.div(3f),
                            Offset(unit.times(first + 0.5f), unit.times(7.5f)),
                            style = Stroke(width = strokeWidth)
                        )
                    }

                    //blue safe path
                    drawRect(fourthHouse, Offset(unit.times(6), unit.times(13)), Size(unit, unit))
                    drawRect(
                        fourthHouse,
                        Offset(unit.times(7f), unit.times(9)),
                        Size(unit, unit.times(5))
                    )
                    repeat(5) {
                        val first = it + 9

                        drawCircle(
                            bgColor, unit.div(3f),
                            Offset(unit.times(7.5f), unit.times(first + 0.5f))
                        )
                        drawCircle(
                            pathColor, unit.div(3f),
                            Offset(unit.times(7.5f), unit.times(first + 0.5f)),
                            style = Stroke(width = strokeWidth)
                        )
                    }

                    //green safe path
                    drawRect(secondHouse, Offset(unit.times(8), unit.times(1)), Size(unit, unit))
                    drawRect(
                        secondHouse,
                        Offset(unit.times(7f), unit.times(1)),
                        Size(unit, unit.times(5))
                    )

                    repeat(5) {
                        val first = it + 1

                        drawCircle(
                            bgColor, unit.div(3f),
                            Offset(unit.times(7.5f), unit.times(first + 0.5f))
                        )
                        drawCircle(
                            pathColor, unit.div(3f),
                            Offset(unit.times(7.5f), unit.times(first + 0.5f)),
                            style = Stroke(width = strokeWidth)
                        )
                    }

                    //yellow safe path
                    drawRect(thirdHouse, Offset(unit.times(13), unit.times(8)), Size(unit, unit))
                    drawRect(
                        thirdHouse,
                        Offset(unit.times(9), unit.times(7)),
                        Size(unit.times(5), unit)
                    )
                    repeat(5) {
                        val first = it + 9
                        drawCircle(
                            bgColor, unit.div(3f),
                            Offset(unit.times(first + 0.5f), unit.times(7.5f))
                        )
                        drawCircle(
                            pathColor, unit.div(3f),
                            Offset(unit.times(first + 0.5f), unit.times(7.5f)),
                            style = Stroke(width = strokeWidth)
                        )
                    }

                    // board line

                    repeat(14) {
                        val inx = it + 1
                        drawLine(
                            pathColor,
                            start = Offset(inx.times(unit), 0f),
                            end = Offset(inx.times(unit), size.height),
                            strokeWidth = strokeWidth
                        )
                    }
                    repeat(14) {
                        val inx = it + 1
                        drawLine(
                            pathColor,
                            start = Offset(0f, inx.times(unit)),
                            end = Offset(size.width, inx.times(unit)),
                            strokeWidth = strokeWidth
                        )
                    }

                    //home rectangle
                    drawShadowRect(firstHouse, Offset.Zero, Size(unit.times(6), unit.times(6)))


                    drawShadowRect(
                        fourthHouse,
                        Offset(0f, unit.times(9)),
                        Size(unit.times(6), unit.times(6))
                    )


                    drawShadowRect(
                        secondHouse,
                        Offset(unit.times(9), 0f),
                        Size(unit.times(6), unit.times(6))
                    )


                    drawShadowRect(
                        thirdHouse,
                        Offset(unit.times(9), unit.times(9)),
                        Size(unit.times(6), unit.times(6))
                    )
                    rotate(rotate) {
                        drawHomeImage(
                            painters[0],
                            Offset(unit.times(1f), unit.times(1f)),
                            Size(unit.times(4), unit.times(4))
                        )
                        drawHomeImage(
                            painters[1],
                            Offset(unit.times(10f), unit.times(1f)),
                            Size(unit.times(4), unit.times(4))
                        )
                        drawHomeImage(
                            painters[2],
                            Offset(unit.times(10f), unit.times(10f)),
                            Size(unit.times(4), unit.times(4))
                        )
                        drawHomeImage(
                            painters[3],
                            Offset(unit.times(1f), unit.times(10f)),
                            Size(unit.times(4), unit.times(4))
                        )


                    }


                    //center rectanle
                    drawRect(
                        Color.Magenta,
                        Offset(unit.times(6), unit.times(6)),
                        Size(unit.times(3), unit.times(3))
                    )
                    drawHomeImage(
                        middlePainter,
                        Offset(unit.times(6), unit.times(6)),
                        Size(unit.times(3), unit.times(3))
                    )


                    //arrows
                    drawArrows(unit, pathColor, strokeWidth)
                    // shadow()

                }) {
            val oneUnit = maxHeight / 15

            CompositionLocalProvider(LocalUnitDP provides oneUnit) {
                content()
            }

        }
  //  }

}

fun DrawScope.drawArrows(unit: Float,pathColor: Color,strokeWidth:Float) {
    val smallStrokeWidth = strokeWidth.times(0.6f)
    
    repeat(4) {
        withTransform({
            rotate(it * 90f)
            this.translate(unit.times(0.3f), unit.times(7.5f))
        })
        {


            val path2 = Path()

            path2.moveTo(unit, unit.div(-6))

            path2.lineTo(unit + unit.div(3), 0f)
            path2.lineTo(unit, unit.div(6))
            path2.close()
            path2.moveTo(0f, unit.div(-6))

            drawPath(path2, pathColor)
            drawLine(pathColor, Offset(0f, unit.div(-6)), Offset(unit.div(6), 0f), strokeWidth = smallStrokeWidth)
            drawLine(pathColor, Offset(0f, unit.div(6)), Offset(unit.div(6), 0f), strokeWidth = smallStrokeWidth)

            drawLine(
                pathColor,
                Offset(unit.div(7), unit.div(-6)),
                Offset(unit.div(6) + unit.div(7), 0f),
                strokeWidth = smallStrokeWidth
            )
            drawLine(
                pathColor,
                Offset(unit.div(7), unit.div(6)),
                Offset(unit.div(6) + unit.div(7), 0f),
                strokeWidth = smallStrokeWidth
            )

            drawLine(
                pathColor,
                Offset(unit.div(3.5f), unit.div(-6)),
                Offset(unit.div(6) + unit.div(3.5f), 0f),
                strokeWidth = smallStrokeWidth
            )
            drawLine(
                pathColor,
                Offset(unit.div(3.5f), unit.div(6)),
                Offset(unit.div(6) + unit.div(3.5f), 0f),
                strokeWidth = smallStrokeWidth
            )

            drawLine(pathColor, Offset.Zero, Offset(unit, 0f), strokeWidth = strokeWidth)
        }

        withTransform({

            rotate(90f * it)
            this.translate(unit.times(3.3f), unit.times(6.5f))
        })
        {
            
            val path2 = Path()

            path2.moveTo(unit, unit.div(-6))

            path2.lineTo(unit + unit.div(3), 0f)
            path2.lineTo(unit, unit.div(6))
            path2.close()
            path2.moveTo(0f, unit.div(-6))

            drawPath(path2, pathColor)
            drawLine(pathColor, Offset(0f, unit.div(-6)), Offset(unit.div(6), 0f), strokeWidth = smallStrokeWidth)
            drawLine(pathColor, Offset(0f, unit.div(6)), Offset(unit.div(6), 0f), strokeWidth = smallStrokeWidth)

            drawLine(
                pathColor,
                Offset(unit.div(7), unit.div(-6)),
                Offset(unit.div(6) + unit.div(7), 0f),
                strokeWidth = smallStrokeWidth
            )
            drawLine(
                pathColor,
                Offset(unit.div(7), unit.div(6)),
                Offset(unit.div(6) + unit.div(7), 0f),
                strokeWidth = smallStrokeWidth
            )

            drawLine(
                pathColor,
                Offset(unit.div(3.5f), unit.div(-6)),
                Offset(unit.div(6) + unit.div(3.5f), 0f),
                strokeWidth = smallStrokeWidth
            )
            drawLine(
                pathColor,
                Offset(unit.div(3.5f), unit.div(6)),
                Offset(unit.div(6) + unit.div(3.5f), 0f),
                strokeWidth = smallStrokeWidth
            )

            drawLine(pathColor, Offset.Zero, Offset(unit, 0f), strokeWidth =strokeWidth)
        }

        withTransform({

            rotate(45f + 90 * it)
            this.translate(unit.times(6.8f), unit.times(5.4f))
        })
        {
            val path2 = Path()

            path2.moveTo(unit, unit.div(-6))

            path2.lineTo(unit + unit.div(3), 0f)
            path2.lineTo(unit, unit.div(6))
            path2.close()
            path2.moveTo(0f, unit.div(-6))

            drawPath(path2, pathColor)
            drawLine(pathColor, Offset(0f, unit.div(-6)), Offset(unit.div(6), 0f), strokeWidth = smallStrokeWidth)
            drawLine(pathColor, Offset(0f, unit.div(6)), Offset(unit.div(6), 0f), strokeWidth = smallStrokeWidth)

            drawLine(
                pathColor,
                Offset(unit.div(7), unit.div(-6)),
                Offset(unit.div(6) + unit.div(7), 0f),
                strokeWidth = smallStrokeWidth
            )
            drawLine(
                pathColor,
                Offset(unit.div(7), unit.div(6)),
                Offset(unit.div(6) + unit.div(7), 0f),
                strokeWidth = smallStrokeWidth
            )

            drawLine(
                pathColor,
                Offset(unit.div(3.5f), unit.div(-6)),
                Offset(unit.div(6) + unit.div(3.5f), 0f),
                strokeWidth = smallStrokeWidth
            )
            drawLine(
                pathColor,
                Offset(unit.div(3.5f), unit.div(6)),
                Offset(unit.div(6) + unit.div(3.5f), 0f),
                strokeWidth = smallStrokeWidth
            )

            drawLine(pathColor, Offset.Zero, Offset(unit, 0f), strokeWidth = strokeWidth)
        }
    }






}

fun DrawScope.drawHomeImage(
    painter:VectorPainter,
    topLeft: Offset = Offset.Zero,
    size: Size,
){
    with(painter){
        withTransform({
            this.translate(topLeft.x,topLeft.y)

            //rotate(90f)
        }){
            draw(size)
        }

    }
}
fun DrawScope.drawShadowRect(
    foreGroundColor: Color = Color.Red,
    topLeft: Offset = Offset.Zero,
    size: Size,
    shadowColor: Color = Color.Black,
) {
    val paint =
        Paint()


    val foregroundPaint =
        Paint().apply {
            color = shadowColor
        }


    val frameworkPaint =
        paint.asFrameworkPaint()

    this.drawIntoCanvas {
        val radius = 4.dp.toPx()

        frameworkPaint.color = Color
            .Transparent.toArgb()

        // frameworkPaint.
        frameworkPaint.setShadowLayer(
            radius,
            0f,
            0f,
            foreGroundColor.copy(alpha = 0.7f).toArgb(),
        )

        it.drawRoundRect(
            left = topLeft.x,
            top = topLeft.y,
            right = topLeft.x + size.width,
            bottom = topLeft.y + size.height,
            radiusX = 0.dp.toPx(),
            radiusY = 0.dp.toPx(),
            paint = foregroundPaint,
        )

        it.drawRoundRect(
            left = topLeft.x,
            top = topLeft.y,
            right = topLeft.x + size.width,
            bottom = topLeft.y + size.height,
            radiusX = 5.dp.toPx(),
            radiusY = 5.dp.toPx(),
            paint = paint,
        )
    }
}


@Preview
@Composable
fun BoardPreview() {

    val color= listOf(
        GameColor.YELLOW,
        GameColor.BLUE,
        GameColor.RED,
        GameColor.GREEN
    )

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
//        NewBoard(
//            modifier = Modifier
//                .aspectRatio(1f, false)
//
//        )
        val board = Board(
         color//GameColor.entries.toList()
//            listOf(
//                GameColor.GREEN,  //270
//                GameColor.YELLOW, //180
//                GameColor.BLUE, //90
//                GameColor.RED, //0
//            ),
        ).toBoardUiState()
        BoardUi(modifier = Modifier, boardUiStateProvider = { board }) {
        }
    }


}


val LocalUnitDP = compositionLocalOf { 10.dp }
val LocalBoard = compositionLocalOf<UBoard> {DefaultBoard }


