package com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen8.contentCimusMiniScreen8


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.SpacerText
import com.example.multiidioma.utils.NavigationFigures.NavigationFiguresCimus.NavigationFiguresCimus1
/*import com.example.multiidioma.utils.NavigationFigures.NavigationFiguresCimus*/
import com.example.multiidioma.utils.TextBodyMedium


@Composable
fun contentCimusMiniScreen8Box2(data: MiniScreenData, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 5.dp)
        ) {
            TextBodyMedium(
                data,
                index = 0,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(5.dp))

            TextBodyMedium(
                data,
                index = 1,
                textAlign = TextAlign.Center
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            NavigationFiguresCimus1(navController)
        }
    }
}




