package com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.InciforMiniScreen26



import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.data.types.Podcast
import com.example.multiidioma.ui.components.Templates.LazyRowNoClickScreenTemplate

@Composable
fun InciforMiniScreen26(
    data: MiniScreenData,
    navController: NavController,
    podcasts: List<Podcast>,
    modifier: Modifier = Modifier
) {
    LazyRowNoClickScreenTemplate(data,navController,podcasts, "incifor", "Ana María Bermejo Barrera", "Inés Sánchez Sellero")
}
