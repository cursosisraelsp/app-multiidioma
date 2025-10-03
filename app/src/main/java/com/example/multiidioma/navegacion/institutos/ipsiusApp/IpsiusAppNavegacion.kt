package com.example.multiidioma.navegacion.institutos.ipsiusApp


import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.repository.IpsiusRepository
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.IpsiusScreen
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen10a.IpsiusMiniScreen10
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen11a.IpsiusMiniScreen11
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen12a.IpsiusMiniScreen12
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen13a.IpsiusMiniScreen13
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen7a.IpsiusMiniScreen7
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen8a.IpsiusMiniScreen8
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen9a.IpsiusMiniScreen9


@RequiresApi(Build.VERSION_CODES.P)
fun NavGraphBuilder.IpsiusAppNavegacion(
    listState: LazyListState,
    navController: NavController,
    repository: IpsiusRepository
) {
    // Ruta principal de Ipsius
    composable(Destination.Ipsius.route) {
        IpsiusScreen(listState, navController)
    }

    // Ruta de miniscreens
    composable(Destination.IpsiusMiniscreen7.route) {
        IpsiusMiniScreen7(
            data = repository.getData(14),
            navController = navController
        )
    }
    composable(Destination.IpsiusMiniscreen8.route) {
        IpsiusMiniScreen8(
            data = repository.getData(15),
            navController = navController
        )
    }
    composable(Destination.IpsiusMiniscreen9.route) {
        IpsiusMiniScreen9(
            data = repository.getData(16),
            navController = navController
        )
    }
    composable(Destination.IpsiusMiniscreen10.route) {
        IpsiusMiniScreen10(
            data = repository.getData(17),
            navController = navController
        )
    }
    composable(Destination.IpsiusMiniscreen11.route) {
        IpsiusMiniScreen11(
            data = repository.getData(18),
            navController = navController
        )
    }

    composable(Destination.IpsiusMiniscreen12.route) {
        IpsiusMiniScreen12(
            data = repository.getData(27),
            navController = navController
        )
    }
    composable(Destination.IpsiusMiniscreen13.route) {
        IpsiusMiniScreen13(
            data = repository.getData(18),
            navController = navController
        )
    }
}