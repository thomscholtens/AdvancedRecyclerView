package com.example.level6_task1.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.level6_task1.model.ColorItemRepository
import com.example.level6_task1.model.ColorItem

class MainActivityViewModel : ViewModel() {
    private val colorRepository =
        ColorItemRepository()

    val colorItems = MutableLiveData<List<ColorItem>>().apply {
        value = colorRepository.getColorItems()
    }
}