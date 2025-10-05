package com.example.multiidioma.navegacion


/*import com.example.multiidioma.navegacion.citiusApp.CitiusAppNavegacion*/
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.multiidioma.data.repository.CitiusRepository
import com.example.multiidioma.data.repository.ImatusRepository
import com.example.multiidioma.data.repository.InciforRepository
import com.example.multiidioma.navegacion.ciqus.CiqusAppNavegacion
import com.example.multiidioma.navegacion.citiusApp.CitiusAppNavegacion
import com.example.multiidioma.navegacion.cretus.CretusAppNavegacion
import com.example.multiidioma.navegacion.detailApp.detailNavGraph
import com.example.multiidioma.navegacion.homeApp.HomeAppNavHost
import com.example.multiidioma.navegacion.igfaeApp.IgfaeAppNavegacion
import com.example.multiidioma.navegacion.institutos.IdegaApp.IdegaAppNavegacion
import com.example.multiidioma.navegacion.institutos.iceApp.IceAppNavegacion
import com.example.multiidioma.navegacion.institutos.ihusApp.IhusAppNavegacion
import com.example.multiidioma.navegacion.institutos.ilgApp.IlgAppNavegacion
import com.example.multiidioma.navegacion.institutos.imatusApp.ImatusAppNavegacion
import com.example.multiidioma.navegacion.institutos.inciforApp.InciforAppNavegacion
import com.example.multiidioma.navegacion.minervaApp.MinervaAppNavegacion
import com.example.multiidioma.navegacion.settingsApp.SettingsAppNavegacion
import com.example.multiidioma.navegacion.startApp.StartAppNavHost
import com.example.multiidioma.viewmodel.LanguageViewModel

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun NavHostApp(
    navController: NavHostController,
    modifier: Modifier,
    languageViewModel: LanguageViewModel,
    listState: LazyListState,
    onOpenMap: () -> Unit
) {
    val InciforRepository = remember { InciforRepository() }
    val CitiusRepository = remember { CitiusRepository() }
    val ImatusRepository = remember { ImatusRepository() }

    NavHost(
        navController = navController,
        startDestination = "splash",
        modifier = modifier,

        ) {

        StartAppNavHost(navController)

        HomeAppNavHost(languageViewModel, listState, navController = navController)
        SettingsAppNavegacion(languageViewModel)

        MinervaAppNavegacion()
        //## INSTITUTOS
        IhusAppNavegacion()
        IdegaAppNavegacion()
        IceAppNavegacion()
        InciforAppNavegacion(listState, navController, InciforRepository)
        ImatusAppNavegacion(listState, navController, ImatusRepository)
        IlgAppNavegacion()
        //## CENTROS
        CiqusAppNavegacion()
        //->CimusAppNavegacion(listState)
        CitiusAppNavegacion(listState, navController, CitiusRepository)
        CretusAppNavegacion()
        IgfaeAppNavegacion()
        detailNavGraph(navController, onClose = onOpenMap, listState)


        /*composable (Destination.InciforMiniscreen27.route) {
            InciforMiniScreen27(data = ,navController = navController)
        }*/
    }
}