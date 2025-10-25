package com.example.multiidioma.ui.screens.institutes.ihus.ihusMiniScreens.ihusMiniScreen12

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.Podcast
import com.example.multiidioma.ui.components.Templates.LazyRowNoClickScreenTemplate


@Composable
fun IhusMiniScreen12(
    data: MiniScreenData,
    navController: NavController,
    podcasts: List<Podcast>,
    modifier: Modifier = Modifier
) {
    LazyRowNoClickScreenTemplate(
        data,
        navController,
        podcasts,
        "ihus",
        "Laura María Lojo Rodríguez"
    )
}