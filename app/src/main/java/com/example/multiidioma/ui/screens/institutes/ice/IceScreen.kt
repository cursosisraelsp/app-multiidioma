package com.example.multiidioma.ui.screens.institutes.ice

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
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen0.IceMiniScreen0
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen1.IceMiniScreen1
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen14.IceMiniScreen14
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen15.IceMiniScreen15
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen16.IceMiniScreen16
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen17.IceMiniScreen17
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen18.IceMiniScreen18
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen19.IceMiniScreen19
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen2.IceMiniScreen2
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen20.IceMiniScreen20
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen21.IceMiniScreen21
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen22.IceMiniScreen22
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen23.IceMiniScreen23
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen24.IceMiniScreen24
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen25.IceMiniScreen25
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen26.IceMiniScreen26
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen30.IceMiniScreen30
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen4.IceMiniScreen4
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen5.IceMiniScreen5
import com.example.multiidioma.ui.screens.ice.iceMiniScreens.iceMiniScreen6.IceMiniScreen6
import com.example.multiidioma.ui.screens.institutes.ice.iceMiniScreens.iceMiniScreen3.IceMiniScreen3

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun IceScreen(
    listState: LazyListState,
    navController: NavController,
) {
    val viewModel: IceViewModel = viewModel()
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

                        0 -> IceMiniScreen0(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState = listState,
                            itemIndex = index
                        )

                        1 -> IceMiniScreen1(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState = listState,
                            itemIndex = index
                        )

                        2 -> IceMiniScreen2(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        3 -> IceMiniScreen3(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        4 -> IceMiniScreen4(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState = listState,
                            itemIndex = index
                        )

                        5 -> IceMiniScreen5(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        6 -> IceMiniScreen6(
                            data,
                            navController,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        14 -> IceMiniScreen14(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        15 -> IceMiniScreen15(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        16 -> IceMiniScreen16(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        17 -> IceMiniScreen17(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        18 -> IceMiniScreen18(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )


                        19 -> IceMiniScreen19(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        20 -> IceMiniScreen20(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        21 -> IceMiniScreen21(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        22 -> IceMiniScreen22(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        23 -> IceMiniScreen23(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        24 -> IceMiniScreen24(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                        )

                        25 -> IceMiniScreen25(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                        )

                        26 -> IceMiniScreen26(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight(),
                            listState = listState,
                            itemIndex = index


                        )

                        28 -> IceMiniScreen30(
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
