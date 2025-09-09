package com.example.multiidioma.ui.screens.mapa

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.types.MarkerType
import com.example.multiidioma.ui.components.GoogleMapComponent

@Composable
fun MapScreen() {
    var selectedItem by remember { mutableStateOf(0) }
    val items = listOf("Centros", "Institutos")

    Scaffold(
        bottomBar = {
            NavigationBar {
                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        icon = { Icon(Icons.Filled.Place, contentDescription = null) },
                        label = { Text(item) },
                        selected = selectedItem == index,
                        onClick = { selectedItem = index }
                    )
                }
            }
        }
    ) { paddingValues ->
        val markerTypeValue = if (selectedItem == 0) MarkerType.CENTROS_SINGULARES else MarkerType.INSTITUTOS_INVESTIGACION

        GoogleMapComponent(
            markerType = markerTypeValue,
            modifier = Modifier.padding(paddingValues)
        )
    }
}