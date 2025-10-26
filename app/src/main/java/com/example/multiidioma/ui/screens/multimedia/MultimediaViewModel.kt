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
                val listaShortsIhus = multimediaRepository.getListvideosShortsIhus()
                val listaShortsCretus = multimediaRepository.getListVideosvideosShortsCretus()
                val listShortsIdis = multimediaRepository.getListVideosShortsIdis()
                val listShortsIlg = multimediaRepository.getListVideosShortsIlg()
                val listShortsCimus = multimediaRepository.getListVideoShortsCimus()
                val listShorsIce = multimediaRepository.getListVideosShortIce()
                val listShorsIgfae = multimediaRepository.getListVideosShortsIgfae()

                val items = mutableListOf<MultimediaData>()
                items.addAll(listaPodcasts.map { MultimediaData.PodcastItem(it) })
                items.addAll(listaVideos.map { MultimediaData.Video(it) })
                items.addAll(listaShortsIhus.map { MultimediaData.ShortIhus(it) })
                items.addAll(listaShortsCretus.map { MultimediaData.ShortCretus(it) })
                items.addAll(listShortsIdis.map { MultimediaData.ShortIdis(it) })
                items.addAll(listShortsIlg.map { MultimediaData.ShortIlg(it) })
                items.addAll(listShortsCimus.map { MultimediaData.ShortCimus(it) })
                items.addAll(listShorsIce.map { MultimediaData.ShortIce(it) })
                items.addAll(listShorsIgfae.map{MultimediaData.ShortIgfae(it)})


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