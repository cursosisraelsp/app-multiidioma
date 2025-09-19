package com.example.multiidioma.navegacion.igfaeApp

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.centros.igfae_andre.IgfaeScreen

fun NavGraphBuilder.IgfaeAppNavegacion(){
    composable(Destination.Igfae.route) {
        IgfaeScreen()
    }
}