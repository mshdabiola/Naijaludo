package com.mshdabiola.desktop.nav

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value

interface RootComp {
    val stack : Value<ChildStack<*,Child>>

    sealed class Child{
        class MainChild(val component : ChildComponent):Child()
        class SplashChild(val component:ChildComponent):Child()
    }
}