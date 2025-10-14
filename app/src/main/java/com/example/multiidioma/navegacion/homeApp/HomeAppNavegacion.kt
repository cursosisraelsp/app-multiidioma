package com.example.multiidioma.navegacion.homeApp

import android.util.Log
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.home.HomeScreen
import com.example.multiidioma.viewmodel.LanguageViewModel

fun NavGraphBuilder.HomeAppNavHost(
    languageViewModel: LanguageViewModel,
    listState: LazyListState,
    navController: NavHostController,
    modifier: Modifier
){
    composable(route = Destination.Home.route) {
        HomeScreen(
            modifier,
            navController,
            languageViewModel,
            listState,
            onImageClick = { screenId ->
                val ruta = Destination.createDetailRoute(screenId)
                Log.d("DetailViewModel", "HomeAppNavHost  navController.navigate(ruta) clico: $ruta")

                navController.navigate(ruta)
            }
        )
    }
}