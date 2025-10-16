package com.example.multiidioma.navegacion.centros.cimusApp


import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.repository.CimusRepository
import com.example.multiidioma.ui.screens.centros.cimus.CimusScreen
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen10.CimusMiniScreen10
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen11.CimusMiniScreen11
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen12.CimusMiniScreen12
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen13.CimusMiniScreen13
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen9.CimusMiniScreen9


@RequiresApi(Build.VERSION_CODES.P)
fun NavGraphBuilder.CimusAppNavegacion(
    listState: LazyListState,
    navController: NavController,
) {
    val repository = CimusRepository()

    composable(Destination.Cimus.route) {
        CimusScreen(listState, navController)
    }


// Ruta de miniscreens

    composable(Destination.CimusMiniScreen9.route) {
        CimusMiniScreen9(
            data = repository.getData(9),
            navController = navController
        )
    }
    composable(Destination.CimusMiniScreen10.route) {
        CimusMiniScreen10(
            data = repository.getData(10),
            navController = navController
        )
    }
    composable(Destination.CimusMiniScreen11.route) {
        CimusMiniScreen11(
            data = repository.getData(11),
            navController = navController
        )
    }
    composable(Destination.CimusMiniScreen12.route) {
        CimusMiniScreen12(
            data = repository.getData(12),
            navController = navController
        )
    }
    composable(Destination.CimusMiniScreen14.route) {
        CimusMiniScreen13(
            data = repository.getData(14),
            navController = navController
        )
    }

    composable(Destination.CimusMiniScreen15.route) {
        CimusMiniScreen13(
            data = repository.getData(15),
            navController = navController
        )
    }

    composable(Destination.CimusMiniScreen16.route) {
        CimusMiniScreen13(
            data = repository.getData(16),
            navController = navController
        )
    }

    composable(Destination.CimusMiniScreen17.route) {
        CimusMiniScreen13(
            data = repository.getData(17),
            navController = navController
        )
    }
}