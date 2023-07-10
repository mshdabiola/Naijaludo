package com.mshdabiola.desktop.ui.feature.main

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Android
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.splitpane.ExperimentalSplitPaneApi
import org.jetbrains.compose.splitpane.HorizontalSplitPane
import org.jetbrains.compose.splitpane.rememberSplitPaneState


@OptIn(ExperimentalSplitPaneApi::class, ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    viewModel: MainViewModel,
) {
    val welcomeText by viewModel.welcomeText.collectAsState()
    var model by remember { mutableStateOf("") }
    val items=viewModel.models.collectAsState()

    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn(modifier = Modifier.weight(1f)) {
          items(items = items.value){
              Text(it.name)
          }
        }
        Row(modifier = Modifier.fillMaxWidth()){
            TextField(
                modifier = Modifier.weight(1f),
                value = model,
                maxLines = 1,
                onValueChange = {model=it},
                label = { Text("Text") },
                keyboardActions = KeyboardActions  (onSend = {
                    viewModel.insertModel(model)
                    model=""
                })
            )
            Button(onClick = {
                viewModel.insertModel(model)
                model=""
            }){
                Text("Send")
            }
        }

    }
}

@OptIn(ExperimentalSplitPaneApi::class, ExperimentalResourceApi::class)
@Preview
@Composable
fun id() {
    MaterialTheme{

        val state= rememberSplitPaneState(0.5f,true)
        HorizontalSplitPane(splitPaneState = state) {
            splitter {
                this.visiblePart {
                    Box(Modifier.background(Color.Yellow).width(10.dp).fillMaxHeight())
                }
                handle {
                    Box(Modifier.background(Color.Blue).width(20.dp).fillMaxHeight().markAsHandle())
                }
            }
          first {

              Image(painter = painterResource("drawables/logo.png"),"")



              Text("Abiola")  }
            second {    Button(onClick = {}, content = {
                Text("Click")
                Icon(Icons.Default.Android,contentDescription = null)
            })}
        }


    }

}