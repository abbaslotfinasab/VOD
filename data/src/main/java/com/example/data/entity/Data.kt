package com.example.data.entity

import com.example.domain.model.MovieModel
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Data(

    @SerializedName("id")
    @Expose
    var id: Int?=0,

    @SerializedName("title")
    @Expose
    var category: String?=null,

    @SerializedName("movie")
    @Expose
    var movie: List<MovieModel>?=null
)






