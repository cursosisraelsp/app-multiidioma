package com.example.multiidioma.utils.TemplateCircleScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData


@Composable
fun BodyTextCircleTemplateUtil(
    data: MiniScreenData,
    BodyText: @Composable (MiniScreenData) -> Unit = {}
) {


    Column(
        modifier = Modifier
            .padding(start = 100.dp, bottom = 10.dp)

    ) {
        BodyText(data)
    }
}