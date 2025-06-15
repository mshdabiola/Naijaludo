/*
 *abiola 2024
 */

@file:OptIn(ExperimentalMaterial3Api::class)

package com.mshdabiola.designsystem.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mshdabiola.designsystem.component.LudoTopAppBar
import com.mshdabiola.designsystem.icon.LudoIcons

@OptIn(ExperimentalMaterial3Api::class)
@Preview("Top App Bar")
@Composable
private fun LudoTopAppBarPreview() {
    LudoTopAppBar(
        titleRes = "",
        navigationIcon = LudoIcons.Search,
        navigationIconContentDescription = "Navigation icon",
        actionIcon = LudoIcons.MoreVert,
        actionIconContentDescription = "Action icon",
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview("Top App Bar")
@Composable
private fun DetailTopAppBarPreview() {
    LudoTopAppBar(
        titleRes = "Preview",
        navigationIcon = LudoIcons.Search,
        navigationIconContentDescription = "Navigation icon",
        actionIcon = LudoIcons.MoreVert,
        actionIconContentDescription = "Action icon",
    )
}
