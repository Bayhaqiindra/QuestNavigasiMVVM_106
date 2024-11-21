package com.example.questnavigasimvvm_106.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.questnavigasimvvm_106.model.DataSiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SiswaViewModel : ViewModel() {
    //request
    private val _statusUI = MutableStateFlow(DataSiswa())

    //respons
    val statusUI: StateFlow<DataSiswa> = _statusUI.asStateFlow()

    fun saveDataSiswa(ls: MutableList<String>) {
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(
                nama = ls[0],
                nim = ls[1],
                gender = ls[2],
                email = ls[3],
                alamat = ls[4],
                notelepon = ls[5]
            )
        }
    }
}