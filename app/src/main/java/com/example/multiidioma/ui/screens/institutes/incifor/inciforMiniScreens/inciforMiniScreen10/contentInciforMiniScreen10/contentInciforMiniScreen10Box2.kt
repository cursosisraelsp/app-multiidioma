package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen10.contentInciforMiniScreen10


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.ui.components.Text.AppText
import com.example.multiidioma.ui.components.Text.TextWithCircle
import com.example.multiidioma.utils.TextBodyMedium

@Composable
fun contentInciforMiniScreen10Box2(data: MiniScreenData) {

    Column(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.33f)
                .padding(start = 30.dp, end = 50.dp)
                .background(Color.Red),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ) {
            TextWithCircle(data, index = 0)
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(start = 30.dp, end = 50.dp)
                .background(Color.Red),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            TextBodyMedium(data, index = 1)
            SpacerText()
            TextBodyMedium(data, index = 2)
        }
    }
}
