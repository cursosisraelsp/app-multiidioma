package com.example.multiidioma.utils.ipsiusUtils

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFigura0
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFigura1
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFigura2
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFigura3
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFigura4
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFigura5
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFigura6

@Composable
fun NavigationFiguresIpsius(navController: NavController) {
    NavigationFiguresComponent(valorFigura0, navController)
    NavigationFiguresComponent(valorFigura1, navController)
    NavigationFiguresComponent(valorFigura2, navController)
    NavigationFiguresComponent(valorFigura3, navController)
    NavigationFiguresComponent(valorFigura4, navController)
    NavigationFiguresComponent(valorFigura5, navController)
    NavigationFiguresComponent(valorFigura6, navController)
}