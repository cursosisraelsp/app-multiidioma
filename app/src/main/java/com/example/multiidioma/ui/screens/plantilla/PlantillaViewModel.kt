package com.example.multiidioma.ui.screens.plantilla

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.multiidioma.data.repository.InfoResearchersRepository

import com.example.multiidioma.data.types.states.PlantillaState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class PlantillaViewModel : ViewModel() {
    private val _uiState = MutableStateFlow<PlantillaState>(PlantillaState.Loading)
    val uiState: StateFlow<PlantillaState> = _uiState.asStateFlow()
    val repository = InfoResearchersRepository()


    fun loadPlantillaPorCentro(centro: String) {
        viewModelScope.launch {
            _uiState.value = PlantillaState.Loading
            try {
                val lista = when (centro.lowercase()) {
                    "imatus" -> repository.infoReaseachersImatus()
                    "citius" -> repository.infoReaseachersCitius()
                    "incifor" -> repository.infoReaseachersIncifor()
                    else -> emptyList()
                }
                _uiState.value = PlantillaState.Success(lista)
            } catch (e: Exception) {
                _uiState.value = PlantillaState.Error("Error cargando datos: ${e.message}")
            }
        }
    }
}