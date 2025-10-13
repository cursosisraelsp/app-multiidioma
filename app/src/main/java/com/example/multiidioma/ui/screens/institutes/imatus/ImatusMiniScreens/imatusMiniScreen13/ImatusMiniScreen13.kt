package com.example.multiidioma.ui.screens.institutes.imatus.ImatusMiniScreens.imatusMiniScreen13

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.multiidioma.data.WorkersCenter
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.Podcast
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.InciforMiniScreen26.contentInciforMiniScreen.contentFirstDirectiveImageMiniScreen26
import com.example.multiidioma.ui.screens.institutes.incifor.inciforMiniScreens.InciforMiniScreen26.contentInciforMiniScreen.contentFirstDirectiveTextDescriptionMiniScreen26
import com.example.multiidioma.ui.screens.institutes.incifor.inciforMiniScreens.InciforMiniScreen26.contentInciforMiniScreen.contentSecondDirectiveImageMiniScreen26
import com.example.multiidioma.ui.screens.institutes.incifor.inciforMiniScreens.InciforMiniScreen26.contentInciforMiniScreen.contentSecondDirectiveTextDescriptionMiniScreen26
import androidx.compose.foundation.lazy.items
import com.example.multiidioma.ui.components.Templates.LazyRowScreenTemplate


@Composable
fun ImatusMiniScreen13(
    data: MiniScreenData,
    navController: NavController,
    podcasts: List<Podcast>,
    modifier: Modifier = Modifier
) {
    LazyRowScreenTemplate(data,navController,podcasts)

}