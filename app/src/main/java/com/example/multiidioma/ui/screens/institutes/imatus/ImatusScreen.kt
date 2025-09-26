package com.example.multiidioma.ui.screens.institutes.imatus

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.multiidioma.data.repository.podcastsMultimedia
import com.example.multiidioma.data.types.MiniScreenState
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen2.ImatusMiniScreen2
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen3.ImatusMiniScreen3
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens0.imatusMiniScreen0.ImatusMiniScreen0
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen1.ImatusMiniScreen1
import com.example.multiidioma.ui.screens.institutes.imatus.ImatusMiniScreens.imatusMiniScreen4.ImatusMiniScreen4
import com.example.multiidioma.ui.screens.institutes.imatus.ImatusMiniScreens.imatusMiniScreen5.ImatusMiniScreen5
import com.example.multiidioma.ui.screens.institutes.imatus.ImatusMiniScreens.imatusMiniScreen6.ImatusMiniScreen6
import com.example.multiidioma.ui.screens.institutes.imatus.ImatusMiniScreens.imatusMiniScreen7.ImatusMiniScreen7

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
            LazyColumn(
                state = listState,
                modifier = Modifier.fillMaxSize()
            ) {
                items(screens) { data ->
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
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        5 -> ImatusMiniScreen5(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        6 -> ImatusMiniScreen6(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        7 -> ImatusMiniScreen7(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )


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