package com.example.multiidioma.utils.NavigationFigures

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.screens.centros.citius.valorFiguraCitius0
import com.example.multiidioma.ui.screens.centros.citius.valorFiguraCitius1
import com.example.multiidioma.ui.screens.centros.citius.valorFiguraCitius2
import com.example.multiidioma.ui.screens.centros.citius.valorFiguraCitius3
import com.example.multiidioma.ui.screens.centros.citius.valorFiguraCitius4

@Composable
fun NavigationFiguresCitius(navController: NavController) {
    NavigationFiguresComponent(valorFiguraCitius0, navController)
    NavigationFiguresComponent(valorFiguraCitius1, navController)
    NavigationFiguresComponent(valorFiguraCitius2, navController)
    NavigationFiguresComponent(valorFiguraCitius3, navController)
    NavigationFiguresComponent(valorFiguraCitius4, navController)
}