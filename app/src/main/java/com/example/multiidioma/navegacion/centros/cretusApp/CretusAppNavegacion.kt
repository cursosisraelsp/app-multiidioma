package com.example.multiidioma.navegacion.centros.cretusApp

import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.centros.cretus_andre.CretusScreen

fun NavGraphBuilder.CretusAppNavegacion(
    listState: LazyListState,
    navController: NavHostController,
) {
    composable(Destination.Cretus.route) {
        CretusScreen(listState, navController)
    }
}