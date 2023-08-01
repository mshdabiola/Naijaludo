package com.mshdabiola.ludo.screen.market

import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect


@Composable
fun NotifySnacker(snackHostState: SnackbarHostState, notifys: Notify?) {
    LaunchedEffect(key1 = notifys, block = {
        if (notifys!=null) {
            val result = snackHostState.showSnackbar(
                message = notifys.message,
                withDismissAction = notifys.withDismissAction,
                actionLabel = notifys.label,
                duration = if (notifys.isShort) SnackbarDuration.Short else SnackbarDuration.Long,
            )
            when (result) {
                SnackbarResult.ActionPerformed -> {
                }

                SnackbarResult.Dismissed -> {
                    notifys.callback()
                }
            }
        }
    })
}