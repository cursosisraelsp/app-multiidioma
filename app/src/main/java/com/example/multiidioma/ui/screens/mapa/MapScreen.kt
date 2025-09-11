package com.example.multiidioma.ui.screens.mapa

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Settings
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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.multiidioma.data.types.MarkerType
import com.example.multiidioma.ui.components.GoogleMapComponent

@Composable
fun MapScreen(onClose: () -> Unit,navController : NavHostController) {
    var selectedItem by remember { mutableStateOf(0) }
    var outra by remember { mutableStateOf("boas") }
    val items = listOf("Centros", "Institutos")
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    Box(modifier = Modifier.fillMaxSize()) {
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
            val markerTypeValue =
                if (selectedItem == 0) MarkerType.CENTROS_SINGULARES else MarkerType.INSTITUTOS_INVESTIGACION

            GoogleMapComponent(
                markerType = markerTypeValue,
                modifier = Modifier.padding(paddingValues)
            )
        }

Column {
    IconButton(
        /*onClick = {
            onClose()
            outra = "outras variables"},*/
        onClick = { onClose() },
        modifier = Modifier
            //.align(Alignment.TopEnd)
            .padding(16.dp)
            .background(Color.White, CircleShape)
    ) {
        Icon(Icons.Default.Close, contentDescription = "Cerrar mapa")
    }
    IconButton(
        onClick = {
            onClose()
            outra = "outras de novoss"},
        modifier = Modifier
            //.align(Alignment.TopEnd)
            .padding(16.dp)
            .background(Color.White, CircleShape)
    ) {
        Icon(Icons.Default.Settings, contentDescription = "Cerrar mapa")
    }
}

        Column{
            Text("ruta ? $currentRoute")
            Text("$outra")
        }

    }
}