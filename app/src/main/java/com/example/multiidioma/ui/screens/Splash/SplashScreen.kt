package com.example.multiidioma.ui.screens.Splash

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import com.example.multiidioma.R
import com.example.multiidioma.ui.components.SplashImaxen
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(true) {
        delay(5000L)
        /*navController.navigate("home") {
            popUpTo("splash") { inclusive = true }
        }*/

        navController.navigate("home")
    }

    // Pasando la imagen como parámetro
    SplashImaxen(imageResId = R.drawable.imaxeninicial)
}
