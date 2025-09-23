package com.example.multiidioma

//import com.example.multiidioma.ui.components.ParallaxComponent
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.multiidioma.ui.MyApp
import com.example.multiidioma.ui.theme.MultiidiomaTheme
import com.example.multiidioma.viewmodel.LanguageViewModel

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MultiidiomaTheme {
                val languageViewModel: LanguageViewModel = viewModel()
                MyApp(languageViewModel)
            }
        }
    }
}