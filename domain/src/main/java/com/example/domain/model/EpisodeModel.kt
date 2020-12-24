package com.example.domain.model

data class EpisodeModel(

    var id:Int?=0,
    var title:String?=null,
    var duration:Int?=0,
    var downloadModel:List<DownloadModel>?,
    var videoModel:List<VideoModel>?

)
