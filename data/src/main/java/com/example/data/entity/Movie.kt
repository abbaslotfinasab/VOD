package com.example.data.entity

import com.example.domain.model.DetailsModel
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Movie (

    @SerializedName("id")
    @Expose
    var id:Int?=0,

    @SerializedName("poster")
    @Expose
    var poster:String?=null,

    @SerializedName("name")
    @Expose
    var name:String?=null,

    @SerializedName("details")
    @Expose
    var details:List<DetailsModel>?=null

)