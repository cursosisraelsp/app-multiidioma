package com.example.multiidioma.utils.cimusUtils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Shapes.LineVerticalComponent
import com.example.multiidioma.utils.TextBodyMedium

@Composable
fun CimusTemplateScreen1(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            verticalAlignment = Alignment.Top
        ) {
            Spacer(modifier = Modifier.width(50.dp)) // empuja el texto
            TextBodyMedium(
                data = data,
                index = 0
            )
        }

        // Contenedor de los bloques
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(start = 24.dp, end = 8.dp, top = 30.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            // Bloque 1
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min)
                    .padding(vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .width(80.dp)
                        .wrapContentHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    CimusImage1()
                    Spacer(Modifier.height(8.dp))
                    LineVerticalComponent()
                }

                Spacer(modifier = Modifier.width(12.dp))

                TextBodyMedium(
                    data = data,
                    index = 1,
                    modifier = Modifier
                        .weight(1f)
                )
            }

            // Bloque 2
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min)
                    .padding(vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .width(80.dp)
                        .wrapContentHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    CimusImage2()
                    LineVerticalComponent()
                }
                Spacer(modifier = Modifier.width(12.dp))

                TextBodyMedium(
                    data = data,
                    index = 2,
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 8.dp)
                )
            }
        }
    }
}