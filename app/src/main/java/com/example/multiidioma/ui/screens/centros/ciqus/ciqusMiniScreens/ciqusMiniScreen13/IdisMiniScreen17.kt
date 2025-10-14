package com.example.multiidioma.ui.screens.centros.ciqus.ciqusMiniScreens.ciqusMiniScreen13

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.Podcast
import com.example.multiidioma.ui.components.Templates.LazyRowTemplateScreen
import com.example.multiidioma.ui.screens.centros.ciqus.ciqusMiniScreens.ciqusMiniScreen13.contentCiqusMiniScreen.contentFirstDirectiveImageMiniScreen13
import com.example.multiidioma.ui.screens.centros.ciqus.ciqusMiniScreens.ciqusMiniScreen13.contentCiqusMiniScreen.contentFirstDirectiveTextDescriptionMiniScreen13
import com.example.multiidioma.ui.screens.centros.ciqus.ciqusMiniScreens.ciqusMiniScreen13.contentCiqusMiniScreen.contentSecondDirectiveImageMiniScreen13
import com.example.multiidioma.ui.screens.centros.ciqus.ciqusMiniScreens.ciqusMiniScreen13.contentCiqusMiniScreen.contentSecondDirectiveTextDescriptionMiniScreen13
import com.example.multiidioma.ui.screens.centros.idis.idisMiniScreens.idisMiniScreen17.contentIdisMiniScreen.contentFirstDirectiveImageMiniScreen17
import com.example.multiidioma.ui.screens.centros.idis.idisMiniScreens.idisMiniScreen17.contentIdisMiniScreen.contentFirstDirectiveTextDescriptionMiniScreen17
import com.example.multiidioma.ui.screens.centros.idis.idisMiniScreens.idisMiniScreen17.contentIdisMiniScreen.contentSecondDirectiveTextDescriptionMiniScreen17
import com.example.multiidioma.ui.screens.centros.idis.idissMiniScreens.idisMiniScreen17.contentIdisMiniScreen.contentSecondDirectiveImageMiniScreen17


@Composable
fun CiqusMiniScreen13(
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
        LazyRowTemplateScreen(
            data = data,
            navController = navController,
            podcasts = podcasts,
            FirstDirectiveImage = { contentFirstDirectiveImageMiniScreen13(it) },
            FirstDirectiveDescriptionText = { contentFirstDirectiveTextDescriptionMiniScreen13(it) },
            SecondDirectiveImage = { contentSecondDirectiveImageMiniScreen13(it) },
            SecondDirectiveDescriptionText = { contentSecondDirectiveTextDescriptionMiniScreen13(it) },
        )


    }
}