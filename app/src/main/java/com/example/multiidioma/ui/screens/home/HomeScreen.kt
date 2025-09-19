package com.example.multiidioma.ui.screens.home

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.multiidioma.R
import com.example.multiidioma.ui.components.SplashImaxen
import com.example.multiidioma.utils.ImaxenClickHomeUtils
import com.example.multiidioma.viewmodel.LanguageViewModel


@Composable
fun HomeScreen(
    languageViewModel: LanguageViewModel,
    listState: LazyListState,
    onImageClick:  (String) -> Unit,
    homeViewModel: HomeViewModel = viewModel()
) {
    val state by homeViewModel.homeScreenState.collectAsState()
    // Contenedor principal
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        // Splash de fondo
        SplashImaxen(imageResId = R.drawable.fondohome)

        // Contenedor de la lista de formas
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .border(width = 1.dp, color = Color.Black)
        ) {
            state.lista.forEach { item ->
                ImaxenClickHomeUtils(
                    item = item,
                    onItemClick = {item -> onImageClick(item)}
                )
            }


        }
    }
}
