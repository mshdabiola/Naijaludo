package com.mshdabiola.desktop

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel

open class ViewModel(){
     val viewModelScope: CoroutineScope =
        CoroutineScope(SupervisorJob() + Dispatchers.Main.immediate)

 fun destroy() {
        viewModelScope.coroutineContext.cancel()
        viewModelScope.cancel()
    }
}