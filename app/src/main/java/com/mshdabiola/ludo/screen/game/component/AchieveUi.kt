package com.mshdabiola.ludo.screen.game.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import com.mshdabiola.ludo.screen.game.state.ArchievementData

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun AchievementUi(
    achData: ArchievementData,
    onClick: () -> Unit = {}
) {
    ListItem(
        modifier = Modifier.clip(RoundedCornerShape(0.5f)),
        leadingContent = { CircularProgressIndicator(progress = achData.progress) },
        headlineContent = {
            Text(
                text = achData.name,
                maxLines = 1,
                modifier = Modifier.basicMarquee(iterations = 3)
            )
        },
        supportingContent = {
            Text(
                text = "Achievement Progress",
                maxLines = 1,
                modifier = Modifier.basicMarquee(iterations = 3)
            )
        },
        trailingContent = {
            Button(
                onClick = onClick,
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primaryContainer)
            ) {
                Text(text = "More")
            }
        }
    )
}

@Preview
@Composable
fun ArchUiPreview() {
    AchievementUi(achData = ArchievementData("King of Ludo", 0.6f))
}