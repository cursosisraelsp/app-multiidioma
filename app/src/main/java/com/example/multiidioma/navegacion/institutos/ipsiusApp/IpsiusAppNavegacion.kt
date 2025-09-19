package com.example.multiidioma.navegacion.institutos.ipsiusApp

import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.IpsiusScreen



fun NavGraphBuilder.IpsiusAppNavegacion(
    listState: LazyListState,
    navController: NavController,
) {
    composable(Destination.Ipsius.route) {
        IpsiusScreen(listState, navController)
    }
}