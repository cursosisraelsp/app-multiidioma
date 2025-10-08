package com.example.multiidioma.ui.screens.centros.cimus

import android.os.Build
import androidx.annotation.RequiresApi
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
import com.example.multiidioma.data.types.MiniScreenState
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen0.CimusMiniScreen0
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen1.CimusMiniScreen1
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen10.CimusMiniScreen10
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen11.CimusMiniScreen11
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen12.CimusMiniScreen12
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen13.CimusMiniScreen13
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen19.CimusMiniScreen19
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen2.CimusMiniScreen2
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen20.CimusMiniScreen20
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen21.CimusMiniScreen21
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen3.CimusMiniScreen3
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen4.CimusMiniScreen4
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen5.CimusMiniScreen5
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen6.CimusMiniScreen6
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen7.CimusMiniScreen7
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen8.CimusMiniScreen8
import com.example.multiidioma.ui.screens.cimus.cimusMiniScreens.cimusMiniScreen9.CimusMiniScreen9

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun CimusScreen(
    listState: LazyListState,
    navController: NavController,
) {
    val viewModel: CimusViewModel = viewModel()
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

                        0 -> CimusMiniScreen0(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState = listState,
                            itemIndex = index
                        )

                        1 -> CimusMiniScreen1(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState = listState,
                            itemIndex = index
                        )

                        2 -> CimusMiniScreen2(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        3 -> CimusMiniScreen3(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState = listState,
                            itemIndex = index
                        )

                        4 -> CimusMiniScreen4(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        5 -> CimusMiniScreen5(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        6 -> CimusMiniScreen6(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState = listState,
                            itemIndex = index

                        )

                        7 -> CimusMiniScreen7(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                        )

                        8 -> CimusMiniScreen8(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        9 -> CimusMiniScreen9(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),


                        )

                        10 -> CimusMiniScreen10(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        11 -> CimusMiniScreen11(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                        )

                        12 -> CimusMiniScreen12(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        13 -> CimusMiniScreen13(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        19 -> CimusMiniScreen19(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        20 -> CimusMiniScreen20(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        21 -> CimusMiniScreen21(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState = listState,
                            itemIndex = index
                        )

                        /*22 -> CimusMiniScreen22(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        23 -> CimusMiniScreen23(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        24 -> CimusMiniScreen24(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState = listState,
                            itemIndex = index
                        )

                        25 -> CimusMiniScreen25(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState = listState,
                            itemIndex = index
                        )
                        *//*26 -> CimusMiniScreen26(
                            data,
                            navController,
                            podcastsMultimedia,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )*//*


                        28 -> CimusMiniScreen28(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
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