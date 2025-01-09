package com.mshdabiola.data.di

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

actual val dispatcher: CoroutineDispatcher
    get() = Dispatchers.IO
