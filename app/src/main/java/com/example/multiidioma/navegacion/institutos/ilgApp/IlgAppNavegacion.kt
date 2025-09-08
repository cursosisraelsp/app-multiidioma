package com.example.multiidioma.navegacion.institutos.ilgApp

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.institutes.ilg.IlgScreen

fun NavGraphBuilder.IlgAppNavegacion(){
    composable(Destination.Ilg.route) {
        IlgScreen()
    }
}