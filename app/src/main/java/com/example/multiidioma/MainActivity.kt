package com.example.multiidioma

//import com.example.multiidioma.ui.components.ParallaxComponent
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.multiidioma.ui.MyApp
import com.example.multiidioma.ui.components.GifComponent
import com.example.multiidioma.ui.components.LottieAutoPlay
import com.example.multiidioma.ui.components.LottieScrollComponent
//import com.example.multiidioma.ui.components.ParallaxEffect
import com.example.multiidioma.ui.components.ParallaxHeader
import com.example.multiidioma.viewmodel.LanguageViewModel

class MainActivity : ComponentActivity() {
    //@RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val languageViewModel: LanguageViewModel = viewModel()
            //MyApp(languageViewModel) // tu función principal de navegación
            //ParallaxHeader()
            //ParallaxEffect()
            /*Column {
                GifComponent(gif = R.drawable.incifor_anim_06)
                GifComponent(gif = R.drawable.incifor_anim_01)
            }*/
            LottieScrollComponent(R.raw.figuritas)
            //LottieAutoPlay(R.raw.figuritas)
        }
    }
}

