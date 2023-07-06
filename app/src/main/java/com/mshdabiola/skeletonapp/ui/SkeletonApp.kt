package com.mshdabiola.skeletonapp.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mshdabiola.designsystem.theme.SkeletonAppTheme
import com.mshdabiola.navigation.IRootComponent
import com.mshdabiola.skeletonapp.navigation.SkeletonAppNavHost


@Composable
fun SkeletonApp2(
    IRootComponent: IRootComponent
) {
    SkeletonAppTheme {
        SkeletonAppNavHost(IRootComponent = IRootComponent, modifier = Modifier.fillMaxSize())
    }
}
