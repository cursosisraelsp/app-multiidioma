package com.example.multiidioma.ui.screens.centros.cretus_andre.cretusMiniScreens.cretusMiniScreen8


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.screens.centros.cretus_andre.valorFiguraCretus0
import com.example.multiidioma.ui.screens.centros.cretus_andre.valorFiguraCretus1
import com.example.multiidioma.ui.screens.centros.cretus_andre.valorFiguraCretus2
import com.example.multiidioma.ui.screens.centros.cretus_andre.valorFiguraCretus3
import com.example.multiidioma.ui.screens.centros.cretus_andre.valorFiguraCretus4
import com.example.multiidioma.ui.screens.centros.cretus_andre.valorFiguraCretus5
import com.example.multiidioma.ui.screens.centros.cretus_andre.valorFiguraCretus6
import com.example.multiidioma.ui.screens.centros.cretus_andre.valorFiguraCretus7


@Composable
fun CretusMiniScreen8(
    data: MiniScreenData,
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF66AAD1))
    ) {
        NavigationFiguresComponent(valorFiguraCretus0, navController)
        NavigationFiguresComponent(valorFiguraCretus1, navController)
        NavigationFiguresComponent(valorFiguraCretus2, navController)
        NavigationFiguresComponent(valorFiguraCretus3, navController)
        NavigationFiguresComponent(valorFiguraCretus4, navController)
        NavigationFiguresComponent(valorFiguraCretus5, navController)
        NavigationFiguresComponent(valorFiguraCretus6, navController)
        NavigationFiguresComponent(valorFiguraCretus7, navController)
    }
}




