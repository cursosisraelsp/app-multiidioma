package com.example.multiidioma.navegacion.cretus


import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.repository.CretusRepository
import com.example.multiidioma.ui.screens.centros.cretus.CretusScreen
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen10a.CretusMiniScreen10
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen11a.CretusMiniScreen11
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen12a.CretusMiniScreen12
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen13a.CretusMiniScreen13
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen14a.CretusMiniScreen14
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen15a.CretusMiniScreen15
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen16a.CretusMiniScreen16
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen9a.CretusMiniScreen9

fun NavGraphBuilder.CretusAppNavegacion(
    listState: LazyListState,
    navController: NavHostController
) {
    val repository = CretusRepository()
    composable(Destination.Cretus.route) {
        CretusScreen(listState, navController)
    }
    // Ruta de miniscreens
    composable(Destination.CretusMiniscreen9.route) {
        CretusMiniScreen9(
            data = repository.getData(9),
            navController = navController
        )
    }
    composable(Destination.CretusMiniscreen10.route) {
        CretusMiniScreen10(
            data = repository.getData(10),
            navController = navController
        )
    }
    composable(Destination.CretusMiniscreen11.route) {
        CretusMiniScreen11(
            data = repository.getData(11),
            navController = navController
        )
    }
    composable(Destination.CretusMiniscreen12.route) {
        CretusMiniScreen12(
            data = repository.getData(12),
            navController = navController
        )
    }
    composable(Destination.CretusMiniscreen13.route) {
        CretusMiniScreen13(
            data = repository.getData(13),
            navController = navController
        )
    }
    composable(Destination.CretusMiniscreen14.route) {
        CretusMiniScreen14(
            data = repository.getData(14),
            navController = navController
        )
    }
    composable(Destination.CretusMiniscreen15.route) {
        CretusMiniScreen15(
            data = repository.getData(15),
            navController = navController
        )
    }
    composable(Destination.CretusMiniscreen16.route) {
        CretusMiniScreen16(
            data = repository.getData(16),
            navController = navController
        )
    }
}