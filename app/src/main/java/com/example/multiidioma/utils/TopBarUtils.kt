package com.example.multiidioma.utils

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.multiidioma.R
import com.example.multiidioma.data.CONDICIONS
import com.example.multiidioma.data.CorBottomAndTop
import com.example.multiidioma.data.whiteColor
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerState
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarUtils(topBarVisible: Boolean, navController: NavHostController, drawerState: DrawerState, scope: CoroutineScope){
    val condicionVision = CONDICIONS()
    if (condicionVision.CondicionTopBar(navController)) {
        AnimatedVisibility(
            visible = topBarVisible,
            enter = slideInVertically(initialOffsetY = { it }),
            exit = slideOutVertically(targetOffsetY = { it })
        ){
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = CorBottomAndTop,
                    titleContentColor = whiteColor,
                ),
                title = { Text("INXENIUS",modifier = Modifier.fillMaxWidth(),textAlign = TextAlign.Center) },
                navigationIcon = {
                    if(condicionVision.CondicionBotonAtras(navController)){
                        IconButton(
                            onClick =  {navController.navigateUp()},

                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = stringResource(R.string.atras),
                                modifier = Modifier.clip(CircleShape).background(color = whiteColor)
                            )
                        }

                    }
                },
                actions = {
                    if(condicionVision.CondicionInstitutos(navController) || condicionVision.CondicionCentrosSingulares(navController)){
                        IconButton(
                            onClick = { scope.launch {
                                //drawerState.open()
                                if (drawerState.isClosed) {
                                    drawerState.open()
                                } else {
                                    drawerState.close()
                                }
                            } }
                        ) {
                            Icon(
                                imageVector = Icons.Default.Menu,
                                contentDescription = "stringResource(R.string.menu)",
                                tint = whiteColor
                            )
                        }
                    }
                }
            )
        }
    }
}