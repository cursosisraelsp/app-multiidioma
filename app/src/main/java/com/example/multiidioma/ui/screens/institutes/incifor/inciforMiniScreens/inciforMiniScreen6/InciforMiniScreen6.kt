package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen6

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TimelineTemplate

@Composable
fun InciforMiniScreen6(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    TimelineTemplate(
        data = data,
        modifier = modifier.fillMaxSize()
    )
}