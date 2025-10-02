package com.example.multiidioma.navegacion.institutos.ipsiusApp


import IpsiusScreen
import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.multiidioma.data.Destination

fun NavGraphBuilder.IpsiusAppNavegacion(listState: LazyListState, navController: NavController){
   composable( Destination.Ipsius.route){
       IpsiusScreen(listState,navController)
   }
}