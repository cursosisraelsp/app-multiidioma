package com.example.multiidioma.utils.NavigationFigures.NavigationFiguresIgfae

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.screens.centros.igfae_andre.valorFiguraIgfae3
import com.example.multiidioma.ui.screens.centros.igfae_andre.valorFiguraIgfae4
import com.example.multiidioma.ui.screens.centros.igfae_andre.valorFiguraIgfae5

@Composable
fun NavigationFiguresIgfae2(navController: NavController) {

    NavigationFiguresComponent(valorFiguraIgfae3, navController)
    NavigationFiguresComponent(valorFiguraIgfae4, navController)
    NavigationFiguresComponent(valorFiguraIgfae5, navController)

}