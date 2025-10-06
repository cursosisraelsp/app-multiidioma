package com.example.multiidioma.navegacion.institutos.iceApp

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.repository.IceRepository
import com.example.multiidioma.data.repository.ImatusRepository
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen10.IceMiniScreen10
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen11.IceMiniScreen11
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen12.IceMiniScreen12
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen13.IceMiniScreen13
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen7.IceMiniScreen7
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen8.IceMiniScreen8
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen9.IceMiniScreen9
import com.example.multiidioma.ui.screens.institutes.ice.IceScreen


@RequiresApi(Build.VERSION_CODES.P)
fun NavGraphBuilder.IceAppNavegacion(
    listState: LazyListState,
    navController: NavController,
) {

    val repository = IceRepository()

    composable(Destination.Ice.route) {
        IceScreen(listState,navController)
    }
    // Ruta de miniscreens
    composable(Destination.IceMiniScreen7.route) {
        IceMiniScreen7(
            data = repository.getData(5),
            navController = navController
        )
    }
    composable(Destination.IceMiniScreen8.route) {
        IceMiniScreen8(
            data = repository.getData(6),
            navController = navController
        )
    }
    composable(Destination.IceMiniScreen9.route) {
        IceMiniScreen9(
            data = repository.getData(7),
            navController = navController
        )
    }
    composable(Destination.IceMiniScreen10.route) {
        IceMiniScreen10(
            data = repository.getData(7),
            navController = navController
        )
    }
    composable(Destination.IceMiniScreen11.route) {
        IceMiniScreen11(
            data = repository.getData(7),
            navController = navController
        )
    }
    composable(Destination.IceMiniScreen12.route) {
        IceMiniScreen12(
            data = repository.getData(7),
            navController = navController
        )
    }
    composable(Destination.IceMiniScreen13.route) {
        IceMiniScreen13(
            data = repository.getData(7),
            navController = navController
        )
    }
}