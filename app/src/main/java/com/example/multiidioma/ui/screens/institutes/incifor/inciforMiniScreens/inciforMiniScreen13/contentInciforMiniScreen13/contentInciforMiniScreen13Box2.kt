package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen13.contentInciforMiniScreen13


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.utils.TextBodyMedium
import com.example.multiidioma.utils.inciforUtils.NavigationFiguresIncifor


@Composable
fun contentInciforMiniScreen13Box2(data: MiniScreenData, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
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
            modifier = Modifier
                .fillMaxSize()

        ) {
            NavigationFiguresIncifor(navController)
        }
    }
}



