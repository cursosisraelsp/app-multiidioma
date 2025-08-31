package com.example.multiidioma.ui


import android.content.Context
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.multiidioma.ui.screens.HomeScreen
import com.example.multiidioma.utils.setLocale
import com.example.multiidioma.viewmodel.LanguageViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.multiidioma.ui.cimus.CimusScreen
import com.example.multiidioma.ui.screens.start.StartScreen
import com.example.multiidioma.ui.screens.settings.SettingsScreen
val LocalizedContext = compositionLocalOf<Context> {
    error("No LocalizedContext provided")
}

@Composable
fun MyApp(languageViewModel: LanguageViewModel) {
    val context = LocalContext.current
    val language by languageViewModel.language.collectAsState()
    val localizedContext = context.setLocale(language)
    val listState = rememberLazyListState()

    // 👇 Estado de visibilidad de la BottomBar
    var bottomBarVisible by remember { mutableStateOf(true) }

    // Detecta scroll
    LaunchedEffect(listState) {
        var lastScrollOffset = 0
        snapshotFlow { listState.firstVisibleItemScrollOffset }
            .collect { offset ->
                bottomBarVisible = when {
                    offset > lastScrollOffset -> false // ocultar al hacer scroll hacia abajo
                    offset < lastScrollOffset -> true  // mostrar al hacer scroll hacia arriba
                    else -> bottomBarVisible
                }
                lastScrollOffset = offset
            }
    }

    CompositionLocalProvider(LocalizedContext provides localizedContext) {
        val navController = rememberNavController()

        Scaffold(
            bottomBar = {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route

                if ((currentRoute == "home" || currentRoute == "settings" || currentRoute == "cimus")) {
                    AnimatedVisibility(
                        visible = bottomBarVisible,
                        enter = slideInVertically(initialOffsetY = { it }),
                        exit = slideOutVertically(targetOffsetY = { it })
                    ) {
                        BottomAppBar(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(106.dp)
                        ) {
                            // Botón 1
                            TextButton(onClick = { navController.navigate("home") }) {
                                Text("Inicio")
                            }
                            Spacer(modifier = Modifier.weight(1f))
                            // Botón 2
                            TextButton(onClick = { navController.navigate("settings") }) {
                                Text("Settings")
                            }
                            Spacer(modifier = Modifier.weight(1f))
                            // Botón 3
                            TextButton(onClick = { navController.navigate("cimus") }) {
                                Text("Cimus")
                            }
                        }
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
                    StartScreen(navController)
                }
                composable("home") {
                    // 👉 pásale listState para que funcione el scroll
                    HomeScreen(languageViewModel, listState)
                }
                composable("settings") {
                    SettingsScreen(languageViewModel)
                }
                composable("cimus") {
                    CimusScreen(listState)
                }
            }
        }
    }
}
