package com.example.multiidioma.ui.screens.centros.citius

import android.os.Build
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

import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen0.CitiusMiniScreen0

import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen10.CitiusMiniScreen10
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen11.CitiusMiniScreen11
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen12.CitiusMiniScreen12
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen13.CitiusMiniScreen13
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen14.CitiusMiniScreen14
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen15.CitiusMiniScreen15
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen16.CitiusMiniScreen16
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen17.CitiusMiniScreen17
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen18.CitiusMiniScreen18
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen19.CitiusMiniScreen19
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen2.CitiusMiniScreen2
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen3.CitiusMiniScreen3
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen4.CitiusMiniScreen4
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen5.CitiusMiniScreen5
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen6.CitiusMiniScreen6
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen7.CitiusMiniScreen7
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen8.CitiusMiniScreen8
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen9.CitiusMiniScreen9
import com.example.multiidioma.ui.screens.citius.citiusMiniScreens.citiusMiniScreen1.CitiusMiniScreen1


@Composable
fun CitiusScreen(
    listState: LazyListState,
    navController: NavController
) {
    val viewModel: CitiusViewModel = viewModel()
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

                        0 -> CitiusMiniScreen0(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        1 -> CitiusMiniScreen1(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        2 -> CitiusMiniScreen2(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        3 -> CitiusMiniScreen3(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        4 -> CitiusMiniScreen4(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        5 -> CitiusMiniScreen5(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        6 -> CitiusMiniScreen6(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        7 -> CitiusMiniScreen7(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        8 -> CitiusMiniScreen8(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        9 -> CitiusMiniScreen9(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        10 -> CitiusMiniScreen10(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        11 -> CitiusMiniScreen11(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        12 -> CitiusMiniScreen12(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        13 -> CitiusMiniScreen13(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        14 -> CitiusMiniScreen14(
                            navController,
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        15 -> CitiusMiniScreen15(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        16 -> CitiusMiniScreen16(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        17 -> CitiusMiniScreen17(
                        )

                        18 -> CitiusMiniScreen18()

                        19 -> CitiusMiniScreen19(
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
