package com.example.multiidioma.ui.screens.ihus

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.multiidioma.data.repository.IhusRepository
import com.example.multiidioma.data.types.MiniScreenState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class IhusViewModel : ViewModel() {
    private val _uiState = MutableStateFlow<MiniScreenState>(MiniScreenState.Loading)
    val uiState: StateFlow<MiniScreenState> = _uiState.asStateFlow()

    init {
        loadMiniScreens()
    }

    private fun loadMiniScreens(){
        viewModelScope.launch {
            //delay(500) // Simula tiempo de carga
            val listaIhusRepository = IhusRepository()
            _uiState.value = MiniScreenState.Success(
                listOf(
                    listaIhusRepository.getData(0),
                    listaIhusRepository.getData(1),
                    listaIhusRepository.getData(2),
                    listaIhusRepository.getData(3),
                    listaIhusRepository.getData(4),
                    listaIhusRepository.getData(5),
                    listaIhusRepository.getData(6),
                    listaIhusRepository.getData(7),
                    listaIhusRepository.getData(8),
                    listaIhusRepository.getData(9),




                )
            )
        }
    }
}