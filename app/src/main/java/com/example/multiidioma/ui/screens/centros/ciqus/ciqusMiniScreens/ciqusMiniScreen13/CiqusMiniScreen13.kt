package com.example.multiidioma.ui.screens.centros.ciqus.ciqusMiniScreens.ciqusMiniScreen13

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.Podcast
import com.example.multiidioma.ui.components.Templates.LazyRowNoClickScreenTemplate
import com.example.multiidioma.ui.components.Templates.LazyRowScreenTemplate


@Composable
fun CiqusMiniScreen13(
    data: MiniScreenData,
    navController: NavController,
    podcasts: List<Podcast>,
    modifier: Modifier = Modifier
) {
    LazyRowScreenTemplate(
        data,
        navController,
        podcasts,
        "ciqus",
        "Diego Peña",
    )
}