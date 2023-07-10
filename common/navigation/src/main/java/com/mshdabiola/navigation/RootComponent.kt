package com.mshdabiola.navigation

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.router.stack.push
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.parcelable.Parcelable
import com.arkivanov.essenty.parcelable.Parcelize

class RootComponent(
    componentContext: ComponentContext,
) : IRootComponent, ComponentContext by componentContext {
    private val navigation = StackNavigation<Config>()


    override val stack: Value<ChildStack<*, IRootComponent.RootScreen>>
        get() = _stack

    override fun navigateToGame() {
        navigation.push(Config.Game)
    }

    override fun pop() {
        navigation.pop()
    }

    private val _stack = childStack(
        source = navigation,
        initialConfiguration = Config.Main,
        handleBackButton = true,
        childFactory = ::factory
    )


    private sealed interface Config : Parcelable {

        @Parcelize
        object Main : Config

        @Parcelize
        object Game : Config

    }

    private fun factory(
        config: Config,
        componentContext: ComponentContext
    ): IRootComponent.RootScreen {
        return when (config) {
            is Config.Game -> IRootComponent.RootScreen.GameRootScreen(
                navigateToSplash(
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

    private fun navigateToSplash(componentContext: ComponentContext): GameComponent {
        return GameComponent(
            componentContext,
            //  onSplashFinished = {navigation.replaceCurrent(Config.Main)}
        )
    }
}
