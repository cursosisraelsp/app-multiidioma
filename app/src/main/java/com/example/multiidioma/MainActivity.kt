package com.example.multiidioma

//import com.example.multiidioma.ui.components.ParallaxComponent
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
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
            MyApp(languageViewModel) // tu función principal de navegación
            //ParallaxHeader()
            //ParallaxEffect()
            /*Column {
                GifComponent(gif = R.drawable.incifor_anim_06)
                GifComponent(gif = R.drawable.incifor_anim_01)
            }*/
            /*Box(modifier = Modifier.padding(23.dp).border(width = 1.dp, color = Color.Blue)){
                LottieScrollComponent(R.raw.figuritas)
            }*/

            //LottieAutoPlay(R.raw.figuritas)
        }
    }
}

