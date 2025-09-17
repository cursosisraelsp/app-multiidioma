package com.example.multiidioma.ui.screens.ihus
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.getValue
import androidx.compose.foundation.lazy.items
import com.example.multiidioma.data.types.MiniScreenState
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen3.IhusMiniScreen3
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen4.IhusMiniScreen4
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen5.IhusMiniScreen5
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.IhusMiniScreen6.IhusMiniScreen6
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen0.IhusMiniScreen0
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen1.IhusMiniScreen1
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen2.IhusMiniScreen2
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen7.IhusMiniScreen7
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen8.IhusMiniScreen8
import com.example.multiidioma.ui.screens.ihus.ihusMiniScreens.ihusMiniScreen9.IhusMiniScreen9

@Composable
fun IhusScreen(listState: LazyListState) {
    val viewModel: IhusViewModel = viewModel()
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
                        0 -> IhusMiniScreen0(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        1 -> IhusMiniScreen1(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        2 -> IhusMiniScreen2(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        3 -> IhusMiniScreen3(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        4 -> IhusMiniScreen4(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        5 -> IhusMiniScreen5(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        6 -> IhusMiniScreen6(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        7 -> IhusMiniScreen7(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        8 -> IhusMiniScreen8(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        9 -> IhusMiniScreen9(
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
