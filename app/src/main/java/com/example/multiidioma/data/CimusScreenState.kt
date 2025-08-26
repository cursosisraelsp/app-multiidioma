package com.example.multiidioma.data

sealed class CimusScreenState {
    object Loading : CimusScreenState()
    data class Success(val screens: List<MiniScreenData>) : CimusScreenState()
    data class Error(val message: String) : CimusScreenState()
}
