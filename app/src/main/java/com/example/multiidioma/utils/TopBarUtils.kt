package com.example.multiidioma.utils

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.multiidioma.R
import com.example.multiidioma.data.CONDICIONS
import com.example.multiidioma.data.CorBottomAndTop

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarUtils(topBarVisible: Boolean, navController: NavHostController){
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
                    titleContentColor = Color.White,
                ),
                title = { Text("INXENIUS",modifier = Modifier.fillMaxWidth(),textAlign = TextAlign.Center) },
                navigationIcon = {
                    if(condicionVision.CondicionBotonAtras(navController)){
                        IconButton(onClick =  {navController.navigateUp()} ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = stringResource(R.string.atras)
                            )
                        }
                    }
                }

            )
        }
    }
}