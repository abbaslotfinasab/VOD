package com.example.data.entity

import com.example.domain.model.SubtitleModel
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Video (

        @SerializedName("id")
        @Expose
        var id:Int?=0,

        @SerializedName("id")
        @Expose
        var url:String?=null,

        @SerializedName("id")
        @Expose
        var subtitle:List<SubtitleModel>?

)