package com.mshdabiola.designsystem.icon

import com.mshdabiola.designsystem.R

object LudoIcon {

    val ArrowIcon = R.drawable.arrow
    val Wifi = R.drawable.baseline_wifi_24

    private val defaultBoardType = intArrayOf(
        R.drawable.red,
        R.drawable.green,
        R.drawable.yellow,
        R.drawable.blue,
    )
    private val defaultBoardType2 = intArrayOf(
        R.drawable.green,
        R.drawable.green,
        R.drawable.green,
        R.drawable.green,
    )
    val robotIcon = intArrayOf(
        R.drawable.icon_4,
        R.drawable.icon_2,
        R.drawable.icon_3,
        R.drawable.icon_6,
        R.drawable.icon_5,
        R.drawable.icon_1,
        R.drawable.human,
    )
    private val robotIcon2 = intArrayOf()

    val BoardImage = arrayOf(defaultBoardType, defaultBoardType2)

    val DiceImage = intArrayOf(
        R.drawable.dice_1,
        R.drawable.dice_2,
        R.drawable.dice_3,
        R.drawable.dice_4,
        R.drawable.dice_5,
        R.drawable.dice_6,
    )

    val DiceRollImage = R.drawable.dice_roll

    val PlayIcon = R.drawable.ic_baseline_play_arrow_24

    val logo = R.drawable.logo

    val bg = R.drawable.bg
}
