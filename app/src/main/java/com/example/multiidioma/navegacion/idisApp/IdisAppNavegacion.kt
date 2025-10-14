package com.example.multiidioma.navegacion.idisApp

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.centros.idis.IdisScreen

@RequiresApi(Build.VERSION_CODES.P)
fun NavGraphBuilder.IdisAppNavegacion(listState: LazyListState, navController: NavHostController){
    composable(Destination.Idis.route) {
        IdisScreen(listState, navController)
    }
}