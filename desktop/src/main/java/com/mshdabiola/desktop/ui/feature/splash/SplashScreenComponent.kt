package com.mshdabiola.desktop.ui.feature.splash

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.essenty.lifecycle.doOnDestroy
import com.mshdabiola.desktop.nav.SplashComp
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class SplashScreenComponent(
    private val componentContext: ComponentContext,
    private val onSplashFinished: () -> Unit,
) : SplashComp, ComponentContext by componentContext, KoinComponent {

    private val splashViewModel by inject<SplashViewModel>()

    override fun onSplashFinish() {
        onSplashFinished()
    }

    init {
        componentContext.lifecycle.doOnDestroy {
            splashViewModel.destroy()
        }
    }

    @Composable
    override fun render() {

        val isSplashFinished by splashViewModel.isSplashFinished.collectAsState()

        if (isSplashFinished) {
            onSplashFinished()
        }

        SplashScreen(
            viewModel = splashViewModel
        )
    }
}