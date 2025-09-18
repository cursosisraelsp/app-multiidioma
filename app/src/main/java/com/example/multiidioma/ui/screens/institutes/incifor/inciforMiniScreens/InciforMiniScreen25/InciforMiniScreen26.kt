package com.example.multiidioma.ui.screens.institutes.incifor.inciforMiniScreens.InciforMiniScreen25

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.Podcast
import com.example.multiidioma.ui.components.Templates.LazyRowTemplateScreen


@Composable
fun InciforMiniScreen16(
    navController: NavController,
    podcasts: List<Podcast>,
    modifier: Modifier = Modifier
) {
    LazyRowTemplateScreen(
        navController = navController,
        podcasts = podcasts,
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
    )
}
