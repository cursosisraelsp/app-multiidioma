package com.example.multiidioma.data

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

class CONDICIONS {
    @Composable
    fun CondicionTopBar(navController: NavHostController) : Boolean{
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        return (currentRoute != "splash")
    }
    @Composable
    fun CondicionBottomBar(currentRoute: String?) : Boolean{


        return (currentRoute != "splash")
    }

    @Composable
    fun CondicionBotonAtras(navController: NavHostController) : Boolean{
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        return (currentRoute != "splash" && currentRoute != "home")
    }
}