package com.example.multiidioma.utils.NavigationFigures

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.screens.institutes.ihus.valorFiguraIhus0
import com.example.multiidioma.ui.screens.institutes.ihus.valorFiguraIhus1
import com.example.multiidioma.ui.screens.institutes.ihus.valorFiguraIhus2


@Composable
fun NavigationFiguresIhus(navController: NavController) {
    NavigationFiguresComponent(valorFiguraIhus0, navController)
    NavigationFiguresComponent(valorFiguraIhus1, navController)
    NavigationFiguresComponent(valorFiguraIhus2, navController)
}