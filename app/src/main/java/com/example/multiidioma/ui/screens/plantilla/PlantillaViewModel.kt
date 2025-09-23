package com.example.multiidioma.ui.screens.plantilla

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.multiidioma.data.repository.InfoRepositoryResearchers
import com.example.multiidioma.data.types.PersonalResearcher
import com.example.multiidioma.data.types.states.PlantillaState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class PlantillaViewModel : ViewModel(){
    private val _uiState = MutableStateFlow<PlantillaState>(PlantillaState.Loading)
    val uiState: StateFlow<PlantillaState> = _uiState.asStateFlow()

    init {
        loadPlantillaIncifor()
    }

    private fun loadPlantillaIncifor(){
        val datesIncifor = InfoRepositoryResearchers()
        viewModelScope.launch {
            val listaResearchersIncifor = datesIncifor.infoReaseachersIncifor()
            _uiState.value = PlantillaState.Success(listaResearchersIncifor)
        }
    }
}