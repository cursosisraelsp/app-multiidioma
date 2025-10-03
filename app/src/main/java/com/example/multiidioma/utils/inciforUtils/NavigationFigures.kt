package com.example.multiidioma.utils.inciforUtils

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.screens.institutes.incifor.valorFigura0
import com.example.multiidioma.ui.screens.institutes.incifor.valorFigura1
import com.example.multiidioma.ui.screens.institutes.incifor.valorFigura2
import com.example.multiidioma.ui.screens.institutes.incifor.valorFigura3
import com.example.multiidioma.ui.screens.institutes.incifor.valorFigura4

@Composable
fun NavigationFiguresIncifor(navController: NavController) {
    NavigationFiguresComponent(valorFigura0, navController)
    NavigationFiguresComponent(valorFigura1, navController)
    NavigationFiguresComponent(valorFigura2, navController)
    NavigationFiguresComponent(valorFigura3, navController)
    NavigationFiguresComponent(valorFigura4, navController)
}