package com.example.multiidioma.ui.screens.multimedia


import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.example.multiidioma.data.imaxesJPG
import com.example.multiidioma.data.types.states.MultimediaState
import com.example.multiidioma.data.urlRecursosApp
import com.example.multiidioma.ui.components.ErrorComponente
import com.example.multiidioma.ui.components.ImageAsincComponent
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