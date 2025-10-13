package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen9.contentInciforMiniScreen9

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.utils.TextBodyMedium

@Composable
fun contentInciforMiniScreen9Box2(data: MiniScreenData,
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 25.dp, end = 25.dp, top = 20.dp, bottom = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextBodyMedium(data, color = Color.Black)
    }
}