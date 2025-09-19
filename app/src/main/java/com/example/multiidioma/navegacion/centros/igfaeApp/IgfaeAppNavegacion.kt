package com.example.multiidioma.navegacion.centros.igfaeApp

import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.centros.igfae_andre.IgfaeScreen

fun NavGraphBuilder.IgfaeAppNavegacion(listState: LazyListState, navController: NavHostController) {
    composable(Destination.Igfae.route) {
        IgfaeScreen(listState, navController)
    }
}