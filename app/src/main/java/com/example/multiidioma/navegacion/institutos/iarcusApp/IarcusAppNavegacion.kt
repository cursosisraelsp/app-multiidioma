package com.example.multiidioma.navegacion.institutos.iarcusApp



import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.IarcusScreen


fun NavGraphBuilder.IarcusAppNavegacion(
    listState: LazyListState,
    navController: NavHostController
) {
    composable (Destination.Cretus.route) {
        IarcusScreen(listState,navController)
    }
}