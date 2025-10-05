package com.example.multiidioma.data.types.states

import com.example.multiidioma.data.types.MultimediaData

sealed class MultimediaState {
    object Loading: MultimediaState()
    data class Success(
        val multiMediaDates : List<MultimediaData>
    ) : MultimediaState()
    data class Error(
        val message : String
    ) : MultimediaState()
}