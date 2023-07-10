package com.mshdabiola.desktop.nav

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.fade
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.plus
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.scale
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.replaceCurrent
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.parcelable.Parcelable
import com.mshdabiola.desktop.ui.feature.splash.SplashScreenComponent
import com.mshdabiola.desktop.ui.feature.main.MainScreenComponent

class DefaultRootComp(
    componentContext: ComponentContext,
) : RootComp, ComponentContext by componentContext{
    private val navigation = StackNavigation<Config>()


    override val stack: Value<ChildStack<*, RootComp.Child>>
        get() = _stack
    private val _stack = childStack(
        source = navigation,
        initialConfiguration = Config.Splash,
        handleBackButton = true,
        childFactory = ::factory

    )


    private sealed interface Config: Parcelable{
        object Main : Config
        object Splash : Config
    }

    private fun factory(config: Config,componentContext: ComponentContext):RootComp.Child{
       return when(config){
            is Config.Splash-> RootComp.Child.SplashChild(navigateToSplash(componentContext))
            is Config.Main->RootComp.Child.MainChild(navigateToMain(componentContext))
        }
    }

    fun navigateToMain(componentContext: ComponentContext):MainComp{
        return MainScreenComponent(componentContext)
    }
    fun navigateToSplash(componentContext: ComponentContext):SplashComp{
        return SplashScreenComponent(
            componentContext,
            onSplashFinished = {navigation.replaceCurrent(Config.Main)})
    }
}

@Composable
fun RootComp(component:RootComp,modifier: Modifier) {
    Children(
        stack = component.stack,
        modifier=modifier,
        animation = stackAnimation(fade()+ scale())
        ){
        when(val child =it.instance){

            is RootComp.Child.MainChild->{
                child.component.render()
            }
            is RootComp.Child.SplashChild->{
                child.component.render()
            }
        }
    }
}