package com.example.multiidioma.utils.TemplateCircleScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData


@Composable
fun TitleTextCircleTemplateutil(
    data: MiniScreenData,
    TitleText: @Composable (MiniScreenData) -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(bottom = 10.dp),
        verticalArrangement = Arrangement.Bottom

    ) {
        TitleText(data)
    }
}