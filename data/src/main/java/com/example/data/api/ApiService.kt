package com.example.data.api

import com.example.data.api.response.MovieListResponse
import com.example.data.model.MovieDetailsModel
import retrofit2.http.GET

interface ApiService {
    @GET("discover/movie")
    suspend fun getMoviesList() : MovieListResponse
}