package com.example.domain.model

data class MovieModel(

    var id:Int?=0,
    var poster:String?=null,
    var name:String?=null,
    var detailsModel: List<DetailsModel>

)
