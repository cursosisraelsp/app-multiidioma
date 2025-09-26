package com.example.multiidioma.data.types.states


import com.example.multiidioma.data.types.PersonalResearcher

sealed class PlantillaState {
    object Loading: PlantillaState()
    data class Success(
        val infoResearchers : List<PersonalResearcher>
    ): PlantillaState()
    data class Error(
        val message: String
    ) : PlantillaState()
}