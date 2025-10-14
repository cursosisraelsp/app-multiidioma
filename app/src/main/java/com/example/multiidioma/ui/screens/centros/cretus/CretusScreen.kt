package com.example.multiidioma.ui.screens.centros.cretus


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
import com.example.multiidioma.data.types.MiniScreenState
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen0a.CretusMiniScreen0
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen1.CretusMiniScreen1
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen10a.CretusMiniScreen10
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen11a.CretusMiniScreen11
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen12a.CretusMiniScreen12
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen13a.CretusMiniScreen13
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen14a.CretusMiniScreen14
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen15a.CretusMiniScreen15
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen16a.CretusMiniScreen16
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen17.CretusMiniScreen17
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen18.CretusMiniScreen18
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen19.CretusMiniScreen19
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen2.CretusMiniScreen2
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen20.CretusMiniScreen20
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen21.CretusMiniScreen21
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen22.CretusMiniScreen22
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen23i.CretusMiniScreen23
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen24i.CretusMiniScreen24
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen25i.CretusMiniScreen25
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen26i.CretusMiniScreen26
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen27i.CretusMiniScreen27
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen28i.CretusMiniScreen28
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen29i.CretusMiniScreen29
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen3.CretusMiniScreen3
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen30i.CretusMiniScreen30
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen31i.CretusMiniScreen31
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen32i.CretusMiniScreen32
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen33i.CretusMiniScreen33
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen34i.CretusMiniScreen34
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen35i.CretusMiniScreen35
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen36www.CretusMiniScreen36
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen4a.CretusMiniScreen4
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen5.CretusMiniScreen5
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen6.CretusMiniScreen6
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen7.CretusMiniScreen7
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen8.CretusMiniScreen8
import com.example.multiidioma.ui.screens.centros.cretus.cretusMiniScreens.cretusMiniScreen9a.CretusMiniScreen9
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusViewModel


@Composable
fun CretusScreen(listState: LazyListState, navController: NavController) {
    val viewModel: CretusViewModel = viewModel()
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
                        0 -> CretusMiniScreen0(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        1 -> CretusMiniScreen1(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        2 -> CretusMiniScreen2(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        3 -> CretusMiniScreen3(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        4 -> CretusMiniScreen4(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        5 -> CretusMiniScreen5(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        6 -> CretusMiniScreen6(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        7 -> CretusMiniScreen7(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        8 -> CretusMiniScreen8(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        9 -> CretusMiniScreen9(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        10 -> CretusMiniScreen10(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        11 -> CretusMiniScreen11(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        12 -> CretusMiniScreen12(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        13 -> CretusMiniScreen13(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        14 -> CretusMiniScreen14(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        15 -> CretusMiniScreen15(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        16 -> CretusMiniScreen16(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        17 -> CretusMiniScreen17(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        18 -> CretusMiniScreen18(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        19 -> CretusMiniScreen19(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        20 -> CretusMiniScreen20(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        21 -> CretusMiniScreen21(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        22 -> CretusMiniScreen22(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        23 -> CretusMiniScreen23(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        24 -> CretusMiniScreen24(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        25 -> CretusMiniScreen25(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        26 -> CretusMiniScreen26(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        27 -> CretusMiniScreen27(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        28 -> CretusMiniScreen28(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        29 -> CretusMiniScreen29(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        30 -> CretusMiniScreen30(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        31 -> CretusMiniScreen31(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        32 -> CretusMiniScreen32(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        33 -> CretusMiniScreen33(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        34 -> CretusMiniScreen34(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        35 -> CretusMiniScreen35(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        36 -> CretusMiniScreen36(
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
