package com.example.multiidioma.navegacion.inciforApp

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.ui.screens.institutes.incifor.InciforScreen

fun NavGraphBuilder.InciforAppNavegacion(){
    composable("incifor") {
        InciforScreen()
    }
}