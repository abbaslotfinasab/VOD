package com.example.data.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Cast (

    @SerializedName("id")
    @Expose
    var id:Int?=0,

    @SerializedName("actor")
    @Expose
    var actor:String?=null,

    @SerializedName("role")
    @Expose
    var role:String?=null,

    @SerializedName("photo")
    @Expose
    var photo:String?=null

)