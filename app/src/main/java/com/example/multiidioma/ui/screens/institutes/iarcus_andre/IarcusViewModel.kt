package com.example.multiidioma.ui.screens.institutes.iarcus_andre

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.multiidioma.data.repository.IarcusRepository
import com.example.multiidioma.data.types.MiniScreenState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class IarcusViewModel : ViewModel() {

    private val _uiState = MutableStateFlow<MiniScreenState>(MiniScreenState.Loading)
    val uiState: StateFlow<MiniScreenState> = _uiState.asStateFlow()


    init {

        loadMiniScreens()
    }

    private fun loadMiniScreens() {
        viewModelScope.launch {
            //delay(500) // Simula tiempo de carga
            val listaIarcusRepository = IarcusRepository()
            _uiState.value = MiniScreenState.Success(
                listOf(
                    listaIarcusRepository.getData(0),
                    listaIarcusRepository.getData(1),
                    listaIarcusRepository.getData(2),
                    listaIarcusRepository.getData(3),
                    listaIarcusRepository.getData(4),
                    listaIarcusRepository.getData(5),
                    listaIarcusRepository.getData(6),
                    listaIarcusRepository.getData(7),
                    listaIarcusRepository.getData(8),
                    listaIarcusRepository.getData(9),
                    listaIarcusRepository.getData(10),
                    listaIarcusRepository.getData(11),
                    listaIarcusRepository.getData(12),
                    listaIarcusRepository.getData(13),
                    listaIarcusRepository.getData(14),
                    listaIarcusRepository.getData(15),
                    listaIarcusRepository.getData(16),
                    listaIarcusRepository.getData(17),
                    listaIarcusRepository.getData(18),
                    listaIarcusRepository.getData(19),
                    listaIarcusRepository.getData(20),
                    listaIarcusRepository.getData(21)

                )
            )

        }
    }
}