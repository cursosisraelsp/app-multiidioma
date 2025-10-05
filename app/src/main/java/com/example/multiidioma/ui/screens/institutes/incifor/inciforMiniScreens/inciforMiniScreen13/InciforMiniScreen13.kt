package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen13


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.screens.institutes.incifor.valorFigura0
import com.example.multiidioma.ui.screens.institutes.incifor.valorFigura1
import com.example.multiidioma.ui.screens.institutes.incifor.valorFigura2
import com.example.multiidioma.ui.screens.institutes.incifor.valorFigura3
import com.example.multiidioma.ui.screens.institutes.incifor.valorFigura4


@Composable
fun InciforMiniScreen13(
    modifier: Modifier = Modifier,
    navController: NavController
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        NavigationFiguresComponent(valorFigura0,navController)
        NavigationFiguresComponent(valorFigura1,navController)
        NavigationFiguresComponent(valorFigura2,navController)
        NavigationFiguresComponent(valorFigura3,navController)
        NavigationFiguresComponent(valorFigura4,navController)


    }
}



