package com.example.multiidioma.navegacion.detailApp

import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.detail.DetailScreen

fun NavGraphBuilder.detailNavGraph(navController: NavHostController,onClose : ()-> Unit,listState: LazyListState){
    composable(
        route = Destination.Detail.route
        ) {
        DetailScreen(
            navController, onClose = onClose,
            listState = listState
        )
    }
}