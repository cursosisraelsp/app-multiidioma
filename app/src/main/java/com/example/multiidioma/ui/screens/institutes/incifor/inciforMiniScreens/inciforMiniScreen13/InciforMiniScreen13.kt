package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen13

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.screens.institutes.incifor.valorFigura0
import com.example.multiidioma.ui.screens.institutes.incifor.valorFigura1
import com.example.multiidioma.ui.screens.institutes.incifor.valorFigura2
import com.example.multiidioma.ui.screens.institutes.incifor.valorFigura3
import com.example.multiidioma.ui.screens.institutes.incifor.valorFigura4
import com.example.multiidioma.utils.TextBodyMedium
import com.example.multiidioma.utils.inciforUtils.NavigationFiguresIncifor


@Composable
fun InciforMiniScreen13(
    data: MiniScreenData,
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = Modifier
            .background(Color(0xFF4189B5))
    ) {
        Box(
            modifier = Modifier
                .padding(top = 20.dp)
        ) {
            TextBodyMedium(
                data,
                index = 0,
                textAlign = TextAlign.Center
            )
        }
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            NavigationFiguresIncifor(navController)
        }
    }
}

