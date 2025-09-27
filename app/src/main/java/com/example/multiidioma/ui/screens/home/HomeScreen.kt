package com.example.multiidioma.ui.screens.home

import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.multiidioma.R
import com.example.multiidioma.ui.components.NavigationFigures1TextComponent
import com.example.multiidioma.ui.components.SplashImaxen
import com.example.multiidioma.viewmodel.LanguageViewModel


@Composable
fun HomeScreen(
    navController : NavHostController,
    languageViewModel: LanguageViewModel,
    listState: LazyListState,
    onImageClick:  (String) -> Unit,
    homeViewModel: HomeViewModel = viewModel(),

) {
    val state by homeViewModel.homeScreenState.collectAsState()


    SplashImaxen(imageResId = R.drawable.fondohome)

    state.lista.map { figura ->
        NavigationFigures1TextComponent(figura, navController, onImageClick)

    }
}


/*

    /*
    state.lista.forEach { item ->
        ImaxenClickHomeUtils(
            item = item,
            onItemClick = {item -> onImageClick(item)},
            navController
        )
    }*/
    // Contenedor principal
    /*Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        // Splash de fondo
        SplashImaxen(imageResId = R.drawable.fondohome)

        state.lista.forEach { item ->
            ImaxenClickHomeUtils(
                item = item,
                onItemClick = {item -> onImageClick(item)},
                navController
            )
        }
        // Contenedor de la lista de formas
        /*Column(
            modifier = Modifier
                .fillMaxSize()
                //.padding(16.dp)
                .border(width = 1.dp, color = Color.Black)
        ) {
            state.lista.forEach { item ->
                ImaxenClickHomeUtils(
                    item = item,
                    onItemClick = {item -> onImageClick(item)},
                    navController
                )
            }


        }*/
    }*/
}
*/