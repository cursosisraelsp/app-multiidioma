package com.example.multiidioma.ui.components.Templates

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.ui.components.Shapes.LineCircleComponent

import com.example.multiidioma.ui.components.Text.TextBodyMedium


@Composable
fun ScrollingEndScreenTemplate(data: MiniScreenData, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
    ) {
        LineCircleComponent()

        val estilosTextos = StyleText(
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Start,
            color = Color.White

        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp, end = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            TextBodyMedium(data, estilosTextos, index = 0)
        }
        Button(
            onClick = {},
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF18325))
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.4f)
                    .fillMaxHeight(0.1f)

            ) {
                TextBodyMedium(data, estilosTextos, index = 1)
            }
        }
    }
}
