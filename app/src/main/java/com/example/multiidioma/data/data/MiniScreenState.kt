package com.example.multiidioma.data.data

import com.example.multiidioma.data.types.MiniScreenData

sealed class MiniScreenState {
    object Loading : MiniScreenState()
    data class Success(val screens: List<MiniScreenData>) : MiniScreenState()
    data class Error(val message: String) : MiniScreenState()
}
