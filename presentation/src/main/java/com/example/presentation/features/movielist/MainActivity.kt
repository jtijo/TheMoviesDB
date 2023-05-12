package com.example.presentation.features.movielist

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import com.example.presentation.features.movielist.compose.MainScreen
import com.example.presentation.features.movielist.mvvm.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContent {
                MaterialTheme {
                   MainScreen.initialize(viewModel = viewModel)
                }
            }
    }

    override fun onResume() {
        super.onResume()
        viewModel.loadMoviesList()
    }
}