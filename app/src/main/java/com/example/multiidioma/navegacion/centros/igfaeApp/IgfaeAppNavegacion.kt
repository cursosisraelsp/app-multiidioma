package com.example.multiidioma.navegacion.centros.igfaeApp

import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.data.repository.IgfaeRepository
import com.example.multiidioma.ui.screens.centros.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen11a.IgfaeMiniScreen11
import com.example.multiidioma.ui.screens.centros.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen12a.IgfaeMiniScreen12
import com.example.multiidioma.ui.screens.centros.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen13a.IgfaeMiniScreen13
import com.example.multiidioma.ui.screens.centros.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen15a.IgfaeMiniScreen15
import com.example.multiidioma.ui.screens.centros.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen9a.IgfaeMiniScreen9
import com.example.multiidioma.ui.screens.centros.igfae.IgfaeScreen
import com.example.multiidioma.ui.screens.centros.igfae.igfaeMiniScreens.igfaeMiniScreen16a.IgfaeMiniScreen16
import com.example.multiidioma.ui.screens.centros.igfae.igfaeMiniScreens.igfaeMiniScreen7a.IgfaeMiniScreen7
import com.example.multiidioma.ui.screens.centros.igfae.igfaeMiniScreens.igfaeMiniScreen8a.IgfaeMiniScreen8

fun NavGraphBuilder.IgfaeAppNavegacion(
    listState: LazyListState,
    navController: NavHostController
) {
    val repository = IgfaeRepository()
    composable(Destination.Igfae.route) {
        IgfaeScreen(listState, navController)
    }
    // Ruta de miniscreens
    composable(Destination.IgfaeMiniscreen7.route) {
        IgfaeMiniScreen7(
            data = repository.getData(7),
            navController = navController
        )
    }
    composable(Destination.IgfaeMiniscreen8.route) {
        IgfaeMiniScreen8(
            data = repository.getData(8),
            navController = navController
        )
    }
    composable(Destination.IgfaeMiniscreen9.route) {
        IgfaeMiniScreen9(
            data = repository.getData(9),
            navController = navController
        )
    }
    composable(Destination.IgfaeMiniscreen11.route) {
        IgfaeMiniScreen11(
            data = repository.getData(11),
            navController = navController
        )
    }

    composable(Destination.IgfaeMiniscreen12.route) {
        IgfaeMiniScreen12(
            data = repository.getData(12),
            navController = navController
        )
    }
    composable(Destination.IgfaeMiniscreen13.route) {
        IgfaeMiniScreen13(
            data = repository.getData(13),
            navController = navController
        )
    }
    composable(Destination.IgfaeMiniscreen15.route) {
        IgfaeMiniScreen15(
            data = repository.getData(15),
            navController = navController
        )
    }
    composable(Destination.IgfaeMiniscreen16.route) {
        IgfaeMiniScreen16(
            data = repository.getData(16),
            navController = navController
        )
    }
}