package com.example.multiidioma.ui.cimus

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
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
fun CimusScreen(
    languageViewModel: LanguageViewModel
) {
    // ✅ Usamos el contexto traducido desde CompositionLocal
    val context = LocalizedContext.current
    // Aquí iría tu ViewModel de Cimus
    val viewModel: CimusViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()

    when (uiState) {
        is CimusScreenState.Loading -> {
            Text("non cargou")
        }
        is CimusScreenState.Error -> Text((uiState as CimusScreenState.Error).message, color = Color.Red)

        is CimusScreenState.Success -> {
            val miniScreens = (uiState as CimusScreenState.Success).miniScreens
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(0.dp)
            ) {
                items(miniScreens) { data ->
                    when (data.id) {
                        0 -> MiniScreen0(data, Modifier.fillMaxWidth())
                        1 -> MiniScreen1(data, Modifier.fillMaxWidth())
                        2 -> MiniScreen2(data, Modifier.fillMaxWidth())
                        else -> Text("MiniScreen desconocida (id=${data.id})")
                    }
                }
            }
        }
    }
}
