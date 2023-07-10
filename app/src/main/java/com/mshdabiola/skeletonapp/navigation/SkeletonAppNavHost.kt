package com.mshdabiola.skeletonapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.fade
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.plus
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.slide
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.mshdabiola.detail.DetailScreenn
import com.mshdabiola.mainscreen.MainScreenNav
import com.mshdabiola.navigation.IRootComponent


@Composable
fun SkeletonAppNavHost(IRootComponent: IRootComponent, modifier: Modifier) {

    Children(
        stack = IRootComponent.stack,
        modifier=modifier,
        animation = stackAnimation(fade()+ slide())
        ){

        when(it.instance){
            is IRootComponent.RootScreen.MainRootScreen->{
                MainScreenNav { IRootComponent.navigateToDetail() }
            }
            is IRootComponent.RootScreen.DetailRootScreen->{
                DetailScreenn {

                }
            }
        }

    }
}
