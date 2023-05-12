package com.example.presentation.features.movielist.mvvm

import com.example.domain.usecases.GetMoviesListUseCase
import com.example.presentation.boundary.PresentationMapper
import com.example.presentation.model.PresentationMovieDetails
import javax.inject.Inject


class MainModel @Inject constructor(
    private val getMoviesListUseCase: GetMoviesListUseCase,
    private val mapper: PresentationMapper
) {

    suspend fun getMoviesList(): List<PresentationMovieDetails> {
        return getMoviesListUseCase.execute().map {
            mapper.mapPresentationMovieDetails(it)
        }
    }
}