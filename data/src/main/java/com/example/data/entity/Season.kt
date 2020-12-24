package com.example.data.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Season (

    @SerializedName("id")
    @Expose
    var id:Int?=0,
    @SerializedName("number")
    @Expose
    var number:Int?=0,
    @SerializedName("episode")
    @Expose
    var episode:Int?=0
)