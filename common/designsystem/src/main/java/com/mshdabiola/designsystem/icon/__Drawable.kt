package com.mshdabiola.designsystem.icon

import androidx.compose.ui.graphics.vector.ImageVector
import com.mshdabiola.designsystem.icon.drawable.BaselineWifi24
import com.mshdabiola.designsystem.icon.drawable.Bg
import com.mshdabiola.designsystem.icon.drawable.Blutooth
import com.mshdabiola.designsystem.icon.drawable.Brand
import com.mshdabiola.designsystem.icon.drawable.Computer
import com.mshdabiola.designsystem.icon.drawable.ComputerMultiplayer
import com.mshdabiola.designsystem.icon.drawable.Friend
import com.mshdabiola.designsystem.icon.drawable.IcBaselinePlayArrow24
import com.mshdabiola.designsystem.icon.drawable.IcLauncherBackground
import com.mshdabiola.designsystem.icon.drawable.Icon1
import com.mshdabiola.designsystem.icon.drawable.Icon2
import com.mshdabiola.designsystem.icon.drawable.Icon3
import com.mshdabiola.designsystem.icon.drawable.Icon4
import com.mshdabiola.designsystem.icon.drawable.Icon5
import com.mshdabiola.designsystem.icon.drawable.Icon6
import com.mshdabiola.designsystem.icon.drawable.Logo
import com.mshdabiola.designsystem.icon.drawable.Middle
import com.mshdabiola.designsystem.icon.drawable.Mutiplay
import com.mshdabiola.designsystem.icon.drawable.Resume
import kotlin.collections.List as ____KtList

public object Drawable

private var __AllIcons: ____KtList<ImageVector>? = null

public val Drawable.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(BaselineWifi24, Bg, Blutooth, Brand, Computer, ComputerMultiplayer,
        Friend,  IcBaselinePlayArrow24, IcLauncherBackground, Icon1, Icon2, Icon3,
        Icon4, Icon5, Icon6, Logo, Middle, Mutiplay, Resume)
    return __AllIcons!!
  }
