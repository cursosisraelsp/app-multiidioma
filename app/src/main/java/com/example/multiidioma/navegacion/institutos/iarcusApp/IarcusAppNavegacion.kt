package com.example.multiidioma.navegacion.iarcusApp



import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination

fun NavGraphBuilder.IarcusAppNavegacion(){
    composable (Destination.Cretus.route) {
        IarcusScreen(listState,NavController)
    }
}