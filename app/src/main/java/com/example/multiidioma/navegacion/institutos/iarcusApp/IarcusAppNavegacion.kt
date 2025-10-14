package com.example.multiidioma.navegacion.institutos.iarcusApp



import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.repository.IarcusRepository
import com.example.multiidioma.ui.screens.institutes.iarcus.IarcusScreen
import com.example.multiidioma.ui.screens.institutes.iarcus.iarcusMiniScreens.iarcusMiniScreen10a.IarcusMiniScreen10
import com.example.multiidioma.ui.screens.institutes.iarcus.iarcusMiniScreens.iarcusMiniScreen11a.IarcusMiniScreen11
import com.example.multiidioma.ui.screens.institutes.iarcus.iarcusMiniScreens.iarcusMiniScreen8a.IarcusMiniScreen8
import com.example.multiidioma.ui.screens.institutes.iarcus.iarcusMiniScreens.iarcusMiniScreen9a.IarcusMiniScreen9


fun NavGraphBuilder.IarcusAppNavegacion(
    listState: LazyListState,
    navController: NavHostController
) {
    val repository = IarcusRepository()
    composable(Destination.Iarcus.route) {
        IarcusScreen(listState, navController)
    }
    // Ruta de miniscreens
    composable(Destination.IarcusMiniscreen8.route) {
        IarcusMiniScreen8(
            data = repository.getData(8),
            navController = navController
        )
    }
    composable(Destination.IarcusMiniscreen9.route) {
        IarcusMiniScreen9(
            data = repository.getData(9),
            navController = navController
        )
    }
    composable(Destination.IarcusMiniscreen10.route) {
        IarcusMiniScreen10(
            data = repository.getData(10),
            navController = navController
        )
    }
    composable(Destination.IarcusMiniscreen11.route) {
        IarcusMiniScreen11(
            data = repository.getData(11),
            navController = navController
        )
    }
}