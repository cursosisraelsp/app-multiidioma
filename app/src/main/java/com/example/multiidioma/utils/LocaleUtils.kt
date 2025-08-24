package com.example.multiidioma.utils

import android.content.Context
import android.content.res.Configuration
import java.util.Locale

fun Context.setLocale(language: String): Context {
    val locale = Locale(language)
    Locale.setDefault(locale)
    val config = Configuration(resources.configuration)
    config.setLocale(locale)
    return createConfigurationContext(config)
}
