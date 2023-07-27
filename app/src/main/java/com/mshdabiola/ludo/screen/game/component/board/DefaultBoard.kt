package com.mshdabiola.ludo.screen.game.component.board

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.mshdabiola.ludo.screen.game.component.board.boardicon.getBlue
import com.mshdabiola.ludo.screen.game.component.board.boardicon.getGreen
import com.mshdabiola.ludo.screen.game.component.board.boardicon.getRed
import com.mshdabiola.ludo.screen.game.component.board.boardicon.getYellow
import com.mshdabiola.naijaludo.model.GameColor

sealed class UBoard(private val colors:List<UColor>){
  protected  fun convert(gameColors:List<GameColor>):List<UColor>{
        return gameColors.map {
            map(it)
        }
    }
    private fun map(gameColor: GameColor):UColor{
        return when(gameColor){
            GameColor.RED->colors[0]
            GameColor.GREEN->colors[1]
            GameColor.YELLOW->colors[2]
            GameColor.BLUE->colors[3]
        }
    }

    fun getColor(gameColor: GameColor):Color{
        return map(gameColor).pawnColor
    }



    abstract fun getHouseColor(gameColors: List<GameColor>):List<Color>
    abstract fun getPawnColor(gameColors: List<GameColor>):Map<GameColor,Color>

   abstract  fun getRedIcon(iconColor:Color,accentColor:Color) : ImageVector

  protected  abstract  fun getGreenIcon(iconColor:Color,accentColor:Color): ImageVector

   protected abstract  fun getBlueIcon(iconColor:Color,accentColor:Color): ImageVector

   protected abstract  fun getYellowIcon(iconColor:Color,accentColor:Color):ImageVector

     fun getIcons():List<ImageVector>{
        val colors= convert(GameColor.entries)
        return listOf(
            getRedIcon(colors[0].iconColor, colors[0].accentIconColor),
            getGreenIcon(colors[1].iconColor, colors[1].accentIconColor),
            getYellowIcon(colors[2].iconColor, colors[2].accentIconColor),
            getBlueIcon(colors[3].iconColor, colors[3].accentIconColor)
        )
    }
}

 data object DefaultBoard :UBoard(listOf(UColor.Red,UColor.Green,UColor.Blue,UColor.Yellow)){

     override fun getHouseColor(gameColors: List<GameColor>):List<Color>{
         return convert(gameColors)
             .map { it.houseColor }

     }

     override fun getPawnColor(gameColors: List<GameColor>): Map<GameColor, Color> {
         TODO("Not yet implemented")
     }

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
    val pawnColor:Color,
    val houseColor: Color,
    val iconColor: Color,
    val accentIconColor: Color
) {
    data object Red : UColor(Color(0xFFb71e1d),Color(0xFFef9a9a), Color(0xFFe94539),  Color(0xFFea5456))
    data object Green : UColor(Color(0xFF2e7e34),Color(0xFF84c69e),Color(0xFF4daf50),  Color(0xFF67b76a))
    data object Blue : UColor(Color(0xFF2764ae),Color(0xFF559fd7),Color(0xFF547ec0),  Color(0xFF428ecc))
    data object Yellow : UColor(Color(0xFFf7a826),Color(0xFFffee5a),Color(0xFFc6bb01),  Color(0xFFffec2d))

    data object Purple : UColor(Color(0xFF4527A0),Color(0xFF7C4DFF),Color(0xFF673AB7),  Color(
        0xFF7E57C2
    )
    )

    data object Orange : UColor(Color(0xFFC62828),Color(0xFFFF5252),Color(0xFFF44336),  Color(
        0xFFFF1744
    )


    )
    data object LightGreen : UColor(Color(0xFF00838F),Color(0xFF18FFFF),Color(0xFF00BCD4),  Color(
        0xFF26C6DA
    )
    )

    data object LightRed : UColor(Color(0xFFAD1457),Color(0xFFFF4081),Color(0xFFE91E63),  Color(
        0xFFEC407A
    )
    )

}