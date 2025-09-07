package com.example.multiidioma.ui.screens.detail

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.multiidioma.data.types.ContentType
import com.example.multiidioma.ui.screens.institute.InstitutesScreen
import com.example.multiidioma.ui.screens.multimedia.MultimediaScreen

@Composable
fun DetailScreen(navController: NavController, detailViewModel: DetailViewModel = viewModel()){
    val state by detailViewModel.detailScreenState.collectAsState()

    when (val imaxenClick = state.detailImaxenClick){
        null -> {
            // Muestra un indicador de carga
            Text(text = "Cargando...")
        }
        else -> {
            // Ahora podemos usar 'item' de forma segura
            Box(modifier = Modifier.fillMaxSize()) {
                when(imaxenClick.contentType){
                    is ContentType.MultimediaContent ->{
                        MultimediaScreen()
                    }
                    is ContentType.MinervaContent -> {
                        Text(text = "Estou en minerva")
                    }
                    is ContentType.MapContent -> {
                        Text(text = "Estou en mapa")
                    }
                    is ContentType.CentroSingularContent -> {
                        Text(text = "Estou en centros sigulares")
                    }
                    is ContentType.InstitutoInvestigation -> {
                        InstitutesScreen(navController)
                    }
                    else -> {
                        Text("screen non atopado")
                    }
                }
            }
        }
    }
}