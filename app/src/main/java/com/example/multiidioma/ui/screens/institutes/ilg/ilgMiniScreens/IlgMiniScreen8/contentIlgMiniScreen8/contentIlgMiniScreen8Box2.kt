package com.example.multiidioma.ui.screens.ilg.ilgMiniScreens.IlgMiniScreen8.contentIlgMiniScreen8

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.data.types.StyleText
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.components.Text.AppText
import com.example.multiidioma.ui.screens.institutes.ilg.valorFigura0
import com.example.multiidioma.ui.screens.institutes.ilg.valorFigura1
import com.example.multiidioma.utils.TextBodyMedium

@Composable
fun contentIlgMiniScreen8Box2(data: MiniScreenData, navController: NavController) {
    Column {
        Column (modifier = Modifier
            .fillMaxWidth().padding(start = 50.dp, end = 50.dp)){
            TextBodyMedium(data, textAlign = TextAlign.Center)
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF66AAD1))
        ) {
            NavigationFiguresComponent(valorFigura0, navController)
            NavigationFiguresComponent(valorFigura1, navController)

        }

    }
}