package com.example.data.repository

import com.example.data.api.ApiService
import com.example.data.boundary.DataMapper
import com.example.domain.model.DomainMovieDetailsModel
import com.example.domain.repositorycontracts.DomainMovieRepositoryContract
import javax.inject.Inject

class MovieRepository @Inject constructor(
    private val apiService: ApiService,
    private val mapper: DataMapper
) : DomainMovieRepositoryContract {
    override suspend fun getMoviesList(): List<DomainMovieDetailsModel> {
        return apiService.getMoviesList().moviesList.map {
            mapper.mapMovieDetails(it)
        }
    }
}