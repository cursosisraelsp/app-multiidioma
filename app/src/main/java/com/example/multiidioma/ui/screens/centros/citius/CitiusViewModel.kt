
package com.example.multiidioma.ui.screens.centros.citius


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.multiidioma.data.repository.CitiusRepository
import com.example.multiidioma.data.types.MiniScreenState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch


class CitiusViewModel : ViewModel() {

    private val _uiState = MutableStateFlow<MiniScreenState>(MiniScreenState.Loading)
    val uiState: StateFlow<MiniScreenState> = _uiState.asStateFlow()


    init {

        loadMiniScreens()
    }

    private fun loadMiniScreens() {
        viewModelScope.launch {
            //delay(500) // Simula tiempo de carga
            val listaCitiusRepository = CitiusRepository()
            _uiState.value = MiniScreenState.Success(
                listOf(
                    listaCitiusRepository.getData(0),
                    listaCitiusRepository.getData(1),
                    listaCitiusRepository.getData(2),
                    listaCitiusRepository.getData(3),
                    listaCitiusRepository.getData(4),
                    listaCitiusRepository.getData(5),
                    listaCitiusRepository.getData(11),
                    listaCitiusRepository.getData(12),
                    listaCitiusRepository.getData(13),
                    listaCitiusRepository.getData(14),
                    listaCitiusRepository.getData(15),
                    listaCitiusRepository.getData(16),
                    listaCitiusRepository.getData(17),
                    listaCitiusRepository.getData(18),
                    listaCitiusRepository.getData(19),

                    )
            )

        }
    }
}

