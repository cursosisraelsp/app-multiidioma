package com.example.multiidioma.navegacion.startApp

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.multiidioma.ui.screens.start.StartScreen

fun NavGraphBuilder.StartAppNavHost(navController: NavHostController) {
    composable("splash") {
        StartScreen(navController)
    }
}