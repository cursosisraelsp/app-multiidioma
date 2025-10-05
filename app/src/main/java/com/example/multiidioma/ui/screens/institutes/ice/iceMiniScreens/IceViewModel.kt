package com.example.multiidioma.ui.screens.incifor

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import com.example.multiidioma.data.repository.IceRepository
import com.example.multiidioma.data.types.MiniScreenState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch


class IceViewModel : ViewModel() {

    private val _uiState = MutableStateFlow<MiniScreenState>(MiniScreenState.Loading)
    val uiState: StateFlow<MiniScreenState> = _uiState.asStateFlow()


    init {

        loadMiniScreens()
    }

    private fun loadMiniScreens() {
        viewModelScope.launch {
            //delay(500) // Simula tiempo de carga
            val listaIceRepository = IceRepository()
            _uiState.value = MiniScreenState.Success(
                listOf(
                    listaIceRepository.getData(0),
                    listaIceRepository.getData(1),
                    listaIceRepository.getData(2),
                    listaIceRepository.getData(3),
                    listaIceRepository.getData(4),
                    listaIceRepository.getData(5),
                    listaIceRepository.getData(6),
                    listaIceRepository.getData(7),
                    listaIceRepository.getData(8),
                    listaIceRepository.getData(9),
                    listaIceRepository.getData(10),
                    listaIceRepository.getData(11),
                    listaIceRepository.getData(12),
                    listaIceRepository.getData(13),
                    listaIceRepository.getData(19),
                    listaIceRepository.getData(20),
                    listaIceRepository.getData(21),
                    listaIceRepository.getData(22),
                    listaIceRepository.getData(23),
                    listaIceRepository.getData(24),
                    listaIceRepository.getData(25),
                    listaIceRepository.getData(26),
                    listaIceRepository.getData(28),



                )
            )

        }
    }
}