package com.example.multiidioma.navegacion.settingsApp

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.ui.screens.settings.SettingsScreen
import com.example.multiidioma.viewmodel.LanguageViewModel

fun NavGraphBuilder.SettingsAppNavegacion(languageViewModel: LanguageViewModel){
    composable("settings") {
        SettingsScreen(languageViewModel)
    }
}