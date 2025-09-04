package com.example.multiidioma.ui


import android.content.Context
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.rememberNavController
import com.example.multiidioma.utils.setLocale
import com.example.multiidioma.viewmodel.LanguageViewModel
import com.example.multiidioma.navegacion.NavHostApp
import com.example.multiidioma.utils.BottomBarUtils
import com.example.multiidioma.utils.DetectScroll
import com.example.multiidioma.utils.TopBarUtils

val LocalizedContext = compositionLocalOf<Context> {
    error("No LocalizedContext provided")
}


@Composable
fun MyApp(languageViewModel: LanguageViewModel) {
    val context = LocalContext.current
    val language by languageViewModel.language.collectAsState()
    val localizedContext = context.setLocale(language)
    val listState = rememberLazyListState()

    // 👇 Estado de visibilidad de la BottomBar e TopBar
    var bottomBarVisible by remember { mutableStateOf(true) }
    var topBarVisible by remember { mutableStateOf(true) }

    DetectScroll(
        listState = listState,
        topBarVisible = { topBarVisible = it },
        bottomBarVisible = { bottomBarVisible = it }
    )

    CompositionLocalProvider(LocalizedContext provides localizedContext) {
        val navController = rememberNavController()

        Scaffold(
            topBar = {
                TopBarUtils(topBarVisible= topBarVisible, navController= navController)
            },
            bottomBar = { BottomBarUtils(bottomBarVisible = bottomBarVisible,navController = navController) }
        ) { padding ->
            NavHostApp(
                navController = navController,
                modifier = Modifier.padding(padding),
                languageViewModel = languageViewModel,
                listState = listState
                )
        }
    }
}
