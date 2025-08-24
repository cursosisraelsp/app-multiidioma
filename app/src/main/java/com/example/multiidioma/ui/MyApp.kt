package com.example.multiidioma.ui


import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import com.example.multiidioma.ui.screens.HomeScreen
import com.example.multiidioma.utils.setLocale
import com.example.multiidioma.viewmodel.LanguageViewModel

val LocalizedContext = compositionLocalOf<Context> {
    error("No LocalizedContext provided")
}

@Composable
fun MyApp(languageViewModel: LanguageViewModel) {
    val context = LocalContext.current
    val language by languageViewModel.language.collectAsState() // observar cambios
    val localizedContext = context.setLocale(language)

    CompositionLocalProvider(LocalizedContext provides localizedContext) {
        CompositionLocalProvider(LocalizedContext provides localizedContext) {
            HomeScreen(languageViewModel)
        }
    }
}
