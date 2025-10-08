package com.example.multiidioma.utils.NavigationFigures

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.screens.institutes.incifor.valorFiguraIncifor0
import com.example.multiidioma.ui.screens.institutes.incifor.valorFiguraIncifor1
import com.example.multiidioma.ui.screens.institutes.incifor.valorFiguraIncifor2
import com.example.multiidioma.ui.screens.institutes.incifor.valorFiguraIncifor3
import com.example.multiidioma.ui.screens.institutes.incifor.valorFiguraIncifor4

@Composable
fun NavigationFiguresIncifor(navController: NavController) {
    NavigationFiguresComponent(valorFiguraIncifor0, navController)
    NavigationFiguresComponent(valorFiguraIncifor1, navController)
    NavigationFiguresComponent(valorFiguraIncifor2, navController)
    NavigationFiguresComponent(valorFiguraIncifor3, navController)
    NavigationFiguresComponent(valorFiguraIncifor4, navController)
}