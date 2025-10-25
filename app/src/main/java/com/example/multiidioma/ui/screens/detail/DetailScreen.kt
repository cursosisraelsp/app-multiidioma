package com.example.multiidioma.ui.screens.detail

import InciforScreen
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Box
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
import com.example.multiidioma.ui.screens.centros.cimus.CimusScreen
import com.example.multiidioma.ui.screens.centros.ciqus.CiqusScreen
import com.example.multiidioma.ui.screens.centros.citius.CitiusScreen
import com.example.multiidioma.ui.screens.centros.cretus_andre.CretusScreen
import com.example.multiidioma.ui.screens.centros.idis.IdisScreen
import com.example.multiidioma.ui.screens.centros.igfae_andre.IgfaeScreen
import com.example.multiidioma.ui.screens.ihus.IhusScreen
import com.example.multiidioma.ui.screens.institutes.InstitutesScreen
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.IarcusScreen
import com.example.multiidioma.ui.screens.institutes.ice.IceScreen
import com.example.multiidioma.ui.screens.institutes.idega.IdegaScreen
import com.example.multiidioma.ui.screens.institutes.ilg.IlgScreen
import com.example.multiidioma.ui.screens.institutes.imatus.ImatusScreen
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.IpsiusScreen
import com.example.multiidioma.ui.screens.minerva.MinervaScreen
import com.example.multiidioma.ui.screens.multimedia.MultimediaScreen

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun DetailScreen(
    navController: NavController,
    //screenId: String, // 👈 nuevo parámetro
    detailViewModel: DetailViewModel = viewModel(),
    onClose: () -> Unit,
    listState: LazyListState,
    modifier: Modifier
) {
    val state by detailViewModel.detailScreenState.collectAsState() // viene de val detailScreenState: StateFlow<DetailScreenState> = _detailScreenState.asStateFlow()
    onClose: () -> Unit,
    listState: LazyListState,
    )
    val state by detailViewModel.detailScreenState.collectAsState()


    val listSingulars = state.detailListSingularsCenters
    val listInstitus = state.detailListInstitus
    val listFiguresHome = state.detailListScreensHome


    var mapOpened by rememberSaveable { mutableStateOf(false) } // ✅ controla apertura

    if (listFiguresHome != null && listFiguresHome.contentType is ContentType.Mapa && !mapOpened) {
        onClose()
        mapOpened = true
    }
    when {
        imaxenClick == null || listSingulars == null -> {
            CircularProgressIndicator()
        }

        imaxenClick != null -> {
            Box(modifier = Modifier.fillMaxSize()) {
                when (imaxenClick.contentType) {
                    is ContentType.MultimediaContent -> MultimediaScreen()
                    is ContentType.MinervaContent -> Text(text = "Estou en minerva")
                    //is ContentType.MapContent -> MapScreen(onClose = {showMap = false})
                    /*is ContentType.MapContent -> {
                        // En vez de abrir el MapScreen aquí,
                        // dispara el overlay:
                        onClose()
                    }*/
                    is ContentType.CentroSingularContent -> CentresSingularsScreen(navController)
                    is ContentType.InstitutoInvestigation -> InstitutesScreen(navController)
                    is ContentType.MinervaContent -> MinervaScreen()

                    else -> Text("screen non atopado")
                }
            }
        }

        listSingulars != null -> {

            Box(modifier = Modifier.fillMaxSize()) {
                when (listSingulars.contentType) {
                    is ContentType.CIQUS -> CiqusScreen(
                        listState,
                        navController,
                    )

                    is ContentType.CIMUS -> CimusScreen(
                        listState,
                        navController,
                    )

                    is ContentType.CITIUS -> CitiusScreen(
                        listState,
                        navController,
                    )

                    is ContentType.CRETUS -> CretusScreen(
                        listState,
                        navController,
                    )

                    is ContentType.IGFAE -> IgfaeScreen(
                        listState,
                        navController,
                    )

                    is ContentType.IDIS -> IdisScreen(listState, navController)
                    else -> Text("screen non atopado")
                }
            }
        }

        listInstitus != null -> {
            Box(modifier = Modifier.fillMaxSize()) {
                when (listInstitus.contentType) {
                    is ContentType.IHUS -> IhusScreen(
                        listState,
                        navController
                    )

                    is ContentType.IDEGA -> IdegaScreen()

                    is ContentType.ICE -> IceScreen(
                        listState,
                        navController,
                    )

                    is ContentType.INCIFOR -> InciforScreen(
                        listState,
                        navController,
                    )

                    is ContentType.IMATUS -> ImatusScreen(
                        listState,
                        navController
                    )

                    is ContentType.ILG -> IlgScreen(
                        listState,
                        navController,
                    )

                    is ContentType.IARCUS -> IarcusScreen(
                        listState,
                        navController
                    )

                    is ContentType.IPSIUS -> IpsiusScreen(
                        listState,
                        navController
                    )

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
                    is ContentType.Institutos -> {

                        InstitutesScreen(navController)
                    }

                    is ContentType.CentrosSingulares -> CentresSingularsScreen(navController)

                    else -> Text("screen non atopado")
                }
            }
        }
    }

}