package com.example.multiidioma.navegacion


import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.multiidioma.navegacion.cimusApp.CimusAppNavegacion
import com.example.multiidioma.navegacion.homeApp.HomeAppNavHost
import com.example.multiidioma.navegacion.settingsApp.SettingsAppNavegacion
import com.example.multiidioma.navegacion.startApp.StartAppNavHost
import com.example.multiidioma.viewmodel.LanguageViewModel

@Composable
fun NavHostApp(navController: NavHostController, modifier: Modifier,languageViewModel: LanguageViewModel,listState: LazyListState){
    NavHost(
        navController = navController,
        startDestination = "splash",
        modifier = modifier
    ) {

        StartAppNavHost(navController)
        HomeAppNavHost(languageViewModel, listState,navController = navController)
        SettingsAppNavegacion(languageViewModel)
        CimusAppNavegacion(listState)
    }
}