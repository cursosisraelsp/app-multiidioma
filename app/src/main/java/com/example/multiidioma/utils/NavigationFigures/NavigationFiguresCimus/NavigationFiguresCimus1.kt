package com.example.multiidioma.utils.NavigationFigures.NavigationFiguresCimus


import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.screens.centros.cimus.valorFiguraCimus0
import com.example.multiidioma.ui.screens.centros.cimus.valorFiguraCimus1
import com.example.multiidioma.ui.screens.centros.cimus.valorFiguraCimus2
import com.example.multiidioma.ui.screens.centros.cimus.valorFiguraCimus3
import com.example.multiidioma.ui.screens.centros.cimus.valorFiguraCimus4

@Composable
fun NavigationFiguresCimus1(navController: NavController) {
    NavigationFiguresComponent(valorFiguraCimus0, navController)
    NavigationFiguresComponent(valorFiguraCimus1, navController)
    NavigationFiguresComponent(valorFiguraCimus2, navController)
    NavigationFiguresComponent(valorFiguraCimus3, navController)
    NavigationFiguresComponent(valorFiguraCimus4, navController)
}