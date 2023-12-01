package com.mshdabiola.ludo.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.fade
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.plus
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.slide
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.mshdabiola.ludo.screen.DEVICE_TYPE
import com.mshdabiola.ludo.screen.game.GameScreenNav
import com.mshdabiola.ludo.screen.main.MainScreenNav
import com.mshdabiola.ludo.screen.market.MarketScreenNav
import com.mshdabiola.navigation.IRootComponent


@Composable
fun LudoNavHost(
    iRootComponent: IRootComponent,
    modifier: Modifier,
    deviceType: DEVICE_TYPE,

    ) {

    Children(
        stack = iRootComponent.stack,
        modifier = modifier,
        animation = stackAnimation(fade() + slide())
    ) {

        when (it.instance) {
            is IRootComponent.RootScreen.MainRootScreen -> {
                MainScreenNav(
                    navigateToGame =  iRootComponent::navigateToGame ,
                    navigateToMarket = iRootComponent::navigateToMarket,
                    deviceType = deviceType
                )
            }

            is IRootComponent.RootScreen.GameRootScreen -> {
                GameScreenNav(deviceType = deviceType, onBack =iRootComponent::pop ) {
                    iRootComponent.pop()
                    iRootComponent.navigateToMarket()
                }
            }

            is IRootComponent.RootScreen.MarketRootRootScreen -> {
                MarketScreenNav(deviceType = deviceType) {
                    iRootComponent.pop()
                }
            }
        }

    }
}
