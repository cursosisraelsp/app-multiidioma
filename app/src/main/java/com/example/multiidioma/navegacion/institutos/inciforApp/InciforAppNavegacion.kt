package com.example.multiidioma.navegacion.institutos.inciforApp

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.institutes.incifor.InciforScreen

fun NavGraphBuilder.InciforAppNavegacion(){
    composable(Destination.Incifor.route) {
        InciforScreen()
    }
}