package com.mshdabiola.ludo.screen.game.component.board

import androidx.compose.ui.graphics.vector.ImageVector
import com.mshdabiola.ludo.screen.game.component.board.default.Blue
import com.mshdabiola.ludo.screen.game.component.board.default.Green
import com.mshdabiola.ludo.screen.game.component.board.default.Red
import com.mshdabiola.ludo.screen.game.component.board.default.Yellow
import kotlin.collections.List as ____KtList

public object Default

private var __All: ____KtList<ImageVector>? = null

public val Default.All: ____KtList<ImageVector>
  get() {
    if (__All != null) {
      return __All!!
    }
    __All= listOf(Red, Green, Yellow, Blue)
    return __All!!
  }
