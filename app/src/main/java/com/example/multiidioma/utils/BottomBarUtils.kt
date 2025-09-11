package com.example.multiidioma.utils

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.multiidioma.data.CONDICIONS
import com.example.multiidioma.data.CorBottomAndTop
import com.example.multiidioma.data.Destination
import com.example.multiidioma.navegacion.componentes.BottomBarItem
import com.example.multiidioma.navegacion.componentes.ToggableIconButton
import com.example.multiidioma.utils.imaxes.TopEllipticalShape

@Composable
fun BottomBarUtils(bottomBarVisible : Boolean,navController: NavHostController){
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    val condicionVision = CONDICIONS()
    if (condicionVision.CondicionBottomBar(currentRoute)) {
        AnimatedVisibility(
            visible = bottomBarVisible,
            enter = slideInVertically(initialOffsetY = { it }),
            exit = slideOutVertically(targetOffsetY = { it })
        ) {
            BottomAppBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(156.dp)
                    .clip(TopEllipticalShape()),
                containerColor = CorBottomAndTop,
                contentColor = Color.White,
            ) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    BottomBarItem(
                        navController = navController,
                        imageVector = Icons.Default.Home,
                        ruta = Destination.Home, // Asumiendo que HomeDestination tiene la ruta
                        label = "Home",
                        isSelected = currentRoute == Destination.Home.route
                    )
                    BottomBarItem(
                        navController = navController,
                        imageVector = Icons.Default.Warning,
                        ruta = Destination.Cimus, // Asumiendo que HomeDestination tiene la ruta
                        label = "Cimus",
                        isSelected = currentRoute == Destination.Cimus.route
                    )
                    Text("ruta es $currentRoute")
                    // Agrega más BottomBarItem para otras rutas
                    BottomBarItem(
                        navController = navController,
                        imageVector = Icons.Default.Settings,
                        ruta = Destination.Settings, // Asumiendo que HomeDestination tiene la ruta
                        label = "Settings",
                        isSelected = currentRoute == Destination.Settings.route
                    )

                }

            }
        }
    }
}