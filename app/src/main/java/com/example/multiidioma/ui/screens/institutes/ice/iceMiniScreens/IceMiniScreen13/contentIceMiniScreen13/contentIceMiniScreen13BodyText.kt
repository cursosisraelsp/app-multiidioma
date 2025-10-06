package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen13.contentIceMiniScreen13

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.utils.TextBodyMedium


@Composable
fun contentIceMiniScreen13BodyText(data: MiniScreenData) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 50.dp, end = 50.dp, bottom = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextBodyMedium(data, index = 2)
    }
}


