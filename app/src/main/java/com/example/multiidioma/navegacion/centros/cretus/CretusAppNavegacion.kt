package com.example.multiidioma.navegacion.cretus

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.centros.cretus_andre.CretusScreen

fun NavGraphBuilder.CretusAppNavegacion(){
    composable (Destination.Cretus.route) {
        CretusScreen(listState,NavController)
    }
}