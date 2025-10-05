package com.example.multiidioma.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class UiStateViewModel: ViewModel() {
    // Estado observable por Compose
    var resetScroll = mutableStateOf(false)
        private set

    fun enableResetScroll() {
        resetScroll.value = true
    }

    fun disableResetScroll() {
        resetScroll.value = false
    }
}