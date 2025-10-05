package com.example.multiidioma.navegacion.institutos.IdegaApp

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.institutes.idega.IdegaScreen

fun NavGraphBuilder.IdegaAppNavegacion(){
    composable(Destination.Idega.route) {
        IdegaScreen()
    }
}