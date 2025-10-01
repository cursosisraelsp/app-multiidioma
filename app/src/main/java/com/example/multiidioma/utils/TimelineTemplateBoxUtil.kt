package com.example.multiidioma.utils


import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Shapes.CircleLineComponent
import com.example.multiidioma.utils.inciforUtils.CircleLineTimelineUtil


@Composable
fun TimelineTemplateBoxUtil(
    data: MiniScreenData,
    index: Int,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
    ) {
        // Columna de texto (más ancha)
        Column(
            modifier = Modifier
                .weight(1f) // más ancho que la columna del círculo
        ) {
            TextDisplayMedium(
                data,
                index = index,
                color = Color(0xFF32627E)
            )
            TextBodyMedium(
                data,
                index = index + 1,
                color = Color.Black
            )
        }
        // Columna del círculo (más estrecha)
        Column(
            modifier = Modifier
                .weight(0.5f)
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            CircleLineTimelineUtil(color = Color.Black)
        }
    }
}
