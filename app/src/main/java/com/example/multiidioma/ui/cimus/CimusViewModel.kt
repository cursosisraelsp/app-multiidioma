package com.example.multiidioma.ui.cimus

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.multiidioma.data.CimusScreenState
import com.example.multiidioma.domain.GetMiniScreensUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch



class CimusViewModel(
    private val getMiniScreensUseCase: GetMiniScreensUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow<CimusScreenState>(CimusScreenState.Loading)
    val uiState = _uiState.asStateFlow()

    init {
        loadMiniScreens()
    }

    fun loadMiniScreens() {
        viewModelScope.launch {
            try {
                val screens = getMiniScreensUseCase()
                _uiState.value = CimusScreenState.Success(screens)
            } catch (e: Exception) {
                _uiState.value = CimusScreenState.Error(e.message ?: "Error desconocido")
            }
        }
    }
}

