package com.example.multiidioma.navegacion.institutos.ihusApp

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.ihus.IhusScreen

@RequiresApi(Build.VERSION_CODES.P)
fun NavGraphBuilder.IhusAppNavegacion(listState: LazyListState, navController: NavHostController){
    composable(Destination.Ihus.route) {
        IhusScreen(listState,navController)
    }
}