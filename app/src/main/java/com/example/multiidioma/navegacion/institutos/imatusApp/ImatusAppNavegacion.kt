package com.example.multiidioma.navegacion.institutos.imatusApp

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.institutes.imatus.ImatusScreen

fun NavGraphBuilder.ImatusAppNavegacion(){
    composable(Destination.Imatus.route) {
        ImatusScreen()
    }
}