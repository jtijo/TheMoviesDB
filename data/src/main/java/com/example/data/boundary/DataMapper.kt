package com.example.data.boundary

import com.example.data.model.MovieDetailsModel
import com.example.domain.model.DomainMovieDetailsModel
import javax.inject.Inject

class DataMapper @Inject constructor() {

    fun mapMovieDetails(movieDetails: MovieDetailsModel): DomainMovieDetailsModel {
        return DomainMovieDetailsModel(
            id = movieDetails.id,
            overview = movieDetails.overview,
            title = movieDetails.title
        )
    }
}