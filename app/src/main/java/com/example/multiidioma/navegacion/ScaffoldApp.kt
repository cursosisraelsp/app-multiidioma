package com.example.multiidioma.navegacion

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
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
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.multiidioma.data.CONDICIONS
import com.example.multiidioma.data.Destination
import com.example.multiidioma.utils.BottomBarUtils
import com.example.multiidioma.utils.TopBarUtils
import com.example.multiidioma.viewmodel.LanguageViewModel
import kotlinx.coroutines.launch
import androidx.compose.ui.unit.LayoutDirection


@Composable
fun ScaffoldApp( topBarVisible: Boolean,bottomBarVisible: Boolean,languageViewModel: LanguageViewModel,listState: LazyListState){
    val navController = rememberNavController()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val condicions = CONDICIONS()
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {

            if(condicions.CondicionCentrosSingulares(navController) && drawerState.isOpen){
                ModalDrawerSheet {
                    Text(text = "CENTROS SINGULARES", modifier = Modifier.padding(16.dp))
                    Text(
                        text = "CIQUS",
                        modifier = Modifier
                            .padding(16.dp)
                            .clickable {
                                navController.navigate(Destination.Ciqus.route)
                                scope.launch { drawerState.close() }

                            }
                    )
                    /*
                    Text(
                        text = "CIMUS",
                        modifier = Modifier
                            .padding(16.dp)
                            .clickable {
                                navController.navigate(Destination.Cimus.route)
                                scope.launch { drawerState.close() }

                            }
                    )*/
                    Text(
                        text = "CITIUS",
                        modifier = Modifier
                            .padding(16.dp)
                            .clickable {
                                navController.navigate(Destination.Citius.route)
                                scope.launch { drawerState.close() }

                            }
                    )
                    Text(
                        text = "CRETUS",
                        modifier = Modifier
                            .padding(16.dp)
                            .clickable {
                                navController.navigate(Destination.Cretus.route)
                                scope.launch { drawerState.close() }

                            }
                    )
                    Text(
                        text = "IGFAE",
                        modifier = Modifier
                            .padding(16.dp)
                            .clickable {
                                navController.navigate(Destination.Igfae.route)
                                scope.launch { drawerState.close() }

                            }
                    )

                }
            }
            if(condicions.CondicionInstitutos(navController) && drawerState.isOpen){
                ModalDrawerSheet {
                    Text(text = "INSTITUTOS DE INVESTIGACIÓN", modifier = Modifier.padding(16.dp))
                    Text(
                        text = "IHUS",
                        modifier = Modifier
                            .padding(16.dp)
                            .clickable {
                                navController.navigate(Destination.Ihus.route)
                                scope.launch { drawerState.close() }

                            }
                    )

                    Text(
                        text = "IDEGA",
                        modifier = Modifier
                            .padding(16.dp)
                            .clickable {
                                navController.navigate(Destination.Idega.route)
                                scope.launch { drawerState.close() }

                            }
                    )
                    Text(
                        text = "ICE",
                        modifier = Modifier
                            .padding(16.dp)
                            .clickable {
                                navController.navigate(Destination.Ice.route)
                                scope.launch { drawerState.close() }

                            }
                    )
                    Text(
                        text = "INCIFOR",
                        modifier = Modifier
                            .padding(16.dp)
                            .clickable {
                                navController.navigate(Destination.Incifor.route)
                                scope.launch { drawerState.close() }

                            }
                    )
                    Text(
                        text = "IMATUS",
                        modifier = Modifier
                            .padding(16.dp)
                            .clickable {
                                navController.navigate(Destination.Imatus.route)
                                scope.launch { drawerState.close() }

                            }
                    )
                    Text(
                        text = "ILG",
                        modifier = Modifier
                            .padding(16.dp)
                            .clickable {
                                navController.navigate(Destination.Ilg.route)
                                scope.launch { drawerState.close() }

                            }
                    )
                }
            }
        }
    )
    {
        Scaffold(
            topBar = { TopBarUtils(topBarVisible = topBarVisible, navController = navController,drawerState,scope = scope) },
            bottomBar = {

                if(condicions.CondicionBottomBarMap(navController)){
                    BottomBarUtils(
                        bottomBarVisible = bottomBarVisible,
                        navController = navController
                    )
                }

            }
        ) { innerPadding  ->
            val navHostModifier = if (condicions.CondicionBottomBarMap(navController)) {
                Modifier.padding(innerPadding)
            } else {
                Modifier.padding(
                    PaddingValues(
                        start = innerPadding.calculateStartPadding(LocalLayoutDirection.current),
                        end = innerPadding.calculateEndPadding(LocalLayoutDirection.current),
                        bottom = innerPadding.calculateBottomPadding()
                        // 👈 omitimos el top
                    )
                )
            }

            NavHostApp(
                navController = navController,
                modifier = navHostModifier,
                languageViewModel = languageViewModel,
                listState = listState
            )

        }
    }
}