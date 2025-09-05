package com.example.multiidioma.navegacion

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.multiidioma.utils.BottomBarUtils
import com.example.multiidioma.utils.TopBarUtils
import com.example.multiidioma.viewmodel.LanguageViewModel

@Composable
fun ScaffoldApp( topBarVisible: Boolean,bottomBarVisible: Boolean,languageViewModel: LanguageViewModel,listState: LazyListState){
    val navController = rememberNavController()

    Scaffold(
        topBar = { TopBarUtils(topBarVisible= topBarVisible, navController= navController) },
        bottomBar = { BottomBarUtils(bottomBarVisible = bottomBarVisible,navController = navController) }
    ) { padding ->
        NavHostApp(
            navController = navController,
            modifier = Modifier.padding(padding),
            languageViewModel = languageViewModel,
            listState = listState
        )
    }
}