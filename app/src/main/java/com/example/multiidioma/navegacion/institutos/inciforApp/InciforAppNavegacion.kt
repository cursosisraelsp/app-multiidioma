package com.example.multiidioma.navegacion.institutos.inciforApp

import InciforScreen
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination


@RequiresApi(Build.VERSION_CODES.P)
fun NavGraphBuilder.InciforAppNavegacion(
    listState: LazyListState,
    navController: NavController,

){
    composable(Destination.Incifor.route) {
        InciforScreen(listState,navController,Modifier)
    }
}