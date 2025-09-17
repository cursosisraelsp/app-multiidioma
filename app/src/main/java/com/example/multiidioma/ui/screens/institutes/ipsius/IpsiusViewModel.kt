package com.example.multiidioma.ui.screens.ipsius

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.multiidioma.data.repository.IpsiusRepository
import com.example.multiidioma.data.types.MiniScreenState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class IpsiusViewModel : ViewModel() {

    private val _uiState = MutableStateFlow<MiniScreenState>(MiniScreenState.Loading)
    val uiState: StateFlow<MiniScreenState> = _uiState.asStateFlow()


    init {

        loadMiniScreens()
    }

    private fun loadMiniScreens() {
        viewModelScope.launch {
            //delay(500) // Simula tiempo de carga
            val listaIpsiusRepository = IpsiusRepository()
            _uiState.value = MiniScreenState.Success(
                listOf(
                    listaIpsiusRepository.getData(0),
                    listaIpsiusRepository.getData(1),
                    listaIpsiusRepository.getData(2),
                    listaIpsiusRepository.getData(3),
                    listaIpsiusRepository.getData(4),
                    listaIpsiusRepository.getData(5),
                    listaIpsiusRepository.getData(6),
                    listaIpsiusRepository.getData(7),
                    listaIpsiusRepository.getData(8),
                    listaIpsiusRepository.getData(9),
                    listaIpsiusRepository.getData(10),
                    listaIpsiusRepository.getData(11),
                    listaIpsiusRepository.getData(12),
                    listaIpsiusRepository.getData(13),
                    listaIpsiusRepository.getData(14),
                    listaIpsiusRepository.getData(15),
                    listaIpsiusRepository.getData(16),
                    listaIpsiusRepository.getData(17),
                    listaIpsiusRepository.getData(18),
                    listaIpsiusRepository.getData(19),
                    listaIpsiusRepository.getData(20),
                    listaIpsiusRepository.getData(21)

                )
            )

        }
    }
}