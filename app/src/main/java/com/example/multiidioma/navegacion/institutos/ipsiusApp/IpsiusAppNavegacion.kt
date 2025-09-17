package com.example.multiidioma.navegacion.institutos.ipsiusApp

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination

import com.example.multiidioma.ui.screens.ipsius.IpsiusScreen

fun NavGraphBuilder.IpsiusAppNavegacion(){
    composable(Destination.Ipsius.route) {
        IpsiusScreen()
    }
}