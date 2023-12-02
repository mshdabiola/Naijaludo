package com.mshdabiola.navigation

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.router.stack.push
import com.arkivanov.decompose.value.Value
import kotlinx.serialization.Serializable

class RootComponent(
    componentContext: ComponentContext,
) : IRootComponent, ComponentContext by componentContext {
    private val navigation = StackNavigation<Config>()


    override val stack: Value<ChildStack<*, IRootComponent.RootScreen>>
        get() = _stack

    override fun navigateToGame() {
        try {
            navigation.push(Config.Game)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    override fun navigateToMarket() {
        try {
            navigation.push(Config.Market)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    override fun pop() {
        navigation.pop()
    }

    private val _stack = childStack(
        source = navigation,
        serializer = Config.serializer(),
        initialConfiguration = Config.Main,
        handleBackButton = true,
        childFactory = ::factory
    )

    @Serializable
    private sealed interface Config  {

        @Serializable
        data object Main : Config

        @Serializable
        data object Game : Config

        @Serializable
        data object Market : Config

    }

    private fun factory(
        config: Config,
        componentContext: ComponentContext
    ): IRootComponent.RootScreen {
        return when (config) {
            is Config.Game -> IRootComponent.RootScreen.GameRootScreen(
                navigateToGame(
                    componentContext
                )
            )

            is Config.Market -> IRootComponent.RootScreen.MarketRootRootScreen(
                navigateToGame(
                    componentContext
                )
            )

            is Config.Main -> IRootComponent.RootScreen.MainRootScreen(
                navigateToMain(
                    componentContext
                )
            )
        }
    }

    private fun navigateToMain(componentContext: ComponentContext): MainComponent {
        return MainComponent(componentContext)
    }

    private fun navigateToGame(componentContext: ComponentContext): GameComponent {
        return GameComponent(
            componentContext,
            //  onSplashFinished = {navigation.replaceCurrent(Config.Main)}
        )
    }
}
