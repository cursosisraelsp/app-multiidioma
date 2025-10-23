package com.example.multiidioma.utils.NavigationFigures.NavigationFiguresIgfae

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.screens.centros.igfae_andre.valorFiguraIgfae6
import com.example.multiidioma.ui.screens.centros.igfae_andre.valorFiguraIgfae7

@Composable
fun NavigationFiguresIgfae3(navController: NavController) {

    NavigationFiguresComponent(valorFiguraIgfae6, navController)
    NavigationFiguresComponent(valorFiguraIgfae7, navController)
}