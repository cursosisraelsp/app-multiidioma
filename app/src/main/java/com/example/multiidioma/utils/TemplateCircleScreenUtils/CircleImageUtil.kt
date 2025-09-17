package com.example.multiidioma.utils.TemplateCircleScreenUtils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import androidx.compose.ui.unit.dp
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp

@Composable
fun CircleImageUtil(
    data: MiniScreenData,
    CircleImage: @Composable (MiniScreenData) -> Unit = {}
) {
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp
    val circleSize = screenWidth * 0.3f
    val offsetX = -circleSize / 2

    Box(
        modifier = Modifier
            .fillMaxHeight()
            .wrapContentWidth() // Box se ajusta al contenido
            .offset(x = offsetX),
        contentAlignment = Alignment.CenterStart
    ) {
        Box(modifier = Modifier.size(circleSize)) {
            CircleImage(data)
        }
    }
}