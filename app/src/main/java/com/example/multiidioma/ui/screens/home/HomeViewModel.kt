package com.example.multiidioma.ui.screens.home

import androidx.lifecycle.ViewModel
import com.example.multiidioma.data.repository.formasClickHome
import com.example.multiidioma.data.types.ListaImaxenClickData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel: ViewModel() {
    private val _homeScreenState = MutableStateFlow(ListaImaxenClickData())
    val homeScreenState: StateFlow<ListaImaxenClickData> = _homeScreenState.asStateFlow()

    init {
        loadHomeDatas()
    }

    private fun loadHomeDatas(){
        //_homeScreenState.value =  listaImaxesHome
        _homeScreenState.value = ListaImaxenClickData(lista = formasClickHome)

    }
}