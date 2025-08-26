package com.example.multiidioma.ui.cimus

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.multiidioma.R
import com.example.multiidioma.data.CimusScreenState
import com.example.multiidioma.data.MiniScreenData
import com.example.multiidioma.domain.GetMiniScreensUseCase
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch


class CimusViewModel : ViewModel() {

    private val _uiState = MutableStateFlow<CimusScreenState>(CimusScreenState.Loading)
    val uiState: StateFlow<CimusScreenState> = _uiState.asStateFlow()

    init {
        // Simulamos carga de datos
        viewModelScope.launch {
            delay(500) // Simula tiempo de carga
            _uiState.value = CimusScreenState.Success(
                listOf(
                    MiniScreenData(0, listOf(R.string.paragraph_1)),
                    MiniScreenData(1, listOf(R.string.paragraph_2)),
                    MiniScreenData(2, listOf(R.string.paragraph_3))
                )
            )
        }
    }
}



/*
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

*/