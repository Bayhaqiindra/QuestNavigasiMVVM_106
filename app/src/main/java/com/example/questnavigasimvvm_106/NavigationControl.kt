package com.example.questnavigasimvvm_106

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.example.questnavigasimvvm_106.ui.viewmodel.SiswaViewModel
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class Halaman {
    FORMULIR,
    TAMPILDATA
}

@Composable
fun NavigationControl(
    modifier: Modifier = Modifier,
    viewModel: SiswaViewModel = viewModel(),
    navHost: NavHostController = rememberNavController()
) {
    Scaffold { isipadding ->
        val uiState by viewModel.statusUI.collectAsState()
        NavHost(
            modifier = modifier
                .padding(isipadding)
                .fillMaxSize(),
            navController = navHost,
            startDestination = Halaman.FORMULIR.name
        ) {

        }
    }
}