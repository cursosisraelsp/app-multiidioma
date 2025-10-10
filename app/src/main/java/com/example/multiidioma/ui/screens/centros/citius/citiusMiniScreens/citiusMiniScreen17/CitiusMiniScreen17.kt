package com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen17

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.multiidioma.data.WorkersCenter
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.Podcast
/*
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.InciforMiniScreen26.contentInciforMiniScreen.contentFirstDirectiveImageMiniScreen26
import com.example.multiidioma.ui.screens.institutes.incifor.inciforMiniScreens.InciforMiniScreen26.contentInciforMiniScreen.contentFirstDirectiveTextDescriptionMiniScreen26
import com.example.multiidioma.ui.screens.institutes.incifor.inciforMiniScreens.InciforMiniScreen26.contentInciforMiniScreen.contentSecondDirectiveImageMiniScreen26
import com.example.multiidioma.ui.screens.institutes.incifor.inciforMiniScreens.InciforMiniScreen26.contentInciforMiniScreen.contentSecondDirectiveTextDescriptionMiniScreen26

@Composable
fun CitiusMiniScreen17(
    data: MiniScreenData,
    navController: NavController,
    podcasts: List<Podcast>,
    modifier: Modifier = Modifier
    ) {
        Box(
            modifier = modifier
                .fillMaxSize()
                .background(Color(0xFF32627E))
        ) {
            val lista = listOf<@Composable ((MiniScreenData) -> Unit)>(
                { contentFirstDirectiveImageMiniScreen26(it) },
                { contentFirstDirectiveTextDescriptionMiniScreen26(it) },
                { contentSecondDirectiveImageMiniScreen26(it) },
                { contentSecondDirectiveTextDescriptionMiniScreen26(it) }
            )
            val elementosLazyRowTemplate = WorkersCenter(
                infoWorkerCenter = lista,
                podcast = podcasts
            )
            Text(text = stringResource(data.bodyParagraphs[0]))

            LazyRow(
                modifier = modifier
                    .fillMaxWidth(),
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(data.personalResearcher!!) { researcher ->
                    Column(
                        modifier = Modifier.clickable {
                            val ruta = "${researcher.ruta}/${researcher.id}"
                            navController.navigate(researcher.ruta)
                        }
                    ) {
                        val ruta = "${researcher.ruta}/${researcher.id}"
                        Image(
                            painter = painterResource(researcher.foto),
                            contentDescription = "foto"
                        )
                        Text("### A ruta é ###")
                        Text("${researcher.ruta}")
                        Text("······O id é····")
                        Text("${researcher.id}")
                        Text("····A RUTA CONCACT")
                        Text("$ruta")
                    }
                }
            }

        }
    }*/
