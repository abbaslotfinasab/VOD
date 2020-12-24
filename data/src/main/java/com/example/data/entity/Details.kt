package com.example.data.entity

import com.example.domain.model.CastModel
import com.example.domain.model.SeasonModel
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Details (

    @SerializedName("description")
    @Expose
    var id:Int?=0,

    @SerializedName("description")
    @Expose
    var description:String?=null,

    @SerializedName("poster")
    @Expose
    var poster:String?=null,

    @SerializedName("date")
    @Expose
    var date:String?=null,

    @SerializedName("duration")
    @Expose
    var duration:String?=null,

    @SerializedName("day")
    @Expose
    var day:String?=null,

    @SerializedName("tv")
    @Expose
    var channel:String?=null,

    @SerializedName("cast")
    @Expose
    var cast:List<CastModel>?=null,

    @SerializedName("genre")
    @Expose
    var genre:List<GenreModel>?=null,

    @SerializedName("season")
    @Expose
    var season:List<SeasonModel>?=null

)
