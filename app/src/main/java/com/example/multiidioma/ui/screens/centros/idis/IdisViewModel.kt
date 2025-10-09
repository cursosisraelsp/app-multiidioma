package com.example.multiidioma.ui.screens.centros.idis

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.multiidioma.data.data.IdisRepository
import com.example.multiidioma.data.data.IlgRepository
import com.example.multiidioma.data.types.MiniScreenState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class IdisViewModel : ViewModel() {
    private val _uiState = MutableStateFlow<MiniScreenState>(MiniScreenState.Loading)
    val uiState: StateFlow<MiniScreenState> = _uiState.asStateFlow()

    init {
        loadMiniScreens()
    }

    private fun loadMiniScreens() {
        viewModelScope.launch {
            //delay(500) // Simula tiempo de carga
            val listaIdisRepository = IdisRepository()
            _uiState.value = MiniScreenState.Success(
                listOf(
                    listaIdisRepository.getData(0),
                    listaIdisRepository.getData(1),
                    listaIdisRepository.getData(2),
                    listaIdisRepository.getData(3),
                    listaIdisRepository.getData(4),
                    listaIdisRepository.getData(5),
                    listaIdisRepository.getData(6),
                    listaIdisRepository.getData(7),
                    listaIdisRepository.getData(8),
                    listaIdisRepository.getData(9),
                    listaIdisRepository.getData(10),
                    listaIdisRepository.getData(11),
                    listaIdisRepository.getData(12),
                    listaIdisRepository.getData(13),
                    listaIdisRepository.getData(14),
                    listaIdisRepository.getData(15),
                    listaIdisRepository.getData(16),
                  /*  listaIlgRepository.getData(17),
                    listaIlgRepository.getData(18),
                    listaIlgRepository.getData(19),
                    listaIlgRepository.getData(20),
                    listaIlgRepository.getData(21),
                    listaIlgRepository.getData(22),
                    listaIlgRepository.getData(23),
                    listaIlgRepository.getData(24),*/
                )
            )
        }
    }
}