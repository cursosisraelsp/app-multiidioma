package com.example.multiidioma.ui.screens.institutes.ipsius_andre.ipsiusMiniScreens.ipsiusMiniScreen6.contentIpsiusMiniScreen6





import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import com.example.multiidioma.utils.TextTitleLarge

@Composable
fun contentIpsiusMiniScreen6Box2(data: MiniScreenData, navController: NavController) {
    Column {
        Column(
            modifier = Modifier
                .fillMaxWidth().padding(top = 10.dp, start = 20.dp, end = 20.dp)
        ) {
            TextTitleLarge(data, textAlign = TextAlign.Center)
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF66AAD1))
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
