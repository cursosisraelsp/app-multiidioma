package com.example.multiidioma.ui.screens.multimedia


import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.multiidioma.data.types.states.MultimediaState
import com.example.multiidioma.ui.components.ErrorComponente
import com.example.multiidioma.ui.components.LoadingComponente
import com.example.multiidioma.ui.components.ScrollRowMultimedia

@Composable
fun MultimediaScreen(){

    val viewModel: MultimediaViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()

    when (uiState) {
        is MultimediaState.Success -> {
            val multimediaList = (uiState as MultimediaState.Success).multiMediaDates
            ScrollRowMultimedia(multimediaList)
        }
        is MultimediaState.Loading -> { LoadingComponente()  }
        is MultimediaState.Error -> { ErrorComponente() }
    }

}