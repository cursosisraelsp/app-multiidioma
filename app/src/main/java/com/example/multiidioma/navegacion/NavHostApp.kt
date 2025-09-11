package com.example.multiidioma.navegacion


import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.navegacion.ciqus.CiqusAppNavegacion
import com.example.multiidioma.navegacion.citiusApp.CitiusAppNavegacion
import com.example.multiidioma.navegacion.cretus.CretusAppNavegacion
import com.example.multiidioma.navegacion.detailApp.detailNavGraph
import com.example.multiidioma.navegacion.igfaeApp.IgfaeAppNavegacion
import com.example.multiidioma.navegacion.institutos.inciforApp.InciforAppNavegacion
import com.example.multiidioma.navegacion.institutos.IdegaApp.IdegaAppNavegacion
import com.example.multiidioma.navegacion.institutos.iceApp.IceAppNavegacion
import com.example.multiidioma.navegacion.institutos.ihusApp.IhusAppNavegacion
import com.example.multiidioma.navegacion.institutos.ilgApp.IlgAppNavegacion
import com.example.multiidioma.navegacion.institutos.imatusApp.ImatusAppNavegacion
import com.example.multiidioma.navegacion.mapa.MapaAppNavegacion
import com.example.multiidioma.navegacion.minervaApp.MinervaAppNavegacion
import com.example.multiidioma.navegacion.settingsApp.SettingsAppNavegacion
import com.example.multiidioma.navegacion.startApp.StartAppNavHost
import com.example.multiidioma.ui.screens.home.HomeScreen
import com.example.multiidioma.viewmodel.LanguageViewModel

@Composable
fun NavHostApp(
    navController: NavHostController,
    modifier: Modifier,
    languageViewModel: LanguageViewModel,
    listState: LazyListState,
    onOpenMap: () -> Unit,
    visibilityMap:  () -> Unit,){
    var mapOpened by rememberSaveable { mutableStateOf(false) }
    NavHost(
        navController = navController,
        startDestination = "splash",
        modifier = modifier,

    ) {

        StartAppNavHost(navController)
        composable(route = Destination.Home.route) {
            // 👉 pásale listState para que funcione el scroll
            HomeScreen(
                languageViewModel,
                listState,
                onImageClick = { screenId ->
                    val ruta = Destination.createDetailRoute(screenId)
                    if(ruta != "detail/{screenId}"){
                        navController.navigate(ruta)
                    }
                    onOpenMap()
                    /*if (!mapOpened) {
                        onOpenMap()
                        mapOpened = true
                    }*/
                },

            )
        }
        //HomeAppNavHost(languageViewModel, listState,navController = navController)
        SettingsAppNavegacion(languageViewModel)
        //## MAPA
        /*MapaAppNavegacion(onClose = {
            visibilityMap()
            mapOpened = false} , navController)*/
        // ---
        MinervaAppNavegacion()
        //## INSTITUTOS
        IhusAppNavegacion()
        IdegaAppNavegacion()
        IceAppNavegacion()
        InciforAppNavegacion()
        ImatusAppNavegacion()
        IlgAppNavegacion()
        //## CENTROS
        CiqusAppNavegacion()
        //->CimusAppNavegacion(listState)
        CitiusAppNavegacion()
        CretusAppNavegacion()
        IgfaeAppNavegacion()

        detailNavGraph(navController,onClose = onOpenMap)
    }
}