package com.example.multiidioma.utils.NavigationFigures

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.valorFiguraIarcus0
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.valorFiguraIarcus1
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.valorFiguraIarcus2
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.valorFiguraIarcus3

@Composable
fun NavigationFiguresIarcus(navController: NavController) {
    NavigationFiguresComponent(valorFiguraIarcus0, navController)
    NavigationFiguresComponent(valorFiguraIarcus1, navController)
    NavigationFiguresComponent(valorFiguraIarcus2, navController)
    NavigationFiguresComponent(valorFiguraIarcus3, navController)

}