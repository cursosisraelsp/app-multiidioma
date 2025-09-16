package com.example.multiidioma.navegacion.institutos.inciforApp

import InciforScreen
import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination


fun NavGraphBuilder.InciforAppNavegacion(listState: LazyListState,
                                         navController: NavController){
    composable(Destination.Incifor.route) {
        InciforScreen(listState,navController)
    }
}