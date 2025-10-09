package com.example.multiidioma.ui.screens.centros.cimus

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.multiidioma.data.repository.CimusRepository
import com.example.multiidioma.data.types.MiniScreenState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CimusViewModel : ViewModel() {

    private val _uiState = MutableStateFlow<MiniScreenState>(MiniScreenState.Loading)
    val uiState: StateFlow<MiniScreenState> = _uiState.asStateFlow()


    init {

        loadMiniScreens()
    }

    private fun loadMiniScreens() {
        viewModelScope.launch {
            //delay(500) // Simula tiempo de carga
            val listaCimusRepository = CimusRepository()
            _uiState.value = MiniScreenState.Success(
                listOf(
                    listaCimusRepository.getData(0),
                    listaCimusRepository.getData(1),
                    listaCimusRepository.getData(2),
                    listaCimusRepository.getData(3),
                    listaCimusRepository.getData(4),
                    listaCimusRepository.getData(5),
                    listaCimusRepository.getData(6),
                    listaCimusRepository.getData(7),
                    listaCimusRepository.getData(8),
                    listaCimusRepository.getData(13),
                    listaCimusRepository.getData(18),
                    listaCimusRepository.getData(19),
                    listaCimusRepository.getData(20),
                    listaCimusRepository.getData(21),
                    listaCimusRepository.getData(22),

                    )
            )

        }
    }
}