package com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen8a


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
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFigura0
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFigura1
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFigura2
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFigura3
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFigura4
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFigura5
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFigura6
import com.example.multiidioma.utils.TextBodyMedium


@Composable
fun IpsiusMiniScreen8(
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
            NavigationFiguresComponent(valorFigura0, navController)
            NavigationFiguresComponent(valorFigura1, navController)
            NavigationFiguresComponent(valorFigura2, navController)
            NavigationFiguresComponent(valorFigura3, navController)
            NavigationFiguresComponent(valorFigura4, navController)
            NavigationFiguresComponent(valorFigura5, navController)
            NavigationFiguresComponent(valorFigura6, navController)
        }
    }
}

