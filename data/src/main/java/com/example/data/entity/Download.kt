package com.example.data.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Download(

    @SerializedName("id")
    @Expose
    var id:Int?=0,

    @SerializedName("title")
    @Expose
    var title:String?=null,

    @SerializedName("path")
    @Expose
    var path:String?=null,

    @SerializedName("type")
    @Expose
    var type:String?=null,

    @SerializedName("size")
    @Expose
    var size:Int?=0







)
