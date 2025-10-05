package com.example.multiidioma.ui.screens.multimedia

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.multiidioma.data.repository.MultimediaRepository
import com.example.multiidioma.data.types.MultimediaData
import com.example.multiidioma.data.types.states.MultimediaState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MultimediaViewModel : ViewModel() {
    private val _uiState = MutableStateFlow<MultimediaState>(MultimediaState.Loading)
    val uiState: StateFlow<MultimediaState> = _uiState.asStateFlow()

    init {
        loadMultimedia()
    }

    private fun loadMultimedia() {
        viewModelScope.launch {
            val multimediaRepository = MultimediaRepository()
            try {
                val listaPodcasts = multimediaRepository.getListPodcasts()
                val listaVideos = multimediaRepository.getListVideosYoutube()

                val items = mutableListOf<MultimediaData>()
                items.addAll(listaPodcasts.map { MultimediaData.PodcastItem(it) })
                items.addAll(listaVideos.map { MultimediaData.Video(it) })

                _uiState.value = MultimediaState.Success(items)
            } catch (e: Exception) {
                _uiState.value = MultimediaState.Error(e.message ?: "Error desconocido")
            }
        }
    }
}


/*
class MultimediaViewModel : ViewModel() {
    private val _uiState = MutableStateFlow<MultimediaState>(MultimediaState.Loading)
    val uiState: StateFlow<MultimediaState> = _uiState.asStateFlow()

    init {
        loadListPodcasts()
        loadListVideos()
    }

    private fun loadListPodcasts(){
        viewModelScope.launch {
            val multimediaRepository = MultimediaRepository()
            try {
                val listaPodcasts = multimediaRepository.getListPodcasts()
                val podcast = listaPodcasts.map { MultimediaData.PodcastItem(it) }
                _uiState.value = MultimediaState.Success(podcast)
            } catch (e: Exception) {
                _uiState.value = MultimediaState.Error(e.message ?: "Error desconocido")
            }
        }
    }

    private fun loadListVideos(){
        viewModelScope.launch {
            val multimediaRepository = MultimediaRepository()
            try {
                val listaPodcasts = multimediaRepository.getListVideosYoutube()
                val video = listaPodcasts.map { MultimediaData.Video(it) }
                _uiState.value = MultimediaState.Success(video)
            } catch (e: Exception) {
                _uiState.value = MultimediaState.Error(e.message ?: "Error desconocido")
            }
        }
    }
}*/