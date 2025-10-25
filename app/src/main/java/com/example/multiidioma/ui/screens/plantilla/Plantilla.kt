package com.example.multiidioma.ui.screens.plantilla

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.multiidioma.data.types.states.PlantillaState
import com.example.multiidioma.ui.LocalizedContext
import com.example.multiidioma.ui.components.Templates.PersonalTemplateScreen



@Composable
fun Plantilla(centro: String,itemId : String,navController: NavController){

    val viewModel: PlantillaViewModel = viewModel();
    val uiState by viewModel.uiState.collectAsState();

    // 👇 Cada vez que cambie el centro, se vuelve a cargar la lista correspondiente
    LaunchedEffect(centro) {
        viewModel.loadPlantillaPorCentro(centro)
    }
    when (uiState) {
        is PlantillaState.Loading -> {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        }

        is PlantillaState.Success -> {
            val context = LocalizedContext.current
            val itemIdInt = itemId.toInt()
            val datos = (uiState as PlantillaState.Success).infoResearchers[itemIdInt]
            if(datos != null){

                PersonalTemplateScreen(infoResearchers = datos, navController = navController)
            }else{
                Text("Falta información de usuario")
            }

        }

        is PlantillaState.Error -> {
            Text("Algo está pasando")
        }
        else -> Text("Non se carga")
    }
}