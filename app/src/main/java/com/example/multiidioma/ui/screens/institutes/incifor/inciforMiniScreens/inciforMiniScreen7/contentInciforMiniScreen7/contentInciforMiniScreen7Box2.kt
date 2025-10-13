package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen7.contentInciforMiniScreen7

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.utils.TextBodyMedium

@Composable
fun contentInciforMiniScreen7Box2(data: MiniScreenData) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                start = 30.dp, end = 30.dp, top = 15.dp,)
    ) {
        TextBodyMedium(data, index = 0, color = Color.Black, textAlign = TextAlign.End)

        SpacerText()

        TextBodyMedium(data, index = 1, color = Color.Black, textAlign = TextAlign.End)
    }
}
