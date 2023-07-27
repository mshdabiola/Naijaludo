package com.mshdabiola.navigation

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value

interface IRootComponent {
    val stack: Value<ChildStack<*, RootScreen>>

    fun navigateToGame()
    fun navigateToMarket()
    fun pop()
    sealed class RootScreen {
        class MainRootScreen(val component: MainComponent) : RootScreen()
        class GameRootScreen(val component: GameComponent) : RootScreen()

        class MarketRootRootScreen(val component: GameComponent) : RootScreen()
    }
}