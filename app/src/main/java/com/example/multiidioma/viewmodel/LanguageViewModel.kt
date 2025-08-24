package com.example.multiidioma.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class LanguageViewModel : ViewModel() {
    private val _language = MutableStateFlow("en") // idioma por defecto
    val language: StateFlow<String> = _language

    fun changeLanguage(lang: String) {
        _language.value = lang
    }
}
