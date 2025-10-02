package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen0.contentInciforMiniScreen0

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.utils.TextBodyMedium

@Composable
fun contentInciforMiniScreen0Box2(data: MiniScreenData,offset: Int) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp),
        ) {
        Box(modifier = Modifier.graphicsLayer {
            translationY = offset * 0.3f
        }) {
            TextBodyMedium(data, textAlign = TextAlign.Center)
        }
    }
}


