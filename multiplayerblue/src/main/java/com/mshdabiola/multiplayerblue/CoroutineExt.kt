package com.mshdabiola.multiplayerblue

import kotlin.coroutines.coroutineContext
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.SendChannel
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow

/**
 * Only proceed with the given action if the coroutine has not been cancelled.
 * Necessary because Flow.collect receives items even after coroutine was cancelled
 * https://github.com/Kotlin/kotlinx.coroutines/issues/1265
 */
suspend inline fun <T> Flow<T>.safeCollect(crossinline action: suspend (T) -> Unit) {
    collect {
        coroutineContext.ensureActive()
        action(it)
    }
}

fun Job.cancelIfActive() {
    if (isActive)
        cancel()
}

@ExperimentalCoroutinesApi
fun <E> SendChannel<E>.safeOffer(value: E) = !isClosedForSend && try {
    trySend(value).isSuccess
//    offer(value)
} catch (e: CancellationException) {
    false
}

fun <T, R> Flow<T>.zipWithNext(transform: (T, T) -> R): Flow<R> = flow {
    var prev: Any? = UNDEFINED
    collect { value ->
        if (prev !== UNDEFINED) emit(transform(prev as T, value))
        prev = value
    }
}

private object UNDEFINED
