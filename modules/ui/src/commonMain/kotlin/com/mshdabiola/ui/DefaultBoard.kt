package com.mshdabiola.ui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.mshdabiola.designsystem.icon.bigcat.Bigcat
import com.mshdabiola.designsystem.icon.bigcat.getBlue
import com.mshdabiola.designsystem.icon.bigcat.getGreen
import com.mshdabiola.designsystem.icon.bigcat.getRed
import com.mshdabiola.designsystem.icon.bigcat.getYellow
import com.mshdabiola.designsystem.icon.car.Car
import com.mshdabiola.designsystem.icon.car.getBlue
import com.mshdabiola.designsystem.icon.car.getGreen
import com.mshdabiola.designsystem.icon.car.getRed
import com.mshdabiola.designsystem.icon.car.getYellow
import com.mshdabiola.designsystem.icon.cat.Cat
import com.mshdabiola.designsystem.icon.cat.getBlue
import com.mshdabiola.designsystem.icon.cat.getGreen
import com.mshdabiola.designsystem.icon.cat.getRed
import com.mshdabiola.designsystem.icon.cat.getYellow
import com.mshdabiola.designsystem.icon.dog.Dog
import com.mshdabiola.designsystem.icon.dog.getBlue
import com.mshdabiola.designsystem.icon.dog.getGreen
import com.mshdabiola.designsystem.icon.dog.getRed
import com.mshdabiola.designsystem.icon.dog.getYellow
import com.mshdabiola.designsystem.icon.dragon.Dragon
import com.mshdabiola.designsystem.icon.dragon.getBlue
import com.mshdabiola.designsystem.icon.dragon.getGreen
import com.mshdabiola.designsystem.icon.dragon.getRed
import com.mshdabiola.designsystem.icon.dragon.getYellow
import com.mshdabiola.designsystem.icon.fish.Fish
import com.mshdabiola.designsystem.icon.fish.getBlue
import com.mshdabiola.designsystem.icon.fish.getGreen
import com.mshdabiola.designsystem.icon.fish.getRed
import com.mshdabiola.designsystem.icon.fish.getYellow
import com.mshdabiola.designsystem.icon.head.Head
import com.mshdabiola.designsystem.icon.head.getBlue
import com.mshdabiola.designsystem.icon.head.getGreen
import com.mshdabiola.designsystem.icon.head.getRed
import com.mshdabiola.designsystem.icon.head.getYellow
import com.mshdabiola.designsystem.icon.man.Man
import com.mshdabiola.designsystem.icon.man.getBlue
import com.mshdabiola.designsystem.icon.man.getGreen
import com.mshdabiola.designsystem.icon.man.getRed
import com.mshdabiola.designsystem.icon.man.getYellow
import com.mshdabiola.designsystem.icon.woman.Woman
import com.mshdabiola.designsystem.icon.woman.getBlue
import com.mshdabiola.designsystem.icon.woman.getGreen
import com.mshdabiola.designsystem.icon.woman.getRed
import com.mshdabiola.designsystem.icon.woman.getYellow
import com.mshdabiola.designsystem.theme.ColorFamily
import com.mshdabiola.designsystem.theme.extendedColorScheme
import com.mshdabiola.naijaludo.model.GameColor

sealed interface UItem
sealed class UBoard(private val colors: List<ColorFamily>) : UItem {
    private fun convert(gameColors: List<GameColor>): List<ColorFamily> {
        return gameColors.map {
            map(it)
        }
    }

    private fun map(gameColor: GameColor): ColorFamily {
        return when (gameColor) {
            GameColor.RED -> colors[0]
            GameColor.GREEN -> colors[1]
            GameColor.YELLOW -> colors[2]
            GameColor.BLUE -> colors[3]
        }
    }

    fun getColor(gameColor: GameColor): Color {
        return map(gameColor).onColorContainer
    }

    fun getHouseColor(gameColors: List<GameColor>): List<Color> {
        return convert(gameColors)
            .map { it.colorContainer }
    }

//    abstract fun getPawnColor(gameColors: List<GameColor>): Map<GameColor, Color>

    abstract fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector

    protected abstract fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector

    protected abstract fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector

    protected abstract fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector

    fun getIcons(): List<ImageVector> {
        val colors = convert(GameColor.entries)
        return listOf(
            getRedIcon(colors[0].color, colors[0].onColor),
            getGreenIcon(colors[1].color, colors[1].onColor),
            getYellowIcon(colors[2].color, colors[2].onColor),
            getBlueIcon(colors[3].color, colors[3].onColor),
        )
    }
}

data object BigCatBoard :
    UBoard(listOf(extendedColorScheme.red4, extendedColorScheme.green4, extendedColorScheme.blue4, extendedColorScheme.green4)) {

//    override fun getPawnColor(gameColors: List<GameColor>): Map<GameColor, Color> {
//        TODO("Not yet implemented")
//    }

    override fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Bigcat.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Bigcat.getGreen(iconColor, accentColor)
    }

    override fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Bigcat.getBlue(iconColor, accentColor)
    }

    override fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Bigcat.getYellow(iconColor, accentColor)
    }
}

data object CarBoard :
    UBoard(listOf(extendedColorScheme.red3, extendedColorScheme.green3, extendedColorScheme.blue3, extendedColorScheme.green3)) {

//    override fun getPawnColor(gameColors: List<GameColor>): Map<GameColor, Color> {
//        TODO("Not yet implemented")
//    }

    override fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Car.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Car.getGreen(iconColor, accentColor)
    }

    override fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Car.getBlue(iconColor, accentColor)
    }

    override fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Car.getYellow(iconColor, accentColor)
    }
}

data object CatBoard :
    UBoard(listOf(extendedColorScheme.red2, extendedColorScheme.green2, extendedColorScheme.blue2, extendedColorScheme.green2)) {

    override fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Cat.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Cat.getGreen(iconColor, accentColor)
    }

    override fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Cat.getBlue(iconColor, accentColor)
    }

    override fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Cat.getYellow(iconColor, accentColor)
    }
}

data object DogBoard :
    UBoard(listOf(extendedColorScheme.red1, extendedColorScheme.green1, extendedColorScheme.blue1, extendedColorScheme.green1)) {

    override fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Dog.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Dog.getGreen(iconColor, accentColor)
    }

    override fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Dog.getBlue(iconColor, accentColor)
    }

    override fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Dog.getYellow(iconColor, accentColor)
    }
}

data object DragonBoard :
    UBoard(listOf(extendedColorScheme.red4, extendedColorScheme.green4, extendedColorScheme.blue4, extendedColorScheme.green4)) {

    override fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Dragon.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Dragon.getGreen(iconColor, accentColor)
    }

    override fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Dragon.getBlue(iconColor, accentColor)
    }

    override fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Dragon.getYellow(iconColor, accentColor)
    }
}

data object FishBoard :
    UBoard(listOf(extendedColorScheme.red3, extendedColorScheme.green3, extendedColorScheme.blue3, extendedColorScheme.green3)) {

    override fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Fish.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Fish.getGreen(iconColor, accentColor)
    }

    override fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Fish.getBlue(iconColor, accentColor)
    }

    override fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Fish.getYellow(iconColor, accentColor)
    }
}

data object HeadBoard :
    UBoard(listOf(extendedColorScheme.red2, extendedColorScheme.green2, extendedColorScheme.blue2, extendedColorScheme.green2)) {

    override fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Head.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Head.getGreen(iconColor, accentColor)
    }

    override fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Head.getBlue(iconColor, accentColor)
    }

    override fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Head.getYellow(iconColor, accentColor)
    }
}

data object ManBoard :
    UBoard(listOf(extendedColorScheme.red1, extendedColorScheme.green1, extendedColorScheme.blue1, extendedColorScheme.green1)) {

    override fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Man.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Man.getGreen(iconColor, accentColor)
    }

    override fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Man.getBlue(iconColor, accentColor)
    }

    override fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Man.getYellow(iconColor, accentColor)
    }
}

data object WomanBoard :
    UBoard(listOf(extendedColorScheme.red4, extendedColorScheme.green4, extendedColorScheme.blue4, extendedColorScheme.green4)) {

    override fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Woman.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Woman.getGreen(iconColor, accentColor)
    }

    override fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Woman.getBlue(iconColor, accentColor)
    }

    override fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Woman.getYellow(iconColor, accentColor)
    }
}

//

data object BigCatBoard2 :
    UBoard(listOf(extendedColorScheme.red3, extendedColorScheme.green3, extendedColorScheme.blue3, extendedColorScheme.green3)) {

//    override fun getPawnColor(gameColors: List<GameColor>): Map<GameColor, Color> {
//        TODO("Not yet implemented")
//    }

    override fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Bigcat.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Bigcat.getGreen(iconColor, accentColor)
    }

    override fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Bigcat.getBlue(iconColor, accentColor)
    }

    override fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Bigcat.getYellow(iconColor, accentColor)
    }
}

data object CarBoard2 :
    UBoard(listOf(extendedColorScheme.red2, extendedColorScheme.green2, extendedColorScheme.blue2, extendedColorScheme.green2)) {

//    override fun getPawnColor(gameColors: List<GameColor>): Map<GameColor, Color> {
//        TODO("Not yet implemented")
//    }

    override fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Car.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Car.getGreen(iconColor, accentColor)
    }

    override fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Car.getBlue(iconColor, accentColor)
    }

    override fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Car.getYellow(iconColor, accentColor)
    }
}

data object CatBoard2 :
    UBoard(listOf(extendedColorScheme.red1, extendedColorScheme.green1, extendedColorScheme.blue1, extendedColorScheme.green1)) {

    override fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Cat.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Cat.getGreen(iconColor, accentColor)
    }

    override fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Cat.getBlue(iconColor, accentColor)
    }

    override fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Cat.getYellow(iconColor, accentColor)
    }
}

data object DogBoard2 :
    UBoard(listOf(extendedColorScheme.red4, extendedColorScheme.green4, extendedColorScheme.blue4, extendedColorScheme.green4)) {

    override fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Dog.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Dog.getGreen(iconColor, accentColor)
    }

    override fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Dog.getBlue(iconColor, accentColor)
    }

    override fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Dog.getYellow(iconColor, accentColor)
    }
}

data object DragonBoard2 :
    UBoard(listOf(extendedColorScheme.red3, extendedColorScheme.green3, extendedColorScheme.blue3, extendedColorScheme.green3)) {

    override fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Dragon.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Dragon.getGreen(iconColor, accentColor)
    }

    override fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Dragon.getBlue(iconColor, accentColor)
    }

    override fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Dragon.getYellow(iconColor, accentColor)
    }
}

data object FishBoard2 :
    UBoard(listOf(extendedColorScheme.red2, extendedColorScheme.green2, extendedColorScheme.blue2, extendedColorScheme.green2)) {

    override fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Fish.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Fish.getGreen(iconColor, accentColor)
    }

    override fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Fish.getBlue(iconColor, accentColor)
    }

    override fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Fish.getYellow(iconColor, accentColor)
    }
}

data object HeadBoard2 :
    UBoard(listOf(extendedColorScheme.red1, extendedColorScheme.green1, extendedColorScheme.blue1, extendedColorScheme.green1)) {

    override fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Head.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Head.getGreen(iconColor, accentColor)
    }

    override fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Head.getBlue(iconColor, accentColor)
    }

    override fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Head.getYellow(iconColor, accentColor)
    }
}

data object ManBoard2 :
    UBoard(listOf(extendedColorScheme.red4, extendedColorScheme.green4, extendedColorScheme.blue4, extendedColorScheme.green4)) {

    override fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Man.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Man.getGreen(iconColor, accentColor)
    }

    override fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Man.getBlue(iconColor, accentColor)
    }

    override fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Man.getYellow(iconColor, accentColor)
    }
}

data object WomanBoard2 :
    UBoard(listOf(extendedColorScheme.red2, extendedColorScheme.green2, extendedColorScheme.blue2, extendedColorScheme.green2)) {

    override fun getRedIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Woman.getRed(iconColor, accentColor)
    }

    override fun getGreenIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Woman.getGreen(iconColor, accentColor)
    }

    override fun getBlueIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Woman.getBlue(iconColor, accentColor)
    }

    override fun getYellowIcon(iconColor: Color, accentColor: Color): ImageVector {
        return Woman.getYellow(iconColor, accentColor)
    }
}
//
// sealed class extendedColorScheme(
//    val onColor: Long,
//    val containColor: Long,
//    val onContainerColor: Long,
//    val color: Long,
// ) {
//
//    data object red1 : extendedColorScheme(
//        onColor = 0xFFC62828,
//        containColor = 0xFFff8a80,
//        onContainerColor = 0xFFF44336,
//        color = 0xFFFF1744,
//    )
//
//    data object red2 : extendedColorScheme(
//        onColor = 0xffad1457,
//        containColor = 0xFFff80ab,
//        onContainerColor = 0xFFe91e63,
//        color = 0xFFec407a,
//    )
//
//    data object red3 : extendedColorScheme(
//        onColor = 0xff4a148c,
//        containColor = 0xFFea80fc,
//        onContainerColor = 0xFF9c27b0,
//        color = 0xFfab47bc,
//    )
//
//    data object Red4 : extendedColorScheme(
//        onColor = 0xff4527a0,
//        containColor = 0xFFb388ff,
//        onContainerColor = 0xFF673ab7,
//        color = 0xFF7e57c2,
//    )
//
//    data object blue1 : extendedColorScheme(
//        onColor = 0xff283593,
//        containColor = 0xFF8c9eff,
//        onContainerColor = 0xFF3f57b5,
//        color = 0xFF5c6bc0,
//    )
//
//    data object blue2 : extendedColorScheme(
//        onColor = 0xff1565c0,
//        containColor = 0xFF82b1ff,
//        onContainerColor = 0xFF2196f3,
//        color = 0xFF42a5f5,
//    )
//
//    data object blue3 : extendedColorScheme(
//        onColor = 0xff0277bd,
//        containColor = 0xFF80d8ff,
//        onContainerColor = 0xFF03a9f4,
//        color = 0xFF29b6f6,
//    )
//
//    data object blue4 : extendedColorScheme(
//        onColor = 0xff00838f,
//        containColor = 0xFF84ffff,
//        onContainerColor = 0xFF00bcd4,
//        color = 0xFF26c6da,
//    )
//
//    data object green1 : extendedColorScheme(
//        onColor = 0xff00695c,
//        containColor = 0xFFa7ffeb,
//        onContainerColor = 0xFF006988,
//        color = 0xFF26a69a,
//    )
//
//    data object green2 : extendedColorScheme(
//        onColor = 0xff2e7d32,
//        containColor = 0xFFb9f6ca,
//        onContainerColor = 0xFF4caf50,
//        color = 0xFF66bb6a,
//    )
//
//    data object green3 : extendedColorScheme(
//        onColor = 0xff558b2f,
//        containColor = 0xFFccff90,
//        onContainerColor = 0xFF8bc34a,
//        color = 0xFF9ccc65,
//    )
//
//    data object green4 : extendedColorScheme(
//        onColor = 0xff9e9d24,
//        containColor = 0xFFf4ff81,
//        onContainerColor = 0xFFcddc39,
//        color = 0xFFd4e157,
//    )
//
//    data object green1 : extendedColorScheme(
//        onColor = 0xfff9a825,
//        containColor = 0xFFffff8d,
//        onContainerColor = 0xFFffeb3b,
//        color = 0xFFffee58,
//    )
//
//    data object green2 : extendedColorScheme(
//        onColor = 0xffff8f00,
//        containColor = 0xFFffe57f,
//        onContainerColor = 0xFFffc107,
//        color = 0xFFffca28,
//    )
//
//    data object green3 : extendedColorScheme(
//        onColor = 0xffef6c00,
//        containColor = 0xFFfd180,
//        onContainerColor = 0xFFff9800,
//        color = 0xFFffa726,
//    )
//
//    data object green4 : extendedColorScheme(
//        onColor = 0xffd84315,
//        containColor = 0xFFff9e80,
//        onContainerColor = 0xFFff5722,
//        color = 0xFFff7043,
//    )
// }

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
        "default_dice" to UDice(0xFF888888),
    )
}

fun getUDice(id: String): UDice {
    return getAllItem()[id] as? UDice ?: UDice(0xFF888888)
}

fun getUBoard(id: String): UBoard {
    return getAllItem()[id] as? UBoard ?: ManBoard2
}
