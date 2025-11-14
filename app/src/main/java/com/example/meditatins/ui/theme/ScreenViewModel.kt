package com.example.meditatins.ui.theme

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import androidx.compose.runtime.getValue
import androidx.compose.runtime.collectAsState
import kotlinx.coroutines.flow.asStateFlow

class ScreenViewModel: ViewModel() {
    private val _selectedImage = MutableStateFlow(1)



    val selectedImage: StateFlow<Int> = _selectedImage.asStateFlow()



    fun selectimage(imageNumber: Int){
        _selectedImage.value = imageNumber
    }


}