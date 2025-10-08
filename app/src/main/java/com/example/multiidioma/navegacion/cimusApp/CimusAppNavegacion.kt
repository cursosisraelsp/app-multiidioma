package com.example.multiidioma.navegacion.cimusApp

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.centros.cimus.CimusScreen


@RequiresApi(Build.VERSION_CODES.P)
fun NavGraphBuilder.CimusAppNavegacion(
    listState: LazyListState,
    navController: NavController,

    ) {
    composable(Destination.Cimus.route) {
        CimusScreen(listState, navController)
    }
}