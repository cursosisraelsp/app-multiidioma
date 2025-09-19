package com.example.multiidioma.navegacion


import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.multiidioma.navegacion.centros.cretusApp.CretusAppNavegacion
import com.example.multiidioma.navegacion.centros.igfaeApp.IgfaeAppNavegacion
import com.example.multiidioma.navegacion.ciqus.CiqusAppNavegacion
import com.example.multiidioma.navegacion.citiusApp.CitiusAppNavegacion
import com.example.multiidioma.navegacion.detailApp.detailNavGraph
import com.example.multiidioma.navegacion.homeApp.HomeAppNavHost
import com.example.multiidioma.navegacion.institutos.IdegaApp.IdegaAppNavegacion
import com.example.multiidioma.navegacion.institutos.iarcusApp.IarcusAppNavegacion
import com.example.multiidioma.navegacion.institutos.iceApp.IceAppNavegacion
import com.example.multiidioma.navegacion.institutos.ihusApp.IhusAppNavegacion
import com.example.multiidioma.navegacion.institutos.ilgApp.IlgAppNavegacion
import com.example.multiidioma.navegacion.institutos.imatusApp.ImatusAppNavegacion
import com.example.multiidioma.navegacion.institutos.inciforApp.InciforAppNavegacion
import com.example.multiidioma.navegacion.institutos.ipsiusApp.IpsiusAppNavegacion
import com.example.multiidioma.navegacion.minervaApp.MinervaAppNavegacion
import com.example.multiidioma.navegacion.settingsApp.SettingsAppNavegacion
import com.example.multiidioma.navegacion.startApp.StartAppNavHost
import com.example.multiidioma.viewmodel.LanguageViewModel

@Composable
fun NavHostApp(
    navController: NavHostController,
    modifier: Modifier,
    languageViewModel: LanguageViewModel,
    listState: LazyListState,
    onOpenMap: () -> Unit){

    NavHost(
        navController = navController,
        startDestination = "splash",
        modifier = modifier,

    ) {

        StartAppNavHost(navController)

        HomeAppNavHost(languageViewModel, listState,navController = navController)
        SettingsAppNavegacion(languageViewModel)

        MinervaAppNavegacion()
        //## INSTITUTOS
        IhusAppNavegacion()
        IdegaAppNavegacion()
        IceAppNavegacion()
        InciforAppNavegacion()
        ImatusAppNavegacion()
        IlgAppNavegacion()
        IpsiusAppNavegacion(listState,navController)
        IarcusAppNavegacion(listState,navController)
        //## CENTROS
        CiqusAppNavegacion()
        //->CimusAppNavegacion(listState)
        CitiusAppNavegacion()
        CretusAppNavegacion(listState,navController)
        IgfaeAppNavegacion(listState,navController)
        detailNavGraph(listState,navController,onClose = onOpenMap )
    }
}