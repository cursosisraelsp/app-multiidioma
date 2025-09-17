package com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen1.contentIhusMiniScreen1

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent

@Composable
fun contentIhusMiniScreen1Box3() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 50.dp, top = 20.dp),
        horizontalAlignment = Alignment.Start
    ) {
        LineVerticalComponent(
            contentAlignment = Alignment.TopStart
        )
    }

}