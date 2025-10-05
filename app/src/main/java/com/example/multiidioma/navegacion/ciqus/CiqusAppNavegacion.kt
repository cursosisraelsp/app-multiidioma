package com.example.multiidioma.navegacion.ciqus

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.centros.ciqus.CiqusScreen

fun NavGraphBuilder.CiqusAppNavegacion(){
    composable(Destination.Ciqus.route) {
        CiqusScreen()
    }
}