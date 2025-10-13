package com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen5.contentIceMiniScreen5


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.ui.components.Images.ReusableImage
import com.example.multiidioma.ui.components.SpacerText
/*import com.example.multiidioma.utils.NavigationFIgures.NavigationFiguresIce*/
import com.example.multiidioma.utils.TextBodyMedium


@Composable
fun contentIceMiniScreen5Box2(data: MiniScreenData, navController: NavController) {
    val estilosImagen = StyleImages(
        modifier = Modifier.fillMaxSize(), alignment = Alignment.BottomCenter
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .padding(top = 5.dp, bottom = 10.dp, start = 25.dp, end= 25.dp)
        ) {
            TextBodyMedium(
                data,
                index = 0,
                textAlign = TextAlign.Center
            )
            SpacerText()


            TextBodyMedium(
                data,
                index = 1,
                textAlign = TextAlign.Center
            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {

            ReusableImage(data,estilosImagen)
        }
    }
}



