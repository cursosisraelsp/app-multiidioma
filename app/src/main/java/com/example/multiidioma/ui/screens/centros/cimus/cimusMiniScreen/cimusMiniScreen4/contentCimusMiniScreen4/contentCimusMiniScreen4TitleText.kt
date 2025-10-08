package com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen4.contentCimusMiniScreen4

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.utils.TextTitleMedium

@Composable
fun contentCimusMiniScreen4TitleText(data: MiniScreenData) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 4.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        TextTitleMedium(data, index = 0, textAlign = TextAlign.Center)

        /*TextTitleMedium(data, index = 1) aqui puede que tenga que separar MATERIALES de PARA LA SALUD*/
    }
}

