package com.example.multiidioma.navegacion.institutos.inciforApp

import InciforScreen
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.repository.InciforRepository
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen14.InciforMiniScreen14
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen15.InciforMiniScreen15
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen16.InciforMiniScreen16
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen17.InciforMiniScreen17
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen18.InciforMiniScreen18

@RequiresApi(Build.VERSION_CODES.P)
fun NavGraphBuilder.InciforAppNavegacion(
    listState: LazyListState,
    navController: NavController,
) {
    val repository = InciforRepository()

    // Ruta principal de Incifor
    composable(Destination.Incifor.route) {
        InciforScreen(listState, navController)
    }

    // Ruta de miniscreens
    composable(Destination.InciforMiniscreen14.route) {
        InciforMiniScreen14(
            data = repository.getData(14),
            navController = navController
        )
    }
    composable(Destination.InciforMiniscreen15.route) {
        InciforMiniScreen15(
            data = repository.getData(15),
            navController = navController
        )
    }
    composable(Destination.InciforMiniscreen16.route) {
        InciforMiniScreen16(
            data = repository.getData(16),
            navController = navController
        )
    }
    composable(Destination.InciforMiniscreen17.route) {
        InciforMiniScreen17(
            data = repository.getData(17),
            navController = navController
        )
    }
    composable(Destination.InciforMiniscreen18.route) {
        InciforMiniScreen18(
            data = repository.getData(18),
            navController = navController
        )
    }
}
