package com.example.multiidioma.ui.cimus

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.multiidioma.data.CimusScreenState
import com.example.multiidioma.ui.LocalizedContext
import com.example.multiidioma.ui.cimus.miniscreens.MiniScreen0
import com.example.multiidioma.ui.cimus.miniscreens.MiniScreen1
import com.example.multiidioma.ui.cimus.miniscreens.MiniScreen2
import com.example.multiidioma.viewmodel.LanguageViewModel



@Composable
fun CimusScreen() {
    val context = LocalizedContext.current
    val viewModel: CimusViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()

    when (uiState) {
        is CimusScreenState.Loading -> {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator()
            }
        }
        is CimusScreenState.Success -> {
            val screens = (uiState as CimusScreenState.Success).screens
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(screens) { data ->
                    when (data.id) {
                        0 -> MiniScreen0(data, Modifier.fillMaxWidth().fillParentMaxHeight())
                        1 -> MiniScreen1(data, Modifier.fillMaxWidth().fillParentMaxHeight())
                        2 -> MiniScreen2(data, Modifier.fillMaxWidth().fillParentMaxHeight())
                        else -> Text("MiniScreen desconocida")
                    }
                }
            }
        }
        is CimusScreenState.Error -> {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(
                    text = (uiState as CimusScreenState.Error).message,
                    color = Color.Red
                )
            }
        }
    }
}


