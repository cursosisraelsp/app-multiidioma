/*package com.example.multiidioma.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import android.util.Log
import com.example.multiidioma.http.VimeoAuthService
import com.example.multiidioma.http.VimeoVideoService
import kotlinx.coroutines.launch

class VimeoViewModel : ViewModel() {

    fun fetchVideo(videoId: String) {
        viewModelScope.launch {
            try {
                // 1️⃣ Obtener token
                val tokenResponse = VimeoAuthService.api.getAccessToken(
                    auth = VimeoAuthService.getAuthHeader(),
                    grantType = "client_credentials",
                    scope = "public video_files"
                )
                val token = tokenResponse.access_token
                Log.d("VIMEO", "Token obtenido: $token")

                // 2️⃣ Obtener video usando token
                val vimeoApi = VimeoVideoService.getApi("Bearer $token")
                val video = vimeoApi.getVideo(videoId, auth = "Bearer $token")

                Log.d("VIMEO", "🎬 Nombre: ${video.name}")
                video.files?.forEach { file ->
                    Log.d("VIMEO", "📂 Calidad: ${file.quality}, Tipo: ${file.type}, Link: ${file.link}")
                }

            } catch (e: Exception) {
                Log.e("VIMEO", "❌ Error: ${e.message}")
            }
        }
    }
}

/*
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.multiidioma.http.VimeoService
import kotlinx.coroutines.launch

class VimeoViewModel : ViewModel() {
    fun fetchVideo(videoId: String) {
        viewModelScope.launch {
            try {
                val response = VimeoService.api.getVideo(videoId)

                Log.d("VIMEO", "🎬 Nombre: ${response.name}")
                Log.d("VIMEO", "⏱ Duración: ${response.duration} segundos")

                response.files?.forEach { file ->
                    Log.d("VIMEO", "📂 Calidad: ${file.quality}, Tipo: ${file.type}, Link: ${file.link}")
                }

            } catch (e: Exception) {
                Log.e("VIMEO", "❌ Error: ${e.message}")
            }
        }
    }
}
*/