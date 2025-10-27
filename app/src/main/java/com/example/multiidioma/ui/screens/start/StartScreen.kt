package com.example.multiidioma.ui.screens.start

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.multiidioma.R
import com.example.multiidioma.data.urlRecursosApp
import com.example.multiidioma.ui.components.SplashImaxen
import com.example.multiidioma.ui.components.SplashUrlImaxenComponent
import kotlinx.coroutines.delay

@Composable
fun StartScreen(navController: NavController) {
    LaunchedEffect(true) {
        delay(6000L)
        navController.navigate("home") {
            popUpTo("splash") { inclusive = true }
        }
    }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        // Imagen de fondo full screen

        val imaxenInicial = "$urlRecursosApp/imaxeninicial.png"
        val imaxenLogoBranco = "$urlRecursosApp/logo_en_branco.png"
        SplashUrlImaxenComponent(imaxenInicial)
        // Logo centrado encima
        SplashUrlImaxenComponent(imaxenLogoBranco,modifier = Modifier.size(300.dp))

    }
}
