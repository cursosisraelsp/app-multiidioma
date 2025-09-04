package com.example.multiidioma.navegacion.homeApp

import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.ui.screens.home.HomeScreen
import com.example.multiidioma.viewmodel.LanguageViewModel

fun NavGraphBuilder.HomeAppNavHost(languageViewModel: LanguageViewModel,listState: LazyListState){
    composable("home") {
        // 👉 pásale listState para que funcione el scroll
        HomeScreen(languageViewModel, listState)
    }
}