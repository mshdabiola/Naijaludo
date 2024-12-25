/*
 *abiola 2022
 */

package com.mshdabiola.designsystem.components

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import com.mshdabiola.designsystem.component.SkIconToggleButton
import com.mshdabiola.designsystem.icon.SkIcons
import com.mshdabiola.designsystem.theme.LudoAppTheme

@ThemePreviews
@Composable
fun IconButtonPreview() {
    LudoAppTheme {
        SkIconToggleButton(
            checked = true,
            onCheckedChange = { },
            icon = {
                Icon(
                    imageVector = SkIcons.BookmarkBorder,
                    contentDescription = null,
                )
            },
            checkedIcon = {
                Icon(
                    imageVector = SkIcons.Bookmark,
                    contentDescription = null,
                )
            },
        )
    }
}

@ThemePreviews
@Composable
fun IconButtonPreviewUnchecked() {
    LudoAppTheme {
        SkIconToggleButton(
            checked = false,
            onCheckedChange = { },
            icon = {
                Icon(
                    imageVector = SkIcons.BookmarkBorder,
                    contentDescription = null,
                )
            },
            checkedIcon = {
                Icon(
                    imageVector = SkIcons.Bookmark,
                    contentDescription = null,
                )
            },
        )
    }
}
