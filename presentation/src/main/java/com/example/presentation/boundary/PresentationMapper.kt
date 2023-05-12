package com.example.presentation.boundary

import com.example.domain.model.DomainMovieDetailsModel
import com.example.presentation.model.PresentationMovieDetails
import javax.inject.Inject

class PresentationMapper @Inject constructor() {

    fun mapPresentationMovieDetails(details: DomainMovieDetailsModel): PresentationMovieDetails {
        return PresentationMovieDetails(
            id = details.id,
            overview = details.overview,
            title = details.title
        )
    }
}