package com.mshdabiola.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mshdabiola.ui.state.ArchievementData

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun AchievementUi(
    achData: ArchievementData,
    onClick: () -> Unit = {},
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        CircularProgressIndicator(
            progress = achData.progress,
            trackColor = MaterialTheme.colorScheme.secondary.copy(alpha = 0.5f),
            strokeWidth = 16.dp,
            color = MaterialTheme.colorScheme.secondary,
        )
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            Text(
                text = achData.name,
                maxLines = 1,
                modifier = Modifier.basicMarquee(iterations = 3),
                style = MaterialTheme.typography.titleSmall,
            )
            Text(
                text = "Achievement Progress",
                maxLines = 1,
                modifier = Modifier.basicMarquee(iterations = 3),
            )
        }
        ElevatedButton(
            onClick = onClick,
            shape = RoundedCornerShape(0f, 50f, 50f, 0f),
        ) {
            Text(text = "More")
        }
    }
}
//
// @Preview
// @Composable
// fun ArchUiPreview() {
//    LudoAppTheme {
//        AchievementUi(achData = ArchievementData("King of Ludo", 0.6f))
//    }
//
// }
