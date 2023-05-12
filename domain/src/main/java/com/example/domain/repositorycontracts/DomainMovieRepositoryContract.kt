package com.example.domain.repositorycontracts

import com.example.domain.model.DomainMovieDetailsModel

interface DomainMovieRepositoryContract {

    suspend fun getMoviesList() : List<DomainMovieDetailsModel>
}