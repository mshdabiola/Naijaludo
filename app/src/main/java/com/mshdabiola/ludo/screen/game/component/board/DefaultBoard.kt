package com.mshdabiola.ludo.screen.game.component.board

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.mshdabiola.ludo.screen.game.component.bigcat.Bigcat
import com.mshdabiola.ludo.screen.game.component.bigcat.getBlue
import com.mshdabiola.ludo.screen.game.component.bigcat.getGreen
import com.mshdabiola.ludo.screen.game.component.bigcat.getRed
import com.mshdabiola.ludo.screen.game.component.bigcat.getYellow
import com.mshdabiola.ludo.screen.game.component.car.Car
import com.mshdabiola.ludo.screen.game.component.car.getBlue
import com.mshdabiola.ludo.screen.game.component.car.getGreen
import com.mshdabiola.ludo.screen.game.component.car.getRed
import com.mshdabiola.ludo.screen.game.component.car.getYellow
import com.mshdabiola.ludo.screen.game.component.cat.Cat
import com.mshdabiola.ludo.screen.game.component.cat.getBlue
import com.mshdabiola.ludo.screen.game.component.cat.getGreen
import com.mshdabiola.ludo.screen.game.component.cat.getRed
import com.mshdabiola.ludo.screen.game.component.cat.getYellow
import com.mshdabiola.ludo.screen.game.component.dog.Dog
import com.mshdabiola.ludo.screen.game.component.dog.getBlue
import com.mshdabiola.ludo.screen.game.component.dog.getGreen
import com.mshdabiola.ludo.screen.game.component.dog.getRed
import com.mshdabiola.ludo.screen.game.component.dog.getYellow
import com.mshdabiola.ludo.screen.game.component.dragon.Dragon
import com.mshdabiola.ludo.screen.game.component.dragon.getBlue
import com.mshdabiola.ludo.screen.game.component.dragon.getGreen
import com.mshdabiola.ludo.screen.game.component.dragon.getRed
import com.mshdabiola.ludo.screen.game.component.dragon.getYellow
import com.mshdabiola.ludo.screen.game.component.fish.Fish
import com.mshdabiola.ludo.screen.game.component.fish.getBlue
import com.mshdabiola.ludo.screen.game.component.fish.getGreen
import com.mshdabiola.ludo.screen.game.component.fish.getRed
import com.mshdabiola.ludo.screen.game.component.fish.getYellow
import com.mshdabiola.ludo.screen.game.component.head.Head
import com.mshdabiola.ludo.screen.game.component.head.getBlue
import com.mshdabiola.ludo.screen.game.component.head.getGreen
import com.mshdabiola.ludo.screen.game.component.head.getRed
import com.mshdabiola.ludo.screen.game.component.head.getYellow
import com.mshdabiola.ludo.screen.game.component.man.Man
import com.mshdabiola.ludo.screen.game.component.man.getBlue
import com.mshdabiola.ludo.screen.game.component.man.getGreen
import com.mshdabiola.ludo.screen.game.component.man.getRed
import com.mshdabiola.ludo.screen.game.component.man.getYellow
import com.mshdabiola.ludo.screen.game.component.woman.Woman
import com.mshdabiola.ludo.screen.game.component.woman.getBlue
import com.mshdabiola.ludo.screen.game.component.woman.getGreen
import com.mshdabiola.ludo.screen.game.component.woman.getRed
import com.mshdabiola.ludo.screen.game.component.woman.getYellow
import com.mshdabiola.naijaludo.model.GameColor

sealed interface UItem
sealed class UBoard(private val colors: List<UColor>) : UItem {
    private fun convert(gameColors: List<GameColor>): List<UColor> {
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

    abstract fun getRedIcon(iconColor: Long, accentColor: Long): ImageVector

    protected abstract fun getGreenIcon(iconColor: Long, accentColor: Long): ImageVector

    protected abstract fun getBlueIcon(iconColor: Long, accentColor: Long): ImageVector

    protected abstract fun getYellowIcon(iconColor: Long, accentColor: Long): ImageVector

    fun getIcons(): List<ImageVector> {
        val colors = convert(GameColor.entries)
        return listOf(
            getRedIcon(colors[0].iconColor, colors[0].accentIconColor),
            getGreenIcon(colors[1].iconColor, colors[1].accentIconColor),
            getYellowIcon(colors[2].iconColor, colors[2].accentIconColor),
            getBlueIcon(colors[3].iconColor, colors[3].accentIconColor)
        )
    }
}

data object BigCatBoard :
    UBoard(listOf(UColor.Red4, UColor.Green4, UColor.Blue4, UColor.Yellow4)) {


//    override fun getPawnColor(gameColors: List<GameColor>): Map<GameColor, Color> {
//        TODO("Not yet implemented")
//    }

    override fun getRedIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Bigcat.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Bigcat.getGreen(iconColor, accentColor)

    }

    override fun getBlueIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Bigcat.getBlue(iconColor, accentColor)

    }

    override fun getYellowIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Bigcat.getYellow(iconColor, accentColor)

    }


}

data object CarBoard :
    UBoard(listOf(UColor.Red3, UColor.Green3, UColor.Blue3, UColor.Yellow3)) {


//    override fun getPawnColor(gameColors: List<GameColor>): Map<GameColor, Color> {
//        TODO("Not yet implemented")
//    }

    override fun getRedIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Car.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Car.getGreen(iconColor, accentColor)

    }

    override fun getBlueIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Car.getBlue(iconColor, accentColor)

    }

    override fun getYellowIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Car.getYellow(iconColor, accentColor)

    }


}

data object CatBoard :
    UBoard(listOf(UColor.Red2, UColor.Green2, UColor.Blue2, UColor.Yellow2)) {


    override fun getRedIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Cat.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Cat.getGreen(iconColor, accentColor)

    }

    override fun getBlueIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Cat.getBlue(iconColor, accentColor)

    }

    override fun getYellowIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Cat.getYellow(iconColor, accentColor)

    }


}

data object DogBoard :
    UBoard(listOf(UColor.Red1, UColor.Green1, UColor.Blue1, UColor.Yellow1)) {

    override fun getRedIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Dog.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Dog.getGreen(iconColor, accentColor)

    }

    override fun getBlueIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Dog.getBlue(iconColor, accentColor)

    }

    override fun getYellowIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Dog.getYellow(iconColor, accentColor)

    }


}

data object DragonBoard :
    UBoard(listOf(UColor.Red4, UColor.Green4, UColor.Blue4, UColor.Yellow4)) {


    override fun getRedIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Dragon.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Dragon.getGreen(iconColor, accentColor)

    }

    override fun getBlueIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Dragon.getBlue(iconColor, accentColor)

    }

    override fun getYellowIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Dragon.getYellow(iconColor, accentColor)

    }


}

data object FishBoard :
    UBoard(listOf(UColor.Red3, UColor.Green3, UColor.Blue3, UColor.Yellow3)) {


    override fun getRedIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Fish.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Fish.getGreen(iconColor, accentColor)

    }

    override fun getBlueIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Fish.getBlue(iconColor, accentColor)

    }

    override fun getYellowIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Fish.getYellow(iconColor, accentColor)

    }


}

data object HeadBoard :
    UBoard(listOf(UColor.Red2, UColor.Green2, UColor.Blue2, UColor.Yellow2)) {


    override fun getRedIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Head.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Head.getGreen(iconColor, accentColor)

    }

    override fun getBlueIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Head.getBlue(iconColor, accentColor)

    }

    override fun getYellowIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Head.getYellow(iconColor, accentColor)

    }


}

data object ManBoard :
    UBoard(listOf(UColor.Red1, UColor.Green1, UColor.Blue1, UColor.Yellow1)) {


    override fun getRedIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Man.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Man.getGreen(iconColor, accentColor)

    }

    override fun getBlueIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Man.getBlue(iconColor, accentColor)

    }

    override fun getYellowIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Man.getYellow(iconColor, accentColor)

    }


}

data object WomanBoard :
    UBoard(listOf(UColor.Red4, UColor.Green4, UColor.Blue4, UColor.Yellow4)) {


    override fun getRedIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Woman.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Woman.getGreen(iconColor, accentColor)

    }

    override fun getBlueIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Woman.getBlue(iconColor, accentColor)

    }

    override fun getYellowIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Woman.getYellow(iconColor, accentColor)

    }


}

//

data object BigCatBoard2 :
    UBoard(listOf(UColor.Red3, UColor.Green3, UColor.Blue3, UColor.Yellow3)) {


//    override fun getPawnColor(gameColors: List<GameColor>): Map<GameColor, Color> {
//        TODO("Not yet implemented")
//    }

    override fun getRedIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Bigcat.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Bigcat.getGreen(iconColor, accentColor)

    }

    override fun getBlueIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Bigcat.getBlue(iconColor, accentColor)

    }

    override fun getYellowIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Bigcat.getYellow(iconColor, accentColor)

    }


}

data object CarBoard2 :
    UBoard(listOf(UColor.Red2, UColor.Green2, UColor.Blue2, UColor.Yellow2)) {


//    override fun getPawnColor(gameColors: List<GameColor>): Map<GameColor, Color> {
//        TODO("Not yet implemented")
//    }

    override fun getRedIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Car.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Car.getGreen(iconColor, accentColor)

    }

    override fun getBlueIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Car.getBlue(iconColor, accentColor)

    }

    override fun getYellowIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Car.getYellow(iconColor, accentColor)

    }


}

data object CatBoard2 :
    UBoard(listOf(UColor.Red1, UColor.Green1, UColor.Blue1, UColor.Yellow1)) {


    override fun getRedIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Cat.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Cat.getGreen(iconColor, accentColor)

    }

    override fun getBlueIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Cat.getBlue(iconColor, accentColor)

    }

    override fun getYellowIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Cat.getYellow(iconColor, accentColor)

    }


}

data object DogBoard2 :
    UBoard(listOf(UColor.Red4, UColor.Green4, UColor.Blue4, UColor.Yellow4)) {

    override fun getRedIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Dog.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Dog.getGreen(iconColor, accentColor)

    }

    override fun getBlueIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Dog.getBlue(iconColor, accentColor)

    }

    override fun getYellowIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Dog.getYellow(iconColor, accentColor)

    }


}

data object DragonBoard2 :
    UBoard(listOf(UColor.Red3, UColor.Green3, UColor.Blue3, UColor.Yellow3)) {


    override fun getRedIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Dragon.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Dragon.getGreen(iconColor, accentColor)

    }

    override fun getBlueIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Dragon.getBlue(iconColor, accentColor)

    }

    override fun getYellowIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Dragon.getYellow(iconColor, accentColor)

    }


}

data object FishBoard2 :
    UBoard(listOf(UColor.Red2, UColor.Green2, UColor.Blue2, UColor.Yellow2)) {


    override fun getRedIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Fish.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Fish.getGreen(iconColor, accentColor)

    }

    override fun getBlueIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Fish.getBlue(iconColor, accentColor)

    }

    override fun getYellowIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Fish.getYellow(iconColor, accentColor)

    }


}

data object HeadBoard2 :
    UBoard(listOf(UColor.Red1, UColor.Green1, UColor.Blue1, UColor.Yellow1)) {


    override fun getRedIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Head.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Head.getGreen(iconColor, accentColor)

    }

    override fun getBlueIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Head.getBlue(iconColor, accentColor)

    }

    override fun getYellowIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Head.getYellow(iconColor, accentColor)

    }


}

data object ManBoard2 :
    UBoard(listOf(UColor.Red4, UColor.Green4, UColor.Blue4, UColor.Yellow4)) {


    override fun getRedIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Man.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Man.getGreen(iconColor, accentColor)

    }

    override fun getBlueIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Man.getBlue(iconColor, accentColor)

    }

    override fun getYellowIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Man.getYellow(iconColor, accentColor)

    }


}

data object WomanBoard2 :
    UBoard(listOf(UColor.Red2, UColor.Green2, UColor.Blue2, UColor.Yellow2)) {


    override fun getRedIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Woman.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Woman.getGreen(iconColor, accentColor)

    }

    override fun getBlueIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Woman.getBlue(iconColor, accentColor)

    }

    override fun getYellowIcon(iconColor: Long, accentColor: Long): ImageVector {
        return Woman.getYellow(iconColor, accentColor)

    }


}

sealed class UColor(
    val pawnColor: Long,
    val houseColor: Long,
    val iconColor: Long,
    val accentIconColor: Long
) {

    data object Red1 : UColor(
        pawnColor = 0xFFC62828,
        houseColor = 0xFFff8a80,
        iconColor = 0xFFF44336,
        accentIconColor = 0xFFFF1744
    )

    data object Red2 : UColor(
        pawnColor = 0xffad1457,
        houseColor = 0xFFff80ab,
        iconColor = 0xFFe91e63,
        accentIconColor = 0xFFec407a
    )

    data object Red3 : UColor(
        pawnColor = 0xff4a148c,
        houseColor = 0xFFea80fc,
        iconColor = 0xFF9c27b0,
        accentIconColor = 0xFfab47bc
    )

    data object Red4 : UColor(
        pawnColor = 0xff4527a0,
        houseColor = 0xFFb388ff,
        iconColor = 0xFF673ab7,
        accentIconColor = 0xFF7e57c2
    )

    data object Blue1 : UColor(
        pawnColor = 0xff283593,
        houseColor = 0xFF8c9eff,
        iconColor = 0xFF3f57b5,
        accentIconColor = 0xFF5c6bc0
    )

    data object Blue2 : UColor(
        pawnColor = 0xff1565c0,
        houseColor = 0xFF82b1ff,
        iconColor = 0xFF2196f3,
        accentIconColor = 0xFF42a5f5
    )

    data object Blue3 : UColor(
        pawnColor = 0xff0277bd,
        houseColor = 0xFF80d8ff,
        iconColor = 0xFF03a9f4,
        accentIconColor = 0xFF29b6f6
    )

    data object Blue4 : UColor(
        pawnColor = 0xff00838f,
        houseColor = 0xFF84ffff,
        iconColor = 0xFF00bcd4,
        accentIconColor = 0xFF26c6da
    )

    data object Green1 : UColor(
        pawnColor = 0xff00695c,
        houseColor = 0xFFa7ffeb,
        iconColor = 0xFF006988,
        accentIconColor = 0xFF26a69a
    )

    data object Green2 : UColor(
        pawnColor = 0xff2e7d32,
        houseColor = 0xFFb9f6ca,
        iconColor = 0xFF4caf50,
        accentIconColor = 0xFF66bb6a
    )

    data object Green3 : UColor(
        pawnColor = 0xff558b2f,
        houseColor = 0xFFccff90,
        iconColor = 0xFF8bc34a,
        accentIconColor = 0xFF9ccc65
    )

    data object Green4 : UColor(
        pawnColor = 0xff9e9d24,
        houseColor = 0xFFf4ff81,
        iconColor = 0xFFcddc39,
        accentIconColor = 0xFFd4e157
    )

    data object Yellow1 : UColor(
        pawnColor = 0xfff9a825,
        houseColor = 0xFFffff8d,
        iconColor = 0xFFffeb3b,
        accentIconColor = 0xFFffee58
    )

    data object Yellow2 : UColor(
        pawnColor = 0xffff8f00,
        houseColor = 0xFFffe57f,
        iconColor = 0xFFffc107,
        accentIconColor = 0xFFffca28
    )

    data object Yellow3 : UColor(
        pawnColor = 0xffef6c00,
        houseColor = 0xFFfd180,
        iconColor = 0xFFff9800,
        accentIconColor = 0xFFffa726
    )

    data object Yellow4 : UColor(
        pawnColor = 0xffd84315,
        houseColor = 0xFFff9e80,
        iconColor = 0xFFff5722,
        accentIconColor = 0xFFff7043
    )

}

data class UDice(val color: Long) : UItem

fun getAllItem(): Map<String, UItem> {
    return mapOf(
        "dice_1" to UDice(0xFFffb900), "bigcat_1" to BigCatBoard,
        "dice_2" to UDice(0xFFe74856), "car_1" to CarBoard,
        "dice_3" to UDice(0xFF0078d7), "cat_1" to CatBoard,
        "dice_4" to UDice(0xFF60a917), "dog_1" to DogBoard,
        "dice_5" to UDice(0xFF7a7574), "dragon_1" to DragonBoard,
        "dice_6" to UDice(0xFFff8c00), "fish_1" to FishBoard,
        "dice_7" to UDice(0xFFe81123), "head_1" to HeadBoard,
        "dice_8" to UDice(0xFF8e8cd8), "man_1" to ManBoard,
        "dice_9" to UDice(0xFFe3008c), "woman_1" to WomanBoard,
        "dice_10" to UDice(0xFFa0522d), "bigcat_2" to BigCatBoard2,
        "dice_11" to UDice(0xFF76608a), "car_2" to CarBoard2,
        "dice_12" to UDice(0xFFe3c800), "cat_2" to CatBoard2,
        "dice_13" to UDice(0xFFf472d0), "dog_2" to DogBoard2,
        "dice_14" to UDice(0xFF008a00), "dragon_2" to DragonBoard2,
        "dice_15" to UDice(0xFF0099bc), "fish_2" to FishBoard2,
        "head_2" to HeadBoard2,
        "man_2" to ManBoard2,
        "woman_2" to WomanBoard2,
    )
}


fun getUDice(id: String): UDice {
    return getAllItem()[id] as? UDice ?: UDice(0xFF888888)
}

fun getUBoard(id: String): UBoard {
    return getAllItem()[id] as? UBoard ?: ManBoard2
}