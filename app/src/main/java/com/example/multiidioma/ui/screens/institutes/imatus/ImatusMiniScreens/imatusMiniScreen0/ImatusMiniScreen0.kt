package com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen0


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.BOX
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.components.Templates.TemplateScreen
import com.example.multiidioma.ui.components.VideoScreen
import com.example.multiidioma.ui.components.VimeoWebViewComponent
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen0.contentImatusMiniScreen0.contentImatusMiniScreen0Box2
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen0.contentImatusMiniScreen0.contentImatusMiniScreen0Box3

@Composable
fun ImatusMiniScreen0(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF32627E))
    ) {
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
            VimeoWebViewComponent(identificador = "1124127663", width = "425px", height = "800px")
        }

        TemplateScreen(
            BoxWeight = BOX(Box1 = 0.3f, Box2 = 0.5f, Box3 = 0.2f),
            data = data,
            Box2 = { contentImatusMiniScreen0Box2(it) },
            Box3 = { contentImatusMiniScreen0Box3() })
    }
}




