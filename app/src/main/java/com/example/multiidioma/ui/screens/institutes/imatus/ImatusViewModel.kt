package com.example.multiidioma.ui.screens.institutes.imatus

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.multiidioma.data.repository.ImatusRepository
import com.example.multiidioma.data.types.MiniScreenState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ImatusViewModel : ViewModel() {

    private val _uiState = MutableStateFlow<MiniScreenState>(MiniScreenState.Loading)
    val uiState: StateFlow<MiniScreenState> = _uiState.asStateFlow()


    init {

        loadMiniScreens()
    }

    private fun loadMiniScreens() {
        viewModelScope.launch {
            //delay(500) // Simula tiempo de carga
            val listaImatusRepository = ImatusRepository()
            _uiState.value = MiniScreenState.Success(
                listOf(
                    listaImatusRepository.getData(0),
                    listaImatusRepository.getData(1),
                    listaImatusRepository.getData(2),
                    listaImatusRepository.getData(3),
                    listaImatusRepository.getData(4),
                    listaImatusRepository.getData(8),
                    listaImatusRepository.getData(9),
                    listaImatusRepository.getData(10),
                    listaImatusRepository.getData(11),
                    listaImatusRepository.getData(12),
                    listaImatusRepository.getData(13)


                )
            )

        }
    }
}