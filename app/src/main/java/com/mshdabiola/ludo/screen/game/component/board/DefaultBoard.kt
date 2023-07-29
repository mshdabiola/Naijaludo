package com.mshdabiola.ludo.screen.game.component.board

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.mshdabiola.ludo.screen.game.component.board.boardicon.getBlue
import com.mshdabiola.ludo.screen.game.component.board.boardicon.getGreen
import com.mshdabiola.ludo.screen.game.component.board.boardicon.getRed
import com.mshdabiola.ludo.screen.game.component.board.boardicon.getYellow
import com.mshdabiola.naijaludo.model.GameColor

sealed interface UItem
sealed class UBoard(private val colors: List<UColor>) : UItem {
    protected fun convert(gameColors: List<GameColor>): List<UColor> {
        return gameColors.map {
            map(it)
        }
    }

    private fun map(gameColor: GameColor): UColor {
        return when (gameColor) {
            GameColor.RED -> colors[0]
            GameColor.GREEN -> colors[1]
            GameColor.YELLOW -> colors[2]
            GameColor.BLUE -> colors[3]
        }
    }

    fun getColor(gameColor: GameColor): Color {
        return Color(map(gameColor).pawnColor)
    }


    fun getHouseColor(gameColors: List<GameColor>): List<Color> {
        return convert(gameColors)
            .map { Color(it.houseColor) }
    }

//    abstract fun getPawnColor(gameColors: List<GameColor>): Map<GameColor, Color>

    abstract fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector

    protected abstract fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector

    protected abstract fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector

    protected abstract fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector

    fun getIcons(): List<ImageVector> {
        val colors = convert(GameColor.entries)
        return listOf(
            getRedIcon(Color(colors[0].iconColor), Color(colors[0].accentIconColor)),
            getGreenIcon(Color(colors[1].iconColor), Color(colors[1].accentIconColor)),
            getYellowIcon(Color(colors[2].iconColor), Color(colors[2].accentIconColor)),
            getBlueIcon(Color(colors[3].iconColor), Color(colors[3].accentIconColor))
        )
    }
}

data object DefaultBoard :
    UBoard(listOf(UColor.Red1, UColor.Green1, UColor.Blue1, UColor.Yellow1)) {


//    override fun getPawnColor(gameColors: List<GameColor>): Map<GameColor, Color> {
//        TODO("Not yet implemented")
//    }

    override fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Default.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Default.getGreen(iconColor, accentColor)

    }

    override fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Default.getBlue(iconColor, accentColor)

    }

    override fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Default.getYellow(iconColor, accentColor)

    }


}

data object DefaultBoard2 :
    UBoard(listOf(UColor.Red2, UColor.Green2, UColor.Blue2, UColor.Yellow2)) {


//    override fun getPawnColor(gameColors: List<GameColor>): Map<GameColor, Color> {
//        TODO("Not yet implemented")
//    }

    override fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Default.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Default.getGreen(iconColor, accentColor)

    }

    override fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Default.getBlue(iconColor, accentColor)

    }

    override fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Default.getYellow(iconColor, accentColor)

    }


}

data object DefaultBoard3 :
    UBoard(listOf(UColor.Red3, UColor.Green3, UColor.Blue3, UColor.Yellow3)) {


//    override fun getPawnColor(gameColors: List<GameColor>): Map<GameColor, Color> {
//        TODO("Not yet implemented")
//    }

    override fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Default.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Default.getGreen(iconColor, accentColor)

    }

    override fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Default.getBlue(iconColor, accentColor)

    }

    override fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Default.getYellow(iconColor, accentColor)

    }


}

data object DefaultBoard4 :
    UBoard(listOf(UColor.Red4, UColor.Green4, UColor.Blue4, UColor.Yellow4)) {


//    override fun getPawnColor(gameColors: List<GameColor>): Map<GameColor, Color> {
//        TODO("Not yet implemented")
//    }

    override fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Default.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Default.getGreen(iconColor, accentColor)

    }

    override fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Default.getBlue(iconColor, accentColor)

    }

    override fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Default.getYellow(iconColor, accentColor)

    }


}

sealed class UColor(
    val pawnColor: Long,
    val houseColor: Long,
    val iconColor: Long,
    val accentIconColor: Long
) {

    data object Red1 : UColor(
        0xFFC62828,
        0xFFFF5252,
        0xFFF44336,
        0xFFFF1744
    )

    data object Red2 : UColor(
        pawnColor = 0xffad1457,
        houseColor = 0xFFff4081,
        iconColor = 0xFFe91e63,
        accentIconColor = 0xFFec407a
    )

    data object Red3 : UColor(
        pawnColor = 0xff6a1b9a,
        houseColor = 0xFFe040fb,
        iconColor = 0xFF9c27b0,
        accentIconColor = 0xFfab47bc
    )

    data object Red4 : UColor(
        pawnColor = 0xff4527a0,
        houseColor = 0xFF7c4dff,
        iconColor = 0xFF673ab7,
        accentIconColor = 0xFF7e57c2
    )

    data object Blue1 : UColor(
        pawnColor = 0xff283593,
        houseColor = 0xFF536dfe,
        iconColor = 0xFF3f57b5,
        accentIconColor = 0xFF5c6bc0
    )

    data object Blue2 : UColor(
        pawnColor = 0xff1565c0,
        houseColor = 0xFF448aff,
        iconColor = 0xFF2196f3,
        accentIconColor = 0xFF42a5f5
    )

    data object Blue3 : UColor(
        pawnColor = 0xff0277bd,
        houseColor = 0xFF40c4ff,
        iconColor = 0xFF03a9f4,
        accentIconColor = 0xFF29b6f6
    )

    data object Blue4 : UColor(
        pawnColor = 0xff00838f,
        houseColor = 0xFF18ffff,
        iconColor = 0xFF00bcd4,
        accentIconColor = 0xFF26c6da
    )

    data object Green1 : UColor(
        pawnColor = 0xff00695c,
        houseColor = 0xFF64ffda,
        iconColor = 0xFF006988,
        accentIconColor = 0xFF26a69a
    )

    data object Green2 : UColor(
        pawnColor = 0xff2e7d32,
        houseColor = 0xFF69f0ae,
        iconColor = 0xFF4caf50,
        accentIconColor = 0xFF66bb6a
    )

    data object Green3 : UColor(
        pawnColor = 0xff558b2f,
        houseColor = 0xFFb2ff59,
        iconColor = 0xFF8bc34a,
        accentIconColor = 0xFF9ccc65
    )

    data object Green4 : UColor(
        pawnColor = 0xff9e9d24,
        houseColor = 0xFFeeff41,
        iconColor = 0xFFcddc39,
        accentIconColor = 0xFFd4e157
    )

    data object Yellow1 : UColor(
        pawnColor = 0xfff9a825,
        houseColor = 0xFFffff00,
        iconColor = 0xFFffeb3b,
        accentIconColor = 0xFFffee58
    )

    data object Yellow2 : UColor(
        pawnColor = 0xffff8f00,
        houseColor = 0xFFffd740,
        iconColor = 0xFFffc107,
        accentIconColor = 0xFFffca28
    )

    data object Yellow3 : UColor(
        pawnColor = 0xffef6c00,
        houseColor = 0xFFffab40,
        iconColor = 0xFFff9800,
        accentIconColor = 0xFFffa726
    )

    data object Yellow4 : UColor(
        pawnColor = 0xffd84315,
        houseColor = 0xFFff6e40,
        iconColor = 0xFFff5722,
        accentIconColor = 0xFFff7043
    )

}

data class UDice(val color: Long) : UItem

fun getAllItem(): Map<String, UItem> {
    return mapOf(
        "dice_1" to UDice(0xFFffb900),  "default_board_1" to DefaultBoard2,
        "dice_2" to UDice(0xFFe74856),  "default_board_3" to DefaultBoard3,
        "dice_3" to UDice(0xFF0078d7),  "default_board_4" to DefaultBoard4,
        "dice_4" to UDice(0xFF60a917),
        "dice_5" to UDice(0xFF7a7574),
        "dice_6" to UDice(0xFFff8c00),
        "dice_7" to UDice(0xFFe81123),
        "dice_8" to UDice(0xFF8e8cd8),
        "dice_9" to UDice(0xFFe3008c),
        "dice_10" to UDice(0xFFa0522d),
        "dice_11" to UDice(0xFF76608a),
        "dice_12" to UDice(0xFFe3c800),
        "dice_13" to UDice(0xFFf472d0),
        "dice_14" to UDice(0xFF008a00),
        "dice_15" to UDice(0xFF0099bc),

        )
}

fun getUDice(id:String):UDice{
    return getAllItem()[id] as? UDice ?: UDice(0xFF888888)
}

fun getUBoard(id:String):UBoard{
    return getAllItem()[id] as? UBoard ?: DefaultBoard
}