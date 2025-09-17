package com.example.multiidioma

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.multiidioma.data.types.MiniScreenData
import com.example.multiidioma.ui.MyApp
import com.example.multiidioma.ui.components.ParallaxComponent

//import com.example.multiidioma.ui.components.ParallaxComponent

import com.example.multiidioma.ui.components.Templates.TemplateCircleScreen
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen14.InciforMiniScreen14
import com.example.multiidioma.ui.screens.mapa.MapScreen
import com.example.multiidioma.ui.theme.MultiidiomaTheme
import com.example.multiidioma.viewmodel.LanguageViewModel

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val languageViewModel: LanguageViewModel = viewModel()
            MyApp(languageViewModel) // tu función principal de navegación
            //ParallaxComponent()

        }
    }
}

