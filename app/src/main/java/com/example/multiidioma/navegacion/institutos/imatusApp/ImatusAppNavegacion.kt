package com.example.multiidioma.navegacion.institutos.imatusApp

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.repository.ImatusRepository
import com.example.multiidioma.ui.screens.institutes.imatus.ImatusMiniScreens.imatusMiniScreen5.ImatusMiniScreen5
import com.example.multiidioma.ui.screens.institutes.imatus.ImatusMiniScreens.imatusMiniScreen6.ImatusMiniScreen6
import com.example.multiidioma.ui.screens.institutes.imatus.ImatusMiniScreens.imatusMiniScreen7.ImatusMiniScreen7
import com.example.multiidioma.ui.screens.institutes.imatus.ImatusScreen

@RequiresApi(Build.VERSION_CODES.P)
fun NavGraphBuilder.ImatusAppNavegacion(
    listState: LazyListState,
    navController: NavController,
) {
    val repository = ImatusRepository()

    composable(Destination.Imatus.route) {
        ImatusScreen(listState, navController)
    }

// Ruta de miniscreens
    composable(Destination.ImatusMiniScreen5.route) {
        ImatusMiniScreen5(
            data = repository.getData(5),
            navController = navController
        )
    }
    composable(Destination.ImatusMiniScreen6.route) {
        ImatusMiniScreen6(
            data = repository.getData(6),
            navController = navController
        )
    }
    composable(Destination.ImatusMiniScreen7.route) {
        ImatusMiniScreen7(
            data = repository.getData(7),
            navController = navController
        )
    }
}