package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen6.contentIlgMiniScreen6

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent


@Composable
fun contentIlgMiniScreen6Box3() {
   Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, top = 20.dp),
       horizontalAlignment = Alignment.Start
   ){
        LineVerticalComponent(modifier = Modifier, contentAlignment = Alignment.TopStart, color = Color.Black)
    }

}