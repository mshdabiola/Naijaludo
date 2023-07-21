package com.mshdabiola.ludo.screen.game.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.DragScope
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.ClipOp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Matrix
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.inset
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathBuilder
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.graphics.vector.VectorPainter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mshdabiola.designsystem.R
import com.mshdabiola.ludo.screen.game.state.BoardUiState
import com.mshdabiola.ludo.screen.game.state.toBoardUiState
import com.mshdabiola.naijaludo.model.Board
import com.mshdabiola.naijaludo.model.GameColor
import com.mshdabiola.naijaludo.model.Point

@Composable
fun BoardUi(
    modifier: Modifier = Modifier,
    boardUiStateProvider: () -> BoardUiState,
    content: @Composable BoxScope.() -> Unit = {},
) {
    val boardUiState = boardUiStateProvider()
    AnimatedVisibility(
        modifier = modifier.aspectRatio(1f),
        visible = boardUiState.pathBoxes.isNotEmpty(),
    ) {
        BoxWithConstraints(
            modifier = modifier
                .background(Color.White),
        ) {
            val oneUnit = maxHeight / 15

            CompositionLocalProvider(LocalUnitDP provides oneUnit) {
                BoardBoxUi(boardUiState = boardUiState)
                content()
            }
        }
    }
}

@Composable
fun BoardBoxUi(boardUiState: BoardUiState) {
//    val redIndex = remember(boardUiState.colors) {
//        boardUiState.colors.indexOf(GameColor.RED) * 90f
//    }

    Box(modifier = Modifier) {
        CenterGraphic(point = Point(6f, 6f))
        boardUiState.homeBoxes.forEachIndexed { index, box ->
            HomeBoxUi(box = box, colorIndex = index, boardType = boardUiState.boardType)
        }
        boardUiState.pathBoxes.forEach {
            BoxUi(box = it)
        }
        boardUiState.heavenBoxes.forEach {
            SafeBoxUi(box = it)
        }
        if (boardUiState.pathBoxes.isNotEmpty()) {
            ArrowImage()
        }
    }
}

@Composable
fun ArrowImage() {
    val oneUnit = LocalUnitDP.current
    Box(Modifier.fillMaxSize()) {
        for (r in 0..270 step 90) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .rotate(r.toFloat()),
            ) {
                ArrowBox(
                    modifier = Modifier
                        .size(oneUnit.times(2), oneUnit)
                        .padding(oneUnit.div(4))
                        .offset(0.dp, oneUnit.times(7)),
                )
                ArrowBox(
                    modifier = Modifier
                        .size(oneUnit.times(2), oneUnit)
                        .padding(oneUnit.div(4))
                        .offset(
                            oneUnit.times(3),
                            oneUnit.times(6),
                        ),
                )
                ArrowBox(
                    modifier = Modifier
                        .size(oneUnit.times(2), oneUnit)
                        .padding(oneUnit.div(4))
                        .offset(
                            oneUnit.times(5),
                            oneUnit.times(5.5f),
                        )
                        .rotate(-45f),
                )
            }
        }
    }
}

@Composable
fun NewBoard(){

    val path= Path()

    PathParser()
        .parsePathString("M1.9,7.79l1.74,0l-3.64,6.3l1.71,0l3.63,-6.3l1.71,0l-3.64,6.3l1.71,0l3.63,-6.3l1.71,0l-3.64,6.3l1.71,0l3.63,-6.3l19.33,0l0,6.3l12.2,-7.05l-12.2,-7.04l0,6.3l-19.33,0l-3.63,-6.3l-1.71,0l3.64,6.3l-1.71,0l-3.63,-6.3l-1.71,0l3.64,6.3l-1.71,0l-3.63,-6.3l-1.71,0l3.64,6.3l-1.74,0l0,1.49z" )
        .toPath(path)

    Canvas(modifier = Modifier.size(100.dp)){
        val unit=size.width.div(15)
        drawRect(Color.White)

        drawRect(Color.Red, Offset(unit.times(1f),unit.times(6)), Size(unit,unit))
        drawRect(Color.Red, Offset(unit.times(1f),unit.times(7)), Size(unit.times(5),unit))
        repeat(5){
            val first=it+1
            drawCircle(
                Color.White,unit.div(2.5f), Offset(unit.times(first+0.5f),unit.times(7.5f))
            )
        }

        drawRect(Color.Blue, Offset(unit.times(6),unit.times(13)), Size(unit,unit))
        drawRect(Color.Blue, Offset(unit.times(7f),unit.times(9)), Size(unit,unit.times(5)))
        repeat(5){
            val first=it+9
            drawCircle(
                Color.White,unit.div(2.5f), Offset(unit.times(7.5f),unit.times(first+0.5f))
            )
        }

        drawRect(Color.Green, Offset(unit.times(8),unit.times(1)), Size(unit,unit))
        drawRect(Color.Green, Offset(unit.times(7f),unit.times(1)), Size(unit,unit.times(5)))

        repeat(5){
            val first=it+1
            drawCircle(
                Color.White,unit.div(2.5f), Offset(unit.times(7.5f),unit.times(first+0.5f))
            )
        }

        drawRect(Color.Yellow, Offset(unit.times(13),unit.times(8)), Size(unit,unit))
        drawRect(Color.Yellow, Offset(unit.times(9),unit.times(7)), Size(unit.times(5),unit))
        repeat(5){
            val first=it+9
            drawCircle(
                Color.White,unit.div(2.5f), Offset(unit.times(first+0.5f),unit.times(7.5f))
            )
        }


        repeat(14){
            val inx=it+1
            drawLine(Color.Gray, start = Offset(inx.times(unit),0f), end = Offset(inx.times(unit),size.height), strokeWidth = unit.times(0.1f))
        }
        repeat(14){
            val inx=it+1
            drawLine(Color.Gray, start = Offset(0f,inx.times(unit)), end = Offset(size.width,inx.times(unit)), strokeWidth =  unit.times(0.1f))
        }

        drawRect(Color.Red, Offset.Zero, Size(unit.times(6),unit.times(6)))

        drawRect(Color.Blue, Offset(0f,unit.times(9)), Size(unit.times(6),unit.times(6)))

        drawRect(Color.Green, Offset(unit.times(9),0f), Size(unit.times(6),unit.times(6)))

        drawRect(Color.Yellow, Offset(unit.times(9),unit.times(9)), Size(unit.times(6),unit.times(6)))

        drawRect(Color.Magenta, Offset(unit.times(6),unit.times(6)), Size(unit.times(3),unit.times(3)))

        drawi(path, Offset.Zero,unit,1f)
    }
}

fun DrawScope.drawi(path:Path,start:Offset,unit:Float,rotate:Float){

    repeat(4){
        withTransform({
            rotate(it*90f)
            this.translate(unit.times(0.3f),unit.times(7.5f))
        })
        {

            val scroke=unit.times(0.06f)
            val color=Color.Gray
            val path2= Path()

            path2.moveTo(unit,unit.div(-6))

            path2.lineTo(unit+unit.div(3),0f)
            path2.lineTo(unit,unit.div(6))
            path2.close()
            path2.moveTo(0f,unit.div(-6))

            drawPath(path2, color)
            drawLine(color, Offset(0f,unit.div(-6)),Offset(unit.div(6),0f),strokeWidth = scroke)
            drawLine(color, Offset(0f,unit.div(6)),Offset(unit.div(6),0f),strokeWidth = scroke)

            drawLine(color, Offset(unit.div(7),unit.div(-6)),Offset(unit.div(6)+unit.div(7),0f),strokeWidth = scroke)
            drawLine(color, Offset(unit.div(7),unit.div(6)),Offset(unit.div(6)+unit.div(7),0f),strokeWidth = scroke)

            drawLine(color, Offset(unit.div(3.5f),unit.div(-6)),Offset(unit.div(6)+unit.div(3.5f),0f),strokeWidth = scroke)
            drawLine(color, Offset(unit.div(3.5f),unit.div(6)),Offset(unit.div(6)+unit.div(3.5f),0f),strokeWidth = scroke)

            drawLine(color, Offset.Zero,Offset(unit,0f), strokeWidth = unit.times(0.1f))
        }

        withTransform({

            rotate(90f*it)
            this.translate(unit.times(3.3f),unit.times(6.5f))
        })
        {

            val scroke=unit.times(0.06f)
            val color=Color.Gray
            val path2= Path()

            path2.moveTo(unit,unit.div(-6))

            path2.lineTo(unit+unit.div(3),0f)
            path2.lineTo(unit,unit.div(6))
            path2.close()
            path2.moveTo(0f,unit.div(-6))

            drawPath(path2, color)
            drawLine(color, Offset(0f,unit.div(-6)),Offset(unit.div(6),0f),strokeWidth = scroke)
            drawLine(color, Offset(0f,unit.div(6)),Offset(unit.div(6),0f),strokeWidth = scroke)

            drawLine(color, Offset(unit.div(7),unit.div(-6)),Offset(unit.div(6)+unit.div(7),0f),strokeWidth = scroke)
            drawLine(color, Offset(unit.div(7),unit.div(6)),Offset(unit.div(6)+unit.div(7),0f),strokeWidth = scroke)

            drawLine(color, Offset(unit.div(3.5f),unit.div(-6)),Offset(unit.div(6)+unit.div(3.5f),0f),strokeWidth = scroke)
            drawLine(color, Offset(unit.div(3.5f),unit.div(6)),Offset(unit.div(6)+unit.div(3.5f),0f),strokeWidth = scroke)

            drawLine(color, Offset.Zero,Offset(unit,0f), strokeWidth = unit.times(0.1f))
        }
    }

    withTransform({

        this.translate(unit.times(3.3f),unit.times(6.5f))
    })
    {

        val scroke=unit.times(0.06f)
        val color=Color.Gray
        val path2= Path()

        path2.moveTo(unit,unit.div(-6))

        path2.lineTo(unit+unit.div(3),0f)
        path2.lineTo(unit,unit.div(6))
        path2.close()
        path2.moveTo(0f,unit.div(-6))

        drawPath(path2, color)
        drawLine(color, Offset(0f,unit.div(-6)),Offset(unit.div(6),0f),strokeWidth = scroke)
        drawLine(color, Offset(0f,unit.div(6)),Offset(unit.div(6),0f),strokeWidth = scroke)

        drawLine(color, Offset(unit.div(7),unit.div(-6)),Offset(unit.div(6)+unit.div(7),0f),strokeWidth = scroke)
        drawLine(color, Offset(unit.div(7),unit.div(6)),Offset(unit.div(6)+unit.div(7),0f),strokeWidth = scroke)

        drawLine(color, Offset(unit.div(3.5f),unit.div(-6)),Offset(unit.div(6)+unit.div(3.5f),0f),strokeWidth = scroke)
        drawLine(color, Offset(unit.div(3.5f),unit.div(6)),Offset(unit.div(6)+unit.div(3.5f),0f),strokeWidth = scroke)

        drawLine(color, Offset.Zero,Offset(unit,0f), strokeWidth = unit.times(0.1f))
    }





    repeat(4){
        withTransform({

            rotate(45f+90*it)
            this.translate(unit.times(6.8f),unit.times(5.4f))
        })
        {

            val scroke=unit.times(0.06f)
            val color=Color.Gray
            val path2= Path()

            path2.moveTo(unit,unit.div(-6))

            path2.lineTo(unit+unit.div(3),0f)
            path2.lineTo(unit,unit.div(6))
            path2.close()
            path2.moveTo(0f,unit.div(-6))

            drawPath(path2, color)
            drawLine(color, Offset(0f,unit.div(-6)),Offset(unit.div(6),0f),strokeWidth = scroke)
            drawLine(color, Offset(0f,unit.div(6)),Offset(unit.div(6),0f),strokeWidth = scroke)

            drawLine(color, Offset(unit.div(7),unit.div(-6)),Offset(unit.div(6)+unit.div(7),0f),strokeWidth = scroke)
            drawLine(color, Offset(unit.div(7),unit.div(6)),Offset(unit.div(6)+unit.div(7),0f),strokeWidth = scroke)

            drawLine(color, Offset(unit.div(3.5f),unit.div(-6)),Offset(unit.div(6)+unit.div(3.5f),0f),strokeWidth = scroke)
            drawLine(color, Offset(unit.div(3.5f),unit.div(6)),Offset(unit.div(6)+unit.div(3.5f),0f),strokeWidth = scroke)

            drawLine(color, Offset.Zero,Offset(unit,0f), strokeWidth = unit.times(0.1f))
        }
    }




}

@Preview
@Composable
fun BoardPreview() {



    NewBoard()
//    val board = Board(
//        listOf(
//            GameColor.GREEN,
//            GameColor.YELLOW,
//            GameColor.BLUE,
//            GameColor.RED,
//        ),
//    ).toBoardUiState()
//    BoardUi(boardUiStateProvider = { board }) {
//    }
}

val LocalUnitDP = compositionLocalOf { 10.dp }



