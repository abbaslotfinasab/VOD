package com.example.data.entity

import com.example.domain.model.EpisodeModel
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Season (

    @SerializedName("id")
    @Expose
    var id:Int?=0,

    @SerializedName("title")
    @Expose
    var title:String?=null,

    @SerializedName("episode")
    @Expose
    var episode:List<EpisodeModel>?
)