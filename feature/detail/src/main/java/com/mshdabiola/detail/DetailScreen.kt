package com.mshdabiola.detail



import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mshdabiola.ui.MyCard
import org.koin.androidx.compose.koinViewModel


@Composable
 fun DetailScreenn(onBack : ()->Unit) {
    val viewModel: DetailViewModel = koinViewModel()
    DetailScreen(back=onBack)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun DetailScreen(
back : ()->Unit={}
) {
    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = back) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "back")
                    }
                },
                title = {
                    Text(text = "name")
                }
            )
        }
    ) { paddingValues ->
        Column(Modifier.padding(paddingValues)) {
            MyCard()
        }
    }
}

@Preview
@Composable
fun DetailScreenPreview() {
    DetailScreen()

}