package com.example.multiidioma.navegacion.ciqus

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.centros.ciqus.CiqusScreen

@RequiresApi(Build.VERSION_CODES.P)
fun NavGraphBuilder.CiqusAppNavegacion(listState: LazyListState, navController: NavHostController){
    composable(Destination.Ciqus.route) {
        CiqusScreen(listState,navController)
    }
}