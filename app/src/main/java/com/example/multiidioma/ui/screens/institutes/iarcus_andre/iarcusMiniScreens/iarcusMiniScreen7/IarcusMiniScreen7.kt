package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen7


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.valorFiguraIarcus0
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.valorFiguraIarcus1
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.valorFiguraIarcus2
import com.example.multiidioma.ui.screens.institutes.iarcus_andre.valorFiguraIarcus3


@Composable
fun IarcusMiniScreen7(
    data: MiniScreenData,
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF66AAD1))
    ) {
        NavigationFiguresComponent(valorFiguraIarcus0, navController)
        NavigationFiguresComponent(valorFiguraIarcus1, navController)
        NavigationFiguresComponent(valorFiguraIarcus2, navController)
        NavigationFiguresComponent(valorFiguraIarcus3, navController)
    }
}




