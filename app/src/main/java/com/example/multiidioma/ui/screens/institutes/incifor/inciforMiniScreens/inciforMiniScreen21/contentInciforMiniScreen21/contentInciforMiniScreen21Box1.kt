package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen21.contentInciforMiniScreen21

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent


@Composable
fun contentInciforMiniScreen21Box1(data: MiniScreenData) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.3f)
    ) {
        LineVerticalComponent()
    }

}


