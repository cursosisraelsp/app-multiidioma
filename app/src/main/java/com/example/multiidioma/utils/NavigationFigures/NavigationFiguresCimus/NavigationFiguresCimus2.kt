package com.example.multiidioma.utils.NavigationFigures.NavigationFiguresCimus

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.screens.centros.cimus.valorFiguraCimus5
import com.example.multiidioma.ui.screens.centros.cimus.valorFiguraCimus6
import com.example.multiidioma.ui.screens.centros.cimus.valorFiguraCimus7
import com.example.multiidioma.ui.screens.centros.cimus.valorFiguraCimus8

@Composable
fun NavigationFiguresCimus2(navController: NavController) {
    NavigationFiguresComponent(valorFiguraCimus5, navController)
    NavigationFiguresComponent(valorFiguraCimus6, navController)
    NavigationFiguresComponent(valorFiguraCimus7, navController)
    NavigationFiguresComponent(valorFiguraCimus8, navController)

}
