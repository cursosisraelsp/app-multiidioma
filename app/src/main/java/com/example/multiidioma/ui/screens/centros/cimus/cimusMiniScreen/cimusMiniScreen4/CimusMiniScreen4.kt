package com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.utils.cimusUtils.CimusTemplateScreen1


@Composable
fun CimusMiniScreen4(
    data: MiniScreenData,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF66AAD1))
    ) {
        Box(
            modifier = modifier
                .fillMaxSize()
        ) {
        }
        CimusTemplateScreen1(data)
    }
}

