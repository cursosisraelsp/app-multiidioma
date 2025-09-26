package com.example.multiidioma.ui.screens.institutes.ilg

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.multiidioma.data.data.IlgRepository
import com.example.multiidioma.data.types.MiniScreenState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class IlgViewModel : ViewModel() {
    private val _uiState = MutableStateFlow<MiniScreenState>(MiniScreenState.Loading)
    val uiState: StateFlow<MiniScreenState> = _uiState.asStateFlow()

    init {
        loadMiniScreens()
    }

    private fun loadMiniScreens() {
        viewModelScope.launch {
            //delay(500) // Simula tiempo de carga
            val listaIlgRepository = IlgRepository()
            _uiState.value = MiniScreenState.Success(
                listOf(
                    listaIlgRepository.getData(0),
                    listaIlgRepository.getData(1),
                    listaIlgRepository.getData(2),
                    listaIlgRepository.getData(3),
                    listaIlgRepository.getData(4),
                    listaIlgRepository.getData(5),
                    listaIlgRepository.getData(6),
                    listaIlgRepository.getData(7),
                    listaIlgRepository.getData(8),
                    listaIlgRepository.getData(9),
                    listaIlgRepository.getData(10),
                    listaIlgRepository.getData(11),
                    listaIlgRepository.getData(12),
                    listaIlgRepository.getData(13),
                    listaIlgRepository.getData(14),

                    )
            )
        }
    }
}