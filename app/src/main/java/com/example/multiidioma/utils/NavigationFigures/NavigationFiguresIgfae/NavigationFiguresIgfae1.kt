package com.example.multiidioma.utils.NavigationFigures.NavigationFiguresIgfae

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.screens.centros.igfae_andre.valorFiguraIgfae0
import com.example.multiidioma.ui.screens.centros.igfae_andre.valorFiguraIgfae1
import com.example.multiidioma.ui.screens.centros.igfae_andre.valorFiguraIgfae2

@Composable
fun NavigationFiguresIgfae1(navController: NavController) {
    NavigationFiguresComponent(valorFiguraIgfae0, navController)
    NavigationFiguresComponent(valorFiguraIgfae1, navController)
    NavigationFiguresComponent(valorFiguraIgfae2, navController)

}