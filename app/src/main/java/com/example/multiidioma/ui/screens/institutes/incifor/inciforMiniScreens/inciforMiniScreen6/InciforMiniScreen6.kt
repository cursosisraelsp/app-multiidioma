package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen6

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.utils.TextBodyMedium
import com.example.multiidioma.utils.inciforUtils.LeftColumnIncifor6
import com.example.multiidioma.utils.inciforUtils.QuotationMarkIncifor
import com.example.multiidioma.utils.inciforUtils.RightColumnIncifor6

@Composable
fun InciforMiniScreen6(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE5F4F9))
    ) {
        // Columna izquierda
        LeftColumnIncifor6(
            data,
            modifier = Modifier
                .weight(0.65f)
                .fillMaxHeight()
                .padding(start = 50.dp, end = 25.dp)
        )
        // Columna derecha
        RightColumnIncifor6(
            data,
            modifier = Modifier
                .weight(0.35f)
                .fillMaxHeight()
                .padding(end = 25.dp),


        )
    }
}

