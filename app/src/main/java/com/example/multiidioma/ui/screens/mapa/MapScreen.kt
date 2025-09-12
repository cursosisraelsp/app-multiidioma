package com.example.multiidioma.ui.screens.mapa

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.multiidioma.R
import com.example.multiidioma.data.types.MarkerType
import com.example.multiidioma.ui.components.GoogleMapComponent

@Composable
fun MapScreen(onClose: () -> Unit,navController : NavHostController) {
    var selectedItem by remember { mutableStateOf(2) }
    val items = listOf("Centros", "Institutos","Institutos e centros")

    Box(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            bottomBar = {
                NavigationBar {
                    items.forEachIndexed { index, item ->
                        NavigationBarItem(
                            icon = {
                                if(item == "Centros"){
                                    Icon(painterResource(R.drawable.centro_de_investigacion), contentDescription = null, modifier = Modifier.size(20.dp))
                                    //Icon(Icons.Filled.Place)// ImageVector
                                }
                                if(item == "Institutos"){
                                    Icon(painterResource(R.drawable.cientifico), contentDescription = null, modifier = Modifier.size(20.dp))
                                }
                                if(item == "Institutos e centros"){
                                    Icon(painterResource(R.drawable.instituto_all), contentDescription = null, modifier = Modifier.size(20.dp))
                                }

                                   },
                            label = { Text(item) },
                            selected = selectedItem == index,
                            onClick = { selectedItem = index }
                        )
                    }
                }
            }
        ) { paddingValues ->
            val markerTypeValue = when (selectedItem) {
                0 -> MarkerType.CENTROS_SINGULARES
                1 -> MarkerType.INSTITUTOS_INVESTIGACION
                else -> MarkerType.INSTITUTOS_e_CENTROS
            }

            GoogleMapComponent(
                markerType = markerTypeValue,
                modifier = Modifier.padding(paddingValues)
            )

        }

        IconButton(

            onClick = {
                onClose()
                navController.navigate("home")
            },
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(16.dp)
                .background(Color.White, CircleShape)
        ) {
            Icon(Icons.Default.Close, contentDescription = "Cerrar mapa")
        }


    }
}