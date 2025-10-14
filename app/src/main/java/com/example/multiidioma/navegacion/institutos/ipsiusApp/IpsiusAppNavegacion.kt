package com.example.multiidioma.navegacion.institutos.ipsiusApp



import androidx.compose.foundation.lazy.LazyListState
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.multiidioma.data.Destination
import com.example.multiidioma.ui.screens.institutes.ipsius.IpsiusScreen

fun NavGraphBuilder.IpsiusAppNavegacion(listState: LazyListState, navController: NavController){
   composable( Destination.Ipsius.route,
       arguments = listOf(navArgument("resetScroll") {
           type = NavType.BoolType
           defaultValue = false
       })){backStackEntry ->
       val resetScroll = backStackEntry.arguments?.getBoolean("resetScroll") ?: false
       IpsiusScreen(listState,navController)
   }
}