package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen10.contentInciforMiniScreen10


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.ui.components.Text.TextBodyMedium
import com.example.multiidioma.ui.components.Text.TextWithCircle

@Composable
fun contentInciforMiniScreen10Box2(data: MiniScreenData) {
    val estilosTextos = StyleText(
        style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Start
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 50.dp, end = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        TextWithCircle(data, estilosTextos, index = 0)

        TextBodyMedium(data, estilosTextos, index = 1)

        TextBodyMedium(data, estilosTextos, index = 2)
    }
}
