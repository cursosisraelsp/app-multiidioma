package com.example.multiidioma.ui.screens.detail

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.multiidioma.data.types.ContentType
import com.example.multiidioma.ui.screens.centros.CentresSingularsScreen
import com.example.multiidioma.ui.screens.centros.cimus.CimusScreen
import com.example.multiidioma.ui.screens.centros.ciqus.CiqusScreen
import com.example.multiidioma.ui.screens.centros.citius.CitiusScreen
import com.example.multiidioma.ui.screens.centros.cretus.CretusScreen
import com.example.multiidioma.ui.screens.centros.igfae.IgfaeScreen
import com.example.multiidioma.ui.screens.institutes.InstitutesScreen
import com.example.multiidioma.ui.screens.institutes.ice.IceScreen
import com.example.multiidioma.ui.screens.institutes.idega.IdegaScreen
import com.example.multiidioma.ui.screens.institutes.ihus.IhusScreen
import com.example.multiidioma.ui.screens.institutes.ilg.IlgScreen
import com.example.multiidioma.ui.screens.institutes.imatus.ImatusScreen
import com.example.multiidioma.ui.screens.institutes.incifor.InciforScreen
import com.example.multiidioma.ui.screens.minerva.MinervaScreen
import com.example.multiidioma.ui.screens.multimedia.MultimediaScreen

@Composable
fun DetailScreen(
    navController: NavController,
    detailViewModel: DetailViewModel = viewModel()
){
    val state by detailViewModel.detailScreenState.collectAsState()

    val imaxenClick = state.detailImaxenClick
    val listSingulars = state.detailListSingularsCenters
    val listInstitus = state.detailListInstitus

    when {
        imaxenClick == null && listSingulars == null -> {
            CircularProgressIndicator()
        }

        imaxenClick != null -> {
            Box(modifier = Modifier.fillMaxSize()) {
                when (imaxenClick.contentType) {
                    is ContentType.MultimediaContent -> MultimediaScreen()
                    is ContentType.MinervaContent -> Text(text = "Estou en minerva")
                    is ContentType.MapContent -> Text(text = "Estou en mapa")
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
                    is ContentType.IHUS -> IhusScreen()
                    is ContentType.IDEGA -> IdegaScreen()
                    is ContentType.ICE -> IceScreen()
                    is ContentType.INCIFOR -> InciforScreen()
                    is ContentType.IMATUS -> ImatusScreen()
                    is ContentType.ILG -> IlgScreen()
                    else -> Text("screen non atopado")
                }
            }
        }
    }

}