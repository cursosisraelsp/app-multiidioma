package com.example.multiidioma.navegacion.centros.citiusApp


import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.repository.CitiusRepository
import com.example.multiidioma.ui.screens.centros.citius.CitiusScreen
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen10.CitiusMiniScreen10
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen6.CitiusMiniScreen6
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen7.CitiusMiniScreen7
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen8.CitiusMiniScreen8
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen9.CitiusMiniScreen9

@RequiresApi(Build.VERSION_CODES.P)
fun NavGraphBuilder.CitiusAppNavegacion(
    listState: LazyListState,
    navController: NavController,
) {
    val repository = CitiusRepository()


    composable(Destination.Citius.route) {
        CitiusScreen(listState, navController)
    }


// Ruta de miniscreens
    composable(Destination.CitiusMiniScreen6.route) {
        CitiusMiniScreen6(
            data = repository.getData(6),
            navController = navController
        )
    }
    composable(Destination.CitiusMiniScreen7.route) {
        CitiusMiniScreen7(
            data = repository.getData(7),
            navController = navController
        )
    }
    composable(Destination.CitiusMiniScreen8.route) {
        CitiusMiniScreen8(
            data = repository.getData(8),
            navController = navController
        )
    }
    composable(Destination.CitiusMiniScreen9.route) {
        CitiusMiniScreen9(
            data = repository.getData(9),
            navController = navController
        )
    }
    composable(Destination.CitiusMiniScreen10.route) {
        CitiusMiniScreen10(
            data = repository.getData(10),
            navController = navController
        )
    }
}