package com.example.multiidioma.ui.screens.centros.igfae_andre


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
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen0.IgfaeMiniScreen0
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen1.IgfaeMiniScreen1
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen10a.IgfaeMiniScreen10
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen11.IgfaeMiniScreen11
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen12.IgfaeMiniScreen12
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen13.IgfaeMiniScreen13
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen14.IgfaeMiniScreen14
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen15.IgfaeMiniScreen15
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen16.IgfaeMiniScreen16
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen17.IgfaeMiniScreen17
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen18.IgfaeMiniScreen18
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen19aaa.IgfaeMiniScreen19
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen2.IgfaeMiniScreen2
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen20aaa.IgfaeMiniScreen20
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen21.IgfaeMiniScreen21
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen3.IgfaeMiniScreen3
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen4.IgfaeMiniScreen4
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen5.IgfaeMiniScreen5
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen6.IgfaeMiniScreen6
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen7.IgfaeMiniScreen7
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen8.IgfaeMiniScreen8
import com.example.multiidioma.ui.screens.institutes.Igfae_andre.IgfaeMiniScreens.IgfaeMiniScreen9a.IgfaeMiniScreen9

@Composable
fun IgfaeScreen(listState: LazyListState,navController: NavController) {
    val viewModel: IgfaeViewModel = viewModel()
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
                        0 -> IgfaeMiniScreen0(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        1 -> IgfaeMiniScreen1(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        2 -> IgfaeMiniScreen2(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        3 -> IgfaeMiniScreen3(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        4 -> IgfaeMiniScreen4(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        5 -> IgfaeMiniScreen5(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        6 -> IgfaeMiniScreen6(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        7 -> IgfaeMiniScreen7(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        8 -> IgfaeMiniScreen8(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        9 -> IgfaeMiniScreen9(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        10 -> IgfaeMiniScreen10(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        11 -> IgfaeMiniScreen11(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        12 -> IgfaeMiniScreen12(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        13 -> IgfaeMiniScreen13(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        14 -> IgfaeMiniScreen14(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        15 -> IgfaeMiniScreen15(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        16 -> IgfaeMiniScreen16(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        17 -> IgfaeMiniScreen17(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        18 -> IgfaeMiniScreen18(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        19 -> IgfaeMiniScreen19(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        20 -> IgfaeMiniScreen20(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        21 -> IgfaeMiniScreen21(
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
