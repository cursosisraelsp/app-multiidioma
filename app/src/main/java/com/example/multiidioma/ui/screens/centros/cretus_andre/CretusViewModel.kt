package com.example.multiidioma.ui.screens.institutes.Cretus_andre

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.multiidioma.data.repository.CretusRepository
import com.example.multiidioma.data.types.MiniScreenState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CretusViewModel : ViewModel() {

    private val _uiState = MutableStateFlow<MiniScreenState>(MiniScreenState.Loading)
    val uiState: StateFlow<MiniScreenState> = _uiState.asStateFlow()


    init {

        loadMiniScreens()
    }

    private fun loadMiniScreens() {
        viewModelScope.launch {
            //delay(500) // Simula tiempo de carga
            val listaCretusRepository = CretusRepository()
            _uiState.value = MiniScreenState.Success(
                listOf(
                    listaCretusRepository.getData(0),
                    listaCretusRepository.getData(1),
                    listaCretusRepository.getData(2),
                    listaCretusRepository.getData(3),
                    listaCretusRepository.getData(4),
                    listaCretusRepository.getData(5),
                    listaCretusRepository.getData(6),
                    listaCretusRepository.getData(7),
                    listaCretusRepository.getData(8),
                    listaCretusRepository.getData(9),
                    listaCretusRepository.getData(10),
                    listaCretusRepository.getData(11),
                    listaCretusRepository.getData(12),
                    listaCretusRepository.getData(13),
                    listaCretusRepository.getData(14),
                    listaCretusRepository.getData(15),
                    listaCretusRepository.getData(16),
                    listaCretusRepository.getData(17),
                    listaCretusRepository.getData(18),
                    listaCretusRepository.getData(19),
                    listaCretusRepository.getData(20),
                    listaCretusRepository.getData(21),
                    listaCretusRepository.getData(22),
                    listaCretusRepository.getData(23),
                    listaCretusRepository.getData(24),
                    listaCretusRepository.getData(25),
                    listaCretusRepository.getData(26),
                    listaCretusRepository.getData(27),
                    listaCretusRepository.getData(28),
                    listaCretusRepository.getData(29),
                    listaCretusRepository.getData(30),
                    listaCretusRepository.getData(31),
                    listaCretusRepository.getData(32),
                    listaCretusRepository.getData(33),
                    listaCretusRepository.getData(34),
                    listaCretusRepository.getData(35),
                    listaCretusRepository.getData(36)


                )
            )

        }
    }
}