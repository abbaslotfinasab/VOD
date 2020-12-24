package com.example.data.entity

import com.example.domain.model.DownloadModel
import com.example.domain.model.VideoModel
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Episode(

    @SerializedName("id")
    @Expose
    var id:Int?=0,

    @SerializedName("title")
    @Expose
    var title:String?=null,

    @SerializedName("duration")
    @Expose
    var duration:Int?=0,

    @SerializedName("downloadModel")
    @Expose
    var downloadModel:List<DownloadModel>?,

    @SerializedName("videoModel")
    @Expose
    var videoModel:List<VideoModel>?
)
