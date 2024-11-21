package com.example.questnavigasimvvm_106.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TampilDataView(
    uiState: DataSiswa,
    onBackButton: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TampilData(param = "Nama", argu = uiState.nama)
        TampilData(param = "NIM", argu = uiState.nim)
        TampilData(param = "Jenis Kelamin", argu = uiState.gender)
        TampilData(param = "Email", argu = uiState.email)
        TampilData(param = "Alamat", argu = uiState.alamat)
        TampilData(param = "No Telpon", argu = uiState.notelepon)
        Button(onClick = onBackButton){
            Text(text="Kembali")
        }
    }
}

@Composable
fun TampilData(
    param: String, argu:String
) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

        }
    }
}