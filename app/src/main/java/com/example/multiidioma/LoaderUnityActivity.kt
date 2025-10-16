/*package com.example.multiidioma

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.camera.core.CameraSelector
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.core.app.ActivityCompat

import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LoaderUnityActivity : AppCompatActivity() {

    private lateinit var previewView: PreviewView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Layout simple: cámara + loader
        val rootLayout = FrameLayout(this)
        previewView = PreviewView(this)
        rootLayout.addView(previewView, FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.MATCH_PARENT,
            FrameLayout.LayoutParams.MATCH_PARENT
        ))

        // Loader overlay
        val loader = ProgressBar(this).apply {
            isIndeterminate = true
            val size = 150
            layoutParams = FrameLayout.LayoutParams(size, size, Gravity.CENTER)
        }
        rootLayout.addView(loader)

        setContentView(rootLayout)
        // ⚠️ Verificamos permisos antes de iniciar la cámara
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
            != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), 101)
        } else {
            startCameraPreview()
        }
        //startCameraPreview()
        preloadUnity(loader)
    }

    private fun startCameraPreview() {
        val cameraProviderFuture = ProcessCameraProvider.getInstance(this)
        cameraProviderFuture.addListener({
            val cameraProvider = cameraProviderFuture.get()
            val preview = Preview.Builder().build().also {
                it.setSurfaceProvider(previewView.surfaceProvider)
            }
            val cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA
            cameraProvider.unbindAll()
            cameraProvider.bindToLifecycle(this, cameraSelector, preview)
        }, ContextCompat.getMainExecutor(this))
    }

    private fun preloadUnity(loader: ProgressBar) {
        lifecycleScope.launch {
            // Simulamos carga de Unity
            delay(3000) // 3 segundos para el ejemplo

            // Unity listo, removemos loader
            loader.visibility = View.GONE

            // Abrimos Unity
            Log.d("RA_DEBUG", "Lanzando UnityPlayerActivity...")
            val intent = Intent(this@LoaderUnityActivity, com.unity3d.player.UnityPlayerGameActivity::class.java)
            Log.d("RA_DEBUG", "UnityPlayerActivity lanzada")
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            //intent.addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK)
            startActivity(intent)

            //finish()
        }
    }

    // Manejo de permisos runtime
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 101 && grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            startCameraPreview()
        }
    }
}

/*
import androidx.activity.compose.rememberLauncherForActivityResult
import android.Manifest
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.camera.core.CameraSelector
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import kotlinx.coroutines.delay



class LoaderUnityActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AbrirUnityConLoaderPolished()
        }
    }

    @Composable
    fun CameraPreviewFake() {
        val context = LocalContext.current
        val lifecycleOwner = LocalLifecycleOwner.current

        AndroidView(factory = { ctx ->
            val previewView = PreviewView(ctx)

            val cameraProviderFuture = ProcessCameraProvider.getInstance(ctx)
            cameraProviderFuture.addListener({
                val cameraProvider = cameraProviderFuture.get()
                val preview = Preview.Builder().build().apply {
                    setSurfaceProvider(previewView.surfaceProvider)
                }
                val selector = CameraSelector.DEFAULT_BACK_CAMERA
                cameraProvider.unbindAll()
                cameraProvider.bindToLifecycle(lifecycleOwner, selector, preview)
            }, ContextCompat.getMainExecutor(ctx))

            previewView
        }, modifier = Modifier.fillMaxSize())
    }

    @Composable
    fun AbrirUnityConLoaderPolished() {
        val context = LocalContext.current
        var overlayVisible by remember { mutableStateOf(true) }
        var overlayAlpha by remember { mutableStateOf(1f) }

        // Launcher para pedir permiso de cámara
        val launcher = rememberLauncherForActivityResult(
            contract = ActivityResultContracts.RequestPermission(),
            onResult = { granted ->
                if (!granted) {
                    Toast.makeText(context, "Permiso de cámara denegado", Toast.LENGTH_SHORT).show()
                    finish()
                }
            }
        )

        // Pedimos permiso automáticamente
        LaunchedEffect(Unit) {
            launcher.launch(Manifest.permission.CAMERA)
        }

        Box(modifier = Modifier.fillMaxSize()) {
            // Cámara fake
            CameraPreviewFake()

            if (overlayVisible) {
                // Animación de fade
                val animatedAlpha by animateFloatAsState(
                    targetValue = overlayAlpha,
                    animationSpec = tween(durationMillis = 600)
                )

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black.copy(alpha = 0.3f * animatedAlpha)),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        CircularProgressIndicator(color = Color.White)
                        Spacer(modifier = Modifier.height(16.dp))
                        Text("Preparando realidad aumentada...", color = Color.White)
                    }
                }
            }

            // Lanzamos Unity y controlamos overlay
            LaunchedEffect(Unit) {
                // Espera mínima para mostrar overlay
                delay(1000)

                // Lanzamos Unity
                val intent = Intent(context, com.unity3d.player.UnityPlayerGameActivity::class.java)
                context.startActivity(intent)

                // Mantener overlay unos segundos más simulando carga de Unity
                delay(1500)

                // Fade out del overlay
                overlayAlpha = 0f
                delay(600) // duración de la animación
                overlayVisible = false

                // Fin del LoaderActivity
                finish()
            }
        }
    }
}
*/

/*
import android.Manifest
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.core.CameraSelector
import androidx.camera.core.Preview
import androidx.camera.view.PreviewView
import androidx.compose.ui.viewinterop.AndroidView
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LoaderUnityActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AbrirUnityConCamaraFake()
        }
    }

    @Composable
    fun CameraPreviewFake() {
        val context = LocalContext.current
        val lifecycleOwner = LocalLifecycleOwner.current

        AndroidView(
            factory = { ctx ->
                val previewView = PreviewView(ctx)

                val cameraProviderFuture = ProcessCameraProvider.getInstance(ctx)
                cameraProviderFuture.addListener({
                    val cameraProvider = cameraProviderFuture.get()
                    val preview = Preview.Builder().build().apply {
                        setSurfaceProvider(previewView.surfaceProvider)
                    }
                    val selector = CameraSelector.DEFAULT_BACK_CAMERA

                    cameraProvider.unbindAll()
                    cameraProvider.bindToLifecycle(lifecycleOwner, selector, preview)
                }, ContextCompat.getMainExecutor(ctx))

                previewView
            },
            modifier = Modifier.fillMaxSize()
        )
    }

    @Composable
    fun AbrirUnityConCamaraFake() {
        val context = LocalContext.current
        var mostrarCamaraFake by remember { mutableStateOf(false) }
        var mostrarLoader by remember { mutableStateOf(false) }

        // Launcher para pedir permiso de cámara
        val launcher = rememberLauncherForActivityResult(
            contract = ActivityResultContracts.RequestPermission(),
            onResult = { granted ->
                if (granted) {
                    mostrarLoader = true
                } else {
                    Toast.makeText(context, "Permiso de cámara denegado", Toast.LENGTH_SHORT).show()
                    finish()
                }
            }
        )

        // Pedimos permiso al iniciar el Composable
        LaunchedEffect(Unit) {
            launcher.launch(Manifest.permission.CAMERA)
        }

        Box(modifier = Modifier.fillMaxSize()) {
            when {
                mostrarCamaraFake -> {
                    CameraPreviewFake()
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.Black.copy(alpha = 0.3f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            CircularProgressIndicator(color = Color.White)
                            Spacer(modifier = Modifier.height(16.dp))
                            Text("Preparando realidad aumentada...", color = Color.White)
                        }
                    }

                    LaunchedEffect(Unit) {
                        delay(2000)
                        val intent = Intent(context, com.unity3d.player.UnityPlayerGameActivity::class.java)
                        context.startActivity(intent)
                        finish()
                    }
                }

                mostrarLoader -> {
                    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
                        CircularProgressIndicator()
                    }

                    LaunchedEffect(Unit) {
                        delay(500)
                        mostrarLoader = false
                        mostrarCamaraFake = true
                    }
                }
            }
        }
    }
}
*/