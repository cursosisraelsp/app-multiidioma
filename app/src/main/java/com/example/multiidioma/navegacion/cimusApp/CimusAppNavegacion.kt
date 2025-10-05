package com.example.multiidioma.navegacion.cimusApp

import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.cimus.CimusScreen

fun NavGraphBuilder.CimusAppNavegacion(listState: LazyListState){
    composable(Destination.Cimus.route) {
        CimusScreen(listState)
    }
}