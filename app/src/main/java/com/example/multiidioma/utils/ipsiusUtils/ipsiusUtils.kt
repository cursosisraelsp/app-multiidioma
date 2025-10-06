package com.example.multiidioma.utils.ipsiusUtils

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFiguraIpsius0
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFiguraIpsius1
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFiguraIpsius2
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFiguraIpsius3
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFiguraIpsius4
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFiguraIpsius5
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFiguraIpsius6

@Composable
fun NavigationFiguresIpsius(navController: NavController) {
    NavigationFiguresComponent(valorFiguraIpsius0, navController)
    NavigationFiguresComponent(valorFiguraIpsius1, navController)
    NavigationFiguresComponent(valorFiguraIpsius2, navController)
    NavigationFiguresComponent(valorFiguraIpsius3, navController)
    NavigationFiguresComponent(valorFiguraIpsius4, navController)
    NavigationFiguresComponent(valorFiguraIpsius5, navController)
    NavigationFiguresComponent(valorFiguraIpsius6, navController)
}