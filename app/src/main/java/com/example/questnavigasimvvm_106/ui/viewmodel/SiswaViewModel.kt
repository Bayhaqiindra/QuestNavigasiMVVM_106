package com.example.questnavigasimvvm_106.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.questnavigasimvvm_106.model.DataSiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SiswaViewModel : ViewModel() {
    //request
    private val _statusUI = MutableStateFlow(DataSiswa())

    //respons
    val statusUI: StateFlow<DataSiswa> = _statusUI.asStateFlow()
}