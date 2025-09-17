package com.example.multiidioma.ui.screens.ipsius


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
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen0.IpsiusMiniScreen0
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen1.IpsiusMiniScreen1
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen10aaa.IpsiusMiniScreen10
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen11aaa.IpsiusMiniScreen11
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen12aaa.IpsiusMiniScreen12
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen13aaa.IpsiusMiniScreen13
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen14.IpsiusMiniScreen14
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen15.IpsiusMiniScreen15
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen16.IpsiusMiniScreen16
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen17.IpsiusMiniScreen17
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen18.IpsiusMiniScreen18
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen19aaa.IpsiusMiniScreen19
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen2.IpsiusMiniScreen2
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen20aaa.IpsiusMiniScreen20
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen21.IpsiusMiniScreen21
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen3.IpsiusMiniScreen3
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen4.IpsiusMiniScreen4
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen5.IpsiusMiniScreen5
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen6.IpsiusMiniScreen6
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen7aaa.IpsiusMiniScreen7
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen8aaa.IpsiusMiniScreen8
import com.example.multiidioma.ui.screens.ipsius.ipsiusMiniScreens.ipsiusMiniScreen9aaa.IpsiusMiniScreen9

@Composable
fun IpsiusScreen(listState: LazyListState,navController: NavController) {
    val viewModel: IpsiusViewModel = viewModel()
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
                        0 -> IpsiusMiniScreen0(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        1 -> IpsiusMiniScreen1(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        2 -> IpsiusMiniScreen2(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        3 -> IpsiusMiniScreen3(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        4 -> IpsiusMiniScreen4(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        5 -> IpsiusMiniScreen5(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        6 -> IpsiusMiniScreen6(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        7 -> IpsiusMiniScreen7(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        8 -> IpsiusMiniScreen8(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        9 -> IpsiusMiniScreen9(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        10 -> IpsiusMiniScreen10(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        11 -> IpsiusMiniScreen11(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        12 -> IpsiusMiniScreen12(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        13 -> IpsiusMiniScreen13(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        14 -> IpsiusMiniScreen14(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        15 -> IpsiusMiniScreen15(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        16 -> IpsiusMiniScreen16(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        17 -> IpsiusMiniScreen17(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        18 -> IpsiusMiniScreen18(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        19 -> IpsiusMiniScreen19(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        20 -> IpsiusMiniScreen20(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        21 -> IpsiusMiniScreen21(
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
