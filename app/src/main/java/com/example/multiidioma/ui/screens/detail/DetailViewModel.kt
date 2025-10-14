package com.example.multiidioma.ui.screens.detail

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.multiidioma.data.repository.listSingularsCenters
import com.example.multiidioma.data.repository.listaInstitutos
import com.example.multiidioma.data.types.DetailScreenState
import com.example.multiidioma.ui.screens.home.figurasHome
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DetailViewModel(savedStateHandle: SavedStateHandle): ViewModel() {
    private val screenId: String = checkNotNull(savedStateHandle["screenId"])
    private val _detailScreenState = MutableStateFlow(DetailScreenState(null)) // se inicializa con null
    val detailScreenState: StateFlow<DetailScreenState> = _detailScreenState.asStateFlow()

    init {
        Log.d("DetailViewModel", "screenId recibido: $screenId")
        //loadDetailImaxenClick()
        loadDetailListSingularsCenter()
        loadDetailListInstitutes()
        loadDetailListScreensHome()
        //loadDetailListMiniScreensIncifor()
    }



    private fun loadDetailListSingularsCenter(){
        val itemListFinded = listSingularsCenters.find { it.id == screenId }
        //_detailScreenState.value = DetailScreenState(detailListSingularsCenters = itemListFinded)
        _detailScreenState.value = _detailScreenState.value.copy(
            detailListSingularsCenters = itemListFinded
        )
    }

    private fun loadDetailListInstitutes(){
        val itemListFinded = listaInstitutos.find { it.id == screenId }
        //_detailScreenState.value = DetailScreenState(detailListSingularsCenters = itemListFinded)
        _detailScreenState.value = _detailScreenState.value.copy(
            detailListInstitus = itemListFinded
        )
    }

    private fun loadDetailListScreensHome(){
        val itemListFinded = figurasHome.find { it.ruta == screenId }
        //_detailScreenState.value = DetailScreenState(detailListSingularsCenters = itemListFinded)
        _detailScreenState.value = _detailScreenState.value.copy(
            detailListScreensHome = itemListFinded
        )
    }

}