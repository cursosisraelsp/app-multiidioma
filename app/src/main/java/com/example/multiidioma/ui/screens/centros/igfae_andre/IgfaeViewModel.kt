package com.example.multiidioma.ui.screens.institutes.Igfae_andre

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.multiidioma.data.repository.IgfaeRepository
import com.example.multiidioma.data.types.MiniScreenState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class IgfaeViewModel : ViewModel() {

    private val _uiState = MutableStateFlow<MiniScreenState>(MiniScreenState.Loading)
    val uiState: StateFlow<MiniScreenState> = _uiState.asStateFlow()


    init {
        loadMiniScreens()
    }

    private fun loadMiniScreens() {
        viewModelScope.launch {
            //delay(500) // Simula tiempo de carga
            val listaIgfaeRepository = IgfaeRepository()
            _uiState.value = MiniScreenState.Success(
                listOf(
                    listaIgfaeRepository.getData(0),
                    listaIgfaeRepository.getData(1),
                    listaIgfaeRepository.getData(2),
                    listaIgfaeRepository.getData(3),
                    listaIgfaeRepository.getData(4),
                    listaIgfaeRepository.getData(5),
                    listaIgfaeRepository.getData(6),
                    listaIgfaeRepository.getData(7),
                    listaIgfaeRepository.getData(8),
                    listaIgfaeRepository.getData(9),
                    listaIgfaeRepository.getData(10),
                    listaIgfaeRepository.getData(11),
                    listaIgfaeRepository.getData(12),
                    listaIgfaeRepository.getData(13),
                    listaIgfaeRepository.getData(14),
                    listaIgfaeRepository.getData(15),
                    listaIgfaeRepository.getData(16),
                    listaIgfaeRepository.getData(17),
                    listaIgfaeRepository.getData(18),
                    listaIgfaeRepository.getData(19),
                    listaIgfaeRepository.getData(20),
                    listaIgfaeRepository.getData(21)

                )
            )

        }
    }
}