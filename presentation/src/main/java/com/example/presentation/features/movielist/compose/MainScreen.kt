package com.example.presentation.features.movielist.compose

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.LocalContext
import com.example.presentation.features.movielist.mvvm.MainViewModel

object MainScreen {

    @Composable
    fun initialize(viewModel: MainViewModel) {
        viewModel.movieListStateFlow.collectAsState().value.let { currentUIState ->
            when (currentUIState) {
                is MainViewModel.CurrentUIState.MoviesList -> {
                    if (currentUIState.details.isEmpty()) {
                        Toast.makeText(LocalContext.current, "Failed", Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(LocalContext.current, "Success", Toast.LENGTH_LONG).show()
                    }
                }
                else -> { Toast.makeText(LocalContext.current, "Not loaded", Toast.LENGTH_LONG).show()}
            }
        }
    }
}