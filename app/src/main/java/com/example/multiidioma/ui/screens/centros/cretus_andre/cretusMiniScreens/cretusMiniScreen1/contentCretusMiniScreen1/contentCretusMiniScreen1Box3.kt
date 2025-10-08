package com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen1.contentCretusMiniScreen1



import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent

@Composable
fun contentCretusMiniScreen1Box3() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp,top = 20.dp)
    ) {
        LineVerticalComponent(contentAlignment = Alignment.BottomStart)
    }
}