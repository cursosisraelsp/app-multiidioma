package com.example.multiidioma.navegacion.cretus

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.centros.cretus.CretusScreen

fun NavGraphBuilder.CretusAppNavegacion(){
    composable (Destination.Cretus.route) {
        CretusScreen()
    }
}