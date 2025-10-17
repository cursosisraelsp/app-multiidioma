package com.example.multiidioma.ui.screens.home

import android.content.Intent
import android.util.Log
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.multiidioma.R
import com.example.multiidioma.ui.components.NavigationFigures1TextComponent
import com.example.multiidioma.ui.components.SplashImaxen
import com.example.multiidioma.viewmodel.LanguageViewModel


@Composable
fun HomeScreen(
    modifier: Modifier,
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
    val context = LocalContext.current

    Button(onClick = {
        try {
            val intent = Intent().apply {
                setClassName(
                    context,
                    "com.unity3d.player.UnityPlayerGameActivity"
                )
            }
            context.startActivity(intent)
        } catch (e: Exception) {
            Log.e("MainScreen", "Error al abrir Unity", e)
        }
    }) {
        Text(text = "Abrir Realidad Aumentada")
    }
}


