package com.example.multiidioma.utils.inciforUtils

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Shapes.CircleLineComponent
import com.example.multiidioma.utils.TextBodyMedium
import com.example.multiidioma.utils.TextDisplayMedium

@Composable
fun TextBoxInciforScreen6(
    data: MiniScreenData,
    index: Int,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
    ) {

        Column(
            modifier = Modifier
                .weight(1f)
        ) {
            TextDisplayMedium(data, index = index, color = Color(0xFF32627E))
            TextBodyMedium(data, index = index + 1, color = Color.Black)
        }
        Column(
            modifier = Modifier
                .width(40.dp) // ancho fijo
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            CircleLineComponentIncifor6(color = Color.Black)
        }
    }
}