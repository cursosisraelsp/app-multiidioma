package com.example.multiidioma.navegacion.institutos.ihusApp

import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.ihus.IhusScreen

fun NavGraphBuilder.IhusAppNavegacion(listState: LazyListState){
    composable(Destination.Ihus.route) {
        //IhusScreen()
        IhusScreen(listState)
    }
}