package com.example.multiidioma.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import java.util.Locale

@Composable
fun currentAppLanguage(): String {
    val context = LocalContext.current
    val locale: Locale = context.resources.configuration.locales[0]
    return locale.language // Ejemplo: "es", "en", "fr"
}
