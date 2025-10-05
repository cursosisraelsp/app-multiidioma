package com.example.multiidioma.navegacion

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.multiidioma.data.CONDICIONS
import com.example.multiidioma.data.listaTitulos
import com.example.multiidioma.ui.screens.mapa.MapScreen
import com.example.multiidioma.utils.BottomBarUtils
import com.example.multiidioma.utils.TopBarUtils
import com.example.multiidioma.viewmodel.LanguageViewModel


@SuppressLint("NewApi")
@Composable
fun ScaffoldApp( topBarVisible: Boolean,bottomBarVisible: Boolean,languageViewModel: LanguageViewModel,listState: LazyListState){
    val navController = rememberNavController()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    var showMap by rememberSaveable  { mutableStateOf(false) } // 👈 controla la visibilidad del mapa
    val condicions = CONDICIONS()

    Box(modifier = Modifier.fillMaxSize()) {
        ModalNavigationDrawer(
            drawerState = drawerState,
            drawerContent = {
                val titulosCentros = listaTitulos()
                ModalDrawerSheet {
                    // Títulos Centros Singulares
                    val titulosCentrosSingulares = titulosCentros.CentrosSingulares(navController, scope, drawerState)
                    val titulosInstitos = titulosCentros.Institutos(navController, scope, drawerState)
                    if (drawerState.isOpen) {
                        titulosCentrosSingulares.titulosModalDrawSheet.forEach { it() }
                        titulosInstitos.titulosModalDrawSheet.forEach { it() }
                    }

                }

            }
        )
        {
            Scaffold(
                topBar = {

                    TopBarUtils(
                        //topBarVisible = topBarVisible,
                        topBarVisible = true,
                        navController = navController,
                        drawerState, scope = scope
                    )
                },
                bottomBar = {
                    BottomBarUtils(
                        //bottomBarVisible = bottomBarVisible,
                        bottomBarVisible = true,
                        navController = navController
                    )
                }

            ) { padding  ->
                NavHostApp(
                    navController = navController,
                    modifier = Modifier.padding(padding),
                    languageViewModel = languageViewModel,
                    listState = listState,
                    onOpenMap = { showMap = true }, // 👈 cuando se pulse en HomeScreen,
                )
            }

        }
// Overlay del mapa sobre TODO el scaffold
        if (showMap) {
            MapScreen(
                onClose = { showMap = false }, // 👈 botón para cerrar
                navController = navController
            )
        }
    }
}