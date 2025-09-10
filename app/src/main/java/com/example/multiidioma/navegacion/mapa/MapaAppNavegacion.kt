package com.example.multiidioma.navegacion.mapa

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.mapa.MapScreen

fun NavGraphBuilder.MapaAppNavegacion(){
    composable(Destination.Mapa.route) {
        MapScreen()
    }
}