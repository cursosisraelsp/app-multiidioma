package com.example.multiidioma.ui.screens.institutes.incifor.inciforMiniScreens.InciforMiniScreen26

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.WorkersCenter
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.Podcast
import com.example.multiidioma.ui.components.Templates.LazyRowTemplateScreen
import com.example.multiidioma.ui.screens.institutes.incifor.inciforMiniScreens.InciforMiniScreen26.contentInciforMiniScreen.contentFirstDirectiveImageMiniScreen26
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
        /*LazyRowTemplateScreen(
            data = data,
            navController = navController,
            podcasts = podcasts,
            FirstDirectiveImage = { contentFirstDirectiveImageMiniScreen26(it) },
            FirstDirectiveDescriptionText = { contentFirstDirectiveTextDescriptionMiniScreen26(it) },
            SecondDirectiveImage = { contentSecondDirectiveImageMiniScreen26(it) },
            SecondDirectiveDescriptionText = { contentSecondDirectiveTextDescriptionMiniScreen26(it) },
        )*/
        LazyRowTemplateScreen(
            navController = navController,
            data = data,
            elementosLazyRowTemplate = elementosLazyRowTemplate,
        )


    }
}