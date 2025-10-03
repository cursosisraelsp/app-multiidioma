package com.example.multiidioma.navegacion.institutos.inciforApp

import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination

fun InciforAppNavegationSection() {
    composable(Destination.InciforMiniscreen14.route) {
        InciforMiniScreen14(
            data = MiniScreenData(/* aquí pasas los datos que quieras */),
            navController = navController
        )
    }

}