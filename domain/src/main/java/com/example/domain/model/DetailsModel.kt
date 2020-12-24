package com.example.domain.model

data class DetailsModel (

    var id:Int?=0,
    val background:String?=null,
    var description:String?=null,
    var year: Int?=0,
    var time: Int?=0,
    var day:String?=null,
    var channel:String?=null,
    var director:String?=null,
    var county:String?=null,
    var commentModel: List<CommentModel>,
    var season:List<SeasonModel>?,
    var castModel:List<CastModel>?,
    var genreModel: List<GenreModel>?

)
