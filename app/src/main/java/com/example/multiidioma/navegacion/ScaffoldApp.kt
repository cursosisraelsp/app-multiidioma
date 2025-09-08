package com.example.multiidioma.navegacion

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.multiidioma.data.CONDICIONS
import com.example.multiidioma.utils.BottomBarUtils
import com.example.multiidioma.utils.TopBarUtils
import com.example.multiidioma.viewmodel.LanguageViewModel

@Composable
fun ScaffoldApp( topBarVisible: Boolean,bottomBarVisible: Boolean,languageViewModel: LanguageViewModel,listState: LazyListState){
    val navController = rememberNavController()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            val condicions = CONDICIONS()
            if(condicions.CondicionCentrosSingulares(navController) && drawerState.isOpen){
                ModalDrawerSheet {
                    Text("Item centro singular 1", modifier = Modifier.padding(16.dp))
                    Text("Item centro singular 2", modifier = Modifier.padding(16.dp))
                }
            }
            if(condicions.CondicionInstitutos(navController) && drawerState.isOpen){
                ModalDrawerSheet {
                    Text("Item institutos ", modifier = Modifier.padding(16.dp))
                    Text("Item institutos ", modifier = Modifier.padding(16.dp))
                }
            }
        }
    )
    {
        Scaffold(
            topBar = { TopBarUtils(topBarVisible = topBarVisible, navController = navController,drawerState,scope = scope) },
            bottomBar = {
                BottomBarUtils(
                    bottomBarVisible = bottomBarVisible,
                    navController = navController
                )
            }
        ) { padding ->
            NavHostApp(
                navController = navController,
                modifier = Modifier.padding(padding),
                languageViewModel = languageViewModel,
                listState = listState
            )
        }
    }
}