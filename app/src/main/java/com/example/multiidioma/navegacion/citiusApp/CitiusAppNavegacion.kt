package com.example.multiidioma.navegacion.citiusApp

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.centros.citius.CitiusScreen

fun NavGraphBuilder.CitiusAppNavegacion(){
    composable(Destination.Citius.route) {
        CitiusScreen()
    }
}