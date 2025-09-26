package com.example.multiidioma.ui.screens.centros.ciqus

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.multiidioma.data.data.IhusRepository
import com.example.multiidioma.data.types.MiniScreenState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CiqusViewModel : ViewModel() {
    private val _uiState = MutableStateFlow<MiniScreenState>(MiniScreenState.Loading)
    val uiState: StateFlow<MiniScreenState> = _uiState.asStateFlow()

    init {
        loadMiniScreens()
    }

    private fun loadMiniScreens() {
        viewModelScope.launch {
            //delay(500) // Simula tiempo de carga
            val listaCiqusRepository = IhusRepository()
            _uiState.value = MiniScreenState.Success(
                listOf(
                    listaCiqusRepository.getData(0),
                    listaCiqusRepository.getData(1),
                    listaCiqusRepository.getData(2),
                    listaCiqusRepository.getData(3),
                    listaCiqusRepository.getData(4),
                    listaCiqusRepository.getData(5),
                    listaCiqusRepository.getData(6),
                    listaCiqusRepository.getData(7),
                    listaCiqusRepository.getData(8),
                    listaCiqusRepository.getData(9),

                    )
            )
        }
    }
}