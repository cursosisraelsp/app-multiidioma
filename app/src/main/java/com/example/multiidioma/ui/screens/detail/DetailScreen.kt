package com.example.multiidioma.ui.screens.detail

import InciforScreen
import IpsiusScreen
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.multiidioma.data.types.ContentType
import com.example.multiidioma.ui.screens.centros.CentresSingularsScreen
import com.example.multiidioma.ui.screens.centros.ciqus.CiqusScreen
import com.example.multiidioma.ui.screens.centros.citius.CitiusScreen
import com.example.multiidioma.ui.screens.centros.cretus.CretusScreen
import com.example.multiidioma.ui.screens.centros.igfae.IgfaeScreen
import com.example.multiidioma.ui.screens.ihus.IhusScreen
import com.example.multiidioma.ui.screens.institutes.InstitutesScreen
import com.example.multiidioma.ui.screens.institutes.ice.IceScreen
import com.example.multiidioma.ui.screens.institutes.idega.IdegaScreen
//import com.example.multiidioma.ui.screens.institutes.ihus.IhusScreen
import com.example.multiidioma.ui.screens.institutes.ilg.IlgScreen
import com.example.multiidioma.ui.screens.institutes.imatus.ImatusScreen
import com.example.multiidioma.ui.screens.mapa.MapScreen
import com.example.multiidioma.ui.screens.minerva.MinervaScreen
import com.example.multiidioma.ui.screens.multimedia.MultimediaScreen

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun DetailScreen(
    navController: NavController,
    //screenId: String, // 👈 nuevo parámetro
    detailViewModel: DetailViewModel = viewModel(),
    onClose : ()-> Unit,
    listState: LazyListState,
    modifier: Modifier
){
    val state by detailViewModel.detailScreenState.collectAsState() // viene de val detailScreenState: StateFlow<DetailScreenState> = _detailScreenState.asStateFlow()


    val listSingulars = state.detailListSingularsCenters
    val listInstitus = state.detailListInstitus
    val listFiguresHome = state.detailListScreensHome


    var mapOpened by rememberSaveable { mutableStateOf(false) } // ✅ controla apertura

    if (listFiguresHome != null && listFiguresHome.contentType is ContentType.Mapa && !mapOpened ) {
        onClose()
        mapOpened = true
    }
    when {


        listSingulars != null -> {
            Box(modifier = Modifier.fillMaxSize()) {
                when (listSingulars.contentType) {
                    is ContentType.CIQUS -> CiqusScreen()
                    //is ContentType.CIMUS -> CimusScreen()
                    is ContentType.CITIUS -> CitiusScreen()
                    is ContentType.CRETUS -> CretusScreen()
                    is ContentType.IGFAE -> IgfaeScreen()
                    else -> Text("screen non atopado")
                }
            }
        }

        listInstitus != null -> {
            Box(modifier = Modifier.fillMaxSize()) {
                when (listInstitus.contentType) {
                    is ContentType.IHUS -> IhusScreen(listState)
                    is ContentType.IDEGA -> IdegaScreen()
                    is ContentType.ICE -> IceScreen()
                    is ContentType.INCIFOR -> InciforScreen(listState, navController, modifier)
                    is ContentType.IMATUS -> ImatusScreen()
                    is ContentType.ILG -> IlgScreen()
                    is ContentType.IPSIUS -> IpsiusScreen(listState, navController)
                    else -> Text("screen non atopado")
                }
            }
        }
        listFiguresHome != null -> {
            Box(modifier = Modifier.fillMaxSize()) {
                when (listFiguresHome.contentType) {
                    is ContentType.Minerva -> MinervaScreen()
                    //is ContentType.Mapa -> MapScreen()
                    is ContentType.Multimedia -> MultimediaScreen()
                    is ContentType.Institutos -> InstitutesScreen(navController)
                    is ContentType.CentrosSingulares ->  CentresSingularsScreen(navController)

                    else -> Text("screen non atopado")
                }
            }
        }

    }

}