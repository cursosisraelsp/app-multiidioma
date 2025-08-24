package com.example.multiidioma.ui


import android.content.Context
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.multiidioma.ui.screens.HomeScreen
import com.example.multiidioma.ui.screens.Splash.SplashScreen
import com.example.multiidioma.utils.setLocale
import com.example.multiidioma.viewmodel.LanguageViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.multiidioma.ui.screens.settings.SettigsScreen

val LocalizedContext = compositionLocalOf<Context> {
    error("No LocalizedContext provided")
}


@Composable
fun MyApp(languageViewModel: LanguageViewModel) {
    val context = LocalContext.current
    val language by languageViewModel.language.collectAsState()
    val localizedContext = context.setLocale(language)

    CompositionLocalProvider(LocalizedContext provides localizedContext) {
        val navController = rememberNavController()

        Scaffold(
            bottomBar = {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route

                // Mostramos BottomBar solo en "splash" y "home"
                if (currentRoute == "home" || currentRoute == "settings") {
                    BottomAppBar(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(106.dp)
                    ) {
                        // Botón 1
                        TextButton(onClick = {  navController.navigate("home") }) {
                            Text("Inicio")
                        }
                        Spacer(modifier = Modifier.weight(1f))
                        // Botón 2
                        TextButton(onClick = { navController.navigate("settings") }) {
                            Text("Outra")
                        }
                        /*Spacer(modifier = Modifier.weight(1f))
                        // Botón 3
                        TextButton(onClick = {  navController.navigate("splash") }) {
                            Text("Configuración")
                        }*/
                    }
                }
            }
        ) { padding ->
            NavHost(
                navController = navController,
                startDestination = "splash",
                modifier = Modifier.padding(padding)
            ) {
                composable("splash") {
                    SplashScreen(navController)
                }
                composable("home") {
                    HomeScreen(languageViewModel)
                }
                composable("settings") {
                    SettigsScreen()
                }
            }
        }
    }
}
