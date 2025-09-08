package com.example.multiidioma.navegacion.institutos.ihusApp

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.institutes.ihus.IhusScreen

fun NavGraphBuilder.IhusAppNavegacion(){
    composable(Destination.Ihus.route) {
        IhusScreen()
    }
}