package com.example.multiidioma.data

sealed class CimusScreenState {
    object Loading : CimusScreenState()
    data class Success(val miniScreens: List<MiniScreenData>) : CimusScreenState()
    data class Error(val message: String) : CimusScreenState()
}
