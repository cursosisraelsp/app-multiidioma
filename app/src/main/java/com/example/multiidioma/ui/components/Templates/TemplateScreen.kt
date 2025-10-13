package com.example.multiidioma.ui.components.Templates

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData

import com.example.multiidioma.data.valoresTemplateScreen


@Composable
fun TemplateScreen(
    data: MiniScreenData,
    BoxWeight: BOX = valoresTemplateScreen,
    Box1: (@Composable (MiniScreenData) -> Unit)? = null,
    Box2: (@Composable (MiniScreenData) -> Unit)? = null,
    Box3: (@Composable (MiniScreenData) -> Unit)? = null
) {
    Column(modifier = Modifier.fillMaxSize()) {

        // Box1
        if (Box1 != null && BoxWeight.Box1 > 0f) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(BoxWeight.Box1)
            ) {
                Box1(data)
            }
        }

        // Box2
        if (Box2 != null && BoxWeight.Box2 > 0f) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(BoxWeight.Box2)
            ) {
                Box2(data)
            }
        }

        // Box3
        if (Box3 != null && BoxWeight.Box3 > 0f) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(BoxWeight.Box3)
            ) {
                Box3(data)
            }
        }
    }
}