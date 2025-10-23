package com.example.multiidioma.utils.NavigationFigures

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.screens.centros.cretus_andre.valorFiguraCretus0
import com.example.multiidioma.ui.screens.centros.cretus_andre.valorFiguraCretus1
import com.example.multiidioma.ui.screens.centros.cretus_andre.valorFiguraCretus2
import com.example.multiidioma.ui.screens.centros.cretus_andre.valorFiguraCretus3
import com.example.multiidioma.ui.screens.centros.cretus_andre.valorFiguraCretus4
import com.example.multiidioma.ui.screens.centros.cretus_andre.valorFiguraCretus5
import com.example.multiidioma.ui.screens.centros.cretus_andre.valorFiguraCretus6
import com.example.multiidioma.ui.screens.centros.cretus_andre.valorFiguraCretus7

@Composable
fun NavigationFiguresCretus(navController: NavController) {
    NavigationFiguresComponent(valorFiguraCretus0, navController)
    NavigationFiguresComponent(valorFiguraCretus1, navController)
    NavigationFiguresComponent(valorFiguraCretus2, navController)
    NavigationFiguresComponent(valorFiguraCretus3, navController)
    NavigationFiguresComponent(valorFiguraCretus4, navController)
    NavigationFiguresComponent(valorFiguraCretus5, navController)
    NavigationFiguresComponent(valorFiguraCretus6, navController)
    NavigationFiguresComponent(valorFiguraCretus7, navController)
}