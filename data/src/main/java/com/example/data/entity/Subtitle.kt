package com.example.data.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Subtitle(

    @SerializedName("id")
    @Expose
    var id:Int?=0,

    @SerializedName("url")
    @Expose
    var url:String?=null,

    @SerializedName("type")
    @Expose
    var type:String?=null,

    @SerializedName("language")
    @Expose
    var language:String?=null

)
