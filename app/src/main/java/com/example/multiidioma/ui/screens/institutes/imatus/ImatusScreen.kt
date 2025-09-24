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
import com.example.multiidioma.ui.screens.imatus.ImatusViewModel
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen21.ImatusMiniScreen21
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen0.ImatusMiniScreen0
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen1.ImatusMiniScreen1
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen10.ImatusMiniScreen10
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen11.ImatusMiniScreen11
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen12.ImatusMiniScreen12
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen13.ImatusMiniScreen13
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen14.ImatusMiniScreen14
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen15.ImatusMiniScreen15
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen16.ImatusMiniScreen16
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen17.ImatusMiniScreen17
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen18.ImatusMiniScreen18
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen19.ImatusMiniScreen19
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen2.ImatusMiniScreen2
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen20.ImatusMiniScreen20
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen22.ImatusMiniScreen22
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen23.ImatusMiniScreen23
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen24.ImatusMiniScreen24
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen25.ImatusMiniScreen25
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen3.ImatusMiniScreen3
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen4.ImatusMiniScreen4
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen5.ImatusMiniScreen5
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen6.ImatusMiniScreen6
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen7.ImatusMiniScreen7
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen8.ImatusMiniScreen8
import com.example.multiidioma.ui.screens.imatus.imatusMiniScreens.imatusMiniScreen9.ImatusMiniScreen9
import com.example.multiidioma.ui.screens.institutes.imatus.imatusMiniScreens.ImatusMiniScreen26.ImatusMiniScreen26
import com.example.multiidioma.ui.screens.institutes.imatus.imatusMiniScreens.ImatusMiniScreen27.ImatusMiniScreen27
import com.example.multiidioma.ui.screens.institutes.imatus.imatusMiniScreens.imatusMiniScreen28.ImatusMiniscreen28

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
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        6 -> ImatusMiniScreen6(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        7 -> ImatusMiniScreen7(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        8 -> ImatusMiniScreen8(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        9 -> ImatusMiniScreen9(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        10 -> ImatusMiniScreen10(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        11 -> ImatusMiniScreen11(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        12 -> ImatusMiniScreen12(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        13 -> ImatusMiniScreen13(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        14 -> ImatusMiniScreen14(
                            navController,
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        15 -> ImatusMiniScreen15(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        16 -> ImatusMiniScreen16(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        17 -> ImatusMiniScreen17(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        18 -> ImatusMiniScreen18(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        19 -> ImatusMiniScreen19(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        20 -> ImatusMiniScreen20(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        21 -> ImatusMiniScreen21(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        22 -> ImatusMiniScreen22(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        23 -> ImatusMiniScreen23(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        24 -> ImatusMiniScreen24(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        25 -> ImatusMiniScreen25(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        26 -> ImatusMiniScreen26(
                            data,
                            navController,
                            podcastsMultimedia,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        27 -> ImatusMiniScreen27(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        28 -> ImatusMiniscreen28(
                            data,
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