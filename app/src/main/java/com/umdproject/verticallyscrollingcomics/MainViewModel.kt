package com.umdproject.verticallyscrollingcomics

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.umdproject.verticallyscrollingcomics.ui.fragments.LocalComicPreview

// This viewModel stores the main data for the app
class MainViewModel : ViewModel() {
    private val _uid = MutableLiveData<Int>()
    internal val uid: LiveData<Int>
        get() = _uid


    private val _comicPreviews = MutableLiveData<MutableList<LocalComicPreview>>()
    internal val comicPreviews: LiveData<MutableList<LocalComicPreview>>
        get() = _comicPreviews

    fun setUID(uidIn: Int) {
        _uid.value = uidIn
    }

    fun setComicPreviews(listIn: MutableList<LocalComicPreview>) {
        _comicPreviews.value = listIn
    }

    init {
        _comicPreviews.value = mutableListOf()
        _uid.value = 0
    }
}