package com.example.multiidioma.ui.components.Templates

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData

import com.example.multiidioma.data.valoresTemplateScreen


@Composable
fun TemplateScreen(
    data: MiniScreenData,
    BoxWeight: BOX = valoresTemplateScreen,
    Box1: @Composable (MiniScreenData) -> Unit = {},
    Box2: @Composable (MiniScreenData) -> Unit = {},
    Box3: @Composable (MiniScreenData) -> Unit = {}
) {
    Column(modifier = Modifier.fillMaxSize()) {

        Box(
            modifier = Modifier
                //.width(175.dp).border(width = 1.dp, color = Color.Black)
                .fillMaxWidth()
                //.height(150.dp)
                .weight(BoxWeight.Box1)// se llo poño quítase
        ) {

            Box1(data)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
               // .weight(BoxWeight.Box2)
        ) {
            Box2(data)
        }
        Box(
            modifier = Modifier
                //.width(175.dp)
                .fillMaxWidth()//.border(width = 1.dp, color = Color.Red)
                //.height(50.dp)
                .weight(BoxWeight.Box3)
        ) {
            Box3(data)
        }
    }
}