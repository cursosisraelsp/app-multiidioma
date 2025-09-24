package com.example.multiidioma.navegacion.institutos.imatusApp

import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.institutes.imatus.ImatusScreen

fun NavGraphBuilder.ImatusAppNavegacion(
    listState: LazyListState,
    navController: NavController,
) {
    composable(Destination.Imatus.route) {
        ImatusScreen(listState, navController)
    }
}
