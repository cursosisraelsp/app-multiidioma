package com.example.multiidioma.ui.screens.institutes.iarcus.iarcusMiniScreens.iarcusMiniScreen2.contentMiniScreen2


import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.example.multiidioma.data.types.StyleImages
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Images.ReusableImage


@Composable
fun contentIarcusMiniScreen2Box2(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        alignment = Alignment.BottomCenter
    )
    ReusableImage(data, estilosImagen)

}


