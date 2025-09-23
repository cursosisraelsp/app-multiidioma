package com.example.multiidioma.ui.screens.institutes.incifor.inciforMiniScreens.InciforMiniScreen27

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.PersonalTemplateScreen

@Composable
fun InciforMiniScreen27(
    data: MiniScreenData,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Box(modifier = Modifier
        .fillMaxSize()) {
        PersonalTemplateScreen(data, navController)
    }
}