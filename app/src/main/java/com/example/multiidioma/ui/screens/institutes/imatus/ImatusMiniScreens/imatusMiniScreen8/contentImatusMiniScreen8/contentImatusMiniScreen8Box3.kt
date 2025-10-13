package com.example.multiidioma.ui.screens.institutes.imatus.ImatusMiniScreens.imatusMiniScreen8.contentImatusMiniScreen8

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.ui.components.Shapes.CircleLineAligmentComponent
import com.example.multiidioma.ui.components.Shapes.CircleLineComponent


@Composable
fun contentImatusMiniScreen8Box3() {
    Box(modifier = Modifier.fillMaxSize().padding(start = 44.dp)) {
        CircleLineAligmentComponent(lineHeight = 300.dp, contentAlignment = Alignment.BottomStart)
    }
}