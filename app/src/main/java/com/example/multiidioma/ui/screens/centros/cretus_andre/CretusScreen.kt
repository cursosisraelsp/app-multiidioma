package com.example.multiidioma.ui.screens.centros.cretus_andre


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
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen0.CretusMiniScreen0
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen1.CretusMiniScreen1
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen10a.CretusMiniScreen10
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen11.CretusMiniScreen11
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen12.CretusMiniScreen12
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen13.CretusMiniScreen13
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen14.CretusMiniScreen14
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen15.CretusMiniScreen15
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen16.CretusMiniScreen16
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen17.CretusMiniScreen17
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen18.CretusMiniScreen18
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen19aaa.CretusMiniScreen19
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen2.CretusMiniScreen2
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen20aaa.CretusMiniScreen20
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen21.CretusMiniScreen21
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen3.CretusMiniScreen3
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen4.CretusMiniScreen4
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen5.CretusMiniScreen5
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen6.CretusMiniScreen6
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen7.CretusMiniScreen7
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen8.CretusMiniScreen8
import com.example.multiidioma.ui.screens.institutes.Cretus_andre.CretusMiniScreens.CretusMiniScreen9a.CretusMiniScreen9

@Composable
fun CretusScreen(listState: LazyListState,navController: NavController) {
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
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        15 -> CretusMiniScreen15(
                            data,

                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        16 -> CretusMiniScreen16(
                            data,
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
