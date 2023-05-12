package com.example.presentation.features.movielist.mvvm

import androidx.lifecycle.ViewModel
import com.example.presentation.model.PresentationMovieDetails
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainModel: MainModel,
    @Named("UseCaseScope") private val useCaseScope: CoroutineScope
) : ViewModel() {

    private val _movieListStateFlow = MutableStateFlow<CurrentUIState>(
        CurrentUIState.NotLoaded
    )

    val movieListStateFlow: StateFlow<CurrentUIState> = _movieListStateFlow

    sealed class CurrentUIState {
        data class MoviesList(val details: List<PresentationMovieDetails>) : CurrentUIState()

        object NotLoaded : CurrentUIState()
    }

    fun loadMoviesList() {
        useCaseScope.launch {
            _movieListStateFlow.emit(value = CurrentUIState.MoviesList(details = mainModel.getMoviesList()))
        }
    }


}