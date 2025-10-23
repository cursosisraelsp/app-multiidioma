package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen15.contentInciforMiniScreen15

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.utils.TextTitleMedium

@Composable
fun contentInciforMiniScreen15TitleText(data: MiniScreenData) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 4.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        TextTitleMedium(data, index = 0)
        TextTitleMedium(data, index = 1)
    }
}

