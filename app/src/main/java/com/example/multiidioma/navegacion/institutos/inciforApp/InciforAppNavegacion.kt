package com.example.multiidioma.navegacion.institutos.inciforApp

import InciforScreen
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.multiidioma.data.Destination


@RequiresApi(Build.VERSION_CODES.P)
fun NavGraphBuilder.InciforAppNavegacion(
    listState: LazyListState,
    navController: NavController,

){
    composable(Destination.Incifor.route,
        arguments = listOf(navArgument("resetScroll") {
            type = NavType.BoolType
            defaultValue = false
        })) {backStackEntry ->
        val resetScroll = backStackEntry.arguments?.getBoolean("resetScroll") ?: false
        InciforScreen(listState,navController)
    }
}