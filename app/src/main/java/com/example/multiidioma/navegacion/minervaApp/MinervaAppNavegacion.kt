package com.example.multiidioma.navegacion.minervaApp

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.minerva.MinervaScreen

fun NavGraphBuilder.MinervaAppNavegacion(){
    composable(Destination.Minerva.route) {
        MinervaScreen()
    }
}