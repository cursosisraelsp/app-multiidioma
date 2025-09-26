package com.example.multiidioma.navegacion.institutos.ilgApp

import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.institutes.ilg.IlgScreen

fun NavGraphBuilder.IlgAppNavegacion(listState: LazyListState, navController: NavHostController){
    composable(Destination.Ilg.route) {
        IlgScreen(listState, navController)
    }
}