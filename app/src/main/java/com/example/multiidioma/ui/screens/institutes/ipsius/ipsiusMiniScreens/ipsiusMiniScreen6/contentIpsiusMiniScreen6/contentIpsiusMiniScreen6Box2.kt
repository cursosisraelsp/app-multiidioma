package com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen6.contentIpsiusMiniScreen6





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
fun contentIpsiusMiniScreen6Box2(data: MiniScreenData){
    val estilosImagen = StyleImages(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 30.dp, bottom =  30.dp),
        alignment = Alignment.BottomCenter
    )
    ReusableImage(data, estilosImagen)
    ReusableImage(data, estilosImagen)
    ReusableImage(data, estilosImagen)
    ReusableImage(data, estilosImagen)
    ReusableImage(data, estilosImagen)
    ReusableImage(data, estilosImagen)
}