package com.example.data.model

import com.google.gson.annotations.SerializedName

data class MovieDetailsModel(
    @SerializedName("id")
    val id : String,
    @SerializedName("overview")
    val overview : String,
    @SerializedName("original_title")
    val title : String
)
