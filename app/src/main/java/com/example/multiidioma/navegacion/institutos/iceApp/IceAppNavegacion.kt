package com.example.multiidioma.navegacion.institutos.iceApp

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.institutes.ice.IceScreen

fun NavGraphBuilder.IceAppNavegacion(){
    composable(Destination.Ice.route) {
        IceScreen()
    }
}