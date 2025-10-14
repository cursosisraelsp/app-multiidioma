package com.example.multiidioma.navegacion.detailApp

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.detail.DetailScreen

@RequiresApi(Build.VERSION_CODES.P)
fun NavGraphBuilder.detailNavGraph(
    navController: NavHostController,
    onClose: () -> Unit,
    listState: LazyListState,

){
    composable(
        route = Destination.Detail.route
    ) {
       DetailScreen(
            navController, onClose = onClose,
            listState = listState,
            modifier = Modifier
        )
    }


}
/*composable(
    route = Destination.Detail.route,
    arguments = listOf(
        navArgument("screenId") { type = NavType.StringType }
    )
) { backStackEntry ->
    val screenId = backStackEntry.arguments?.getString("screenId") ?: return@composable

    DetailScreen(
        navController = navController,
        screenId= screenId, // 👈 nuevo parámetro
        onClose = onClose,
        listState = listState,
        modifier = Modifier
    )
}*/