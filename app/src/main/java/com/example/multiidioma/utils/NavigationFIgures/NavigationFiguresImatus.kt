package com.example.multiidioma.utils.NavigationFIgures

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.screens.institutes.imatus.valorFiguraImatus0
import com.example.multiidioma.ui.screens.institutes.imatus.valorFiguraImatus1
import com.example.multiidioma.ui.screens.institutes.imatus.valorFiguraImatus2

@Composable
fun NavigationFiguresImatus(navController: NavController) {
    NavigationFiguresComponent(valorFiguraImatus0, navController)
    NavigationFiguresComponent(valorFiguraImatus1, navController)
    NavigationFiguresComponent(valorFiguraImatus2, navController)

}