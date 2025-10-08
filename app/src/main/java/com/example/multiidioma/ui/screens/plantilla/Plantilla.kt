package com.example.multiidioma.ui.screens.plantilla


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.multiidioma.data.types.states.PlantillaState
import com.example.multiidioma.ui.LocalizedContext

@Composable
fun Plantilla(itemId : String){

    val viewModel: PlantillaViewModel = viewModel();
    val uiState by viewModel.uiState.collectAsState();

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
                Column {
                    Text("Isto é un texto de plantilla $itemId")
                    datos.name?.let { Text(it) }

                    // comento a seguinte liña porque será un párrafo
                    datos.info?.let {  lista ->
                        lista.forEach { item ->
                            if (item != null) {

                                Text(context.getString(item))
                            }
                        } }
                }

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