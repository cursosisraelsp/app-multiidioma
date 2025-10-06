package com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen6


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
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFiguraIpsius0
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFiguraIpsius1
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFiguraIpsius2
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFiguraIpsius3
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFiguraIpsius4
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFiguraIpsius5
import com.example.multiidioma.ui.screens.institutes.ipsius_andre.valorFiguraIpsius6
import com.example.multiidioma.utils.TextBodyMedium


@Composable
fun IpsiusMiniScreen6(
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
            NavigationFiguresComponent(valorFiguraIpsius0, navController)
            NavigationFiguresComponent(valorFiguraIpsius1, navController)
            NavigationFiguresComponent(valorFiguraIpsius2, navController)
            NavigationFiguresComponent(valorFiguraIpsius3, navController)
            NavigationFiguresComponent(valorFiguraIpsius4, navController)
            NavigationFiguresComponent(valorFiguraIpsius5, navController)
            NavigationFiguresComponent(valorFiguraIpsius6, navController)
        }
    }
}


