package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.InciforMiniScreen26


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.multiidioma.data.WorkersCenter
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.Podcast
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.InciforMiniScreen26.contentInciforMiniScreen.contentFirstDirectiveImageMiniScreen26
import com.example.multiidioma.ui.screens.institutes.incifor.inciforMiniScreens.InciforMiniScreen26.contentInciforMiniScreen.contentFirstDirectiveTextDescriptionMiniScreen26
import com.example.multiidioma.ui.screens.institutes.incifor.inciforMiniScreens.InciforMiniScreen26.contentInciforMiniScreen.contentSecondDirectiveImageMiniScreen26
import com.example.multiidioma.ui.screens.institutes.incifor.inciforMiniScreens.InciforMiniScreen26.contentInciforMiniScreen.contentSecondDirectiveTextDescriptionMiniScreen26

@Composable
fun InciforMiniScreen26(
    data: MiniScreenData,
    navController: NavController,
    podcasts: List<Podcast>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier =
            Modifier
                .fillMaxSize()
                .background(Color.Blue)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.4f)
                /*.background(Color(0xFF32627E))*/.background(
                    Color.Red
                )

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
        }
        LazyRow(
            modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight(0.4f)
                .background(Color.Green),
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(data.personalResearcher!!) { researcher ->
                Column(
                    modifier = Modifier.clickable {
                        val ruta = "detalles/incifor/${researcher.id}"

                        //navController.navigate(researcher.ruta)
                        navController.navigate(ruta)
                    }
                ) {
                    val ruta = "${researcher.ruta}/incifor/${researcher.id}"

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Gray)
                            .weight(0.3f)
                    ) {
                        Image(
                            painter = painterResource(researcher.foto),
                            contentDescription = "foto",
                            contentScale = ContentScale.FillBounds
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(0.3f)
                            .background(Color.DarkGray)
                    ) {
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


    }
}
