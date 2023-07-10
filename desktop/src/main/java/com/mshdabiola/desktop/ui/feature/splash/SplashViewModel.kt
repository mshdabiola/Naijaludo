package com.mshdabiola.desktop.ui.feature.splash

import com.mshdabiola.desktop.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class SplashViewModel (): ViewModel() {

    companion object {
        const val SPLASH_DELAY = 2000L // 2 seconds of splash delay
    }

    private val _isSplashFinished = MutableStateFlow(false)
    val isSplashFinished: StateFlow<Boolean> = _isSplashFinished

    init{
        viewModelScope.launch {
            delay(SPLASH_DELAY)
            _isSplashFinished.value = true
        }
    }
}