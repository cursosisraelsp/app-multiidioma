package com.example.multiidioma.navegacion.mapa

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.mapa.MapScreen

fun NavGraphBuilder.MapaAppNavegacion(onClose: () -> Unit,navController : NavHostController){
    composable(Destination.Mapa.route) {
        MapScreen(onClose = onClose,navController)
    }
}