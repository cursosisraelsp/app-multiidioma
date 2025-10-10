package com.example.multiidioma.ui.screens.institutes.imatus

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.multiidioma.data.repository.podcastsMultimedia
import com.example.multiidioma.data.types.MiniScreenState
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen0.ImatusMiniScreen0
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen1.ImatusMiniScreen1
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen2.ImatusMiniScreen2
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen3.ImatusMiniScreen3
import com.example.multiidioma.ui.screens.institutes.imatus.ImatusMiniScreens.imatusMiniScreen4.ImatusMiniScreen4
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen8.ImatusMiniScreen8
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen9.ImatusMiniScreen9
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen10.ImatusMiniScreen10
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen11.ImatusMiniScreen11
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen16.ImatusMiniScreen12
/*import com.example.multiidioma.ui.screens.institutes.imatus.ImatusMiniScreens.imatusMiniScreen13.ImatusMiniScreen13*/

/*
import com.example.multiidioma.ui.screens.institutes.imatus.ImatusMiniScreens.imatusMiniScreen35.ImatusMiniScreen35
*/


@Composable
fun ImatusScreen(
    listState: LazyListState,
    navController: NavController,
) {
    val viewModel: ImatusViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()


    when (uiState) {
        is MiniScreenState.Loading -> {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        }

        is MiniScreenState.Success -> {
            val screens = (uiState as MiniScreenState.Success).screens
            LaunchedEffect(Unit) {
                listState.scrollToItem(0)
            }
            LazyColumn(
                state = listState,
                modifier = Modifier.fillMaxSize()
            ) {
                itemsIndexed(screens) { index, data ->
                    when (data.id) {

                        0 -> ImatusMiniScreen0(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        1 -> ImatusMiniScreen1(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        2 -> ImatusMiniScreen2(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        3 -> ImatusMiniScreen3(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        4 -> ImatusMiniScreen4(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),

                            )

                        8 -> ImatusMiniScreen8(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState = listState,
                            itemIndex = index
                        )

                        9 -> ImatusMiniScreen9(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState = listState,
                            itemIndex = index
                        )

                        10 -> ImatusMiniScreen10(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState = listState,
                            itemIndex = index
                        )

                        11 -> ImatusMiniScreen11(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState = listState,
                            itemIndex = index
                        )

                        12 -> ImatusMiniScreen12(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                        )
                      /*  13 -> ImatusMiniScreen13(
                            data,
                            navController,
                            podcastsMultimedia,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),

                        )*/
                       /* 35 -> ImatusMiniScreen35(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),

                        )*/



                        else -> Text("MiniScreen desconocida")
                    }
                }
            }
        }

        is MiniScreenState.Error -> {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = (uiState as MiniScreenState.Error).message,
                    color = Color.Red
                )
            }
        }
    }

}