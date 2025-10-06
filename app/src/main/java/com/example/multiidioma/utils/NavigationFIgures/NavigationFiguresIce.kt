package com.example.multiidioma.utils.NavigationFIgures

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.screens.institutes.ice.valorFiguraIce0
import com.example.multiidioma.ui.screens.institutes.ice.valorFiguraIce1
import com.example.multiidioma.ui.screens.institutes.ice.valorFiguraIce2
import com.example.multiidioma.ui.screens.institutes.ice.valorFiguraIce3
import com.example.multiidioma.ui.screens.institutes.ice.valorFiguraIce4

@Composable
fun NavigationFiguresIce(navController: NavController) {
    NavigationFiguresComponent(valorFiguraIce0, navController)
    NavigationFiguresComponent(valorFiguraIce1, navController)
    NavigationFiguresComponent(valorFiguraIce2, navController)
    NavigationFiguresComponent(valorFiguraIce3, navController)
    NavigationFiguresComponent(valorFiguraIce4, navController)
}