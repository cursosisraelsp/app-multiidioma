package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen5.contentInciforMiniScreen5

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.R
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.GifComponent
import com.example.multiidioma.utils.TextBodyMedium

@Composable
fun contentInciforMiniScreen5Box2(data: MiniScreenData) {

    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.3f)
                .padding(start = 50.dp, end = 50.dp)
        ) {
            TextBodyMedium(data, color = Color.Black)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.4f),
            contentAlignment = Alignment.BottomEnd
        ) {
            GifComponent(gif = R.drawable.incifor_anim_01)

        }
    }
}