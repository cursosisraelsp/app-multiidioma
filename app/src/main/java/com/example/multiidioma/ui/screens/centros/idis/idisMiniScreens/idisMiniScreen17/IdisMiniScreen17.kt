package com.example.multiidioma.ui.screens.centros.idis.idisMiniScreens.idisMiniScreen17

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.Podcast
import com.example.multiidioma.ui.components.Templates.LazyRowNoClickScreenTemplate
import com.example.multiidioma.ui.components.Templates.LazyRowScreenTemplate


@Composable
fun IdisMiniScreen17(
    data: MiniScreenData,
    navController: NavController,
    podcasts: List<Podcast>,
    modifier: Modifier = Modifier
) {
    LazyRowScreenTemplate(data,navController,podcasts, "idis", "Mª Luz Couce Pico", "Isabel Lista García")
}
