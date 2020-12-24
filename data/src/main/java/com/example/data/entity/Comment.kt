package com.example.data.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Comment(

    @SerializedName("id")
    @Expose
    var id :Int?=0,

    @SerializedName("user")
    @Expose
    var user:String?=null,

    @SerializedName("photo")
    @Expose
    var photo:String?=null,

    @SerializedName("content")
    @Expose
    var content:String?=null,

    @SerializedName("date")
    @Expose
    var date: Int?=null,

    @SerializedName("like")
    @Expose
    var like:Int?=0,

    @SerializedName("dislike")
    @Expose
    var dislike:Int?=0
)
