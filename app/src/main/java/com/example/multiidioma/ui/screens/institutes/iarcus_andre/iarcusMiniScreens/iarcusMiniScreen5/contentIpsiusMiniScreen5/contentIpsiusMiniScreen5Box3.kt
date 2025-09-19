package com.example.multiidioma.ui.screens.institutes.iarcus_andre.iarcusMiniScreens.iarcusMiniScreen5.contentIpsiusMiniScreen5


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.multiidioma.data.StyleImages
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Images.ReusableImage

@Composable
fun contentIpsiusMiniScreen5Box3(data: MiniScreenData) {
    val estilosImagen = StyleImages(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 30.dp, bottom =  30.dp),
         alignment = Alignment.BottomCenter
    )
    ReusableImage(data, estilosImagen)
}
