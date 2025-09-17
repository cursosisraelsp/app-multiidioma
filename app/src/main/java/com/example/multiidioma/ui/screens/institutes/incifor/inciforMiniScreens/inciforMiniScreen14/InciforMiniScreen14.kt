package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen14

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.components.VideoScreen
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen14.contentInciforMiniScreen14.contentInciforMiniScreen14BodyText
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen14.contentInciforMiniScreen14.contentInciforMiniScreen14CircleImage
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen14.contentInciforMiniScreen14.contentInciforMiniScreen14TitleText
import com.example.multiidioma.R
import androidx.compose.material3.Scaffold
import com.example.multiidioma.ui.theme.MultiidiomaTheme

@Composable
fun InciforMiniScreen14(
    navController: NavController,
    // pantalla
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF4189B5))
    ) {
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            VideoScreen(
                videoId = "paWE-GvDO1c",
                modifier = Modifier
                    .fillMaxSize()
                    .aspectRatio(9f / 16f)
            )
        }
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            TemplateCircleScreen(
                navController = navController,
                data = data,
                CircleImage = { contentInciforMiniScreen14CircleImage(it) },
                TitleText = { contentInciforMiniScreen14TitleText(it) },
                BodyText = { contentInciforMiniScreen14BodyText(it) }
            )
        }
    }
}
/*
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun InciforMiniScreen14Preview() {
    val navController = rememberNavController()

    // Datos de ejemplo usando IDs de strings
    val fakeData = MiniScreenData(
        id = 14,
        bodyParagraphs = listOf(
            R.string.II_INCIFOR_miniscreen_14_title0,    // Puedes usar el primer párrafo como título
            R.string.II_INCIFOR_miniscreen_14_title1,
            R.string.II_INCIFOR_miniscreen_14_paragraph0
        ),
        imageRes = null // null para mostrar placeholder
    )
    MultiidiomaTheme {
        Scaffold {
            InciforMiniScreen14(
                navController = navController,
                data = fakeData,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}*/
