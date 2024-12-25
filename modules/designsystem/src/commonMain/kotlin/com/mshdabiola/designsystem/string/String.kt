package com.mshdabiola.designsystem.string

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import naijaludo.modules.designsystem.generated.resources.Res
import naijaludo.modules.designsystem.generated.resources.app_name
import org.jetbrains.compose.resources.stringResource

val appName
    @Composable
    get() = stringResource(Res.string.app_name)

object Dimensions {
    val Base = 8.dp
    val Base2 = 16.dp
    val Base3 = 32.dp
    val Base4 = 64.dp
    val PlayButtonSize = 96.dp
    val LogoSize = 200.dp
    val LogoButtonSpace = 128.dp
}
