package com.example.multiidioma.ui.cimus

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.multiidioma.data.repository.detailScreenContent
import com.example.multiidioma.data.repository.miniScreensCimus
import com.example.multiidioma.viewmodel.LanguageViewModel

@Composable
fun CimusScreen(languageViewModel: LanguageViewModel,viewModel: CimusViewModel = viewModel()){


    // Generamos la lista de MiniScreens
    //val screens = miniScreensCimus(detailScreenContent, languageViewModel)
    val miniScreens = viewModel.loadMiniScreens(detailScreenContent, languageViewModel)
    LazyColumn(modifier = Modifier.fillMaxSize().background(Color.Gray).padding(0.dp)) {
        items(miniScreens) { miniScreen ->
            // Aquí se le pasa el Modifier a cada elemento
            miniScreen(Modifier.fillParentMaxSize())
        }
    }


}