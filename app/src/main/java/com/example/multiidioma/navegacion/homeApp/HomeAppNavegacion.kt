package com.example.multiidioma.navegacion.homeApp

import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.home.HomeScreen
import com.example.multiidioma.viewmodel.LanguageViewModel

fun NavGraphBuilder.HomeAppNavHost(languageViewModel: LanguageViewModel,listState: LazyListState,navController: NavHostController){
    composable(route = Destination.Home.route) {

        HomeScreen(languageViewModel, listState,onImageClick = { screenId ->
            val ruta = Destination.createDetailRoute(screenId)
            navController.navigate(ruta)
        })
    }
}