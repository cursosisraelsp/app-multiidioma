package com.example.multiidioma

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.unity3d.player.UnityPlayerGameActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LoaderUnityActivityMinimal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val loader = ProgressBar(this).apply {
            isIndeterminate = true
            val size = 150
            layoutParams = FrameLayout.LayoutParams(size, size, Gravity.CENTER)
        }

        val rootLayout = FrameLayout(this)
        rootLayout.addView(loader)
        setContentView(rootLayout)

        // Simula preload de Unity
        lifecycleScope.launch {
            delay(1000) // 1 segundo
            loader.visibility = View.GONE

            // Lanzamos Unity
            val intent = Intent(this@LoaderUnityActivityMinimal, UnityPlayerGameActivity::class.java)
            startActivity(intent)
        }
    }
}
