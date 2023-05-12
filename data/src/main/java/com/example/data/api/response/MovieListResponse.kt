package com.example.data.api.response

import com.example.data.model.MovieDetailsModel
import com.google.gson.annotations.SerializedName

data class MovieListResponse(
    @SerializedName("results")
    val moviesList : List<MovieDetailsModel>
)
