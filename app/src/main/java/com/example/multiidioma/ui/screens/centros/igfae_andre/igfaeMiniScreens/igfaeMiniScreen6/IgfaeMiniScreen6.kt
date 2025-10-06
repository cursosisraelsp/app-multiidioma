package com.example.multiidioma.ui.screens.centros.igfae_andre.igfaeMiniScreens.igfaeMiniScreen6


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.NavigationFiguresComponent
import com.example.multiidioma.ui.screens.centros.igfae_andre.valorFiguraIgfae0
import com.example.multiidioma.ui.screens.centros.igfae_andre.valorFiguraIgfae1
import com.example.multiidioma.ui.screens.centros.igfae_andre.valorFiguraIgfae2
import com.example.multiidioma.ui.screens.centros.igfae_andre.valorFiguraIgfae3
import com.example.multiidioma.ui.screens.centros.igfae_andre.valorFiguraIgfae4
import com.example.multiidioma.ui.screens.centros.igfae_andre.valorFiguraIgfae5
import com.example.multiidioma.ui.screens.centros.igfae_andre.valorFiguraIgfae6
import com.example.multiidioma.ui.screens.centros.igfae_andre.valorFiguraIgfae7


@Composable
fun IgfaeMiniScreen6(
    data: MiniScreenData,
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF66AAD1))
    ) {
        NavigationFiguresComponent(valorFiguraIgfae0, navController)
        NavigationFiguresComponent(valorFiguraIgfae1, navController)
        NavigationFiguresComponent(valorFiguraIgfae2, navController)
        NavigationFiguresComponent(valorFiguraIgfae3, navController)
        NavigationFiguresComponent(valorFiguraIgfae4, navController)
        NavigationFiguresComponent(valorFiguraIgfae5, navController)
        NavigationFiguresComponent(valorFiguraIgfae6, navController)
        NavigationFiguresComponent(valorFiguraIgfae7, navController)
    }
}



