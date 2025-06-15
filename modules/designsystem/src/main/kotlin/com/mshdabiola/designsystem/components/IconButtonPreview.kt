/*
 *abiola 2022
 */

package com.mshdabiola.designsystem.components

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import com.mshdabiola.designsystem.component.SkIconToggleButton
import com.mshdabiola.designsystem.icon.LudoIcons
import com.mshdabiola.designsystem.theme.LudoTheme

@ThemePreviews
@Composable
fun IconButtonPreview() {
    LudoTheme {
        SkIconToggleButton(
            checked = true,
            onCheckedChange = { },
            icon = {
                Icon(
                    imageVector = LudoIcons.BookmarkBorder,
                    contentDescription = null,
                )
            },
            checkedIcon = {
                Icon(
                    imageVector = LudoIcons.Bookmark,
                    contentDescription = null,
                )
            },
        )
    }
}

@ThemePreviews
@Composable
fun IconButtonPreviewUnchecked() {
    LudoTheme {
        SkIconToggleButton(
            checked = false,
            onCheckedChange = { },
            icon = {
                Icon(
                    imageVector = LudoIcons.BookmarkBorder,
                    contentDescription = null,
                )
            },
            checkedIcon = {
                Icon(
                    imageVector = LudoIcons.Bookmark,
                    contentDescription = null,
                )
            },
        )
    }
}
