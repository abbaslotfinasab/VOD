package com.example.data.entity

import com.example.domain.model.CastModel
import com.example.domain.model.CommentModel
import com.example.domain.model.SeasonModel
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Details (

    @SerializedName("id")
    @Expose
    var id:Int?=0,

    @SerializedName("background")
    @Expose
    var background:String?=null,

    @SerializedName("description")
    @Expose
    var description:String?=null,

    @SerializedName("rate")
    @Expose
    var rate:Int?=0,

    @SerializedName("view")
    @Expose
    var view:Int?=0,

    @SerializedName("like")
    @Expose
    var like:Int?=0,

    @SerializedName("year")
    @Expose
    var year:Int?=0,

    @SerializedName("duration")
    @Expose
    var time: Int?=0,

    @SerializedName("number")
    @Expose
    var number: Int?=0,

    @SerializedName("genre")
    @Expose
    var genre:String?=null,

    @SerializedName("day")
    @Expose
    var day:String?=null,

    @SerializedName("channel")
    @Expose
    var channel:String?=null,

    @SerializedName("director")
    @Expose
    var director:String?=null,

    @SerializedName("country")
    @Expose
    var country:String?=null,

    @SerializedName("comment")
    @Expose
    var comment:List<CommentModel>?=null,

    @SerializedName("season")
    @Expose
    var season:List<SeasonModel>?=null,

    @SerializedName("cast")
    @Expose
    var cast:List<CastModel>?=null



)
