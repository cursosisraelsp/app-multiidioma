package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen.contentInciforMiniScreen


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.utils.TextBodyMedium
import com.example.multiidioma.utils.TextTitleMedium
import com.example.multiidioma.utils.TextTitleMediumRegular

@Composable
fun contentInciforMiniScreen19Box2(data: MiniScreenData) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp)
    ) {
        SpacerText()

        TextBodyMedium(data, index = 2, textAlign = TextAlign.Center)//parrafo1
        Spacer(modifier = Modifier.height(25.dp))

        LineVerticalComponent(modifier = Modifier.fillMaxHeight(0.3f))
        Spacer(modifier = Modifier.height(25.dp))

        TextTitleMedium(data, index = 0, textAlign = TextAlign.Center) //Titulo 1
        TextTitleMediumRegular(data, index = 1, textAlign = TextAlign.Center) //Titulo 2
        SpacerText()

        TextBodyMedium(data, index = 3, textAlign = TextAlign.Center) //Parrafo2
    }
}