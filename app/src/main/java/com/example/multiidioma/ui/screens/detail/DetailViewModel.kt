package com.example.multiidioma.ui.screens.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.multiidioma.data.repository.formasClickHome
import com.example.multiidioma.data.types.DetailScreenState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DetailViewModel(savedStateHandle: SavedStateHandle): ViewModel() {
    private val screenId: String = checkNotNull(savedStateHandle["screenId"])
    private val _detailScreenState = MutableStateFlow(DetailScreenState(null)) // se inicializa con null
    val detailScreenState: StateFlow<DetailScreenState> = _detailScreenState.asStateFlow()

    init {
        loadDetailImaxenClick()
    }

    private fun loadDetailImaxenClick(){
        val imaxenClickEncontrada = formasClickHome.find { it.id == screenId }// it.<valor> debe tamén estar no elemento click
        _detailScreenState.value = DetailScreenState(detailImaxenClick = imaxenClickEncontrada)
    }

}