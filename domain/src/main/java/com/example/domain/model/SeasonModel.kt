package com.example.domain.model

data class SeasonModel (

    var id:Int?=0,
    var title:String?=null,
    var episodeModel:List<EpisodeModel>

)